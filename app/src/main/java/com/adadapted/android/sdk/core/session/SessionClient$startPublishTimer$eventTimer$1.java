package com.adadapted.android.sdk.core.session;

import I6.a;
import J6.s;
import x6.C6916E;

/* loaded from: classes.dex */
final class SessionClient$startPublishTimer$eventTimer$1 extends s implements a {
    public static final SessionClient$startPublishTimer$eventTimer$1 INSTANCE = new SessionClient$startPublishTimer$eventTimer$1();

    SessionClient$startPublishTimer$eventTimer$1() {
        super(0);
    }

    @Override // I6.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m19invoke();
        return C6916E.f44463a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m19invoke() {
        SessionClient.INSTANCE.notifyPublishEvents();
    }
}
