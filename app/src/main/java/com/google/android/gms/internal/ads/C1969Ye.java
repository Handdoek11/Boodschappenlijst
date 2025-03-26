package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1969Ye extends AbstractC2207bf {
    C1969Ye(int i8, String str, Float f8, Float f9) {
        super(1, str, f8, f9, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(l(), ((Float) k()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(l()))) : (Float) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(l(), ((Float) k()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(l(), ((Float) obj).floatValue());
    }
}
