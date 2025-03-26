package u;

import I6.l;
import J6.AbstractC0649i;
import J6.r;
import J6.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import t.AbstractC6764b;
import y6.AbstractC6980h;
import y6.AbstractC6987o;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6806a implements Set, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private int f43934o;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f43935s = new Object[16];

    /* renamed from: u.a$a, reason: collision with other inner class name */
    public static final class C0332a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private int f43936o;

        C0332a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43936o < C6806a.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] j8 = C6806a.this.j();
            int i8 = this.f43936o;
            this.f43936o = i8 + 1;
            Object obj = j8[i8];
            r.c(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: u.a$b */
    static final class b extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final b f43938o = new b();

        b() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return obj.toString();
        }
    }

    private final int b(Object obj) {
        int size = size() - 1;
        int a8 = AbstractC6764b.a(obj);
        Object[] objArr = this.f43935s;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            Object obj2 = objArr[i9];
            int a9 = AbstractC6764b.a(obj2);
            if (a9 < a8) {
                i8 = i9 + 1;
            } else {
                if (a9 <= a8) {
                    return obj2 == obj ? i9 : d(i9, obj, a8);
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    private final int d(int i8, Object obj, int i9) {
        Object obj2;
        Object[] objArr = this.f43935s;
        int size = size();
        for (int i10 = i8 - 1; -1 < i10; i10--) {
            Object obj3 = objArr[i10];
            if (obj3 == obj) {
                return i10;
            }
            if (AbstractC6764b.a(obj3) != i9) {
                break;
            }
        }
        do {
            i8++;
            if (i8 >= size) {
                return -(size + 1);
            }
            obj2 = objArr[i8];
            if (obj2 == obj) {
                return i8;
            }
        } while (AbstractC6764b.a(obj2) == i9);
        return -(i8 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i8;
        int size = size();
        Object[] objArr = this.f43935s;
        if (size > 0) {
            i8 = b(obj);
            if (i8 >= 0) {
                return false;
            }
        } else {
            i8 = -1;
        }
        int i9 = -(i8 + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            AbstractC6980h.g(objArr, objArr2, i9 + 1, i9, size);
            AbstractC6980h.j(objArr, objArr2, 0, 0, i9, 6, null);
            this.f43935s = objArr2;
        } else {
            AbstractC6980h.g(objArr, objArr, i9 + 1, i9, size);
        }
        this.f43935s[i9] = obj;
        this.f43934o = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        AbstractC6980h.m(this.f43935s, null, 0, 0, 6, null);
        this.f43934o = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && b(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    public int e() {
        return this.f43934o;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0332a();
    }

    public final Object[] j() {
        return this.f43935s;
    }

    public final boolean n() {
        return size() > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        int b8 = b(obj);
        Object[] objArr = this.f43935s;
        int size = size();
        if (b8 < 0) {
            return false;
        }
        int i8 = size - 1;
        if (b8 < i8) {
            AbstractC6980h.g(objArr, objArr, b8, b8 + 1, size);
        }
        objArr[i8] = null;
        this.f43934o = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC0649i.a(this);
    }

    public String toString() {
        return AbstractC6987o.I(this, null, "[", "]", 0, null, b.f43938o, 25, null);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC0649i.b(this, objArr);
    }
}
