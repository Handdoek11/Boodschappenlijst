package S6;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class t extends s {
    public static char A0(CharSequence charSequence) {
        J6.r.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(h.J(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char B0(CharSequence charSequence) {
        J6.r.e(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String C0(String str, int i8) {
        J6.r.e(str, "<this>");
        if (i8 >= 0) {
            String substring = str.substring(0, P6.m.e(i8, str.length()));
            J6.r.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static String y0(String str, int i8) {
        J6.r.e(str, "<this>");
        if (i8 >= 0) {
            String substring = str.substring(P6.m.e(i8, str.length()));
            J6.r.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static char z0(CharSequence charSequence) {
        J6.r.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
