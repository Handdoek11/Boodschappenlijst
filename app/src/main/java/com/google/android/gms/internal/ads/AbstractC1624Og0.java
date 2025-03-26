package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Og0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1624Og0 implements InterfaceC1731Rh0 {

    /* renamed from: o, reason: collision with root package name */
    private transient Set f17908o;

    /* renamed from: s, reason: collision with root package name */
    private transient Collection f17909s;

    /* renamed from: t, reason: collision with root package name */
    private transient Map f17910t;

    AbstractC1624Og0() {
    }

    abstract Collection c();

    abstract Iterator d();

    abstract Map e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1731Rh0) {
            return s().equals(((InterfaceC1731Rh0) obj).s());
        }
        return false;
    }

    abstract Set f();

    public final Set g() {
        Set set = this.f17908o;
        if (set != null) {
            return set;
        }
        Set f8 = f();
        this.f17908o = f8;
        return f8;
    }

    public final int hashCode() {
        return s().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1731Rh0
    public final Collection r() {
        Collection collection = this.f17909s;
        if (collection != null) {
            return collection;
        }
        Collection c8 = c();
        this.f17909s = c8;
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1731Rh0
    public final Map s() {
        Map map = this.f17910t;
        if (map != null) {
            return map;
        }
        Map e8 = e();
        this.f17910t = e8;
        return e8;
    }

    public final String toString() {
        return s().toString();
    }
}
