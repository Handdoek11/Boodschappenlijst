package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5422t5 {

    /* renamed from: a, reason: collision with root package name */
    private RunnableC5415s5 f31200a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5395p5 f31201b;

    C5422t5(C5395p5 c5395p5) {
        this.f31201b = c5395p5;
    }

    final void a() {
        this.f31201b.l();
        if (this.f31200a != null) {
            this.f31201b.f31152c.removeCallbacks(this.f31200a);
        }
        this.f31201b.f().f31302u.a(false);
        this.f31201b.B(false);
        if (this.f31201b.a().r(G.f30395M0) && this.f31201b.p().H0()) {
            this.f31201b.h().I().a("Retrying trigger URI registration in foreground");
            this.f31201b.p().F0();
        }
    }

    final void b(long j8) {
        this.f31200a = new RunnableC5415s5(this, this.f31201b.zzb().a(), j8);
        this.f31201b.f31152c.postDelayed(this.f31200a, 2000L);
    }
}
