package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class Z extends AbstractC0879c implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    private static final Z f9342u;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f9343s;

    /* renamed from: t, reason: collision with root package name */
    private int f9344t;

    static {
        Z z7 = new Z(new Object[0], 0);
        f9342u = z7;
        z7.k();
    }

    private Z(Object[] objArr, int i8) {
        this.f9343s = objArr;
        this.f9344t = i8;
    }

    private static Object[] c(int i8) {
        return new Object[i8];
    }

    public static Z d() {
        return f9342u;
    }

    private void e(int i8) {
        if (i8 < 0 || i8 >= this.f9344t) {
            throw new IndexOutOfBoundsException(j(i8));
        }
    }

    private String j(int i8) {
        return "Index:" + i8 + ", Size:" + this.f9344t;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b();
        int i8 = this.f9344t;
        Object[] objArr = this.f9343s;
        if (i8 == objArr.length) {
            this.f9343s = Arrays.copyOf(objArr, ((i8 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9343s;
        int i9 = this.f9344t;
        this.f9344t = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        e(i8);
        return this.f9343s[i8];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0899x.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Z u(int i8) {
        if (i8 >= this.f9344t) {
            return new Z(Arrays.copyOf(this.f9343s, i8), this.f9344t);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i8) {
        b();
        e(i8);
        Object[] objArr = this.f9343s;
        Object obj = objArr[i8];
        if (i8 < this.f9344t - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f9344t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        b();
        e(i8);
        Object[] objArr = this.f9343s;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9344t;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        int i9;
        b();
        if (i8 >= 0 && i8 <= (i9 = this.f9344t)) {
            Object[] objArr = this.f9343s;
            if (i9 < objArr.length) {
                System.arraycopy(objArr, i8, objArr, i8 + 1, i9 - i8);
            } else {
                Object[] c8 = c(((i9 * 3) / 2) + 1);
                System.arraycopy(this.f9343s, 0, c8, 0, i8);
                System.arraycopy(this.f9343s, i8, c8, i8 + 1, this.f9344t - i8);
                this.f9343s = c8;
            }
            this.f9343s[i8] = obj;
            this.f9344t++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i8));
    }
}
