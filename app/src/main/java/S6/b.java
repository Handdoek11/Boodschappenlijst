package S6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b {
    public static int a(int i8) {
        if (new P6.i(2, 36).q(i8)) {
            return i8;
        }
        throw new IllegalArgumentException("radix " + i8 + " was not in valid range " + new P6.i(2, 36));
    }

    public static final int b(char c8, int i8) {
        return Character.digit((int) c8, i8);
    }

    public static boolean c(char c8) {
        return Character.isWhitespace(c8) || Character.isSpaceChar(c8);
    }
}
