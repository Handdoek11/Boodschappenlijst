package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.gv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2783gv0 extends Yt0 implements RandomAccess, Yu0, InterfaceC4742yv0 {

    /* renamed from: u, reason: collision with root package name */
    private static final long[] f22457u;

    /* renamed from: v, reason: collision with root package name */
    private static final C2783gv0 f22458v;

    /* renamed from: s, reason: collision with root package name */
    private long[] f22459s;

    /* renamed from: t, reason: collision with root package name */
    private int f22460t;

    static {
        long[] jArr = new long[0];
        f22457u = jArr;
        f22458v = new C2783gv0(jArr, 0, false);
    }

    private C2783gv0(long[] jArr, int i8, boolean z7) {
        super(z7);
        this.f22459s = jArr;
        this.f22460t = i8;
    }

    public static C2783gv0 j() {
        return f22458v;
    }

    private static int n(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String o(int i8) {
        return "Index:" + i8 + ", Size:" + this.f22460t;
    }

    private final void p(int i8) {
        if (i8 < 0 || i8 >= this.f22460t) {
            throw new IndexOutOfBoundsException(o(i8));
        }
    }

    @Override // com.google.android.gms.internal.ads.Zu0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Yu0 g(int i8) {
        if (i8 >= this.f22460t) {
            return new C2783gv0(i8 == 0 ? f22457u : Arrays.copyOf(this.f22459s, i8), this.f22460t, true);
        }
        throw new IllegalArgumentException();
    }

    final void K(int i8) {
        int length = this.f22459s.length;
        if (i8 <= length) {
            return;
        }
        if (length == 0) {
            this.f22459s = new long[Math.max(i8, 10)];
            return;
        }
        while (length < i8) {
            length = n(length);
        }
        this.f22459s = Arrays.copyOf(this.f22459s, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        b();
        if (i8 < 0 || i8 > (i9 = this.f22460t)) {
            throw new IndexOutOfBoundsException(o(i8));
        }
        int i10 = i8 + 1;
        long[] jArr = this.f22459s;
        int length = jArr.length;
        if (i9 < length) {
            System.arraycopy(jArr, i8, jArr, i10, i9 - i8);
        } else {
            long[] jArr2 = new long[n(length)];
            System.arraycopy(this.f22459s, 0, jArr2, 0, i8);
            System.arraycopy(this.f22459s, i8, jArr2, i10, this.f22460t - i8);
            this.f22459s = jArr2;
        }
        this.f22459s[i8] = longValue;
        this.f22460t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Yt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = AbstractC2131av0.f20783b;
        collection.getClass();
        if (!(collection instanceof C2783gv0)) {
            return super.addAll(collection);
        }
        C2783gv0 c2783gv0 = (C2783gv0) collection;
        int i8 = c2783gv0.f22460t;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f22460t;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        long[] jArr = this.f22459s;
        if (i10 > jArr.length) {
            this.f22459s = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(c2783gv0.f22459s, 0, this.f22459s, this.f22460t, c2783gv0.f22460t);
        this.f22460t = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i8) {
        p(i8);
        return this.f22459s[i8];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long d(int i8, long j8) {
        b();
        p(i8);
        long[] jArr = this.f22459s;
        long j9 = jArr[i8];
        jArr[i8] = j8;
        return j9;
    }

    public final void e(long j8) {
        b();
        int i8 = this.f22460t;
        int length = this.f22459s.length;
        if (i8 == length) {
            long[] jArr = new long[n(length)];
            System.arraycopy(this.f22459s, 0, jArr, 0, this.f22460t);
            this.f22459s = jArr;
        }
        long[] jArr2 = this.f22459s;
        int i9 = this.f22460t;
        this.f22460t = i9 + 1;
        jArr2[i9] = j8;
    }

    @Override // com.google.android.gms.internal.ads.Yt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2783gv0)) {
            return super.equals(obj);
        }
        C2783gv0 c2783gv0 = (C2783gv0) obj;
        if (this.f22460t != c2783gv0.f22460t) {
            return false;
        }
        long[] jArr = c2783gv0.f22459s;
        for (int i8 = 0; i8 < this.f22460t; i8++) {
            if (this.f22459s[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        p(i8);
        return Long.valueOf(this.f22459s[i8]);
    }

    @Override // com.google.android.gms.internal.ads.Yt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f22460t; i9++) {
            long j8 = this.f22459s[i9];
            byte[] bArr = AbstractC2131av0.f20783b;
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
        int i8 = this.f22460t;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f22459s[i9] == longValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Yt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        b();
        p(i8);
        long[] jArr = this.f22459s;
        long j8 = jArr[i8];
        if (i8 < this.f22460t - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f22460t--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        b();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f22459s;
        System.arraycopy(jArr, i9, jArr, i8, this.f22460t - i9);
        this.f22460t -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        return Long.valueOf(d(i8, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22460t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
