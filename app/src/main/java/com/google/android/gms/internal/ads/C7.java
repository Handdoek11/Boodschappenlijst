package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class C7 {
    public static double a(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static double b(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static int c(byte b8) {
        return b8 < 0 ? b8 + 256 : b8;
    }

    public static int d(ByteBuffer byteBuffer) {
        return (c(byteBuffer.get()) << 8) + c(byteBuffer.get());
    }

    public static long e(ByteBuffer byteBuffer) {
        long j8 = byteBuffer.getInt();
        return j8 < 0 ? j8 + 4294967296L : j8;
    }

    public static long f(ByteBuffer byteBuffer) {
        long e8 = e(byteBuffer) << 32;
        if (e8 >= 0) {
            return e8 + e(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
