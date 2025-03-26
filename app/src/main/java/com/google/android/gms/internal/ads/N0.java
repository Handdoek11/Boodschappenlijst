package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class N0 {
    public static int a(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int b(ByteBuffer byteBuffer) {
        int i8;
        if ((byteBuffer.get(5) & 2) == 0) {
            i8 = 0;
        } else {
            byte b8 = byteBuffer.get(26);
            int i9 = 28;
            int i10 = 28;
            for (int i11 = 0; i11 < b8; i11++) {
                i10 += byteBuffer.get(i11 + 27);
            }
            byte b9 = byteBuffer.get(i10 + 26);
            for (int i12 = 0; i12 < b9; i12++) {
                i9 += byteBuffer.get(i10 + 27 + i12);
            }
            i8 = i10 + i9;
        }
        int i13 = byteBuffer.get(i8 + 26) + 27 + i8;
        return (int) ((g(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int c(ByteBuffer byteBuffer) {
        return (int) ((g(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long d(byte[] bArr) {
        return g(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List e(byte[] bArr) {
        long a8 = a(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(i(h(a8)));
        arrayList.add(i(h(3840L)));
        return arrayList;
    }

    public static boolean f(long j8, long j9) {
        return j8 - j9 <= h(3840L) / 1000;
    }

    private static long g(byte b8, byte b9) {
        int i8;
        int i9 = b8 & 255;
        int i10 = b8 & 3;
        if (i10 != 0) {
            i8 = 2;
            if (i10 != 1 && i10 != 2) {
                i8 = b9 & 63;
            }
        } else {
            i8 = 1;
        }
        int i11 = i9 >> 3;
        return i8 * (i11 >= 16 ? 2500 << r6 : i11 >= 12 ? 10000 << (i11 & 1) : (i11 & 3) == 3 ? 60000 : 10000 << r6);
    }

    private static long h(long j8) {
        return (j8 * 1000000000) / 48000;
    }

    private static byte[] i(long j8) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j8).array();
    }
}
