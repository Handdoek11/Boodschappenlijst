package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class V6 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f19537a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f19538b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue f19539c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue f19540d;

    /* renamed from: e, reason: collision with root package name */
    private final H6 f19541e;

    /* renamed from: f, reason: collision with root package name */
    private final P6 f19542f;

    /* renamed from: g, reason: collision with root package name */
    private final Q6[] f19543g;

    /* renamed from: h, reason: collision with root package name */
    private J6 f19544h;

    /* renamed from: i, reason: collision with root package name */
    private final List f19545i;

    /* renamed from: j, reason: collision with root package name */
    private final List f19546j;

    /* renamed from: k, reason: collision with root package name */
    private final N6 f19547k;

    public V6(H6 h62, P6 p62, int i8) {
        N6 n62 = new N6(new Handler(Looper.getMainLooper()));
        this.f19537a = new AtomicInteger();
        this.f19538b = new HashSet();
        this.f19539c = new PriorityBlockingQueue();
        this.f19540d = new PriorityBlockingQueue();
        this.f19545i = new ArrayList();
        this.f19546j = new ArrayList();
        this.f19541e = h62;
        this.f19542f = p62;
        this.f19543g = new Q6[4];
        this.f19547k = n62;
    }

    public final U6 a(U6 u62) {
        u62.h(this);
        synchronized (this.f19538b) {
            this.f19538b.add(u62);
        }
        u62.i(this.f19537a.incrementAndGet());
        u62.r("add-to-queue");
        c(u62, 0);
        this.f19539c.add(u62);
        return u62;
    }

    final void b(U6 u62) {
        synchronized (this.f19538b) {
            this.f19538b.remove(u62);
        }
        synchronized (this.f19545i) {
            Iterator it = this.f19545i.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.E.a(it.next());
                throw null;
            }
        }
        c(u62, 5);
    }

    final void c(U6 u62, int i8) {
        synchronized (this.f19546j) {
            try {
                Iterator it = this.f19546j.iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.E.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        J6 j62 = this.f19544h;
        if (j62 != null) {
            j62.b();
        }
        Q6[] q6Arr = this.f19543g;
        for (int i8 = 0; i8 < 4; i8++) {
            Q6 q62 = q6Arr[i8];
            if (q62 != null) {
                q62.a();
            }
        }
        J6 j63 = new J6(this.f19539c, this.f19540d, this.f19541e, this.f19547k);
        this.f19544h = j63;
        j63.start();
        for (int i9 = 0; i9 < 4; i9++) {
            Q6 q63 = new Q6(this.f19540d, this.f19542f, this.f19541e, this.f19547k);
            this.f19543g[i9] = q63;
            q63.start();
        }
    }
}
