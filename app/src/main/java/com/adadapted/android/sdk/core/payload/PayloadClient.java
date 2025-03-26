package com.adadapted.android.sdk.core.payload;

import A6.d;
import B6.b;
import I6.p;
import J6.r;
import U6.M;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.atl.AddToListItem;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.adadapted.android.sdk.core.concurrency.Transporter;
import com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import com.adadapted.android.sdk.core.device.DeviceInfoClient;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.interfaces.DeviceCallback;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public final class PayloadClient {
    private static final String ITEM_NAME = "item_name";
    private static final String PAYLOAD_ID = "payload_id";
    private static final String SOURCE = "source";
    private static final String TRACKING_ID = "tracking_id";
    private static PayloadAdapter adapter;
    private static boolean deeplinkInProgress;
    private static EventClient eventClient;
    public static final PayloadClient INSTANCE = new PayloadClient();
    private static TransporterCoroutineScope transporter = new Transporter();
    public static final int $stable = 8;

    @f(c = "com.adadapted.android.sdk.core.payload.PayloadClient$markContentAcknowledged$1", f = "PayloadClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.payload.PayloadClient$markContentAcknowledged$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        final /* synthetic */ AdditContent $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdditContent additContent, d dVar) {
            super(2, dVar);
            this.$content = additContent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$content, dVar);
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
            HashMap hashMap = new HashMap();
            hashMap.put(PayloadClient.PAYLOAD_ID, this.$content.getPayloadId());
            hashMap.put(PayloadClient.SOURCE, this.$content.getAdditSource());
            EventClient eventClient = PayloadClient.eventClient;
            if (eventClient != null) {
                eventClient.trackSdkEvent(EventStrings.ADDIT_ADDED_TO_LIST, hashMap);
            }
            if (this.$content.isPayloadSource()) {
                PayloadClient.INSTANCE.trackPayload(this.$content, "delivered");
            }
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.payload.PayloadClient$markContentDuplicate$1", f = "PayloadClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.payload.PayloadClient$markContentDuplicate$1, reason: invalid class name and case insensitive filesystem */
    static final class C10411 extends l implements p {
        final /* synthetic */ AdditContent $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10411(AdditContent additContent, d dVar) {
            super(2, dVar);
            this.$content = additContent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10411(this.$content, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10411) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            HashMap hashMap = new HashMap();
            hashMap.put(PayloadClient.PAYLOAD_ID, this.$content.getPayloadId());
            EventClient eventClient = PayloadClient.eventClient;
            if (eventClient != null) {
                eventClient.trackSdkEvent(EventStrings.ADDIT_DUPLICATE_PAYLOAD, hashMap);
            }
            if (this.$content.isPayloadSource()) {
                PayloadClient.INSTANCE.trackPayload(this.$content, "duplicate");
            }
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.payload.PayloadClient$markContentFailed$1", f = "PayloadClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.payload.PayloadClient$markContentFailed$1, reason: invalid class name and case insensitive filesystem */
    static final class C10421 extends l implements p {
        final /* synthetic */ AdditContent $content;
        final /* synthetic */ String $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10421(AdditContent additContent, String str, d dVar) {
            super(2, dVar);
            this.$content = additContent;
            this.$message = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10421(this.$content, this.$message, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10421) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            HashMap hashMap = new HashMap();
            hashMap.put(PayloadClient.PAYLOAD_ID, this.$content.getPayloadId());
            EventClient eventClient = PayloadClient.eventClient;
            if (eventClient != null) {
                eventClient.trackSdkError(EventStrings.ADDIT_CONTENT_FAILED, this.$message, hashMap);
            }
            if (this.$content.isPayloadSource()) {
                PayloadClient.INSTANCE.trackPayload(this.$content, "rejected");
            }
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.payload.PayloadClient$markContentItemAcknowledged$1", f = "PayloadClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.payload.PayloadClient$markContentItemAcknowledged$1, reason: invalid class name and case insensitive filesystem */
    static final class C10431 extends l implements p {
        final /* synthetic */ AdditContent $content;
        final /* synthetic */ AddToListItem $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10431(AdditContent additContent, AddToListItem addToListItem, d dVar) {
            super(2, dVar);
            this.$content = additContent;
            this.$item = addToListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10431(this.$content, this.$item, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10431) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            HashMap hashMap = new HashMap();
            hashMap.put(PayloadClient.PAYLOAD_ID, this.$content.getPayloadId());
            hashMap.put(PayloadClient.TRACKING_ID, this.$item.getTrackingId());
            hashMap.put(PayloadClient.ITEM_NAME, this.$item.getTitle());
            hashMap.put(PayloadClient.SOURCE, this.$content.getAdditSource());
            EventClient eventClient = PayloadClient.eventClient;
            if (eventClient != null) {
                eventClient.trackSdkEvent(EventStrings.ADDIT_ITEM_ADDED_TO_LIST, hashMap);
            }
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.payload.PayloadClient$markContentItemFailed$1", f = "PayloadClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.payload.PayloadClient$markContentItemFailed$1, reason: invalid class name and case insensitive filesystem */
    static final class C10441 extends l implements p {
        final /* synthetic */ AdditContent $content;
        final /* synthetic */ AddToListItem $item;
        final /* synthetic */ String $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10441(AdditContent additContent, AddToListItem addToListItem, String str, d dVar) {
            super(2, dVar);
            this.$content = additContent;
            this.$item = addToListItem;
            this.$message = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10441(this.$content, this.$item, this.$message, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10441) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            HashMap hashMap = new HashMap();
            hashMap.put(PayloadClient.PAYLOAD_ID, this.$content.getPayloadId());
            hashMap.put(PayloadClient.TRACKING_ID, this.$item.getTrackingId());
            EventClient eventClient = PayloadClient.eventClient;
            if (eventClient != null) {
                eventClient.trackSdkError(EventStrings.ADDIT_CONTENT_ITEM_FAILED, this.$message, hashMap);
            }
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.payload.PayloadClient$pickupPayloads$1", f = "PayloadClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.payload.PayloadClient$pickupPayloads$1, reason: invalid class name and case insensitive filesystem */
    static final class C10461 extends l implements p {
        final /* synthetic */ I6.l $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10461(I6.l lVar, d dVar) {
            super(2, dVar);
            this.$callback = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10461(this.$callback, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10461) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            PayloadClient.INSTANCE.performPickupPayload(this.$callback);
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.payload.PayloadClient$trackPayload$1", f = "PayloadClient.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.payload.PayloadClient$trackPayload$1, reason: invalid class name and case insensitive filesystem */
    static final class C10471 extends l implements p {
        final /* synthetic */ PayloadEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10471(PayloadEvent payloadEvent, d dVar) {
            super(2, dVar);
            this.$event = payloadEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10471(this.$event, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10471) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 == 0) {
                q.b(obj);
                DeviceInfo cachedDeviceInfo = DeviceInfoClient.INSTANCE.getCachedDeviceInfo();
                if (cachedDeviceInfo != null) {
                    PayloadEvent payloadEvent = this.$event;
                    PayloadAdapter payloadAdapter = PayloadClient.adapter;
                    if (payloadAdapter != null) {
                        this.label = 1;
                        if (payloadAdapter.publishEvent(cachedDeviceInfo, payloadEvent, this) == e8) {
                            return e8;
                        }
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return C6916E.f44463a;
        }
    }

    private PayloadClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performPickupPayload(final I6.l lVar) {
        DeviceInfoClient.INSTANCE.getDeviceInfo(new DeviceCallback() { // from class: com.adadapted.android.sdk.core.payload.PayloadClient.performPickupPayload.1
            @Override // com.adadapted.android.sdk.core.interfaces.DeviceCallback
            public void onDeviceInfoCollected(DeviceInfo deviceInfo) {
                r.e(deviceInfo, "deviceInfo");
                EventClient eventClient2 = PayloadClient.eventClient;
                if (eventClient2 != null) {
                    EventClient.trackSdkEvent$default(eventClient2, EventStrings.PAYLOAD_PICKUP_ATTEMPT, null, 2, null);
                }
                PayloadClient.transporter.dispatchToThread(new PayloadClient$performPickupPayload$1$onDeviceInfoCollected$1(deviceInfo, lVar, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackPayload(AdditContent additContent, String str) {
        transporter.dispatchToThread(new C10471(new PayloadEvent(additContent.getPayloadId(), str), null));
    }

    public final void createInstance(PayloadAdapter payloadAdapter, EventClient eventClient2, TransporterCoroutineScope transporterCoroutineScope) {
        r.e(payloadAdapter, "adapter");
        r.e(eventClient2, "eventClient");
        r.e(transporterCoroutineScope, "transporter");
        adapter = payloadAdapter;
        eventClient = eventClient2;
        transporter = transporterCoroutineScope;
    }

    public final synchronized void deeplinkCompleted() {
        deeplinkInProgress = false;
    }

    public final synchronized void deeplinkInProgress() {
        deeplinkInProgress = true;
    }

    public final void markContentAcknowledged(AdditContent additContent) {
        r.e(additContent, "content");
        transporter.dispatchToThread(new AnonymousClass1(additContent, null));
    }

    public final void markContentDuplicate(AdditContent additContent) {
        r.e(additContent, "content");
        transporter.dispatchToThread(new C10411(additContent, null));
    }

    public final void markContentFailed(AdditContent additContent, String str) {
        r.e(additContent, "content");
        r.e(str, "message");
        transporter.dispatchToThread(new C10421(additContent, str, null));
    }

    public final void markContentItemAcknowledged(AdditContent additContent, AddToListItem addToListItem) {
        r.e(additContent, "content");
        r.e(addToListItem, "item");
        transporter.dispatchToThread(new C10431(additContent, addToListItem, null));
    }

    public final void markContentItemFailed(AdditContent additContent, AddToListItem addToListItem, String str) {
        r.e(additContent, "content");
        r.e(addToListItem, "item");
        r.e(str, "message");
        transporter.dispatchToThread(new C10441(additContent, addToListItem, str, null));
    }

    public final void pickupPayloads(I6.l lVar) {
        r.e(lVar, "callback");
        if (deeplinkInProgress) {
            return;
        }
        transporter.dispatchToThread(new C10461(lVar, null));
    }
}
