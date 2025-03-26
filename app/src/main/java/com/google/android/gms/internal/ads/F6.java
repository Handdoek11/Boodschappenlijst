package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class F6 {
    public static long a(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 16);
    }

    public static long b(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 12);
    }

    static Pair c(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair f8 = f(randomAccessFile, 0);
        return f8 != null ? f8 : f(randomAccessFile, 65535);
    }

    public static void d(ByteBuffer byteBuffer, long j8) {
        g(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j8 >= 0 && j8 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j8);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j8);
    }

    private static long e(ByteBuffer byteBuffer, int i8) {
        return byteBuffer.getInt(i8) & 4294967295L;
    }

    private static Pair f(RandomAccessFile randomAccessFile, int i8) {
        int i9;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i8, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        g(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 < 22) {
            i9 = -1;
        } else {
            int i10 = capacity2 - 22;
            int min = Math.min(i10, 65535);
            for (int i11 = 0; i11 < min; i11++) {
                i9 = i10 - i11;
                if (allocate.getInt(i9) == 101010256 && ((char) allocate.getShort(i9 + 20)) == i11) {
                    break;
                }
            }
            i9 = -1;
        }
        if (i9 == -1) {
            return null;
        }
        allocate.position(i9);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i9));
    }

    private static void g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
