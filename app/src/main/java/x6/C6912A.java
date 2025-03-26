package x6;

import J6.AbstractC0649i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y6.AbstractC6980h;

/* renamed from: x6.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6912A implements Collection, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final long[] f44454o;

    /* renamed from: x6.A$a */
    private static final class a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private final long[] f44455o;

        /* renamed from: s, reason: collision with root package name */
        private int f44456s;

        public a(long[] jArr) {
            J6.r.e(jArr, "array");
            this.f44455o = jArr;
        }

        public long a() {
            int i8 = this.f44456s;
            long[] jArr = this.f44455o;
            if (i8 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f44456s));
            }
            this.f44456s = i8 + 1;
            return z.c(jArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44456s < this.f44455o.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return z.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C6912A(long[] jArr) {
        this.f44454o = jArr;
    }

    public static final /* synthetic */ C6912A b(long[] jArr) {
        return new C6912A(jArr);
    }

    public static long[] d(int i8) {
        return e(new long[i8]);
    }

    public static long[] e(long[] jArr) {
        J6.r.e(jArr, "storage");
        return jArr;
    }

    public static boolean n(long[] jArr, long j8) {
        return AbstractC6980h.r(jArr, j8);
    }

    public static boolean o(long[] jArr, Collection collection) {
        J6.r.e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof z) || !AbstractC6980h.r(jArr, ((z) obj).k())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr, Object obj) {
        return (obj instanceof C6912A) && J6.r.a(jArr, ((C6912A) obj).C());
    }

    public static final long q(long[] jArr, int i8) {
        return z.c(jArr[i8]);
    }

    public static int s(long[] jArr) {
        return jArr.length;
    }

    public static int t(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean v(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator w(long[] jArr) {
        return new a(jArr);
    }

    public static final void x(long[] jArr, int i8, long j8) {
        jArr[i8] = j8;
    }

    public static String y(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public final /* synthetic */ long[] C() {
        return this.f44454o;
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
        if (obj instanceof z) {
            return j(((z) obj).k());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        J6.r.e(collection, "elements");
        return o(this.f44454o, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f44454o, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f44454o);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return v(this.f44454o);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return w(this.f44454o);
    }

    public boolean j(long j8) {
        return n(this.f44454o, j8);
    }

    @Override // java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return s(this.f44454o);
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
        return y(this.f44454o);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        J6.r.e(objArr, "array");
        return AbstractC0649i.b(this, objArr);
    }
}
