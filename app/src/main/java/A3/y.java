package A3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class y implements H {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f228a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f229b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0370d f230c;

    public y(Executor executor, InterfaceC0370d interfaceC0370d) {
        this.f228a = executor;
        this.f230c = interfaceC0370d;
    }

    @Override // A3.H
    public final void a() {
        synchronized (this.f229b) {
            this.f230c = null;
        }
    }

    @Override // A3.H
    public final void d(AbstractC0376j abstractC0376j) {
        if (abstractC0376j.q()) {
            synchronized (this.f229b) {
                try {
                    if (this.f230c == null) {
                        return;
                    }
                    this.f228a.execute(new x(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
