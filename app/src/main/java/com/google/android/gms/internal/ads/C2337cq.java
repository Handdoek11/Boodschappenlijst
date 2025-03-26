package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.cq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2337cq {

    /* renamed from: a, reason: collision with root package name */
    private final Map f21293a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f21294b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f21295c;

    /* renamed from: d, reason: collision with root package name */
    private final C1600Np f21296d;

    C2337cq(Context context, C1600Np c1600Np) {
        this.f21295c = context;
        this.f21296d = c1600Np;
    }

    final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f21296d.d();
        }
    }

    final synchronized void c(String str) {
        try {
            if (this.f21293a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f21295c) : this.f21295c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC2229bq sharedPreferencesOnSharedPreferenceChangeListenerC2229bq = new SharedPreferencesOnSharedPreferenceChangeListenerC2229bq(this, str);
            this.f21293a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC2229bq);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2229bq);
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void d(C2120aq c2120aq) {
        this.f21294b.add(c2120aq);
    }
}
