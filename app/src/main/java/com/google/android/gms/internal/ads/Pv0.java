package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Pv0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Pv0 f18301f = new Pv0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f18302a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f18303b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f18304c;

    /* renamed from: d, reason: collision with root package name */
    private int f18305d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18306e;

    private Pv0(int i8, int[] iArr, Object[] objArr, boolean z7) {
        this.f18305d = -1;
        this.f18302a = i8;
        this.f18303b = iArr;
        this.f18304c = objArr;
        this.f18306e = z7;
    }

    public static Pv0 c() {
        return f18301f;
    }

    static Pv0 e(Pv0 pv0, Pv0 pv02) {
        int i8 = pv0.f18302a + pv02.f18302a;
        int[] copyOf = Arrays.copyOf(pv0.f18303b, i8);
        System.arraycopy(pv02.f18303b, 0, copyOf, pv0.f18302a, pv02.f18302a);
        Object[] copyOf2 = Arrays.copyOf(pv0.f18304c, i8);
        System.arraycopy(pv02.f18304c, 0, copyOf2, pv0.f18302a, pv02.f18302a);
        return new Pv0(i8, copyOf, copyOf2, true);
    }

    static Pv0 f() {
        return new Pv0();
    }

    private final void l(int i8) {
        int[] iArr = this.f18303b;
        if (i8 > iArr.length) {
            int i9 = this.f18302a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f18303b = Arrays.copyOf(iArr, i8);
            this.f18304c = Arrays.copyOf(this.f18304c, i8);
        }
    }

    public final int a() {
        int e8;
        int f8;
        int i8;
        int i9 = this.f18305d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18302a; i11++) {
            int i12 = this.f18303b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f18304c[i11]).longValue();
                    i8 = AbstractC4740yu0.e(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    AbstractC3542nu0 abstractC3542nu0 = (AbstractC3542nu0) this.f18304c[i11];
                    int e9 = AbstractC4740yu0.e(i15);
                    int j8 = abstractC3542nu0.j();
                    i8 = e9 + AbstractC4740yu0.e(j8) + j8;
                } else if (i14 == 3) {
                    int e10 = AbstractC4740yu0.e(i13 << 3);
                    e8 = e10 + e10;
                    f8 = ((Pv0) this.f18304c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzgyf("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f18304c[i11]).intValue();
                    i8 = AbstractC4740yu0.e(i13 << 3) + 4;
                }
                i10 += i8;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.f18304c[i11]).longValue();
                e8 = AbstractC4740yu0.e(i16);
                f8 = AbstractC4740yu0.f(longValue);
            }
            i8 = e8 + f8;
            i10 += i8;
        }
        this.f18305d = i10;
        return i10;
    }

    public final int b() {
        int i8 = this.f18305d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f18302a; i10++) {
            int i11 = this.f18303b[i10] >>> 3;
            AbstractC3542nu0 abstractC3542nu0 = (AbstractC3542nu0) this.f18304c[i10];
            int e8 = AbstractC4740yu0.e(8);
            int e9 = AbstractC4740yu0.e(16) + AbstractC4740yu0.e(i11);
            int e10 = AbstractC4740yu0.e(24);
            int j8 = abstractC3542nu0.j();
            i9 += e8 + e8 + e9 + e10 + AbstractC4740yu0.e(j8) + j8;
        }
        this.f18305d = i9;
        return i9;
    }

    final Pv0 d(Pv0 pv0) {
        if (pv0.equals(f18301f)) {
            return this;
        }
        g();
        int i8 = this.f18302a + pv0.f18302a;
        l(i8);
        System.arraycopy(pv0.f18303b, 0, this.f18303b, this.f18302a, pv0.f18302a);
        System.arraycopy(pv0.f18304c, 0, this.f18304c, this.f18302a, pv0.f18302a);
        this.f18302a = i8;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Pv0)) {
            return false;
        }
        Pv0 pv0 = (Pv0) obj;
        int i8 = this.f18302a;
        if (i8 == pv0.f18302a) {
            int[] iArr = this.f18303b;
            int[] iArr2 = pv0.f18303b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    Object[] objArr = this.f18304c;
                    Object[] objArr2 = pv0.f18304c;
                    int i10 = this.f18302a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
                if (iArr[i9] != iArr2[i9]) {
                    break;
                }
                i9++;
            }
        }
        return false;
    }

    final void g() {
        if (!this.f18306e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f18306e) {
            this.f18306e = false;
        }
    }

    public final int hashCode() {
        int i8 = this.f18302a;
        int i9 = i8 + 527;
        int[] iArr = this.f18303b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i9 * 31) + i11) * 31;
        Object[] objArr = this.f18304c;
        int i14 = this.f18302a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }

    final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f18302a; i9++) {
            AbstractC4088sv0.b(sb, i8, String.valueOf(this.f18303b[i9] >>> 3), this.f18304c[i9]);
        }
    }

    final void j(int i8, Object obj) {
        g();
        l(this.f18302a + 1);
        int[] iArr = this.f18303b;
        int i9 = this.f18302a;
        iArr[i9] = i8;
        this.f18304c[i9] = obj;
        this.f18302a = i9 + 1;
    }

    public final void k(InterfaceC2242bw0 interfaceC2242bw0) {
        if (this.f18302a != 0) {
            for (int i8 = 0; i8 < this.f18302a; i8++) {
                int i9 = this.f18303b[i8];
                Object obj = this.f18304c[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    interfaceC2242bw0.m(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    interfaceC2242bw0.C(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    interfaceC2242bw0.I(i11, (AbstractC3542nu0) obj);
                } else if (i10 == 3) {
                    interfaceC2242bw0.F(i11);
                    ((Pv0) obj).k(interfaceC2242bw0);
                    interfaceC2242bw0.G(i11);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(new zzgyf("Protocol message tag had invalid wire type."));
                    }
                    interfaceC2242bw0.k(i11, ((Integer) obj).intValue());
                }
            }
        }
    }

    private Pv0() {
        this(0, new int[8], new Object[8], true);
    }
}
