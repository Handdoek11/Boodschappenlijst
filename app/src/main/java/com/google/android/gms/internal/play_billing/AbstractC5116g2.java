package com.google.android.gms.internal.play_billing;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.play_billing.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5116g2 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f29908a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f29909b = 0;

    static int a(byte[] bArr, int i8, C5104e2 c5104e2) {
        int h8 = h(bArr, i8, c5104e2);
        int i9 = c5104e2.f29893a;
        if (i9 < 0) {
            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i9 > bArr.length - h8) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i9 == 0) {
            c5104e2.f29895c = AbstractC5176q2.f29971s;
            return h8;
        }
        c5104e2.f29895c = AbstractC5176q2.q(bArr, h8, i9);
        return h8 + i9;
    }

    static int b(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    static int c(InterfaceC5188s3 interfaceC5188s3, byte[] bArr, int i8, int i9, int i10, C5104e2 c5104e2) {
        Object b8 = interfaceC5188s3.b();
        int l8 = l(b8, interfaceC5188s3, bArr, i8, i9, i10, c5104e2);
        interfaceC5188s3.d(b8);
        c5104e2.f29895c = b8;
        return l8;
    }

    static int d(InterfaceC5188s3 interfaceC5188s3, byte[] bArr, int i8, int i9, C5104e2 c5104e2) {
        Object b8 = interfaceC5188s3.b();
        int m8 = m(b8, interfaceC5188s3, bArr, i8, i9, c5104e2);
        interfaceC5188s3.d(b8);
        c5104e2.f29895c = b8;
        return m8;
    }

    static int e(InterfaceC5188s3 interfaceC5188s3, int i8, byte[] bArr, int i9, int i10, Q2 q22, C5104e2 c5104e2) {
        int d8 = d(interfaceC5188s3, bArr, i9, i10, c5104e2);
        q22.add(c5104e2.f29895c);
        while (d8 < i10) {
            int h8 = h(bArr, d8, c5104e2);
            if (i8 != c5104e2.f29893a) {
                break;
            }
            d8 = d(interfaceC5188s3, bArr, h8, i10, c5104e2);
            q22.add(c5104e2.f29895c);
        }
        return d8;
    }

    static int f(byte[] bArr, int i8, Q2 q22, C5104e2 c5104e2) {
        N2 n22 = (N2) q22;
        int h8 = h(bArr, i8, c5104e2);
        int i9 = c5104e2.f29893a + h8;
        while (h8 < i9) {
            h8 = h(bArr, h8, c5104e2);
            n22.e(c5104e2.f29893a);
        }
        if (h8 == i9) {
            return h8;
        }
        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(int i8, byte[] bArr, int i9, int i10, C5222y3 c5222y3, C5104e2 c5104e2) {
        if ((i8 >>> 3) == 0) {
            throw new zzhr("Protocol message contained an invalid tag (zero).");
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int k8 = k(bArr, i9, c5104e2);
            c5222y3.j(i8, Long.valueOf(c5104e2.f29894b));
            return k8;
        }
        if (i11 == 1) {
            c5222y3.j(i8, Long.valueOf(n(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int h8 = h(bArr, i9, c5104e2);
            int i12 = c5104e2.f29893a;
            if (i12 < 0) {
                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i12 > bArr.length - h8) {
                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i12 == 0) {
                c5222y3.j(i8, AbstractC5176q2.f29971s);
            } else {
                c5222y3.j(i8, AbstractC5176q2.q(bArr, h8, i12));
            }
            return h8 + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw new zzhr("Protocol message contained an invalid tag (zero).");
            }
            c5222y3.j(i8, Integer.valueOf(b(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i8 & (-8)) | 4;
        C5222y3 f8 = C5222y3.f();
        int i14 = c5104e2.f29897e + 1;
        c5104e2.f29897e = i14;
        o(i14);
        int i15 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int h9 = h(bArr, i9, c5104e2);
            i15 = c5104e2.f29893a;
            if (i15 == i13) {
                i9 = h9;
                break;
            }
            i9 = g(i15, bArr, h9, i10, f8, c5104e2);
        }
        c5104e2.f29897e--;
        if (i9 > i10 || i15 != i13) {
            throw new zzhr("Failed to parse the message.");
        }
        c5222y3.j(i8, f8);
        return i9;
    }

    static int h(byte[] bArr, int i8, C5104e2 c5104e2) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return i(b8, bArr, i9, c5104e2);
        }
        c5104e2.f29893a = b8;
        return i9;
    }

    static int i(int i8, byte[] bArr, int i9, C5104e2 c5104e2) {
        byte b8 = bArr[i9];
        int i10 = i9 + 1;
        int i11 = i8 & ModuleDescriptor.MODULE_VERSION;
        if (b8 >= 0) {
            c5104e2.f29893a = i11 | (b8 << 7);
            return i10;
        }
        int i12 = i11 | ((b8 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i10];
        if (b9 >= 0) {
            c5104e2.f29893a = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            c5104e2.f29893a = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            c5104e2.f29893a = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                c5104e2.f29893a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    static int j(int i8, byte[] bArr, int i9, int i10, Q2 q22, C5104e2 c5104e2) {
        N2 n22 = (N2) q22;
        int h8 = h(bArr, i9, c5104e2);
        n22.e(c5104e2.f29893a);
        while (h8 < i10) {
            int h9 = h(bArr, h8, c5104e2);
            if (i8 != c5104e2.f29893a) {
                break;
            }
            h8 = h(bArr, h9, c5104e2);
            n22.e(c5104e2.f29893a);
        }
        return h8;
    }

    static int k(byte[] bArr, int i8, C5104e2 c5104e2) {
        long j8 = bArr[i8];
        int i9 = i8 + 1;
        if (j8 >= 0) {
            c5104e2.f29894b = j8;
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
        c5104e2.f29894b = j9;
        return i10;
    }

    static int l(Object obj, InterfaceC5188s3 interfaceC5188s3, byte[] bArr, int i8, int i9, int i10, C5104e2 c5104e2) {
        C5141k3 c5141k3 = (C5141k3) interfaceC5188s3;
        int i11 = c5104e2.f29897e + 1;
        c5104e2.f29897e = i11;
        o(i11);
        int y7 = c5141k3.y(obj, bArr, i8, i9, i10, c5104e2);
        c5104e2.f29897e--;
        c5104e2.f29895c = obj;
        return y7;
    }

    static int m(Object obj, InterfaceC5188s3 interfaceC5188s3, byte[] bArr, int i8, int i9, C5104e2 c5104e2) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = i(i11, bArr, i10, c5104e2);
            i11 = c5104e2.f29893a;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = c5104e2.f29897e + 1;
        c5104e2.f29897e = i13;
        o(i13);
        int i14 = i11 + i12;
        interfaceC5188s3.h(obj, bArr, i12, i14, c5104e2);
        c5104e2.f29897e--;
        c5104e2.f29895c = obj;
        return i14;
    }

    static long n(byte[] bArr, int i8) {
        return (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48) | ((bArr[i8 + 7] & 255) << 56);
    }

    private static void o(int i8) {
        if (i8 >= f29908a) {
            throw new zzhr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
