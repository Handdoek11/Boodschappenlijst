package M2;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f3848a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.Editor f3849b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3850c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f3851d = new Object();

    a0(Context context) {
        this.f3850c = context;
    }

    private final void k() {
        synchronized (this.f3851d) {
            try {
                if (this.f3848a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f3850c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f3848a = sharedPreferences;
                this.f3849b = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        int i8;
        k();
        synchronized (this.f3851d) {
            i8 = this.f3848a.getInt("aav", -1);
        }
        return i8;
    }

    public final int b() {
        int i8;
        k();
        synchronized (this.f3851d) {
            i8 = this.f3848a.getInt("vc", -1);
        }
        return i8;
    }

    public final String c(String str) {
        String string;
        k();
        synchronized (this.f3851d) {
            string = this.f3848a.getString(str, null);
            this.f3849b.remove(str).commit();
        }
        return string;
    }

    public final String d() {
        String string;
        k();
        synchronized (this.f3851d) {
            string = this.f3848a.getString("dm", null);
        }
        return string;
    }

    public final String e() {
        String string;
        k();
        synchronized (this.f3851d) {
            string = this.f3848a.getString("pn", null);
        }
        return string;
    }

    public final Map f() {
        HashMap hashMap;
        k();
        synchronized (this.f3851d) {
            try {
                Map<String, ?> all = this.f3848a.getAll();
                hashMap = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        hashMap.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public final void g() {
        k();
        synchronized (this.f3851d) {
            this.f3849b.clear().commit();
        }
    }

    public final void h(String str, String str2) {
        k();
        synchronized (this.f3851d) {
            this.f3849b.putString(str, str2).commit();
        }
    }

    public final void i(String str, int i8, String str2, int i9) {
        k();
        synchronized (this.f3851d) {
            this.f3849b.putString("pn", str).putInt("vc", i8).putString("dm", str2).putInt("aav", i9).commit();
        }
    }

    public final boolean j(String str) {
        boolean contains;
        k();
        synchronized (this.f3851d) {
            contains = this.f3848a.contains(str);
        }
        return contains;
    }
}
