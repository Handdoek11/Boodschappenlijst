package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3598oO {

    /* renamed from: a, reason: collision with root package name */
    private Long f25169a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25170b;

    /* renamed from: c, reason: collision with root package name */
    private String f25171c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f25172d;

    /* renamed from: e, reason: collision with root package name */
    private String f25173e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f25174f;

    /* synthetic */ C3598oO(String str, AbstractC3707pO abstractC3707pO) {
        this.f25170b = str;
    }

    static /* bridge */ /* synthetic */ String a(C3598oO c3598oO) {
        String str = (String) D2.A.c().a(AbstractC3184kf.R9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", c3598oO.f25169a);
            jSONObject.put("eventCategory", c3598oO.f25170b);
            jSONObject.putOpt("event", c3598oO.f25171c);
            jSONObject.putOpt("errorCode", c3598oO.f25172d);
            jSONObject.putOpt("rewardType", c3598oO.f25173e);
            jSONObject.putOpt("rewardAmount", c3598oO.f25174f);
        } catch (JSONException unused) {
            H2.p.g("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
