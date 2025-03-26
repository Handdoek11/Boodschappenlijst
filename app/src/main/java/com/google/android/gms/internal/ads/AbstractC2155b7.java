package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2155b7 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20815a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f20816b = Log.isLoggable("Volley", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f20817c = AbstractC2155b7.class.getName();

    public static void a(String str, Object... objArr) {
        Log.d(f20815a, e(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e(f20815a, e(str, objArr));
    }

    public static void c(Throwable th, String str, Object... objArr) {
        Log.e(f20815a, e(str, objArr), th);
    }

    public static void d(String str, Object... objArr) {
        if (f20816b) {
            Log.v(f20815a, e(str, objArr));
        }
    }

    private static String e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i8 = 2;
        while (true) {
            if (i8 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i8].getClassName().equals(f20817c)) {
                String className = stackTrace[i8].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i8].getMethodName();
                break;
            }
            i8++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}
