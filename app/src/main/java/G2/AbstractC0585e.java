package G2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1232Df0;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C2858he0;
import com.google.android.gms.internal.ads.C2967ie0;
import com.google.android.gms.internal.ads.C2970ig0;
import com.google.android.gms.internal.ads.C3074je0;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: G2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0585e {
    public static Bundle a(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return b(context, str);
    }

    public static Bundle b(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e8) {
                H2.p.c("JSON parsing error", e8);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i8);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i9 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i9 != 0) {
                List f8 = C2970ig0.b(AbstractC1232Df0.c('/')).f(optString2);
                if (f8.size() > 2 || f8.isEmpty()) {
                    obj = null;
                } else {
                    if (f8.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) f8.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) f8.get(0), 0);
                        str2 = (String) f8.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i10 = i9 - 1;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void c(Context context) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23854b6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            C2858he0 k8 = C2858he0.k(context);
            C2967ie0 j8 = C2967ie0.j(context);
            C3074je0 a8 = C3074je0.a(context);
            k8.l();
            k8.m();
            j8.k();
            a8.b(null);
        } catch (IOException e8) {
            C2.v.s().x(e8, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e9) {
            C2.v.s().x(e9, "clearStorageOnIdlessMode_scar");
        }
    }
}
