package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4710yf0 {
    public static String a(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            if (e(str.charAt(i8))) {
                char[] charArray = str.toCharArray();
                while (i8 < length) {
                    char c8 = charArray[i8];
                    if (e(c8)) {
                        charArray[i8] = (char) (c8 ^ ' ');
                    }
                    i8++;
                }
                return String.valueOf(charArray);
            }
            i8++;
        }
        return str;
    }

    public static String b(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            if (d(str.charAt(i8))) {
                char[] charArray = str.toCharArray();
                while (i8 < length) {
                    char c8 = charArray[i8];
                    if (d(c8)) {
                        charArray[i8] = (char) (c8 ^ ' ');
                    }
                    i8++;
                }
                return String.valueOf(charArray);
            }
            i8++;
        }
        return str;
    }

    public static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        int f8;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = charSequence.charAt(i8);
            char charAt2 = charSequence2.charAt(i8);
            if (charAt != charAt2 && ((f8 = f(charAt)) >= 26 || f8 != f(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(char c8) {
        return c8 >= 'a' && c8 <= 'z';
    }

    public static boolean e(char c8) {
        return c8 >= 'A' && c8 <= 'Z';
    }

    private static int f(char c8) {
        return (char) ((c8 | ' ') - 97);
    }
}
