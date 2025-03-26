package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2255c3 implements InterfaceC2147b3 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f21048a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f21049b;

    /* renamed from: c, reason: collision with root package name */
    private final long f21050c;

    /* renamed from: d, reason: collision with root package name */
    private final long f21051d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21052e;

    private C2255c3(long[] jArr, long[] jArr2, long j8, long j9, int i8) {
        this.f21048a = jArr;
        this.f21049b = jArr2;
        this.f21050c = j8;
        this.f21051d = j9;
        this.f21052e = i8;
    }

    public static C2255c3 f(long j8, long j9, K0 k02, UQ uq) {
        int C7;
        uq.m(10);
        int w7 = uq.w();
        if (w7 <= 0) {
            return null;
        }
        int i8 = k02.f16492d;
        long M7 = AbstractC2301cW.M(w7, (i8 >= 32000 ? 1152 : 576) * 1000000, i8, RoundingMode.DOWN);
        int G7 = uq.G();
        int G8 = uq.G();
        int G9 = uq.G();
        uq.m(2);
        long j10 = j9 + k02.f16491c;
        long[] jArr = new long[G7];
        long[] jArr2 = new long[G7];
        int i9 = 0;
        long j11 = j9;
        while (i9 < G7) {
            long j12 = M7;
            jArr[i9] = (i9 * M7) / G7;
            jArr2[i9] = Math.max(j11, j10);
            if (G9 == 1) {
                C7 = uq.C();
            } else if (G9 == 2) {
                C7 = uq.G();
            } else if (G9 == 3) {
                C7 = uq.E();
            } else {
                if (G9 != 4) {
                    return null;
                }
                C7 = uq.F();
            }
            j11 += C7 * G8;
            i9++;
            M7 = j12;
        }
        long j13 = M7;
        if (j8 != -1 && j8 != j11) {
            HL.f("VbriSeeker", "VBRI data size mismatch: " + j8 + ", " + j11);
        }
        return new C2255c3(jArr, jArr2, j13, j11, k02.f16494f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final int a() {
        return this.f21052e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final long b(long j8) {
        return this.f21048a[AbstractC2301cW.v(this.f21049b, j8, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        long[] jArr = this.f21048a;
        int v7 = AbstractC2301cW.v(jArr, j8, true, true);
        S0 s02 = new S0(jArr[v7], this.f21049b[v7]);
        if (s02.f18729a < j8) {
            long[] jArr2 = this.f21048a;
            if (v7 != jArr2.length - 1) {
                int i8 = v7 + 1;
                return new P0(s02, new S0(jArr2[i8], this.f21049b[i8]));
            }
        }
        return new P0(s02, s02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final long d() {
        return this.f21051d;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f21050c;
    }
}
