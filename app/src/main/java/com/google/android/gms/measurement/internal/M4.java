package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes2.dex */
final class M4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.a f30589o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f30590s;

    M4(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f30589o = aVar;
        this.f30590s = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30590s.f30276o.F().m0(this.f30589o);
    }
}
