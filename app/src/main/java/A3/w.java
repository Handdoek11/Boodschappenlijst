package A3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class w implements InterfaceC0373g, InterfaceC0372f, InterfaceC0370d, H {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f224a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0369c f225b;

    /* renamed from: c, reason: collision with root package name */
    private final N f226c;

    public w(Executor executor, InterfaceC0369c interfaceC0369c, N n8) {
        this.f224a = executor;
        this.f225b = interfaceC0369c;
        this.f226c = n8;
    }

    @Override // A3.H
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // A3.InterfaceC0373g
    public final void b(Object obj) {
        this.f226c.w(obj);
    }

    @Override // A3.InterfaceC0370d
    public final void c() {
        this.f226c.x();
    }

    @Override // A3.H
    public final void d(AbstractC0376j abstractC0376j) {
        this.f224a.execute(new v(this, abstractC0376j));
    }

    @Override // A3.InterfaceC0372f
    public final void e(Exception exc) {
        this.f226c.v(exc);
    }
}
