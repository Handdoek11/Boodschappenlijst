package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1939Xg0 extends AbstractSet {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C2212bh0 f20110o;

    C1939Xg0(C2212bh0 c2212bh0) {
        this.f20110o = c2212bh0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20110o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20110o.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2212bh0 c2212bh0 = this.f20110o;
        Map p8 = c2212bh0.p();
        return p8 != null ? p8.keySet().iterator() : new C1764Sg0(c2212bh0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map p8 = this.f20110o.p();
        return p8 != null ? p8.keySet().remove(obj) : this.f20110o.C(obj) != C2212bh0.f20911A;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20110o.size();
    }
}
