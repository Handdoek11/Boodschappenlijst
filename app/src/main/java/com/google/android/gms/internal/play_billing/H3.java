package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
abstract class H3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29764a = 0;

    static {
        if (E3.C() && E3.D()) {
            int i8 = AbstractC5098d2.f29889a;
        }
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i8, int i9) {
        int i10 = i9 - i8;
        byte b8 = bArr[i8 - 1];
        if (i10 == 0) {
            if (b8 <= -12) {
                return b8;
            }
            return -1;
        }
        if (i10 == 1) {
            byte b9 = bArr[i8];
            if (b8 > -12 || b9 > -65) {
                return -1;
            }
            return (b9 << 8) ^ b8;
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        byte b10 = bArr[i8];
        byte b11 = bArr[i8 + 1];
        if (b8 > -12 || b10 > -65 || b11 > -65) {
            return -1;
        }
        return (b11 << 16) ^ ((b10 << 8) ^ b8);
    }

    static int b(String str, byte[] bArr, int i8, int i9) {
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
                            throw new G3(i13, length);
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
                    throw new G3(i13 - 1, length);
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

    static int c(String str) {
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
                                throw new G3(i9, length2);
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean d(byte[] r6, int r7, int r8) {
        /*
        L0:
            if (r7 >= r8) goto L9
            r0 = r6[r7]
            if (r0 < 0) goto L9
            int r7 = r7 + 1
            goto L0
        L9:
            if (r7 < r8) goto Ld
            goto L7a
        Ld:
            if (r7 >= r8) goto L7a
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r8) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto Ld
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r8 + (-1)
            if (r0 < r4) goto L36
            int r1 = a(r6, r0, r8)
            goto L57
        L36:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto Ld
            goto L76
        L4f:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5a
            int r1 = a(r6, r0, r8)
        L57:
            if (r1 == 0) goto L7a
            goto L76
        L5a:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L76
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L76
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 > r3) goto L76
            goto Ld
        L76:
            r6 = 0
            return r6
        L78:
            r7 = r0
            goto Ld
        L7a:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.H3.d(byte[], int, int):boolean");
    }
}
