package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.Lg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1520Lg0 extends AbstractC1624Og0 implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    private final transient Map f16870u;

    /* renamed from: v, reason: collision with root package name */
    private transient int f16871v;

    protected AbstractC1520Lg0(Map map) {
        AbstractC1762Sf0.e(map.isEmpty());
        this.f16870u = map;
    }

    static /* bridge */ /* synthetic */ void t(AbstractC1520Lg0 abstractC1520Lg0, Object obj) {
        Object obj2;
        try {
            obj2 = abstractC1520Lg0.f16870u.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC1520Lg0.f16871v -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1731Rh0
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f16870u.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f16871v++;
            return true;
        }
        Collection h8 = h();
        if (!h8.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f16871v++;
        this.f16870u.put(obj, h8);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1731Rh0
    public final int b() {
        return this.f16871v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1624Og0
    final Collection c() {
        return new C1589Ng0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1624Og0
    final Iterator d() {
        return new C4276ug0(this);
    }

    abstract Collection h();

    abstract Collection i(Collection collection);

    abstract Collection j(Object obj, Collection collection);

    final List l(Object obj, List list, AbstractC1414Ig0 abstractC1414Ig0) {
        return list instanceof RandomAccess ? new C1234Dg0(this, obj, list, abstractC1414Ig0) : new C1485Kg0(this, obj, list, abstractC1414Ig0);
    }

    final Map n() {
        Map map = this.f16870u;
        return map instanceof NavigableMap ? new C1162Bg0(this, (NavigableMap) map) : map instanceof SortedMap ? new C1306Fg0(this, (SortedMap) map) : new C4603xg0(this, map);
    }

    final Set o() {
        Map map = this.f16870u;
        return map instanceof NavigableMap ? new C1198Cg0(this, (NavigableMap) map) : map instanceof SortedMap ? new C1342Gg0(this, (SortedMap) map) : new C1126Ag0(this, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1731Rh0
    public final void p() {
        Iterator it = this.f16870u.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f16870u.clear();
        this.f16871v = 0;
    }
}
