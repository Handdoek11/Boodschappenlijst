package com.bumptech.glide.manager;

import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0926l;
import androidx.lifecycle.InterfaceC0927m;
import androidx.lifecycle.t;
import d2.AbstractC5710l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements j, InterfaceC0926l {

    /* renamed from: o, reason: collision with root package name */
    private final Set f12974o = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC0922h f12975s;

    LifecycleLifecycle(AbstractC0922h abstractC0922h) {
        this.f12975s = abstractC0922h;
        abstractC0922h.a(this);
    }

    @Override // com.bumptech.glide.manager.j
    public void a(k kVar) {
        this.f12974o.add(kVar);
        if (this.f12975s.b() == AbstractC0922h.b.DESTROYED) {
            kVar.onDestroy();
        } else if (this.f12975s.b().c(AbstractC0922h.b.STARTED)) {
            kVar.a();
        } else {
            kVar.f();
        }
    }

    @Override // com.bumptech.glide.manager.j
    public void b(k kVar) {
        this.f12974o.remove(kVar);
    }

    @t(AbstractC0922h.a.ON_DESTROY)
    public void onDestroy(InterfaceC0927m interfaceC0927m) {
        Iterator it = AbstractC5710l.j(this.f12974o).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onDestroy();
        }
        interfaceC0927m.getLifecycle().c(this);
    }

    @t(AbstractC0922h.a.ON_START)
    public void onStart(InterfaceC0927m interfaceC0927m) {
        Iterator it = AbstractC5710l.j(this.f12974o).iterator();
        while (it.hasNext()) {
            ((k) it.next()).a();
        }
    }

    @t(AbstractC0922h.a.ON_STOP)
    public void onStop(InterfaceC0927m interfaceC0927m) {
        Iterator it = AbstractC5710l.j(this.f12974o).iterator();
        while (it.hasNext()) {
            ((k) it.next()).f();
        }
    }
}
