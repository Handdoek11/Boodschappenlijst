package N5;

/* loaded from: classes2.dex */
public abstract class w {
    public static final h a(String str) {
        J6.r.e(str, "<this>");
        return new h(str);
    }

    private static final char b(char c8) {
        return ('A' > c8 || c8 >= '[') ? (c8 < 0 || c8 >= 128) ? Character.toLowerCase(c8) : c8 : (char) (c8 + ' ');
    }

    public static final String c(String str) {
        J6.r.e(str, "<this>");
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            char charAt = str.charAt(i8);
            if (b(charAt) != charAt) {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i8);
        int J7 = S6.h.J(str);
        if (i8 <= J7) {
            while (true) {
                sb.append(b(str.charAt(i8)));
                if (i8 == J7) {
                    break;
                }
                i8++;
            }
        }
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
