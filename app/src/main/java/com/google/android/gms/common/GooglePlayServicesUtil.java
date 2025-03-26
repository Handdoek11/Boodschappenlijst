package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class GooglePlayServicesUtil extends AbstractC1110i {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = AbstractC1110i.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i8, Activity activity, int i9) {
        return getErrorDialog(i8, activity, i9, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i8, Context context, int i9) {
        return C1109h.f().c(context, i8, i9);
    }

    @Deprecated
    public static String getErrorString(int i8) {
        return AbstractC1110i.getErrorString(i8);
    }

    public static Context getRemoteContext(Context context) {
        return AbstractC1110i.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return AbstractC1110i.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return AbstractC1110i.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i8) {
        return AbstractC1110i.isUserRecoverableError(i8);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i8, Activity activity, int i9) {
        return showErrorDialogFragment(i8, activity, i9, null);
    }

    @Deprecated
    public static void showErrorNotification(int i8, Context context) {
        C1108g m8 = C1108g.m();
        if (AbstractC1110i.isPlayServicesPossiblyUpdating(context, i8) || AbstractC1110i.isPlayStorePossiblyUpdating(context, i8)) {
            m8.u(context);
        } else {
            m8.o(context, i8);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i8, Activity activity, int i9, DialogInterface.OnCancelListener onCancelListener) {
        if (true == AbstractC1110i.isPlayServicesPossiblyUpdating(activity, i8)) {
            i8 = 18;
        }
        return C1108g.m().k(activity, i8, i9, onCancelListener);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i8) {
        return AbstractC1110i.isGooglePlayServicesAvailable(context, i8);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i8, Activity activity, int i9, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i8, activity, null, i9, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i8, Activity activity, Fragment fragment, int i9, DialogInterface.OnCancelListener onCancelListener) {
        if (true == AbstractC1110i.isPlayServicesPossiblyUpdating(activity, i8)) {
            i8 = 18;
        }
        int i10 = i8;
        C1108g m8 = C1108g.m();
        if (fragment == null) {
            return m8.n(activity, i10, i9, onCancelListener);
        }
        Dialog p8 = m8.p(activity, i10, Z2.G.c(fragment, C1108g.m().b(activity, i10, "d"), i9), onCancelListener, null);
        if (p8 == null) {
            return false;
        }
        m8.s(activity, p8, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
