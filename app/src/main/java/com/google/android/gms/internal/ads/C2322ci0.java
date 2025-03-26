package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.ci0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2322ci0 extends AbstractC2539ei0 implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    static final C2322ci0 f21270o = new C2322ci0();

    private C2322ci0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2539ei0
    public final AbstractC2539ei0 a() {
        return C3409mi0.f24558o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2539ei0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
