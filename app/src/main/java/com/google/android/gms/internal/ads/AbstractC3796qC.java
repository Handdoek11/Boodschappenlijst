package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.qC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3796qC {
    public static int a(int i8, int i9, int i10) {
        if (i8 < 0 || i8 >= i10) {
            throw new IndexOutOfBoundsException();
        }
        return i8;
    }

    public static Object b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static void d(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void f(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
