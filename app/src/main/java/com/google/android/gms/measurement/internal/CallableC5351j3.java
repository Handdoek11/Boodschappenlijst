package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC5351j3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f31011o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f31012s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f31013t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ X2 f31014u;

    CallableC5351j3(X2 x22, String str, String str2, String str3) {
        this.f31011o = str;
        this.f31012s = str2;
        this.f31013t = str3;
        this.f31014u = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f31014u.f30758o.x0();
        return this.f31014u.f30758o.j0().B0(this.f31011o, this.f31012s, this.f31013t);
    }
}
