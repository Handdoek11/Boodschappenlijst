package E1;

/* renamed from: E1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561a {

    /* renamed from: a, reason: collision with root package name */
    private String f2132a;

    /* renamed from: E1.a$a, reason: collision with other inner class name */
    public static final class C0032a {

        /* renamed from: a, reason: collision with root package name */
        private String f2133a;

        /* synthetic */ C0032a(m mVar) {
        }

        public C0561a a() {
            String str = this.f2133a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C0561a c0561a = new C0561a(null);
            c0561a.f2132a = str;
            return c0561a;
        }

        public C0032a b(String str) {
            this.f2133a = str;
            return this;
        }
    }

    /* synthetic */ C0561a(m mVar) {
    }

    public static C0032a b() {
        return new C0032a(null);
    }

    public String a() {
        return this.f2132a;
    }
}
