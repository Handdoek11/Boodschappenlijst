package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.measurement.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5062y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f29644a = new C5054x0();

    public static SharedPreferences a(Context context, String str, int i8, AbstractC4999q0 abstractC4999q0) {
        SharedPreferencesC5022t0 sharedPreferencesC5022t0 = AbstractC4942j0.a().a(str, abstractC4999q0, EnumC4975n0.SHARED_PREFS_TYPE).equals("") ? new SharedPreferencesC5022t0() : null;
        if (sharedPreferencesC5022t0 != null) {
            return sharedPreferencesC5022t0;
        }
        ThreadLocal threadLocal = f29644a;
        b4.h.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f29644a.set(Boolean.TRUE);
            throw th;
        }
    }
}
