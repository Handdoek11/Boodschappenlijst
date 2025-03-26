package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Vi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873Vi0 implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final int[] f19641o;

    /* renamed from: s, reason: collision with root package name */
    private final int f19642s;

    private C1873Vi0(int[] iArr, int i8, int i9) {
        this.f19641o = iArr;
        this.f19642s = i9;
    }

    public static C1873Vi0 b(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new C1873Vi0(copyOf, 0, copyOf.length);
    }

    public final int a(int i8) {
        AbstractC1762Sf0.a(i8, this.f19642s, "index");
        return this.f19641o[i8];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1873Vi0)) {
            return false;
        }
        C1873Vi0 c1873Vi0 = (C1873Vi0) obj;
        if (this.f19642s != c1873Vi0.f19642s) {
            return false;
        }
        for (int i8 = 0; i8 < this.f19642s; i8++) {
            if (a(i8) != c1873Vi0.a(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f19642s; i9++) {
            i8 = (i8 * 31) + this.f19641o[i9];
        }
        return i8;
    }

    public final String toString() {
        int i8 = this.f19642s;
        if (i8 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i8 * 5);
        sb.append('[');
        sb.append(this.f19641o[0]);
        for (int i9 = 1; i9 < this.f19642s; i9++) {
            sb.append(", ");
            sb.append(this.f19641o[i9]);
        }
        sb.append(']');
        return sb.toString();
    }
}
