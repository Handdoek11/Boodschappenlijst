package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class Q6 extends Thread {

    /* renamed from: o, reason: collision with root package name */
    private final BlockingQueue f18371o;

    /* renamed from: s, reason: collision with root package name */
    private final P6 f18372s;

    /* renamed from: t, reason: collision with root package name */
    private final H6 f18373t;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f18374u = false;

    /* renamed from: v, reason: collision with root package name */
    private final N6 f18375v;

    public Q6(BlockingQueue blockingQueue, P6 p62, H6 h62, N6 n62) {
        this.f18371o = blockingQueue;
        this.f18372s = p62;
        this.f18373t = h62;
        this.f18375v = n62;
    }

    private void b() {
        U6 u62 = (U6) this.f18371o.take();
        SystemClock.elapsedRealtime();
        u62.y(3);
        try {
            try {
                u62.r("network-queue-take");
                u62.B();
                TrafficStats.setThreadStatsTag(u62.c());
                R6 a8 = this.f18372s.a(u62);
                u62.r("network-http-complete");
                if (a8.f18608e && u62.A()) {
                    u62.u("not-modified");
                    u62.w();
                } else {
                    Y6 k8 = u62.k(a8);
                    u62.r("network-parse-complete");
                    if (k8.f20211b != null) {
                        this.f18373t.b(u62.m(), k8.f20211b);
                        u62.r("network-cache-written");
                    }
                    u62.v();
                    this.f18375v.b(u62, k8, null);
                    u62.x(k8);
                }
            } catch (zzapv e8) {
                SystemClock.elapsedRealtime();
                this.f18375v.a(u62, e8);
                u62.w();
            } catch (Exception e9) {
                AbstractC2155b7.c(e9, "Unhandled exception %s", e9.toString());
                zzapv zzapvVar = new zzapv(e9);
                SystemClock.elapsedRealtime();
                this.f18375v.a(u62, zzapvVar);
                u62.w();
            }
            u62.y(4);
        } catch (Throwable th) {
            u62.y(4);
            throw th;
        }
    }

    public final void a() {
        this.f18374u = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f18374u) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC2155b7.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
