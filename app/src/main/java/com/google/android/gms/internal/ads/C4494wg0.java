package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4494wg0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    final Iterator f27525o;

    /* renamed from: s, reason: collision with root package name */
    Collection f27526s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C4603xg0 f27527t;

    C4494wg0(C4603xg0 c4603xg0) {
        this.f27527t = c4603xg0;
        this.f27525o = c4603xg0.f27897t.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27525o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f27525o.next();
        this.f27526s = (Collection) entry.getValue();
        return this.f27527t.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1762Sf0.m(this.f27526s != null, "no calls to next() since the last call to remove()");
        this.f27525o.remove();
        this.f27527t.f27898u.f16871v -= this.f27526s.size();
        this.f27526s.clear();
        this.f27526s = null;
    }
}
