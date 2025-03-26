package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesC5022t0 implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    private final Map f29572a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f29573b = new HashSet();

    private final Object a(String str, Object obj) {
        Object obj2 = this.f29572a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f29572a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC5046w0(this);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.f29572a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z7) {
        return ((Boolean) a(str, Boolean.valueOf(z7))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f8) {
        return ((Float) a(str, Float.valueOf(f8))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i8) {
        return ((Integer) a(str, Integer.valueOf(i8))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j8) {
        return ((Long) a(str, Long.valueOf(j8))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) a(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) a(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29573b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29573b.remove(onSharedPreferenceChangeListener);
    }
}
