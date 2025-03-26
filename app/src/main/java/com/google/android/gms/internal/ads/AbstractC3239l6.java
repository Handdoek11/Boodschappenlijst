package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3239l6 {
    public static int a(byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] != 71) {
            i8++;
        }
        return i8;
    }

    public static long b(UQ uq, int i8, int i9) {
        uq.l(i8);
        if (uq.r() < 5) {
            return -9223372036854775807L;
        }
        int w7 = uq.w();
        if ((8388608 & w7) != 0 || ((w7 >> 8) & 8191) != i9 || (w7 & 32) == 0 || uq.C() < 7 || uq.r() < 7 || (uq.C() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        uq.h(bArr, 0, 6);
        long j8 = bArr[0];
        long j9 = bArr[1];
        long j10 = bArr[2];
        long j11 = bArr[3] & 255;
        return ((j8 & 255) << 25) | ((j9 & 255) << 17) | ((j10 & 255) << 9) | (j11 + j11) | ((bArr[4] & 255) >> 7);
    }
}
