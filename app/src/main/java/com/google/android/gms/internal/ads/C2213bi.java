package com.google.android.gms.internal.ads;

import z2.InterfaceC7077l;
import z2.InterfaceC7078m;

/* renamed from: com.google.android.gms.internal.ads.bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2213bi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7078m f20921a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7077l f20922b;

    /* renamed from: c, reason: collision with root package name */
    private C3950rh f20923c;

    public C2213bi(InterfaceC7078m interfaceC7078m, InterfaceC7077l interfaceC7077l) {
        this.f20921a = interfaceC7078m;
        this.f20922b = interfaceC7077l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized C3950rh f(InterfaceC3842qh interfaceC3842qh) {
        C3950rh c3950rh = this.f20923c;
        if (c3950rh != null) {
            return c3950rh;
        }
        C3950rh c3950rh2 = new C3950rh(interfaceC3842qh);
        this.f20923c = c3950rh2;
        return c3950rh2;
    }

    public final InterfaceC1163Bh c() {
        AbstractC2010Zh abstractC2010Zh = null;
        if (this.f20922b == null) {
            return null;
        }
        return new BinderC1940Xh(this, abstractC2010Zh);
    }

    public final InterfaceC1271Eh d() {
        return new BinderC1975Yh(this, null);
    }
}
