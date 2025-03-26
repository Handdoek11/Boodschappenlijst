package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5381n5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.T0 f31115o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f31116s;

    RunnableC5381n5(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.T0 t02) {
        this.f31115o = t02;
        this.f31116s = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31116s.f30276o.J().S(this.f31115o, this.f31116s.f30276o.m());
    }
}
