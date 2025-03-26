package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Vg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1869Vg0 extends AbstractSet {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C2212bh0 f19638o;

    C1869Vg0(C2212bh0 c2212bh0) {
        this.f19638o = c2212bh0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19638o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map p8 = this.f19638o.p();
        if (p8 != null) {
            return p8.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int A7 = this.f19638o.A(entry.getKey());
            if (A7 != -1 && AbstractC1657Pf0.a(C2212bh0.n(this.f19638o, A7), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2212bh0 c2212bh0 = this.f19638o;
        Map p8 = c2212bh0.p();
        return p8 != null ? p8.entrySet().iterator() : new C1799Tg0(c2212bh0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map p8 = this.f19638o.p();
        if (p8 != null) {
            return p8.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C2212bh0 c2212bh0 = this.f19638o;
        if (c2212bh0.v()) {
            return false;
        }
        int z7 = c2212bh0.z();
        Object key = entry.getKey();
        Object value = entry.getValue();
        C2212bh0 c2212bh02 = this.f19638o;
        int b8 = AbstractC2320ch0.b(key, value, z7, C2212bh0.m(c2212bh02), c2212bh02.a(), c2212bh02.b(), c2212bh02.d());
        if (b8 == -1) {
            return false;
        }
        this.f19638o.u(b8, z7);
        C2212bh0 c2212bh03 = this.f19638o;
        c2212bh03.f20917w--;
        this.f19638o.s();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19638o.size();
    }
}
