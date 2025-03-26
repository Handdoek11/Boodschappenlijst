package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class S3 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private final C0 f18788a;

    /* renamed from: b, reason: collision with root package name */
    private final B0 f18789b;

    /* renamed from: c, reason: collision with root package name */
    private long f18790c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f18791d = -1;

    public S3(C0 c02, B0 b02) {
        this.f18788a = c02;
        this.f18789b = b02;
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final long a(InterfaceC3989s0 interfaceC3989s0) {
        long j8 = this.f18791d;
        if (j8 < 0) {
            return -1L;
        }
        this.f18791d = -1L;
        return -(j8 + 2);
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final R0 b() {
        AbstractC3796qC.f(this.f18790c != -1);
        return new A0(this.f18788a, this.f18790c);
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final void c(long j8) {
        long[] jArr = this.f18789b.f13711a;
        this.f18791d = jArr[AbstractC2301cW.v(jArr, j8, true, true)];
    }

    public final void d(long j8) {
        this.f18790c = j8;
    }
}
