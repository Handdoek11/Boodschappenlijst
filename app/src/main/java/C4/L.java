package c4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
final class L extends AbstractC1016t {

    /* renamed from: w, reason: collision with root package name */
    static final L f12155w = new L(AbstractC1012o.t(), G.c());

    /* renamed from: v, reason: collision with root package name */
    final transient AbstractC1012o f12156v;

    L(AbstractC1012o abstractC1012o, Comparator comparator) {
        super(comparator);
        this.f12156v = abstractC1012o;
    }

    private int d0(Object obj) {
        return Collections.binarySearch(this.f12156v, obj, e0());
    }

    @Override // c4.AbstractC1016t
    AbstractC1016t I() {
        Comparator reverseOrder = Collections.reverseOrder(this.f12229t);
        return isEmpty() ? AbstractC1016t.L(reverseOrder) : new L(this.f12156v.y(), reverseOrder);
    }

    @Override // c4.AbstractC1016t
    AbstractC1016t P(Object obj, boolean z7) {
        return Z(0, a0(obj, z7));
    }

    @Override // c4.AbstractC1016t
    AbstractC1016t S(Object obj, boolean z7, Object obj2, boolean z8) {
        return V(obj, z7).P(obj2, z8);
    }

    @Override // c4.AbstractC1016t
    AbstractC1016t V(Object obj, boolean z7) {
        return Z(c0(obj, z7), size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public S descendingIterator() {
        return this.f12156v.y().iterator();
    }

    L Z(int i8, int i9) {
        return (i8 == 0 && i9 == size()) ? this : i8 < i9 ? new L(this.f12156v.subList(i8, i9), this.f12229t) : AbstractC1016t.L(this.f12229t);
    }

    int a0(Object obj, boolean z7) {
        int binarySearch = Collections.binarySearch(this.f12156v, b4.h.i(obj), comparator());
        return binarySearch >= 0 ? z7 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    @Override // c4.AbstractC1011n
    int b(Object[] objArr, int i8) {
        return this.f12156v.b(objArr, i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return this.f12156v.iterator();
    }

    @Override // c4.AbstractC1011n
    Object[] c() {
        return this.f12156v.c();
    }

    int c0(Object obj, boolean z7) {
        int binarySearch = Collections.binarySearch(this.f12156v, b4.h.i(obj), comparator());
        return binarySearch >= 0 ? z7 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        int c02 = c0(obj, true);
        if (c02 == size()) {
            return null;
        }
        return this.f12156v.get(c02);
    }

    @Override // c4.AbstractC1011n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return d0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC0994C) {
            collection = ((InterfaceC0994C) collection).l();
        }
        if (!P.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        S it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int W7 = W(next2, next);
                if (W7 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (W7 == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (W7 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // c4.AbstractC1011n
    int d() {
        return this.f12156v.d();
    }

    @Override // c4.AbstractC1011n
    int e() {
        return this.f12156v.e();
    }

    Comparator e0() {
        return this.f12229t;
    }

    @Override // c4.r, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!P.b(this.f12229t, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            S it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || W(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f12156v.get(0);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        int a02 = a0(obj, true) - 1;
        if (a02 == -1) {
            return null;
        }
        return this.f12156v.get(a02);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        int c02 = c0(obj, false);
        if (c02 == size()) {
            return null;
        }
        return this.f12156v.get(c02);
    }

    @Override // c4.AbstractC1011n
    boolean j() {
        return this.f12156v.j();
    }

    @Override // java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f12156v.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        int a02 = a0(obj, false) - 1;
        if (a02 == -1) {
            return null;
        }
        return this.f12156v.get(a02);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f12156v.size();
    }
}
