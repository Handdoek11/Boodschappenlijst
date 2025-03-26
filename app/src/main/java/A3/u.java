package A3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class u implements H {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f219a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0369c f220b;

    /* renamed from: c, reason: collision with root package name */
    private final N f221c;

    public u(Executor executor, InterfaceC0369c interfaceC0369c, N n8) {
        this.f219a = executor;
        this.f220b = interfaceC0369c;
        this.f221c = n8;
    }

    @Override // A3.H
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // A3.H
    public final void d(AbstractC0376j abstractC0376j) {
        this.f219a.execute(new t(this, abstractC0376j));
    }
}
