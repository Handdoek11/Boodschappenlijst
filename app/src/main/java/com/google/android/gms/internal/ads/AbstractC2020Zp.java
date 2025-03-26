package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Zp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2020Zp {
    static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i8 = indexOf + 1;
        return Uri.parse(str.substring(0, i8) + str2 + "=" + str3 + "&" + str.substring(i8));
    }

    public static String b(Uri uri, Context context, Map map) {
        if (!C2.v.r().p(context)) {
            return uri.toString();
        }
        String a8 = C2.v.r().a(context);
        if (a8 == null) {
            return uri.toString();
        }
        String str = (String) D2.A.c().a(AbstractC3184kf.f24001s0);
        String uri2 = uri.toString();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23992r0)).booleanValue() && uri2.contains(str)) {
            C2.v.r().j(context, a8, (Map) map.get("_ac"));
            return d(uri2, context).replace(str, a8);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23983q0)).booleanValue()) {
            return uri2;
        }
        String uri3 = a(d(uri2, context), "fbs_aeid", a8).toString();
        C2.v.r().j(context, a8, (Map) map.get("_ac"));
        return uri3;
    }

    public static String c(String str, Context context, boolean z7, Map map) {
        String a8;
        if ((((Boolean) D2.A.c().a(AbstractC3184kf.f24058z0)).booleanValue() && !z7) || !C2.v.r().p(context) || TextUtils.isEmpty(str) || (a8 = C2.v.r().a(context)) == null) {
            return str;
        }
        String str2 = (String) D2.A.c().a(AbstractC3184kf.f24001s0);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23992r0)).booleanValue() && str.contains(str2)) {
            if (C2.v.t().O(str)) {
                C2.v.r().j(context, a8, (Map) map.get("_ac"));
                return d(str, context).replace(str2, a8);
            }
            if (!C2.v.t().P(str)) {
                return str;
            }
            C2.v.r().k(context, a8, (Map) map.get("_ai"));
            return d(str, context).replace(str2, a8);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23983q0)).booleanValue()) {
            return str;
        }
        if (C2.v.t().O(str)) {
            C2.v.r().j(context, a8, (Map) map.get("_ac"));
            return a(d(str, context), "fbs_aeid", a8).toString();
        }
        if (!C2.v.t().P(str)) {
            return str;
        }
        C2.v.r().k(context, a8, (Map) map.get("_ai"));
        return a(d(str, context), "fbs_aeid", a8).toString();
    }

    private static String d(String str, Context context) {
        String d8 = C2.v.r().d(context);
        String b8 = C2.v.r().b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(d8)) {
            str = a(str, "gmp_app_id", d8).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(b8)) ? str : a(str, "fbs_aiid", b8).toString();
    }
}
