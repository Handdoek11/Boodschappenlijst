package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5177q3 extends AbstractC5092c2 implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    private static final Object[] f29973u;

    /* renamed from: v, reason: collision with root package name */
    private static final C5177q3 f29974v;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f29975s;

    /* renamed from: t, reason: collision with root package name */
    private int f29976t;

    static {
        Object[] objArr = new Object[0];
        f29973u = objArr;
        f29974v = new C5177q3(objArr, 0, false);
    }

    private C5177q3(Object[] objArr, int i8, boolean z7) {
        super(z7);
        this.f29975s = objArr;
        this.f29976t = i8;
    }

    private final void K(int i8) {
        if (i8 < 0 || i8 >= this.f29976t) {
            throw new IndexOutOfBoundsException(j(i8));
        }
    }

    public static C5177q3 c() {
        return f29974v;
    }

    private static int e(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String j(int i8) {
        return "Index:" + i8 + ", Size:" + this.f29976t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        b();
        if (i8 < 0 || i8 > (i9 = this.f29976t)) {
            throw new IndexOutOfBoundsException(j(i8));
        }
        int i10 = i8 + 1;
        Object[] objArr = this.f29975s;
        int length = objArr.length;
        if (i9 < length) {
            System.arraycopy(objArr, i8, objArr, i10, i9 - i8);
        } else {
            Object[] objArr2 = new Object[e(length)];
            System.arraycopy(this.f29975s, 0, objArr2, 0, i8);
            System.arraycopy(this.f29975s, i8, objArr2, i10, this.f29976t - i8);
            this.f29975s = objArr2;
        }
        this.f29975s[i8] = obj;
        this.f29976t++;
        ((AbstractList) this).modCount++;
    }

    final void d(int i8) {
        int length = this.f29975s.length;
        if (i8 <= length) {
            return;
        }
        if (length == 0) {
            this.f29975s = new Object[Math.max(i8, 10)];
            return;
        }
        while (length < i8) {
            length = e(length);
        }
        this.f29975s = Arrays.copyOf(this.f29975s, length);
    }

    @Override // com.google.android.gms.internal.play_billing.Q2
    public final /* bridge */ /* synthetic */ Q2 f(int i8) {
        if (i8 >= this.f29976t) {
            return new C5177q3(i8 == 0 ? f29973u : Arrays.copyOf(this.f29975s, i8), this.f29976t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        K(i8);
        return this.f29975s[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5092c2, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        b();
        K(i8);
        Object[] objArr = this.f29975s;
        Object obj = objArr[i8];
        if (i8 < this.f29976t - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f29976t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        b();
        K(i8);
        Object[] objArr = this.f29975s;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29976t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i8 = this.f29976t;
        int length = this.f29975s.length;
        if (i8 == length) {
            this.f29975s = Arrays.copyOf(this.f29975s, e(length));
        }
        Object[] objArr = this.f29975s;
        int i9 = this.f29976t;
        this.f29976t = i9 + 1;
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
