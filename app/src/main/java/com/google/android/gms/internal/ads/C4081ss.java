package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4081ss implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    private final List f26747o = new ArrayList();

    final C3972rs b(InterfaceC1567Mr interfaceC1567Mr) {
        Iterator it = iterator();
        while (it.hasNext()) {
            C3972rs c3972rs = (C3972rs) it.next();
            if (c3972rs.f26226c == interfaceC1567Mr) {
                return c3972rs;
            }
        }
        return null;
    }

    public final void c(C3972rs c3972rs) {
        this.f26747o.add(c3972rs);
    }

    public final void d(C3972rs c3972rs) {
        this.f26747o.remove(c3972rs);
    }

    public final boolean e(InterfaceC1567Mr interfaceC1567Mr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            C3972rs c3972rs = (C3972rs) it.next();
            if (c3972rs.f26226c == interfaceC1567Mr) {
                arrayList.add(c3972rs);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C3972rs) it2.next()).f26227d.b();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f26747o.iterator();
    }
}
