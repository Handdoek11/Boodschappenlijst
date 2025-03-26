package S6;

import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class z {
    public static final String a(char c8) {
        String valueOf = String.valueOf(c8);
        J6.r.c(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        J6.r.d(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c8));
        }
        if (c8 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        J6.r.c(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        J6.r.d(substring, "substring(...)");
        J6.r.c(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        J6.r.d(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }
}
