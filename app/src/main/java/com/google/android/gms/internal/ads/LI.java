package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class LI extends MI {

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f16809b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16810c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16811d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16812e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16813f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16814g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f16815h;

    public LI(C3785q60 c3785q60, JSONObject jSONObject) {
        super(c3785q60);
        this.f16809b = G2.U.h(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f16810c = G2.U.l(false, jSONObject, "allow_pub_owned_ad_view");
        this.f16811d = G2.U.l(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f16812e = G2.U.l(false, jSONObject, "enable_omid");
        this.f16814g = G2.U.b("", jSONObject, "watermark_overlay_png_base64");
        this.f16813f = jSONObject.optJSONObject("overlay") != null;
        this.f16815h = ((Boolean) D2.A.c().a(AbstractC3184kf.f23925j5)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.MI
    public final O60 a() {
        JSONObject jSONObject = this.f16815h;
        return jSONObject != null ? new O60(jSONObject) : this.f17320a.f25773V;
    }

    @Override // com.google.android.gms.internal.ads.MI
    public final String b() {
        return this.f16814g;
    }

    @Override // com.google.android.gms.internal.ads.MI
    public final JSONObject c() {
        JSONObject jSONObject = this.f16809b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f17320a.f25828z);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.MI
    public final boolean d() {
        return this.f16812e;
    }

    @Override // com.google.android.gms.internal.ads.MI
    public final boolean e() {
        return this.f16810c;
    }

    @Override // com.google.android.gms.internal.ads.MI
    public final boolean f() {
        return this.f16811d;
    }

    @Override // com.google.android.gms.internal.ads.MI
    public final boolean g() {
        return this.f16813f;
    }
}
