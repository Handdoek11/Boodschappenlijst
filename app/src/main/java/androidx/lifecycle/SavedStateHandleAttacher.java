package androidx.lifecycle;

import androidx.lifecycle.AbstractC0922h;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    private final B f10288o;

    public SavedStateHandleAttacher(B b8) {
        J6.r.e(b8, "provider");
        this.f10288o = b8;
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        J6.r.e(interfaceC0927m, "source");
        J6.r.e(aVar, "event");
        if (aVar == AbstractC0922h.a.ON_CREATE) {
            interfaceC0927m.getLifecycle().c(this);
            this.f10288o.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
