package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4712yg0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    final Iterator f28164o;

    /* renamed from: s, reason: collision with root package name */
    Collection f28165s = null;

    /* renamed from: t, reason: collision with root package name */
    Iterator f28166t = EnumC1164Bh0.INSTANCE;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ AbstractC1520Lg0 f28167u;

    AbstractC4712yg0(AbstractC1520Lg0 abstractC1520Lg0) {
        this.f28167u = abstractC1520Lg0;
        this.f28164o = abstractC1520Lg0.f16870u.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28164o.hasNext() || this.f28166t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f28166t.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f28164o.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f28165s = collection;
            this.f28166t = collection.iterator();
        }
        return this.f28166t.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f28166t.remove();
        Collection collection = this.f28165s;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f28164o.remove();
        }
        AbstractC1520Lg0 abstractC1520Lg0 = this.f28167u;
        abstractC1520Lg0.f16871v--;
    }
}
