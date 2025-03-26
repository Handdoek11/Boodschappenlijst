package Z2;

/* renamed from: Z2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779s {

    /* renamed from: b, reason: collision with root package name */
    private static C0779s f6402b;

    /* renamed from: c, reason: collision with root package name */
    private static final C0780t f6403c = new C0780t(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private C0780t f6404a;

    private C0779s() {
    }

    public static synchronized C0779s b() {
        C0779s c0779s;
        synchronized (C0779s.class) {
            try {
                if (f6402b == null) {
                    f6402b = new C0779s();
                }
                c0779s = f6402b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0779s;
    }

    public C0780t a() {
        return this.f6404a;
    }

    public final synchronized void c(C0780t c0780t) {
        if (c0780t == null) {
            this.f6404a = f6403c;
            return;
        }
        C0780t c0780t2 = this.f6404a;
        if (c0780t2 == null || c0780t2.E0() < c0780t.E0()) {
            this.f6404a = c0780t;
        }
    }
}
