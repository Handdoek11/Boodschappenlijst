package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
final class Y2 implements InterfaceC2147b3 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f20189a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f20190b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20191c;

    private Y2(long[] jArr, long[] jArr2, long j8) {
        this.f20189a = jArr;
        this.f20190b = jArr2;
        this.f20191c = j8 == -9223372036854775807L ? AbstractC2301cW.K(jArr2[jArr2.length - 1]) : j8;
    }

    public static Y2 f(long j8, C4102t2 c4102t2, long j9) {
        int length = c4102t2.f26791v.length;
        int i8 = length + 1;
        long[] jArr = new long[i8];
        long[] jArr2 = new long[i8];
        jArr[0] = j8;
        long j10 = 0;
        jArr2[0] = 0;
        for (int i9 = 1; i9 <= length; i9++) {
            int i10 = i9 - 1;
            j8 += c4102t2.f26789t + c4102t2.f26791v[i10];
            j10 += c4102t2.f26790u + c4102t2.f26792w[i10];
            jArr[i9] = j8;
            jArr2[i9] = j10;
        }
        return new Y2(jArr, jArr2, j9);
    }

    private static Pair g(long j8, long[] jArr, long[] jArr2) {
        int v7 = AbstractC2301cW.v(jArr, j8, true, true);
        long j9 = jArr[v7];
        long j10 = jArr2[v7];
        int i8 = v7 + 1;
        if (i8 == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j8), Long.valueOf(((long) ((jArr[i8] == j9 ? 0.0d : (j8 - j9) / (r6 - j9)) * (jArr2[i8] - j10))) + j10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final int a() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final long b(long j8) {
        return AbstractC2301cW.K(((Long) g(j8, this.f20189a, this.f20190b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        Pair g8 = g(AbstractC2301cW.N(Math.max(0L, Math.min(j8, this.f20191c))), this.f20190b, this.f20189a);
        S0 s02 = new S0(AbstractC2301cW.K(((Long) g8.first).longValue()), ((Long) g8.second).longValue());
        return new P0(s02, s02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final long d() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f20191c;
    }
}
