package androidx.lifecycle;

import androidx.lifecycle.AbstractC0922h;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    private final String f10289o;

    /* renamed from: s, reason: collision with root package name */
    private final z f10290s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10291t;

    public SavedStateHandleController(String str, z zVar) {
        J6.r.e(str, "key");
        J6.r.e(zVar, "handle");
        this.f10289o = str;
        this.f10290s = zVar;
    }

    public final void a(androidx.savedstate.a aVar, AbstractC0922h abstractC0922h) {
        J6.r.e(aVar, "registry");
        J6.r.e(abstractC0922h, "lifecycle");
        if (this.f10291t) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f10291t = true;
        abstractC0922h.a(this);
        aVar.h(this.f10289o, this.f10290s.c());
    }

    public final z b() {
        return this.f10290s;
    }

    public final boolean c() {
        return this.f10291t;
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        J6.r.e(interfaceC0927m, "source");
        J6.r.e(aVar, "event");
        if (aVar == AbstractC0922h.a.ON_DESTROY) {
            this.f10291t = false;
            interfaceC0927m.getLifecycle().c(this);
        }
    }
}
