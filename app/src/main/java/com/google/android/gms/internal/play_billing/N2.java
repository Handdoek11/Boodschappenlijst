package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class N2 extends AbstractC5092c2 implements RandomAccess, P2, InterfaceC5165o3 {

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f29789u;

    /* renamed from: v, reason: collision with root package name */
    private static final N2 f29790v;

    /* renamed from: s, reason: collision with root package name */
    private int[] f29791s;

    /* renamed from: t, reason: collision with root package name */
    private int f29792t;

    static {
        int[] iArr = new int[0];
        f29789u = iArr;
        f29790v = new N2(iArr, 0, false);
    }

    private N2(int[] iArr, int i8, boolean z7) {
        super(z7);
        this.f29791s = iArr;
        this.f29792t = i8;
    }

    public static N2 d() {
        return f29790v;
    }

    private static int n(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String o(int i8) {
        return "Index:" + i8 + ", Size:" + this.f29792t;
    }

    private final void p(int i8) {
        if (i8 < 0 || i8 >= this.f29792t) {
            throw new IndexOutOfBoundsException(o(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i8 < 0 || i8 > (i9 = this.f29792t)) {
            throw new IndexOutOfBoundsException(o(i8));
        }
        int i10 = i8 + 1;
        int[] iArr = this.f29791s;
        int length = iArr.length;
        if (i9 < length) {
            System.arraycopy(iArr, i8, iArr, i10, i9 - i8);
        } else {
            int[] iArr2 = new int[n(length)];
            System.arraycopy(this.f29791s, 0, iArr2, 0, i8);
            System.arraycopy(this.f29791s, i8, iArr2, i10, this.f29792t - i8);
            this.f29791s = iArr2;
        }
        this.f29791s[i8] = intValue;
        this.f29792t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5092c2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = R2.f29810b;
        collection.getClass();
        if (!(collection instanceof N2)) {
            return super.addAll(collection);
        }
        N2 n22 = (N2) collection;
        int i8 = n22.f29792t;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f29792t;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f29791s;
        if (i10 > iArr.length) {
            this.f29791s = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(n22.f29791s, 0, this.f29791s, this.f29792t, n22.f29792t);
        this.f29792t = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i8) {
        p(i8);
        return this.f29791s[i8];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i8) {
        b();
        int i9 = this.f29792t;
        int length = this.f29791s.length;
        if (i9 == length) {
            int[] iArr = new int[n(length)];
            System.arraycopy(this.f29791s, 0, iArr, 0, this.f29792t);
            this.f29791s = iArr;
        }
        int[] iArr2 = this.f29791s;
        int i10 = this.f29792t;
        this.f29792t = i10 + 1;
        iArr2[i10] = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5092c2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N2)) {
            return super.equals(obj);
        }
        N2 n22 = (N2) obj;
        if (this.f29792t != n22.f29792t) {
            return false;
        }
        int[] iArr = n22.f29791s;
        for (int i8 = 0; i8 < this.f29792t; i8++) {
            if (this.f29791s[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.Q2
    public final /* bridge */ /* synthetic */ Q2 f(int i8) {
        if (i8 >= this.f29792t) {
            return new N2(i8 == 0 ? f29789u : Arrays.copyOf(this.f29791s, i8), this.f29792t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        p(i8);
        return Integer.valueOf(this.f29791s[i8]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5092c2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f29792t; i9++) {
            i8 = (i8 * 31) + this.f29791s[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i8 = this.f29792t;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f29791s[i9] == intValue) {
                return i9;
            }
        }
        return -1;
    }

    final void j(int i8) {
        int length = this.f29791s.length;
        if (i8 <= length) {
            return;
        }
        if (length == 0) {
            this.f29791s = new int[Math.max(i8, 10)];
            return;
        }
        while (length < i8) {
            length = n(length);
        }
        this.f29791s = Arrays.copyOf(this.f29791s, length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5092c2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        b();
        p(i8);
        int[] iArr = this.f29791s;
        int i9 = iArr[i8];
        if (i8 < this.f29792t - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f29792t--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        b();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f29791s;
        System.arraycopy(iArr, i9, iArr, i8, this.f29792t - i9);
        this.f29792t -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        p(i8);
        int[] iArr = this.f29791s;
        int i9 = iArr[i8];
        iArr[i8] = intValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29792t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
