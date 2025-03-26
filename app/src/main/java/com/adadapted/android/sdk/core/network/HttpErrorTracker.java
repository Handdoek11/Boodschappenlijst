package com.adadapted.android.sdk.core.network;

import J6.r;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.log.AALogger;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class HttpErrorTracker {
    public static final int $stable = 0;
    public static final HttpErrorTracker INSTANCE = new HttpErrorTracker();

    private HttpErrorTracker() {
    }

    public final void trackHttpError(String str, String str2, String str3, String str4) {
        r.e(str, "errorCause");
        r.e(str2, "errorMessage");
        r.e(str3, "errorEventCode");
        r.e(str4, "url");
        HashMap hashMap = new HashMap();
        hashMap.put("url", str4);
        hashMap.put("data", str);
        try {
            EventClient.INSTANCE.trackSdkError(str3, str2, hashMap);
        } catch (IllegalArgumentException e8) {
            AALogger.INSTANCE.logError("AppEventClient was not initialized, is your API key valid? DETAIL: " + e8.getMessage());
        }
    }
}
