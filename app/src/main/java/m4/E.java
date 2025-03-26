package m4;

import A3.AbstractC0376j;
import A3.C0377k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import n4.AbstractC6250b;

/* loaded from: classes2.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f38981a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f38982b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f38983c;

    /* renamed from: d, reason: collision with root package name */
    C0377k f38984d;

    /* renamed from: e, reason: collision with root package name */
    boolean f38985e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38986f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f38987g;

    /* renamed from: h, reason: collision with root package name */
    private final C0377k f38988h;

    public E(com.google.firebase.f fVar) {
        Object obj = new Object();
        this.f38983c = obj;
        this.f38984d = new C0377k();
        this.f38985e = false;
        this.f38986f = false;
        this.f38988h = new C0377k();
        Context k8 = fVar.k();
        this.f38982b = fVar;
        this.f38981a = AbstractC6203i.q(k8);
        Boolean b8 = b();
        this.f38987g = b8 == null ? a(k8) : b8;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f38984d.e(null);
                    this.f38985e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean g8 = g(context);
        if (g8 == null) {
            this.f38986f = false;
            return null;
        }
        this.f38986f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g8));
    }

    private Boolean b() {
        if (!this.f38981a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f38986f = false;
        return Boolean.valueOf(this.f38981a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f38982b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z7) {
        j4.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z7 ? "ENABLED" : "DISABLED", this.f38987g == null ? "global Firebase setting" : this.f38986f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e8) {
            j4.g.f().e("Could not read data collection permission from manifest", e8);
            return null;
        }
    }

    public void c(boolean z7) {
        if (!z7) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f38988h.e(null);
    }

    public synchronized boolean d() {
        boolean booleanValue;
        try {
            Boolean bool = this.f38987g;
            booleanValue = bool != null ? bool.booleanValue() : e();
            f(booleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return booleanValue;
    }

    public AbstractC0376j h() {
        AbstractC0376j a8;
        synchronized (this.f38983c) {
            a8 = this.f38984d.a();
        }
        return a8;
    }

    public AbstractC0376j i() {
        return AbstractC6250b.c(this.f38988h.a(), h());
    }
}
