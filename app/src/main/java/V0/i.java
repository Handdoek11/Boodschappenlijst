package v0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f44061b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final k f44062a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f44063a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private i(k kVar) {
        this.f44062a = kVar;
    }

    public static i a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? i(b.a(localeArr)) : new i(new j(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static i c(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i8 = 0; i8 < length; i8++) {
            localeArr[i8] = a.a(split[i8]);
        }
        return a(localeArr);
    }

    public static i e() {
        return f44061b;
    }

    public static i i(LocaleList localeList) {
        return new i(new r(localeList));
    }

    public Locale d(int i8) {
        return this.f44062a.get(i8);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f44062a.equals(((i) obj).f44062a);
    }

    public boolean f() {
        return this.f44062a.isEmpty();
    }

    public int g() {
        return this.f44062a.size();
    }

    public String h() {
        return this.f44062a.a();
    }

    public int hashCode() {
        return this.f44062a.hashCode();
    }

    public String toString() {
        return this.f44062a.toString();
    }
}
