package m7;

/* renamed from: m7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6239m {
    public static /* synthetic */ String a(long j8, int i8) {
        if (j8 == 0) {
            return "0";
        }
        if (j8 > 0) {
            return Long.toString(j8, i8);
        }
        if (i8 < 2 || i8 > 36) {
            i8 = 10;
        }
        int i9 = 64;
        char[] cArr = new char[64];
        int i10 = i8 - 1;
        if ((i8 & i10) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i8);
            do {
                i9--;
                cArr[i9] = Character.forDigit(((int) j8) & i10, i8);
                j8 >>>= numberOfTrailingZeros;
            } while (j8 != 0);
        } else {
            long a8 = (i8 & 1) == 0 ? (j8 >>> 1) / (i8 >>> 1) : S6.v.a(j8, i8);
            long j9 = i8;
            cArr[63] = Character.forDigit((int) (j8 - (a8 * j9)), i8);
            i9 = 63;
            while (a8 > 0) {
                i9--;
                cArr[i9] = Character.forDigit((int) (a8 % j9), i8);
                a8 /= j9;
            }
        }
        return new String(cArr, i9, 64 - i9);
    }
}
