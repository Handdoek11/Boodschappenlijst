package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5281y0 extends D implements RandomAccess, InterfaceC5266q0, P0 {

    /* renamed from: u, reason: collision with root package name */
    private static final long[] f30237u;

    /* renamed from: v, reason: collision with root package name */
    private static final C5281y0 f30238v;

    /* renamed from: s, reason: collision with root package name */
    private long[] f30239s;

    /* renamed from: t, reason: collision with root package name */
    private int f30240t;

    static {
        long[] jArr = new long[0];
        f30237u = jArr;
        f30238v = new C5281y0(jArr, 0, false);
    }

    private C5281y0(long[] jArr, int i8, boolean z7) {
        super(z7);
        this.f30239s = jArr;
        this.f30240t = i8;
    }

    public static C5281y0 d() {
        return f30238v;
    }

    private static int n(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String o(int i8) {
        return "Index:" + i8 + ", Size:" + this.f30240t;
    }

    private final void p(int i8) {
        if (i8 < 0 || i8 >= this.f30240t) {
            throw new IndexOutOfBoundsException(o(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        b();
        if (i8 < 0 || i8 > (i9 = this.f30240t)) {
            throw new IndexOutOfBoundsException(o(i8));
        }
        int i10 = i8 + 1;
        long[] jArr = this.f30239s;
        int length = jArr.length;
        if (i9 < length) {
            System.arraycopy(jArr, i8, jArr, i10, i9 - i8);
        } else {
            long[] jArr2 = new long[n(length)];
            System.arraycopy(this.f30239s, 0, jArr2, 0, i8);
            System.arraycopy(this.f30239s, i8, jArr2, i10, this.f30240t - i8);
            this.f30239s = jArr2;
        }
        this.f30239s[i8] = longValue;
        this.f30240t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.D, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = AbstractC5269s0.f30213b;
        collection.getClass();
        if (!(collection instanceof C5281y0)) {
            return super.addAll(collection);
        }
        C5281y0 c5281y0 = (C5281y0) collection;
        int i8 = c5281y0.f30240t;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f30240t;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        long[] jArr = this.f30239s;
        if (i10 > jArr.length) {
            this.f30239s = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(c5281y0.f30239s, 0, this.f30239s, this.f30240t, c5281y0.f30240t);
        this.f30240t = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i8) {
        p(i8);
        return this.f30239s[i8];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j8) {
        b();
        int i8 = this.f30240t;
        int length = this.f30239s.length;
        if (i8 == length) {
            long[] jArr = new long[n(length)];
            System.arraycopy(this.f30239s, 0, jArr, 0, this.f30240t);
            this.f30239s = jArr;
        }
        long[] jArr2 = this.f30239s;
        int i9 = this.f30240t;
        this.f30240t = i9 + 1;
        jArr2[i9] = j8;
    }

    @Override // com.google.android.gms.internal.wearable.D, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5281y0)) {
            return super.equals(obj);
        }
        C5281y0 c5281y0 = (C5281y0) obj;
        if (this.f30240t != c5281y0.f30240t) {
            return false;
        }
        long[] jArr = c5281y0.f30239s;
        for (int i8 = 0; i8 < this.f30240t; i8++) {
            if (this.f30239s[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        p(i8);
        return Long.valueOf(this.f30239s[i8]);
    }

    @Override // com.google.android.gms.internal.wearable.D, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f30240t; i9++) {
            long j8 = this.f30239s[i9];
            byte[] bArr = AbstractC5269s0.f30213b;
            i8 = (i8 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i8 = this.f30240t;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f30239s[i9] == longValue) {
                return i9;
            }
        }
        return -1;
    }

    final void j(int i8) {
        int length = this.f30239s.length;
        if (i8 <= length) {
            return;
        }
        if (length == 0) {
            this.f30239s = new long[Math.max(i8, 10)];
            return;
        }
        while (length < i8) {
            length = n(length);
        }
        this.f30239s = Arrays.copyOf(this.f30239s, length);
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC5267r0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5266q0 f(int i8) {
        if (i8 >= this.f30240t) {
            return new C5281y0(i8 == 0 ? f30237u : Arrays.copyOf(this.f30239s, i8), this.f30240t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.wearable.D, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        b();
        p(i8);
        long[] jArr = this.f30239s;
        long j8 = jArr[i8];
        if (i8 < this.f30240t - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f30240t--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        b();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f30239s;
        System.arraycopy(jArr, i9, jArr, i8, this.f30240t - i9);
        this.f30240t -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        p(i8);
        long[] jArr = this.f30239s;
        long j8 = jArr[i8];
        jArr[i8] = longValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30240t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
