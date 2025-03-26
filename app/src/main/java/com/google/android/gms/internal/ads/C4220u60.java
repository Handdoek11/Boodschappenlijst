package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.u60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4220u60 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26997b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f26998c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f26999d;

    C4220u60(JsonReader jsonReader) {
        JSONObject i8 = G2.U.i(jsonReader);
        this.f26999d = i8;
        this.f26996a = i8.optString("ad_html", null);
        this.f26997b = i8.optString("ad_base_url", null);
        this.f26998c = i8.optJSONObject("ad_json");
    }
}
