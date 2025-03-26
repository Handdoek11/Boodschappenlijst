package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC5448x3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f31258o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ X2 f31259s;

    CallableC5448x3(X2 x22, String str) {
        this.f31258o = str;
        this.f31259s = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f31259s.f30758o.x0();
        return this.f31259s.f30758o.j0().W0(this.f31258o);
    }
}
