package I5;

import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class F {
    private static final void b(Appendable appendable, String str, String str2) {
        appendable.append("://");
        appendable.append(str);
        if (!S6.h.p0(str2, '/', false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    private static final void c(Appendable appendable, String str, String str2) {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Appendable d(D d8, Appendable appendable) {
        appendable.append(d8.o().d());
        String d9 = d8.o().d();
        if (J6.r.a(d9, "file")) {
            b(appendable, d8.j(), f(d8));
            return appendable;
        }
        if (J6.r.a(d9, "mailto")) {
            c(appendable, g(d8), d8.j());
            return appendable;
        }
        appendable.append("://");
        appendable.append(e(d8));
        J.c(appendable, f(d8), d8.e(), d8.p());
        if (d8.d().length() > 0) {
            appendable.append('#');
            appendable.append(d8.d());
        }
        return appendable;
    }

    public static final String e(D d8) {
        J6.r.e(d8, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(g(d8));
        sb.append(d8.j());
        if (d8.n() != 0 && d8.n() != d8.o().c()) {
            sb.append(":");
            sb.append(String.valueOf(d8.n()));
        }
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String f(D d8) {
        J6.r.e(d8, "<this>");
        return h(d8.g());
    }

    public static final String g(D d8) {
        J6.r.e(d8, "<this>");
        StringBuilder sb = new StringBuilder();
        J.d(sb, d8.h(), d8.f());
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final String h(List list) {
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) AbstractC6987o.B(list)).length() == 0 ? "/" : (String) AbstractC6987o.B(list) : AbstractC6987o.I(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void i(D d8, String str) {
        J6.r.e(d8, "<this>");
        J6.r.e(str, "value");
        d8.u(S6.h.t(str) ? AbstractC6987o.e() : J6.r.a(str, "/") ? G.d() : AbstractC6987o.c0(S6.h.k0(str, new char[]{'/'}, false, 0, 6, null)));
    }
}
