package com.adadapted.android.sdk.core.log;

import J6.r;
import android.util.Log;
import com.adadapted.android.sdk.constants.Config;

/* loaded from: classes.dex */
public final class AALogger {
    private static boolean disableLogging;
    private static boolean isDebugLoggingEnabled;
    public static final AALogger INSTANCE = new AALogger();
    public static final int $stable = 8;

    private AALogger() {
    }

    public final void disableAllLogging() {
        disableLogging = true;
    }

    public final void enableDebugLogging() {
        isDebugLoggingEnabled = true;
    }

    public final void logDebug(String str) {
        r.e(str, "message");
        if (!isDebugLoggingEnabled || disableLogging) {
            return;
        }
        Log.d(Config.LOG_TAG, str);
    }

    public final void logError(String str) {
        r.e(str, "message");
        if (disableLogging) {
            return;
        }
        Log.e(Config.LOG_TAG, str);
    }

    public final void logInfo(String str) {
        r.e(str, "message");
        if (disableLogging) {
            return;
        }
        Log.i(Config.LOG_TAG, str);
    }
}
