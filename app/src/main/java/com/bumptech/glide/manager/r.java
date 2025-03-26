package com.bumptech.glide.manager;

import d2.AbstractC5710l;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: o, reason: collision with root package name */
    private final Set f13026o = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.k
    public void a() {
        Iterator it = AbstractC5710l.j(this.f13026o).iterator();
        while (it.hasNext()) {
            ((a2.h) it.next()).a();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void f() {
        Iterator it = AbstractC5710l.j(this.f13026o).iterator();
        while (it.hasNext()) {
            ((a2.h) it.next()).f();
        }
    }

    public void k() {
        this.f13026o.clear();
    }

    public List l() {
        return AbstractC5710l.j(this.f13026o);
    }

    public void m(a2.h hVar) {
        this.f13026o.add(hVar);
    }

    public void n(a2.h hVar) {
        this.f13026o.remove(hVar);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
        Iterator it = AbstractC5710l.j(this.f13026o).iterator();
        while (it.hasNext()) {
            ((a2.h) it.next()).onDestroy();
        }
    }
}
