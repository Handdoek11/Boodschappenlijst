package p3;

import a4.C0817a;
import a4.C0820d;
import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
final class e1 {

    /* renamed from: a, reason: collision with root package name */
    private final a1 f40265a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f40266b;

    /* renamed from: c, reason: collision with root package name */
    private final C0817a f40267c;

    /* renamed from: d, reason: collision with root package name */
    private final C0820d f40268d;

    /* synthetic */ e1(a1 a1Var, Activity activity, C0817a c0817a, C0820d c0820d, b1 b1Var) {
        this.f40265a = a1Var;
        this.f40266b = activity;
        this.f40267c = c0817a;
        this.f40268d = c0820d;
    }

    static /* bridge */ /* synthetic */ C6347j0 a(e1 e1Var) {
        Bundle bundle;
        List arrayList;
        List list;
        PackageInfo packageInfo;
        C6347j0 c6347j0 = new C6347j0();
        String c8 = e1Var.f40268d.c();
        if (TextUtils.isEmpty(c8)) {
            try {
                bundle = e1Var.f40265a.f40239a.getPackageManager().getApplicationInfo(e1Var.f40265a.f40239a.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                c8 = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(c8)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        c6347j0.f40310a = c8;
        if (e1Var.f40267c.b()) {
            arrayList = new ArrayList();
            int a8 = e1Var.f40267c.a();
            if (a8 == 1) {
                arrayList.add(EnumC6337e0.GEO_OVERRIDE_EEA);
            } else if (a8 == 2) {
                arrayList.add(EnumC6337e0.GEO_OVERRIDE_NON_EEA);
            } else if (a8 == 3) {
                arrayList.add(EnumC6337e0.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (a8 == 4) {
                arrayList.add(EnumC6337e0.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(EnumC6337e0.PREVIEWING_DEBUG_MESSAGES);
        } else {
            arrayList = Collections.emptyList();
        }
        c6347j0.f40318i = arrayList;
        c6347j0.f40314e = e1Var.f40265a.f40240b.c();
        c6347j0.f40313d = Boolean.valueOf(e1Var.f40268d.b());
        c6347j0.f40312c = Locale.getDefault().toLanguageTag();
        C6339f0 c6339f0 = new C6339f0();
        int i8 = Build.VERSION.SDK_INT;
        c6339f0.f40271b = Integer.valueOf(i8);
        c6339f0.f40270a = Build.MODEL;
        c6339f0.f40272c = 2;
        c6347j0.f40311b = c6339f0;
        Configuration configuration = e1Var.f40265a.f40239a.getResources().getConfiguration();
        e1Var.f40265a.f40239a.getResources().getConfiguration();
        C6343h0 c6343h0 = new C6343h0();
        c6343h0.f40294a = Integer.valueOf(configuration.screenWidthDp);
        c6343h0.f40295b = Integer.valueOf(configuration.screenHeightDp);
        c6343h0.f40296c = Double.valueOf(e1Var.f40265a.f40239a.getResources().getDisplayMetrics().density);
        if (i8 < 28) {
            list = Collections.emptyList();
        } else {
            Activity activity = e1Var.f40266b;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        C6341g0 c6341g0 = new C6341g0();
                        c6341g0.f40288b = Integer.valueOf(rect.left);
                        c6341g0.f40289c = Integer.valueOf(rect.right);
                        c6341g0.f40287a = Integer.valueOf(rect.top);
                        c6341g0.f40290d = Integer.valueOf(rect.bottom);
                        arrayList2.add(c6341g0);
                    }
                }
                list = arrayList2;
            }
        }
        c6343h0.f40297d = list;
        c6347j0.f40315f = c6343h0;
        a1 a1Var = e1Var.f40265a;
        Application application = a1Var.f40239a;
        try {
            packageInfo = a1Var.f40239a.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        C6333c0 c6333c0 = new C6333c0();
        c6333c0.f40250a = application.getPackageName();
        CharSequence applicationLabel = e1Var.f40265a.f40239a.getPackageManager().getApplicationLabel(e1Var.f40265a.f40239a.getApplicationInfo());
        c6333c0.f40251b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            c6333c0.f40252c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        c6347j0.f40316g = c6333c0;
        C6345i0 c6345i0 = new C6345i0();
        c6345i0.f40302a = "3.1.0";
        c6347j0.f40317h = c6345i0;
        return c6347j0;
    }
}
