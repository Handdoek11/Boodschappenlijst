package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.android.gms.internal.ads.Ki0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1489Ki0 {
    static {
        new C1418Ii0();
    }

    public static InputStream a(InputStream inputStream, long j8) {
        return new C1454Ji0(inputStream, j8);
    }

    public static byte[] b(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i8 = 0;
        while (i8 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i8);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i9 = 0;
            while (i9 < min2) {
                int read = inputStream.read(bArr, i9, min2 - i9);
                if (read == -1) {
                    return c(arrayDeque, i8);
                }
                i9 += read;
                i8 += read;
            }
            min = AbstractC1943Xi0.e(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] c(Queue queue, int i8) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i8) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i8);
        int i9 = i8 - length;
        while (i9 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i9, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i8 - i9, min);
            i9 -= min;
        }
        return copyOf;
    }
}
