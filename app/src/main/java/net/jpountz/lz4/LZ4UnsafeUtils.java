package net.jpountz.lz4;

import java.nio.ByteOrder;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.util.Utils;

/* loaded from: classes2.dex */
enum LZ4UnsafeUtils {
    ;

    static final /* synthetic */ boolean $assertionsDisabled = false;

    static int commonBytes(byte[] bArr, int i8, int i9, int i10) {
        int numberOfTrailingZeros;
        int i11 = 0;
        while (i9 <= i10 - 8) {
            if (UnsafeUtils.readLong(bArr, i9) != UnsafeUtils.readLong(bArr, i8)) {
                if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
                    numberOfTrailingZeros = Long.numberOfLeadingZeros(UnsafeUtils.readLong(bArr, i8) ^ UnsafeUtils.readLong(bArr, i9));
                } else {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(UnsafeUtils.readLong(bArr, i8) ^ UnsafeUtils.readLong(bArr, i9));
                }
                return i11 + (numberOfTrailingZeros >>> 3);
            }
            i11 += 8;
            i8 += 8;
            i9 += 8;
        }
        while (i9 < i10) {
            int i12 = i8 + 1;
            int i13 = i9 + 1;
            if (UnsafeUtils.readByte(bArr, i8) != UnsafeUtils.readByte(bArr, i9)) {
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
            if (UnsafeUtils.readByte(bArr, i8) != UnsafeUtils.readByte(bArr, i9)) {
                break;
            }
            i12++;
        }
        return i12;
    }

    static int encodeSequence(byte[] bArr, int i8, int i9, int i10, int i11, byte[] bArr2, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i9 - i8;
        int i17 = i12 + 1;
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

    static int lastLiterals(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11) {
        return LZ4SafeUtils.lastLiterals(bArr, i8, i9, bArr2, i10, i11);
    }

    static boolean readIntEquals(byte[] bArr, int i8, int i9) {
        return UnsafeUtils.readInt(bArr, i8) == UnsafeUtils.readInt(bArr, i9);
    }

    static int readShortLittleEndian(byte[] bArr, int i8) {
        short readShort = UnsafeUtils.readShort(bArr, i8);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            readShort = Short.reverseBytes(readShort);
        }
        return readShort & 65535;
    }

    static void safeArraycopy(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        int i11 = i10 & (-8);
        wildArraycopy(bArr, i8, bArr2, i9, i11);
        int i12 = i10 & 7;
        for (int i13 = 0; i13 < i12; i13++) {
            UnsafeUtils.writeByte(bArr2, i9 + i11 + i13, UnsafeUtils.readByte(bArr, i8 + i11 + i13));
        }
    }

    static void safeIncrementalCopy(byte[] bArr, int i8, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i9 + i11;
            int i13 = i8 + i11;
            bArr[i12] = bArr[i13];
            UnsafeUtils.writeByte(bArr, i12, UnsafeUtils.readByte(bArr, i13));
        }
    }

    static void wildArraycopy(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 8) {
            UnsafeUtils.writeLong(bArr2, i9 + i11, UnsafeUtils.readLong(bArr, i8 + i11));
        }
    }

    static void wildIncrementalCopy(byte[] bArr, int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if (i11 < 4) {
            int i12 = 0;
            for (int i13 = 0; i13 < 4; i13++) {
                UnsafeUtils.writeByte(bArr, i9 + i13, UnsafeUtils.readByte(bArr, i8 + i13));
            }
            int i14 = i9 + 4;
            int i15 = i8 + 4;
            int i16 = i14 - i15;
            if (i16 == 1) {
                i15 = i8 + 1;
            } else if (i16 == 2) {
                i15 = i8 + 2;
            } else if (i16 == 3) {
                i15 = i8 + 1;
                i12 = -1;
            } else if (i16 == 5) {
                i12 = 1;
            } else if (i16 == 6) {
                i12 = 2;
            } else if (i16 == 7) {
                i12 = 3;
            }
            UnsafeUtils.writeInt(bArr, i14, UnsafeUtils.readInt(bArr, i15));
            i9 += 8;
            i8 = i15 - i12;
        } else if (i11 < 8) {
            UnsafeUtils.writeLong(bArr, i9, UnsafeUtils.readLong(bArr, i8));
            i9 += i11;
        }
        while (i9 < i10) {
            UnsafeUtils.writeLong(bArr, i9, UnsafeUtils.readLong(bArr, i8));
            i9 += 8;
            i8 += 8;
        }
    }

    static int writeLen(int i8, byte[] bArr, int i9) {
        while (i8 >= 255) {
            UnsafeUtils.writeByte(bArr, i9, 255);
            i8 -= 255;
            i9++;
        }
        int i10 = i9 + 1;
        UnsafeUtils.writeByte(bArr, i9, i8);
        return i10;
    }

    static void writeShortLittleEndian(byte[] bArr, int i8, int i9) {
        short s8 = (short) i9;
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            s8 = Short.reverseBytes(s8);
        }
        UnsafeUtils.writeShort(bArr, i8, s8);
    }
}
