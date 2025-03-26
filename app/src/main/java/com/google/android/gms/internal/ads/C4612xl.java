package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4612xl {
    public static final List a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            arrayList.add(optJSONArray.getString(i8));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
