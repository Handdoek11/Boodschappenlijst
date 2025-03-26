package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2551eo0 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long b8 = b(bArr, 0, 0);
        long b9 = b(bArr, 3, 2) & 67108611;
        long b10 = b(bArr, 6, 4) & 67092735;
        long b11 = b(bArr, 9, 6) & 66076671;
        long b12 = b(bArr, 12, 8) & 1048575;
        int i8 = 17;
        byte[] bArr3 = new byte[17];
        long j8 = 0;
        int i9 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            int length = bArr2.length;
            if (i9 >= length) {
                long j13 = j8 + (j9 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j10 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j11 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j12 + ((j17 >> 26) * 5);
                long j20 = j19 & 67108863;
                long j21 = j20 + 5;
                long j22 = (j9 & 67108863) + (j19 >> 26);
                long j23 = j22 + (j21 >> 26);
                long j24 = (j23 >> 26) + j14;
                long j25 = j16 + (j24 >> 26);
                long j26 = (j18 + (j25 >> 26)) - 67108864;
                long j27 = j26 >> 63;
                long j28 = ~j27;
                long j29 = (j22 & j27) | (j23 & 67108863 & j28);
                long j30 = (j14 & j27) | (j24 & 67108863 & j28);
                long j31 = (j16 & j27) | (j25 & 67108863 & j28);
                long j32 = (j18 & j27) | (j26 & j28);
                long c8 = (((j27 & j20) | (j21 & 67108863 & j28) | (j29 << 26)) & 4294967295L) + c(bArr, 16);
                long c9 = (((j29 >> 6) | (j30 << 20)) & 4294967295L) + c(bArr, 20);
                long c10 = (((j30 >> 12) | (j31 << 14)) & 4294967295L) + c(bArr, 24);
                long c11 = (((j31 >> 18) | (j32 << 8)) & 4294967295L) + c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, c8 & 4294967295L, 0);
                long j33 = c9 + (c8 >> 32);
                d(bArr4, j33 & 4294967295L, 4);
                long j34 = c10 + (j33 >> 32);
                d(bArr4, j34 & 4294967295L, 8);
                d(bArr4, (c11 + (j34 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i9);
            System.arraycopy(bArr2, i9, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i8, (byte) 0);
            }
            long j35 = b12 * 5;
            long j36 = b11 * 5;
            long j37 = b10 * 5;
            long b13 = j12 + b(bArr3, 0, 0);
            long b14 = j9 + b(bArr3, 3, 2);
            long b15 = j8 + b(bArr3, 6, 4);
            long b16 = j10 + b(bArr3, 9, 6);
            long b17 = j11 + (b(bArr3, 12, 8) | (bArr3[16] << 24));
            long j38 = b14 * b8;
            long j39 = b14 * b9;
            long j40 = b14 * b10;
            long j41 = b16 * b8;
            long j42 = b14 * b11;
            long j43 = b17 * b8;
            long j44 = (b13 * b8) + (b14 * j35) + (b15 * j36) + (b16 * j37) + (b9 * 5 * b17);
            long j45 = (b13 * b9) + j38 + (b15 * j35) + (b16 * j36) + (j37 * b17) + (j44 >> 26);
            long j46 = (b13 * b10) + j39 + (b15 * b8) + (b16 * j35) + (j36 * b17) + (j45 >> 26);
            long j47 = (b13 * b11) + j40 + (b15 * b9) + j41 + (b17 * j35) + (j46 >> 26);
            long j48 = (b13 * b12) + j42 + (b15 * b10) + (b16 * b9) + j43 + (j47 >> 26);
            long j49 = (j44 & 67108863) + ((j48 >> 26) * 5);
            j9 = (j45 & 67108863) + (j49 >> 26);
            i9 += 16;
            j8 = j46 & 67108863;
            j10 = j47 & 67108863;
            j11 = j48 & 67108863;
            i8 = 17;
            j12 = j49 & 67108863;
        }
    }

    private static long b(byte[] bArr, int i8, int i9) {
        return (c(bArr, i8) >> i9) & 67108863;
    }

    private static long c(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return (((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16)) & 4294967295L;
    }

    private static void d(byte[] bArr, long j8, int i8) {
        for (int i9 = 0; i9 < 4; i9++) {
            bArr[i8 + i9] = (byte) (255 & j8);
            j8 >>= 8;
        }
    }
}
