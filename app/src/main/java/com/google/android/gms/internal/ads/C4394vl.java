package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4394vl {

    /* renamed from: a, reason: collision with root package name */
    public final List f27338a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27339b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27340c;

    public C4394vl(JSONObject jSONObject) {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            arrayList.add(jSONArray.getString(i8));
        }
        this.f27338a = DesugarCollections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        C2.v.k();
        C4612xl.a(jSONObject, "clickurl");
        C2.v.k();
        C4612xl.a(jSONObject, "imp_urls");
        C2.v.k();
        C4612xl.a(jSONObject, "downloaded_imp_urls");
        C2.v.k();
        C4612xl.a(jSONObject, "fill_urls");
        C2.v.k();
        C4612xl.a(jSONObject, "video_start_urls");
        C2.v.k();
        C4612xl.a(jSONObject, "video_complete_urls");
        C2.v.k();
        C4612xl.a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            C2.v.k();
            C4612xl.a(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f27339b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        C2.v.k();
        C4612xl.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f27340c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
