package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.Qi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1698Qi0 {
    public static int a(int i8, int i9) {
        long j8 = i8 + i9;
        int i10 = (int) j8;
        if (j8 == i10) {
            return i10;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i8 + ", " + i9 + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (((r0 & 1) & (r7 != java.math.RoundingMode.HALF_EVEN ? 0 : 1)) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r1 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r5 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r5 < 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(int r5, int r6, java.math.RoundingMode r7) {
        /*
            r7.getClass()
            if (r6 == 0) goto L4f
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            goto L4e
        Le:
            r5 = r5 ^ r6
            int[] r2 = com.google.android.gms.internal.ads.AbstractC1663Pi0.f18251a
            int r3 = r7.ordinal()
            r2 = r2[r3]
            int r5 = r5 >> 31
            r3 = 1
            r5 = r5 | r3
            r4 = 0
            switch(r2) {
                case 1: goto L4b;
                case 2: goto L4e;
                case 3: goto L47;
                case 4: goto L49;
                case 5: goto L44;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L41
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L49
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3a
            goto L3b
        L3a:
            r3 = r4
        L3b:
            r6 = r0 & 1
            r6 = r6 & r3
            if (r6 == 0) goto L4e
            goto L49
        L41:
            if (r1 <= 0) goto L4e
            goto L49
        L44:
            if (r5 <= 0) goto L4e
            goto L49
        L47:
            if (r5 >= 0) goto L4e
        L49:
            int r0 = r0 + r5
            return r0
        L4b:
            com.google.android.gms.internal.ads.AbstractC1803Ti0.b(r4)
        L4e:
            return r0
        L4f:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1698Qi0.b(int, int, java.math.RoundingMode):int");
    }

    public static int c(int i8, RoundingMode roundingMode) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (AbstractC1663Pi0.f18251a[roundingMode.ordinal()]) {
            case 1:
                AbstractC1803Ti0.b(((i8 + (-1)) & i8) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i8 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i8);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i8) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i8);
    }
}
