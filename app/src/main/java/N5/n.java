package N5;

import J6.AbstractC0649i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public class n implements Set, K6.e {

    /* renamed from: o, reason: collision with root package name */
    private final Set f4181o;

    /* renamed from: s, reason: collision with root package name */
    private final I6.l f4182s;

    /* renamed from: t, reason: collision with root package name */
    private final I6.l f4183t;

    /* renamed from: u, reason: collision with root package name */
    private final int f4184u;

    public static final class a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private final Iterator f4185o;

        a() {
            this.f4185o = n.this.f4181o.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4185o.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return n.this.f4182s.invoke(this.f4185o.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f4185o.remove();
        }
    }

    public n(Set set, I6.l lVar, I6.l lVar2) {
        J6.r.e(set, "delegate");
        J6.r.e(lVar, "convertTo");
        J6.r.e(lVar2, "convert");
        this.f4181o = set;
        this.f4182s = lVar;
        this.f4183t = lVar2;
        this.f4184u = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f4181o.add(this.f4183t.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        J6.r.e(collection, "elements");
        return this.f4181o.addAll(e(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f4181o.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f4181o.contains(this.f4183t.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        J6.r.e(collection, "elements");
        return this.f4181o.containsAll(e(collection));
    }

    public Collection e(Collection collection) {
        J6.r.e(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f4183t.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        Collection<?> j8 = j(this.f4181o);
        return ((Set) obj).containsAll(j8) && j8.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f4181o.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f4181o.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    public Collection j(Collection collection) {
        J6.r.e(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f4182s.invoke(it.next()));
        }
        return arrayList;
    }

    public int n() {
        return this.f4184u;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f4181o.remove(this.f4183t.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        J6.r.e(collection, "elements");
        return this.f4181o.removeAll(e(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        J6.r.e(collection, "elements");
        return this.f4181o.retainAll(e(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return n();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC0649i.a(this);
    }

    public String toString() {
        return j(this.f4181o).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        J6.r.e(objArr, "array");
        return AbstractC0649i.b(this, objArr);
    }
}
