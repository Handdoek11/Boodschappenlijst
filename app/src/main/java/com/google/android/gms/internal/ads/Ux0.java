package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class Ux0 extends AbstractList {

    /* renamed from: t, reason: collision with root package name */
    private static final Vx0 f19485t = Vx0.b(Ux0.class);

    /* renamed from: o, reason: collision with root package name */
    final List f19486o;

    /* renamed from: s, reason: collision with root package name */
    final Iterator f19487s;

    public Ux0(List list, Iterator it) {
        this.f19486o = list;
        this.f19487s = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        if (this.f19486o.size() > i8) {
            return this.f19486o.get(i8);
        }
        if (!this.f19487s.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19486o.add(this.f19487s.next());
        return get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new Tx0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Vx0 vx0 = f19485t;
        vx0.a("potentially expensive size() call");
        vx0.a("blowup running");
        while (this.f19487s.hasNext()) {
            this.f19486o.add(this.f19487s.next());
        }
        return this.f19486o.size();
    }
}
