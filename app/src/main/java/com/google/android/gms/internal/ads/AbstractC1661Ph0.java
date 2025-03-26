package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ph0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1661Ph0 extends AbstractMap {

    /* renamed from: o, reason: collision with root package name */
    private transient Set f18249o;

    /* renamed from: s, reason: collision with root package name */
    private transient Collection f18250s;

    AbstractC1661Ph0() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f18249o;
        if (set != null) {
            return set;
        }
        Set a8 = a();
        this.f18249o = a8;
        return a8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f18250s;
        if (collection != null) {
            return collection;
        }
        C1626Oh0 c1626Oh0 = new C1626Oh0(this);
        this.f18250s = c1626Oh0;
        return c1626Oh0;
    }
}
