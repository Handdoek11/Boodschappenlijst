package G2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.AbstractC1358Gt;
import com.google.android.gms.internal.ads.C2000Zc;
import com.google.android.gms.internal.ads.EnumC1337Ge;
import com.google.android.gms.internal.ads.InterfaceC4410vt;
import com.google.android.gms.internal.ads.US;
import java.io.InputStream;
import java.util.Map;

/* renamed from: G2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0579b {
    /* synthetic */ AbstractC0579b(W0 w02) {
    }

    public abstract CookieManager a(Context context);

    public abstract WebResourceResponse b(String str, String str2, int i8, String str3, Map map, InputStream inputStream);

    public abstract AbstractC1358Gt c(InterfaceC4410vt interfaceC4410vt, C2000Zc c2000Zc, boolean z7, US us);

    public boolean d(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public EnumC1337Ge f(Context context, TelephonyManager telephonyManager) {
        return EnumC1337Ge.ENUM_UNKNOWN;
    }

    public boolean h(Context context, String str) {
        return false;
    }

    public int i(AudioManager audioManager) {
        return 0;
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void j(Activity activity) {
    }

    public void g(Context context, String str, String str2) {
    }
}
