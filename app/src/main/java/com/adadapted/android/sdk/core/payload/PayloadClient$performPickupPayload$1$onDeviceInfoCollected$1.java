package com.adadapted.android.sdk.core.payload;

import A6.d;
import B6.b;
import I6.p;
import J6.r;
import J6.s;
import U6.M;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

@f(c = "com.adadapted.android.sdk.core.payload.PayloadClient$performPickupPayload$1$onDeviceInfoCollected$1", f = "PayloadClient.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PayloadClient$performPickupPayload$1$onDeviceInfoCollected$1 extends l implements p {
    final /* synthetic */ I6.l $callback;
    final /* synthetic */ DeviceInfo $deviceInfo;
    int label;

    /* renamed from: com.adadapted.android.sdk.core.payload.PayloadClient$performPickupPayload$1$onDeviceInfoCollected$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements I6.l {
        final /* synthetic */ I6.l $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(I6.l lVar) {
            super(1);
            this.$callback = lVar;
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<AdditContent>) obj);
            return C6916E.f44463a;
        }

        public final void invoke(List<AdditContent> list) {
            r.e(list, "it");
            this.$callback.invoke(list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayloadClient$performPickupPayload$1$onDeviceInfoCollected$1(DeviceInfo deviceInfo, I6.l lVar, d dVar) {
        super(2, dVar);
        this.$deviceInfo = deviceInfo;
        this.$callback = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new PayloadClient$performPickupPayload$1$onDeviceInfoCollected$1(this.$deviceInfo, this.$callback, dVar);
    }

    @Override // I6.p
    public final Object invoke(M m8, d dVar) {
        return ((PayloadClient$performPickupPayload$1$onDeviceInfoCollected$1) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 == 0) {
            q.b(obj);
            PayloadAdapter payloadAdapter = PayloadClient.adapter;
            if (payloadAdapter != null) {
                DeviceInfo deviceInfo = this.$deviceInfo;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback);
                this.label = 1;
                if (payloadAdapter.pickup(deviceInfo, anonymousClass1, this) == e8) {
                    return e8;
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
