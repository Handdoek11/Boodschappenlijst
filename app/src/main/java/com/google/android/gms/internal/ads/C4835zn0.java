package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.zn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4835zn0 extends AbstractC3080jh0 {

    /* renamed from: o, reason: collision with root package name */
    private final Map f28697o;

    public C4835zn0(Map map) {
        this.f28697o = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3189kh0
    protected final /* synthetic */ Object a() {
        return this.f28697o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3080jh0, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.k(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3080jh0, java.util.Map
    public final Set entrySet() {
        return AbstractC4389vi0.c(this.f28697o.entrySet(), new InterfaceC1797Tf0() { // from class: com.google.android.gms.internal.ads.ym0
            @Override // com.google.android.gms.internal.ads.InterfaceC1797Tf0
            public final boolean a(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.l(obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f28697o.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3080jh0
    protected final Map h() {
        return this.f28697o;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.i();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f28697o.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC4389vi0.c(this.f28697o.keySet(), new InterfaceC1797Tf0() { // from class: com.google.android.gms.internal.ads.Ym0
            @Override // com.google.android.gms.internal.ads.InterfaceC1797Tf0
            public final boolean a(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3080jh0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
