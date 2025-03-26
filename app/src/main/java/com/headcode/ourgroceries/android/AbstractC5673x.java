package com.headcode.ourgroceries.android;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.headcode.ourgroceries.android.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5673x {

    /* renamed from: a, reason: collision with root package name */
    private static FirebaseAnalytics f35101a;

    public static void a(String str) {
        b(str, null);
    }

    public static void b(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics = f35101a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a("og_" + str, bundle);
        }
    }

    public static void c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString("action", str2);
        }
        if (str3 != null) {
            bundle.putString("context", str3);
        }
        b(str, bundle);
    }

    public static void d(OurApplication ourApplication) {
        A2 a22 = A2.f33140n0;
        FirebaseAnalytics firebaseAnalytics = f35101a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.c("signed_in", String.valueOf(a22.X()));
            f35101a.c("upgrade_status", ourApplication.o().U().name().toLowerCase());
        }
        String h8 = a22.h();
        FirebaseAnalytics firebaseAnalytics2 = f35101a;
        if (firebaseAnalytics2 != null) {
            firebaseAnalytics2.b(h8);
        }
        com.google.firebase.crashlytics.a.b().f(h8);
    }

    public static void e(Context context) {
        f35101a = FirebaseAnalytics.getInstance(context);
    }
}
