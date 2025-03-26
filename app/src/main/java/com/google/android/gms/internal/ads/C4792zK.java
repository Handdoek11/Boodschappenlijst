package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4792zK {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f28594a;

    /* renamed from: b, reason: collision with root package name */
    private final C4247uK f28595b;

    public C4792zK(Executor executor, C4247uK c4247uK) {
        this.f28594a = executor;
        this.f28595b = c4247uK;
    }

    public final com.google.common.util.concurrent.d a(JSONObject jSONObject, String str) {
        com.google.common.util.concurrent.d h8;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return AbstractC2326ck0.h(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
            if (optJSONObject == null) {
                h8 = AbstractC2326ck0.h(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    h8 = AbstractC2326ck0.h(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    h8 = "string".equals(optString2) ? AbstractC2326ck0.h(new C4683yK(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? AbstractC2326ck0.m(this.f28595b.e(optJSONObject, "image_value"), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.wK
                        @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                        public final Object apply(Object obj) {
                            return new C4683yK(optString, (BinderC1484Kg) obj);
                        }
                    }, this.f28594a) : AbstractC2326ck0.h(null);
                }
            }
            arrayList.add(h8);
        }
        return AbstractC2326ck0.m(AbstractC2326ck0.d(arrayList), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.xK
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (C4683yK c4683yK : (List) obj) {
                    if (c4683yK != null) {
                        arrayList2.add(c4683yK);
                    }
                }
                return arrayList2;
            }
        }, this.f28594a);
    }
}
