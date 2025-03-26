package com.adadapted.android.sdk.core.payload;

import J6.r;
import java.util.Date;

/* loaded from: classes.dex */
public final class PayloadEvent {
    public static final int $stable = 0;
    private final String payloadId;
    private final String status;
    private final long timestamp;

    public PayloadEvent(String str, String str2) {
        r.e(str, "payloadId");
        r.e(str2, "status");
        this.payloadId = str;
        this.status = str2;
        this.timestamp = new Date().getTime() / 1000;
    }

    public final String getPayloadId() {
        return this.payloadId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
