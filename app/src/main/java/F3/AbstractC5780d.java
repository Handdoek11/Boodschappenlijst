package f3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5780d {
    public static int a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo b8 = b(context, str);
        if (b8 == null || (applicationInfo = b8.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    public static PackageInfo b(Context context, String str) {
        try {
            return h3.e.a(context).f(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean c() {
        return false;
    }
}
