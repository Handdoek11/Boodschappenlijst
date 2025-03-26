package A3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class A implements H {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f170a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f171b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0371e f172c;

    public A(Executor executor, InterfaceC0371e interfaceC0371e) {
        this.f170a = executor;
        this.f172c = interfaceC0371e;
    }

    @Override // A3.H
    public final void a() {
        synchronized (this.f171b) {
            this.f172c = null;
        }
    }

    @Override // A3.H
    public final void d(AbstractC0376j abstractC0376j) {
        synchronized (this.f171b) {
            try {
                if (this.f172c == null) {
                    return;
                }
                this.f170a.execute(new z(this, abstractC0376j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
