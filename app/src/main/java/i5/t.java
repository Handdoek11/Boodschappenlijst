package I5;

import J6.AbstractC0650j;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3376b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final t f3377c;

    /* renamed from: d, reason: collision with root package name */
    private static final t f3378d;

    /* renamed from: e, reason: collision with root package name */
    private static final t f3379e;

    /* renamed from: f, reason: collision with root package name */
    private static final t f3380f;

    /* renamed from: g, reason: collision with root package name */
    private static final t f3381g;

    /* renamed from: h, reason: collision with root package name */
    private static final t f3382h;

    /* renamed from: i, reason: collision with root package name */
    private static final t f3383i;

    /* renamed from: j, reason: collision with root package name */
    private static final List f3384j;

    /* renamed from: a, reason: collision with root package name */
    private final String f3385a;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final t a() {
            return t.f3377c;
        }

        public final t b() {
            return t.f3382h;
        }

        public final t c() {
            return t.f3378d;
        }

        private a() {
        }
    }

    static {
        t tVar = new t("GET");
        f3377c = tVar;
        t tVar2 = new t("POST");
        f3378d = tVar2;
        t tVar3 = new t("PUT");
        f3379e = tVar3;
        t tVar4 = new t("PATCH");
        f3380f = tVar4;
        t tVar5 = new t("DELETE");
        f3381g = tVar5;
        t tVar6 = new t("HEAD");
        f3382h = tVar6;
        t tVar7 = new t("OPTIONS");
        f3383i = tVar7;
        f3384j = AbstractC6987o.g(tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7);
    }

    public t(String str) {
        J6.r.e(str, "value");
        this.f3385a = str;
    }

    public final String d() {
        return this.f3385a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && J6.r.a(this.f3385a, ((t) obj).f3385a);
    }

    public int hashCode() {
        return this.f3385a.hashCode();
    }

    public String toString() {
        return "HttpMethod(value=" + this.f3385a + ')';
    }
}
