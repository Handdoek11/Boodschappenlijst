package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5394p4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ A3 f31147o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ long f31148s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ boolean f31149t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ A3 f31150u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ F3 f31151v;

    RunnableC5394p4(F3 f32, A3 a32, long j8, boolean z7, A3 a33) {
        this.f31147o = a32;
        this.f31148s = j8;
        this.f31149t = z7;
        this.f31150u = a33;
        this.f31151v = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31151v.P(this.f31147o);
        F3.T(this.f31151v, this.f31147o, this.f31148s, false, this.f31149t);
        F3.U(this.f31151v, this.f31147o, this.f31150u);
    }
}
