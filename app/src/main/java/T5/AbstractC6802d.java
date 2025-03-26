package t5;

import java.util.Comparator;

/* renamed from: t5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6802d {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f43901a = new Comparator() { // from class: t5.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC6802d.c((String) obj, (String) obj2);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final String f43902b = String.valueOf('0');

    /* renamed from: c, reason: collision with root package name */
    public static final String f43903c = String.valueOf('o');

    /* renamed from: t5.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f43904a;

        /* renamed from: b, reason: collision with root package name */
        private final String f43905b;

        public a(String str, String str2) {
            this.f43904a = str;
            this.f43905b = str2;
        }

        public boolean a(String str) {
            return AbstractC6802d.b(this.f43904a, str, this.f43905b);
        }

        public String b() {
            return this.f43904a;
        }

        public String c() {
            return this.f43905b;
        }

        public boolean d() {
            return AbstractC6802d.c(this.f43904a, this.f43905b) >= 0;
        }

        public String e() {
            return AbstractC6802d.e(this.f43904a, this.f43905b);
        }
    }

    private static String a(String str, String str2) {
        boolean z7 = true;
        int max = Math.max(str.length(), str2.length()) - 1;
        StringBuilder sb = null;
        int i8 = 0;
        while (max >= 0) {
            int charAt = i8 + (max < str.length() ? str.charAt(max) - '0' : 0) + (max < str2.length() ? str2.charAt(max) - '0' : 0);
            int i9 = charAt >> 6;
            int i10 = charAt & 63;
            if (!z7) {
                sb.setCharAt(max, (char) (i10 + 48));
            } else if (i10 != 0) {
                int i11 = max + 1;
                StringBuilder sb2 = new StringBuilder(i11);
                sb2.setLength(i11);
                sb2.setCharAt(max, (char) (i10 + 48));
                sb = sb2;
                z7 = false;
            }
            max--;
            i8 = i9;
        }
        return sb == null ? f43902b : sb.toString();
    }

    public static boolean b(String str, String str2, String str3) {
        return c(str, str2) < 0 && c(str2, str3) < 0;
    }

    public static int c(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        boolean isEmpty = str.isEmpty();
        return isEmpty != str2.isEmpty() ? isEmpty ? 1 : -1 : str.compareTo(str2);
    }

    private static String d(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        int i8 = 0;
        int i9 = 0;
        while (i8 < str.length()) {
            int charAt = str.charAt(i8) - '0';
            int i10 = i9 + (charAt >> 1);
            int i11 = (charAt & 1) == 0 ? 0 : 32;
            sb.append((char) (i10 + 48));
            i8++;
            i9 = i11;
        }
        if (i9 > 0) {
            sb.append((char) (i9 + 48));
        }
        return sb.toString();
    }

    public static String e(String str, String str2) {
        if (str == null || str.isEmpty()) {
            str = f43902b;
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = f43903c;
        }
        int c8 = c(str, str2);
        if (c8 == 0) {
            return str;
        }
        if (c8 > 0) {
            String str3 = str2;
            str2 = str;
            str = str3;
        }
        return a(str, d(f(str2, str)));
    }

    private static String f(String str, String str2) {
        int i8;
        boolean z7 = true;
        int max = Math.max(str.length(), str2.length()) - 1;
        StringBuilder sb = null;
        int i9 = 0;
        while (max >= 0) {
            int charAt = (i9 + (max < str.length() ? str.charAt(max) - '0' : 0)) - (max < str2.length() ? str2.charAt(max) - '0' : 0);
            if (charAt < 0) {
                charAt += 64;
                i8 = -1;
            } else {
                i8 = 0;
            }
            if (!z7) {
                sb.setCharAt(max, (char) (charAt + 48));
            } else if (charAt != 0) {
                int i10 = max + 1;
                StringBuilder sb2 = new StringBuilder(i10);
                sb2.setLength(i10);
                sb2.setCharAt(max, (char) (charAt + 48));
                sb = sb2;
                z7 = false;
            }
            max--;
            i9 = i8;
        }
        return sb == null ? f43902b : sb.toString();
    }
}
