package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class S0 extends D implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    private static final Object[] f30090u;

    /* renamed from: v, reason: collision with root package name */
    private static final S0 f30091v;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f30092s;

    /* renamed from: t, reason: collision with root package name */
    private int f30093t;

    static {
        Object[] objArr = new Object[0];
        f30090u = objArr;
        f30091v = new S0(objArr, 0, false);
    }

    private S0(Object[] objArr, int i8, boolean z7) {
        super(z7);
        this.f30092s = objArr;
        this.f30093t = i8;
    }

    private final void K(int i8) {
        if (i8 < 0 || i8 >= this.f30093t) {
            throw new IndexOutOfBoundsException(j(i8));
        }
    }

    public static S0 c() {
        return f30091v;
    }

    private static int e(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String j(int i8) {
        return "Index:" + i8 + ", Size:" + this.f30093t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        b();
        if (i8 < 0 || i8 > (i9 = this.f30093t)) {
            throw new IndexOutOfBoundsException(j(i8));
        }
        int i10 = i8 + 1;
        Object[] objArr = this.f30092s;
        int length = objArr.length;
        if (i9 < length) {
            System.arraycopy(objArr, i8, objArr, i10, i9 - i8);
        } else {
            Object[] objArr2 = new Object[e(length)];
            System.arraycopy(this.f30092s, 0, objArr2, 0, i8);
            System.arraycopy(this.f30092s, i8, objArr2, i10, this.f30093t - i8);
            this.f30092s = objArr2;
        }
        this.f30092s[i8] = obj;
        this.f30093t++;
        ((AbstractList) this).modCount++;
    }

    final void d(int i8) {
        int length = this.f30092s.length;
        if (i8 <= length) {
            return;
        }
        if (length == 0) {
            this.f30092s = new Object[Math.max(i8, 10)];
            return;
        }
        while (length < i8) {
            length = e(length);
        }
        this.f30092s = Arrays.copyOf(this.f30092s, length);
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC5267r0
    public final /* bridge */ /* synthetic */ InterfaceC5267r0 f(int i8) {
        if (i8 >= this.f30093t) {
            return new S0(i8 == 0 ? f30090u : Arrays.copyOf(this.f30092s, i8), this.f30093t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        K(i8);
        return this.f30092s[i8];
    }

    @Override // com.google.android.gms.internal.wearable.D, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        b();
        K(i8);
        Object[] objArr = this.f30092s;
        Object obj = objArr[i8];
        if (i8 < this.f30093t - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f30093t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        b();
        K(i8);
        Object[] objArr = this.f30092s;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30093t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i8 = this.f30093t;
        int length = this.f30092s.length;
        if (i8 == length) {
            this.f30092s = Arrays.copyOf(this.f30092s, e(length));
        }
        Object[] objArr = this.f30092s;
        int i9 = this.f30093t;
        this.f30093t = i9 + 1;
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
