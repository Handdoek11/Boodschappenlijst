package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.wi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4498wi0 extends AbstractC4714yh0 {

    /* renamed from: t, reason: collision with root package name */
    final transient Object f27531t;

    C4498wi0(Object obj) {
        obj.getClass();
        this.f27531t = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int b(Object[] objArr, int i8) {
        objArr[i8] = this.f27531t;
        return i8 + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f27531t.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0, com.google.android.gms.internal.ads.AbstractC3625oh0
    public final AbstractC4169th0 e() {
        return AbstractC4169th0.x(this.f27531t);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27531t.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C1200Ch0(this.f27531t);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0, com.google.android.gms.internal.ads.AbstractC3625oh0
    public final AbstractC4825zi0 j() {
        return new C1200Ch0(this.f27531t);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f27531t.toString() + "]";
    }
}
