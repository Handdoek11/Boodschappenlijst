package M4;

import E4.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import o0.AbstractC6278a;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4018a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f4019b;

    /* renamed from: c, reason: collision with root package name */
    private final c f4020c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4021d;

    public a(Context context, String str, c cVar) {
        Context a8 = a(context);
        this.f4018a = a8;
        this.f4019b = a8.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f4020c = cVar;
        this.f4021d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : AbstractC6278a.b(context);
    }

    private boolean c() {
        return this.f4019b.contains("firebase_data_collection_default_enabled") ? this.f4019b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f4018a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f4018a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f4021d;
    }
}
