package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzba;

/* renamed from: com.google.android.gms.internal.ads.m70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3351m70 {
    public static D2.W0 a(Throwable th) {
        if (th instanceof zzeda) {
            zzeda zzedaVar = (zzeda) th;
            return c(zzedaVar.a(), zzedaVar.b());
        }
        if (th instanceof zzdvy) {
            return th.getMessage() == null ? d(((zzdvy) th).a(), null, null) : d(((zzdvy) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof zzba)) {
            return d(1, null, null);
        }
        zzba zzbaVar = (zzba) th;
        return new D2.W0(zzbaVar.a(), AbstractC3187kg0.c(zzbaVar.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static D2.W0 b(Throwable th, BT bt) {
        D2.W0 w02;
        D2.W0 a8 = a(th);
        int i8 = a8.f1162o;
        if ((i8 == 3 || i8 == 0) && (w02 = a8.f1165u) != null && !w02.f1164t.equals("com.google.android.gms.ads")) {
            a8.f1165u = null;
        }
        if (bt != null) {
            a8.f1166v = bt.b();
        }
        return a8;
    }

    public static D2.W0 c(int i8, D2.W0 w02) {
        if (i8 == 0) {
            throw null;
        }
        if (i8 == 8) {
            if (((Integer) D2.A.c().a(AbstractC3184kf.g8)).intValue() > 0) {
                return w02;
            }
            i8 = 8;
        }
        return d(i8, null, w02);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static D2.W0 d(int i8, String str, D2.W0 w02) {
        int i9;
        String str2;
        int i10 = i8 - 1;
        if (str == null) {
            if (i8 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i10) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) D2.A.c().a(AbstractC3184kf.j8)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i8 == 0) {
            throw null;
        }
        int i11 = 2;
        switch (i10) {
            case 0:
            case 11:
            case 15:
                i11 = 0;
                return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i11 = 1;
                return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
            case 2:
            case 10:
            case 18:
                i11 = 3;
                return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
            case 3:
                i9 = 8;
                i11 = i9;
                return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
            case 4:
            case 8:
            case 17:
                return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
            case 7:
                i9 = 4;
                i11 = i9;
                return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
            case 12:
                if (((Integer) D2.A.c().a(AbstractC3184kf.j8)).intValue() <= 0) {
                    i9 = 9;
                    i11 = i9;
                    return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
                }
                i11 = 3;
                return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
            case 13:
                i9 = 10;
                i11 = i9;
                return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
            case 14:
                i9 = 11;
                i11 = i9;
                return new D2.W0(i11, str3, "com.google.android.gms.ads", w02, null);
            default:
                switch (i8) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
