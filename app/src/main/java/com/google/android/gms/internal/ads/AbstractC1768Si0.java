package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Si0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1768Si0 {
    public static long a(long j8, long j9) {
        long j10 = j8 + j9;
        if (((j8 ^ j9) < 0) || ((j8 ^ j10) >= 0)) {
            return j10;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j8 + ", " + j9 + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long b(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L55
        L10:
            long r8 = r8 ^ r10
            int[] r6 = com.google.android.gms.internal.ads.AbstractC1733Ri0.f18688a
            int r7 = r12.ordinal()
            r6 = r6[r7]
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            switch(r6) {
                case 1: goto L51;
                case 2: goto L55;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L55
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L55
            goto L4e
        L46:
            if (r9 <= 0) goto L55
            goto L4e
        L49:
            if (r8 <= 0) goto L55
            goto L4e
        L4c:
            if (r8 >= 0) goto L55
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            r8 = 0
            com.google.android.gms.internal.ads.AbstractC1803Ti0.b(r8)
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1768Si0.b(long, long, java.math.RoundingMode):long");
    }

    public static long c(long j8, long j9) {
        AbstractC1803Ti0.a("a", j8);
        AbstractC1803Ti0.a("b", j9);
        if (j8 == 0) {
            return j9;
        }
        if (j9 == 0) {
            return j8;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
        long j10 = j8 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j9);
        long j11 = j9 >> numberOfTrailingZeros2;
        while (j10 != j11) {
            long j12 = j10 - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            j10 = j14 >> Long.numberOfTrailingZeros(j14);
            j11 += j13;
        }
        return j10 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long d(long j8, long j9) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j9);
        if (numberOfLeadingZeros > 65) {
            return j8 * j9;
        }
        long j10 = ((j8 ^ j9) >>> 63) + Long.MAX_VALUE;
        if ((numberOfLeadingZeros < 64) || ((j9 == Long.MIN_VALUE) & (j8 < 0))) {
            return j10;
        }
        long j11 = j8 * j9;
        return (j8 == 0 || j11 / j8 == j9) ? j11 : j10;
    }
}
