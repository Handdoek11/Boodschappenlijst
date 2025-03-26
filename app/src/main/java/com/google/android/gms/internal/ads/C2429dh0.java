package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.dh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2429dh0 extends AbstractC2539ei0 implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    final Comparator f21636o;

    C2429dh0(Comparator comparator) {
        this.f21636o = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2539ei0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f21636o.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2429dh0) {
            return this.f21636o.equals(((C2429dh0) obj).f21636o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21636o.hashCode();
    }

    public final String toString() {
        return this.f21636o.toString();
    }
}
