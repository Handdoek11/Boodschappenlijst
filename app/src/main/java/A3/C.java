package A3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class C implements H {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f175a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f176b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0372f f177c;

    public C(Executor executor, InterfaceC0372f interfaceC0372f) {
        this.f175a = executor;
        this.f177c = interfaceC0372f;
    }

    @Override // A3.H
    public final void a() {
        synchronized (this.f176b) {
            this.f177c = null;
        }
    }

    @Override // A3.H
    public final void d(AbstractC0376j abstractC0376j) {
        if (abstractC0376j.s() || abstractC0376j.q()) {
            return;
        }
        synchronized (this.f176b) {
            try {
                if (this.f177c == null) {
                    return;
                }
                this.f175a.execute(new B(this, abstractC0376j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
