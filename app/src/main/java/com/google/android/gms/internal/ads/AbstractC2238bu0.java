package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.bu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2238bu0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f20998a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20999b = 0;

    static int a(byte[] bArr, int i8, C2129au0 c2129au0) {
        int h8 = h(bArr, i8, c2129au0);
        int i9 = c2129au0.f20777a;
        if (i9 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i9 > bArr.length - h8) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i9 == 0) {
            c2129au0.f20779c = AbstractC3542nu0.f25048s;
            return h8;
        }
        c2129au0.f20779c = AbstractC3542nu0.H(bArr, h8, i9);
        return h8 + i9;
    }

    static int b(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    static int c(Iv0 iv0, byte[] bArr, int i8, int i9, int i10, C2129au0 c2129au0) {
        Object b8 = iv0.b();
        int l8 = l(b8, iv0, bArr, i8, i9, i10, c2129au0);
        iv0.d(b8);
        c2129au0.f20779c = b8;
        return l8;
    }

    static int d(Iv0 iv0, byte[] bArr, int i8, int i9, C2129au0 c2129au0) {
        Object b8 = iv0.b();
        int m8 = m(b8, iv0, bArr, i8, i9, c2129au0);
        iv0.d(b8);
        c2129au0.f20779c = b8;
        return m8;
    }

    static int e(Iv0 iv0, int i8, byte[] bArr, int i9, int i10, Zu0 zu0, C2129au0 c2129au0) {
        int d8 = d(iv0, bArr, i9, i10, c2129au0);
        zu0.add(c2129au0.f20779c);
        while (d8 < i10) {
            int h8 = h(bArr, d8, c2129au0);
            if (i8 != c2129au0.f20777a) {
                break;
            }
            d8 = d(iv0, bArr, h8, i10, c2129au0);
            zu0.add(c2129au0.f20779c);
        }
        return d8;
    }

    static int f(byte[] bArr, int i8, Zu0 zu0, C2129au0 c2129au0) {
        Ru0 ru0 = (Ru0) zu0;
        int h8 = h(bArr, i8, c2129au0);
        int i9 = c2129au0.f20777a + h8;
        while (h8 < i9) {
            h8 = h(bArr, h8, c2129au0);
            ru0.K(c2129au0.f20777a);
        }
        if (h8 == i9) {
            return h8;
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(int i8, byte[] bArr, int i9, int i10, Pv0 pv0, C2129au0 c2129au0) {
        if ((i8 >>> 3) == 0) {
            throw new zzgyg("Protocol message contained an invalid tag (zero).");
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int k8 = k(bArr, i9, c2129au0);
            pv0.j(i8, Long.valueOf(c2129au0.f20778b));
            return k8;
        }
        if (i11 == 1) {
            pv0.j(i8, Long.valueOf(n(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int h8 = h(bArr, i9, c2129au0);
            int i12 = c2129au0.f20777a;
            if (i12 < 0) {
                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i12 > bArr.length - h8) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i12 == 0) {
                pv0.j(i8, AbstractC3542nu0.f25048s);
            } else {
                pv0.j(i8, AbstractC3542nu0.H(bArr, h8, i12));
            }
            return h8 + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw new zzgyg("Protocol message contained an invalid tag (zero).");
            }
            pv0.j(i8, Integer.valueOf(b(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i8 & (-8)) | 4;
        Pv0 f8 = Pv0.f();
        int i14 = c2129au0.f20781e + 1;
        c2129au0.f20781e = i14;
        o(i14);
        int i15 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int h9 = h(bArr, i9, c2129au0);
            i15 = c2129au0.f20777a;
            if (i15 == i13) {
                i9 = h9;
                break;
            }
            i9 = g(i15, bArr, h9, i10, f8, c2129au0);
        }
        c2129au0.f20781e--;
        if (i9 > i10 || i15 != i13) {
            throw new zzgyg("Failed to parse the message.");
        }
        pv0.j(i8, f8);
        return i9;
    }

    static int h(byte[] bArr, int i8, C2129au0 c2129au0) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return i(b8, bArr, i9, c2129au0);
        }
        c2129au0.f20777a = b8;
        return i9;
    }

    static int i(int i8, byte[] bArr, int i9, C2129au0 c2129au0) {
        byte b8 = bArr[i9];
        int i10 = i9 + 1;
        int i11 = i8 & ModuleDescriptor.MODULE_VERSION;
        if (b8 >= 0) {
            c2129au0.f20777a = i11 | (b8 << 7);
            return i10;
        }
        int i12 = i11 | ((b8 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i10];
        if (b9 >= 0) {
            c2129au0.f20777a = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            c2129au0.f20777a = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            c2129au0.f20777a = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                c2129au0.f20777a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    static int j(int i8, byte[] bArr, int i9, int i10, Zu0 zu0, C2129au0 c2129au0) {
        Ru0 ru0 = (Ru0) zu0;
        int h8 = h(bArr, i9, c2129au0);
        ru0.K(c2129au0.f20777a);
        while (h8 < i10) {
            int h9 = h(bArr, h8, c2129au0);
            if (i8 != c2129au0.f20777a) {
                break;
            }
            h8 = h(bArr, h9, c2129au0);
            ru0.K(c2129au0.f20777a);
        }
        return h8;
    }

    static int k(byte[] bArr, int i8, C2129au0 c2129au0) {
        long j8 = bArr[i8];
        int i9 = i8 + 1;
        if (j8 >= 0) {
            c2129au0.f20778b = j8;
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
        c2129au0.f20778b = j9;
        return i10;
    }

    static int l(Object obj, Iv0 iv0, byte[] bArr, int i8, int i9, int i10, C2129au0 c2129au0) {
        C4197tv0 c4197tv0 = (C4197tv0) iv0;
        int i11 = c2129au0.f20781e + 1;
        c2129au0.f20781e = i11;
        o(i11);
        int E7 = c4197tv0.E(obj, bArr, i8, i9, i10, c2129au0);
        c2129au0.f20781e--;
        c2129au0.f20779c = obj;
        return E7;
    }

    static int m(Object obj, Iv0 iv0, byte[] bArr, int i8, int i9, C2129au0 c2129au0) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = i(i11, bArr, i10, c2129au0);
            i11 = c2129au0.f20777a;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = c2129au0.f20781e + 1;
        c2129au0.f20781e = i13;
        o(i13);
        int i14 = i11 + i12;
        iv0.h(obj, bArr, i12, i14, c2129au0);
        c2129au0.f20781e--;
        c2129au0.f20779c = obj;
        return i14;
    }

    static long n(byte[] bArr, int i8) {
        return (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48) | ((bArr[i8 + 7] & 255) << 56);
    }

    private static void o(int i8) {
        if (i8 >= f20998a) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
