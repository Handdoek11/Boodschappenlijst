package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.ni0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3518ni0 extends AbstractC2539ei0 implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    final AbstractC2539ei0 f25026o;

    C3518ni0(AbstractC2539ei0 abstractC2539ei0) {
        this.f25026o = abstractC2539ei0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2539ei0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f25026o.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3518ni0) {
            return this.f25026o.equals(((C3518ni0) obj).f25026o);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f25026o.hashCode();
    }

    public final String toString() {
        return this.f25026o.toString().concat(".reverse()");
    }
}
