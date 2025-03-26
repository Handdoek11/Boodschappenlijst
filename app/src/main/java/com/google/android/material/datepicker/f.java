package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
abstract class f {
    static String a(Context context, long j8, boolean z7, boolean z8, boolean z9) {
        String d8 = d(j8);
        if (z7) {
            d8 = String.format(context.getString(D3.j.f1606v), d8);
        }
        return z8 ? String.format(context.getString(D3.j.f1605u), d8) : z9 ? String.format(context.getString(D3.j.f1602r), d8) : d8;
    }

    static String b(long j8) {
        return c(j8, Locale.getDefault());
    }

    static String c(long j8, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? z.f(locale).format(new Date(j8)) : z.e(locale).format(new Date(j8));
    }

    static String d(long j8) {
        return i(j8) ? b(j8) : g(j8);
    }

    static String e(Context context, int i8) {
        return z.i().get(1) == i8 ? String.format(context.getString(D3.j.f1603s), Integer.valueOf(i8)) : String.format(context.getString(D3.j.f1604t), Integer.valueOf(i8));
    }

    static String f(long j8) {
        return Build.VERSION.SDK_INT >= 24 ? z.m(Locale.getDefault()).format(new Date(j8)) : DateUtils.formatDateTime(null, j8, 8228);
    }

    static String g(long j8) {
        return h(j8, Locale.getDefault());
    }

    static String h(long j8, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? z.n(locale).format(new Date(j8)) : z.e(locale).format(new Date(j8));
    }

    private static boolean i(long j8) {
        Calendar i8 = z.i();
        Calendar k8 = z.k();
        k8.setTimeInMillis(j8);
        return i8.get(1) == k8.get(1);
    }
}
