package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class U2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.T0 f30724o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f30725s;

    U2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.T0 t02) {
        this.f30724o = t02;
        this.f30725s = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30725s.f30276o.H().B(this.f30724o);
    }
}
