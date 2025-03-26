package com.google.android.gms.internal.play_billing;

import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5102e0 extends AbstractC5114g0 {

    /* renamed from: u, reason: collision with root package name */
    private final transient AbstractC5114g0 f29891u;

    C5102e0(AbstractC5114g0 abstractC5114g0) {
        this.f29891u = abstractC5114g0;
    }

    private final int x(int i8) {
        return (this.f29891u.size() - 1) - i8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5114g0, com.google.android.gms.internal.play_billing.AbstractC5084b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29891u.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC5202v.a(i8, this.f29891u.size(), "index");
        return this.f29891u.get(x(i8));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5114g0, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f29891u.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return x(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    final boolean j() {
        return this.f29891u.j();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5114g0, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f29891u.indexOf(obj);
        if (indexOf >= 0) {
            return x(indexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5114g0
    public final AbstractC5114g0 o() {
        return this.f29891u;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5114g0
    /* renamed from: p */
    public final AbstractC5114g0 subList(int i8, int i9) {
        AbstractC5202v.e(i8, i9, this.f29891u.size());
        AbstractC5114g0 abstractC5114g0 = this.f29891u;
        return abstractC5114g0.subList(abstractC5114g0.size() - i9, this.f29891u.size() - i8).o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29891u.size();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5114g0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }
}
