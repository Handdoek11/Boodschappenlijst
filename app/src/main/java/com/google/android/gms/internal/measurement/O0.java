package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import i3.InterfaceC5852a;
import java.util.Map;

/* loaded from: classes.dex */
public interface O0 extends IInterface {
    void beginAdUnitExposure(String str, long j8);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j8);

    void endAdUnitExposure(String str, long j8);

    void generateEventId(T0 t02);

    void getAppInstanceId(T0 t02);

    void getCachedAppInstanceId(T0 t02);

    void getConditionalUserProperties(String str, String str2, T0 t02);

    void getCurrentScreenClass(T0 t02);

    void getCurrentScreenName(T0 t02);

    void getGmpAppId(T0 t02);

    void getMaxUserProperties(String str, T0 t02);

    void getSessionId(T0 t02);

    void getTestFlag(T0 t02, int i8);

    void getUserProperties(String str, String str2, boolean z7, T0 t02);

    void initForTests(Map map);

    void initialize(InterfaceC5852a interfaceC5852a, C4871b1 c4871b1, long j8);

    void isDataCollectionEnabled(T0 t02);

    void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8);

    void logEventAndBundle(String str, String str2, Bundle bundle, T0 t02, long j8);

    void logHealthData(int i8, String str, InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2, InterfaceC5852a interfaceC5852a3);

    void onActivityCreated(InterfaceC5852a interfaceC5852a, Bundle bundle, long j8);

    void onActivityDestroyed(InterfaceC5852a interfaceC5852a, long j8);

    void onActivityPaused(InterfaceC5852a interfaceC5852a, long j8);

    void onActivityResumed(InterfaceC5852a interfaceC5852a, long j8);

    void onActivitySaveInstanceState(InterfaceC5852a interfaceC5852a, T0 t02, long j8);

    void onActivityStarted(InterfaceC5852a interfaceC5852a, long j8);

    void onActivityStopped(InterfaceC5852a interfaceC5852a, long j8);

    void performAction(Bundle bundle, T0 t02, long j8);

    void registerOnMeasurementEventListener(U0 u02);

    void resetAnalyticsData(long j8);

    void setConditionalUserProperty(Bundle bundle, long j8);

    void setConsent(Bundle bundle, long j8);

    void setConsentThirdParty(Bundle bundle, long j8);

    void setCurrentScreen(InterfaceC5852a interfaceC5852a, String str, String str2, long j8);

    void setDataCollectionEnabled(boolean z7);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(U0 u02);

    void setInstanceIdProvider(Z0 z02);

    void setMeasurementEnabled(boolean z7, long j8);

    void setMinimumSessionDuration(long j8);

    void setSessionTimeoutDuration(long j8);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j8);

    void setUserProperty(String str, String str2, InterfaceC5852a interfaceC5852a, boolean z7, long j8);

    void unregisterOnMeasurementEventListener(U0 u02);
}
