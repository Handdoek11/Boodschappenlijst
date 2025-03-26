package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1556Mh0 extends AbstractC4062si0 {
    AbstractC1556Mh0() {
    }

    abstract Map b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        b().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4062si0, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return AbstractC4389vi0.e(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return AbstractC4389vi0.f(this, collection.iterator());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4062si0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                AbstractC1659Pg0.a(size, "expectedSize");
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return b().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b().size();
    }
}
