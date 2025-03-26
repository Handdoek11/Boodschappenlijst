package A3;

/* loaded from: classes2.dex */
final class D implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC0376j f178o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f179s;

    D(E e8, AbstractC0376j abstractC0376j) {
        this.f179s = e8;
        this.f178o = abstractC0376j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f179s.f181b) {
            try {
                E e8 = this.f179s;
                if (e8.f182c != null) {
                    e8.f182c.b(this.f178o.o());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
