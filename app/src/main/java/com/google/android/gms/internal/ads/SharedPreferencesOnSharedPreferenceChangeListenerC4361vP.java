package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC4361vP implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: o, reason: collision with root package name */
    private final JSONObject f27252o = new JSONObject();

    /* renamed from: s, reason: collision with root package name */
    private List f27253s;

    SharedPreferencesOnSharedPreferenceChangeListenerC4361vP() {
    }

    public final JSONObject a() {
        return this.f27252o;
    }

    final void b(SharedPreferences sharedPreferences, List list) {
        this.f27253s = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (String) it.next());
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null && this.f27253s.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.f27252o.remove(str);
                } else {
                    this.f27252o.put(str, obj);
                }
            } catch (JSONException e8) {
                C2.v.s().w(e8, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }
}
