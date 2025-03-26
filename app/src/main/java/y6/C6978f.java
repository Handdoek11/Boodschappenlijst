package y6;

import J6.AbstractC0642b;
import J6.AbstractC0649i;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: y6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6978f implements Collection, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final Object[] f44652o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f44653s;

    public C6978f(Object[] objArr, boolean z7) {
        J6.r.e(objArr, "values");
        this.f44652o = objArr;
        this.f44653s = z7;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.f44652o.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC6984l.s(this.f44652o, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        J6.r.e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f44652o.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC0642b.a(this.f44652o);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        J6.r.e(objArr, "array");
        return AbstractC0649i.b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC6988p.a(this.f44652o, this.f44653s);
    }
}
