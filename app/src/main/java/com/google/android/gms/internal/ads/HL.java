package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class HL {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f15714a = new Object();

    public static String a(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (f15714a) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace("\n", "\n  ") + "\n";
    }

    public static void b(String str, String str2) {
        synchronized (f15714a) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f15714a) {
            Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f15714a) {
            Log.e(str, a(str2, th));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f15714a) {
            Log.i(str, a(str2, null));
        }
    }

    public static void f(String str, String str2) {
        synchronized (f15714a) {
            Log.w(str, a(str2, null));
        }
    }

    public static void g(String str, String str2, Throwable th) {
        synchronized (f15714a) {
            Log.w(str, a(str2, th));
        }
    }
}
