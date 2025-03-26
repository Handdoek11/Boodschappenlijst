package androidx.lifecycle;

import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.C0916b;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    private final Object f10271o;

    /* renamed from: s, reason: collision with root package name */
    private final C0916b.a f10272s;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f10271o = obj;
        this.f10272s = C0916b.f10296c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        this.f10272s.a(interfaceC0927m, aVar, this.f10271o);
    }
}
