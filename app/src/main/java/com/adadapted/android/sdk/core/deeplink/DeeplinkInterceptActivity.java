package com.adadapted.android.sdk.core.deeplink;

import android.os.Bundle;
import androidx.appcompat.app.AbstractActivityC0835d;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.atl.AddItContentPublisher;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.log.AALogger;
import com.adadapted.android.sdk.core.payload.PayloadClient;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class DeeplinkInterceptActivity extends AbstractActivityC0835d {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AALogger aALogger = AALogger.INSTANCE;
        aALogger.logInfo("Deeplink Intercept Activity Launched.");
        PayloadClient.INSTANCE.deeplinkInProgress();
        EventClient.trackSdkEvent$default(EventClient.INSTANCE, EventStrings.ADDIT_APP_OPENED, null, 2, null);
        try {
            try {
                AdditContent parse = new DeeplinkContentParser().parse(getIntent().getData());
                aALogger.logInfo("AddIt content dispatched to App.");
                AddItContentPublisher.INSTANCE.publishAddItContent(parse);
            } catch (Exception e8) {
                AALogger.INSTANCE.logError("Problem dealing with AddIt content from DeeplinkInterceptActivity. Recovering. " + e8.getMessage());
                HashMap hashMap = new HashMap();
                String message = e8.getMessage();
                if (message != null) {
                }
                EventClient.INSTANCE.trackSdkError(EventStrings.ADDIT_DEEPLINK_HANDLING_ERROR, "Problem handling deeplink.", hashMap);
            }
            PayloadClient.INSTANCE.deeplinkCompleted();
            finish();
        } finally {
            startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
        }
    }
}
