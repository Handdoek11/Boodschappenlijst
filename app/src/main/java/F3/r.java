package f3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C1111j;

/* loaded from: classes.dex */
public abstract class r {
    public static boolean a(Context context, int i8) {
        if (!b(context, i8, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1111j.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean b(Context context, int i8, String str) {
        return h3.e.a(context).h(i8, str);
    }
}
