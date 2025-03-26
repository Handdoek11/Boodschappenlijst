package com.headcode.ourgroceries.android;

import com.android.billingclient.api.Purchase;
import j$.util.Objects;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Y1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f34603a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34604b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34605c;

    /* renamed from: d, reason: collision with root package name */
    private final s5.c0 f34606d;

    private Y1(String str, String str2, boolean z7, s5.c0 c0Var) {
        this.f34603a = str;
        this.f34604b = str2;
        this.f34605c = z7;
        this.f34606d = c0Var;
    }

    public static Y1 a(JSONObject jSONObject) {
        return new Y1(jSONObject.getString("sku"), jSONObject.optString("purchaseToken", ""), jSONObject.optBoolean("autoRenewing", false), s5.c0.c(jSONObject.optInt("purchaseState", 1)));
    }

    public static Y1 b(Purchase purchase) {
        return new Y1(f(purchase.e()), purchase.c(), purchase.g(), s5.c0.c(purchase.b()));
    }

    private static String f(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("sku list must not be empty");
        }
        return (String) list.get(0);
    }

    public s5.c0 c() {
        return this.f34606d;
    }

    public String d() {
        return this.f34604b;
    }

    public String e() {
        return this.f34603a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Y1 y12 = (Y1) obj;
        return this.f34605c == y12.f34605c && this.f34603a.equals(y12.f34603a) && Objects.equals(this.f34604b, y12.f34604b) && this.f34606d == y12.f34606d;
    }

    public boolean g() {
        return this.f34605c;
    }

    public JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sku", this.f34603a);
            jSONObject.put("purchaseToken", this.f34604b);
            jSONObject.put("autoRenewing", this.f34605c);
            jSONObject.put("purchaseState", this.f34606d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int hashCode() {
        return Objects.hash(this.f34603a, this.f34604b, Boolean.valueOf(this.f34605c), this.f34606d);
    }

    public String toString() {
        return "OgIap{mSku='" + this.f34603a + "', mPurchaseToken='" + this.f34604b + "', mAutoRenewing=" + this.f34605c + ", mPurchaseState=" + this.f34606d + '}';
    }
}
