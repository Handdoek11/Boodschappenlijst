package m5;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class E {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f39156e = {1, 3, 4};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f39157f = {1};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f39158g = {2, 7, 9, 10};

    /* renamed from: a, reason: collision with root package name */
    private final String f39159a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39160b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39161c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39162d;

    enum a {
        NONE,
        NON_PERSONALIZED_ADS,
        PERSONALIZED_ADS
    }

    private E(Context context) {
        SharedPreferences b8 = androidx.preference.k.b(context.getApplicationContext());
        this.f39159a = b8.getString("IABTCF_VendorConsents", "");
        this.f39160b = b8.getString("IABTCF_VendorLegitimateInterests", "");
        this.f39161c = b8.getString("IABTCF_PurposeConsents", "");
        this.f39162d = b8.getString("IABTCF_PurposeLegitimateInterests", "");
    }

    private boolean b(int[] iArr) {
        boolean d8 = d(this.f39159a);
        for (int i8 : iArr) {
            if (!d8 || !e(this.f39161c, i8)) {
                return false;
            }
        }
        return true;
    }

    private boolean c(int[] iArr) {
        boolean d8 = d(this.f39159a);
        boolean d9 = d(this.f39160b);
        int length = iArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                return true;
            }
            int i9 = iArr[i8];
            boolean z7 = d8 && e(this.f39161c, i9);
            boolean z8 = d9 && e(this.f39162d, i9);
            if (!z7 && !z8) {
                return false;
            }
            i8++;
        }
    }

    private static boolean d(String str) {
        return f(str, 755);
    }

    private static boolean e(String str, int i8) {
        return h(str, i8);
    }

    private static boolean f(String str, int i8) {
        return h(str, i8);
    }

    public static E g(Context context) {
        return new E(context);
    }

    private static boolean h(String str, int i8) {
        return str != null && i8 >= 1 && i8 <= str.length() && str.charAt(i8 - 1) == '1';
    }

    public a a() {
        return !c(f39158g) ? a.NONE : b(f39156e) ? a.PERSONALIZED_ADS : b(f39157f) ? a.NON_PERSONALIZED_ADS : a.NONE;
    }
}
