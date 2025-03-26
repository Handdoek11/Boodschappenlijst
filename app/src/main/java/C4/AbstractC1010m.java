package c4;

/* renamed from: c4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1010m {
    static int a(int i8, double d8) {
        int max = Math.max(i8, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d8 * highestOneBit))) {
            return highestOneBit;
        }
        int i9 = highestOneBit << 1;
        if (i9 > 0) {
            return i9;
        }
        return 1073741824;
    }

    static int b(int i8) {
        return (int) (Integer.rotateLeft((int) (i8 * (-862048943)), 15) * 461845907);
    }

    static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
