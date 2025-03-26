package m2;

/* renamed from: m2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6192f {

    /* renamed from: c, reason: collision with root package name */
    private static final C6192f f38954c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f38955a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38956b;

    /* renamed from: m2.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f38957a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f38958b = 0;

        a() {
        }

        public C6192f a() {
            return new C6192f(this.f38957a, this.f38958b);
        }

        public a b(long j8) {
            this.f38958b = j8;
            return this;
        }

        public a c(long j8) {
            this.f38957a = j8;
            return this;
        }
    }

    C6192f(long j8, long j9) {
        this.f38955a = j8;
        this.f38956b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f38956b;
    }

    public long b() {
        return this.f38955a;
    }
}
