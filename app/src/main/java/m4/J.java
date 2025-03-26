package m4;

import A3.AbstractC0379m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m4.K;

/* loaded from: classes2.dex */
public class J implements K {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f39008g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f39009h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    private final L f39010a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f39011b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39012c;

    /* renamed from: d, reason: collision with root package name */
    private final I4.e f39013d;

    /* renamed from: e, reason: collision with root package name */
    private final E f39014e;

    /* renamed from: f, reason: collision with root package name */
    private K.a f39015f;

    public J(Context context, String str, I4.e eVar, E e8) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f39011b = context;
        this.f39012c = str;
        this.f39013d = eVar;
        this.f39014e = e8;
        this.f39010a = new L();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e8;
        e8 = e(UUID.randomUUID().toString());
        j4.g.f().i("Created new Crashlytics installation ID: " + e8 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e8).putString("firebase.installation.id", str).apply();
        return e8;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f39008g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f39009h, "");
    }

    private boolean n() {
        K.a aVar = this.f39015f;
        return aVar == null || (aVar.e() == null && this.f39014e.d());
    }

    @Override // m4.K
    public synchronized K.a a() {
        if (!n()) {
            return this.f39015f;
        }
        j4.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences q8 = AbstractC6203i.q(this.f39011b);
        String string = q8.getString("firebase.installation.id", null);
        j4.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f39014e.d()) {
            I d8 = d(false);
            j4.g.f().i("Fetched Firebase Installation ID: " + d8.b());
            if (d8.b() == null) {
                d8 = new I(string == null ? c() : string, null);
            }
            if (Objects.equals(d8.b(), string)) {
                this.f39015f = K.a.a(l(q8), d8);
            } else {
                this.f39015f = K.a.a(b(d8.b(), q8), d8);
            }
        } else if (k(string)) {
            this.f39015f = K.a.b(l(q8));
        } else {
            this.f39015f = K.a.b(b(c(), q8));
        }
        j4.g.f().i("Install IDs: " + this.f39015f);
        return this.f39015f;
    }

    public I d(boolean z7) {
        String b8;
        n4.f.e();
        String str = null;
        if (z7) {
            try {
                b8 = ((com.google.firebase.installations.f) AbstractC0379m.b(this.f39013d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e8) {
                j4.g.f().l("Error getting Firebase authentication token.", e8);
            }
        } else {
            b8 = null;
        }
        try {
            str = (String) AbstractC0379m.b(this.f39013d.d(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            j4.g.f().l("Error getting Firebase installation id.", e9);
        }
        return new I(str, b8);
    }

    public String f() {
        return this.f39012c;
    }

    public String g() {
        return this.f39010a.a(this.f39011b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
