package j$.time.temporal;

/* loaded from: classes3.dex */
enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a, reason: collision with root package name */
    private final transient String f37179a;

    /* renamed from: b, reason: collision with root package name */
    private final transient w f37180b;

    /* renamed from: c, reason: collision with root package name */
    private final transient long f37181c;

    @Override // j$.time.temporal.r
    public final boolean v() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j8) {
        this.f37179a = str;
        this.f37180b = w.j((-365243219162L) + j8, 365241780471L + j8);
        this.f37181c = j8;
    }

    @Override // j$.time.temporal.r
    public final w j() {
        return this.f37180b;
    }

    @Override // j$.time.temporal.r
    public final boolean m(o oVar) {
        return oVar.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final w s(o oVar) {
        if (!oVar.f(a.EPOCH_DAY)) {
            throw new j$.time.c("Unsupported field: " + this);
        }
        return this.f37180b;
    }

    @Override // j$.time.temporal.r
    public final long k(o oVar) {
        return oVar.s(a.EPOCH_DAY) + this.f37181c;
    }

    @Override // j$.time.temporal.r
    public final m n(m mVar, long j8) {
        if (!this.f37180b.i(j8)) {
            throw new j$.time.c("Invalid value: " + this.f37179a + " " + j8);
        }
        return mVar.d(j$.com.android.tools.r8.a.k(j8, this.f37181c), a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37179a;
    }
}
