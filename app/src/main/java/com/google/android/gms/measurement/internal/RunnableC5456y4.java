package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5456y4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C5449x4 f31271o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C5449x4 f31272s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ long f31273t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ boolean f31274u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ C5442w4 f31275v;

    RunnableC5456y4(C5442w4 c5442w4, C5449x4 c5449x4, C5449x4 c5449x42, long j8, boolean z7) {
        this.f31271o = c5449x4;
        this.f31272s = c5449x42;
        this.f31273t = j8;
        this.f31274u = z7;
        this.f31275v = c5442w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31275v.L(this.f31271o, this.f31272s, this.f31273t, this.f31274u, null);
    }
}
