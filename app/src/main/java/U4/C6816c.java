package u4;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import m4.C6218y;
import org.json.JSONObject;
import r4.C6705a;
import r4.C6706b;
import r4.C6707c;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C6816c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final String f43968a;

    /* renamed from: b, reason: collision with root package name */
    private final C6706b f43969b;

    /* renamed from: c, reason: collision with root package name */
    private final j4.g f43970c;

    public C6816c(String str, C6706b c6706b) {
        this(str, c6706b, j4.g.f());
    }

    private C6705a b(C6705a c6705a, k kVar) {
        c(c6705a, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f44001a);
        c(c6705a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(c6705a, "X-CRASHLYTICS-API-CLIENT-VERSION", C6218y.m());
        c(c6705a, "Accept", "application/json");
        c(c6705a, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f44002b);
        c(c6705a, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f44003c);
        c(c6705a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f44004d);
        c(c6705a, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f44005e.a().c());
        return c6705a;
    }

    private void c(C6705a c6705a, String str, String str2) {
        if (str2 != null) {
            c6705a.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e8) {
            this.f43970c.l("Failed to parse settings JSON from " + this.f43968a, e8);
            this.f43970c.k("Settings response " + str);
            return null;
        }
    }

    private Map f(k kVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", kVar.f44008h);
        hashMap.put("display_version", kVar.f44007g);
        hashMap.put("source", Integer.toString(kVar.f44009i));
        String str = kVar.f44006f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // u4.l
    public JSONObject a(k kVar, boolean z7) {
        n4.f.d();
        if (!z7) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map f8 = f(kVar);
            C6705a b8 = b(d(f8), kVar);
            this.f43970c.b("Requesting settings from " + this.f43968a);
            this.f43970c.i("Settings query params were: " + f8);
            return g(b8.c());
        } catch (IOException e8) {
            this.f43970c.e("Settings request failed.", e8);
            return null;
        }
    }

    protected C6705a d(Map map) {
        return this.f43969b.a(this.f43968a, map).d("User-Agent", "Crashlytics Android SDK/" + C6218y.m()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(C6707c c6707c) {
        int b8 = c6707c.b();
        this.f43970c.i("Settings response code was: " + b8);
        if (h(b8)) {
            return e(c6707c.a());
        }
        this.f43970c.d("Settings request failed; (status: " + b8 + ") from " + this.f43968a);
        return null;
    }

    boolean h(int i8) {
        return i8 == 200 || i8 == 201 || i8 == 202 || i8 == 203;
    }

    C6816c(String str, C6706b c6706b, j4.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f43970c = gVar;
        this.f43969b = c6706b;
        this.f43968a = str;
    }
}
