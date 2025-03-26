package com.adadapted.android.sdk.core.device;

import J6.AbstractC0650j;
import J6.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import com.adadapted.android.sdk.constants.Config;
import com.adadapted.android.sdk.core.log.AALogger;
import com.adadapted.android.sdk.core.view.DimensionConverter;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes.dex */
public class DeviceInfoExtractor {
    private static final String AdvertisingIdClientName = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final String GooglePlayAdError = "Problem retrieving Google Play Advertising Info.";
    private static final String NetworkOperatorDefault = "None";
    private Context contextRef;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceInfoExtractor(Context context) {
        r.e(context, "context");
        this.contextRef = context;
    }

    private final String captureAndroidId(Context context) {
        String string = Settings.Secure.getString(context != null ? context.getContentResolver() : null, "android_id");
        return string == null ? getOrGenerateCustomId(context) : string;
    }

    private final AdvertisingIdClient.Info getAdvertisingIdClientInfo(Context context) {
        if (isTrackingDisabled(context)) {
            return null;
        }
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext());
        } catch (GooglePlayServicesNotAvailableException e8) {
            trackGooglePlayAdError(e8);
            return null;
        } catch (GooglePlayServicesRepairableException e9) {
            trackGooglePlayAdError(e9);
            return null;
        } catch (IOException e10) {
            trackGooglePlayAdError(e10);
            return null;
        }
    }

    private final String getOrGenerateCustomId(Context context) {
        if (context == null) {
            return DeviceIdGenerator.INSTANCE.generateId();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(Config.AASDK_PREFS_KEY, 0);
        String string = sharedPreferences.getString(Config.AASDK_PREFS_GENERATED_ID_KEY, "");
        if (string != null && string.length() != 0) {
            return string;
        }
        String generateId = DeviceIdGenerator.INSTANCE.generateId();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(Config.AASDK_PREFS_GENERATED_ID_KEY, generateId);
        edit.apply();
        return generateId;
    }

    private final boolean isTrackingDisabled(Context context) {
        return context.getSharedPreferences(Config.AASDK_PREFS_KEY, 0).getBoolean(Config.AASDK_PREFS_TRACKING_DISABLED_KEY, false);
    }

    private final void setDeviceScale(float f8) {
        DimensionConverter.INSTANCE.createInstance(f8);
    }

    private final void trackGooglePlayAdError(Exception exc) {
        AALogger.INSTANCE.logError("Problem retrieving Google Play Advertising Info.: " + exc.getMessage());
    }

    private final void wipeContextReference() {
        this.contextRef = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(1:4)(5:63|6|(1:8)(1:9)|(21:16|(1:18)|19|64|23|(1:32)(1:31)|(1:34)(1:35)|36|37|39|(1:41)(1:42)|43|(1:45)|46|(1:51)(1:50)|(1:53)(1:54)|55|(1:57)|(1:59)(1:60)|61|62)|20)|5|64|23|(5:25|32|(0)(0)|36|37)(0)|39|(0)(0)|43|(0)|46|(2:48|51)(0)|(0)(0)|55|(0)|(0)(0)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        r9 = com.adadapted.android.sdk.core.device.DeviceInfo.UNKNOWN_VALUE;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b A[Catch: NameNotFoundException -> 0x0084, TryCatch #1 {NameNotFoundException -> 0x0084, blocks: (B:23:0x005f, B:25:0x0063, B:27:0x0069, B:29:0x006d, B:31:0x0073, B:34:0x007b, B:36:0x007f), top: B:64:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.adadapted.android.sdk.core.device.DeviceInfo extractDeviceInfo(java.lang.String r29, boolean r30, java.lang.String r31, java.util.Map<java.lang.String, java.lang.String> r32) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.device.DeviceInfoExtractor.extractDeviceInfo(java.lang.String, boolean, java.lang.String, java.util.Map):com.adadapted.android.sdk.core.device.DeviceInfo");
    }
}
