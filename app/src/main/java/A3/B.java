package A3;

/* loaded from: classes2.dex */
final class B implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC0376j f173o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C f174s;

    B(C c8, AbstractC0376j abstractC0376j) {
        this.f174s = c8;
        this.f173o = abstractC0376j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f174s.f176b) {
            try {
                C c8 = this.f174s;
                if (c8.f177c != null) {
                    c8.f177c.e((Exception) Z2.r.l(this.f173o.n()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
