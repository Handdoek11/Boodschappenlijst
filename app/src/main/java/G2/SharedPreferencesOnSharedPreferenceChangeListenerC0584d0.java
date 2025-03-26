package G2;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* renamed from: G2.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC0584d0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: o, reason: collision with root package name */
    private final String f2619o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C0586e0 f2620s;

    public SharedPreferencesOnSharedPreferenceChangeListenerC0584d0(C0586e0 c0586e0, String str) {
        this.f2620s = c0586e0;
        this.f2619o = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f2620s) {
            try {
                for (C0580b0 c0580b0 : this.f2620s.f2622b) {
                    String str2 = this.f2619o;
                    Map map = c0580b0.f2615a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        C2.v.s().j().m0(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
