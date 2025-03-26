package net.jpountz.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes2.dex */
public enum ByteBufferUtils {
    ;

    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void checkNotReadOnly(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
    }

    public static void checkRange(ByteBuffer byteBuffer, int i8, int i9) {
        SafeUtils.checkLength(i9);
        if (i9 > 0) {
            checkRange(byteBuffer, i8);
            checkRange(byteBuffer, (i8 + i9) - 1);
        }
    }

    public static ByteBuffer inLittleEndianOrder(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        return order.equals(byteOrder) ? byteBuffer : byteBuffer.duplicate().order(byteOrder);
    }

    public static ByteBuffer inNativeByteOrder(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = Utils.NATIVE_BYTE_ORDER;
        return order.equals(byteOrder) ? byteBuffer : byteBuffer.duplicate().order(byteOrder);
    }

    public static byte readByte(ByteBuffer byteBuffer, int i8) {
        return byteBuffer.get(i8);
    }

    public static int readInt(ByteBuffer byteBuffer, int i8) {
        return byteBuffer.getInt(i8);
    }

    public static int readIntLE(ByteBuffer byteBuffer, int i8) {
        return byteBuffer.getInt(i8);
    }

    public static long readLong(ByteBuffer byteBuffer, int i8) {
        return byteBuffer.getLong(i8);
    }

    public static long readLongLE(ByteBuffer byteBuffer, int i8) {
        return byteBuffer.getLong(i8);
    }

    public static int readShortLE(ByteBuffer byteBuffer, int i8) {
        return ((byteBuffer.get(i8 + 1) & 255) << 8) | (byteBuffer.get(i8) & 255);
    }

    public static void writeByte(ByteBuffer byteBuffer, int i8, int i9) {
        byteBuffer.put(i8, (byte) i9);
    }

    public static void writeInt(ByteBuffer byteBuffer, int i8, int i9) {
        byteBuffer.putInt(i8, i9);
    }

    public static void writeLong(ByteBuffer byteBuffer, int i8, long j8) {
        byteBuffer.putLong(i8, j8);
    }

    public static void writeShortLE(ByteBuffer byteBuffer, int i8, int i9) {
        byteBuffer.put(i8, (byte) i9);
        byteBuffer.put(i8 + 1, (byte) (i9 >>> 8));
    }

    public static void checkRange(ByteBuffer byteBuffer, int i8) {
        if (i8 < 0 || i8 >= byteBuffer.capacity()) {
            throw new ArrayIndexOutOfBoundsException(i8);
        }
    }
}
