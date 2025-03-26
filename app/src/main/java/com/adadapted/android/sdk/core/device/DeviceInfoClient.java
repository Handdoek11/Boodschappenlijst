package com.adadapted.android.sdk.core.device;

import A6.d;
import B6.b;
import I6.p;
import J6.r;
import U6.M;
import com.adadapted.android.sdk.core.concurrency.Transporter;
import com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope;
import com.adadapted.android.sdk.core.interfaces.DeviceCallback;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;
import y6.AbstractC6971J;

/* loaded from: classes.dex */
public final class DeviceInfoClient {
    private static DeviceInfo deviceInfo;
    private static DeviceInfoExtractor deviceInfoExtractor;
    private static boolean isProd;
    public static final DeviceInfoClient INSTANCE = new DeviceInfoClient();
    private static String appId = "";
    private static Map<String, String> params = AbstractC6971J.e();
    private static String customIdentifier = "";
    private static TransporterCoroutineScope transporter = new Transporter();
    private static Set<DeviceCallback> deviceCallbacks = new HashSet();
    public static final int $stable = 8;

    @f(c = "com.adadapted.android.sdk.core.device.DeviceInfoClient$createInstance$1", f = "DeviceInfoClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.device.DeviceInfoClient$createInstance$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;

        AnonymousClass1(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            DeviceInfoClient.INSTANCE.collectDeviceInfo();
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.device.DeviceInfoClient$getDeviceInfo$1", f = "DeviceInfoClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.device.DeviceInfoClient$getDeviceInfo$1, reason: invalid class name and case insensitive filesystem */
    static final class C10251 extends l implements p {
        final /* synthetic */ DeviceCallback $deviceCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10251(DeviceCallback deviceCallback, d dVar) {
            super(2, dVar);
            this.$deviceCallback = deviceCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10251(this.$deviceCallback, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10251) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            DeviceInfoClient.INSTANCE.performGetInfo(this.$deviceCallback);
            return C6916E.f44463a;
        }
    }

    private DeviceInfoClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collectDeviceInfo() {
        DeviceInfoExtractor deviceInfoExtractor2 = deviceInfoExtractor;
        deviceInfo = deviceInfoExtractor2 != null ? deviceInfoExtractor2.extractDeviceInfo(appId, isProd, customIdentifier, params) : null;
        notifyCallbacks();
    }

    private final void notifyCallbacks() {
        for (DeviceCallback deviceCallback : new HashSet(deviceCallbacks)) {
            DeviceInfo deviceInfo2 = deviceInfo;
            if (deviceInfo2 != null) {
                deviceCallback.onDeviceInfoCollected(deviceInfo2);
            }
            deviceCallbacks.remove(deviceCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performGetInfo(DeviceCallback deviceCallback) {
        DeviceInfo deviceInfo2 = deviceInfo;
        if (deviceInfo2 == null) {
            deviceCallbacks.add(deviceCallback);
        } else if (deviceInfo2 != null) {
            deviceCallback.onDeviceInfoCollected(deviceInfo2);
        }
    }

    public final void createInstance(String str, boolean z7, Map<String, String> map, String str2, DeviceInfoExtractor deviceInfoExtractor2, TransporterCoroutineScope transporterCoroutineScope) {
        r.e(str, "appId");
        r.e(map, "params");
        r.e(str2, "customIdentifier");
        r.e(deviceInfoExtractor2, "deviceInfoExtractor");
        r.e(transporterCoroutineScope, "transporter");
        appId = str;
        isProd = z7;
        params = map;
        customIdentifier = str2;
        deviceInfoExtractor = deviceInfoExtractor2;
        transporter = transporterCoroutineScope;
        transporterCoroutineScope.dispatchToThread(new AnonymousClass1(null));
    }

    public final DeviceInfo getCachedDeviceInfo() {
        DeviceInfo deviceInfo2 = deviceInfo;
        if (deviceInfo2 != null) {
            return deviceInfo2;
        }
        return null;
    }

    public final void getDeviceInfo(DeviceCallback deviceCallback) {
        r.e(deviceCallback, "deviceCallback");
        transporter.dispatchToThread(new C10251(deviceCallback, null));
    }
}
