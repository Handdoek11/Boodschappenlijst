package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2215bj {
    public static final Intent a(Uri uri, Context context, N9 n9, View view, P60 p60) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final Intent b(Intent intent, ResolveInfo resolveInfo, Context context, N9 n9, View view, P60 p60) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static final ResolveInfo c(Intent intent, Context context, N9 n9, View view, P60 p60) {
        return d(intent, new ArrayList(), context, n9, view, p60);
    }

    public static final ResolveInfo d(Intent intent, ArrayList arrayList, Context context, N9 n9, View view, P60 p60) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th) {
            C2.v.s().x(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i8 = 0;
            while (true) {
                if (i8 >= queryIntentActivities.size()) {
                    break;
                }
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i8).activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
                i8++;
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }
}
