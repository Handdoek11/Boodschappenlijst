package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class J6 extends Thread {

    /* renamed from: x, reason: collision with root package name */
    private static final boolean f16110x = AbstractC2155b7.f20816b;

    /* renamed from: o, reason: collision with root package name */
    private final BlockingQueue f16111o;

    /* renamed from: s, reason: collision with root package name */
    private final BlockingQueue f16112s;

    /* renamed from: t, reason: collision with root package name */
    private final H6 f16113t;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f16114u = false;

    /* renamed from: v, reason: collision with root package name */
    private final C2263c7 f16115v;

    /* renamed from: w, reason: collision with root package name */
    private final N6 f16116w;

    public J6(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, H6 h62, N6 n62) {
        this.f16111o = blockingQueue;
        this.f16112s = blockingQueue2;
        this.f16113t = h62;
        this.f16116w = n62;
        this.f16115v = new C2263c7(this, blockingQueue2, n62);
    }

    private void c() {
        U6 u62 = (U6) this.f16111o.take();
        u62.r("cache-queue-take");
        u62.y(1);
        try {
            u62.B();
            G6 n8 = this.f16113t.n(u62.m());
            if (n8 == null) {
                u62.r("cache-miss");
                if (!this.f16115v.c(u62)) {
                    this.f16112s.put(u62);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (n8.a(currentTimeMillis)) {
                    u62.r("cache-hit-expired");
                    u62.g(n8);
                    if (!this.f16115v.c(u62)) {
                        this.f16112s.put(u62);
                    }
                } else {
                    u62.r("cache-hit");
                    Y6 k8 = u62.k(new R6(n8.f15267a, n8.f15273g));
                    u62.r("cache-hit-parsed");
                    if (!k8.c()) {
                        u62.r("cache-parsing-failed");
                        this.f16113t.a(u62.m(), true);
                        u62.g(null);
                        if (!this.f16115v.c(u62)) {
                            this.f16112s.put(u62);
                        }
                    } else if (n8.f15272f < currentTimeMillis) {
                        u62.r("cache-hit-refresh-needed");
                        u62.g(n8);
                        k8.f20213d = true;
                        if (this.f16115v.c(u62)) {
                            this.f16116w.b(u62, k8, null);
                        } else {
                            this.f16116w.b(u62, k8, new I6(this, u62));
                        }
                    } else {
                        this.f16116w.b(u62, k8, null);
                    }
                }
            }
            u62.y(2);
        } catch (Throwable th) {
            u62.y(2);
            throw th;
        }
    }

    public final void b() {
        this.f16114u = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f16110x) {
            AbstractC2155b7.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f16113t.zzb();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f16114u) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC2155b7.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
