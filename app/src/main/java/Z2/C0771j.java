package Z2;

import android.util.Log;

/* renamed from: Z2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771j {

    /* renamed from: a, reason: collision with root package name */
    private final String f6367a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6368b;

    public C0771j(String str, String str2) {
        r.m(str, "log tag cannot be null");
        r.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f6367a = str;
        this.f6368b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    private final String g(String str) {
        String str2 = this.f6368b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i8) {
        return Log.isLoggable(this.f6367a, i8);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, g(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, g(str2), th);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, g(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            Log.w(str, g(str2));
        }
    }
}
