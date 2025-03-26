package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5415s5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    long f31185o;

    /* renamed from: s, reason: collision with root package name */
    long f31186s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C5422t5 f31187t;

    RunnableC5415s5(C5422t5 c5422t5, long j8, long j9) {
        this.f31187t = c5422t5;
        this.f31185o = j8;
        this.f31186s = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31187t.f31201b.j().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.v5
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC5415s5 runnableC5415s5 = this.f31233o;
                C5422t5 c5422t5 = runnableC5415s5.f31187t;
                long j8 = runnableC5415s5.f31185o;
                long j9 = runnableC5415s5.f31186s;
                c5422t5.f31201b.l();
                c5422t5.f31201b.h().D().a("Application going to the background");
                c5422t5.f31201b.f().f31302u.a(true);
                c5422t5.f31201b.B(true);
                if (!c5422t5.f31201b.a().T()) {
                    if (c5422t5.f31201b.a().r(G.f30403Q0)) {
                        c5422t5.f31201b.C(false, false, j9);
                        c5422t5.f31201b.f31155f.e(j9);
                    } else {
                        c5422t5.f31201b.f31155f.e(j9);
                        c5422t5.f31201b.C(false, false, j9);
                    }
                }
                c5422t5.f31201b.h().H().b("Application backgrounded at: timestamp_millis", Long.valueOf(j8));
                if (c5422t5.f31201b.a().r(G.f30436e1)) {
                    c5422t5.f31201b.p().z0();
                }
            }
        });
    }
}
