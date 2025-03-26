package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.bq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC2229bq implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: o, reason: collision with root package name */
    private final String f20993o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C2337cq f20994s;

    public SharedPreferencesOnSharedPreferenceChangeListenerC2229bq(C2337cq c2337cq, String str) {
        this.f20994s = c2337cq;
        this.f20993o = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f20994s) {
            try {
                for (C2120aq c2120aq : this.f20994s.f21294b) {
                    c2120aq.f20762a.b(c2120aq.f20763b, sharedPreferences, this.f20993o, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
