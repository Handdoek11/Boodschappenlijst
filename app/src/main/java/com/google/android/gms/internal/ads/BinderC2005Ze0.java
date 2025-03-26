package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Ze0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC2005Ze0 extends AbstractBinderC3945re0 {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC2751gf0 f20518o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C2099af0 f20519s;

    BinderC2005Ze0(C2099af0 c2099af0, InterfaceC2751gf0 interfaceC2751gf0) {
        this.f20519s = c2099af0;
        this.f20518o = interfaceC2751gf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4054se0
    public final void Y4(Bundle bundle) {
        int i8 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        AbstractC2425df0 c8 = AbstractC2642ff0.c();
        c8.b(i8);
        if (string != null) {
            c8.a(string);
        }
        this.f20518o.a(c8.c());
        if (i8 == 8157) {
            this.f20519s.a();
        }
    }
}
