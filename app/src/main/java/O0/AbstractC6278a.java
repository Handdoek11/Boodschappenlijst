package o0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.n;
import java.io.File;
import p0.h;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6278a {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f39810a = new Object();

    /* renamed from: o0.a$a, reason: collision with other inner class name */
    static class C0297a {
        static Drawable a(Context context, int i8) {
            return context.getDrawable(i8);
        }

        static File b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: o0.a$b */
    static class b {
        static int a(Context context, int i8) {
            return context.getColor(i8);
        }

        static Object b(Context context, Class cls) {
            return context.getSystemService(cls);
        }
    }

    /* renamed from: o0.a$c */
    static class c {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* renamed from: o0.a$d */
    static class d {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i8) {
            return ((i8 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i8 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, AbstractC6278a.j(context), handler);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: o0.a$e */
    static class e {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i8) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i8);
        }
    }

    public static int a(Context context, String str) {
        y0.d.d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : n.b(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.a(context);
        }
        return null;
    }

    public static int c(Context context, int i8) {
        return b.a(context, i8);
    }

    public static ColorStateList d(Context context, int i8) {
        return h.d(context.getResources(), i8, context.getTheme());
    }

    public static Drawable e(Context context, int i8) {
        return C0297a.a(context, i8);
    }

    public static File[] f(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] g(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File h(Context context) {
        return C0297a.b(context);
    }

    public static Object i(Context context, Class cls) {
        return b.b(context, cls);
    }

    static String j(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (o0.d.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent k(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i8) {
        return l(context, broadcastReceiver, intentFilter, null, null, i8);
    }

    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i8) {
        int i9 = i8 & 1;
        if (i9 != 0 && (i8 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i9 != 0) {
            i8 |= 2;
        }
        int i10 = i8;
        int i11 = i10 & 2;
        if (i11 == 0 && (i10 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i12 = Build.VERSION.SDK_INT;
        return i12 >= 33 ? e.a(context, broadcastReceiver, intentFilter, str, handler, i10) : i12 >= 26 ? d.a(context, broadcastReceiver, intentFilter, str, handler, i10) : ((i10 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, j(context), handler);
    }

    public static boolean m(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static void n(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void o(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
