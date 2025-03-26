package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.aw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2133aw0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Xv0 f20787a;

    static {
        if (Vv0.a() && Vv0.b()) {
            int i8 = Zt0.f20574a;
        }
        f20787a = new Yv0();
    }

    static /* bridge */ /* synthetic */ int c(byte[] bArr, int i8, int i9) {
        int i10 = i9 - i8;
        byte b8 = bArr[i8 - 1];
        if (i10 == 0) {
            if (b8 > -12) {
                return -1;
            }
            return b8;
        }
        if (i10 == 1) {
            return i(b8, bArr[i8]);
        }
        if (i10 == 2) {
            return j(b8, bArr[i8], bArr[i8 + 1]);
        }
        throw new AssertionError();
    }

    static int d(String str, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        char charAt;
        int length = str.length();
        int i13 = 0;
        while (true) {
            i10 = i8 + i9;
            if (i13 >= length || (i12 = i13 + i8) >= i10 || (charAt = str.charAt(i13)) >= 128) {
                break;
            }
            bArr[i12] = (byte) charAt;
            i13++;
        }
        if (i13 == length) {
            return i8 + length;
        }
        int i14 = i8 + i13;
        while (i13 < length) {
            char charAt2 = str.charAt(i13);
            if (charAt2 < 128 && i14 < i10) {
                bArr[i14] = (byte) charAt2;
                i14++;
            } else if (charAt2 < 2048 && i14 <= i10 - 2) {
                bArr[i14] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                i14 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i14 > i10 - 3) {
                    if (i14 > i10 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i11 = i13 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i11)))) {
                            throw new Zv0(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i14);
                    }
                    int i15 = i13 + 1;
                    if (i15 != str.length()) {
                        char charAt3 = str.charAt(i15);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i16 = i14 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i14 += 4;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                            i13 = i15;
                        } else {
                            i13 = i15;
                        }
                    }
                    throw new Zv0(i13 - 1, length);
                }
                bArr[i14] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i14 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i14 + 2] = (byte) ((charAt2 & '?') | 128);
                i14 += 3;
            }
            i13++;
        }
        return i14;
    }

    static int e(String str) {
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < length && str.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char charAt = str.charAt(i9);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
                i9++;
            } else {
                int length2 = str.length();
                while (i9 < length2) {
                    char charAt2 = str.charAt(i9);
                    if (charAt2 < 2048) {
                        i8 += (127 - charAt2) >>> 31;
                    } else {
                        i8 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i9) < 65536) {
                                throw new Zv0(i9, length2);
                            }
                            i9++;
                        }
                    }
                    i9++;
                }
                i10 += i8;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    static String f(ByteBuffer byteBuffer, int i8, int i9) {
        Xv0 xv0 = f20787a;
        if (byteBuffer.hasArray()) {
            return xv0.b(byteBuffer.array(), byteBuffer.arrayOffset() + i8, i9);
        }
        return byteBuffer.isDirect() ? Xv0.c(byteBuffer, i8, i9) : Xv0.c(byteBuffer, i8, i9);
    }

    static String g(byte[] bArr, int i8, int i9) {
        return f20787a.b(bArr, i8, i9);
    }

    static boolean h(byte[] bArr, int i8, int i9) {
        return f20787a.a(0, bArr, i8, i9) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i8, int i9) {
        if (i8 > -12 || i9 > -65) {
            return -1;
        }
        return i8 ^ (i9 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i8, int i9, int i10) {
        if (i8 > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i8 ^ (i9 << 8)) ^ (i10 << 16);
    }
}
