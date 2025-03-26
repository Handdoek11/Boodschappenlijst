package com.adadapted.android.sdk.core.event;

import J6.r;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import com.adadapted.android.sdk.core.session.Session;
import java.util.Set;
import y6.AbstractC6987o;
import y6.P;

/* loaded from: classes.dex */
public final class EventRequestBuilder {
    public static final int $stable = 0;
    public static final EventRequestBuilder INSTANCE = new EventRequestBuilder();

    private EventRequestBuilder() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventRequest buildEventRequest$default(EventRequestBuilder eventRequestBuilder, Session session, Set set, Set set2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            set = P.b();
        }
        if ((i8 & 4) != 0) {
            set2 = P.b();
        }
        return eventRequestBuilder.buildEventRequest(session, set, set2);
    }

    public final AdEventRequest buildAdEventRequest(Session session, Set<AdEvent> set) {
        r.e(session, "session");
        r.e(set, "adEvents");
        return new AdEventRequest(session.getId(), session.getDeviceInfo().getAppId(), session.getDeviceInfo().getUdid(), session.getDeviceInfo().getSdkVersion(), AbstractC6987o.a0(set));
    }

    public final EventRequest buildEventRequest(Session session, Set<SdkEvent> set, Set<SdkError> set2) {
        r.e(session, "session");
        r.e(set, "sdkEvents");
        r.e(set2, "sdkErrors");
        DeviceInfo deviceInfo = session.getDeviceInfo();
        String id = session.getId();
        String appId = deviceInfo.getAppId();
        String bundleId = deviceInfo.getBundleId();
        String bundleVersion = deviceInfo.getBundleVersion();
        String udid = deviceInfo.getUdid();
        String deviceName = deviceInfo.getDeviceName();
        String deviceUdid = deviceInfo.getDeviceUdid();
        String os = deviceInfo.getOs();
        String osv = deviceInfo.getOsv();
        String locale = deviceInfo.getLocale();
        String timezone = deviceInfo.getTimezone();
        String carrier = deviceInfo.getCarrier();
        int dw = deviceInfo.getDw();
        int dh = deviceInfo.getDh();
        String density = deviceInfo.getDensity();
        String sdkVersion = deviceInfo.getSdkVersion();
        boolean isAllowRetargetingEnabled = deviceInfo.isAllowRetargetingEnabled();
        return new EventRequest(id, appId, bundleId, bundleVersion, udid, deviceName, deviceUdid, os, osv, locale, timezone, carrier, dw, dh, density, sdkVersion, isAllowRetargetingEnabled ? 1 : 0, AbstractC6987o.a0(set), AbstractC6987o.a0(set2));
    }
}
