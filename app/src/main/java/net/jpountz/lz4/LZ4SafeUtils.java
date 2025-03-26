package net.jpountz.lz4;

import net.jpountz.util.SafeUtils;

/* loaded from: classes2.dex */
enum LZ4SafeUtils {
    ;

    static class Match {
        int len;
        int ref;
        int start;

        Match() {
        }

        int end() {
            return this.start + this.len;
        }

        void fix(int i8) {
            this.start += i8;
            this.ref += i8;
            this.len -= i8;
        }
    }

    static int commonBytes(byte[] bArr, int i8, int i9, int i10) {
        int i11 = 0;
        while (i9 < i10) {
            int i12 = i8 + 1;
            int i13 = i9 + 1;
            if (bArr[i8] != bArr[i9]) {
                break;
            }
            i11++;
            i8 = i12;
            i9 = i13;
        }
        return i11;
    }

    static int commonBytesBackward(byte[] bArr, int i8, int i9, int i10, int i11) {
        int i12 = 0;
        while (i8 > i10 && i9 > i11) {
            i8--;
            i9--;
            if (bArr[i8] != bArr[i9]) {
                break;
            }
            i12++;
        }
        return i12;
    }

    static void copy8Bytes(byte[] bArr, int i8, byte[] bArr2, int i9) {
        for (int i10 = 0; i10 < 8; i10++) {
            bArr2[i9 + i10] = bArr[i8 + i10];
        }
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    static int encodeSequence(byte[] bArr, int i8, int i9, int i10, int i11, byte[] bArr2, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i9 - i8;
        int i17 = i12 + 1;
        if (i17 + i16 + 8 + (i16 >>> 8) > i13) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i16 >= 15) {
            i17 = writeLen(i16 - 15, bArr2, i17);
            i14 = -16;
        } else {
            i14 = i16 << 4;
        }
        wildArraycopy(bArr, i8, bArr2, i17, i16);
        int i18 = i17 + i16;
        int i19 = i9 - i10;
        bArr2[i18] = (byte) i19;
        int i20 = i18 + 2;
        bArr2[i18 + 1] = (byte) (i19 >>> 8);
        int i21 = i11 - 4;
        if (i18 + 8 + (i21 >>> 8) > i13) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i21 >= 15) {
            i15 = i14 | 15;
            i20 = writeLen(i11 - 19, bArr2, i20);
        } else {
            i15 = i21 | i14;
        }
        bArr2[i12] = (byte) i15;
        return i20;
    }

    static int hash(byte[] bArr, int i8) {
        return LZ4Utils.hash(SafeUtils.readInt(bArr, i8));
    }

    static int hash64k(byte[] bArr, int i8) {
        return LZ4Utils.hash64k(SafeUtils.readInt(bArr, i8));
    }

    static int lastLiterals(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11) {
        int i12;
        if (i10 + i9 + 1 + ((i9 + 240) / 255) > i11) {
            throw new LZ4Exception();
        }
        if (i9 >= 15) {
            bArr2[i10] = -16;
            i12 = writeLen(i9 - 15, bArr2, i10 + 1);
        } else {
            bArr2[i10] = (byte) (i9 << 4);
            i12 = i10 + 1;
        }
        System.arraycopy(bArr, i8, bArr2, i12, i9);
        return i12 + i9;
    }

    static boolean readIntEquals(byte[] bArr, int i8, int i9) {
        return bArr[i8] == bArr[i9] && bArr[i8 + 1] == bArr[i9 + 1] && bArr[i8 + 2] == bArr[i9 + 2] && bArr[i8 + 3] == bArr[i9 + 3];
    }

    static void safeArraycopy(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        System.arraycopy(bArr, i8, bArr2, i9, i10);
    }

    static void safeIncrementalCopy(byte[] bArr, int i8, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i9 + i11] = bArr[i8 + i11];
        }
    }

    static void wildArraycopy(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 8) {
            try {
                copy8Bytes(bArr, i8 + i11, bArr2, i9 + i11);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new LZ4Exception("Malformed input at offset " + i8);
            }
        }
    }

    static void wildIncrementalCopy(byte[] bArr, int i8, int i9, int i10) {
        do {
            copy8Bytes(bArr, i8, bArr, i9);
            i8 += 8;
            i9 += 8;
        } while (i9 < i10);
    }

    static int writeLen(int i8, byte[] bArr, int i9) {
        while (i8 >= 255) {
            bArr[i9] = -1;
            i8 -= 255;
            i9++;
        }
        int i10 = i9 + 1;
        bArr[i9] = (byte) i8;
        return i10;
    }
}
