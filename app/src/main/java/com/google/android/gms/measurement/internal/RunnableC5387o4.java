package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5387o4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.T0 f31129o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f31130s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f31131t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f31132u;

    RunnableC5387o4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.T0 t02, String str, String str2) {
        this.f31129o = t02;
        this.f31130s = str;
        this.f31131t = str2;
        this.f31132u = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31132u.f30276o.H().D(this.f31129o, this.f31130s, this.f31131t);
    }
}
