package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
public final class ID0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f15911a;

    /* renamed from: b, reason: collision with root package name */
    private final JD0 f15912b;

    public ID0(Handler handler, JD0 jd0) {
        this.f15911a = jd0 == null ? null : handler;
        this.f15912b = jd0;
    }

    public final void a(final Exception exc) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.BD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13756o.j(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.CD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14118o.k(exc);
                }
            });
        }
    }

    public final void c(final KD0 kd0) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28510o.l(kd0);
                }
            });
        }
    }

    public final void d(final KD0 kd0) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.AD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13530o.m(kd0);
                }
            });
        }
    }

    public final void e(final String str, final long j8, final long j9) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.GD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15326o.n(str, j8, j9);
                }
            });
        }
    }

    public final void f(final String str) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.HD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15663o.o(str);
                }
            });
        }
    }

    public final void g(final Hy0 hy0) {
        hy0.a();
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27470o.p(hy0);
                }
            });
        }
    }

    public final void h(final Hy0 hy0) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27212o.q(hy0);
                }
            });
        }
    }

    public final void i(final D d8, final Iy0 iy0) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ED0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14691o.r(d8, iy0);
                }
            });
        }
    }

    final /* synthetic */ void j(Exception exc) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.a(exc);
    }

    final /* synthetic */ void k(Exception exc) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.h(exc);
    }

    final /* synthetic */ void l(KD0 kd0) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.d(kd0);
    }

    final /* synthetic */ void m(KD0 kd0) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.b(kd0);
    }

    final /* synthetic */ void n(String str, long j8, long j9) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.f(str, j8, j9);
    }

    final /* synthetic */ void o(String str) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.C(str);
    }

    final /* synthetic */ void p(Hy0 hy0) {
        hy0.a();
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.j(hy0);
    }

    final /* synthetic */ void q(Hy0 hy0) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.i(hy0);
    }

    final /* synthetic */ void r(D d8, Iy0 iy0) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.g(d8, iy0);
    }

    final /* synthetic */ void s(long j8) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.c(j8);
    }

    final /* synthetic */ void t(boolean z7) {
        int i8 = AbstractC2301cW.f21206a;
        this.f15912b.N(z7);
    }

    final /* synthetic */ void u(int i8, long j8, long j9) {
        int i9 = AbstractC2301cW.f21206a;
        this.f15912b.e(i8, j8, j9);
    }

    public final void v(final long j8) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27771o.s(j8);
                }
            });
        }
    }

    public final void w(final boolean z7) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.FD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15101o.t(z7);
                }
            });
        }
    }

    public final void x(final int i8, final long j8, final long j9) {
        Handler handler = this.f15911a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.yD0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28050o.u(i8, j8, j9);
                }
            });
        }
    }
}
