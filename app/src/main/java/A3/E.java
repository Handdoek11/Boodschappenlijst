package A3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class E implements H {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f180a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f181b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0373g f182c;

    public E(Executor executor, InterfaceC0373g interfaceC0373g) {
        this.f180a = executor;
        this.f182c = interfaceC0373g;
    }

    @Override // A3.H
    public final void a() {
        synchronized (this.f181b) {
            this.f182c = null;
        }
    }

    @Override // A3.H
    public final void d(AbstractC0376j abstractC0376j) {
        if (abstractC0376j.s()) {
            synchronized (this.f181b) {
                try {
                    if (this.f182c == null) {
                        return;
                    }
                    this.f180a.execute(new D(this, abstractC0376j));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
