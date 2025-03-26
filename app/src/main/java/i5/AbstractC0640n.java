package I5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import x6.AbstractC6929k;
import x6.C6933o;
import x6.EnumC6932n;
import x6.InterfaceC6928j;
import y6.AbstractC6987o;
import z6.AbstractC7088a;

/* renamed from: I5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0640n {

    /* renamed from: I5.n$a */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC7088a.a(Double.valueOf(((C0633g) obj2).c()), Double.valueOf(((C0633g) obj).c()));
        }
    }

    /* renamed from: I5.n$b */
    static final class b extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final b f3273o = new b();

        b() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: I5.n$c */
    static final class c extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final c f3274o = new c();

        c() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            return new ArrayList();
        }
    }

    private static final boolean a(String str, int i8) {
        int i9 = i8 + 1;
        while (i9 < str.length() && str.charAt(i9) == ' ') {
            i9++;
        }
        return i9 == str.length() || str.charAt(i9) == ';';
    }

    public static final List b(String str) {
        return AbstractC6987o.U(c(str), new a());
    }

    public static final List c(String str) {
        return d(str, false);
    }

    public static final List d(String str, boolean z7) {
        if (str == null) {
            return AbstractC6987o.e();
        }
        InterfaceC6928j b8 = AbstractC6929k.b(EnumC6932n.f44482t, b.f3273o);
        int i8 = 0;
        while (i8 <= S6.h.J(str)) {
            i8 = e(str, i8, b8, z7);
        }
        return k(b8);
    }

    private static final int e(String str, int i8, InterfaceC6928j interfaceC6928j, boolean z7) {
        InterfaceC6928j b8 = AbstractC6929k.b(EnumC6932n.f44482t, c.f3274o);
        Integer valueOf = z7 ? Integer.valueOf(i8) : null;
        int i9 = i8;
        while (i9 <= S6.h.J(str)) {
            char charAt = str.charAt(i9);
            if (charAt == ',') {
                ((ArrayList) interfaceC6928j.getValue()).add(new C0633g(j(str, i8, valueOf != null ? valueOf.intValue() : i9), k(b8)));
                return i9 + 1;
            }
            if (charAt == ';') {
                if (valueOf == null) {
                    valueOf = Integer.valueOf(i9);
                }
                i9 = f(str, i9 + 1, b8);
            } else {
                i9 = z7 ? f(str, i9, b8) : i9 + 1;
            }
        }
        ((ArrayList) interfaceC6928j.getValue()).add(new C0633g(j(str, i8, valueOf != null ? valueOf.intValue() : i9), k(b8)));
        return i9;
    }

    private static final int f(String str, int i8, InterfaceC6928j interfaceC6928j) {
        int i9 = i8;
        while (i9 <= S6.h.J(str)) {
            char charAt = str.charAt(i9);
            if (charAt == '=') {
                C6933o h8 = h(str, i9 + 1);
                int intValue = ((Number) h8.a()).intValue();
                g(interfaceC6928j, str, i8, i9, (String) h8.b());
                return intValue;
            }
            if (charAt == ';' || charAt == ',') {
                g(interfaceC6928j, str, i8, i9, "");
                return i9;
            }
            i9++;
        }
        g(interfaceC6928j, str, i8, i9, "");
        return i9;
    }

    private static final void g(InterfaceC6928j interfaceC6928j, String str, int i8, int i9, String str2) {
        String j8 = j(str, i8, i9);
        if (j8.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC6928j.getValue()).add(new C0634h(j8, str2));
    }

    private static final C6933o h(String str, int i8) {
        if (str.length() == i8) {
            return x6.u.a(Integer.valueOf(i8), "");
        }
        if (str.charAt(i8) == '\"') {
            return i(str, i8 + 1);
        }
        int i9 = i8;
        while (i9 <= S6.h.J(str)) {
            char charAt = str.charAt(i9);
            if (charAt == ';' || charAt == ',') {
                return x6.u.a(Integer.valueOf(i9), j(str, i8, i9));
            }
            i9++;
        }
        return x6.u.a(Integer.valueOf(i9), j(str, i8, i9));
    }

    private static final C6933o i(String str, int i8) {
        StringBuilder sb = new StringBuilder();
        while (i8 <= S6.h.J(str)) {
            char charAt = str.charAt(i8);
            if (charAt == '\"' && a(str, i8)) {
                Integer valueOf = Integer.valueOf(i8 + 1);
                String sb2 = sb.toString();
                J6.r.d(sb2, "builder.toString()");
                return x6.u.a(valueOf, sb2);
            }
            if (charAt != '\\' || i8 >= S6.h.J(str) - 2) {
                sb.append(charAt);
                i8++;
            } else {
                sb.append(str.charAt(i8 + 1));
                i8 += 2;
            }
        }
        Integer valueOf2 = Integer.valueOf(i8);
        String sb3 = sb.toString();
        J6.r.d(sb3, "builder.toString()");
        return x6.u.a(valueOf2, '\"' + sb3);
    }

    private static final String j(String str, int i8, int i9) {
        String substring = str.substring(i8, i9);
        J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return S6.h.x0(substring).toString();
    }

    private static final List k(InterfaceC6928j interfaceC6928j) {
        return interfaceC6928j.c() ? (List) interfaceC6928j.getValue() : AbstractC6987o.e();
    }
}
