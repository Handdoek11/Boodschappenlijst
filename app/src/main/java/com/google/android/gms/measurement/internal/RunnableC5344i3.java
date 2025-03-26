package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5344i3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C5312e f30990o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ M5 f30991s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ X2 f30992t;

    RunnableC5344i3(X2 x22, C5312e c5312e, M5 m52) {
        this.f30990o = c5312e;
        this.f30991s = m52;
        this.f30992t = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30992t.f30758o.x0();
        if (this.f30990o.f30923t.A0() == null) {
            this.f30992t.f30758o.s(this.f30990o, this.f30991s);
        } else {
            this.f30992t.f30758o.V(this.f30990o, this.f30991s);
        }
    }
}
