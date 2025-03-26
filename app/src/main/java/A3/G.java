package A3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class G implements InterfaceC0373g, InterfaceC0372f, InterfaceC0370d, H {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f185a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0375i f186b;

    /* renamed from: c, reason: collision with root package name */
    private final N f187c;

    public G(Executor executor, InterfaceC0375i interfaceC0375i, N n8) {
        this.f185a = executor;
        this.f186b = interfaceC0375i;
        this.f187c = n8;
    }

    @Override // A3.H
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // A3.InterfaceC0373g
    public final void b(Object obj) {
        this.f187c.w(obj);
    }

    @Override // A3.InterfaceC0370d
    public final void c() {
        this.f187c.x();
    }

    @Override // A3.H
    public final void d(AbstractC0376j abstractC0376j) {
        this.f185a.execute(new F(this, abstractC0376j));
    }

    @Override // A3.InterfaceC0372f
    public final void e(Exception exc) {
        this.f187c.v(exc);
    }
}
