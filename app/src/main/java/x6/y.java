package x6;

import J6.AbstractC0649i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y6.AbstractC6980h;

/* loaded from: classes2.dex */
public final class y implements Collection, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final int[] f44508o;

    private static final class a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private final int[] f44509o;

        /* renamed from: s, reason: collision with root package name */
        private int f44510s;

        public a(int[] iArr) {
            J6.r.e(iArr, "array");
            this.f44509o = iArr;
        }

        public int a() {
            int i8 = this.f44510s;
            int[] iArr = this.f44509o;
            if (i8 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f44510s));
            }
            this.f44510s = i8 + 1;
            return x.c(iArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44510s < this.f44509o.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return x.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ y(int[] iArr) {
        this.f44508o = iArr;
    }

    public static final /* synthetic */ y b(int[] iArr) {
        return new y(iArr);
    }

    public static int[] d(int i8) {
        return e(new int[i8]);
    }

    public static int[] e(int[] iArr) {
        J6.r.e(iArr, "storage");
        return iArr;
    }

    public static boolean n(int[] iArr, int i8) {
        return AbstractC6980h.q(iArr, i8);
    }

    public static boolean o(int[] iArr, Collection collection) {
        J6.r.e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof x) || !AbstractC6980h.q(iArr, ((x) obj).i())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(int[] iArr, Object obj) {
        return (obj instanceof y) && J6.r.a(iArr, ((y) obj).C());
    }

    public static final int q(int[] iArr, int i8) {
        return x.c(iArr[i8]);
    }

    public static int s(int[] iArr) {
        return iArr.length;
    }

    public static int t(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean v(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator w(int[] iArr) {
        return new a(iArr);
    }

    public static final void x(int[] iArr, int i8, int i9) {
        iArr[i8] = i9;
    }

    public static String y(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public final /* synthetic */ int[] C() {
        return this.f44508o;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof x) {
            return j(((x) obj).i());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        J6.r.e(collection, "elements");
        return o(this.f44508o, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f44508o, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f44508o);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return v(this.f44508o);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return w(this.f44508o);
    }

    public boolean j(int i8) {
        return n(this.f44508o, i8);
    }

    @Override // java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return s(this.f44508o);
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
    public Object[] toArray() {
        return AbstractC0649i.a(this);
    }

    public String toString() {
        return y(this.f44508o);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        J6.r.e(objArr, "array");
        return AbstractC0649i.b(this, objArr);
    }
}
