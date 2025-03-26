package com.google.firebase.messaging;

import A3.InterfaceC0373g;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
abstract class Q {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z7) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z7;
    }

    static void f(Context context, boolean z7) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_notification_initialized", z7);
        edit.apply();
    }

    static void g(final Context context, D d8, final boolean z7) {
        if (f3.m.k() && !d(b(context), z7)) {
            d8.k(z7).j(new Z0.m(), new InterfaceC0373g() { // from class: com.google.firebase.messaging.P
                @Override // A3.InterfaceC0373g
                public final void b(Object obj) {
                    Q.h(context, z7);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Context context, boolean z7) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_retention", z7);
        edit.apply();
    }
}
