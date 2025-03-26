package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class N3 {

    /* renamed from: a, reason: collision with root package name */
    public final K3 f17458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17459b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f17460c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f17461d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17462e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f17463f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f17464g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17465h;

    public N3(K3 k32, long[] jArr, int[] iArr, int i8, long[] jArr2, int[] iArr2, long j8) {
        int length = iArr.length;
        int length2 = jArr2.length;
        AbstractC3796qC.d(length == length2);
        int length3 = jArr.length;
        AbstractC3796qC.d(length3 == length2);
        int length4 = iArr2.length;
        AbstractC3796qC.d(length4 == length2);
        this.f17458a = k32;
        this.f17460c = jArr;
        this.f17461d = iArr;
        this.f17462e = i8;
        this.f17463f = jArr2;
        this.f17464g = iArr2;
        this.f17465h = j8;
        this.f17459b = length3;
        if (length4 > 0) {
            int i9 = length4 - 1;
            iArr2[i9] = iArr2[i9] | 536870912;
        }
    }

    public final int a(long j8) {
        for (int v7 = AbstractC2301cW.v(this.f17463f, j8, true, false); v7 >= 0; v7--) {
            if ((this.f17464g[v7] & 1) != 0) {
                return v7;
            }
        }
        return -1;
    }

    public final int b(long j8) {
        for (int s8 = AbstractC2301cW.s(this.f17463f, j8, true, false); s8 < this.f17463f.length; s8++) {
            if ((this.f17464g[s8] & 1) != 0) {
                return s8;
            }
        }
        return -1;
    }
}
