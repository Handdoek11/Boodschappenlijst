package x6;

import J6.AbstractC0649i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y6.AbstractC6980h;

/* renamed from: x6.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6915D implements Collection, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final short[] f44460o;

    /* renamed from: x6.D$a */
    private static final class a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private final short[] f44461o;

        /* renamed from: s, reason: collision with root package name */
        private int f44462s;

        public a(short[] sArr) {
            J6.r.e(sArr, "array");
            this.f44461o = sArr;
        }

        public short a() {
            int i8 = this.f44462s;
            short[] sArr = this.f44461o;
            if (i8 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f44462s));
            }
            this.f44462s = i8 + 1;
            return C6914C.c(sArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44462s < this.f44461o.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C6914C.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C6915D(short[] sArr) {
        this.f44460o = sArr;
    }

    public static final /* synthetic */ C6915D b(short[] sArr) {
        return new C6915D(sArr);
    }

    public static short[] d(int i8) {
        return e(new short[i8]);
    }

    public static short[] e(short[] sArr) {
        J6.r.e(sArr, "storage");
        return sArr;
    }

    public static boolean n(short[] sArr, short s8) {
        return AbstractC6980h.t(sArr, s8);
    }

    public static boolean o(short[] sArr, Collection collection) {
        J6.r.e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof C6914C) || !AbstractC6980h.t(sArr, ((C6914C) obj).i())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(short[] sArr, Object obj) {
        return (obj instanceof C6915D) && J6.r.a(sArr, ((C6915D) obj).C());
    }

    public static final short q(short[] sArr, int i8) {
        return C6914C.c(sArr[i8]);
    }

    public static int s(short[] sArr) {
        return sArr.length;
    }

    public static int t(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean v(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator w(short[] sArr) {
        return new a(sArr);
    }

    public static final void x(short[] sArr, int i8, short s8) {
        sArr[i8] = s8;
    }

    public static String y(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public final /* synthetic */ short[] C() {
        return this.f44460o;
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
        if (obj instanceof C6914C) {
            return j(((C6914C) obj).i());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        J6.r.e(collection, "elements");
        return o(this.f44460o, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f44460o, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f44460o);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return v(this.f44460o);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return w(this.f44460o);
    }

    public boolean j(short s8) {
        return n(this.f44460o, s8);
    }

    @Override // java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return s(this.f44460o);
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
        return y(this.f44460o);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        J6.r.e(objArr, "array");
        return AbstractC0649i.b(this, objArr);
    }
}
