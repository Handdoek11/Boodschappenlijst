package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5427u3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Y5 f31208o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ M5 f31209s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ X2 f31210t;

    RunnableC5427u3(X2 x22, Y5 y52, M5 m52) {
        this.f31208o = y52;
        this.f31209s = m52;
        this.f31210t = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31210t.f30758o.x0();
        if (this.f31208o.A0() == null) {
            this.f31210t.f30758o.F(this.f31208o.f30790s, this.f31209s);
        } else {
            this.f31210t.f30758o.x(this.f31208o, this.f31209s);
        }
    }
}
