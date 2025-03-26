package S6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import x6.C6933o;
import y6.AbstractC6968G;
import y6.AbstractC6980h;
import y6.AbstractC6987o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class r extends q {

    static final class a extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ char[] f5152o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f5153s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z7) {
            super(2);
            this.f5152o = cArr;
            this.f5153s = z7;
        }

        public final C6933o b(CharSequence charSequence, int i8) {
            J6.r.e(charSequence, "$this$$receiver");
            int Q7 = r.Q(charSequence, this.f5152o, i8, this.f5153s);
            if (Q7 < 0) {
                return null;
            }
            return x6.u.a(Integer.valueOf(Q7), 1);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f5154o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f5155s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z7) {
            super(2);
            this.f5154o = list;
            this.f5155s = z7;
        }

        public final C6933o b(CharSequence charSequence, int i8) {
            J6.r.e(charSequence, "$this$$receiver");
            C6933o H7 = r.H(charSequence, this.f5154o, i8, this.f5155s, false);
            if (H7 != null) {
                return x6.u.a(H7.c(), Integer.valueOf(((String) H7.d()).length()));
            }
            return null;
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class c extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ CharSequence f5156o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f5156o = charSequence;
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(P6.i iVar) {
            J6.r.e(iVar, "it");
            return r.q0(this.f5156o, iVar);
        }
    }

    public static final boolean D(CharSequence charSequence, char c8, boolean z7) {
        J6.r.e(charSequence, "<this>");
        return h.O(charSequence, c8, 0, z7, 2, null) >= 0;
    }

    public static boolean E(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (h.P(charSequence, (String) charSequence2, 0, z7, 2, null) < 0) {
                return false;
            }
        } else if (N(charSequence, charSequence2, 0, charSequence.length(), z7, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean F(CharSequence charSequence, char c8, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return D(charSequence, c8, z7);
    }

    public static /* synthetic */ boolean G(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return h.E(charSequence, charSequence2, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6933o H(CharSequence charSequence, Collection collection, int i8, boolean z7, boolean z8) {
        Object obj;
        Object obj2;
        if (!z7 && collection.size() == 1) {
            String str = (String) AbstractC6987o.R(collection);
            int P7 = !z8 ? h.P(charSequence, str, i8, false, 4, null) : h.V(charSequence, str, i8, false, 4, null);
            if (P7 < 0) {
                return null;
            }
            return x6.u.a(Integer.valueOf(P7), str);
        }
        P6.g iVar = !z8 ? new P6.i(P6.m.c(i8, 0), charSequence.length()) : P6.m.k(P6.m.e(i8, h.J(charSequence)), 0);
        if (charSequence instanceof String) {
            int e8 = iVar.e();
            int j8 = iVar.j();
            int n8 = iVar.n();
            if ((n8 > 0 && e8 <= j8) || (n8 < 0 && j8 <= e8)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (h.u(str2, 0, (String) charSequence, e8, str2.length(), z7)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (e8 == j8) {
                            break;
                        }
                        e8 += n8;
                    } else {
                        return x6.u.a(Integer.valueOf(e8), str3);
                    }
                }
            }
        } else {
            int e9 = iVar.e();
            int j9 = iVar.j();
            int n9 = iVar.n();
            if ((n9 > 0 && e9 <= j9) || (n9 < 0 && j9 <= e9)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (f0(str4, 0, charSequence, e9, str4.length(), z7)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (e9 == j9) {
                            break;
                        }
                        e9 += n9;
                    } else {
                        return x6.u.a(Integer.valueOf(e9), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final P6.i I(CharSequence charSequence) {
        J6.r.e(charSequence, "<this>");
        return new P6.i(0, charSequence.length() - 1);
    }

    public static int J(CharSequence charSequence) {
        J6.r.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int K(CharSequence charSequence, char c8, int i8, boolean z7) {
        J6.r.e(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? Q(charSequence, new char[]{c8}, i8, z7) : ((String) charSequence).indexOf(c8, i8);
    }

    public static final int L(CharSequence charSequence, String str, int i8, boolean z7) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(str, "string");
        return (z7 || !(charSequence instanceof String)) ? N(charSequence, str, i8, charSequence.length(), z7, false, 16, null) : ((String) charSequence).indexOf(str, i8);
    }

    private static final int M(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z7, boolean z8) {
        P6.g iVar = !z8 ? new P6.i(P6.m.c(i8, 0), P6.m.e(i9, charSequence.length())) : P6.m.k(P6.m.e(i8, h.J(charSequence)), P6.m.c(i9, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int e8 = iVar.e();
            int j8 = iVar.j();
            int n8 = iVar.n();
            if ((n8 <= 0 || e8 > j8) && (n8 >= 0 || j8 > e8)) {
                return -1;
            }
            while (!h.u((String) charSequence2, 0, (String) charSequence, e8, charSequence2.length(), z7)) {
                if (e8 == j8) {
                    return -1;
                }
                e8 += n8;
            }
            return e8;
        }
        int e9 = iVar.e();
        int j9 = iVar.j();
        int n9 = iVar.n();
        if ((n9 <= 0 || e9 > j9) && (n9 >= 0 || j9 > e9)) {
            return -1;
        }
        while (!f0(charSequence2, 0, charSequence, e9, charSequence2.length(), z7)) {
            if (e9 == j9) {
                return -1;
            }
            e9 += n9;
        }
        return e9;
    }

    static /* synthetic */ int N(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z7, boolean z8, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z8 = false;
        }
        return M(charSequence, charSequence2, i8, i9, z7, z8);
    }

    public static /* synthetic */ int O(CharSequence charSequence, char c8, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return K(charSequence, c8, i8, z7);
    }

    public static /* synthetic */ int P(CharSequence charSequence, String str, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return L(charSequence, str, i8, z7);
    }

    public static final int Q(CharSequence charSequence, char[] cArr, int i8, boolean z7) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(cArr, "chars");
        if (!z7 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC6980h.H(cArr), i8);
        }
        AbstractC6968G it = new P6.i(P6.m.c(i8, 0), h.J(charSequence)).iterator();
        while (it.hasNext()) {
            int a8 = it.a();
            char charAt = charSequence.charAt(a8);
            for (char c8 : cArr) {
                if (S6.c.d(c8, charAt, z7)) {
                    return a8;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int R(CharSequence charSequence, char[] cArr, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return Q(charSequence, cArr, i8, z7);
    }

    public static final int S(CharSequence charSequence, char c8, int i8, boolean z7) {
        J6.r.e(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? W(charSequence, new char[]{c8}, i8, z7) : ((String) charSequence).lastIndexOf(c8, i8);
    }

    public static final int T(CharSequence charSequence, String str, int i8, boolean z7) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(str, "string");
        return (z7 || !(charSequence instanceof String)) ? M(charSequence, str, i8, 0, z7, true) : ((String) charSequence).lastIndexOf(str, i8);
    }

    public static /* synthetic */ int U(CharSequence charSequence, char c8, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = h.J(charSequence);
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return S(charSequence, c8, i8, z7);
    }

    public static /* synthetic */ int V(CharSequence charSequence, String str, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = h.J(charSequence);
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return T(charSequence, str, i8, z7);
    }

    public static final int W(CharSequence charSequence, char[] cArr, int i8, boolean z7) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(cArr, "chars");
        if (!z7 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC6980h.H(cArr), i8);
        }
        for (int e8 = P6.m.e(i8, h.J(charSequence)); -1 < e8; e8--) {
            char charAt = charSequence.charAt(e8);
            for (char c8 : cArr) {
                if (S6.c.d(c8, charAt, z7)) {
                    return e8;
                }
            }
        }
        return -1;
    }

    public static final R6.d X(CharSequence charSequence) {
        J6.r.e(charSequence, "<this>");
        return n0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List Y(CharSequence charSequence) {
        J6.r.e(charSequence, "<this>");
        return R6.g.k(X(charSequence));
    }

    public static final CharSequence Z(CharSequence charSequence, int i8, char c8) {
        J6.r.e(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
        }
        if (i8 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i8);
        AbstractC6968G it = new P6.i(1, i8 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.a();
            sb.append(c8);
        }
        sb.append(charSequence);
        return sb;
    }

    public static String a0(String str, int i8, char c8) {
        J6.r.e(str, "<this>");
        return Z(str, i8, c8).toString();
    }

    private static final R6.d b0(CharSequence charSequence, char[] cArr, int i8, boolean z7, int i9) {
        g0(i9);
        return new e(charSequence, i8, i9, new a(cArr, z7));
    }

    private static final R6.d c0(CharSequence charSequence, String[] strArr, int i8, boolean z7, int i9) {
        g0(i9);
        return new e(charSequence, i8, i9, new b(AbstractC6980h.c(strArr), z7));
    }

    static /* synthetic */ R6.d d0(CharSequence charSequence, char[] cArr, int i8, boolean z7, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return b0(charSequence, cArr, i8, z7, i9);
    }

    static /* synthetic */ R6.d e0(CharSequence charSequence, String[] strArr, int i8, boolean z7, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return c0(charSequence, strArr, i8, z7, i9);
    }

    public static final boolean f0(CharSequence charSequence, int i8, CharSequence charSequence2, int i9, int i10, boolean z7) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(charSequence2, "other");
        if (i9 < 0 || i8 < 0 || i8 > charSequence.length() - i10 || i9 > charSequence2.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!S6.c.d(charSequence.charAt(i8 + i11), charSequence2.charAt(i9 + i11), z7)) {
                return false;
            }
        }
        return true;
    }

    public static final void g0(int i8) {
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i8).toString());
    }

    public static final List h0(CharSequence charSequence, char[] cArr, boolean z7, int i8) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(cArr, "delimiters");
        if (cArr.length == 1) {
            return j0(charSequence, String.valueOf(cArr[0]), z7, i8);
        }
        Iterable g8 = R6.g.g(d0(charSequence, cArr, 0, z7, i8, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(g8, 10));
        Iterator it = g8.iterator();
        while (it.hasNext()) {
            arrayList.add(q0(charSequence, (P6.i) it.next()));
        }
        return arrayList;
    }

    public static final List i0(CharSequence charSequence, String[] strArr, boolean z7, int i8) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return j0(charSequence, str, z7, i8);
            }
        }
        Iterable g8 = R6.g.g(e0(charSequence, strArr, 0, z7, i8, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(g8, 10));
        Iterator it = g8.iterator();
        while (it.hasNext()) {
            arrayList.add(q0(charSequence, (P6.i) it.next()));
        }
        return arrayList;
    }

    private static final List j0(CharSequence charSequence, String str, boolean z7, int i8) {
        g0(i8);
        int i9 = 0;
        int L7 = L(charSequence, str, 0, z7);
        if (L7 == -1 || i8 == 1) {
            return AbstractC6987o.b(charSequence.toString());
        }
        boolean z8 = i8 > 0;
        ArrayList arrayList = new ArrayList(z8 ? P6.m.e(i8, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i9, L7).toString());
            i9 = str.length() + L7;
            if (z8 && arrayList.size() == i8 - 1) {
                break;
            }
            L7 = L(charSequence, str, i9, z7);
        } while (L7 != -1);
        arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List k0(CharSequence charSequence, char[] cArr, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return h0(charSequence, cArr, z7, i8);
    }

    public static /* synthetic */ List l0(CharSequence charSequence, String[] strArr, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return i0(charSequence, strArr, z7, i8);
    }

    public static final R6.d m0(CharSequence charSequence, String[] strArr, boolean z7, int i8) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(strArr, "delimiters");
        return R6.g.j(e0(charSequence, strArr, 0, z7, i8, 2, null), new c(charSequence));
    }

    public static /* synthetic */ R6.d n0(CharSequence charSequence, String[] strArr, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return m0(charSequence, strArr, z7, i8);
    }

    public static final boolean o0(CharSequence charSequence, char c8, boolean z7) {
        J6.r.e(charSequence, "<this>");
        return charSequence.length() > 0 && S6.c.d(charSequence.charAt(0), c8, z7);
    }

    public static /* synthetic */ boolean p0(CharSequence charSequence, char c8, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return o0(charSequence, c8, z7);
    }

    public static final String q0(CharSequence charSequence, P6.i iVar) {
        J6.r.e(charSequence, "<this>");
        J6.r.e(iVar, "range");
        return charSequence.subSequence(iVar.s().intValue(), iVar.r().intValue() + 1).toString();
    }

    public static final String r0(String str, char c8, String str2) {
        J6.r.e(str, "<this>");
        J6.r.e(str2, "missingDelimiterValue");
        int O7 = h.O(str, c8, 0, false, 6, null);
        if (O7 == -1) {
            return str2;
        }
        String substring = str.substring(O7 + 1, str.length());
        J6.r.d(substring, "substring(...)");
        return substring;
    }

    public static final String s0(String str, String str2, String str3) {
        J6.r.e(str, "<this>");
        J6.r.e(str2, "delimiter");
        J6.r.e(str3, "missingDelimiterValue");
        int P7 = h.P(str, str2, 0, false, 6, null);
        if (P7 == -1) {
            return str3;
        }
        String substring = str.substring(P7 + str2.length(), str.length());
        J6.r.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String t0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return r0(str, c8, str2);
    }

    public static /* synthetic */ String u0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return s0(str, str2, str3);
    }

    public static String v0(String str, char c8, String str2) {
        J6.r.e(str, "<this>");
        J6.r.e(str2, "missingDelimiterValue");
        int U7 = U(str, c8, 0, false, 6, null);
        if (U7 == -1) {
            return str2;
        }
        String substring = str.substring(U7 + 1, str.length());
        J6.r.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String w0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return h.v0(str, c8, str2);
    }

    public static CharSequence x0(CharSequence charSequence) {
        J6.r.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            boolean c8 = S6.a.c(charSequence.charAt(!z7 ? i8 : length));
            if (z7) {
                if (!c8) {
                    break;
                }
                length--;
            } else if (c8) {
                i8++;
            } else {
                z7 = true;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }
}
