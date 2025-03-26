package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5280y extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: o, reason: collision with root package name */
    final long[] f30234o;

    /* renamed from: s, reason: collision with root package name */
    final int f30235s;

    /* renamed from: t, reason: collision with root package name */
    final int f30236t;

    C5280y(long[] jArr, int i8, int i9) {
        this.f30234o = jArr;
        this.f30235s = i8;
        this.f30236t = i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Long) && AbstractC5282z.a(this.f30234o, ((Long) obj).longValue(), this.f30235s, this.f30236t) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5280y)) {
            return super.equals(obj);
        }
        C5280y c5280y = (C5280y) obj;
        int i8 = this.f30236t - this.f30235s;
        if (c5280y.f30236t - c5280y.f30235s != i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f30234o[this.f30235s + i9] != c5280y.f30234o[c5280y.f30235s + i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC5261o.a(i8, this.f30236t - this.f30235s, "index");
        return Long.valueOf(this.f30234o[this.f30235s + i8]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = this.f30235s; i9 < this.f30236t; i9++) {
            long j8 = this.f30234o[i9];
            i8 = (i8 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int a8;
        if (!(obj instanceof Long) || (a8 = AbstractC5282z.a(this.f30234o, ((Long) obj).longValue(), this.f30235s, this.f30236t)) < 0) {
            return -1;
        }
        return a8 - this.f30235s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            long[] jArr = this.f30234o;
            long longValue = ((Long) obj).longValue();
            int i8 = this.f30235s;
            int i9 = this.f30236t - 1;
            while (true) {
                if (i9 < i8) {
                    i9 = -1;
                    break;
                }
                if (jArr[i9] == longValue) {
                    break;
                }
                i9--;
            }
            if (i9 >= 0) {
                return i9 - this.f30235s;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        Long l8 = (Long) obj;
        AbstractC5261o.a(i8, this.f30236t - this.f30235s, "index");
        long[] jArr = this.f30234o;
        int i9 = this.f30235s + i8;
        long j8 = jArr[i9];
        l8.getClass();
        jArr[i9] = l8.longValue();
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30236t - this.f30235s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i8, int i9) {
        AbstractC5261o.b(i8, i9, this.f30236t - this.f30235s);
        if (i8 == i9) {
            return Collections.emptyList();
        }
        long[] jArr = this.f30234o;
        int i10 = this.f30235s;
        return new C5280y(jArr, i10 + i8, i9 + i10);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f30236t - this.f30235s) * 10);
        sb.append('[');
        sb.append(this.f30234o[this.f30235s]);
        int i8 = this.f30235s;
        while (true) {
            i8++;
            if (i8 >= this.f30236t) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f30234o[i8]);
        }
    }
}
