package Y5;

import x6.C6914C;

/* loaded from: classes2.dex */
public abstract class b {
    public static final short a(int i8) {
        return f(i8);
    }

    public static final short b(int i8) {
        return e(i8);
    }

    public static int d(short s8, short s9) {
        return c(((s8 & 65535) << 16) | (s9 & 65535));
    }

    public static final short e(int i8) {
        return C6914C.c((short) (i8 & 65535));
    }

    public static final short f(int i8) {
        return C6914C.c((short) (i8 >>> 16));
    }

    public static int c(int i8) {
        return i8;
    }
}
