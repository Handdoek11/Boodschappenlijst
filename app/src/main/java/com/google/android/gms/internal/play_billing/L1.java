package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class L1 extends AbstractC5133j1 {

    /* renamed from: y, reason: collision with root package name */
    private InterfaceFutureC5225z1 f29782y;

    /* renamed from: z, reason: collision with root package name */
    private ScheduledFuture f29783z;

    private L1(InterfaceFutureC5225z1 interfaceFutureC5225z1) {
        this.f29782y = interfaceFutureC5225z1;
    }

    static InterfaceFutureC5225z1 C(InterfaceFutureC5225z1 interfaceFutureC5225z1, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        L1 l12 = new L1(interfaceFutureC5225z1);
        I1 i12 = new I1(l12);
        l12.f29783z = scheduledExecutorService.schedule(i12, 28500L, timeUnit);
        interfaceFutureC5225z1.g(i12, EnumC5127i1.INSTANCE);
        return l12;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5091c1
    protected final String i() {
        InterfaceFutureC5225z1 interfaceFutureC5225z1 = this.f29782y;
        ScheduledFuture scheduledFuture = this.f29783z;
        if (interfaceFutureC5225z1 == null) {
            return null;
        }
        String str = "inputFuture=[" + interfaceFutureC5225z1.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5091c1
    protected final void n() {
        InterfaceFutureC5225z1 interfaceFutureC5225z1 = this.f29782y;
        if ((interfaceFutureC5225z1 != null) & isCancelled()) {
            interfaceFutureC5225z1.cancel(r());
        }
        ScheduledFuture scheduledFuture = this.f29783z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f29782y = null;
        this.f29783z = null;
    }
}
