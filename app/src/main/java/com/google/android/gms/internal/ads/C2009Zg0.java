package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Zg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2009Zg0 extends AbstractCollection {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C2212bh0 f20525o;

    C2009Zg0(C2212bh0 c2212bh0) {
        this.f20525o = c2212bh0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20525o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2212bh0 c2212bh0 = this.f20525o;
        Map p8 = c2212bh0.p();
        return p8 != null ? p8.values().iterator() : new C1834Ug0(c2212bh0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f20525o.size();
    }
}
