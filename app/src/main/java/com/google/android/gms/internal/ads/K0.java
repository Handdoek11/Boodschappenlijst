package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public int f16489a;

    /* renamed from: b, reason: collision with root package name */
    public String f16490b;

    /* renamed from: c, reason: collision with root package name */
    public int f16491c;

    /* renamed from: d, reason: collision with root package name */
    public int f16492d;

    /* renamed from: e, reason: collision with root package name */
    public int f16493e;

    /* renamed from: f, reason: collision with root package name */
    public int f16494f;

    /* renamed from: g, reason: collision with root package name */
    public int f16495g;

    public K0() {
    }

    public final boolean a(int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (!L0.m(i8) || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0 || (i11 = (i8 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i8 >>> 10) & 3) == 3) {
            return false;
        }
        int i13 = i11 - 1;
        this.f16489a = i9;
        this.f16490b = L0.f16722a[3 - i10];
        int i14 = L0.f16723b[i12];
        this.f16492d = i14;
        if (i9 == 2) {
            i14 /= 2;
            this.f16492d = i14;
        } else if (i9 == 0) {
            i14 /= 4;
            this.f16492d = i14;
        }
        int i15 = (i8 >>> 9) & 1;
        this.f16495g = L0.l(i9, i10);
        if (i10 == 3) {
            int i16 = i9 == 3 ? L0.f16724c[i13] : L0.f16725d[i13];
            this.f16494f = i16;
            this.f16491c = (((i16 * 12) / i14) + i15) * 4;
        } else {
            if (i9 == 3) {
                int i17 = i10 == 2 ? L0.f16726e[i13] : L0.f16727f[i13];
                this.f16494f = i17;
                this.f16491c = ((i17 * 144) / i14) + i15;
            } else {
                int i18 = L0.f16728g[i13];
                this.f16494f = i18;
                this.f16491c = (((i10 == 1 ? 72 : 144) * i18) / i14) + i15;
            }
        }
        this.f16493e = ((i8 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public K0(K0 k02) {
        this.f16489a = k02.f16489a;
        this.f16490b = k02.f16490b;
        this.f16491c = k02.f16491c;
        this.f16492d = k02.f16492d;
        this.f16493e = k02.f16493e;
        this.f16494f = k02.f16494f;
        this.f16495g = k02.f16495g;
    }
}
