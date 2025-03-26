package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class G5 extends H5 {
    G5() {
    }

    @Override // com.google.android.gms.internal.measurement.H5
    final int a(int i8, byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 >= i10) {
            return 0;
        }
        while (i9 < i10) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 < 0) {
                if (b8 < -32) {
                    if (i11 >= i10) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i9 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 >= -16) {
                    if (i11 >= i10 - 2) {
                        return F5.c(bArr, i11, i10);
                    }
                    int i12 = i9 + 2;
                    byte b9 = bArr[i11];
                    if (b9 <= -65 && (((b8 << 28) + (b9 + 112)) >> 30) == 0) {
                        int i13 = i9 + 3;
                        if (bArr[i12] <= -65) {
                            i9 += 4;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 >= i10 - 1) {
                    return F5.c(bArr, i11, i10);
                }
                int i14 = i9 + 2;
                byte b10 = bArr[i11];
                if (b10 <= -65 && ((b8 != -32 || b10 >= -96) && (b8 != -19 || b10 < -96))) {
                    i9 += 3;
                    if (bArr[i14] > -65) {
                    }
                }
                return -1;
            }
            i9 = i11;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.H5
    final int b(String str, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        char charAt;
        int length = str.length();
        int i12 = i9 + i8;
        int i13 = 0;
        while (i13 < length && (i11 = i13 + i8) < i12 && (charAt = str.charAt(i13)) < 128) {
            bArr[i11] = (byte) charAt;
            i13++;
        }
        if (i13 == length) {
            return i8 + length;
        }
        int i14 = i8 + i13;
        while (i13 < length) {
            char charAt2 = str.charAt(i13);
            if (charAt2 < 128 && i14 < i12) {
                bArr[i14] = (byte) charAt2;
                i14++;
            } else if (charAt2 < 2048 && i14 <= i12 - 2) {
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((charAt2 >>> 6) | 960);
                i14 += 2;
                bArr[i15] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i14 > i12 - 3) {
                    if (i14 > i12 - 4) {
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i10 = i13 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i10)))) {
                            throw new J5(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i14);
                    }
                    int i16 = i13 + 1;
                    if (i16 != str.length()) {
                        char charAt3 = str.charAt(i16);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i17 = i14 + 3;
                            bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i14 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                            i13 = i16;
                        } else {
                            i13 = i16;
                        }
                    }
                    throw new J5(i13 - 1, length);
                }
                bArr[i14] = (byte) ((charAt2 >>> '\f') | 480);
                int i18 = i14 + 2;
                bArr[i14 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i14 += 3;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
            }
            i13++;
        }
        return i14;
    }

    @Override // com.google.android.gms.internal.measurement.H5
    final String c(byte[] bArr, int i8, int i9) {
        if ((i8 | i9 | ((bArr.length - i8) - i9)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i10 = i8 + i9;
        char[] cArr = new char[i9];
        int i11 = 0;
        while (i8 < i10) {
            byte b8 = bArr[i8];
            if (b8 < 0) {
                break;
            }
            i8++;
            E5.d(b8, cArr, i11);
            i11++;
        }
        int i12 = i11;
        while (i8 < i10) {
            int i13 = i8 + 1;
            byte b9 = bArr[i8];
            if (b9 >= 0) {
                int i14 = i12 + 1;
                E5.d(b9, cArr, i12);
                while (i13 < i10) {
                    byte b10 = bArr[i13];
                    if (b10 < 0) {
                        break;
                    }
                    i13++;
                    E5.d(b10, cArr, i14);
                    i14++;
                }
                i12 = i14;
                i8 = i13;
            } else if (b9 < -32) {
                if (i13 >= i10) {
                    throw zzkb.c();
                }
                i8 += 2;
                E5.c(b9, bArr[i13], cArr, i12);
                i12++;
            } else if (b9 < -16) {
                if (i13 >= i10 - 1) {
                    throw zzkb.c();
                }
                int i15 = i8 + 2;
                i8 += 3;
                E5.b(b9, bArr[i13], bArr[i15], cArr, i12);
                i12++;
            } else {
                if (i13 >= i10 - 2) {
                    throw zzkb.c();
                }
                byte b11 = bArr[i13];
                int i16 = i8 + 3;
                byte b12 = bArr[i8 + 2];
                i8 += 4;
                E5.a(b9, b11, b12, bArr[i16], cArr, i12);
                i12 += 2;
            }
        }
        return new String(cArr, 0, i12);
    }
}
