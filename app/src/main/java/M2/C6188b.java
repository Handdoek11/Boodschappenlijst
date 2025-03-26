package m2;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6188b {

    /* renamed from: b, reason: collision with root package name */
    private static final C6188b f38927b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final C6191e f38928a;

    /* renamed from: m2.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C6191e f38929a = null;

        a() {
        }

        public C6188b a() {
            return new C6188b(this.f38929a);
        }

        public a b(C6191e c6191e) {
            this.f38929a = c6191e;
            return this;
        }
    }

    C6188b(C6191e c6191e) {
        this.f38928a = c6191e;
    }

    public static a b() {
        return new a();
    }

    public C6191e a() {
        return this.f38928a;
    }
}
