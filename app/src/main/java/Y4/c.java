package Y4;

import Z2.C0771j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final C0771j f6073a = new C0771j("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e8) {
            f6073a.c("CommonUtils", "Exception thrown when trying to get app version ".concat(e8.toString()));
            return "";
        }
    }

    public static String b(Locale locale) {
        if (f3.m.f()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
