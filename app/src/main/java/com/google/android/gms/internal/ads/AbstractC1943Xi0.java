package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Xi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1943Xi0 extends AbstractC1978Yi0 {
    static /* bridge */ /* synthetic */ int a(int[] iArr, int i8, int i9, int i10) {
        while (i9 < i10) {
            if (iArr[i9] == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int b(long j8) {
        int i8 = (int) j8;
        AbstractC1762Sf0.h(((long) i8) == j8, "Out of range: %s", j8);
        return i8;
    }

    public static int c(int i8, int i9, int i10) {
        AbstractC1762Sf0.j(true, "min (%s) must be less than or equal to max (%s)", i9, 1073741823);
        int[] iArr = {i8, i9};
        int i11 = iArr[0];
        for (char c8 = 1; c8 < 2; c8 = 2) {
            int i12 = iArr[1];
            if (i12 > i11) {
                i11 = i12;
            }
        }
        int[] iArr2 = {i11, 1073741823};
        int i13 = iArr2[0];
        for (char c9 = 1; c9 < 2; c9 = 2) {
            int i14 = iArr2[1];
            if (i14 < i13) {
                i13 = i14;
            }
        }
        return i13;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        AbstractC1762Sf0.j(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int e(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer f(java.lang.String r11, int r12) {
        /*
            r11.getClass()
            boolean r12 = r11.isEmpty()
            r0 = 0
            if (r12 == 0) goto Ld
        La:
            r11 = r0
            goto L6f
        Ld:
            r12 = 0
            char r1 = r11.charAt(r12)
            r2 = 45
            if (r1 != r2) goto L17
            r12 = 1
        L17:
            int r3 = r11.length()
            if (r12 != r3) goto L1e
            goto La
        L1e:
            int r3 = r12 + 1
            char r12 = r11.charAt(r12)
            int r12 = com.google.android.gms.internal.ads.AbstractC2013Zi0.a(r12)
            if (r12 < 0) goto La
            r4 = 10
            if (r12 < r4) goto L2f
            goto La
        L2f:
            int r12 = -r12
            long r5 = (long) r12
        L31:
            int r12 = r11.length()
            r7 = -9223372036854775808
            if (r3 >= r12) goto L5e
            int r12 = r3 + 1
            char r3 = r11.charAt(r3)
            int r3 = com.google.android.gms.internal.ads.AbstractC2013Zi0.a(r3)
            if (r3 < 0) goto La
            if (r3 >= r4) goto La
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 >= 0) goto L51
            goto La
        L51:
            r9 = 10
            long r5 = r5 * r9
            long r9 = (long) r3
            long r7 = r7 + r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L5b
            goto La
        L5b:
            long r5 = r5 - r9
            r3 = r12
            goto L31
        L5e:
            if (r1 != r2) goto L65
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            goto L6f
        L65:
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L6a
            goto La
        L6a:
            long r11 = -r5
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
        L6f:
            if (r11 == 0) goto L88
            long r1 = r11.longValue()
            int r12 = r11.intValue()
            long r3 = (long) r12
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L7f
            goto L88
        L7f:
            int r11 = r11.intValue()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1943Xi0.f(java.lang.String, int):java.lang.Integer");
    }

    public static List g(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.emptyList() : new C1908Wi0(iArr, 0, length);
    }

    public static int[] h(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            Object obj = array[i8];
            obj.getClass();
            iArr[i8] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
