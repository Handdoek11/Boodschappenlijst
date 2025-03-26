package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC5358k3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f31046o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f31047s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f31048t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ X2 f31049u;

    CallableC5358k3(X2 x22, String str, String str2, String str3) {
        this.f31046o = str;
        this.f31047s = str2;
        this.f31048t = str3;
        this.f31049u = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f31049u.f30758o.x0();
        return this.f31049u.f30758o.j0().B0(this.f31046o, this.f31047s, this.f31048t);
    }
}
