package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
abstract class z {

    /* renamed from: a, reason: collision with root package name */
    static AtomicReference f31899a = new AtomicReference();

    static long a(long j8) {
        Calendar k8 = k();
        k8.setTimeInMillis(j8);
        return c(k8).getTimeInMillis();
    }

    private static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static Calendar c(Calendar calendar) {
        Calendar l8 = l(calendar);
        Calendar k8 = k();
        k8.set(l8.get(1), l8.get(2), l8.get(5));
        return k8;
    }

    private static java.text.DateFormat d(int i8, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i8, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    static java.text.DateFormat e(Locale locale) {
        return d(0, locale);
    }

    static DateFormat f(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    static t g() {
        t tVar = (t) f31899a.get();
        return tVar == null ? t.c() : tVar;
    }

    private static TimeZone h() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        Calendar a8 = g().a();
        a8.set(11, 0);
        a8.set(12, 0);
        a8.set(13, 0);
        a8.set(14, 0);
        a8.setTimeZone(h());
        return a8;
    }

    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar k() {
        return l(null);
    }

    static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    static DateFormat m(Locale locale) {
        return b("yMMMM", locale);
    }

    static DateFormat n(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
