package net.jpountz.util;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public enum UnsafeUtils {
    ;

    private static final long BYTE_ARRAY_OFFSET;
    private static final int BYTE_ARRAY_SCALE;
    private static final long INT_ARRAY_OFFSET;
    private static final int INT_ARRAY_SCALE;
    private static final long SHORT_ARRAY_OFFSET;
    private static final int SHORT_ARRAY_SCALE;
    private static final Unsafe UNSAFE;

    static {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Unsafe unsafe = (Unsafe) declaredField.get(null);
            UNSAFE = unsafe;
            BYTE_ARRAY_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            BYTE_ARRAY_SCALE = unsafe.arrayIndexScale(byte[].class);
            INT_ARRAY_OFFSET = unsafe.arrayBaseOffset(int[].class);
            INT_ARRAY_SCALE = unsafe.arrayIndexScale(int[].class);
            SHORT_ARRAY_OFFSET = unsafe.arrayBaseOffset(short[].class);
            SHORT_ARRAY_SCALE = unsafe.arrayIndexScale(short[].class);
        } catch (IllegalAccessException unused) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (NoSuchFieldException unused2) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (SecurityException unused3) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        }
    }

    public static void checkLength(int i8) {
        SafeUtils.checkLength(i8);
    }

    public static void checkRange(byte[] bArr, int i8) {
        SafeUtils.checkRange(bArr, i8);
    }

    public static byte readByte(byte[] bArr, int i8) {
        return UNSAFE.getByte(bArr, BYTE_ARRAY_OFFSET + (BYTE_ARRAY_SCALE * i8));
    }

    public static int readInt(byte[] bArr, int i8) {
        return UNSAFE.getInt(bArr, BYTE_ARRAY_OFFSET + i8);
    }

    public static int readIntLE(byte[] bArr, int i8) {
        int readInt = readInt(bArr, i8);
        return Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN ? Integer.reverseBytes(readInt) : readInt;
    }

    public static long readLong(byte[] bArr, int i8) {
        return UNSAFE.getLong(bArr, BYTE_ARRAY_OFFSET + i8);
    }

    public static long readLongLE(byte[] bArr, int i8) {
        long readLong = readLong(bArr, i8);
        return Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN ? Long.reverseBytes(readLong) : readLong;
    }

    public static short readShort(byte[] bArr, int i8) {
        return UNSAFE.getShort(bArr, BYTE_ARRAY_OFFSET + i8);
    }

    public static int readShortLE(byte[] bArr, int i8) {
        short readShort = readShort(bArr, i8);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            readShort = Short.reverseBytes(readShort);
        }
        return readShort & 65535;
    }

    public static void writeByte(byte[] bArr, int i8, byte b8) {
        UNSAFE.putByte(bArr, BYTE_ARRAY_OFFSET + (BYTE_ARRAY_SCALE * i8), b8);
    }

    public static void writeInt(byte[] bArr, int i8, int i9) {
        UNSAFE.putInt(bArr, BYTE_ARRAY_OFFSET + i8, i9);
    }

    public static void writeLong(byte[] bArr, int i8, long j8) {
        UNSAFE.putLong(bArr, BYTE_ARRAY_OFFSET + i8, j8);
    }

    public static void writeShort(byte[] bArr, int i8, short s8) {
        UNSAFE.putShort(bArr, BYTE_ARRAY_OFFSET + i8, s8);
    }

    public static void writeShortLE(byte[] bArr, int i8, int i9) {
        writeByte(bArr, i8, (byte) i9);
        writeByte(bArr, i8 + 1, (byte) (i9 >>> 8));
    }

    public static void checkRange(byte[] bArr, int i8, int i9) {
        SafeUtils.checkRange(bArr, i8, i9);
    }

    public static int readInt(int[] iArr, int i8) {
        return UNSAFE.getInt(iArr, INT_ARRAY_OFFSET + (INT_ARRAY_SCALE * i8));
    }

    public static int readShort(short[] sArr, int i8) {
        return UNSAFE.getShort(sArr, SHORT_ARRAY_OFFSET + (SHORT_ARRAY_SCALE * i8)) & 65535;
    }

    public static void writeByte(byte[] bArr, int i8, int i9) {
        writeByte(bArr, i8, (byte) i9);
    }

    public static void writeInt(int[] iArr, int i8, int i9) {
        UNSAFE.putInt(iArr, INT_ARRAY_OFFSET + (INT_ARRAY_SCALE * i8), i9);
    }

    public static void writeShort(short[] sArr, int i8, int i9) {
        UNSAFE.putShort(sArr, SHORT_ARRAY_OFFSET + (SHORT_ARRAY_SCALE * i8), (short) i9);
    }
}
