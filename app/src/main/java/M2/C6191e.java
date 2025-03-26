package m2;

/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6191e {

    /* renamed from: c, reason: collision with root package name */
    private static final C6191e f38949c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f38950a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38951b;

    /* renamed from: m2.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f38952a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f38953b = 0;

        a() {
        }

        public C6191e a() {
            return new C6191e(this.f38952a, this.f38953b);
        }

        public a b(long j8) {
            this.f38952a = j8;
            return this;
        }

        public a c(long j8) {
            this.f38953b = j8;
            return this;
        }
    }

    C6191e(long j8, long j9) {
        this.f38950a = j8;
        this.f38951b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f38950a;
    }

    public long b() {
        return this.f38951b;
    }
}
