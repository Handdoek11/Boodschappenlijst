package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC5406r3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ E f31171o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f31172s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ X2 f31173t;

    CallableC5406r3(X2 x22, E e8, String str) {
        this.f31171o = e8;
        this.f31172s = str;
        this.f31173t = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f31173t.f30758o.x0();
        return this.f31173t.f30758o.s0().w(this.f31171o, this.f31172s);
    }
}
