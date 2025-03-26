package S6;

import java.util.Collection;
import java.util.Iterator;
import y6.AbstractC6968G;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class q extends p {
    public static /* synthetic */ boolean A(String str, String str2, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return y(str, str2, i8, z7);
    }

    public static /* synthetic */ boolean B(String str, String str2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return h.z(str, str2, z7);
    }

    public static String o(char[] cArr) {
        J6.r.e(cArr, "<this>");
        return new String(cArr);
    }

    public static byte[] p(String str) {
        J6.r.e(str, "<this>");
        byte[] bytes = str.getBytes(d.f5130b);
        J6.r.d(bytes, "getBytes(...)");
        return bytes;
    }

    public static final boolean q(String str, String str2, boolean z7) {
        J6.r.e(str, "<this>");
        J6.r.e(str2, "suffix");
        return !z7 ? str.endsWith(str2) : h.u(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean r(String str, String str2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return q(str, str2, z7);
    }

    public static boolean s(String str, String str2, boolean z7) {
        return str == null ? str2 == null : !z7 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean t(CharSequence charSequence) {
        J6.r.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable I7 = r.I(charSequence);
            if (!(I7 instanceof Collection) || !((Collection) I7).isEmpty()) {
                Iterator it = I7.iterator();
                while (it.hasNext()) {
                    if (!a.c(charSequence.charAt(((AbstractC6968G) it).a()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean u(String str, int i8, String str2, int i9, int i10, boolean z7) {
        J6.r.e(str, "<this>");
        J6.r.e(str2, "other");
        return !z7 ? str.regionMatches(i8, str2, i9, i10) : str.regionMatches(z7, i8, str2, i9, i10);
    }

    public static String v(CharSequence charSequence, int i8) {
        J6.r.e(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i8 + '.').toString());
        }
        if (i8 == 0) {
            return "";
        }
        if (i8 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                cArr[i9] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i8);
        AbstractC6968G it = new P6.i(1, i8).iterator();
        while (it.hasNext()) {
            it.a();
            sb.append(charSequence);
        }
        String sb2 = sb.toString();
        J6.r.b(sb2);
        return sb2;
    }

    public static final String w(String str, String str2, String str3, boolean z7) {
        J6.r.e(str, "<this>");
        J6.r.e(str2, "oldValue");
        J6.r.e(str3, "newValue");
        int i8 = 0;
        int L7 = r.L(str, str2, 0, z7);
        if (L7 < 0) {
            return str;
        }
        int length = str2.length();
        int c8 = P6.m.c(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i8, L7);
            sb.append(str3);
            i8 = L7 + length;
            if (L7 >= str.length()) {
                break;
            }
            L7 = r.L(str, str2, L7 + c8, z7);
        } while (L7 > 0);
        sb.append((CharSequence) str, i8, str.length());
        String sb2 = sb.toString();
        J6.r.d(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String x(String str, String str2, String str3, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return w(str, str2, str3, z7);
    }

    public static final boolean y(String str, String str2, int i8, boolean z7) {
        J6.r.e(str, "<this>");
        J6.r.e(str2, "prefix");
        return !z7 ? str.startsWith(str2, i8) : h.u(str, i8, str2, 0, str2.length(), z7);
    }

    public static boolean z(String str, String str2, boolean z7) {
        J6.r.e(str, "<this>");
        J6.r.e(str2, "prefix");
        return !z7 ? str.startsWith(str2) : h.u(str, 0, str2, 0, str2.length(), z7);
    }
}
