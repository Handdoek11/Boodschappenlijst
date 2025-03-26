package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5463z4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Bundle f31309o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C5449x4 f31310s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ C5449x4 f31311t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ long f31312u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ C5442w4 f31313v;

    RunnableC5463z4(C5442w4 c5442w4, Bundle bundle, C5449x4 c5449x4, C5449x4 c5449x42, long j8) {
        this.f31309o = bundle;
        this.f31310s = c5449x4;
        this.f31311t = c5449x42;
        this.f31312u = j8;
        this.f31313v = c5442w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5442w4.H(this.f31313v, this.f31309o, this.f31310s, this.f31311t, this.f31312u);
    }
}
