package com.headcode.ourgroceries.android;

import android.content.SharedPreferences;
import androidx.appcompat.app.AbstractActivityC0835d;

/* loaded from: classes2.dex */
public abstract class W {
    public static boolean a(AbstractActivityC0835d abstractActivityC0835d) {
        long j8;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences b8 = androidx.preference.k.b(abstractActivityC0835d);
        String string = abstractActivityC0835d.getString(M2.f33874G1);
        long j9 = b8.getLong(string, 0L);
        boolean z7 = false;
        if (j9 == 0) {
            j8 = currentTimeMillis + 604800000;
        } else if (currentTimeMillis >= j9) {
            try {
                o5.G.w2(abstractActivityC0835d);
                j8 = currentTimeMillis + 2592000000L;
                z7 = true;
            } catch (IllegalStateException unused) {
            }
        } else {
            j8 = 0;
        }
        if (j8 > 0) {
            b8.edit().putLong(string, j8).apply();
        }
        return z7;
    }
}
