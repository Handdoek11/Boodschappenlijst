package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4821zg0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    Map.Entry f28691o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Iterator f28692s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C1126Ag0 f28693t;

    C4821zg0(C1126Ag0 c1126Ag0, Iterator it) {
        this.f28692s = it;
        this.f28693t = c1126Ag0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28692s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f28692s.next();
        this.f28691o = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1762Sf0.m(this.f28691o != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f28691o.getValue();
        this.f28692s.remove();
        this.f28693t.f13617s.f16871v -= collection.size();
        collection.clear();
        this.f28691o = null;
    }
}
