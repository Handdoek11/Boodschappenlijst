package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4503wl {

    /* renamed from: a, reason: collision with root package name */
    public final List f27540a;

    public C4503wl(JSONObject jSONObject) {
        if (H2.p.j(2)) {
            AbstractC0608p0.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i8 = -1;
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                C4394vl c4394vl = new C4394vl(jSONArray.getJSONObject(i9));
                "banner".equalsIgnoreCase(c4394vl.f27340c);
                arrayList.add(c4394vl);
                if (i8 < 0) {
                    Iterator it = c4394vl.f27338a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i8 = i9;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f27540a = DesugarCollections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            C2.v.k();
            C4612xl.a(optJSONObject, "click_urls");
            C2.v.k();
            C4612xl.a(optJSONObject, "imp_urls");
            C2.v.k();
            C4612xl.a(optJSONObject, "downloaded_imp_urls");
            C2.v.k();
            C4612xl.a(optJSONObject, "nofill_urls");
            C2.v.k();
            C4612xl.a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            C1914Wo.A0(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
