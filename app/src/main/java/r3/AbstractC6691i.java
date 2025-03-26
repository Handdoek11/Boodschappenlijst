package r3;

/* renamed from: r3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6691i {
    static int a(int i8, int i9) {
        if (i9 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i10 = i8 + (i8 >> 1) + 1;
        if (i10 < i9) {
            int highestOneBit = Integer.highestOneBit(i9 - 1);
            i10 = highestOneBit + highestOneBit;
        }
        if (i10 < 0) {
            return Integer.MAX_VALUE;
        }
        return i10;
    }
}
