package com.adadapted.android.sdk.core.network;

import J6.r;
import com.adadapted.android.sdk.core.event.EventAdapter;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* loaded from: classes.dex */
public final class HttpEventAdapter implements EventAdapter {
    public static final int $stable = 8;
    private final String adEventUrl;
    private final String errorUrl;
    private final HttpConnector httpConnector;
    private final String sdkEventUrl;

    @f(c = "com.adadapted.android.sdk.core.network.HttpEventAdapter", f = "HttpEventAdapter.kt", l = {86}, m = "publishAdEvents")
    /* renamed from: com.adadapted.android.sdk.core.network.HttpEventAdapter$publishAdEvents$1, reason: invalid class name */
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpEventAdapter.this.publishAdEvents(null, null, this);
        }
    }

    @f(c = "com.adadapted.android.sdk.core.network.HttpEventAdapter", f = "HttpEventAdapter.kt", l = {86}, m = "publishSdkErrors")
    /* renamed from: com.adadapted.android.sdk.core.network.HttpEventAdapter$publishSdkErrors$1, reason: invalid class name and case insensitive filesystem */
    static final class C10361 extends d {
        int label;
        /* synthetic */ Object result;

        C10361(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpEventAdapter.this.publishSdkErrors(null, null, this);
        }
    }

    @f(c = "com.adadapted.android.sdk.core.network.HttpEventAdapter", f = "HttpEventAdapter.kt", l = {86}, m = "publishSdkEvents")
    /* renamed from: com.adadapted.android.sdk.core.network.HttpEventAdapter$publishSdkEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C10371 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10371(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpEventAdapter.this.publishSdkEvents(null, null, this);
        }
    }

    public HttpEventAdapter(String str, String str2, String str3, HttpConnector httpConnector) {
        r.e(str, "adEventUrl");
        r.e(str2, "sdkEventUrl");
        r.e(str3, "errorUrl");
        r.e(httpConnector, "httpConnector");
        this.adEventUrl = str;
        this.sdkEventUrl = str2;
        this.errorUrl = str3;
        this.httpConnector = httpConnector;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.adadapted.android.sdk.core.event.EventAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object publishAdEvents(com.adadapted.android.sdk.core.session.Session r7, java.util.Set<com.adadapted.android.sdk.core.event.AdEvent> r8, A6.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.adadapted.android.sdk.core.network.HttpEventAdapter.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            com.adadapted.android.sdk.core.network.HttpEventAdapter$publishAdEvents$1 r0 = (com.adadapted.android.sdk.core.network.HttpEventAdapter.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adadapted.android.sdk.core.network.HttpEventAdapter$publishAdEvents$1 r0 = new com.adadapted.android.sdk.core.network.HttpEventAdapter$publishAdEvents$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            com.adadapted.android.sdk.core.network.HttpEventAdapter r7 = (com.adadapted.android.sdk.core.network.HttpEventAdapter) r7
            x6.q.b(r9)     // Catch: java.lang.Exception -> L2e
            goto Ldb
        L2e:
            r8 = move-exception
            goto Lb7
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            x6.q.b(r9)
            com.adadapted.android.sdk.core.network.HttpConnector r9 = r6.httpConnector     // Catch: java.lang.Exception -> L78
            v5.a r9 = r9.getClient()     // Catch: java.lang.Exception -> L78
            java.lang.String r2 = r6.adEventUrl     // Catch: java.lang.Exception -> L78
            E5.c r4 = new E5.c     // Catch: java.lang.Exception -> L78
            r4.<init>()     // Catch: java.lang.Exception -> L78
            E5.e.a(r4, r2)     // Catch: java.lang.Exception -> L78
            I5.b$a r2 = I5.C0628b.a.f3225a     // Catch: java.lang.Exception -> L78
            I5.b r2 = r2.a()     // Catch: java.lang.Exception -> L78
            I5.s.e(r4, r2)     // Catch: java.lang.Exception -> L78
            com.adadapted.android.sdk.core.event.EventRequestBuilder r2 = com.adadapted.android.sdk.core.event.EventRequestBuilder.INSTANCE     // Catch: java.lang.Exception -> L78
            com.adadapted.android.sdk.core.event.AdEventRequest r8 = r2.buildAdEventRequest(r7, r8)     // Catch: java.lang.Exception -> L78
            java.lang.Class<com.adadapted.android.sdk.core.event.AdEventRequest> r2 = com.adadapted.android.sdk.core.event.AdEventRequest.class
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
            goto Lb7
        L7b:
            r4.j(r8)     // Catch: java.lang.Exception -> L78
            Q6.k r8 = J6.H.i(r2)     // Catch: java.lang.Exception -> L78
            java.lang.reflect.Type r5 = Q6.n.e(r8)     // Catch: java.lang.Exception -> L78
            Q6.b r2 = J6.H.b(r2)     // Catch: java.lang.Exception -> L78
            U5.a r8 = U5.b.b(r5, r2, r8)     // Catch: java.lang.Exception -> L78
            r4.k(r8)     // Catch: java.lang.Exception -> L78
        L91:
            java.lang.String r8 = "X-API-KEY"
            com.adadapted.android.sdk.core.device.DeviceInfo r7 = r7.getDeviceInfo()     // Catch: java.lang.Exception -> L78
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
            if (r7 != r1) goto Ldb
            return r1
        Lb7:
            java.lang.String r9 = r8.getMessage()
            if (r9 == 0) goto Lc2
            com.adadapted.android.sdk.core.log.AALogger r0 = com.adadapted.android.sdk.core.log.AALogger.INSTANCE
            r0.logError(r9)
        Lc2:
            com.adadapted.android.sdk.core.network.HttpErrorTracker r9 = com.adadapted.android.sdk.core.network.HttpErrorTracker.INSTANCE
            java.lang.Throwable r0 = r8.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "AD_EVENT_TRACK_REQUEST_FAILED"
            java.lang.String r7 = r7.adEventUrl
            r9.trackHttpError(r0, r8, r1, r7)
        Ldb:
            x6.E r7 = x6.C6916E.f44463a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.network.HttpEventAdapter.publishAdEvents(com.adadapted.android.sdk.core.session.Session, java.util.Set, A6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.adadapted.android.sdk.core.event.EventAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object publishSdkErrors(com.adadapted.android.sdk.core.session.Session r12, java.util.Set<com.adadapted.android.sdk.core.event.SdkError> r13, A6.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.adadapted.android.sdk.core.network.HttpEventAdapter.C10361
            if (r0 == 0) goto L13
            r0 = r14
            com.adadapted.android.sdk.core.network.HttpEventAdapter$publishSdkErrors$1 r0 = (com.adadapted.android.sdk.core.network.HttpEventAdapter.C10361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adadapted.android.sdk.core.network.HttpEventAdapter$publishSdkErrors$1 r0 = new com.adadapted.android.sdk.core.network.HttpEventAdapter$publishSdkErrors$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            x6.q.b(r14)     // Catch: java.lang.Exception -> L2a
            goto Lcd
        L2a:
            r12 = move-exception
            goto Lb3
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            x6.q.b(r14)
            com.adadapted.android.sdk.core.network.HttpConnector r14 = r11.httpConnector     // Catch: java.lang.Exception -> L2a
            v5.a r14 = r14.getClient()     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = r11.errorUrl     // Catch: java.lang.Exception -> L2a
            E5.c r4 = new E5.c     // Catch: java.lang.Exception -> L2a
            r4.<init>()     // Catch: java.lang.Exception -> L2a
            E5.e.a(r4, r2)     // Catch: java.lang.Exception -> L2a
            I5.b$a r2 = I5.C0628b.a.f3225a     // Catch: java.lang.Exception -> L2a
            I5.b r2 = r2.a()     // Catch: java.lang.Exception -> L2a
            I5.s.e(r4, r2)     // Catch: java.lang.Exception -> L2a
            com.adadapted.android.sdk.core.event.EventRequestBuilder r5 = com.adadapted.android.sdk.core.event.EventRequestBuilder.INSTANCE     // Catch: java.lang.Exception -> L2a
            r9 = 2
            r10 = 0
            r7 = 0
            r6 = r12
            r8 = r13
            com.adadapted.android.sdk.core.event.EventRequest r13 = com.adadapted.android.sdk.core.event.EventRequestBuilder.buildEventRequest$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L2a
            java.lang.Class<com.adadapted.android.sdk.core.event.EventRequest> r2 = com.adadapted.android.sdk.core.event.EventRequest.class
            if (r13 != 0) goto L79
            J5.a r13 = J5.a.f3538a     // Catch: java.lang.Exception -> L2a
            r4.j(r13)     // Catch: java.lang.Exception -> L2a
            Q6.k r13 = J6.H.i(r2)     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Type r5 = Q6.n.e(r13)     // Catch: java.lang.Exception -> L2a
            Q6.b r2 = J6.H.b(r2)     // Catch: java.lang.Exception -> L2a
            U5.a r13 = U5.b.b(r5, r2, r13)     // Catch: java.lang.Exception -> L2a
            r4.k(r13)     // Catch: java.lang.Exception -> L2a
            goto L8f
        L79:
            r4.j(r13)     // Catch: java.lang.Exception -> L2a
            Q6.k r13 = J6.H.i(r2)     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Type r5 = Q6.n.e(r13)     // Catch: java.lang.Exception -> L2a
            Q6.b r2 = J6.H.b(r2)     // Catch: java.lang.Exception -> L2a
            U5.a r13 = U5.b.b(r5, r2, r13)     // Catch: java.lang.Exception -> L2a
            r4.k(r13)     // Catch: java.lang.Exception -> L2a
        L8f:
            java.lang.String r13 = "X-API-KEY"
            com.adadapted.android.sdk.core.device.DeviceInfo r12 = r12.getDeviceInfo()     // Catch: java.lang.Exception -> L2a
            java.lang.String r12 = r12.getAppId()     // Catch: java.lang.Exception -> L2a
            E5.j.b(r4, r13, r12)     // Catch: java.lang.Exception -> L2a
            I5.t$a r12 = I5.t.f3376b     // Catch: java.lang.Exception -> L2a
            I5.t r12 = r12.c()     // Catch: java.lang.Exception -> L2a
            r4.n(r12)     // Catch: java.lang.Exception -> L2a
            F5.g r12 = new F5.g     // Catch: java.lang.Exception -> L2a
            r12.<init>(r4, r14)     // Catch: java.lang.Exception -> L2a
            r0.label = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r12 = r12.c(r0)     // Catch: java.lang.Exception -> L2a
            if (r12 != r1) goto Lcd
            return r1
        Lb3:
            com.adadapted.android.sdk.core.log.AALogger r13 = com.adadapted.android.sdk.core.log.AALogger.INSTANCE
            java.lang.String r12 = r12.getMessage()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "SDK Error Request Failed -> "
            r14.append(r0)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.logError(r12)
        Lcd:
            x6.E r12 = x6.C6916E.f44463a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.network.HttpEventAdapter.publishSdkErrors(com.adadapted.android.sdk.core.session.Session, java.util.Set, A6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.adadapted.android.sdk.core.event.EventAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object publishSdkEvents(com.adadapted.android.sdk.core.session.Session r12, java.util.Set<com.adadapted.android.sdk.core.event.SdkEvent> r13, A6.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.adadapted.android.sdk.core.network.HttpEventAdapter.C10371
            if (r0 == 0) goto L13
            r0 = r14
            com.adadapted.android.sdk.core.network.HttpEventAdapter$publishSdkEvents$1 r0 = (com.adadapted.android.sdk.core.network.HttpEventAdapter.C10371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adadapted.android.sdk.core.network.HttpEventAdapter$publishSdkEvents$1 r0 = new com.adadapted.android.sdk.core.network.HttpEventAdapter$publishSdkEvents$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.L$0
            com.adadapted.android.sdk.core.network.HttpEventAdapter r12 = (com.adadapted.android.sdk.core.network.HttpEventAdapter) r12
            x6.q.b(r14)     // Catch: java.lang.Exception -> L2e
            goto Le0
        L2e:
            r13 = move-exception
            goto Lbc
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            x6.q.b(r14)
            com.adadapted.android.sdk.core.network.HttpConnector r14 = r11.httpConnector     // Catch: java.lang.Exception -> L7d
            v5.a r14 = r14.getClient()     // Catch: java.lang.Exception -> L7d
            java.lang.String r2 = r11.sdkEventUrl     // Catch: java.lang.Exception -> L7d
            E5.c r4 = new E5.c     // Catch: java.lang.Exception -> L7d
            r4.<init>()     // Catch: java.lang.Exception -> L7d
            E5.e.a(r4, r2)     // Catch: java.lang.Exception -> L7d
            I5.b$a r2 = I5.C0628b.a.f3225a     // Catch: java.lang.Exception -> L7d
            I5.b r2 = r2.a()     // Catch: java.lang.Exception -> L7d
            I5.s.e(r4, r2)     // Catch: java.lang.Exception -> L7d
            com.adadapted.android.sdk.core.event.EventRequestBuilder r5 = com.adadapted.android.sdk.core.event.EventRequestBuilder.INSTANCE     // Catch: java.lang.Exception -> L7d
            r9 = 4
            r10 = 0
            r8 = 0
            r6 = r12
            r7 = r13
            com.adadapted.android.sdk.core.event.EventRequest r13 = com.adadapted.android.sdk.core.event.EventRequestBuilder.buildEventRequest$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L7d
            java.lang.Class<com.adadapted.android.sdk.core.event.EventRequest> r2 = com.adadapted.android.sdk.core.event.EventRequest.class
            if (r13 != 0) goto L80
            J5.a r13 = J5.a.f3538a     // Catch: java.lang.Exception -> L7d
            r4.j(r13)     // Catch: java.lang.Exception -> L7d
            Q6.k r13 = J6.H.i(r2)     // Catch: java.lang.Exception -> L7d
            java.lang.reflect.Type r5 = Q6.n.e(r13)     // Catch: java.lang.Exception -> L7d
            Q6.b r2 = J6.H.b(r2)     // Catch: java.lang.Exception -> L7d
            U5.a r13 = U5.b.b(r5, r2, r13)     // Catch: java.lang.Exception -> L7d
            r4.k(r13)     // Catch: java.lang.Exception -> L7d
            goto L96
        L7d:
            r13 = move-exception
            r12 = r11
            goto Lbc
        L80:
            r4.j(r13)     // Catch: java.lang.Exception -> L7d
            Q6.k r13 = J6.H.i(r2)     // Catch: java.lang.Exception -> L7d
            java.lang.reflect.Type r5 = Q6.n.e(r13)     // Catch: java.lang.Exception -> L7d
            Q6.b r2 = J6.H.b(r2)     // Catch: java.lang.Exception -> L7d
            U5.a r13 = U5.b.b(r5, r2, r13)     // Catch: java.lang.Exception -> L7d
            r4.k(r13)     // Catch: java.lang.Exception -> L7d
        L96:
            java.lang.String r13 = "X-API-KEY"
            com.adadapted.android.sdk.core.device.DeviceInfo r12 = r12.getDeviceInfo()     // Catch: java.lang.Exception -> L7d
            java.lang.String r12 = r12.getAppId()     // Catch: java.lang.Exception -> L7d
            E5.j.b(r4, r13, r12)     // Catch: java.lang.Exception -> L7d
            I5.t$a r12 = I5.t.f3376b     // Catch: java.lang.Exception -> L7d
            I5.t r12 = r12.c()     // Catch: java.lang.Exception -> L7d
            r4.n(r12)     // Catch: java.lang.Exception -> L7d
            F5.g r12 = new F5.g     // Catch: java.lang.Exception -> L7d
            r12.<init>(r4, r14)     // Catch: java.lang.Exception -> L7d
            r0.L$0 = r11     // Catch: java.lang.Exception -> L7d
            r0.label = r3     // Catch: java.lang.Exception -> L7d
            java.lang.Object r12 = r12.c(r0)     // Catch: java.lang.Exception -> L7d
            if (r12 != r1) goto Le0
            return r1
        Lbc:
            java.lang.String r14 = r13.getMessage()
            if (r14 == 0) goto Lc7
            com.adadapted.android.sdk.core.log.AALogger r0 = com.adadapted.android.sdk.core.log.AALogger.INSTANCE
            r0.logError(r14)
        Lc7:
            com.adadapted.android.sdk.core.network.HttpErrorTracker r14 = com.adadapted.android.sdk.core.network.HttpErrorTracker.INSTANCE
            java.lang.Throwable r0 = r13.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r1 = "APP_EVENT_REQUEST_FAILED"
            java.lang.String r12 = r12.adEventUrl
            r14.trackHttpError(r0, r13, r1, r12)
        Le0:
            x6.E r12 = x6.C6916E.f44463a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.network.HttpEventAdapter.publishSdkEvents(com.adadapted.android.sdk.core.session.Session, java.util.Set, A6.d):java.lang.Object");
    }
}
