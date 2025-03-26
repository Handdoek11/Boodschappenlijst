package A3;

/* loaded from: classes2.dex */
final class z implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC0376j f231o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ A f232s;

    z(A a8, AbstractC0376j abstractC0376j) {
        this.f232s = a8;
        this.f231o = abstractC0376j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f232s.f171b) {
            try {
                A a8 = this.f232s;
                if (a8.f172c != null) {
                    a8.f172c.a(this.f231o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
