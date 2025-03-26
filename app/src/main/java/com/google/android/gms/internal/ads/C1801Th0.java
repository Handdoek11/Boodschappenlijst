package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.Th0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1801Th0 extends AbstractC1941Xh0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f19165a;

    C1801Th0(Comparator comparator) {
        this.f19165a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1941Xh0
    final Map a() {
        return new TreeMap(this.f19165a);
    }
}
