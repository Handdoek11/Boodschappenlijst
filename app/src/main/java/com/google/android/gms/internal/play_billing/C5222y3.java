package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5222y3 {

    /* renamed from: f, reason: collision with root package name */
    private static final C5222y3 f30033f = new C5222y3(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f30034a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f30035b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f30036c;

    /* renamed from: d, reason: collision with root package name */
    private int f30037d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30038e;

    private C5222y3(int i8, int[] iArr, Object[] objArr, boolean z7) {
        this.f30034a = i8;
        this.f30035b = iArr;
        this.f30036c = objArr;
        this.f30038e = z7;
    }

    public static C5222y3 c() {
        return f30033f;
    }

    static C5222y3 e(C5222y3 c5222y3, C5222y3 c5222y32) {
        int i8 = c5222y3.f30034a + c5222y32.f30034a;
        int[] copyOf = Arrays.copyOf(c5222y3.f30035b, i8);
        System.arraycopy(c5222y32.f30035b, 0, copyOf, c5222y3.f30034a, c5222y32.f30034a);
        Object[] copyOf2 = Arrays.copyOf(c5222y3.f30036c, i8);
        System.arraycopy(c5222y32.f30036c, 0, copyOf2, c5222y3.f30034a, c5222y32.f30034a);
        return new C5222y3(i8, copyOf, copyOf2, true);
    }

    static C5222y3 f() {
        return new C5222y3(0, new int[8], new Object[8], true);
    }

    private final void l(int i8) {
        int[] iArr = this.f30035b;
        if (i8 > iArr.length) {
            int i9 = this.f30034a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f30035b = Arrays.copyOf(iArr, i8);
            this.f30036c = Arrays.copyOf(this.f30036c, i8);
        }
    }

    public final int a() {
        int z7;
        int a8;
        int i8;
        int i9 = this.f30037d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f30034a; i11++) {
            int i12 = this.f30035b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f30036c[i11]).longValue();
                    i8 = AbstractC5211w2.z(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    AbstractC5176q2 abstractC5176q2 = (AbstractC5176q2) this.f30036c[i11];
                    int z8 = AbstractC5211w2.z(i15);
                    int d8 = abstractC5176q2.d();
                    i8 = z8 + AbstractC5211w2.z(d8) + d8;
                } else if (i14 == 3) {
                    int z9 = AbstractC5211w2.z(i13 << 3);
                    z7 = z9 + z9;
                    a8 = ((C5222y3) this.f30036c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f30036c[i11]).intValue();
                    i8 = AbstractC5211w2.z(i13 << 3) + 4;
                }
                i10 += i8;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.f30036c[i11]).longValue();
                z7 = AbstractC5211w2.z(i16);
                a8 = AbstractC5211w2.a(longValue);
            }
            i8 = z7 + a8;
            i10 += i8;
        }
        this.f30037d = i10;
        return i10;
    }

    public final int b() {
        int i8 = this.f30037d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f30034a; i10++) {
            int i11 = this.f30035b[i10] >>> 3;
            AbstractC5176q2 abstractC5176q2 = (AbstractC5176q2) this.f30036c[i10];
            int z7 = AbstractC5211w2.z(8);
            int z8 = AbstractC5211w2.z(16) + AbstractC5211w2.z(i11);
            int z9 = AbstractC5211w2.z(24);
            int d8 = abstractC5176q2.d();
            i9 += z7 + z7 + z8 + z9 + AbstractC5211w2.z(d8) + d8;
        }
        this.f30037d = i9;
        return i9;
    }

    final C5222y3 d(C5222y3 c5222y3) {
        if (c5222y3.equals(f30033f)) {
            return this;
        }
        g();
        int i8 = this.f30034a + c5222y3.f30034a;
        l(i8);
        System.arraycopy(c5222y3.f30035b, 0, this.f30035b, this.f30034a, c5222y3.f30034a);
        System.arraycopy(c5222y3.f30036c, 0, this.f30036c, this.f30034a, c5222y3.f30034a);
        this.f30034a = i8;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5222y3)) {
            return false;
        }
        C5222y3 c5222y3 = (C5222y3) obj;
        int i8 = this.f30034a;
        if (i8 == c5222y3.f30034a) {
            int[] iArr = this.f30035b;
            int[] iArr2 = c5222y3.f30035b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    Object[] objArr = this.f30036c;
                    Object[] objArr2 = c5222y3.f30036c;
                    int i10 = this.f30034a;
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
        if (!this.f30038e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f30038e) {
            this.f30038e = false;
        }
    }

    public final int hashCode() {
        int i8 = this.f30034a;
        int i9 = i8 + 527;
        int[] iArr = this.f30035b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i9 * 31) + i11) * 31;
        Object[] objArr = this.f30036c;
        int i14 = this.f30034a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }

    final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f30034a; i9++) {
            AbstractC5135j3.b(sb, i8, String.valueOf(this.f30035b[i9] >>> 3), this.f30036c[i9]);
        }
    }

    final void j(int i8, Object obj) {
        g();
        l(this.f30034a + 1);
        int[] iArr = this.f30035b;
        int i9 = this.f30034a;
        iArr[i9] = i8;
        this.f30036c[i9] = obj;
        this.f30034a = i9 + 1;
    }

    public final void k(I3 i32) {
        if (this.f30034a != 0) {
            for (int i8 = 0; i8 < this.f30034a; i8++) {
                int i9 = this.f30035b[i8];
                Object obj = this.f30036c[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    i32.m(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    i32.C(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    i32.J(i11, (AbstractC5176q2) obj);
                } else if (i10 == 3) {
                    i32.F(i11);
                    ((C5222y3) obj).k(i32);
                    i32.G(i11);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    i32.k(i11, ((Integer) obj).intValue());
                }
            }
        }
    }
}
