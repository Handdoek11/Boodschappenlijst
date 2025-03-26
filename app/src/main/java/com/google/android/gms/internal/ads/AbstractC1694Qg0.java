package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Qg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1694Qg0 extends AbstractCollection {

    /* renamed from: o, reason: collision with root package name */
    final Collection f18521o;

    /* renamed from: s, reason: collision with root package name */
    final InterfaceC1797Tf0 f18522s;

    AbstractC1694Qg0(Collection collection, InterfaceC1797Tf0 interfaceC1797Tf0) {
        this.f18521o = collection;
        this.f18522s = interfaceC1797Tf0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        AbstractC1762Sf0.e(this.f18522s.a(obj));
        return this.f18521o.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC1762Sf0.e(this.f18522s.a(it.next()));
        }
        return this.f18521o.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        AbstractC4823zh0.b(this.f18521o, this.f18522s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (AbstractC1729Rg0.a(this.f18521o, obj)) {
            return this.f18522s.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        InterfaceC1797Tf0 interfaceC1797Tf0 = this.f18522s;
        Iterator it = this.f18521o.iterator();
        AbstractC1762Sf0.c(interfaceC1797Tf0, "predicate");
        int i8 = 0;
        while (it.hasNext()) {
            if (interfaceC1797Tf0.a(it.next())) {
                return i8 == -1;
            }
            i8++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f18521o.iterator();
        it.getClass();
        InterfaceC1797Tf0 interfaceC1797Tf0 = this.f18522s;
        interfaceC1797Tf0.getClass();
        return new C1128Ah0(it, interfaceC1797Tf0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f18521o.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f18521o.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f18522s.a(next) && collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f18521o.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f18522s.a(next) && !collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f18521o.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (this.f18522s.a(it.next())) {
                i8++;
            }
        }
        return i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        AbstractC1236Dh0.c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        AbstractC1236Dh0.c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
