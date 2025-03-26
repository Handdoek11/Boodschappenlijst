package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.mi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3409mi0 extends AbstractC2539ei0 implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    static final C3409mi0 f24558o = new C3409mi0();

    private C3409mi0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2539ei0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
