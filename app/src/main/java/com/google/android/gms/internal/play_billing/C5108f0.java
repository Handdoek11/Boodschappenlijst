package com.google.android.gms.internal.play_billing;

import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5108f0 extends AbstractC5114g0 {

    /* renamed from: u, reason: collision with root package name */
    final transient int f29898u;

    /* renamed from: v, reason: collision with root package name */
    final transient int f29899v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ AbstractC5114g0 f29900w;

    C5108f0(AbstractC5114g0 abstractC5114g0, int i8, int i9) {
        this.f29900w = abstractC5114g0;
        this.f29898u = i8;
        this.f29899v = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int c() {
        return this.f29900w.d() + this.f29898u + this.f29899v;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final int d() {
        return this.f29900w.d() + this.f29898u;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC5202v.a(i8, this.f29899v, "index");
        return this.f29900w.get(i8 + this.f29898u);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final Object[] n() {
        return this.f29900w.n();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5114g0
    /* renamed from: p */
    public final AbstractC5114g0 subList(int i8, int i9) {
        AbstractC5202v.e(i8, i9, this.f29899v);
        int i10 = this.f29898u;
        return this.f29900w.subList(i8 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29899v;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5114g0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }
}
