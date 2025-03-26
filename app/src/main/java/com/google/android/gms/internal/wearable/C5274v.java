package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5274v extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: o, reason: collision with root package name */
    final float[] f30228o;

    /* renamed from: s, reason: collision with root package name */
    final int f30229s;

    /* renamed from: t, reason: collision with root package name */
    final int f30230t;

    C5274v(float[] fArr, int i8, int i9) {
        this.f30228o = fArr;
        this.f30229s = i8;
        this.f30230t = i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Float) && AbstractC5276w.a(this.f30228o, ((Float) obj).floatValue(), this.f30229s, this.f30230t) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5274v)) {
            return super.equals(obj);
        }
        C5274v c5274v = (C5274v) obj;
        int i8 = this.f30230t - this.f30229s;
        if (c5274v.f30230t - c5274v.f30229s != i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f30228o[this.f30229s + i9] != c5274v.f30228o[c5274v.f30229s + i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC5261o.a(i8, this.f30230t - this.f30229s, "index");
        return Float.valueOf(this.f30228o[this.f30229s + i8]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = this.f30229s; i9 < this.f30230t; i9++) {
            i8 = (i8 * 31) + Float.valueOf(this.f30228o[i9]).hashCode();
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int a8;
        if (!(obj instanceof Float) || (a8 = AbstractC5276w.a(this.f30228o, ((Float) obj).floatValue(), this.f30229s, this.f30230t)) < 0) {
            return -1;
        }
        return a8 - this.f30229s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.f30228o;
            float floatValue = ((Float) obj).floatValue();
            int i8 = this.f30229s;
            int i9 = this.f30230t - 1;
            while (true) {
                if (i9 < i8) {
                    i9 = -1;
                    break;
                }
                if (fArr[i9] == floatValue) {
                    break;
                }
                i9--;
            }
            if (i9 >= 0) {
                return i9 - this.f30229s;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        Float f8 = (Float) obj;
        AbstractC5261o.a(i8, this.f30230t - this.f30229s, "index");
        float[] fArr = this.f30228o;
        int i9 = this.f30229s + i8;
        float f9 = fArr[i9];
        f8.getClass();
        fArr[i9] = f8.floatValue();
        return Float.valueOf(f9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30230t - this.f30229s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i8, int i9) {
        AbstractC5261o.b(i8, i9, this.f30230t - this.f30229s);
        if (i8 == i9) {
            return Collections.emptyList();
        }
        float[] fArr = this.f30228o;
        int i10 = this.f30229s;
        return new C5274v(fArr, i10 + i8, i9 + i10);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f30230t - this.f30229s) * 12);
        sb.append('[');
        sb.append(this.f30228o[this.f30229s]);
        int i8 = this.f30229s;
        while (true) {
            i8++;
            if (i8 >= this.f30230t) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f30228o[i8]);
        }
    }
}
