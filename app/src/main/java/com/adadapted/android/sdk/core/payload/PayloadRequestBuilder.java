package com.adadapted.android.sdk.core.payload;

import J6.r;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import java.util.Date;
import l7.b;
import l7.i;
import l7.t;
import x6.u;
import y6.AbstractC6971J;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class PayloadRequestBuilder {
    public static final int $stable = 0;
    public static final PayloadRequestBuilder INSTANCE = new PayloadRequestBuilder();

    private PayloadRequestBuilder() {
    }

    public final PayloadEventRequest buildEventRequest(DeviceInfo deviceInfo, PayloadEvent payloadEvent) {
        r.e(deviceInfo, "deviceInfo");
        r.e(payloadEvent, "event");
        return new PayloadEventRequest(deviceInfo.getAppId(), deviceInfo.getUdid(), deviceInfo.getBundleId(), deviceInfo.getBundleVersion(), deviceInfo.getDeviceName(), deviceInfo.getOs(), deviceInfo.getOsv(), deviceInfo.getSdkVersion(), new b(AbstractC6987o.b(new t(AbstractC6971J.g(u.a("payload_id", i.b(payloadEvent.getPayloadId())), u.a("status", i.b(payloadEvent.getStatus())), u.a("event_timestamp", i.a(Long.valueOf(payloadEvent.getTimestamp()))))))));
    }

    public final PayloadRequest buildRequest(DeviceInfo deviceInfo) {
        r.e(deviceInfo, "deviceInfo");
        return new PayloadRequest(deviceInfo.getAppId(), deviceInfo.getUdid(), deviceInfo.getBundleId(), deviceInfo.getBundleVersion(), deviceInfo.getDeviceName(), deviceInfo.getOs(), deviceInfo.getOsv(), deviceInfo.getSdkVersion(), new Date().getTime() / 1000);
    }
}
