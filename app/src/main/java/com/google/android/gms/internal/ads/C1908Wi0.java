package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.Wi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1908Wi0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: o, reason: collision with root package name */
    final int[] f19835o;

    /* renamed from: s, reason: collision with root package name */
    final int f19836s;

    /* renamed from: t, reason: collision with root package name */
    final int f19837t;

    C1908Wi0(int[] iArr, int i8, int i9) {
        this.f19835o = iArr;
        this.f19836s = i8;
        this.f19837t = i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && AbstractC1943Xi0.a(this.f19835o, ((Integer) obj).intValue(), this.f19836s, this.f19837t) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1908Wi0)) {
            return super.equals(obj);
        }
        C1908Wi0 c1908Wi0 = (C1908Wi0) obj;
        int i8 = this.f19837t - this.f19836s;
        if (c1908Wi0.f19837t - c1908Wi0.f19836s != i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f19835o[this.f19836s + i9] != c1908Wi0.f19835o[c1908Wi0.f19836s + i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC1762Sf0.a(i8, this.f19837t - this.f19836s, "index");
        return Integer.valueOf(this.f19835o[this.f19836s + i8]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = this.f19836s; i9 < this.f19837t; i9++) {
            i8 = (i8 * 31) + this.f19835o[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int a8;
        if (!(obj instanceof Integer) || (a8 = AbstractC1943Xi0.a(this.f19835o, ((Integer) obj).intValue(), this.f19836s, this.f19837t)) < 0) {
            return -1;
        }
        return a8 - this.f19836s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f19835o;
            int intValue = ((Integer) obj).intValue();
            int i8 = this.f19836s;
            int i9 = this.f19837t - 1;
            while (true) {
                if (i9 < i8) {
                    i9 = -1;
                    break;
                }
                if (iArr[i9] == intValue) {
                    break;
                }
                i9--;
            }
            if (i9 >= 0) {
                return i9 - this.f19836s;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        Integer num = (Integer) obj;
        AbstractC1762Sf0.a(i8, this.f19837t - this.f19836s, "index");
        int[] iArr = this.f19835o;
        int i9 = this.f19836s + i8;
        int i10 = iArr[i9];
        num.getClass();
        iArr[i9] = num.intValue();
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19837t - this.f19836s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i8, int i9) {
        AbstractC1762Sf0.k(i8, i9, this.f19837t - this.f19836s);
        if (i8 == i9) {
            return Collections.emptyList();
        }
        int[] iArr = this.f19835o;
        int i10 = this.f19836s;
        return new C1908Wi0(iArr, i10 + i8, i9 + i10);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f19837t - this.f19836s) * 5);
        sb.append('[');
        sb.append(this.f19835o[this.f19836s]);
        int i8 = this.f19836s;
        while (true) {
            i8++;
            if (i8 >= this.f19837t) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f19835o[i8]);
        }
    }
}
