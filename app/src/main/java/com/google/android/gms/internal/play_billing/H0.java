package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* loaded from: classes2.dex */
final class H0 extends AbstractC5114g0 {

    /* renamed from: u, reason: collision with root package name */
    private final transient Object[] f29761u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f29762v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f29763w;

    H0(Object[] objArr, int i8, int i9) {
        this.f29761u = objArr;
        this.f29762v = i8;
        this.f29763w = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC5202v.a(i8, this.f29763w, "index");
        Object obj = this.f29761u[i8 + i8 + this.f29762v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29763w;
    }
}
