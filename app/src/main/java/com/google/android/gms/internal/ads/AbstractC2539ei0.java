package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.ei0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2539ei0 implements Comparator {
    protected AbstractC2539ei0() {
    }

    public static AbstractC2539ei0 b(Comparator comparator) {
        return new C2429dh0(comparator);
    }

    public static AbstractC2539ei0 c() {
        return C2322ci0.f21270o;
    }

    public AbstractC2539ei0 a() {
        return new C3518ni0(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
