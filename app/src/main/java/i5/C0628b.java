package I5;

import I5.AbstractC0635i;
import J6.AbstractC0650j;
import io.ktor.http.BadContentTypeFormatException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import y6.AbstractC6987o;

/* renamed from: I5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0628b extends AbstractC0635i {

    /* renamed from: f, reason: collision with root package name */
    public static final C0056b f3221f = new C0056b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final C0628b f3222g = new C0628b("*", "*", null, 4, null);

    /* renamed from: d, reason: collision with root package name */
    private final String f3223d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3224e;

    /* renamed from: I5.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3225a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final C0628b f3226b;

        /* renamed from: c, reason: collision with root package name */
        private static final C0628b f3227c;

        /* renamed from: d, reason: collision with root package name */
        private static final C0628b f3228d;

        /* renamed from: e, reason: collision with root package name */
        private static final C0628b f3229e;

        /* renamed from: f, reason: collision with root package name */
        private static final C0628b f3230f;

        /* renamed from: g, reason: collision with root package name */
        private static final C0628b f3231g;

        /* renamed from: h, reason: collision with root package name */
        private static final C0628b f3232h;

        /* renamed from: i, reason: collision with root package name */
        private static final C0628b f3233i;

        /* renamed from: j, reason: collision with root package name */
        private static final C0628b f3234j;

        /* renamed from: k, reason: collision with root package name */
        private static final C0628b f3235k;

        /* renamed from: l, reason: collision with root package name */
        private static final C0628b f3236l;

        /* renamed from: m, reason: collision with root package name */
        private static final C0628b f3237m;

        /* renamed from: n, reason: collision with root package name */
        private static final C0628b f3238n;

        /* renamed from: o, reason: collision with root package name */
        private static final C0628b f3239o;

        /* renamed from: p, reason: collision with root package name */
        private static final C0628b f3240p;

        /* renamed from: q, reason: collision with root package name */
        private static final C0628b f3241q;

        /* renamed from: r, reason: collision with root package name */
        private static final C0628b f3242r;

        /* renamed from: s, reason: collision with root package name */
        private static final C0628b f3243s;

        /* renamed from: t, reason: collision with root package name */
        private static final C0628b f3244t;

        /* renamed from: u, reason: collision with root package name */
        private static final C0628b f3245u;

        /* renamed from: v, reason: collision with root package name */
        private static final C0628b f3246v;

        /* renamed from: w, reason: collision with root package name */
        private static final C0628b f3247w;

        static {
            int i8 = 4;
            AbstractC0650j abstractC0650j = null;
            List list = null;
            f3226b = new C0628b("application", "*", list, i8, abstractC0650j);
            int i9 = 4;
            AbstractC0650j abstractC0650j2 = null;
            List list2 = null;
            f3227c = new C0628b("application", "atom+xml", list2, i9, abstractC0650j2);
            f3228d = new C0628b("application", "cbor", list, i8, abstractC0650j);
            f3229e = new C0628b("application", "json", list2, i9, abstractC0650j2);
            f3230f = new C0628b("application", "hal+json", list, i8, abstractC0650j);
            f3231g = new C0628b("application", "javascript", list2, i9, abstractC0650j2);
            f3232h = new C0628b("application", "octet-stream", list, i8, abstractC0650j);
            f3233i = new C0628b("application", "font-woff", list2, i9, abstractC0650j2);
            f3234j = new C0628b("application", "rss+xml", list, i8, abstractC0650j);
            f3235k = new C0628b("application", "xml", list2, i9, abstractC0650j2);
            f3236l = new C0628b("application", "xml-dtd", list, i8, abstractC0650j);
            f3237m = new C0628b("application", "zip", list2, i9, abstractC0650j2);
            f3238n = new C0628b("application", "gzip", list, i8, abstractC0650j);
            f3239o = new C0628b("application", "x-www-form-urlencoded", list2, i9, abstractC0650j2);
            f3240p = new C0628b("application", "pdf", list, i8, abstractC0650j);
            f3241q = new C0628b("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", list2, i9, abstractC0650j2);
            f3242r = new C0628b("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", list, i8, abstractC0650j);
            f3243s = new C0628b("application", "vnd.openxmlformats-officedocument.presentationml.presentation", list2, i9, abstractC0650j2);
            f3244t = new C0628b("application", "protobuf", list, i8, abstractC0650j);
            f3245u = new C0628b("application", "wasm", list2, i9, abstractC0650j2);
            f3246v = new C0628b("application", "problem+json", list, i8, abstractC0650j);
            f3247w = new C0628b("application", "problem+xml", list2, i9, abstractC0650j2);
        }

        private a() {
        }

        public final C0628b a() {
            return f3229e;
        }

        public final C0628b b() {
            return f3232h;
        }
    }

    /* renamed from: I5.b$b, reason: collision with other inner class name */
    public static final class C0056b {
        public /* synthetic */ C0056b(AbstractC0650j abstractC0650j) {
            this();
        }

        public final C0628b a() {
            return C0628b.f3222g;
        }

        public final C0628b b(String str) {
            J6.r.e(str, "value");
            if (S6.h.t(str)) {
                return a();
            }
            AbstractC0635i.a aVar = AbstractC0635i.f3266c;
            C0633g c0633g = (C0633g) AbstractC6987o.J(AbstractC0640n.c(str));
            String d8 = c0633g.d();
            List b8 = c0633g.b();
            int O7 = S6.h.O(d8, '/', 0, false, 6, null);
            if (O7 == -1) {
                if (J6.r.a(S6.h.x0(d8).toString(), "*")) {
                    return C0628b.f3221f.a();
                }
                throw new BadContentTypeFormatException(str);
            }
            String substring = d8.substring(0, O7);
            J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String obj = S6.h.x0(substring).toString();
            if (obj.length() == 0) {
                throw new BadContentTypeFormatException(str);
            }
            String substring2 = d8.substring(O7 + 1);
            J6.r.d(substring2, "this as java.lang.String).substring(startIndex)");
            String obj2 = S6.h.x0(substring2).toString();
            if (S6.h.F(obj, ' ', false, 2, null) || S6.h.F(obj2, ' ', false, 2, null)) {
                throw new BadContentTypeFormatException(str);
            }
            if (obj2.length() == 0 || S6.h.F(obj2, '/', false, 2, null)) {
                throw new BadContentTypeFormatException(str);
            }
            return new C0628b(obj, obj2, b8);
        }

        private C0056b() {
        }
    }

    /* renamed from: I5.b$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3248a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final C0628b f3249b;

        /* renamed from: c, reason: collision with root package name */
        private static final C0628b f3250c;

        /* renamed from: d, reason: collision with root package name */
        private static final C0628b f3251d;

        /* renamed from: e, reason: collision with root package name */
        private static final C0628b f3252e;

        /* renamed from: f, reason: collision with root package name */
        private static final C0628b f3253f;

        /* renamed from: g, reason: collision with root package name */
        private static final C0628b f3254g;

        /* renamed from: h, reason: collision with root package name */
        private static final C0628b f3255h;

        /* renamed from: i, reason: collision with root package name */
        private static final C0628b f3256i;

        /* renamed from: j, reason: collision with root package name */
        private static final C0628b f3257j;

        static {
            int i8 = 4;
            AbstractC0650j abstractC0650j = null;
            List list = null;
            f3249b = new C0628b("text", "*", list, i8, abstractC0650j);
            int i9 = 4;
            AbstractC0650j abstractC0650j2 = null;
            List list2 = null;
            f3250c = new C0628b("text", "plain", list2, i9, abstractC0650j2);
            f3251d = new C0628b("text", "css", list, i8, abstractC0650j);
            f3252e = new C0628b("text", "csv", list2, i9, abstractC0650j2);
            f3253f = new C0628b("text", "html", list, i8, abstractC0650j);
            f3254g = new C0628b("text", "javascript", list2, i9, abstractC0650j2);
            f3255h = new C0628b("text", "vcard", list, i8, abstractC0650j);
            f3256i = new C0628b("text", "xml", list2, i9, abstractC0650j2);
            f3257j = new C0628b("text", "event-stream", list, i8, abstractC0650j);
        }

        private c() {
        }

        public final C0628b a() {
            return f3250c;
        }
    }

    private C0628b(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f3223d = str;
        this.f3224e = str2;
    }

    private final boolean f(String str, String str2) {
        int size = b().size();
        if (size == 0) {
            return false;
        }
        if (size != 1) {
            List<C0634h> b8 = b();
            if ((b8 instanceof Collection) && b8.isEmpty()) {
                return false;
            }
            for (C0634h c0634h : b8) {
                if (!S6.h.s(c0634h.c(), str, true) || !S6.h.s(c0634h.d(), str2, true)) {
                }
            }
            return false;
        }
        C0634h c0634h2 = (C0634h) b().get(0);
        if (!S6.h.s(c0634h2.c(), str, true) || !S6.h.s(c0634h2.d(), str2, true)) {
            return false;
        }
        return true;
    }

    public final String e() {
        return this.f3223d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0628b) {
            C0628b c0628b = (C0628b) obj;
            if (S6.h.s(this.f3223d, c0628b.f3223d, true) && S6.h.s(this.f3224e, c0628b.f3224e, true) && J6.r.a(b(), c0628b.b())) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(C0628b c0628b) {
        boolean s8;
        J6.r.e(c0628b, "pattern");
        if (!J6.r.a(c0628b.f3223d, "*") && !S6.h.s(c0628b.f3223d, this.f3223d, true)) {
            return false;
        }
        if (!J6.r.a(c0628b.f3224e, "*") && !S6.h.s(c0628b.f3224e, this.f3224e, true)) {
            return false;
        }
        for (C0634h c0634h : c0628b.b()) {
            String a8 = c0634h.a();
            String b8 = c0634h.b();
            if (J6.r.a(a8, "*")) {
                if (!J6.r.a(b8, "*")) {
                    List b9 = b();
                    if (!(b9 instanceof Collection) || !b9.isEmpty()) {
                        Iterator it = b9.iterator();
                        while (it.hasNext()) {
                            if (S6.h.s(((C0634h) it.next()).d(), b8, true)) {
                            }
                        }
                    }
                    s8 = false;
                }
                s8 = true;
                break;
            }
            String c8 = c(a8);
            if (!J6.r.a(b8, "*")) {
                s8 = S6.h.s(c8, b8, true);
            } else {
                if (c8 != null) {
                    s8 = true;
                    break;
                    break;
                }
                s8 = false;
            }
            if (!s8) {
                return false;
            }
        }
        return true;
    }

    public final C0628b h(String str, String str2) {
        J6.r.e(str, "name");
        J6.r.e(str2, "value");
        return f(str, str2) ? this : new C0628b(this.f3223d, this.f3224e, a(), AbstractC6987o.O(b(), new C0634h(str, str2)));
    }

    public int hashCode() {
        String str = this.f3223d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        J6.r.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f3224e.toLowerCase(locale);
        J6.r.d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode() + (b().hashCode() * 31);
    }

    public final C0628b i() {
        if (b().isEmpty()) {
            return this;
        }
        return new C0628b(this.f3223d, this.f3224e, null, 4, null);
    }

    public /* synthetic */ C0628b(String str, String str2, List list, int i8, AbstractC0650j abstractC0650j) {
        this(str, str2, (i8 & 4) != 0 ? AbstractC6987o.e() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0628b(String str, String str2, List list) {
        this(str, str2, str + '/' + str2, list);
        J6.r.e(str, "contentType");
        J6.r.e(str2, "contentSubtype");
        J6.r.e(list, "parameters");
    }
}
