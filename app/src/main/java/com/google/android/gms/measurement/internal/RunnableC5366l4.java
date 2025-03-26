package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4894d6;

/* renamed from: com.google.android.gms.measurement.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5366l4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ A3 f31069o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ long f31070s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ long f31071t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ boolean f31072u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ A3 f31073v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ F3 f31074w;

    RunnableC5366l4(F3 f32, A3 a32, long j8, long j9, boolean z7, A3 a33) {
        this.f31069o = a32;
        this.f31070s = j8;
        this.f31071t = j9;
        this.f31072u = z7;
        this.f31073v = a33;
        this.f31074w = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31074w.P(this.f31069o);
        if (!C4894d6.a() || !this.f31074w.a().r(G.f30419Y0)) {
            this.f31074w.H(this.f31070s, false);
        }
        F3.T(this.f31074w, this.f31069o, this.f31071t, true, this.f31072u);
        F3.U(this.f31074w, this.f31069o, this.f31073v);
    }
}
