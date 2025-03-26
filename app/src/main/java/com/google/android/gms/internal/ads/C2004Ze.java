package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2004Ze extends AbstractC2207bf {
    C2004Ze(int i8, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(l(), (String) k());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(l())) : (String) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(l(), (String) k());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(l(), (String) obj);
    }
}
