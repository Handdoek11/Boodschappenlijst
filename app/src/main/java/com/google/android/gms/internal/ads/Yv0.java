package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class Yv0 extends Xv0 {
    Yv0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.Xv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int a(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Yv0.a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.Xv0
    final String b(byte[] bArr, int i8, int i9) {
        int i10;
        int length = bArr.length;
        if ((((length - i8) - i9) | i8 | i9) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i11 = i8 + i9;
        char[] cArr = new char[i9];
        int i12 = 0;
        while (i8 < i11) {
            byte b8 = bArr[i8];
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
            byte b9 = bArr[i8];
            if (Wv0.d(b9)) {
                cArr[i13] = (char) b9;
                i13++;
                i8 = i14;
                while (i8 < i11) {
                    byte b10 = bArr[i8];
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
                    Wv0.c(b9, bArr[i14], cArr, i13);
                } else if (Wv0.e(b9)) {
                    if (i14 >= i11 - 1) {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                    i10 = i13 + 1;
                    int i15 = i8 + 2;
                    i8 += 3;
                    Wv0.b(b9, bArr[i14], bArr[i15], cArr, i13);
                } else {
                    if (i14 >= i11 - 2) {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                    byte b11 = bArr[i14];
                    int i16 = i8 + 3;
                    byte b12 = bArr[i8 + 2];
                    i8 += 4;
                    Wv0.a(b9, b11, b12, bArr[i16], cArr, i13);
                    i13 += 2;
                }
                i13 = i10;
            }
        }
        return new String(cArr, 0, i13);
    }
}
