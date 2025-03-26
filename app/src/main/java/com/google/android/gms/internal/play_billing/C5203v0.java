package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.play_billing.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5203v0 extends AbstractC5214x0 implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    static final C5203v0 f30017o = new C5203v0();

    private C5203v0() {
    }

    @Override // java.util.Comparator
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
