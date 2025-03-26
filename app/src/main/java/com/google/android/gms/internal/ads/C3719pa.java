package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3719pa {

    /* renamed from: a, reason: collision with root package name */
    private long f25465a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f25466b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f25467c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f25468d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f25469e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f25470f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f25471g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f25472h = -1;

    private static DisplayMetrics l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean m(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object invoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
            num.intValue();
            String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final long a() {
        return this.f25471g;
    }

    public final long b() {
        return this.f25469e;
    }

    public final long c() {
        return this.f25465a;
    }

    public final long d() {
        return this.f25467c;
    }

    public final long e() {
        return this.f25472h;
    }

    public final long f() {
        return this.f25470f;
    }

    public final long g() {
        return this.f25466b;
    }

    public final long h() {
        return this.f25468d;
    }

    public final void i() {
        this.f25472h = this.f25471g;
        this.f25471g = SystemClock.uptimeMillis();
    }

    public final void j() {
        this.f25466b = this.f25465a;
        this.f25465a = SystemClock.uptimeMillis();
    }

    public final void k(Context context, View view) {
        this.f25468d = this.f25467c;
        this.f25467c = SystemClock.uptimeMillis();
        long j8 = this.f25469e;
        if (j8 != -1) {
            this.f25470f = j8;
        }
        DisplayMetrics l8 = l(context);
        int i8 = l8.widthPixels * l8.heightPixels;
        if (view != null) {
            int min = Math.min(view.getWidth(), l8.widthPixels) * Math.min(view.getHeight(), l8.heightPixels);
            if (min + min >= i8 || (min == 0 && m(view))) {
                this.f25469e = this.f25467c;
                return;
            }
        }
        this.f25469e = -1L;
    }
}
