package f3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.AbstractC1110i;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f35863a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f35864b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f35865c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f35866d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f35867e;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f35868f;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f35867e == null) {
            boolean z7 = false;
            if (m.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z7 = true;
            }
            f35867e = Boolean.valueOf(z7);
        }
        return f35867e.booleanValue();
    }

    public static boolean b(Context context) {
        if (f35868f == null) {
            boolean z7 = false;
            if (m.l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z7 = true;
            }
            f35868f = Boolean.valueOf(z7);
        }
        return f35868f.booleanValue();
    }

    public static boolean c(Context context) {
        if (f35865c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z7 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z7 = true;
            }
            f35865c = Boolean.valueOf(z7);
        }
        return f35865c.booleanValue();
    }

    public static boolean d(Context context) {
        return h(context);
    }

    public static boolean e() {
        int i8 = AbstractC1110i.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    public static boolean f(Context context) {
        return j(context.getPackageManager());
    }

    public static boolean g(Context context) {
        if (f(context) && !m.h()) {
            return true;
        }
        if (h(context)) {
            return !m.i() || m.l();
        }
        return false;
    }

    public static boolean h(Context context) {
        if (f35864b == null) {
            boolean z7 = false;
            if (m.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z7 = true;
            }
            f35864b = Boolean.valueOf(z7);
        }
        return f35864b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f35866d == null) {
            boolean z7 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z7 = false;
            }
            f35866d = Boolean.valueOf(z7);
        }
        return f35866d.booleanValue();
    }

    public static boolean j(PackageManager packageManager) {
        if (f35863a == null) {
            boolean z7 = false;
            if (m.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z7 = true;
            }
            f35863a = Boolean.valueOf(z7);
        }
        return f35863a.booleanValue();
    }
}
