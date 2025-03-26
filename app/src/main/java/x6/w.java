package x6;

import J6.AbstractC0649i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y6.AbstractC6980h;

/* loaded from: classes2.dex */
public final class w implements Collection, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f44503o;

    private static final class a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private final byte[] f44504o;

        /* renamed from: s, reason: collision with root package name */
        private int f44505s;

        public a(byte[] bArr) {
            J6.r.e(bArr, "array");
            this.f44504o = bArr;
        }

        public byte a() {
            int i8 = this.f44505s;
            byte[] bArr = this.f44504o;
            if (i8 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f44505s));
            }
            this.f44505s = i8 + 1;
            return v.c(bArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44505s < this.f44504o.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return v.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ w(byte[] bArr) {
        this.f44503o = bArr;
    }

    public static final /* synthetic */ w b(byte[] bArr) {
        return new w(bArr);
    }

    public static byte[] d(int i8) {
        return e(new byte[i8]);
    }

    public static byte[] e(byte[] bArr) {
        J6.r.e(bArr, "storage");
        return bArr;
    }

    public static boolean n(byte[] bArr, byte b8) {
        return AbstractC6980h.p(bArr, b8);
    }

    public static boolean o(byte[] bArr, Collection collection) {
        J6.r.e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof v) || !AbstractC6980h.p(bArr, ((v) obj).i())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(byte[] bArr, Object obj) {
        return (obj instanceof w) && J6.r.a(bArr, ((w) obj).C());
    }

    public static final byte q(byte[] bArr, int i8) {
        return v.c(bArr[i8]);
    }

    public static int s(byte[] bArr) {
        return bArr.length;
    }

    public static int t(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean v(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator w(byte[] bArr) {
        return new a(bArr);
    }

    public static final void x(byte[] bArr, int i8, byte b8) {
        bArr[i8] = b8;
    }

    public static String y(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public final /* synthetic */ byte[] C() {
        return this.f44503o;
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
        if (obj instanceof v) {
            return j(((v) obj).i());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        J6.r.e(collection, "elements");
        return o(this.f44503o, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f44503o, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f44503o);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return v(this.f44503o);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return w(this.f44503o);
    }

    public boolean j(byte b8) {
        return n(this.f44503o, b8);
    }

    @Override // java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return s(this.f44503o);
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
        return y(this.f44503o);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        J6.r.e(objArr, "array");
        return AbstractC0649i.b(this, objArr);
    }
}
