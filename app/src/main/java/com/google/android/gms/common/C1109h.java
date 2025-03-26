package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.common.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1109h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13414a = AbstractC1110i.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b, reason: collision with root package name */
    private static final C1109h f13415b = new C1109h();

    C1109h() {
    }

    public static C1109h f() {
        return f13415b;
    }

    public int a(Context context) {
        return AbstractC1110i.getApkVersion(context);
    }

    public Intent b(Context context, int i8, String str) {
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && f3.i.g(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f13414a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(h3.e.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i8, int i9) {
        return d(context, i8, i9, null);
    }

    public PendingIntent d(Context context, int i8, int i9, String str) {
        Intent b8 = b(context, i8, str);
        if (b8 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i9, b8, o3.d.f39814a | 134217728);
    }

    public String e(int i8) {
        return AbstractC1110i.getErrorString(i8);
    }

    public int g(Context context) {
        return h(context, f13414a);
    }

    public int h(Context context, int i8) {
        int isGooglePlayServicesAvailable = AbstractC1110i.isGooglePlayServicesAvailable(context, i8);
        if (AbstractC1110i.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    public boolean i(Context context, String str) {
        return AbstractC1110i.zza(context, str);
    }

    public boolean j(int i8) {
        return AbstractC1110i.isUserRecoverableError(i8);
    }
}
