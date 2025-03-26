package com.adadapted.android.sdk.core.session;

import A6.d;
import B6.b;
import I6.p;
import U6.M;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

@f(c = "com.adadapted.android.sdk.core.session.SessionClient$start$1$onDeviceInfoCollected$1", f = "SessionClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SessionClient$start$1$onDeviceInfoCollected$1 extends l implements p {
    final /* synthetic */ DeviceInfo $deviceInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionClient$start$1$onDeviceInfoCollected$1(DeviceInfo deviceInfo, d dVar) {
        super(2, dVar);
        this.$deviceInfo = deviceInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SessionClient$start$1$onDeviceInfoCollected$1(this.$deviceInfo, dVar);
    }

    @Override // I6.p
    public final Object invoke(M m8, d dVar) {
        return ((SessionClient$start$1$onDeviceInfoCollected$1) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.b(obj);
        SessionClient.INSTANCE.performInitialize(this.$deviceInfo);
        return C6916E.f44463a;
    }
}
