package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.xi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4607xi0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    final Iterator f27901o;

    AbstractC4607xi0(Iterator it) {
        it.getClass();
        this.f27901o = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27901o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f27901o.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f27901o.remove();
    }
}
