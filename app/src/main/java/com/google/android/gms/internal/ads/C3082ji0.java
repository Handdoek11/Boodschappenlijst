package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ji0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3082ji0 extends AbstractC4169th0 {

    /* renamed from: u, reason: collision with root package name */
    private final transient Object[] f23337u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f23338v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f23339w;

    C3082ji0(Object[] objArr, int i8, int i9) {
        this.f23337u = objArr;
        this.f23338v = i8;
        this.f23339w = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1762Sf0.a(i8, this.f23339w, "index");
        Object obj = this.f23337u[i8 + i8 + this.f23338v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23339w;
    }
}
