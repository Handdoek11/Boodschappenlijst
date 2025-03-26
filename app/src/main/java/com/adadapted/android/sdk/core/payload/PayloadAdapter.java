package com.adadapted.android.sdk.core.payload;

import A6.d;
import I6.l;
import com.adadapted.android.sdk.core.device.DeviceInfo;

/* loaded from: classes.dex */
public interface PayloadAdapter {
    Object pickup(DeviceInfo deviceInfo, l lVar, d dVar);

    Object publishEvent(DeviceInfo deviceInfo, PayloadEvent payloadEvent, d dVar);
}
