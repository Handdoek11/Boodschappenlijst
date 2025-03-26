package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: a, reason: collision with root package name */
    private final String f12345a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12346b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f12347c;

    public Purchase(String str, String str2) {
        this.f12345a = str;
        this.f12346b = str2;
        this.f12347c = new JSONObject(str);
    }

    private final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        if (this.f12347c.has("productIds")) {
            JSONArray optJSONArray = this.f12347c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                    arrayList.add(optJSONArray.optString(i8));
                }
            }
        } else if (this.f12347c.has("productId")) {
            arrayList.add(this.f12347c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        return this.f12345a;
    }

    public int b() {
        return this.f12347c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String c() {
        JSONObject jSONObject = this.f12347c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String d() {
        return this.f12346b;
    }

    public ArrayList e() {
        return h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f12345a, purchase.a()) && TextUtils.equals(this.f12346b, purchase.d());
    }

    public boolean f() {
        return this.f12347c.optBoolean("acknowledged", true);
    }

    public boolean g() {
        return this.f12347c.optBoolean("autoRenewing");
    }

    public int hashCode() {
        return this.f12345a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f12345a));
    }
}
