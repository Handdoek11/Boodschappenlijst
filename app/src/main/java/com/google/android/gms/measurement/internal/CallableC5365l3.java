package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC5365l3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f31065o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f31066s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f31067t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ X2 f31068u;

    CallableC5365l3(X2 x22, String str, String str2, String str3) {
        this.f31065o = str;
        this.f31066s = str2;
        this.f31067t = str3;
        this.f31068u = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f31068u.f30758o.x0();
        return this.f31068u.f30758o.j0().P(this.f31065o, this.f31066s, this.f31067t);
    }
}
