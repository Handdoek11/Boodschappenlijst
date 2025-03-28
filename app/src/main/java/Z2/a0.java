package Z2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6275a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6276b;

    /* renamed from: c, reason: collision with root package name */
    private static String f6277c;

    /* renamed from: d, reason: collision with root package name */
    private static int f6278d;

    public static int a(Context context) {
        b(context);
        return f6278d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f6275a) {
            try {
                if (f6276b) {
                    return;
                }
                f6276b = true;
                try {
                    bundle = h3.e.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e8);
                }
                if (bundle == null) {
                    return;
                }
                f6277c = bundle.getString("com.google.app.id");
                f6278d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
