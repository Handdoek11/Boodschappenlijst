package Z2;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.AbstractC1112k;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Locale;
import q.C6407k;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private static final C6407k f6244a = new C6407k();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f6245b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return h3.e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i8) {
        Resources resources = context.getResources();
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? resources.getString(R.string.ok) : resources.getString(U2.b.f5335a) : resources.getString(U2.b.f5344j) : resources.getString(U2.b.f5338d);
    }

    public static String c(Context context, int i8) {
        Resources resources = context.getResources();
        String a8 = a(context);
        if (i8 == 1) {
            return resources.getString(U2.b.f5339e, a8);
        }
        if (i8 == 2) {
            return f3.i.g(context) ? resources.getString(U2.b.f5348n) : resources.getString(U2.b.f5345k, a8);
        }
        if (i8 == 3) {
            return resources.getString(U2.b.f5336b, a8);
        }
        if (i8 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", a8);
        }
        if (i8 == 7) {
            return g(context, "common_google_play_services_network_error_text", a8);
        }
        if (i8 == 9) {
            return resources.getString(U2.b.f5343i, a8);
        }
        if (i8 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", a8);
        }
        switch (i8) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", a8);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", a8);
            case 18:
                return resources.getString(U2.b.f5347m, a8);
            default:
                return resources.getString(AbstractC1112k.f13419a, a8);
        }
    }

    public static String d(Context context, int i8) {
        return (i8 == 6 || i8 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i8);
    }

    public static String e(Context context, int i8) {
        String h8 = i8 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i8);
        return h8 == null ? context.getResources().getString(U2.b.f5342h) : h8;
    }

    public static String f(Context context, int i8) {
        Resources resources = context.getResources();
        switch (i8) {
            case 1:
                return resources.getString(U2.b.f5340f);
            case 2:
                return resources.getString(U2.b.f5346l);
            case 3:
                return resources.getString(U2.b.f5337c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i8);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h8 = h(context, str);
        if (h8 == null) {
            h8 = resources.getString(AbstractC1112k.f13419a);
        }
        return String.format(resources.getConfiguration().locale, h8, str2);
    }

    private static String h(Context context, String str) {
        C6407k c6407k = f6244a;
        synchronized (c6407k) {
            try {
                Locale d8 = v0.f.a(context.getResources().getConfiguration()).d(0);
                if (!d8.equals(f6245b)) {
                    c6407k.clear();
                    f6245b = d8;
                }
                String str2 = (String) c6407k.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    c6407k.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
