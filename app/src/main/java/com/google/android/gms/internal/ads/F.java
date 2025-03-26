package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f15029a;

    /* renamed from: b, reason: collision with root package name */
    private final G f15030b;

    public F(Handler handler, G g8) {
        this.f15029a = g8 == null ? null : handler;
        this.f15030b = g8;
    }

    public final void a(final String str, final long j8, final long j9) {
        Handler handler = this.f15029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26981o.g(str, j8, j9);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.f15029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.E
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14614o.h(str);
                }
            });
        }
    }

    public final void c(final Hy0 hy0) {
        hy0.a();
        Handler handler = this.f15029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.C
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14049o.i(hy0);
                }
            });
        }
    }

    public final void d(final int i8, final long j8) {
        Handler handler = this.f15029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27415o.j(i8, j8);
                }
            });
        }
    }

    public final void e(final Hy0 hy0) {
        Handler handler = this.f15029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13465o.k(hy0);
                }
            });
        }
    }

    public final void f(final D d8, final Iy0 iy0) {
        Handler handler = this.f15029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13708o.l(d8, iy0);
                }
            });
        }
    }

    final /* synthetic */ void g(String str, long j8, long j9) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15030b.I0(str, j8, j9);
    }

    final /* synthetic */ void h(String str) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15030b.G0(str);
    }

    final /* synthetic */ void i(Hy0 hy0) {
        hy0.a();
        int i8 = AbstractC2301cW.f21206a;
        this.f15030b.H0(hy0);
    }

    final /* synthetic */ void j(int i8, long j8) {
        int i9 = AbstractC2301cW.f21206a;
        this.f15030b.N0(i8, j8);
    }

    final /* synthetic */ void k(Hy0 hy0) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15030b.K0(hy0);
    }

    final /* synthetic */ void l(D d8, Iy0 iy0) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15030b.M0(d8, iy0);
    }

    final /* synthetic */ void m(Object obj, long j8) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15030b.J0(obj, j8);
    }

    final /* synthetic */ void n(long j8, int i8) {
        int i9 = AbstractC2301cW.f21206a;
        this.f15030b.O0(j8, i8);
    }

    final /* synthetic */ void o(Exception exc) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15030b.L0(exc);
    }

    final /* synthetic */ void p(C4408vs c4408vs) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15030b.P0(c4408vs);
    }

    public final void q(final Object obj) {
        Handler handler = this.f15029a;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27703o.m(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j8, final int i8) {
        Handler handler = this.f15029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27955o.n(j8, i8);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.f15029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28254o.o(exc);
                }
            });
        }
    }

    public final void t(final C4408vs c4408vs) {
        Handler handler = this.f15029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27160o.p(c4408vs);
                }
            });
        }
    }
}
