package G2;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.EnumC1337Ge;

/* loaded from: classes.dex */
public class O0 extends G0 {
    @Override // G2.AbstractC0579b
    public final Intent e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // G2.AbstractC0579b
    public final EnumC1337Ge f(Context context, TelephonyManager telephonyManager) {
        C2.v.t();
        return D0.b(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? EnumC1337Ge.ENUM_TRUE : EnumC1337Ge.ENUM_FALSE : EnumC1337Ge.ENUM_FALSE;
    }

    @Override // G2.AbstractC0579b
    public final void g(Context context, String str, String str2) {
        M0.a();
        NotificationChannel a8 = L0.a("offline_notification_channel", "AdMob Offline Notifications", ((Integer) D2.A.c().a(AbstractC3184kf.s8)).intValue());
        a8.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(a8);
    }

    @Override // G2.AbstractC0579b
    public final boolean h(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }
}
