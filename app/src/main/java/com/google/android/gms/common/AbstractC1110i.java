package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.adadapted.android.sdk.core.ad.AdActionType;
import com.google.android.gms.internal.ads.C1445Je;
import f3.AbstractC5780d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1110i {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static boolean zza = false;
    private static boolean zzb = false;

    @Deprecated
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    AbstractC1110i() {
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException e8) {
            Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e8);
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i8) {
        int h8 = C1109h.f().h(context, i8);
        if (h8 != 0) {
            Intent b8 = C1109h.f().b(context, h8, AdActionType.EXTERNAL_LINK);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + h8);
            if (b8 != null) {
                throw new GooglePlayServicesRepairableException(h8, "Google Play Services not available", b8);
            }
            throw new GooglePlayServicesNotAvailableException(h8);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        Z2.r.p(true);
        return AbstractC5780d.a(context, context.getPackageName());
    }

    public static String getErrorString(int i8) {
        return C1103b.F0(i8);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i8) {
        return C1109h.f().b(null, i8, null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!zza) {
                try {
                    PackageInfo f8 = h3.e.a(context).f("com.google.android.gms", 64);
                    C1111j.a(context);
                    if (f8 == null || C1111j.e(f8, false) || !C1111j.e(f8, true)) {
                        zzb = false;
                    } else {
                        zzb = true;
                    }
                    zza = true;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e8);
                    zza = true;
                }
            }
            return zzb || !f3.i.e();
        } catch (Throwable th) {
            zza = true;
            throw th;
        }
    }

    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i8) {
        return f3.r.a(context, i8);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i8) {
        if (i8 == 18) {
            return true;
        }
        if (i8 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i8) {
        if (i8 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean isRestrictedUserProfile(Context context) {
        if (!f3.m.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        Z2.r.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return f3.i.d(context);
    }

    public static boolean isUserRecoverableError(int i8) {
        return i8 == 1 || i8 == 2 || i8 == 3 || i8 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i8, String str) {
        return f3.r.b(context, i8, str);
    }

    @TargetApi(C1445Je.zzm)
    static boolean zza(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (f3.m.f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int isGooglePlayServicesAvailable(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.AbstractC1110i.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }
}
