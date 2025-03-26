package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4836zo {

    /* renamed from: a, reason: collision with root package name */
    private final List f28698a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28699b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28700c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28701d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f28702e;

    /* renamed from: f, reason: collision with root package name */
    private final String f28703f;

    /* renamed from: g, reason: collision with root package name */
    private final int f28704g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f28705h;

    /* renamed from: i, reason: collision with root package name */
    private final String f28706i;

    /* renamed from: j, reason: collision with root package name */
    private final long f28707j;

    /* renamed from: k, reason: collision with root package name */
    private final long f28708k;

    public C4836zo(JSONObject jSONObject) {
        this.f28703f = jSONObject.optString("url");
        this.f28699b = jSONObject.optString("base_uri");
        this.f28700c = jSONObject.optString("post_parameters");
        this.f28701d = m(jSONObject.optString("drt_include"));
        this.f28702e = m(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f28698a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f28704g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f28705h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f28706i = jSONObject.optString("pool_key");
        this.f28707j = l(jSONObject.optString("start_time")).longValue();
        this.f28708k = l(jSONObject.optString("end_time")).longValue();
    }

    private static Long l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static boolean m(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    public final int a() {
        return this.f28704g;
    }

    public final long b() {
        return this.f28708k;
    }

    public final long c() {
        return this.f28707j;
    }

    public final String d() {
        return this.f28699b;
    }

    public final String e() {
        return this.f28706i;
    }

    public final String f() {
        return this.f28700c;
    }

    public final String g() {
        return this.f28703f;
    }

    public final List h() {
        return this.f28698a;
    }

    public final JSONObject i() {
        return this.f28705h;
    }

    public final boolean j() {
        return this.f28702e;
    }

    public final boolean k() {
        return this.f28701d;
    }
}
