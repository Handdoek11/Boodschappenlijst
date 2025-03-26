package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
final class P3 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R3 f18111a;

    /* synthetic */ P3(R3 r32, Q3 q32) {
        this.f18111a = r32;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        R3 r32 = this.f18111a;
        long f8 = r32.f18594d.f(j8);
        long j9 = r32.f18592b;
        BigInteger valueOf = BigInteger.valueOf(f8);
        R3 r33 = this.f18111a;
        long longValue = j9 + valueOf.multiply(BigInteger.valueOf(r33.f18593c - r33.f18592b)).divide(BigInteger.valueOf(this.f18111a.f18596f)).longValue();
        S0 s02 = new S0(j8, Math.max(this.f18111a.f18592b, Math.min(longValue - 30000, r0.f18593c - 1)));
        return new P0(s02, s02);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        R3 r32 = this.f18111a;
        return r32.f18594d.e(r32.f18596f);
    }
}
