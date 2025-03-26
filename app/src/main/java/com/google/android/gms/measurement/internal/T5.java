package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class T5 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30722o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ H5 f30723s;

    T5(H5 h52, M5 m52) {
        this.f30722o = m52;
        this.f30723s = h52;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (!this.f30723s.S((String) Z2.r.l(this.f30722o.f30614o)).z() || !A3.q(this.f30722o.f30603M).z()) {
            this.f30723s.h().I().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        C5301c2 f8 = this.f30723s.f(this.f30722o);
        if (f8 != null) {
            return f8.m();
        }
        this.f30723s.h().J().a("App info was null when attempting to get app instance id");
        return null;
    }
}
