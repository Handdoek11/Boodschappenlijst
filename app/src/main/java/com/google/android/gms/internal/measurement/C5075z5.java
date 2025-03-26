package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5075z5 {

    /* renamed from: f, reason: collision with root package name */
    private static final C5075z5 f29661f = new C5075z5(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f29662a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f29663b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f29664c;

    /* renamed from: d, reason: collision with root package name */
    private int f29665d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29666e;

    private C5075z5() {
        this(0, new int[8], new Object[8], true);
    }

    static C5075z5 c(C5075z5 c5075z5, C5075z5 c5075z52) {
        int i8 = c5075z5.f29662a + c5075z52.f29662a;
        int[] copyOf = Arrays.copyOf(c5075z5.f29663b, i8);
        System.arraycopy(c5075z52.f29663b, 0, copyOf, c5075z5.f29662a, c5075z52.f29662a);
        Object[] copyOf2 = Arrays.copyOf(c5075z5.f29664c, i8);
        System.arraycopy(c5075z52.f29664c, 0, copyOf2, c5075z5.f29662a, c5075z52.f29662a);
        return new C5075z5(i8, copyOf, copyOf2, true);
    }

    private final void d(int i8) {
        int[] iArr = this.f29663b;
        if (i8 > iArr.length) {
            int i9 = this.f29662a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f29663b = Arrays.copyOf(iArr, i8);
            this.f29664c = Arrays.copyOf(this.f29664c, i8);
        }
    }

    private static void f(int i8, Object obj, S5 s52) {
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        if (i10 == 0) {
            s52.l(i9, ((Long) obj).longValue());
            return;
        }
        if (i10 == 1) {
            s52.d(i9, ((Long) obj).longValue());
            return;
        }
        if (i10 == 2) {
            s52.q(i9, (K3) obj);
            return;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new RuntimeException(zzkb.a());
            }
            s52.o(i9, ((Integer) obj).intValue());
        } else if (s52.zza() == 1) {
            s52.A(i9);
            ((C5075z5) obj).j(s52);
            s52.m(i9);
        } else {
            s52.m(i9);
            ((C5075z5) obj).j(s52);
            s52.A(i9);
        }
    }

    public static C5075z5 k() {
        return f29661f;
    }

    static C5075z5 l() {
        return new C5075z5();
    }

    private final void n() {
        if (!this.f29666e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int m02;
        int i8 = this.f29665d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f29662a; i10++) {
            int i11 = this.f29663b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                m02 = zzjc.m0(i12, ((Long) this.f29664c[i10]).longValue());
            } else if (i13 == 1) {
                m02 = zzjc.P(i12, ((Long) this.f29664c[i10]).longValue());
            } else if (i13 == 2) {
                m02 = zzjc.Q(i12, (K3) this.f29664c[i10]);
            } else if (i13 == 3) {
                m02 = (zzjc.s0(i12) << 1) + ((C5075z5) this.f29664c[i10]).a();
            } else {
                if (i13 != 5) {
                    throw new IllegalStateException(zzkb.a());
                }
                m02 = zzjc.h0(i12, ((Integer) this.f29664c[i10]).intValue());
            }
            i9 += m02;
        }
        this.f29665d = i9;
        return i9;
    }

    final C5075z5 b(C5075z5 c5075z5) {
        if (c5075z5.equals(f29661f)) {
            return this;
        }
        n();
        int i8 = this.f29662a + c5075z5.f29662a;
        d(i8);
        System.arraycopy(c5075z5.f29663b, 0, this.f29663b, this.f29662a, c5075z5.f29662a);
        System.arraycopy(c5075z5.f29664c, 0, this.f29664c, this.f29662a, c5075z5.f29662a);
        this.f29662a = i8;
        return this;
    }

    final void e(int i8, Object obj) {
        n();
        d(this.f29662a + 1);
        int[] iArr = this.f29663b;
        int i9 = this.f29662a;
        iArr[i9] = i8;
        this.f29664c[i9] = obj;
        this.f29662a = i9 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5075z5)) {
            return false;
        }
        C5075z5 c5075z5 = (C5075z5) obj;
        int i8 = this.f29662a;
        if (i8 == c5075z5.f29662a) {
            int[] iArr = this.f29663b;
            int[] iArr2 = c5075z5.f29663b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    Object[] objArr = this.f29664c;
                    Object[] objArr2 = c5075z5.f29664c;
                    int i10 = this.f29662a;
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

    final void g(S5 s52) {
        if (s52.zza() == 2) {
            for (int i8 = this.f29662a - 1; i8 >= 0; i8--) {
                s52.v(this.f29663b[i8] >>> 3, this.f29664c[i8]);
            }
            return;
        }
        for (int i9 = 0; i9 < this.f29662a; i9++) {
            s52.v(this.f29663b[i9] >>> 3, this.f29664c[i9]);
        }
    }

    final void h(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f29662a; i9++) {
            X4.d(sb, i8, String.valueOf(this.f29663b[i9] >>> 3), this.f29664c[i9]);
        }
    }

    public final int hashCode() {
        int i8 = this.f29662a;
        int i9 = (i8 + 527) * 31;
        int[] iArr = this.f29663b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 + i11) * 31;
        Object[] objArr = this.f29664c;
        int i14 = this.f29662a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }

    public final int i() {
        int i8 = this.f29665d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f29662a; i10++) {
            i9 += zzjc.Z(this.f29663b[i10] >>> 3, (K3) this.f29664c[i10]);
        }
        this.f29665d = i9;
        return i9;
    }

    public final void j(S5 s52) {
        if (this.f29662a == 0) {
            return;
        }
        if (s52.zza() == 1) {
            for (int i8 = 0; i8 < this.f29662a; i8++) {
                f(this.f29663b[i8], this.f29664c[i8], s52);
            }
            return;
        }
        for (int i9 = this.f29662a - 1; i9 >= 0; i9--) {
            f(this.f29663b[i9], this.f29664c[i9], s52);
        }
    }

    public final void m() {
        if (this.f29666e) {
            this.f29666e = false;
        }
    }

    private C5075z5(int i8, int[] iArr, Object[] objArr, boolean z7) {
        this.f29665d = -1;
        this.f29662a = i8;
        this.f29663b = iArr;
        this.f29664c = objArr;
        this.f29666e = z7;
    }
}
