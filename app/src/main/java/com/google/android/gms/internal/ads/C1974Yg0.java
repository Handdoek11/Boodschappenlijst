package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Yg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1974Yg0 extends AbstractC1554Mg0 {

    /* renamed from: o, reason: collision with root package name */
    private final Object f20305o;

    /* renamed from: s, reason: collision with root package name */
    private int f20306s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C2212bh0 f20307t;

    C1974Yg0(C2212bh0 c2212bh0, int i8) {
        this.f20307t = c2212bh0;
        this.f20305o = C2212bh0.k(c2212bh0, i8);
        this.f20306s = i8;
    }

    private final void a() {
        int i8 = this.f20306s;
        if (i8 == -1 || i8 >= this.f20307t.size() || !AbstractC1657Pf0.a(this.f20305o, C2212bh0.k(this.f20307t, this.f20306s))) {
            this.f20306s = this.f20307t.A(this.f20305o);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1554Mg0, java.util.Map.Entry
    public final Object getKey() {
        return this.f20305o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1554Mg0, java.util.Map.Entry
    public final Object getValue() {
        Map p8 = this.f20307t.p();
        if (p8 != null) {
            return p8.get(this.f20305o);
        }
        a();
        int i8 = this.f20306s;
        if (i8 == -1) {
            return null;
        }
        return C2212bh0.n(this.f20307t, i8);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map p8 = this.f20307t.p();
        if (p8 != null) {
            return p8.put(this.f20305o, obj);
        }
        a();
        int i8 = this.f20306s;
        if (i8 == -1) {
            this.f20307t.put(this.f20305o, obj);
            return null;
        }
        C2212bh0 c2212bh0 = this.f20307t;
        Object n8 = C2212bh0.n(c2212bh0, i8);
        C2212bh0.r(c2212bh0, this.f20306s, obj);
        return n8;
    }
}
