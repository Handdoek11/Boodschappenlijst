package S6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class c extends b {
    public static final boolean d(char c8, char c9, boolean z7) {
        if (c8 == c9) {
            return true;
        }
        if (!z7) {
            return false;
        }
        char upperCase = Character.toUpperCase(c8);
        char upperCase2 = Character.toUpperCase(c9);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean e(char c8) {
        return new P6.c((char) 55296, (char) 57343).o(c8);
    }

    public static String f(char c8) {
        return z.a(c8);
    }
}
