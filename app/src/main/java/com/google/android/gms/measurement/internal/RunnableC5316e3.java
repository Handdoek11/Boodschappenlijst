package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5316e3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30930o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ X2 f30931s;

    RunnableC5316e3(X2 x22, M5 m52) {
        this.f30930o = m52;
        this.f30931s = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30931s.f30758o.x0();
        H5 h52 = this.f30931s.f30758o;
        M5 m52 = this.f30930o;
        h52.j().l();
        h52.y0();
        Z2.r.f(m52.f30614o);
        h52.f(m52);
    }
}
