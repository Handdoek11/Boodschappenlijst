package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4060sh0 extends AbstractC4169th0 {

    /* renamed from: u, reason: collision with root package name */
    final transient int f26725u;

    /* renamed from: v, reason: collision with root package name */
    final transient int f26726v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ AbstractC4169th0 f26727w;

    C4060sh0(AbstractC4169th0 abstractC4169th0, int i8, int i9) {
        this.f26727w = abstractC4169th0;
        this.f26725u = i8;
        this.f26726v = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int c() {
        return this.f26727w.d() + this.f26725u + this.f26726v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int d() {
        return this.f26727w.d() + this.f26725u;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1762Sf0.a(i8, this.f26726v, "index");
        return this.f26727w.get(i8 + this.f26725u);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final Object[] o() {
        return this.f26727w.o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4169th0
    /* renamed from: p */
    public final AbstractC4169th0 subList(int i8, int i9) {
        AbstractC1762Sf0.k(i8, i9, this.f26726v);
        int i10 = this.f26725u;
        return this.f26727w.subList(i8 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26726v;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4169th0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }
}
