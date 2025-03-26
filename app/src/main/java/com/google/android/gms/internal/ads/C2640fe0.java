package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.fe0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2640fe0 {

    /* renamed from: c, reason: collision with root package name */
    private static C2640fe0 f22087c;

    /* renamed from: a, reason: collision with root package name */
    private final String f22088a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f22089b;

    private C2640fe0(Context context) {
        this.f22088a = context.getPackageName();
        this.f22089b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static C2640fe0 b(Context context) {
        if (f22087c == null) {
            f22087c = new C2640fe0(context);
        }
        return f22087c;
    }

    final long a(String str, long j8) {
        return this.f22089b.getLong(str, -1L);
    }

    final String c(String str, String str2) {
        return this.f22089b.getString(str, null);
    }

    final void d(String str, Object obj) {
        boolean commit;
        if (obj instanceof String) {
            commit = this.f22089b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.f22089b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = this.f22089b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                Log.e("GpidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.f22088a);
                throw new IOException("Failed to store " + str + " for app " + this.f22088a);
            }
            commit = this.f22089b.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + this.f22088a);
    }

    final void e(String str) {
        if (this.f22089b.edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + this.f22088a);
    }

    final boolean f(String str, boolean z7) {
        return this.f22089b.getBoolean(str, true);
    }

    final boolean g(String str) {
        return this.f22089b.contains(str);
    }
}
