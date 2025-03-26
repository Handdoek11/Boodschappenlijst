package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC5372m3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f31084o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f31085s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f31086t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ X2 f31087u;

    CallableC5372m3(X2 x22, String str, String str2, String str3) {
        this.f31084o = str;
        this.f31085s = str2;
        this.f31086t = str3;
        this.f31087u = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f31087u.f30758o.x0();
        return this.f31087u.f30758o.j0().P(this.f31084o, this.f31085s, this.f31086t);
    }
}
