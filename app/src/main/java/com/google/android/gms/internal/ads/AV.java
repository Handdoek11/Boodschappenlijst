package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;

/* loaded from: classes.dex */
public final class AV {

    /* renamed from: a, reason: collision with root package name */
    private C4040sV f13573a;

    AV() {
    }

    public static AV b(C4040sV c4040sV) {
        return new AV(c4040sV);
    }

    public final C4040sV a(InterfaceC5781e interfaceC5781e, C4258uV c4258uV, BT bt, C2959ia0 c2959ia0) {
        C4040sV c4040sV = this.f13573a;
        return c4040sV != null ? c4040sV : new C4040sV(interfaceC5781e, c4258uV, bt, c2959ia0);
    }

    private AV(C4040sV c4040sV) {
        this.f13573a = c4040sV;
    }
}
