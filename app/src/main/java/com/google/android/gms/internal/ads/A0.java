package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class A0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    private final C0 f13467a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13468b;

    public A0(C0 c02, long j8) {
        this.f13467a = c02;
        this.f13468b = j8;
    }

    private final S0 f(long j8, long j9) {
        return new S0((j8 * 1000000) / this.f13467a.f14055e, this.f13468b + j9);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        AbstractC3796qC.b(this.f13467a.f14061k);
        C0 c02 = this.f13467a;
        B0 b02 = c02.f14061k;
        long[] jArr = b02.f13711a;
        long[] jArr2 = b02.f13712b;
        int v7 = AbstractC2301cW.v(jArr, c02.b(j8), true, false);
        S0 f8 = f(v7 == -1 ? 0L : jArr[v7], v7 != -1 ? jArr2[v7] : 0L);
        if (f8.f18729a == j8 || v7 == jArr.length - 1) {
            return new P0(f8, f8);
        }
        int i8 = v7 + 1;
        return new P0(f8, f(jArr[i8], jArr2[i8]));
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f13467a.a();
    }
}
