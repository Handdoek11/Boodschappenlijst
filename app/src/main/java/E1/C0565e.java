package E1;

/* renamed from: E1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565e {

    /* renamed from: a, reason: collision with root package name */
    private String f2134a;

    /* renamed from: E1.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f2135a;

        /* synthetic */ a(y yVar) {
        }

        public C0565e a() {
            String str = this.f2135a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C0565e c0565e = new C0565e(null);
            c0565e.f2134a = str;
            return c0565e;
        }

        public a b(String str) {
            this.f2135a = str;
            return this;
        }
    }

    /* synthetic */ C0565e(y yVar) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f2134a;
    }
}
