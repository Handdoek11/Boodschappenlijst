package j4;

import android.util.Log;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    static final g f38246c = new g("FirebaseCrashlytics");

    /* renamed from: a, reason: collision with root package name */
    private final String f38247a;

    /* renamed from: b, reason: collision with root package name */
    private int f38248b = 4;

    public g(String str) {
        this.f38247a = str;
    }

    private boolean a(int i8) {
        return this.f38248b <= i8 || Log.isLoggable(this.f38247a, i8);
    }

    public static g f() {
        return f38246c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f38247a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f38247a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f38247a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f38247a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f38247a, str, th);
        }
    }
}
