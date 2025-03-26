package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* loaded from: classes2.dex */
final class D0 extends AbstractC5114g0 {

    /* renamed from: w, reason: collision with root package name */
    static final AbstractC5114g0 f29684w = new D0(new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    final transient Object[] f29685u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f29686v;

    D0(Object[] objArr, int i8) {
        this.f29685u = objArr;
        this.f29686v = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5114g0, com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int b(Object[] objArr, int i8) {
        System.arraycopy(this.f29685u, 0, objArr, 0, this.f29686v);
        return this.f29686v;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int c() {
        return this.f29686v;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC5202v.a(i8, this.f29686v, "index");
        Object obj = this.f29685u[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final Object[] n() {
        return this.f29685u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29686v;
    }
}
