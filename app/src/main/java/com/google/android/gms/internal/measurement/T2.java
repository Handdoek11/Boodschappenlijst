package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class T2 {

    /* renamed from: a, reason: collision with root package name */
    private static UserManager f29019a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f29020b = !a();

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    private static boolean d(Context context) {
        if (f29020b) {
            return true;
        }
        synchronized (T2.class) {
            try {
                if (f29020b) {
                    return true;
                }
                boolean e8 = e(context);
                if (e8) {
                    f29020b = e8;
                }
                return e8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean e(Context context) {
        boolean z7;
        boolean z8 = true;
        int i8 = 1;
        while (true) {
            z7 = false;
            if (i8 > 2) {
                break;
            }
            if (f29019a == null) {
                f29019a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f29019a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z8 = false;
                }
            } catch (NullPointerException e8) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e8);
                f29019a = null;
                i8++;
            }
        }
        z7 = z8;
        if (z7) {
            f29019a = null;
        }
        return z7;
    }
}
