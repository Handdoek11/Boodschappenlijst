package G2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: G2.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f2621a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f2622b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f2623c;

    C0586e0(Context context) {
        this.f2623c = context;
    }

    final synchronized void b(String str) {
        try {
            if (this.f2621a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f2623c) : this.f2623c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC0584d0 sharedPreferencesOnSharedPreferenceChangeListenerC0584d0 = new SharedPreferencesOnSharedPreferenceChangeListenerC0584d0(this, str);
            this.f2621a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC0584d0);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC0584d0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.na)).booleanValue()) {
            C2.v.t();
            Map b02 = D0.b0((String) D2.A.c().a(AbstractC3184kf.sa));
            Iterator it = b02.keySet().iterator();
            while (it.hasNext()) {
                b((String) it.next());
            }
            d(new C0580b0(b02));
        }
    }

    final synchronized void d(C0580b0 c0580b0) {
        this.f2622b.add(c0580b0);
    }
}
