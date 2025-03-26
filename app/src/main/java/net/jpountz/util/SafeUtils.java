package net.jpountz.util;

import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public enum SafeUtils {
    ;

    public static void checkLength(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
    }

    public static void checkRange(byte[] bArr, int i8) {
        if (i8 < 0 || i8 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i8);
        }
    }

    public static byte readByte(byte[] bArr, int i8) {
        return bArr[i8];
    }

    public static int readInt(byte[] bArr, int i8) {
        return Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN ? readIntBE(bArr, i8) : readIntLE(bArr, i8);
    }

    public static int readIntBE(byte[] bArr, int i8) {
        return (bArr[i8 + 3] & 255) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
    }

    public static int readIntLE(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    public static long readLongLE(byte[] bArr, int i8) {
        return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    public static int readShort(short[] sArr, int i8) {
        return sArr[i8] & 65535;
    }

    public static int readShortLE(byte[] bArr, int i8) {
        return ((bArr[i8 + 1] & 255) << 8) | (bArr[i8] & 255);
    }

    public static void writeByte(byte[] bArr, int i8, int i9) {
        bArr[i8] = (byte) i9;
    }

    public static void writeInt(int[] iArr, int i8, int i9) {
        iArr[i8] = i9;
    }

    public static void writeShort(short[] sArr, int i8, int i9) {
        sArr[i8] = (short) i9;
    }

    public static void writeShortLE(byte[] bArr, int i8, int i9) {
        bArr[i8] = (byte) i9;
        bArr[i8 + 1] = (byte) (i9 >>> 8);
    }

    public static void checkRange(byte[] bArr, int i8, int i9) {
        checkLength(i9);
        if (i9 > 0) {
            checkRange(bArr, i8);
            checkRange(bArr, (i8 + i9) - 1);
        }
    }

    public static int readInt(int[] iArr, int i8) {
        return iArr[i8];
    }
}
