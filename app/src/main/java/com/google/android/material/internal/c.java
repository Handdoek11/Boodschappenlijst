package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import q0.AbstractC6410a;
import z0.AbstractC7034k0;

/* loaded from: classes2.dex */
public abstract class c {
    public static void a(Window window, boolean z7, Integer num, Integer num2) {
        boolean z8 = num == null || num.intValue() == 0;
        boolean z9 = num2 == null || num2.intValue() == 0;
        if (z8 || z9) {
            int b8 = L3.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z8) {
                num = Integer.valueOf(b8);
            }
            if (z9) {
                num2 = Integer.valueOf(b8);
            }
        }
        AbstractC7034k0.b(window, !z7);
        int c8 = c(window.getContext(), z7);
        int b9 = b(window.getContext(), z7);
        window.setStatusBarColor(c8);
        window.setNavigationBarColor(b9);
        f(window, d(c8, L3.a.h(num.intValue())));
        e(window, d(b9, L3.a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z7) {
        if (z7 && Build.VERSION.SDK_INT < 27) {
            return AbstractC6410a.k(L3.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z7) {
            return 0;
        }
        return L3.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z7) {
        if (z7) {
            return 0;
        }
        return L3.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i8, boolean z7) {
        return L3.a.h(i8) || (i8 == 0 && z7);
    }

    public static void e(Window window, boolean z7) {
        AbstractC7034k0.a(window, window.getDecorView()).a(z7);
    }

    public static void f(Window window, boolean z7) {
        AbstractC7034k0.a(window, window.getDecorView()).b(z7);
    }
}
