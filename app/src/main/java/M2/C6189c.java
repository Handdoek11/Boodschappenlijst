package m2;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6189c {

    /* renamed from: c, reason: collision with root package name */
    private static final C6189c f38930c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f38931a;

    /* renamed from: b, reason: collision with root package name */
    private final b f38932b;

    /* renamed from: m2.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f38933a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f38934b = b.REASON_UNKNOWN;

        a() {
        }

        public C6189c a() {
            return new C6189c(this.f38933a, this.f38934b);
        }

        public a b(long j8) {
            this.f38933a = j8;
            return this;
        }

        public a c(b bVar) {
            this.f38934b = bVar;
            return this;
        }
    }

    /* renamed from: m2.c$b */
    public enum b implements D4.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: o, reason: collision with root package name */
        private final int f38943o;

        b(int i8) {
            this.f38943o = i8;
        }

        @Override // D4.c
        public int e() {
            return this.f38943o;
        }
    }

    C6189c(long j8, b bVar) {
        this.f38931a = j8;
        this.f38932b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f38931a;
    }

    public b b() {
        return this.f38932b;
    }
}
