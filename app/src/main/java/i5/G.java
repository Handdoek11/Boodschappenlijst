package I5;

import io.ktor.http.URLParserException;
import java.util.List;
import x6.C6916E;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private static final List f3171a = AbstractC6987o.b("");

    static final class a extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ D f3172o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D d8) {
            super(2);
            this.f3172o = d8;
        }

        public final void b(String str, List list) {
            J6.r.e(str, "key");
            J6.r.e(list, "values");
            this.f3172o.e().f(str, list);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (List) obj2);
            return C6916E.f44463a;
        }
    }

    private static final int a(String str, int i8, int i9, char c8) {
        int i10 = 0;
        while (true) {
            int i11 = i8 + i10;
            if (i11 >= i9 || str.charAt(i11) != c8) {
                break;
            }
            i10++;
        }
        return i10;
    }

    private static final void b(D d8, String str, int i8, int i9) {
        Integer valueOf = Integer.valueOf(e(str, i8, i9));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : i9;
        String substring = str.substring(i8, intValue);
        J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        d8.w(substring);
        int i10 = intValue + 1;
        if (i10 >= i9) {
            d8.x(0);
            return;
        }
        String substring2 = str.substring(i10, i9);
        J6.r.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        d8.x(Integer.parseInt(substring2));
    }

    private static final int c(String str, int i8, int i9) {
        int i10;
        int i11;
        char charAt = str.charAt(i8);
        if (('a' > charAt || charAt >= '{') && ('A' > charAt || charAt >= '[')) {
            i10 = i8;
            i11 = i10;
        } else {
            i10 = i8;
            i11 = -1;
        }
        while (i10 < i9) {
            char charAt2 = str.charAt(i10);
            if (charAt2 == ':') {
                if (i11 == -1) {
                    return i10 - i8;
                }
                throw new IllegalArgumentException("Illegal character in scheme at position " + i11);
            }
            if (charAt2 == '/' || charAt2 == '?' || charAt2 == '#') {
                break;
            }
            if (i11 == -1 && (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')))) {
                i11 = i10;
            }
            i10++;
        }
        return -1;
    }

    public static final List d() {
        return f3171a;
    }

    private static final int e(String str, int i8, int i9) {
        boolean z7 = false;
        while (i8 < i9) {
            char charAt = str.charAt(i8);
            if (charAt == '[') {
                z7 = true;
            } else if (charAt == ']') {
                z7 = false;
            } else if (charAt == ':' && !z7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private static final void f(D d8, String str, int i8, int i9, int i10) {
        if (i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException("Invalid file url: " + str);
            }
            d8.w("");
            StringBuilder sb = new StringBuilder();
            sb.append('/');
            String substring = str.substring(i8, i9);
            J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            F.i(d8, sb.toString());
            return;
        }
        int O7 = S6.h.O(str, '/', i8, false, 4, null);
        if (O7 == -1 || O7 == i9) {
            String substring2 = str.substring(i8, i9);
            J6.r.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            d8.w(substring2);
        } else {
            String substring3 = str.substring(i8, O7);
            J6.r.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            d8.w(substring3);
            String substring4 = str.substring(O7, i9);
            J6.r.d(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            F.i(d8, substring4);
        }
    }

    private static final void g(D d8, String str, int i8, int i9) {
        if (i8 >= i9 || str.charAt(i8) != '#') {
            return;
        }
        String substring = str.substring(i8 + 1, i9);
        J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        d8.r(substring);
    }

    private static final void h(D d8, String str, int i8, int i9) {
        int P7 = S6.h.P(str, "@", i8, false, 4, null);
        if (P7 == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String substring = str.substring(i8, P7);
        J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        d8.A(AbstractC0627a.i(substring, 0, 0, null, 7, null));
        String substring2 = str.substring(P7 + 1, i9);
        J6.r.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        d8.w(substring2);
    }

    private static final int i(D d8, String str, int i8, int i9) {
        int i10 = i8 + 1;
        if (i10 == i9) {
            d8.z(true);
            return i9;
        }
        Integer valueOf = Integer.valueOf(S6.h.O(str, '#', i10, false, 4, null));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i9 = valueOf.intValue();
        }
        String substring = str.substring(i10, i9);
        J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        C.d(substring, 0, 0, false, 6, null).f(new a(d8));
        return i9;
    }

    public static final D j(D d8, String str) {
        J6.r.e(d8, "<this>");
        J6.r.e(str, "urlString");
        if (S6.h.t(str)) {
            return d8;
        }
        try {
            return k(d8, str);
        } catch (Throwable th) {
            throw new URLParserException(str, th);
        }
    }

    public static final D k(D d8, String str) {
        int i8;
        int i9;
        J6.r.e(d8, "<this>");
        J6.r.e(str, "urlString");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!S6.a.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (!S6.a.c(str.charAt(length2))) {
                    i8 = length2;
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length2 = i11;
            }
            i8 = -1;
        } else {
            i8 = -1;
        }
        int i12 = i8 + 1;
        int c8 = c(str, i10, i12);
        if (c8 > 0) {
            String substring = str.substring(i10, i10 + c8);
            J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            d8.y(H.f3173c.a(substring));
            i10 += c8 + 1;
        }
        int a8 = a(str, i10, i12, '/');
        int i13 = i10 + a8;
        if (J6.r.a(d8.o().d(), "file")) {
            f(d8, str, i13, i12, a8);
            return d8;
        }
        if (J6.r.a(d8.o().d(), "mailto")) {
            if (a8 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            h(d8, str, i13, i12);
            return d8;
        }
        if (a8 >= 2) {
            int i14 = i13;
            while (true) {
                i9 = i14;
                Integer valueOf = Integer.valueOf(S6.h.R(str, N5.i.b("@/\\?#"), i14, false, 4, null));
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                i13 = valueOf != null ? valueOf.intValue() : i12;
                if (i13 >= i12 || str.charAt(i13) != '@') {
                    break;
                }
                int e8 = e(str, i9, i13);
                if (e8 != -1) {
                    String substring2 = str.substring(i9, e8);
                    J6.r.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    d8.v(substring2);
                    String substring3 = str.substring(e8 + 1, i13);
                    J6.r.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    d8.t(substring3);
                } else {
                    String substring4 = str.substring(i9, i13);
                    J6.r.d(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    d8.v(substring4);
                }
                i14 = i13 + 1;
            }
            b(d8, str, i9, i13);
        }
        int i15 = i13;
        if (i15 >= i12) {
            d8.u(str.charAt(i8) == '/' ? f3171a : AbstractC6987o.e());
            return d8;
        }
        d8.u(a8 == 0 ? AbstractC6987o.v(d8.g(), 1) : AbstractC6987o.e());
        Integer valueOf2 = Integer.valueOf(S6.h.R(str, N5.i.b("?#"), i15, false, 4, null));
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        int intValue = num != null ? num.intValue() : i12;
        if (intValue > i15) {
            String substring5 = str.substring(i15, intValue);
            J6.r.d(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
            d8.u(AbstractC6987o.N((d8.g().size() == 1 && ((CharSequence) AbstractC6987o.B(d8.g())).length() == 0) ? AbstractC6987o.e() : d8.g(), AbstractC6987o.N(a8 == 1 ? f3171a : AbstractC6987o.e(), J6.r.a(substring5, "/") ? f3171a : S6.h.k0(substring5, new char[]{'/'}, false, 0, 6, null))));
            i15 = intValue;
        }
        if (i15 < i12 && str.charAt(i15) == '?') {
            i15 = i(d8, str, i15, i12);
        }
        g(d8, str, i15, i12);
        return d8;
    }
}
