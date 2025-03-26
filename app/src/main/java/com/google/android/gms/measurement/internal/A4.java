package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class A4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ long f30274o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C5442w4 f30275s;

    A4(C5442w4 c5442w4, long j8) {
        this.f30274o = j8;
        this.f30275s = c5442w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30275s.m().t(this.f30274o);
        this.f30275s.f31242e = null;
    }
}
