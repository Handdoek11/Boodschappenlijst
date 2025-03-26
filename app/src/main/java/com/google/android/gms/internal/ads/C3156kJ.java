package com.google.android.gms.internal.ads;

import G2.AbstractC0583d;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.kJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3156kJ {

    /* renamed from: a, reason: collision with root package name */
    private final HN f23575a;

    C3156kJ(HN hn) {
        this.f23575a = hn;
    }

    public final void a(View view, C3785q60 c3785q60) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Lc)).booleanValue() || view == null) {
            return;
        }
        String str = true != AbstractC0583d.a(view) ? "0" : "1";
        GN a8 = this.f23575a.a();
        a8.b("action", "hcp");
        a8.b("hcp", str);
        a8.c(c3785q60);
        a8.g();
    }
}
