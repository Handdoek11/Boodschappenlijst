package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2945iN implements T80 {

    /* renamed from: o, reason: collision with root package name */
    private final Map f22963o;

    /* renamed from: s, reason: collision with root package name */
    private final C2000Zc f22964s;

    C2945iN(C2000Zc c2000Zc, Map map) {
        this.f22963o = map;
        this.f22964s = c2000Zc;
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void g(M80 m80, String str, Throwable th) {
        if (this.f22963o.containsKey(m80)) {
            this.f22964s.c(((C2836hN) this.f22963o.get(m80)).f22539c);
        }
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void m(M80 m80, String str) {
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void t(M80 m80, String str) {
        if (this.f22963o.containsKey(m80)) {
            this.f22964s.c(((C2836hN) this.f22963o.get(m80)).f22538b);
        }
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void w(M80 m80, String str) {
        if (this.f22963o.containsKey(m80)) {
            this.f22964s.c(((C2836hN) this.f22963o.get(m80)).f22537a);
        }
    }
}
