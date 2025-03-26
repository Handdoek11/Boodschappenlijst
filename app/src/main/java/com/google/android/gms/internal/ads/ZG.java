package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;

/* loaded from: classes.dex */
public abstract class ZG {
    public static void a(boolean z7, String str) {
        if (!z7) {
            throw new zzde(str);
        }
    }

    public static boolean b(Context context) {
        int i8 = AbstractC2301cW.f21206a;
        if (i8 < 24) {
            return false;
        }
        if (i8 < 26 && ("samsung".equals(AbstractC2301cW.f21208c) || "XT1650".equals(AbstractC2301cW.f21209d))) {
            return false;
        }
        if (i8 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return d("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean c() {
        return d("EGL_KHR_surfaceless_context");
    }

    private static boolean d(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }
}
