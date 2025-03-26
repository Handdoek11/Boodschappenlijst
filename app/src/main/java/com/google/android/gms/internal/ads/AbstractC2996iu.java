package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.iu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2996iu {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f23074a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f23075b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(C3785q60 c3785q60) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && c3785q60.f25771T && c3785q60.f25773V.b() && c3785q60.f25780b != 4) {
            EnumC3494nT enumC3494nT = c3785q60.f25773V.c() == 1 ? EnumC3494nT.VIDEO : EnumC3494nT.HTML_DISPLAY;
            String str = c3785q60.f25801l0;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("creativeType", enumC3494nT.toString());
                jSONObject.put("contentUrl", str);
                return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e8) {
                H2.p.h("Unable to build OMID ENV JSON", e8);
            }
        }
        return null;
    }

    public static String b(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f23074a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!f23075b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
