package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4385vg0 extends AbstractC1556Mh0 {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C4603xg0 f27321o;

    C4385vg0(C4603xg0 c4603xg0) {
        this.f27321o = c4603xg0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1556Mh0
    final Map b() {
        return this.f27321o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1556Mh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return AbstractC1729Rg0.a(this.f27321o.f27897t.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4494wg0(this.f27321o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C4603xg0 c4603xg0 = this.f27321o;
        AbstractC1520Lg0.t(c4603xg0.f27898u, entry.getKey());
        return true;
    }
}
