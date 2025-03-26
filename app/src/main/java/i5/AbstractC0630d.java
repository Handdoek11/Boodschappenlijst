package I5;

import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: I5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0630d {
    public static final Charset a(AbstractC0635i abstractC0635i) {
        J6.r.e(abstractC0635i, "<this>");
        String c8 = abstractC0635i.c("charset");
        if (c8 == null) {
            return null;
        }
        try {
            return Charset.forName(c8);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final C0628b b(C0628b c0628b, Charset charset) {
        J6.r.e(c0628b, "<this>");
        J6.r.e(charset, "charset");
        return c0628b.h("charset", W5.a.i(charset));
    }

    public static final C0628b c(C0628b c0628b, Charset charset) {
        J6.r.e(c0628b, "<this>");
        J6.r.e(charset, "charset");
        String lowerCase = c0628b.e().toLowerCase(Locale.ROOT);
        J6.r.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return !J6.r.a(lowerCase, "text") ? c0628b : c0628b.h("charset", W5.a.i(charset));
    }
}
