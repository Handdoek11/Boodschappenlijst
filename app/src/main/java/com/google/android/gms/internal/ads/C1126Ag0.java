package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ag0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1126Ag0 extends AbstractC1591Nh0 {

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ AbstractC1520Lg0 f13617s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1126Ag0(AbstractC1520Lg0 abstractC1520Lg0, Map map) {
        super(map);
        this.f13617s = abstractC1520Lg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC1236Dh0.b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f17578o.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f17578o.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f17578o.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1591Nh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4821zg0(this, this.f17578o.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f17578o.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f13617s.f16871v -= size;
        return size > 0;
    }
}
