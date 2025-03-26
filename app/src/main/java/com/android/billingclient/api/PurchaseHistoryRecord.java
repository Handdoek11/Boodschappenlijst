package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* renamed from: a, reason: collision with root package name */
    private final String f12348a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12349b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f12350c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f12348a = str;
        this.f12349b = str2;
        this.f12350c = new JSONObject(str);
    }

    public String a() {
        return this.f12348a;
    }

    public String b() {
        JSONObject jSONObject = this.f12350c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String c() {
        return this.f12349b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f12348a, purchaseHistoryRecord.a()) && TextUtils.equals(this.f12349b, purchaseHistoryRecord.c());
    }

    public int hashCode() {
        return this.f12348a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f12348a));
    }
}
