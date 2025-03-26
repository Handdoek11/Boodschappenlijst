package com.adadapted.android.sdk.core.network;

import J6.r;
import com.adadapted.android.sdk.core.keyword.InterceptAdapter;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* loaded from: classes.dex */
public final class HttpInterceptAdapter implements InterceptAdapter {
    public static final int $stable = 8;
    private final String eventUrl;
    private final HttpConnector httpConnector;
    private final String initUrl;

    @f(c = "com.adadapted.android.sdk.core.network.HttpInterceptAdapter", f = "HttpInterceptAdapter.kt", l = {68, 69}, m = "retrieve")
    /* renamed from: com.adadapted.android.sdk.core.network.HttpInterceptAdapter$retrieve$1, reason: invalid class name */
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
            return HttpInterceptAdapter.this.retrieve(null, null, this);
        }
    }

    @f(c = "com.adadapted.android.sdk.core.network.HttpInterceptAdapter", f = "HttpInterceptAdapter.kt", l = {85}, m = "sendEvents")
    /* renamed from: com.adadapted.android.sdk.core.network.HttpInterceptAdapter$sendEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C10381 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10381(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpInterceptAdapter.this.sendEvents(null, null, this);
        }
    }

    public HttpInterceptAdapter(String str, String str2, HttpConnector httpConnector) {
        r.e(str, "initUrl");
        r.e(str2, "eventUrl");
        r.e(httpConnector, "httpConnector");
        this.initUrl = str;
        this.eventUrl = str2;
        this.httpConnector = httpConnector;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118 A[Catch: Exception -> 0x0037, TRY_ENTER, TryCatch #1 {Exception -> 0x0037, blocks: (B:13:0x0032, B:37:0x0118, B:38:0x011e, B:39:0x0125), top: B:50:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:13:0x0032, B:37:0x0118, B:38:0x011e, B:39:0x0125), top: B:50:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.adadapted.android.sdk.core.keyword.InterceptAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object retrieve(com.adadapted.android.sdk.core.session.Session r12, com.adadapted.android.sdk.core.keyword.InterceptAdapter.Listener r13, A6.d r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.network.HttpInterceptAdapter.retrieve(com.adadapted.android.sdk.core.session.Session, com.adadapted.android.sdk.core.keyword.InterceptAdapter$Listener, A6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.adadapted.android.sdk.core.keyword.InterceptAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object sendEvents(com.adadapted.android.sdk.core.session.Session r12, java.util.Set<com.adadapted.android.sdk.core.keyword.InterceptEvent> r13, A6.d r14) {
        /*
            r11 = this;
            java.lang.Class<com.adadapted.android.sdk.core.keyword.InterceptEventWrapper> r0 = com.adadapted.android.sdk.core.keyword.InterceptEventWrapper.class
            boolean r1 = r14 instanceof com.adadapted.android.sdk.core.network.HttpInterceptAdapter.C10381
            if (r1 == 0) goto L15
            r1 = r14
            com.adadapted.android.sdk.core.network.HttpInterceptAdapter$sendEvents$1 r1 = (com.adadapted.android.sdk.core.network.HttpInterceptAdapter.C10381) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.adadapted.android.sdk.core.network.HttpInterceptAdapter$sendEvents$1 r1 = new com.adadapted.android.sdk.core.network.HttpInterceptAdapter$sendEvents$1
            r1.<init>(r14)
        L1a:
            java.lang.Object r14 = r1.result
            java.lang.Object r2 = B6.b.e()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            java.lang.Object r12 = r1.L$0
            com.adadapted.android.sdk.core.network.HttpInterceptAdapter r12 = (com.adadapted.android.sdk.core.network.HttpInterceptAdapter) r12
            x6.q.b(r14)     // Catch: java.lang.Exception -> L30
            goto Ldc
        L30:
            r13 = move-exception
            goto Lb8
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            x6.q.b(r14)
            com.adadapted.android.sdk.core.keyword.InterceptEventWrapper r14 = new com.adadapted.android.sdk.core.keyword.InterceptEventWrapper
            java.lang.String r6 = r12.getId()
            com.adadapted.android.sdk.core.device.DeviceInfo r3 = r12.getDeviceInfo()
            java.lang.String r7 = r3.getAppId()
            com.adadapted.android.sdk.core.device.DeviceInfo r3 = r12.getDeviceInfo()
            java.lang.String r8 = r3.getUdid()
            com.adadapted.android.sdk.core.device.DeviceInfo r3 = r12.getDeviceInfo()
            java.lang.String r9 = r3.getSdkVersion()
            r5 = r14
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            com.adadapted.android.sdk.core.network.HttpConnector r13 = r11.httpConnector     // Catch: java.lang.Exception -> Lb6
            v5.a r13 = r13.getClient()     // Catch: java.lang.Exception -> Lb6
            java.lang.String r3 = r11.eventUrl     // Catch: java.lang.Exception -> Lb6
            E5.c r5 = new E5.c     // Catch: java.lang.Exception -> Lb6
            r5.<init>()     // Catch: java.lang.Exception -> Lb6
            E5.e.a(r5, r3)     // Catch: java.lang.Exception -> Lb6
            I5.b$a r3 = I5.C0628b.a.f3225a     // Catch: java.lang.Exception -> Lb6
            I5.b r3 = r3.a()     // Catch: java.lang.Exception -> Lb6
            I5.s.e(r5, r3)     // Catch: java.lang.Exception -> Lb6
            r5.j(r14)     // Catch: java.lang.Exception -> Lb6
            Q6.k r14 = J6.H.i(r0)     // Catch: java.lang.Exception -> Lb6
            java.lang.reflect.Type r3 = Q6.n.e(r14)     // Catch: java.lang.Exception -> Lb6
            Q6.b r0 = J6.H.b(r0)     // Catch: java.lang.Exception -> Lb6
            U5.a r14 = U5.b.b(r3, r0, r14)     // Catch: java.lang.Exception -> Lb6
            r5.k(r14)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r14 = "X-API-KEY"
            com.adadapted.android.sdk.core.device.DeviceInfo r12 = r12.getDeviceInfo()     // Catch: java.lang.Exception -> Lb6
            java.lang.String r12 = r12.getAppId()     // Catch: java.lang.Exception -> Lb6
            E5.j.b(r5, r14, r12)     // Catch: java.lang.Exception -> Lb6
            I5.t$a r12 = I5.t.f3376b     // Catch: java.lang.Exception -> Lb6
            I5.t r12 = r12.c()     // Catch: java.lang.Exception -> Lb6
            r5.n(r12)     // Catch: java.lang.Exception -> Lb6
            F5.g r12 = new F5.g     // Catch: java.lang.Exception -> Lb6
            r12.<init>(r5, r13)     // Catch: java.lang.Exception -> Lb6
            r1.L$0 = r11     // Catch: java.lang.Exception -> Lb6
            r1.label = r4     // Catch: java.lang.Exception -> Lb6
            java.lang.Object r12 = r12.c(r1)     // Catch: java.lang.Exception -> Lb6
            if (r12 != r2) goto Ldc
            return r2
        Lb6:
            r13 = move-exception
            r12 = r11
        Lb8:
            java.lang.String r14 = r13.getMessage()
            if (r14 == 0) goto Lc3
            com.adadapted.android.sdk.core.log.AALogger r0 = com.adadapted.android.sdk.core.log.AALogger.INSTANCE
            r0.logError(r14)
        Lc3:
            com.adadapted.android.sdk.core.network.HttpErrorTracker r14 = com.adadapted.android.sdk.core.network.HttpErrorTracker.INSTANCE
            java.lang.Throwable r0 = r13.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r1 = "KI_EVENT_REQUEST_FAILED"
            java.lang.String r12 = r12.eventUrl
            r14.trackHttpError(r0, r13, r1, r12)
        Ldc:
            x6.E r12 = x6.C6916E.f44463a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.network.HttpInterceptAdapter.sendEvents(com.adadapted.android.sdk.core.session.Session, java.util.Set, A6.d):java.lang.Object");
    }
}
