package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class G4 extends E3 implements InterfaceC5058x4, InterfaceC4920g5, RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    private static final long[] f28873u;

    /* renamed from: v, reason: collision with root package name */
    private static final G4 f28874v;

    /* renamed from: s, reason: collision with root package name */
    private long[] f28875s;

    /* renamed from: t, reason: collision with root package name */
    private int f28876t;

    static {
        long[] jArr = new long[0];
        f28873u = jArr;
        f28874v = new G4(jArr, 0, false);
    }

    private G4(long[] jArr, int i8, boolean z7) {
        super(z7);
        this.f28875s = jArr;
        this.f28876t = i8;
    }

    public static G4 d() {
        return f28874v;
    }

    private static int j(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String n(int i8) {
        return "Index:" + i8 + ", Size:" + this.f28876t;
    }

    private final void o(int i8) {
        if (i8 < 0 || i8 >= this.f28876t) {
            throw new IndexOutOfBoundsException(n(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5058x4
    public final long A(int i8) {
        o(i8);
        return this.f28875s[i8];
    }

    @Override // com.google.android.gms.internal.measurement.A4
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5058x4 m(int i8) {
        if (i8 >= this.f28876t) {
            return new G4(i8 == 0 ? f28873u : Arrays.copyOf(this.f28875s, i8), this.f28876t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        b();
        if (i8 < 0 || i8 > (i9 = this.f28876t)) {
            throw new IndexOutOfBoundsException(n(i8));
        }
        long[] jArr = this.f28875s;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
        } else {
            long[] jArr2 = new long[j(jArr.length)];
            System.arraycopy(this.f28875s, 0, jArr2, 0, i8);
            System.arraycopy(this.f28875s, i8, jArr2, i8 + 1, this.f28876t - i8);
            this.f28875s = jArr2;
        }
        this.f28875s[i8] = longValue;
        this.f28876t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.E3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        AbstractC5026t4.e(collection);
        if (!(collection instanceof G4)) {
            return super.addAll(collection);
        }
        G4 g42 = (G4) collection;
        int i8 = g42.f28876t;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f28876t;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        long[] jArr = this.f28875s;
        if (i10 > jArr.length) {
            this.f28875s = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(g42.f28875s, 0, this.f28875s, this.f28876t, g42.f28876t);
        this.f28876t = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(long j8) {
        b();
        int i8 = this.f28876t;
        long[] jArr = this.f28875s;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[j(jArr.length)];
            System.arraycopy(this.f28875s, 0, jArr2, 0, this.f28876t);
            this.f28875s = jArr2;
        }
        long[] jArr3 = this.f28875s;
        int i9 = this.f28876t;
        this.f28876t = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    final void e(int i8) {
        long[] jArr = this.f28875s;
        if (i8 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f28875s = new long[Math.max(i8, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i8) {
            length = j(length);
        }
        this.f28875s = Arrays.copyOf(this.f28875s, length);
    }

    @Override // com.google.android.gms.internal.measurement.E3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G4)) {
            return super.equals(obj);
        }
        G4 g42 = (G4) obj;
        if (this.f28876t != g42.f28876t) {
            return false;
        }
        long[] jArr = g42.f28875s;
        for (int i8 = 0; i8 < this.f28876t; i8++) {
            if (this.f28875s[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        return Long.valueOf(A(i8));
    }

    @Override // com.google.android.gms.internal.measurement.E3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f28876t; i9++) {
            i8 = (i8 * 31) + AbstractC5026t4.b(this.f28875s[i9]);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f28875s[i8] == longValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.E3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        b();
        o(i8);
        long[] jArr = this.f28875s;
        long j8 = jArr[i8];
        if (i8 < this.f28876t - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f28876t--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        b();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f28875s;
        System.arraycopy(jArr, i9, jArr, i8, this.f28876t - i9);
        this.f28876t -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        o(i8);
        long[] jArr = this.f28875s;
        long j8 = jArr[i8];
        jArr[i8] = longValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28876t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        c(((Long) obj).longValue());
        return true;
    }
}
