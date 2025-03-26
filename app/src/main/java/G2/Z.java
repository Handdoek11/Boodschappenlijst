package G2;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private long f2610a;

    /* renamed from: b, reason: collision with root package name */
    private long f2611b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private final Object f2612c = new Object();

    public Z(long j8) {
        this.f2610a = j8;
    }

    public final void a(long j8) {
        synchronized (this.f2612c) {
            this.f2610a = j8;
        }
    }

    public final boolean b() {
        synchronized (this.f2612c) {
            try {
                long b8 = C2.v.c().b();
                if (this.f2611b + this.f2610a > b8) {
                    return false;
                }
                this.f2611b = b8;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
