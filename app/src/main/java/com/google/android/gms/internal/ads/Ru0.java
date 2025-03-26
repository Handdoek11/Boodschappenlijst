package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class Ru0 extends Yt0 implements RandomAccess, Vu0, InterfaceC4742yv0 {

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f18715u;

    /* renamed from: v, reason: collision with root package name */
    private static final Ru0 f18716v;

    /* renamed from: s, reason: collision with root package name */
    private int[] f18717s;

    /* renamed from: t, reason: collision with root package name */
    private int f18718t;

    static {
        int[] iArr = new int[0];
        f18715u = iArr;
        f18716v = new Ru0(iArr, 0, false);
    }

    private Ru0(int[] iArr, int i8, boolean z7) {
        super(z7);
        this.f18717s = iArr;
        this.f18718t = i8;
    }

    public static Ru0 e() {
        return f18716v;
    }

    private static int n(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String o(int i8) {
        return "Index:" + i8 + ", Size:" + this.f18718t;
    }

    private final void p(int i8) {
        if (i8 < 0 || i8 >= this.f18718t) {
            throw new IndexOutOfBoundsException(o(i8));
        }
    }

    @Override // com.google.android.gms.internal.ads.Zu0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final Vu0 g(int i8) {
        if (i8 >= this.f18718t) {
            return new Ru0(i8 == 0 ? f18715u : Arrays.copyOf(this.f18717s, i8), this.f18718t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.Vu0
    public final void K(int i8) {
        b();
        int i9 = this.f18718t;
        int length = this.f18717s.length;
        if (i9 == length) {
            int[] iArr = new int[n(length)];
            System.arraycopy(this.f18717s, 0, iArr, 0, this.f18718t);
            this.f18717s = iArr;
        }
        int[] iArr2 = this.f18717s;
        int i10 = this.f18718t;
        this.f18718t = i10 + 1;
        iArr2[i10] = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i8 < 0 || i8 > (i9 = this.f18718t)) {
            throw new IndexOutOfBoundsException(o(i8));
        }
        int i10 = i8 + 1;
        int[] iArr = this.f18717s;
        int length = iArr.length;
        if (i9 < length) {
            System.arraycopy(iArr, i8, iArr, i10, i9 - i8);
        } else {
            int[] iArr2 = new int[n(length)];
            System.arraycopy(this.f18717s, 0, iArr2, 0, i8);
            System.arraycopy(this.f18717s, i8, iArr2, i10, this.f18718t - i8);
            this.f18717s = iArr2;
        }
        this.f18717s[i8] = intValue;
        this.f18718t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Yt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = AbstractC2131av0.f20783b;
        collection.getClass();
        if (!(collection instanceof Ru0)) {
            return super.addAll(collection);
        }
        Ru0 ru0 = (Ru0) collection;
        int i8 = ru0.f18718t;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f18718t;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f18717s;
        if (i10 > iArr.length) {
            this.f18717s = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(ru0.f18717s, 0, this.f18717s, this.f18718t, ru0.f18718t);
        this.f18718t = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i8) {
        p(i8);
        return this.f18717s[i8];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i8, int i9) {
        b();
        p(i8);
        int[] iArr = this.f18717s;
        int i10 = iArr[i8];
        iArr[i8] = i9;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.Yt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ru0)) {
            return super.equals(obj);
        }
        Ru0 ru0 = (Ru0) obj;
        if (this.f18718t != ru0.f18718t) {
            return false;
        }
        int[] iArr = ru0.f18717s;
        for (int i8 = 0; i8 < this.f18718t; i8++) {
            if (this.f18717s[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        p(i8);
        return Integer.valueOf(this.f18717s[i8]);
    }

    @Override // com.google.android.gms.internal.ads.Yt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f18718t; i9++) {
            i8 = (i8 * 31) + this.f18717s[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i8 = this.f18718t;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f18717s[i9] == intValue) {
                return i9;
            }
        }
        return -1;
    }

    final void j(int i8) {
        int length = this.f18717s.length;
        if (i8 <= length) {
            return;
        }
        if (length == 0) {
            this.f18717s = new int[Math.max(i8, 10)];
            return;
        }
        while (length < i8) {
            length = n(length);
        }
        this.f18717s = Arrays.copyOf(this.f18717s, length);
    }

    @Override // com.google.android.gms.internal.ads.Yt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        b();
        p(i8);
        int[] iArr = this.f18717s;
        int i9 = iArr[i8];
        if (i8 < this.f18718t - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f18718t--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        b();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f18717s;
        System.arraycopy(iArr, i9, iArr, i8, this.f18718t - i9);
        this.f18718t -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        return Integer.valueOf(d(i8, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18718t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        K(((Integer) obj).intValue());
        return true;
    }
}
