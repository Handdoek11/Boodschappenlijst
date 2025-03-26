package z;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6994c {
    public static final int b(int[] iArr, int i8) {
        int length = iArr.length - 1;
        int i9 = 0;
        while (i9 <= length) {
            int i10 = (i9 + length) >>> 1;
            int i11 = iArr[i10];
            if (i8 > i11) {
                i9 = i10 + 1;
            } else {
                if (i8 >= i11) {
                    return i10;
                }
                length = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(long j8) {
        int i8;
        if ((4294967295L & j8) == 0) {
            i8 = 32;
            j8 >>= 32;
        } else {
            i8 = 0;
        }
        if ((65535 & j8) == 0) {
            i8 += 16;
            j8 >>= 16;
        }
        if ((255 & j8) == 0) {
            i8 += 8;
            j8 >>= 8;
        }
        if ((15 & j8) == 0) {
            i8 += 4;
            j8 >>= 4;
        }
        if ((1 & j8) != 0) {
            return i8;
        }
        if ((2 & j8) != 0) {
            return i8 + 1;
        }
        if ((4 & j8) != 0) {
            return i8 + 2;
        }
        if ((j8 & 8) != 0) {
            return i8 + 3;
        }
        return -1;
    }
}
