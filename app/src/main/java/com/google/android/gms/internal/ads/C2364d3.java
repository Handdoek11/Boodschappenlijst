package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2364d3 {

    /* renamed from: a, reason: collision with root package name */
    public final K0 f21396a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21397b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21398c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21399d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21400e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f21401f;

    private C2364d3(K0 k02, long j8, long j9, long[] jArr, int i8, int i9) {
        this.f21396a = new K0(k02);
        this.f21397b = j8;
        this.f21398c = j9;
        this.f21401f = jArr;
        this.f21399d = i8;
        this.f21400e = i9;
    }

    public static C2364d3 b(K0 k02, UQ uq) {
        long[] jArr;
        int i8;
        int i9;
        int w7 = uq.w();
        int F7 = (w7 & 1) != 0 ? uq.F() : -1;
        long K7 = (w7 & 2) != 0 ? uq.K() : -1L;
        if ((w7 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i10 = 0; i10 < 100; i10++) {
                jArr2[i10] = uq.C();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((w7 & 8) != 0) {
            uq.m(4);
        }
        if (uq.r() >= 24) {
            uq.m(21);
            int E7 = uq.E();
            i9 = E7 & 4095;
            i8 = E7 >> 12;
        } else {
            i8 = -1;
            i9 = -1;
        }
        return new C2364d3(k02, F7, K7, jArr, i8, i9);
    }

    public final long a() {
        long j8 = this.f21397b;
        if (j8 == -1 || j8 == 0) {
            return -9223372036854775807L;
        }
        return AbstractC2301cW.L((j8 * r4.f16495g) - 1, this.f21396a.f16492d);
    }
}
