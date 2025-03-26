package f3;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f35861a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            Z2.r.l(context);
            Z2.r.l(th);
            return false;
        } catch (Exception e8) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e8);
            return false;
        }
    }
}
