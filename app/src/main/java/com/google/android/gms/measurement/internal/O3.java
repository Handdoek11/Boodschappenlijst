package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class O3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.T0 f30631o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ E f30632s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f30633t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f30634u;

    O3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.T0 t02, E e8, String str) {
        this.f30631o = t02;
        this.f30632s = e8;
        this.f30633t = str;
        this.f30634u = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30634u.f30276o.H().C(this.f30631o, this.f30632s, this.f30633t);
    }
}
