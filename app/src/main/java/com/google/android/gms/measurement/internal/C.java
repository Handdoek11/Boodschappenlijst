package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class C implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    private Iterator f30301o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ D f30302s;

    C(D d8) {
        this.f30302s = d8;
        this.f30301o = d8.f30310o.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30301o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f30301o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
