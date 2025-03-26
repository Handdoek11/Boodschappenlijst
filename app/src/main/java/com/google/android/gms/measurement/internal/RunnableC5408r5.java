package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5408r5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ long f31174o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C5395p5 f31175s;

    RunnableC5408r5(C5395p5 c5395p5, long j8) {
        this.f31174o = j8;
        this.f31175s = c5395p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5395p5.G(this.f31175s, this.f31174o);
    }
}
