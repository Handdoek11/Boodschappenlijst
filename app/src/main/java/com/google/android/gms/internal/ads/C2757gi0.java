package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;

/* renamed from: com.google.android.gms.internal.ads.gi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2757gi0 extends AbstractC4169th0 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ C2866hi0 f22421u;

    C2757gi0(C2866hi0 c2866hi0) {
        this.f22421u = c2866hi0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC1762Sf0.a(i8, this.f22421u.f22597v, "index");
        int i9 = i8 + i8;
        Object obj = this.f22421u.f22596u[i9];
        Objects.requireNonNull(obj);
        Object obj2 = this.f22421u.f22596u[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22421u.f22597v;
    }
}
