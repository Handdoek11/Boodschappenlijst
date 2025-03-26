package I5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x6.C6933o;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class J {

    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f3182o = new a();

        a() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(C6933o c6933o) {
            J6.r.e(c6933o, "it");
            String str = (String) c6933o.c();
            if (c6933o.d() == null) {
                return str;
            }
            return str + '=' + String.valueOf(c6933o.d());
        }
    }

    public static final D a(String str) {
        J6.r.e(str, "urlString");
        return G.j(new D(null, null, 0, null, null, null, null, null, false, 511, null), str);
    }

    public static final K b(String str) {
        J6.r.e(str, "urlString");
        return a(str).b();
    }

    public static final void c(Appendable appendable, String str, y yVar, boolean z7) {
        List list;
        J6.r.e(appendable, "<this>");
        J6.r.e(str, "encodedPath");
        J6.r.e(yVar, "encodedQueryParameters");
        if (!S6.h.t(str) && !S6.h.B(str, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str);
        if (!yVar.isEmpty() || z7) {
            appendable.append("?");
        }
        Set<Map.Entry> b8 = yVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : b8) {
            String str2 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = AbstractC6987o.b(x6.u.a(str2, null));
            } else {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(AbstractC6987o.l(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(x6.u.a(str2, (String) it.next()));
                }
                list = arrayList2;
            }
            AbstractC6987o.o(arrayList, list);
        }
        y6.y.F(arrayList, appendable, (124 & 2) != 0 ? ", " : "&", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : a.f3182o);
    }

    public static final void d(StringBuilder sb, String str, String str2) {
        J6.r.e(sb, "<this>");
        if (str == null) {
            return;
        }
        sb.append(str);
        if (str2 != null) {
            sb.append(':');
            sb.append(str2);
        }
        sb.append("@");
    }

    public static final String e(K k8) {
        J6.r.e(k8, "<this>");
        return k8.g() + ':' + k8.j();
    }

    public static final D f(D d8, D d9) {
        J6.r.e(d8, "<this>");
        J6.r.e(d9, "url");
        d8.y(d9.o());
        d8.w(d9.j());
        d8.x(d9.n());
        d8.u(d9.g());
        d8.v(d9.h());
        d8.t(d9.f());
        y b8 = B.b(0, 1, null);
        N5.v.c(b8, d9.e());
        d8.s(b8);
        d8.r(d9.d());
        d8.z(d9.p());
        return d8;
    }

    public static final D g(D d8, K k8) {
        J6.r.e(d8, "<this>");
        J6.r.e(k8, "url");
        d8.y(k8.k());
        d8.w(k8.g());
        d8.x(k8.j());
        F.i(d8, k8.d());
        d8.v(k8.f());
        d8.t(k8.c());
        y b8 = B.b(0, 1, null);
        b8.e(C.d(k8.e(), 0, 0, false, 6, null));
        d8.s(b8);
        d8.r(k8.b());
        d8.z(k8.m());
        return d8;
    }
}
