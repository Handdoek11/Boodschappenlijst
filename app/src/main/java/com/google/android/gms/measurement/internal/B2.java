package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.adadapted.android.sdk.core.ad.AdActionType;
import com.google.android.gms.internal.measurement.C4922g7;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class B2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30289a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f30290b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f30291c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C5461z2 f30292d;

    public B2(C5461z2 c5461z2, String str, Bundle bundle) {
        this.f30292d = c5461z2;
        Z2.r.f(str);
        this.f30289a = str;
        if (c5461z2.a().r(G.f30457l1)) {
            this.f30290b = new Bundle();
        } else {
            this.f30290b = new Bundle();
        }
    }

    private final String c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str);
                    if (C4922g7.a() && this.f30292d.a().r(G.f30389J0)) {
                        if (obj instanceof String) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", AdActionType.LINK);
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "d");
                        } else {
                            this.f30292d.h().E().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", AdActionType.LINK);
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f30292d.h().E().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e8) {
                    this.f30292d.h().E().b("Cannot serialize bundle value to SharedPreferences", e8);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[Catch: NumberFormatException | JSONException -> 0x0128, NumberFormatException | JSONException -> 0x0128, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0128, blocks: (B:9:0x0025, B:42:0x0091, B:42:0x0091, B:43:0x00a2, B:43:0x00a2, B:45:0x00a8, B:45:0x00a8, B:47:0x00b6, B:47:0x00b6, B:49:0x00c8, B:49:0x00c8, B:50:0x00d1, B:50:0x00d1, B:51:0x00d5, B:51:0x00d5, B:53:0x00db, B:53:0x00db, B:55:0x00e9, B:55:0x00e9, B:57:0x00fb, B:57:0x00fb, B:58:0x0104, B:58:0x0104, B:59:0x0108, B:59:0x0108, B:60:0x0114, B:60:0x0114, B:61:0x0120, B:61:0x0120, B:20:0x0052, B:23:0x005c, B:26:0x0066, B:29:0x0070, B:32:0x007a), top: B:79:0x0025, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.B2.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        } else if (this.f30292d.a().r(G.f30457l1)) {
            bundle = new Bundle(bundle);
        }
        SharedPreferences.Editor edit = this.f30292d.H().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f30289a);
        } else {
            edit.putString(this.f30289a, c(bundle));
        }
        edit.apply();
        this.f30291c = bundle;
    }
}
