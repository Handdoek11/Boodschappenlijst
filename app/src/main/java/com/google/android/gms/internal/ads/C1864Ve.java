package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1864Ve extends AbstractC2207bf {
    C1864Ve(int i8, String str, Boolean bool, Boolean bool2) {
        super(i8, str, bool, bool2, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(l(), ((Boolean) k()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(l()))) : (Boolean) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(l(), ((Boolean) k()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(l(), ((Boolean) obj).booleanValue());
    }
}
