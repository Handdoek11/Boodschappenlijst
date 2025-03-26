package com.adadapted.android.sdk.core.session;

import I6.a;
import J6.s;
import x6.C6916E;

/* loaded from: classes.dex */
final class SessionClient$startPollingTimer$refreshTimer$1 extends s implements a {
    public static final SessionClient$startPollingTimer$refreshTimer$1 INSTANCE = new SessionClient$startPollingTimer$refreshTimer$1();

    SessionClient$startPollingTimer$refreshTimer$1() {
        super(0);
    }

    @Override // I6.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m18invoke();
        return C6916E.f44463a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m18invoke() {
        SessionClient.performRefresh$default(SessionClient.INSTANCE, null, 1, null);
    }
}
