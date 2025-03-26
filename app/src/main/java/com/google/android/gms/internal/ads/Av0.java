package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class Av0 extends Yt0 implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    private static final Object[] f13695u;

    /* renamed from: v, reason: collision with root package name */
    private static final Av0 f13696v;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f13697s;

    /* renamed from: t, reason: collision with root package name */
    private int f13698t;

    static {
        Object[] objArr = new Object[0];
        f13695u = objArr;
        f13696v = new Av0(objArr, 0, false);
    }

    private Av0(Object[] objArr, int i8, boolean z7) {
        super(z7);
        this.f13697s = objArr;
        this.f13698t = i8;
    }

    private final void K(int i8) {
        if (i8 < 0 || i8 >= this.f13698t) {
            throw new IndexOutOfBoundsException(j(i8));
        }
    }

    public static Av0 c() {
        return f13696v;
    }

    private static int e(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String j(int i8) {
        return "Index:" + i8 + ", Size:" + this.f13698t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        b();
        if (i8 < 0 || i8 > (i9 = this.f13698t)) {
            throw new IndexOutOfBoundsException(j(i8));
        }
        int i10 = i8 + 1;
        Object[] objArr = this.f13697s;
        int length = objArr.length;
        if (i9 < length) {
            System.arraycopy(objArr, i8, objArr, i10, i9 - i8);
        } else {
            Object[] objArr2 = new Object[e(length)];
            System.arraycopy(this.f13697s, 0, objArr2, 0, i8);
            System.arraycopy(this.f13697s, i8, objArr2, i10, this.f13698t - i8);
            this.f13697s = objArr2;
        }
        this.f13697s[i8] = obj;
        this.f13698t++;
        ((AbstractList) this).modCount++;
    }

    final void d(int i8) {
        int length = this.f13697s.length;
        if (i8 <= length) {
            return;
        }
        if (length == 0) {
            this.f13697s = new Object[Math.max(i8, 10)];
            return;
        }
        while (length < i8) {
            length = e(length);
        }
        this.f13697s = Arrays.copyOf(this.f13697s, length);
    }

    @Override // com.google.android.gms.internal.ads.Zu0
    public final /* bridge */ /* synthetic */ Zu0 g(int i8) {
        if (i8 >= this.f13698t) {
            return new Av0(i8 == 0 ? f13695u : Arrays.copyOf(this.f13697s, i8), this.f13698t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        K(i8);
        return this.f13697s[i8];
    }

    @Override // com.google.android.gms.internal.ads.Yt0, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        b();
        K(i8);
        Object[] objArr = this.f13697s;
        Object obj = objArr[i8];
        if (i8 < this.f13698t - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f13698t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        b();
        K(i8);
        Object[] objArr = this.f13697s;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13698t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i8 = this.f13698t;
        int length = this.f13697s.length;
        if (i8 == length) {
            this.f13697s = Arrays.copyOf(this.f13697s, e(length));
        }
        Object[] objArr = this.f13697s;
        int i9 = this.f13698t;
        this.f13698t = i9 + 1;
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
