package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5402q5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ long f31164o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C5395p5 f31165s;

    RunnableC5402q5(C5395p5 c5395p5, long j8) {
        this.f31164o = j8;
        this.f31165s = c5395p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5395p5.A(this.f31165s, this.f31164o);
    }
}
