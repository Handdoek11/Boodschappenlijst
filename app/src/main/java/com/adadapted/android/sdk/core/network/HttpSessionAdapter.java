package com.adadapted.android.sdk.core.network;

import J6.r;
import com.adadapted.android.sdk.core.interfaces.SessionAdapter;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* loaded from: classes.dex */
public final class HttpSessionAdapter implements SessionAdapter {
    public static final int $stable = 8;
    private final HttpConnector httpConnector;
    private final String initUrl;
    private final String refreshUrl;

    @f(c = "com.adadapted.android.sdk.core.network.HttpSessionAdapter", f = "HttpSessionAdapter.kt", l = {101, 102}, m = "sendInit")
    /* renamed from: com.adadapted.android.sdk.core.network.HttpSessionAdapter$sendInit$1, reason: invalid class name */
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpSessionAdapter.this.sendInit(null, null, this);
        }
    }

    @f(c = "com.adadapted.android.sdk.core.network.HttpSessionAdapter", f = "HttpSessionAdapter.kt", l = {84, 85}, m = "sendRefreshAds")
    /* renamed from: com.adadapted.android.sdk.core.network.HttpSessionAdapter$sendRefreshAds$1, reason: invalid class name and case insensitive filesystem */
    static final class C10401 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C10401(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpSessionAdapter.this.sendRefreshAds(null, null, null, this);
        }
    }

    public HttpSessionAdapter(String str, String str2, HttpConnector httpConnector) {
        r.e(str, "initUrl");
        r.e(str2, "refreshUrl");
        r.e(httpConnector, "httpConnector");
        this.initUrl = str;
        this.refreshUrl = str2;
        this.httpConnector = httpConnector;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106 A[Catch: Exception -> 0x003f, TRY_ENTER, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:41:0x0106, B:42:0x010f, B:43:0x0116), top: B:50:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:41:0x0106, B:42:0x010f, B:43:0x0116), top: B:50:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.adadapted.android.sdk.core.interfaces.SessionAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object sendInit(com.adadapted.android.sdk.core.device.DeviceInfo r10, com.adadapted.android.sdk.core.interfaces.SessionInitListener r11, A6.d r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.network.HttpSessionAdapter.sendInit(com.adadapted.android.sdk.core.device.DeviceInfo, com.adadapted.android.sdk.core.interfaces.SessionInitListener, A6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163 A[Catch: Exception -> 0x0043, TRY_ENTER, TryCatch #4 {Exception -> 0x0043, blocks: (B:13:0x003e, B:45:0x0163, B:46:0x0170, B:47:0x0177), top: B:66:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0170 A[Catch: Exception -> 0x0043, TryCatch #4 {Exception -> 0x0043, blocks: (B:13:0x003e, B:45:0x0163, B:46:0x0170, B:47:0x0177), top: B:66:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.adadapted.android.sdk.core.interfaces.SessionAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object sendRefreshAds(com.adadapted.android.sdk.core.session.Session r20, com.adadapted.android.sdk.core.interfaces.AdGetListener r21, java.util.Set<com.adadapted.android.sdk.core.view.ZoneContext> r22, A6.d r23) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.network.HttpSessionAdapter.sendRefreshAds(com.adadapted.android.sdk.core.session.Session, com.adadapted.android.sdk.core.interfaces.AdGetListener, java.util.Set, A6.d):java.lang.Object");
    }
}
