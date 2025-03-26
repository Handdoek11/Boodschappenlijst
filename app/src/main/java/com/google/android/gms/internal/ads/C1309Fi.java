package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1309Fi implements InterfaceC1662Pi {
    C1309Fi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(interfaceC4410vt.getContext()).edit();
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                edit.remove(jSONArray.getString(i8));
            }
            edit.apply();
        } catch (JSONException e8) {
            C2.v.s().x(e8, "GMSG clear local storage keys handler");
        }
    }
}
