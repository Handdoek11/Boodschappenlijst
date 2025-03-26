package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4929h5 extends E3 implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    private static final Object[] f29320u;

    /* renamed from: v, reason: collision with root package name */
    private static final C4929h5 f29321v;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f29322s;

    /* renamed from: t, reason: collision with root package name */
    private int f29323t;

    static {
        Object[] objArr = new Object[0];
        f29320u = objArr;
        f29321v = new C4929h5(objArr, 0, false);
    }

    private C4929h5(Object[] objArr, int i8, boolean z7) {
        super(z7);
        this.f29322s = objArr;
        this.f29323t = i8;
    }

    private static int d(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    public static C4929h5 e() {
        return f29321v;
    }

    private final String j(int i8) {
        return "Index:" + i8 + ", Size:" + this.f29323t;
    }

    private final void n(int i8) {
        if (i8 < 0 || i8 >= this.f29323t) {
            throw new IndexOutOfBoundsException(j(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        b();
        if (i8 < 0 || i8 > (i9 = this.f29323t)) {
            throw new IndexOutOfBoundsException(j(i8));
        }
        Object[] objArr = this.f29322s;
        if (i9 < objArr.length) {
            System.arraycopy(objArr, i8, objArr, i8 + 1, i9 - i8);
        } else {
            Object[] objArr2 = new Object[d(objArr.length)];
            System.arraycopy(this.f29322s, 0, objArr2, 0, i8);
            System.arraycopy(this.f29322s, i8, objArr2, i8 + 1, this.f29323t - i8);
            this.f29322s = objArr2;
        }
        this.f29322s[i8] = obj;
        this.f29323t++;
        ((AbstractList) this).modCount++;
    }

    final void c(int i8) {
        Object[] objArr = this.f29322s;
        if (i8 <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.f29322s = new Object[Math.max(i8, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i8) {
            length = d(length);
        }
        this.f29322s = Arrays.copyOf(this.f29322s, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        n(i8);
        return this.f29322s[i8];
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final /* synthetic */ A4 m(int i8) {
        if (i8 >= this.f29323t) {
            return new C4929h5(i8 == 0 ? f29320u : Arrays.copyOf(this.f29322s, i8), this.f29323t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.E3, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        b();
        n(i8);
        Object[] objArr = this.f29322s;
        Object obj = objArr[i8];
        if (i8 < this.f29323t - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f29323t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        b();
        n(i8);
        Object[] objArr = this.f29322s;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29323t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i8 = this.f29323t;
        Object[] objArr = this.f29322s;
        if (i8 == objArr.length) {
            this.f29322s = Arrays.copyOf(this.f29322s, d(objArr.length));
        }
        Object[] objArr2 = this.f29322s;
        int i9 = this.f29323t;
        this.f29323t = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
