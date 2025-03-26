package androidx.lifecycle;

import U6.A0;
import androidx.lifecycle.AbstractC0922h;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC0923i implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC0922h f10250o;

    /* renamed from: s, reason: collision with root package name */
    private final A6.g f10251s;

    public AbstractC0922h a() {
        return this.f10250o;
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        J6.r.e(interfaceC0927m, "source");
        J6.r.e(aVar, "event");
        if (a().b().compareTo(AbstractC0922h.b.DESTROYED) <= 0) {
            a().c(this);
            A0.e(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // U6.M
    public A6.g getCoroutineContext() {
        return this.f10251s;
    }
}
