package com.adadapted.android.sdk.core.network;

import J6.r;
import com.adadapted.android.sdk.core.payload.PayloadAdapter;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* loaded from: classes.dex */
public final class HttpPayloadAdapter implements PayloadAdapter {
    public static final int $stable = 8;
    private final HttpConnector httpConnector;
    private final String pickupUrl;
    private final String trackUrl;

    @f(c = "com.adadapted.android.sdk.core.network.HttpPayloadAdapter", f = "HttpPayloadAdapter.kt", l = {81, 82}, m = "pickup")
    /* renamed from: com.adadapted.android.sdk.core.network.HttpPayloadAdapter$pickup$1, reason: invalid class name */
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpPayloadAdapter.this.pickup(null, null, this);
        }
    }

    @f(c = "com.adadapted.android.sdk.core.network.HttpPayloadAdapter", f = "HttpPayloadAdapter.kt", l = {81}, m = "publishEvent")
    /* renamed from: com.adadapted.android.sdk.core.network.HttpPayloadAdapter$publishEvent$1, reason: invalid class name and case insensitive filesystem */
    static final class C10391 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10391(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpPayloadAdapter.this.publishEvent(null, null, this);
        }
    }

    public HttpPayloadAdapter(String str, String str2, HttpConnector httpConnector) {
        r.e(str, "pickupUrl");
        r.e(str2, "trackUrl");
        r.e(httpConnector, "httpConnector");
        this.pickupUrl = str;
        this.trackUrl = str2;
        this.httpConnector = httpConnector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:13:0x0032, B:40:0x00fd, B:41:0x0109, B:42:0x0110, B:36:0x00d8), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109 A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:13:0x0032, B:40:0x00fd, B:41:0x0109, B:42:0x0110, B:36:0x00d8), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // com.adadapted.android.sdk.core.payload.PayloadAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object pickup(com.adadapted.android.sdk.core.device.DeviceInfo r11, I6.l r12, A6.d r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.network.HttpPayloadAdapter.pickup(com.adadapted.android.sdk.core.device.DeviceInfo, I6.l, A6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.adadapted.android.sdk.core.payload.PayloadAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object publishEvent(com.adadapted.android.sdk.core.device.DeviceInfo r7, com.adadapted.android.sdk.core.payload.PayloadEvent r8, A6.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.adadapted.android.sdk.core.network.HttpPayloadAdapter.C10391
            if (r0 == 0) goto L13
            r0 = r9
            com.adadapted.android.sdk.core.network.HttpPayloadAdapter$publishEvent$1 r0 = (com.adadapted.android.sdk.core.network.HttpPayloadAdapter.C10391) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adadapted.android.sdk.core.network.HttpPayloadAdapter$publishEvent$1 r0 = new com.adadapted.android.sdk.core.network.HttpPayloadAdapter$publishEvent$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            com.adadapted.android.sdk.core.network.HttpPayloadAdapter r7 = (com.adadapted.android.sdk.core.network.HttpPayloadAdapter) r7
            x6.q.b(r9)     // Catch: java.lang.Exception -> L2e
            goto Ld7
        L2e:
            r8 = move-exception
            goto Lb3
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            x6.q.b(r9)
            com.adadapted.android.sdk.core.network.HttpConnector r9 = r6.httpConnector     // Catch: java.lang.Exception -> L78
            v5.a r9 = r9.getClient()     // Catch: java.lang.Exception -> L78
            java.lang.String r2 = r6.trackUrl     // Catch: java.lang.Exception -> L78
            E5.c r4 = new E5.c     // Catch: java.lang.Exception -> L78
            r4.<init>()     // Catch: java.lang.Exception -> L78
            E5.e.a(r4, r2)     // Catch: java.lang.Exception -> L78
            I5.b$a r2 = I5.C0628b.a.f3225a     // Catch: java.lang.Exception -> L78
            I5.b r2 = r2.a()     // Catch: java.lang.Exception -> L78
            I5.s.e(r4, r2)     // Catch: java.lang.Exception -> L78
            com.adadapted.android.sdk.core.payload.PayloadRequestBuilder r2 = com.adadapted.android.sdk.core.payload.PayloadRequestBuilder.INSTANCE     // Catch: java.lang.Exception -> L78
            com.adadapted.android.sdk.core.payload.PayloadEventRequest r8 = r2.buildEventRequest(r7, r8)     // Catch: java.lang.Exception -> L78
            java.lang.Class<com.adadapted.android.sdk.core.payload.PayloadEventRequest> r2 = com.adadapted.android.sdk.core.payload.PayloadEventRequest.class
            if (r8 != 0) goto L7b
            J5.a r8 = J5.a.f3538a     // Catch: java.lang.Exception -> L78
            r4.j(r8)     // Catch: java.lang.Exception -> L78
            Q6.k r8 = J6.H.i(r2)     // Catch: java.lang.Exception -> L78
            java.lang.reflect.Type r5 = Q6.n.e(r8)     // Catch: java.lang.Exception -> L78
            Q6.b r2 = J6.H.b(r2)     // Catch: java.lang.Exception -> L78
            U5.a r8 = U5.b.b(r5, r2, r8)     // Catch: java.lang.Exception -> L78
            r4.k(r8)     // Catch: java.lang.Exception -> L78
            goto L91
        L78:
            r8 = move-exception
            r7 = r6
            goto Lb3
        L7b:
            r4.j(r8)     // Catch: java.lang.Exception -> L78
            Q6.k r8 = J6.H.i(r2)     // Catch: java.lang.Exception -> L78
            java.lang.reflect.Type r5 = Q6.n.e(r8)     // Catch: java.lang.Exception -> L78
            Q6.b r2 = J6.H.b(r2)     // Catch: java.lang.Exception -> L78
            U5.a r8 = U5.b.b(r5, r2, r8)     // Catch: java.lang.Exception -> L78
            r4.k(r8)     // Catch: java.lang.Exception -> L78
        L91:
            java.lang.String r8 = "X-API-KEY"
            java.lang.String r7 = r7.getAppId()     // Catch: java.lang.Exception -> L78
            E5.j.b(r4, r8, r7)     // Catch: java.lang.Exception -> L78
            I5.t$a r7 = I5.t.f3376b     // Catch: java.lang.Exception -> L78
            I5.t r7 = r7.c()     // Catch: java.lang.Exception -> L78
            r4.n(r7)     // Catch: java.lang.Exception -> L78
            F5.g r7 = new F5.g     // Catch: java.lang.Exception -> L78
            r7.<init>(r4, r9)     // Catch: java.lang.Exception -> L78
            r0.L$0 = r6     // Catch: java.lang.Exception -> L78
            r0.label = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r7 = r7.c(r0)     // Catch: java.lang.Exception -> L78
            if (r7 != r1) goto Ld7
            return r1
        Lb3:
            java.lang.String r9 = r8.getMessage()
            if (r9 == 0) goto Lbe
            com.adadapted.android.sdk.core.log.AALogger r0 = com.adadapted.android.sdk.core.log.AALogger.INSTANCE
            r0.logError(r9)
        Lbe:
            com.adadapted.android.sdk.core.network.HttpErrorTracker r9 = com.adadapted.android.sdk.core.network.HttpErrorTracker.INSTANCE
            java.lang.Throwable r0 = r8.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "PAYLOAD_EVENT_REQUEST_FAILED"
            java.lang.String r7 = r7.trackUrl
            r9.trackHttpError(r0, r8, r1, r7)
        Ld7:
            x6.E r7 = x6.C6916E.f44463a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.network.HttpPayloadAdapter.publishEvent(com.adadapted.android.sdk.core.device.DeviceInfo, com.adadapted.android.sdk.core.payload.PayloadEvent, A6.d):java.lang.Object");
    }
}
