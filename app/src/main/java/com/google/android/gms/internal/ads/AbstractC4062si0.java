package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.si0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4062si0 extends AbstractSet {
    AbstractC4062si0() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return AbstractC4389vi0.e(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
