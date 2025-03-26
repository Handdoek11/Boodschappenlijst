package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3080jh0 extends AbstractC3189kh0 implements Map {
    protected AbstractC3080jh0() {
    }

    @Override // java.util.Map
    public final void clear() {
        h().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return h().containsKey(obj);
    }

    @Override // java.util.Map
    public abstract Set entrySet();

    protected abstract Map h();

    protected final int i() {
        return AbstractC4389vi0.a(entrySet());
    }

    protected final boolean k(Object obj) {
        C1522Lh0 c1522Lh0 = new C1522Lh0(entrySet().iterator());
        if (obj == null) {
            while (c1522Lh0.hasNext()) {
                if (c1522Lh0.next() == null) {
                }
            }
            return false;
        }
        while (c1522Lh0.hasNext()) {
            if (obj.equals(c1522Lh0.next())) {
            }
        }
        return false;
        return true;
    }

    protected final boolean l(Object obj) {
        return AbstractC1696Qh0.b(this, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return h().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        h().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return h().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return h().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return h().values();
    }
}
