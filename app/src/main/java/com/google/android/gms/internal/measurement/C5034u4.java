package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5034u4 extends E3 implements InterfaceC5074z4, InterfaceC4920g5, RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f29586u;

    /* renamed from: v, reason: collision with root package name */
    private static final C5034u4 f29587v;

    /* renamed from: s, reason: collision with root package name */
    private int[] f29588s;

    /* renamed from: t, reason: collision with root package name */
    private int f29589t;

    static {
        int[] iArr = new int[0];
        f29586u = iArr;
        f29587v = new C5034u4(iArr, 0, false);
    }

    private C5034u4(int[] iArr, int i8, boolean z7) {
        super(z7);
        this.f29588s = iArr;
        this.f29589t = i8;
    }

    public static C5034u4 d() {
        return f29587v;
    }

    private static int n(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String o(int i8) {
        return "Index:" + i8 + ", Size:" + this.f29589t;
    }

    private final void p(int i8) {
        if (i8 < 0 || i8 >= this.f29589t) {
            throw new IndexOutOfBoundsException(o(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.A4
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5074z4 m(int i8) {
        if (i8 >= this.f29589t) {
            return new C5034u4(i8 == 0 ? f29586u : Arrays.copyOf(this.f29588s, i8), this.f29589t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i8 < 0 || i8 > (i9 = this.f29589t)) {
            throw new IndexOutOfBoundsException(o(i8));
        }
        int[] iArr = this.f29588s;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i9 - i8);
        } else {
            int[] iArr2 = new int[n(iArr.length)];
            System.arraycopy(this.f29588s, 0, iArr2, 0, i8);
            System.arraycopy(this.f29588s, i8, iArr2, i8 + 1, this.f29589t - i8);
            this.f29588s = iArr2;
        }
        this.f29588s[i8] = intValue;
        this.f29589t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.E3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        AbstractC5026t4.e(collection);
        if (!(collection instanceof C5034u4)) {
            return super.addAll(collection);
        }
        C5034u4 c5034u4 = (C5034u4) collection;
        int i8 = c5034u4.f29589t;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f29589t;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f29588s;
        if (i10 > iArr.length) {
            this.f29588s = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(c5034u4.f29588s, 0, this.f29588s, this.f29589t, c5034u4.f29589t);
        this.f29589t = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i8) {
        p(i8);
        return this.f29588s[i8];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i8) {
        b();
        int i9 = this.f29589t;
        int[] iArr = this.f29588s;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[n(iArr.length)];
            System.arraycopy(this.f29588s, 0, iArr2, 0, this.f29589t);
            this.f29588s = iArr2;
        }
        int[] iArr3 = this.f29588s;
        int i10 = this.f29589t;
        this.f29589t = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // com.google.android.gms.internal.measurement.E3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5034u4)) {
            return super.equals(obj);
        }
        C5034u4 c5034u4 = (C5034u4) obj;
        if (this.f29589t != c5034u4.f29589t) {
            return false;
        }
        int[] iArr = c5034u4.f29588s;
        for (int i8 = 0; i8 < this.f29589t; i8++) {
            if (this.f29588s[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        return Integer.valueOf(c(i8));
    }

    @Override // com.google.android.gms.internal.measurement.E3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f29589t; i9++) {
            i8 = (i8 * 31) + this.f29588s[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f29588s[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    final void j(int i8) {
        int[] iArr = this.f29588s;
        if (i8 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f29588s = new int[Math.max(i8, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i8) {
            length = n(length);
        }
        this.f29588s = Arrays.copyOf(this.f29588s, length);
    }

    @Override // com.google.android.gms.internal.measurement.E3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        b();
        p(i8);
        int[] iArr = this.f29588s;
        int i9 = iArr[i8];
        if (i8 < this.f29589t - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f29589t--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        b();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f29588s;
        System.arraycopy(iArr, i9, iArr, i8, this.f29589t - i9);
        this.f29589t -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        p(i8);
        int[] iArr = this.f29588s;
        int i9 = iArr[i8];
        iArr[i8] = intValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29589t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
