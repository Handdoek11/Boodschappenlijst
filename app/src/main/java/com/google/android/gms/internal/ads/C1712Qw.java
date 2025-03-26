package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1712Qw implements InterfaceC1361Gw {

    /* renamed from: a, reason: collision with root package name */
    private final C3490nP f18568a;

    C1712Qw(C3490nP c3490nP) {
        this.f18568a = c3490nP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1361Gw
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.e9)).booleanValue()) {
                this.f18568a.o(jSONObject);
            }
        }
    }
}
