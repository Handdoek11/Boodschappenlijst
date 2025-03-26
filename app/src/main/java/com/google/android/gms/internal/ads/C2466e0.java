package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2466e0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21706a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f21707b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f21708c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f21709d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f21710e;

    /* renamed from: f, reason: collision with root package name */
    private final long f21711f;

    public C2466e0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f21707b = iArr;
        this.f21708c = jArr;
        this.f21709d = jArr2;
        this.f21710e = jArr3;
        int length = iArr.length;
        this.f21706a = length;
        if (length <= 0) {
            this.f21711f = 0L;
        } else {
            int i8 = length - 1;
            this.f21711f = jArr2[i8] + jArr3[i8];
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        long[] jArr = this.f21710e;
        int v7 = AbstractC2301cW.v(jArr, j8, true, true);
        S0 s02 = new S0(jArr[v7], this.f21708c[v7]);
        if (s02.f18729a >= j8 || v7 == this.f21706a - 1) {
            return new P0(s02, s02);
        }
        int i8 = v7 + 1;
        return new P0(s02, new S0(this.f21710e[i8], this.f21708c[i8]));
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return true;
    }

    public final String toString() {
        long[] jArr = this.f21709d;
        long[] jArr2 = this.f21710e;
        long[] jArr3 = this.f21708c;
        return "ChunkIndex(length=" + this.f21706a + ", sizes=" + Arrays.toString(this.f21707b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f21711f;
    }
}
