package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: a, reason: collision with root package name */
    private final String f12359a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f12360b;

    public SkuDetails(String str) {
        this.f12359a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12360b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f12360b.optString("freeTrialPeriod");
    }

    public String b() {
        return this.f12360b.optString("price");
    }

    public long c() {
        return this.f12360b.optLong("price_amount_micros");
    }

    public String d() {
        return this.f12360b.optString("productId");
    }

    public String e() {
        return this.f12360b.optString("type");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f12359a, ((SkuDetails) obj).f12359a);
        }
        return false;
    }

    public int f() {
        return this.f12360b.optInt("offer_type");
    }

    public String g() {
        return this.f12360b.optString("offer_id");
    }

    public String h() {
        String optString = this.f12360b.optString("offerIdToken");
        return optString.isEmpty() ? this.f12360b.optString("offer_id_token") : optString;
    }

    public int hashCode() {
        return this.f12359a.hashCode();
    }

    public final String i() {
        return this.f12360b.optString("packageName");
    }

    public String j() {
        return this.f12360b.optString("serializedDocid");
    }

    final String k() {
        return this.f12360b.optString("skuDetailsToken");
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f12359a));
    }
}
