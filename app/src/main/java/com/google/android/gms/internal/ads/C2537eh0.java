package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.eh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2537eh0 extends AbstractC2972ih0 {
    C2537eh0() {
        super(null);
    }

    static final AbstractC2972ih0 j(int i8) {
        return i8 < 0 ? AbstractC2972ih0.f23045b : i8 > 0 ? AbstractC2972ih0.f23046c : AbstractC2972ih0.f23044a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2972ih0
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2972ih0
    public final AbstractC2972ih0 b(int i8, int i9) {
        return j(Integer.compare(i8, i9));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2972ih0
    public final AbstractC2972ih0 c(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2972ih0
    public final AbstractC2972ih0 d(boolean z7, boolean z8) {
        return j(Boolean.compare(z7, z8));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2972ih0
    public final AbstractC2972ih0 e(boolean z7, boolean z8) {
        return j(Boolean.compare(z8, z7));
    }
}
