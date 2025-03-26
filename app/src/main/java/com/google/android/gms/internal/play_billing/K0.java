package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
final class K0 extends AbstractC5162o0 {

    /* renamed from: w, reason: collision with root package name */
    static final K0 f29778w;

    /* renamed from: v, reason: collision with root package name */
    final transient AbstractC5114g0 f29779v;

    static {
        int i8 = AbstractC5114g0.f29907t;
        f29778w = new K0(D0.f29684w, C5203v0.f30017o);
    }

    K0(AbstractC5114g0 abstractC5114g0, Comparator comparator) {
        super(comparator);
        this.f29779v = abstractC5114g0;
    }

    @Override // java.util.NavigableSet
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final P0 descendingIterator() {
        return this.f29779v.o().listIterator(0);
    }

    final int H(Object obj, boolean z7) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f29779v, obj, this.f29957t);
        return binarySearch >= 0 ? z7 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    final int I(Object obj, boolean z7) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f29779v, obj, this.f29957t);
        return binarySearch >= 0 ? z7 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    final K0 J(int i8, int i9) {
        if (i8 == 0) {
            if (i9 == this.f29779v.size()) {
                return this;
            }
            i8 = 0;
        }
        if (i8 >= i9) {
            return AbstractC5162o0.C(this.f29957t);
        }
        AbstractC5114g0 abstractC5114g0 = this.f29779v;
        return new K0(abstractC5114g0.subList(i8, i9), this.f29957t);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int b(Object[] objArr, int i8) {
        return this.f29779v.b(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int c() {
        return this.f29779v.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        AbstractC5114g0 abstractC5114g0 = this.f29779v;
        int I7 = I(obj, true);
        if (I7 == abstractC5114g0.size()) {
            return null;
        }
        return this.f29779v.get(I7);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f29779v, obj, this.f29957t) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC5197u0) {
            collection = ((InterfaceC5197u0) collection).zza();
        }
        if (!O0.a(this.f29957t, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        Q0 listIterator = this.f29779v.listIterator(0);
        Iterator it = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = listIterator.next();
        while (true) {
            try {
                int compare = this.f29957t.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int d() {
        return this.f29779v.d();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5156n0, com.google.android.gms.internal.play_billing.AbstractC5084b0
    public final AbstractC5114g0 e() {
        return this.f29779v;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5156n0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f29779v.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!O0.a(this.f29957t, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            Q0 listIterator = this.f29779v.listIterator(0);
            while (listIterator.hasNext()) {
                E next = listIterator.next();
                Object next2 = it.next();
                if (next2 == null || this.f29957t.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5162o0, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f29779v.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int H7 = H(obj, true) - 1;
        if (H7 == -1) {
            return null;
        }
        return this.f29779v.get(H7);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        AbstractC5114g0 abstractC5114g0 = this.f29779v;
        int I7 = I(obj, false);
        if (I7 == abstractC5114g0.size()) {
            return null;
        }
        return this.f29779v.get(I7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f29779v.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5162o0, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f29779v.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int H7 = H(obj, false) - 1;
        if (H7 == -1) {
            return null;
        }
        return this.f29779v.get(H7);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final Object[] n() {
        return this.f29779v.n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29779v.size();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5162o0
    final AbstractC5162o0 t() {
        Comparator reverseOrder = Collections.reverseOrder(this.f29957t);
        return isEmpty() ? AbstractC5162o0.C(reverseOrder) : new K0(this.f29779v.o(), reverseOrder);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5162o0
    final AbstractC5162o0 v(Object obj, boolean z7) {
        return J(0, H(obj, z7));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5162o0
    final AbstractC5162o0 x(Object obj, boolean z7, Object obj2, boolean z8) {
        return y(obj, z7).v(obj2, z8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5162o0
    final AbstractC5162o0 y(Object obj, boolean z7) {
        return J(I(obj, z7), this.f29779v.size());
    }
}
