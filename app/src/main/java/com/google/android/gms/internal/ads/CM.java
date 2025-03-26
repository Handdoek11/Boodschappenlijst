package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class CM {
    public static String a(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (b(optJSONArray2, str) && !b(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    private static boolean b(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                String optString = jSONArray.optString(i8);
                try {
                } catch (PatternSyntaxException e8) {
                    C2.v.s().x(e8, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if ((((Boolean) D2.A.c().a(AbstractC3184kf.Oa)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }
}
