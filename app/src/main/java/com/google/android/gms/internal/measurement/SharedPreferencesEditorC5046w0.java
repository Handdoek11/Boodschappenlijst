package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class SharedPreferencesEditorC5046w0 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29611a;

    /* renamed from: b, reason: collision with root package name */
    private Set f29612b;

    /* renamed from: c, reason: collision with root package name */
    private Map f29613c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ SharedPreferencesC5022t0 f29614d;

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f29613c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f29611a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f29611a) {
            this.f29614d.f29572a.clear();
        }
        this.f29614d.f29572a.keySet().removeAll(this.f29612b);
        for (Map.Entry entry : this.f29613c.entrySet()) {
            this.f29614d.f29572a.put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f29614d.f29573b) {
            c4.S it = c4.M.c(this.f29612b, this.f29613c.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f29614d, (String) it.next());
            }
        }
        return (!this.f29611a && this.f29612b.isEmpty() && this.f29613c.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z7) {
        a(str, Boolean.valueOf(z7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f8) {
        a(str, Float.valueOf(f8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i8) {
        a(str, Integer.valueOf(i8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j8) {
        a(str, Long.valueOf(j8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f29612b.add(str);
        return this;
    }

    private SharedPreferencesEditorC5046w0(SharedPreferencesC5022t0 sharedPreferencesC5022t0) {
        this.f29614d = sharedPreferencesC5022t0;
        this.f29611a = false;
        this.f29612b = new HashSet();
        this.f29613c = new HashMap();
    }
}
