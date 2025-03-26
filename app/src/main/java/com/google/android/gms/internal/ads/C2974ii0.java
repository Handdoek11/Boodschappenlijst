package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ii0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2974ii0 extends AbstractC4714yh0 {

    /* renamed from: t, reason: collision with root package name */
    private final transient AbstractC4496wh0 f23047t;

    /* renamed from: u, reason: collision with root package name */
    private final transient AbstractC4169th0 f23048u;

    C2974ii0(AbstractC4496wh0 abstractC4496wh0, AbstractC4169th0 abstractC4169th0) {
        this.f23047t = abstractC4496wh0;
        this.f23048u = abstractC4169th0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int b(Object[] objArr, int i8) {
        return this.f23048u.b(objArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23047t.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0, com.google.android.gms.internal.ads.AbstractC3625oh0
    public final AbstractC4169th0 e() {
        return this.f23048u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f23048u.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0, com.google.android.gms.internal.ads.AbstractC3625oh0
    public final AbstractC4825zi0 j() {
        return this.f23048u.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23047t.size();
    }
}
