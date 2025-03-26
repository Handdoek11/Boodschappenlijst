package v0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6822a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6822a f44049a = new C6822a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f44050b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f44051c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f44052d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f44053e;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    private static final class C0336a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0336a f44054a = new C0336a();

        private C0336a() {
        }

        public final int a(int i8) {
            return SdkExtensions.getExtensionVersion(i8);
        }
    }

    static {
        int i8 = Build.VERSION.SDK_INT;
        f44050b = i8 >= 30 ? C0336a.f44054a.a(30) : 0;
        f44051c = i8 >= 30 ? C0336a.f44054a.a(31) : 0;
        f44052d = i8 >= 30 ? C0336a.f44054a.a(33) : 0;
        f44053e = i8 >= 30 ? C0336a.f44054a.a(1000000) : 0;
    }

    private C6822a() {
    }

    public static final boolean a(String str, String str2) {
        J6.r.e(str, "codename");
        J6.r.e(str2, "buildCodename");
        if (J6.r.a("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        J6.r.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        J6.r.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 31) {
            if (i8 >= 30) {
                String str = Build.VERSION.CODENAME;
                J6.r.d(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 35) {
            if (i8 >= 34) {
                String str = Build.VERSION.CODENAME;
                J6.r.d(str, "CODENAME");
                if (a("VanillaIceCream", str)) {
                }
            }
            return false;
        }
        return true;
    }
}
