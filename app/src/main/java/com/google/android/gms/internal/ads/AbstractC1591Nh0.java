package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Nh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1591Nh0 extends AbstractC4062si0 {

    /* renamed from: o, reason: collision with root package name */
    final Map f17578o;

    AbstractC1591Nh0(Map map) {
        map.getClass();
        this.f17578o = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f17578o.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f17578o.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17578o.size();
    }
}
