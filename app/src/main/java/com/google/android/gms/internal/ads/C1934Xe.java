package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1934Xe extends AbstractC2207bf {
    C1934Xe(int i8, String str, Long l8, Long l9) {
        super(1, str, l8, l9, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(l(), ((Long) k()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(l()))) : (Long) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(l(), ((Long) k()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2207bf
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(l(), ((Long) obj).longValue());
    }
}
