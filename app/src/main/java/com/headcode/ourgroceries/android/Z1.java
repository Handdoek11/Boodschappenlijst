package com.headcode.ourgroceries.android;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class Z1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f34632a = new HashMap();

    private void a(Y1 y12) {
        this.f34632a.put(y12.e(), y12);
    }

    public static Z1 e(JSONObject jSONObject) {
        Z1 z12 = new Z1();
        int optInt = jSONObject.optInt("version", 1);
        JSONArray jSONArray = jSONObject.getJSONArray("iaps");
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            Y1 a8 = Y1.a(jSONArray.getJSONObject(i8));
            if (optInt != 1 || !AbstractC6803e.o(a8.d())) {
                z12.a(a8);
            }
        }
        return z12;
    }

    public void b(Purchase purchase) {
        a(Y1.b(purchase));
    }

    public boolean c(String str) {
        Y1 y12 = (Y1) this.f34632a.get(str);
        return y12 != null && y12.c() == s5.c0.PS_PURCHASED;
    }

    public Z1 d() {
        Z1 z12 = new Z1();
        z12.f34632a.putAll(this.f34632a);
        return z12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Map map = this.f34632a;
        Map map2 = ((Z1) obj).f34632a;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public Y1 f(String str) {
        return (Y1) this.f34632a.get(str);
    }

    public Z1 g(Z1 z12) {
        Z1 z13 = new Z1();
        z13.f34632a.putAll(this.f34632a);
        z13.f34632a.putAll(z12.f34632a);
        return z13;
    }

    public JSONObject h() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f34632a.values().iterator();
        while (it.hasNext()) {
            jSONArray.put(((Y1) it.next()).h());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 2);
            jSONObject.put("iaps", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int hashCode() {
        Map map = this.f34632a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public List i() {
        return new ArrayList(this.f34632a.values());
    }

    public String toString() {
        return "OgIapSet{mIaps=" + this.f34632a + '}';
    }
}
