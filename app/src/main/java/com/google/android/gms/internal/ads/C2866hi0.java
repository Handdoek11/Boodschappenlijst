package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2866hi0 extends AbstractC4714yh0 {

    /* renamed from: t, reason: collision with root package name */
    private final transient AbstractC4496wh0 f22595t;

    /* renamed from: u, reason: collision with root package name */
    private final transient Object[] f22596u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f22597v;

    C2866hi0(AbstractC4496wh0 abstractC4496wh0, Object[] objArr, int i8, int i9) {
        this.f22595t = abstractC4496wh0;
        this.f22596u = objArr;
        this.f22597v = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int b(Object[] objArr, int i8) {
        return e().b(objArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f22595t.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0, com.google.android.gms.internal.ads.AbstractC3625oh0
    public final AbstractC4825zi0 j() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0
    final AbstractC4169th0 q() {
        return new C2757gi0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22597v;
    }
}
