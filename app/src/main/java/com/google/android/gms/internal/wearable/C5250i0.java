package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5250i0 extends D implements RandomAccess, InterfaceC5264p0, P0 {

    /* renamed from: u, reason: collision with root package name */
    private static final float[] f30186u;

    /* renamed from: v, reason: collision with root package name */
    private static final C5250i0 f30187v;

    /* renamed from: s, reason: collision with root package name */
    private float[] f30188s;

    /* renamed from: t, reason: collision with root package name */
    private int f30189t;

    static {
        float[] fArr = new float[0];
        f30186u = fArr;
        f30187v = new C5250i0(fArr, 0, false);
    }

    private C5250i0(float[] fArr, int i8, boolean z7) {
        super(z7);
        this.f30188s = fArr;
        this.f30189t = i8;
    }

    public static C5250i0 d() {
        return f30187v;
    }

    private static int j(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String n(int i8) {
        return "Index:" + i8 + ", Size:" + this.f30189t;
    }

    private final void o(int i8) {
        if (i8 < 0 || i8 >= this.f30189t) {
            throw new IndexOutOfBoundsException(n(i8));
        }
    }

    final void K(int i8) {
        int length = this.f30188s.length;
        if (i8 <= length) {
            return;
        }
        if (length == 0) {
            this.f30188s = new float[Math.max(i8, 10)];
            return;
        }
        while (length < i8) {
            length = j(length);
        }
        this.f30188s = Arrays.copyOf(this.f30188s, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i8 < 0 || i8 > (i9 = this.f30189t)) {
            throw new IndexOutOfBoundsException(n(i8));
        }
        int i10 = i8 + 1;
        float[] fArr = this.f30188s;
        int length = fArr.length;
        if (i9 < length) {
            System.arraycopy(fArr, i8, fArr, i10, i9 - i8);
        } else {
            float[] fArr2 = new float[j(length)];
            System.arraycopy(this.f30188s, 0, fArr2, 0, i8);
            System.arraycopy(this.f30188s, i8, fArr2, i10, this.f30189t - i8);
            this.f30188s = fArr2;
        }
        this.f30188s[i8] = floatValue;
        this.f30189t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.D, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = AbstractC5269s0.f30213b;
        collection.getClass();
        if (!(collection instanceof C5250i0)) {
            return super.addAll(collection);
        }
        C5250i0 c5250i0 = (C5250i0) collection;
        int i8 = c5250i0.f30189t;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f30189t;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        float[] fArr = this.f30188s;
        if (i10 > fArr.length) {
            this.f30188s = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(c5250i0.f30188s, 0, this.f30188s, this.f30189t, c5250i0.f30189t);
        this.f30189t = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final float c(int i8) {
        o(i8);
        return this.f30188s[i8];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f8) {
        b();
        int i8 = this.f30189t;
        int length = this.f30188s.length;
        if (i8 == length) {
            float[] fArr = new float[j(length)];
            System.arraycopy(this.f30188s, 0, fArr, 0, this.f30189t);
            this.f30188s = fArr;
        }
        float[] fArr2 = this.f30188s;
        int i9 = this.f30189t;
        this.f30189t = i9 + 1;
        fArr2[i9] = f8;
    }

    @Override // com.google.android.gms.internal.wearable.D, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5250i0)) {
            return super.equals(obj);
        }
        C5250i0 c5250i0 = (C5250i0) obj;
        if (this.f30189t != c5250i0.f30189t) {
            return false;
        }
        float[] fArr = c5250i0.f30188s;
        for (int i8 = 0; i8 < this.f30189t; i8++) {
            if (Float.floatToIntBits(this.f30188s[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        o(i8);
        return Float.valueOf(this.f30188s[i8]);
    }

    @Override // com.google.android.gms.internal.wearable.D, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f30189t; i9++) {
            i8 = (i8 * 31) + Float.floatToIntBits(this.f30188s[i9]);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i8 = this.f30189t;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f30188s[i9] == floatValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.wearable.D, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        b();
        o(i8);
        float[] fArr = this.f30188s;
        float f8 = fArr[i8];
        if (i8 < this.f30189t - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (r2 - i8) - 1);
        }
        this.f30189t--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        b();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f30188s;
        System.arraycopy(fArr, i9, fArr, i8, this.f30189t - i9);
        this.f30189t -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        o(i8);
        float[] fArr = this.f30188s;
        float f8 = fArr[i8];
        fArr[i8] = floatValue;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30189t;
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC5267r0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5264p0 f(int i8) {
        if (i8 >= this.f30189t) {
            return new C5250i0(i8 == 0 ? f30186u : Arrays.copyOf(this.f30188s, i8), this.f30189t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
