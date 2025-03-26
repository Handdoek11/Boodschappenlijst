package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class E30 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14627a;

    public E30(String str) {
        this.f14627a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.f14627a)) {
                return;
            }
            G2.U.g(jSONObject, "pii").put("adsid", this.f14627a);
        } catch (JSONException e8) {
            H2.p.h("Failed putting trustless token.", e8);
        }
    }
}
