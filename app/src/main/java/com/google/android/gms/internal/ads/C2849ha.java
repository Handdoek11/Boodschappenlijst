package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2849ha implements InterfaceC3726pd0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4159tc0 f22565a;

    /* renamed from: b, reason: collision with root package name */
    private final C1512Lc0 f22566b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC4372va f22567c;

    /* renamed from: d, reason: collision with root package name */
    private final C2740ga f22568d;

    /* renamed from: e, reason: collision with root package name */
    private final S9 f22569e;

    /* renamed from: f, reason: collision with root package name */
    private final C4699ya f22570f;

    /* renamed from: g, reason: collision with root package name */
    private final C3719pa f22571g;

    /* renamed from: h, reason: collision with root package name */
    private final C2631fa f22572h;

    C2849ha(AbstractC4159tc0 abstractC4159tc0, C1512Lc0 c1512Lc0, ViewOnAttachStateChangeListenerC4372va viewOnAttachStateChangeListenerC4372va, C2740ga c2740ga, S9 s9, C4699ya c4699ya, C3719pa c3719pa, C2631fa c2631fa) {
        this.f22565a = abstractC4159tc0;
        this.f22566b = c1512Lc0;
        this.f22567c = viewOnAttachStateChangeListenerC4372va;
        this.f22568d = c2740ga;
        this.f22569e = s9;
        this.f22570f = c4699ya;
        this.f22571g = c3719pa;
        this.f22572h = c2631fa;
    }

    private final Map c() {
        HashMap hashMap = new HashMap();
        AbstractC4159tc0 abstractC4159tc0 = this.f22565a;
        E8 b8 = this.f22566b.b();
        hashMap.put("v", abstractC4159tc0.d());
        hashMap.put("gms", Boolean.valueOf(this.f22565a.g()));
        hashMap.put("int", b8.a1());
        hashMap.put("attts", Long.valueOf(b8.Y0().b0()));
        hashMap.put("att", b8.Y0().e0());
        hashMap.put("attkid", b8.Y0().f0());
        hashMap.put("up", Boolean.valueOf(this.f22568d.a()));
        hashMap.put("t", new Throwable());
        C3719pa c3719pa = this.f22571g;
        if (c3719pa != null) {
            hashMap.put("tcq", Long.valueOf(c3719pa.c()));
            hashMap.put("tpq", Long.valueOf(this.f22571g.g()));
            hashMap.put("tcv", Long.valueOf(this.f22571g.d()));
            hashMap.put("tpv", Long.valueOf(this.f22571g.h()));
            hashMap.put("tchv", Long.valueOf(this.f22571g.b()));
            hashMap.put("tphv", Long.valueOf(this.f22571g.f()));
            hashMap.put("tcc", Long.valueOf(this.f22571g.a()));
            hashMap.put("tpc", Long.valueOf(this.f22571g.e()));
            S9 s9 = this.f22569e;
            if (s9 != null) {
                hashMap.put("nt", Long.valueOf(s9.a()));
            }
            C4699ya c4699ya = this.f22570f;
            if (c4699ya != null) {
                hashMap.put("vs", Long.valueOf(c4699ya.c()));
                hashMap.put("vf", Long.valueOf(this.f22570f.b()));
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3726pd0
    public final Map a() {
        C2631fa c2631fa = this.f22572h;
        Map c8 = c();
        if (c2631fa != null) {
            c8.put("vst", c2631fa.a());
        }
        return c8;
    }

    final void b(View view) {
        this.f22567c.d(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3726pd0
    public final Map zza() {
        ViewOnAttachStateChangeListenerC4372va viewOnAttachStateChangeListenerC4372va = this.f22567c;
        Map c8 = c();
        c8.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC4372va.a()));
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3726pd0
    public final Map zzb() {
        Map c8 = c();
        E8 a8 = this.f22566b.a();
        c8.put("gai", Boolean.valueOf(this.f22565a.h()));
        c8.put("did", a8.Z0());
        c8.put("dst", Integer.valueOf(a8.N0() - 1));
        c8.put("doo", Boolean.valueOf(a8.K0()));
        return c8;
    }
}
