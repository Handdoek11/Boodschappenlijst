package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Ng0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1589Ng0 extends AbstractCollection {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC1624Og0 f17577o;

    C1589Ng0(AbstractC1624Og0 abstractC1624Og0) {
        this.f17577o = abstractC1624Og0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f17577o.p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f17577o.s().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f17577o.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f17577o.b();
    }
}
