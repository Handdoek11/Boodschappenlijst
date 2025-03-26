package com.google.android.gms.internal.wearable;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Z0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Z0 f30108f = new Z0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f30109a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f30110b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f30111c;

    /* renamed from: d, reason: collision with root package name */
    private int f30112d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30113e;

    private Z0(int i8, int[] iArr, Object[] objArr, boolean z7) {
        this.f30109a = i8;
        this.f30110b = iArr;
        this.f30111c = objArr;
        this.f30113e = z7;
    }

    public static Z0 c() {
        return f30108f;
    }

    static Z0 e(Z0 z02, Z0 z03) {
        int i8 = z02.f30109a + z03.f30109a;
        int[] copyOf = Arrays.copyOf(z02.f30110b, i8);
        System.arraycopy(z03.f30110b, 0, copyOf, z02.f30109a, z03.f30109a);
        Object[] copyOf2 = Arrays.copyOf(z02.f30111c, i8);
        System.arraycopy(z03.f30111c, 0, copyOf2, z02.f30109a, z03.f30109a);
        return new Z0(i8, copyOf, copyOf2, true);
    }

    static Z0 f() {
        return new Z0(0, new int[8], new Object[8], true);
    }

    private final void l(int i8) {
        int[] iArr = this.f30110b;
        if (i8 > iArr.length) {
            int i9 = this.f30109a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f30110b = Arrays.copyOf(iArr, i8);
            this.f30111c = Arrays.copyOf(this.f30111c, i8);
        }
    }

    public final int a() {
        int z7;
        int a8;
        int i8;
        int i9 = this.f30112d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f30109a; i11++) {
            int i12 = this.f30110b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f30111c[i11]).longValue();
                    i8 = X.z(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    Q q8 = (Q) this.f30111c[i11];
                    int z8 = X.z(i15);
                    int d8 = q8.d();
                    i8 = z8 + X.z(d8) + d8;
                } else if (i14 == 3) {
                    int z9 = X.z(i13 << 3);
                    z7 = z9 + z9;
                    a8 = ((Z0) this.f30111c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzcw("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f30111c[i11]).intValue();
                    i8 = X.z(i13 << 3) + 4;
                }
                i10 += i8;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.f30111c[i11]).longValue();
                z7 = X.z(i16);
                a8 = X.a(longValue);
            }
            i8 = z7 + a8;
            i10 += i8;
        }
        this.f30112d = i10;
        return i10;
    }

    public final int b() {
        int i8 = this.f30112d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f30109a; i10++) {
            int i11 = this.f30110b[i10] >>> 3;
            Q q8 = (Q) this.f30111c[i10];
            int z7 = X.z(8);
            int z8 = X.z(16) + X.z(i11);
            int z9 = X.z(24);
            int d8 = q8.d();
            i9 += z7 + z7 + z8 + z9 + X.z(d8) + d8;
        }
        this.f30112d = i9;
        return i9;
    }

    final Z0 d(Z0 z02) {
        if (z02.equals(f30108f)) {
            return this;
        }
        g();
        int i8 = this.f30109a + z02.f30109a;
        l(i8);
        System.arraycopy(z02.f30110b, 0, this.f30110b, this.f30109a, z02.f30109a);
        System.arraycopy(z02.f30111c, 0, this.f30111c, this.f30109a, z02.f30109a);
        this.f30109a = i8;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z0)) {
            return false;
        }
        Z0 z02 = (Z0) obj;
        int i8 = this.f30109a;
        if (i8 == z02.f30109a) {
            int[] iArr = this.f30110b;
            int[] iArr2 = z02.f30110b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    Object[] objArr = this.f30111c;
                    Object[] objArr2 = z02.f30111c;
                    int i10 = this.f30109a;
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
        if (!this.f30113e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f30113e) {
            this.f30113e = false;
        }
    }

    public final int hashCode() {
        int i8 = this.f30109a;
        int i9 = i8 + 527;
        int[] iArr = this.f30110b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i9 * 31) + i11) * 31;
        Object[] objArr = this.f30111c;
        int i14 = this.f30109a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }

    final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f30109a; i9++) {
            K0.b(sb, i8, String.valueOf(this.f30110b[i9] >>> 3), this.f30111c[i9]);
        }
    }

    final void j(int i8, Object obj) {
        g();
        l(this.f30109a + 1);
        int[] iArr = this.f30110b;
        int i9 = this.f30109a;
        iArr[i9] = i8;
        this.f30111c[i9] = obj;
        this.f30109a = i9 + 1;
    }

    public final void k(k1 k1Var) {
        if (this.f30109a != 0) {
            for (int i8 = 0; i8 < this.f30109a; i8++) {
                int i9 = this.f30110b[i8];
                Object obj = this.f30111c[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    k1Var.m(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    k1Var.C(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    k1Var.I(i11, (Q) obj);
                } else if (i10 == 3) {
                    k1Var.F(i11);
                    ((Z0) obj).k(k1Var);
                    k1Var.G(i11);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(new zzcw("Protocol message tag had invalid wire type."));
                    }
                    k1Var.k(i11, ((Integer) obj).intValue());
                }
            }
        }
    }
}
