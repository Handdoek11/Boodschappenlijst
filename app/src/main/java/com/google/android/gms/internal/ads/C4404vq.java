package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4404vq {

    /* renamed from: d, reason: collision with root package name */
    private String f27362d;

    /* renamed from: e, reason: collision with root package name */
    private String f27363e;

    /* renamed from: f, reason: collision with root package name */
    private long f27364f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f27365g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27366h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27368j;

    /* renamed from: a, reason: collision with root package name */
    private final List f27359a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f27360b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f27361c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final List f27367i = new ArrayList();

    public C4404vq(String str, long j8) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f27362d = "";
        this.f27366h = false;
        this.f27368j = false;
        this.f27363e = str;
        this.f27364f = j8;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f27365g = new JSONObject(str);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.zb)).booleanValue() && j()) {
                return;
            }
            if (this.f27365g.optInt("status", -1) != 1) {
                this.f27366h = false;
                H2.p.g("App settings could not be fetched successfully.");
                return;
            }
            this.f27366h = true;
            this.f27362d = this.f27365g.optString("app_id");
            JSONArray optJSONArray2 = this.f27365g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i8);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.f27360b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f27361c.put(optString2, new C4503wl(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f27365g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                    this.f27359a.add(optJSONArray3.optString(i9));
                }
            }
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23701I6)).booleanValue() && (optJSONObject2 = this.f27365g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.f27367i.add(optJSONArray.get(i10).toString());
                }
            }
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23881e6)).booleanValue() || (optJSONObject = this.f27365g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f27368j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e8) {
            H2.p.h("Exception occurred while processing app setting json", e8);
            C2.v.s().x(e8, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.f27364f;
    }

    public final String b() {
        return this.f27362d;
    }

    public final String c() {
        return this.f27363e;
    }

    public final List d() {
        return this.f27367i;
    }

    public final Map e() {
        return this.f27361c;
    }

    public final JSONObject f() {
        return this.f27365g;
    }

    public final void g(long j8) {
        this.f27364f = j8;
    }

    public final boolean h() {
        return this.f27368j;
    }

    public final boolean i() {
        return this.f27366h;
    }

    public final boolean j() {
        if (!TextUtils.isEmpty(this.f27363e) && this.f27365g != null) {
            AbstractC2207bf abstractC2207bf = AbstractC3184kf.Cb;
            long longValue = ((Long) D2.A.c().a(abstractC2207bf)).longValue();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Bb)).booleanValue() && !TextUtils.isEmpty(this.f27363e)) {
                longValue = this.f27365g.optLong("cache_ttl_sec", ((Long) D2.A.c().a(abstractC2207bf)).longValue());
            }
            long a8 = C2.v.c().a();
            if (longValue >= 0) {
                long j8 = this.f27364f;
                if (j8 > a8 || TimeUnit.MILLISECONDS.toSeconds(a8 - j8) > longValue) {
                    this.f27359a.clear();
                    this.f27360b.clear();
                    this.f27361c.clear();
                    this.f27362d = "";
                    this.f27363e = "";
                    this.f27365g = null;
                    this.f27366h = false;
                    this.f27367i.clear();
                    this.f27368j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
