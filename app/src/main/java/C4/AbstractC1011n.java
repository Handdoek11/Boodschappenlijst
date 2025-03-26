package c4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: c4.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1011n extends AbstractCollection implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private static final Object[] f12200o = new Object[0];

    /* renamed from: c4.n$a */
    static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        Object[] f12201a;

        /* renamed from: b, reason: collision with root package name */
        int f12202b;

        /* renamed from: c, reason: collision with root package name */
        boolean f12203c;

        a(int i8) {
            AbstractC1004g.b(i8, "initialCapacity");
            this.f12201a = new Object[i8];
            this.f12202b = 0;
        }

        private void d(int i8) {
            Object[] objArr = this.f12201a;
            if (objArr.length < i8) {
                this.f12201a = Arrays.copyOf(objArr, b.a(objArr.length, i8));
                this.f12203c = false;
            } else if (this.f12203c) {
                this.f12201a = (Object[]) objArr.clone();
                this.f12203c = false;
            }
        }

        public b b(Object... objArr) {
            c(objArr, objArr.length);
            return this;
        }

        final void c(Object[] objArr, int i8) {
            AbstractC0997F.c(objArr, i8);
            d(this.f12202b + i8);
            System.arraycopy(objArr, 0, this.f12201a, this.f12202b, i8);
            this.f12202b += i8;
        }
    }

    /* renamed from: c4.n$b */
    public static abstract class b {
        b() {
        }

        static int a(int i8, int i9) {
            if (i9 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i10 = i8 + (i8 >> 1) + 1;
            if (i10 < i9) {
                i10 = Integer.highestOneBit(i9 - 1) << 1;
            }
            if (i10 < 0) {
                return Integer.MAX_VALUE;
            }
            return i10;
        }
    }

    AbstractC1011n() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract int b(Object[] objArr, int i8);

    Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    int d() {
        throw new UnsupportedOperationException();
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    abstract boolean j();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f12200o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        b4.h.i(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] c8 = c();
            if (c8 != null) {
                return H.a(c8, e(), d(), objArr);
            }
            objArr = AbstractC0997F.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
