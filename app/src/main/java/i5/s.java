package I5;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class s {
    public static final Charset a(q qVar) {
        J6.r.e(qVar, "<this>");
        C0628b c8 = c(qVar);
        if (c8 != null) {
            return AbstractC0630d.a(c8);
        }
        return null;
    }

    public static final Long b(q qVar) {
        J6.r.e(qVar, "<this>");
        String e8 = qVar.a().e(o.f3324a.g());
        if (e8 != null) {
            return Long.valueOf(Long.parseLong(e8));
        }
        return null;
    }

    public static final C0628b c(q qVar) {
        J6.r.e(qVar, "<this>");
        String e8 = qVar.a().e(o.f3324a.h());
        if (e8 != null) {
            return C0628b.f3221f.b(e8);
        }
        return null;
    }

    public static final C0628b d(r rVar) {
        J6.r.e(rVar, "<this>");
        String i8 = rVar.a().i(o.f3324a.h());
        if (i8 != null) {
            return C0628b.f3221f.b(i8);
        }
        return null;
    }

    public static final void e(r rVar, C0628b c0628b) {
        J6.r.e(rVar, "<this>");
        J6.r.e(c0628b, "type");
        rVar.a().l(o.f3324a.h(), c0628b.toString());
    }
}
