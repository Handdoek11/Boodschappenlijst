package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class D4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C5449x4 f30326o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ long f30327s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ C5442w4 f30328t;

    D4(C5442w4 c5442w4, C5449x4 c5449x4, long j8) {
        this.f30326o = c5449x4;
        this.f30327s = j8;
        this.f30328t = c5442w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30328t.M(this.f30326o, false, this.f30327s);
        C5442w4 c5442w4 = this.f30328t;
        c5442w4.f31242e = null;
        c5442w4.r().H(null);
    }
}
