package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import w3.C6886b;

/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC5400q3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f31157o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ X2 f31158s;

    CallableC5400q3(X2 x22, M5 m52) {
        this.f31157o = m52;
        this.f31158s = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f31158s.f30758o.x0();
        return new C6886b(this.f31158s.f30758o.c(this.f31157o.f30614o));
    }
}
