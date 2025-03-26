package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5374m5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ H5 f31090o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Runnable f31091s;

    RunnableC5374m5(C5367l5 c5367l5, H5 h52, Runnable runnable) {
        this.f31090o = h52;
        this.f31091s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31090o.x0();
        this.f31090o.y(this.f31091s);
        this.f31090o.C0();
    }
}
