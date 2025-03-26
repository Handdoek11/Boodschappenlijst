package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
abstract class G3 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f28872a = 100;

    static double a(byte[] bArr, int i8) {
        return Double.longBitsToDouble(t(bArr, i8));
    }

    static int b(int i8, byte[] bArr, int i9, int i10, A4 a42, J3 j32) {
        C5034u4 c5034u4 = (C5034u4) a42;
        int r8 = r(bArr, i9, j32);
        c5034u4.e(j32.f28918a);
        while (r8 < i10) {
            int r9 = r(bArr, r8, j32);
            if (i8 != j32.f28918a) {
                break;
            }
            r8 = r(bArr, r9, j32);
            c5034u4.e(j32.f28918a);
        }
        return r8;
    }

    static int c(int i8, byte[] bArr, int i9, int i10, C5075z5 c5075z5, J3 j32) {
        if ((i8 >>> 3) == 0) {
            throw zzkb.b();
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int s8 = s(bArr, i9, j32);
            c5075z5.e(i8, Long.valueOf(j32.f28919b));
            return s8;
        }
        if (i11 == 1) {
            c5075z5.e(i8, Long.valueOf(t(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int r8 = r(bArr, i9, j32);
            int i12 = j32.f28918a;
            if (i12 < 0) {
                throw zzkb.d();
            }
            if (i12 > bArr.length - r8) {
                throw zzkb.g();
            }
            if (i12 == 0) {
                c5075z5.e(i8, K3.f28931s);
            } else {
                c5075z5.e(i8, K3.p(bArr, r8, i12));
            }
            return r8 + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw zzkb.b();
            }
            c5075z5.e(i8, Integer.valueOf(q(bArr, i9)));
            return i9 + 4;
        }
        C5075z5 l8 = C5075z5.l();
        int i13 = (i8 & (-8)) | 4;
        int i14 = j32.f28922e + 1;
        j32.f28922e = i14;
        m(i14);
        int i15 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int r9 = r(bArr, i9, j32);
            int i16 = j32.f28918a;
            i15 = i16;
            if (i16 == i13) {
                i9 = r9;
                break;
            }
            int c8 = c(i15, bArr, r9, i10, l8, j32);
            i15 = i16;
            i9 = c8;
        }
        j32.f28922e--;
        if (i9 > i10 || i15 != i13) {
            throw zzkb.e();
        }
        c5075z5.e(i8, l8);
        return i9;
    }

    static int d(int i8, byte[] bArr, int i9, int i10, Object obj, W4 w42, A5 a52, J3 j32) {
        j32.f28921d.b(w42, i8 >>> 3);
        return c(i8, bArr, i9, i10, Z4.H(obj), j32);
    }

    static int e(int i8, byte[] bArr, int i9, J3 j32) {
        int i10 = i8 & ModuleDescriptor.MODULE_VERSION;
        int i11 = i9 + 1;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            j32.f28918a = i10 | (b8 << 7);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            j32.f28918a = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            j32.f28918a = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            j32.f28918a = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                j32.f28918a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    static int f(InterfaceC4964l5 interfaceC4964l5, int i8, byte[] bArr, int i9, int i10, A4 a42, J3 j32) {
        int i11 = (i8 & (-8)) | 4;
        int g8 = g(interfaceC4964l5, bArr, i9, i10, i11, j32);
        a42.add(j32.f28920c);
        while (g8 < i10) {
            int r8 = r(bArr, g8, j32);
            if (i8 != j32.f28918a) {
                break;
            }
            g8 = g(interfaceC4964l5, bArr, r8, i10, i11, j32);
            a42.add(j32.f28920c);
        }
        return g8;
    }

    private static int g(InterfaceC4964l5 interfaceC4964l5, byte[] bArr, int i8, int i9, int i10, J3 j32) {
        Object zza = interfaceC4964l5.zza();
        int i11 = i(zza, interfaceC4964l5, bArr, i8, i9, i10, j32);
        interfaceC4964l5.e(zza);
        j32.f28920c = zza;
        return i11;
    }

    static int h(InterfaceC4964l5 interfaceC4964l5, byte[] bArr, int i8, int i9, J3 j32) {
        Object zza = interfaceC4964l5.zza();
        int j8 = j(zza, interfaceC4964l5, bArr, i8, i9, j32);
        interfaceC4964l5.e(zza);
        j32.f28920c = zza;
        return j8;
    }

    static int i(Object obj, InterfaceC4964l5 interfaceC4964l5, byte[] bArr, int i8, int i9, int i10, J3 j32) {
        Z4 z42 = (Z4) interfaceC4964l5;
        int i11 = j32.f28922e + 1;
        j32.f28922e = i11;
        m(i11);
        int l8 = z42.l(obj, bArr, i8, i9, i10, j32);
        j32.f28922e--;
        j32.f28920c = obj;
        return l8;
    }

    static int j(Object obj, InterfaceC4964l5 interfaceC4964l5, byte[] bArr, int i8, int i9, J3 j32) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = e(i11, bArr, i10, j32);
            i11 = j32.f28918a;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw zzkb.g();
        }
        int i13 = j32.f28922e + 1;
        j32.f28922e = i13;
        m(i13);
        int i14 = i11 + i12;
        interfaceC4964l5.g(obj, bArr, i12, i14, j32);
        j32.f28922e--;
        j32.f28920c = obj;
        return i14;
    }

    static int k(byte[] bArr, int i8, J3 j32) {
        int r8 = r(bArr, i8, j32);
        int i9 = j32.f28918a;
        if (i9 < 0) {
            throw zzkb.d();
        }
        if (i9 > bArr.length - r8) {
            throw zzkb.g();
        }
        if (i9 == 0) {
            j32.f28920c = K3.f28931s;
            return r8;
        }
        j32.f28920c = K3.p(bArr, r8, i9);
        return r8 + i9;
    }

    static int l(byte[] bArr, int i8, A4 a42, J3 j32) {
        C5034u4 c5034u4 = (C5034u4) a42;
        int r8 = r(bArr, i8, j32);
        int i9 = j32.f28918a + r8;
        while (r8 < i9) {
            r8 = r(bArr, r8, j32);
            c5034u4.e(j32.f28918a);
        }
        if (r8 == i9) {
            return r8;
        }
        throw zzkb.g();
    }

    private static void m(int i8) {
        if (i8 >= f28872a) {
            throw zzkb.f();
        }
    }

    static float n(byte[] bArr, int i8) {
        return Float.intBitsToFloat(q(bArr, i8));
    }

    static int o(InterfaceC4964l5 interfaceC4964l5, int i8, byte[] bArr, int i9, int i10, A4 a42, J3 j32) {
        int h8 = h(interfaceC4964l5, bArr, i9, i10, j32);
        a42.add(j32.f28920c);
        while (h8 < i10) {
            int r8 = r(bArr, h8, j32);
            if (i8 != j32.f28918a) {
                break;
            }
            h8 = h(interfaceC4964l5, bArr, r8, i10, j32);
            a42.add(j32.f28920c);
        }
        return h8;
    }

    static int p(byte[] bArr, int i8, J3 j32) {
        int r8 = r(bArr, i8, j32);
        int i9 = j32.f28918a;
        if (i9 < 0) {
            throw zzkb.d();
        }
        if (i9 == 0) {
            j32.f28920c = "";
            return r8;
        }
        j32.f28920c = F5.d(bArr, r8, i9);
        return r8 + i9;
    }

    static int q(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    static int r(byte[] bArr, int i8, J3 j32) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return e(b8, bArr, i9, j32);
        }
        j32.f28918a = b8;
        return i9;
    }

    static int s(byte[] bArr, int i8, J3 j32) {
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        if (j8 >= 0) {
            j32.f28919b = j8;
            return i9;
        }
        int i10 = i8 + 2;
        byte b8 = bArr[i9];
        long j9 = (j8 & 127) | ((b8 & Byte.MAX_VALUE) << 7);
        int i11 = 7;
        while (b8 < 0) {
            int i12 = i10 + 1;
            i11 += 7;
            j9 |= (r10 & Byte.MAX_VALUE) << i11;
            b8 = bArr[i10];
            i10 = i12;
        }
        j32.f28919b = j9;
        return i10;
    }

    static long t(byte[] bArr, int i8) {
        return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }
}
