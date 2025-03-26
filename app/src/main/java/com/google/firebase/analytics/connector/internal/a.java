package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import c4.AbstractC1012o;
import c4.r;
import w3.q;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final r f32706a = r.x("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1012o f32707b = AbstractC1012o.x("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1012o f32708c = AbstractC1012o.w("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC1012o f32709d = AbstractC1012o.v("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC1012o f32710e = new AbstractC1012o.a().e(w3.r.f44349a).e(w3.r.f44350b).f();

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC1012o f32711f = AbstractC1012o.v("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static String a(String str) {
        String a8 = q.a(str);
        return a8 != null ? a8 : str;
    }

    public static void b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean c(String str, Bundle bundle) {
        if (f32707b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC1012o abstractC1012o = f32709d;
        int size = abstractC1012o.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = abstractC1012o.get(i8);
            i8++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f32710e.contains(str2)) {
            return false;
        }
        AbstractC1012o abstractC1012o = f32711f;
        int size = abstractC1012o.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = abstractC1012o.get(i8);
            i8++;
            if (str2.matches((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!g(str) || bundle == null) {
            return false;
        }
        AbstractC1012o abstractC1012o = f32709d;
        int size = abstractC1012o.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = abstractC1012o.get(i8);
            i8++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean f(String str) {
        return !f32706a.contains(str);
    }

    public static boolean g(String str) {
        return !f32708c.contains(str);
    }
}
