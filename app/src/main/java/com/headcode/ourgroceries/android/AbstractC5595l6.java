package com.headcode.ourgroceries.android;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.AbstractActivityC0835d;

/* renamed from: com.headcode.ourgroceries.android.l6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5595l6 {
    public static boolean a(AbstractActivityC0835d abstractActivityC0835d, C5587k6 c5587k6) {
        long j8;
        boolean z7 = false;
        if (c5587k6.U().f()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences b8 = androidx.preference.k.b(abstractActivityC0835d);
        String string = abstractActivityC0835d.getString(M2.f33935N6);
        long j9 = b8.getLong(string, 0L);
        if (j9 == 0) {
            j8 = currentTimeMillis + 172800000;
        } else if (currentTimeMillis >= j9) {
            b(abstractActivityC0835d);
            j8 = currentTimeMillis + 2592000000L;
            z7 = true;
        } else {
            j8 = 0;
        }
        if (j8 > 0) {
            b8.edit().putLong(string, j8).apply();
        }
        return z7;
    }

    private static void b(AbstractActivityC0835d abstractActivityC0835d) {
        try {
            o5.h0.x2(abstractActivityC0835d).r2(abstractActivityC0835d.getSupportFragmentManager(), "unused");
        } catch (IllegalStateException unused) {
        }
    }

    public static void c(Context context) {
        SharedPreferences b8 = androidx.preference.k.b(context);
        b8.edit().putLong(context.getString(M2.f33935N6), System.currentTimeMillis()).apply();
    }
}
