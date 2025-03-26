package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4603xg0 extends AbstractC1661Ph0 {

    /* renamed from: t, reason: collision with root package name */
    final transient Map f27897t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ AbstractC1520Lg0 f27898u;

    C4603xg0(AbstractC1520Lg0 abstractC1520Lg0, Map map) {
        this.f27898u = abstractC1520Lg0;
        this.f27897t = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1661Ph0
    protected final Set a() {
        return new C4385vg0(this);
    }

    final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new C3734ph0(key, this.f27898u.j(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC1520Lg0 abstractC1520Lg0 = this.f27898u;
        if (this.f27897t == abstractC1520Lg0.f16870u) {
            abstractC1520Lg0.p();
        } else {
            AbstractC1236Dh0.b(new C4494wg0(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f27897t;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f27897t.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) AbstractC1696Qh0.a(this.f27897t, obj);
        if (collection == null) {
            return null;
        }
        return this.f27898u.j(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f27897t.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return this.f27898u.g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f27897t.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection h8 = this.f27898u.h();
        h8.addAll(collection);
        this.f27898u.f16871v -= collection.size();
        collection.clear();
        return h8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f27897t.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f27897t.toString();
    }
}
