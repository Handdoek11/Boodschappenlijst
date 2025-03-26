package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.fi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2648fi0 extends AbstractC4169th0 {

    /* renamed from: w, reason: collision with root package name */
    static final AbstractC4169th0 f22099w = new C2648fi0(new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    final transient Object[] f22100u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f22101v;

    C2648fi0(Object[] objArr, int i8) {
        this.f22100u = objArr;
        this.f22101v = i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4169th0, com.google.android.gms.internal.ads.AbstractC3625oh0
    final int b(Object[] objArr, int i8) {
        System.arraycopy(this.f22100u, 0, objArr, i8, this.f22101v);
        return i8 + this.f22101v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int c() {
        return this.f22101v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1762Sf0.a(i8, this.f22101v, "index");
        Object obj = this.f22100u[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final Object[] o() {
        return this.f22100u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22101v;
    }
}
