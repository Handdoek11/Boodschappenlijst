package com.headcode.ourgroceries.android;

import android.content.SharedPreferences;
import androidx.appcompat.app.AbstractActivityC0835d;

/* loaded from: classes2.dex */
public abstract class Q2 {
    public static boolean a(AbstractActivityC0835d abstractActivityC0835d) {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences b8 = androidx.preference.k.b(abstractActivityC0835d);
        String string = abstractActivityC0835d.getString(M2.f34028Z3);
        long j8 = b8.getLong(string, 0L);
        if (j8 == 0) {
            b8.edit().putLong(string, currentTimeMillis + 864000000).apply();
        } else if (currentTimeMillis >= j8) {
            o5.Z.y2(abstractActivityC0835d, currentTimeMillis + 1728000000);
            return true;
        }
        return false;
    }
}
