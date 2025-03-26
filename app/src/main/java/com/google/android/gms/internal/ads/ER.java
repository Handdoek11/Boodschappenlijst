package com.google.android.gms.internal.ads;

import D2.C0555y;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class ER implements InterfaceC1910Wk {
    ER() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1910Wk
    public final /* bridge */ /* synthetic */ JSONObject c(Object obj) {
        FR fr = (FR) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.h9)).booleanValue()) {
            jSONObject2.put("ad_request_url", fr.f15161c.g());
            jSONObject2.put("ad_request_post_body", fr.f15161c.f());
        }
        jSONObject2.put("base_url", fr.f15161c.d());
        jSONObject2.put("signals", fr.f15160b);
        jSONObject3.put("body", fr.f15159a.f16248c);
        jSONObject3.put("headers", C0555y.b().n(fr.f15159a.f16247b));
        jSONObject3.put("response_code", fr.f15159a.f16246a);
        jSONObject3.put("latency", fr.f15159a.f16249d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", fr.f15161c.i());
        return jSONObject;
    }
}
