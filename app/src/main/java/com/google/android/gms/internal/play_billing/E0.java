package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.AbstractMap;

/* loaded from: classes2.dex */
final class E0 extends AbstractC5114g0 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ F0 f29689u;

    E0(F0 f02) {
        this.f29689u = f02;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC5202v.a(i8, this.f29689u.f29702v, "index");
        int i9 = i8 + i8;
        Object obj = this.f29689u.f29701u[i9];
        Objects.requireNonNull(obj);
        Object obj2 = this.f29689u.f29701u[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29689u.f29702v;
    }
}
