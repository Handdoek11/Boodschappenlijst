package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Ig0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1414Ig0 extends AbstractCollection {

    /* renamed from: o, reason: collision with root package name */
    final Object f15981o;

    /* renamed from: s, reason: collision with root package name */
    Collection f15982s;

    /* renamed from: t, reason: collision with root package name */
    final AbstractC1414Ig0 f15983t;

    /* renamed from: u, reason: collision with root package name */
    final Collection f15984u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ AbstractC1520Lg0 f15985v;

    AbstractC1414Ig0(AbstractC1520Lg0 abstractC1520Lg0, Object obj, Collection collection, AbstractC1414Ig0 abstractC1414Ig0) {
        this.f15985v = abstractC1520Lg0;
        this.f15981o = obj;
        this.f15982s = collection;
        this.f15983t = abstractC1414Ig0;
        this.f15984u = abstractC1414Ig0 == null ? null : abstractC1414Ig0.f15982s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f15982s.isEmpty();
        boolean add = this.f15982s.add(obj);
        if (add) {
            this.f15985v.f16871v++;
            if (isEmpty) {
                b();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f15982s.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f15982s.size();
        this.f15985v.f16871v += size2 - size;
        if (size != 0) {
            return addAll;
        }
        b();
        return true;
    }

    final void b() {
        AbstractC1414Ig0 abstractC1414Ig0 = this.f15983t;
        if (abstractC1414Ig0 != null) {
            abstractC1414Ig0.b();
            return;
        }
        AbstractC1520Lg0 abstractC1520Lg0 = this.f15985v;
        abstractC1520Lg0.f16870u.put(this.f15981o, this.f15982s);
    }

    final void c() {
        AbstractC1414Ig0 abstractC1414Ig0 = this.f15983t;
        if (abstractC1414Ig0 != null) {
            abstractC1414Ig0.c();
        } else if (this.f15982s.isEmpty()) {
            AbstractC1520Lg0 abstractC1520Lg0 = this.f15985v;
            abstractC1520Lg0.f16870u.remove(this.f15981o);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f15982s.clear();
        this.f15985v.f16871v -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f15982s.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f15982s.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f15982s.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f15982s.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C1378Hg0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f15982s.remove(obj);
        if (remove) {
            AbstractC1520Lg0 abstractC1520Lg0 = this.f15985v;
            abstractC1520Lg0.f16871v--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f15982s.removeAll(collection);
        if (removeAll) {
            int size2 = this.f15982s.size();
            this.f15985v.f16871v += size2 - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f15982s.retainAll(collection);
        if (retainAll) {
            int size2 = this.f15982s.size();
            this.f15985v.f16871v += size2 - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f15982s.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f15982s.toString();
    }

    final void zzb() {
        AbstractC1414Ig0 abstractC1414Ig0 = this.f15983t;
        if (abstractC1414Ig0 != null) {
            abstractC1414Ig0.zzb();
            AbstractC1414Ig0 abstractC1414Ig02 = this.f15983t;
            if (abstractC1414Ig02.f15982s != this.f15984u) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f15982s.isEmpty()) {
            AbstractC1520Lg0 abstractC1520Lg0 = this.f15985v;
            Collection collection = (Collection) abstractC1520Lg0.f16870u.get(this.f15981o);
            if (collection != null) {
                this.f15982s = collection;
            }
        }
    }
}
