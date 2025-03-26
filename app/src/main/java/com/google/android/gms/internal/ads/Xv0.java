package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
abstract class Xv0 {
    Xv0() {
    }

    static final String c(ByteBuffer byteBuffer, int i8, int i9) {
        int i10;
        if ((((byteBuffer.limit() - i8) - i9) | i8 | i9) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i11 = i8 + i9;
        char[] cArr = new char[i9];
        int i12 = 0;
        while (i8 < i11) {
            byte b8 = byteBuffer.get(i8);
            if (!Wv0.d(b8)) {
                break;
            }
            i8++;
            cArr[i12] = (char) b8;
            i12++;
        }
        int i13 = i12;
        while (i8 < i11) {
            int i14 = i8 + 1;
            byte b9 = byteBuffer.get(i8);
            if (Wv0.d(b9)) {
                cArr[i13] = (char) b9;
                i13++;
                i8 = i14;
                while (i8 < i11) {
                    byte b10 = byteBuffer.get(i8);
                    if (Wv0.d(b10)) {
                        i8++;
                        cArr[i13] = (char) b10;
                        i13++;
                    }
                }
            } else {
                if (Wv0.f(b9)) {
                    if (i14 >= i11) {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                    i10 = i13 + 1;
                    i8 += 2;
                    Wv0.c(b9, byteBuffer.get(i14), cArr, i13);
                } else if (Wv0.e(b9)) {
                    if (i14 >= i11 - 1) {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                    i10 = i13 + 1;
                    int i15 = i8 + 2;
                    i8 += 3;
                    Wv0.b(b9, byteBuffer.get(i14), byteBuffer.get(i15), cArr, i13);
                } else {
                    if (i14 >= i11 - 2) {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                    byte b11 = byteBuffer.get(i14);
                    int i16 = i8 + 3;
                    byte b12 = byteBuffer.get(i8 + 2);
                    i8 += 4;
                    Wv0.a(b9, b11, b12, byteBuffer.get(i16), cArr, i13);
                    i13 += 2;
                }
                i13 = i10;
            }
        }
        return new String(cArr, 0, i13);
    }

    abstract int a(int i8, byte[] bArr, int i9, int i10);

    abstract String b(byte[] bArr, int i8, int i9);
}
