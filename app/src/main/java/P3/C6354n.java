package p3;

import a4.InterfaceC0819c;
import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: p3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6354n {

    /* renamed from: d, reason: collision with root package name */
    static final G0 f40357d = G0.q("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* renamed from: a, reason: collision with root package name */
    private final Application f40358a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f40359b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f40360c;

    C6354n(Application application) {
        this.f40358a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f40359b = sharedPreferences;
        this.f40360c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int a() {
        return this.f40359b.getInt("consent_status", 0);
    }

    public final InterfaceC0819c.EnumC0131c b() {
        return InterfaceC0819c.EnumC0131c.valueOf(this.f40359b.getString("privacy_options_requirement_status", InterfaceC0819c.EnumC0131c.UNKNOWN.name()));
    }

    public final Map c() {
        String str;
        Set<String> stringSet = this.f40359b.getStringSet("stored_info", G0.p());
        if (stringSet.isEmpty()) {
            stringSet = f40357d;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.f40358a;
            C6355n0 a8 = AbstractC6359p0.a(application, str2);
            if (a8 == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str2)));
            } else {
                Object obj = application.getSharedPreferences(a8.f40361a, 0).getAll().get(a8.f40362b);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str2)));
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str2)));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }

    public final Set d() {
        return this.f40360c;
    }

    public final void e() {
        this.f40359b.edit().putStringSet("written_values", this.f40360c).apply();
    }

    public final void f(int i8) {
        this.f40359b.edit().putInt("consent_status", i8).apply();
    }

    public final void g(boolean z7) {
        this.f40359b.edit().putBoolean("is_pub_misconfigured", z7).apply();
    }

    public final void h(InterfaceC0819c.EnumC0131c enumC0131c) {
        this.f40359b.edit().putString("privacy_options_requirement_status", enumC0131c.name()).apply();
    }

    public final void i(Set set) {
        this.f40359b.edit().putStringSet("stored_info", set).apply();
    }

    public final boolean j() {
        return this.f40359b.getBoolean("is_pub_misconfigured", false);
    }
}
