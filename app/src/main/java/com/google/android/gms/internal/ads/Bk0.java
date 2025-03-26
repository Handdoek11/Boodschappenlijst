package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class Bk0 extends Rj0 {

    /* renamed from: y, reason: collision with root package name */
    private com.google.common.util.concurrent.d f13850y;

    /* renamed from: z, reason: collision with root package name */
    private ScheduledFuture f13851z;

    private Bk0(com.google.common.util.concurrent.d dVar) {
        dVar.getClass();
        this.f13850y = dVar;
    }

    static com.google.common.util.concurrent.d F(com.google.common.util.concurrent.d dVar, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        Bk0 bk0 = new Bk0(dVar);
        RunnableC4720yk0 runnableC4720yk0 = new RunnableC4720yk0(bk0);
        bk0.f13851z = scheduledExecutorService.schedule(runnableC4720yk0, j8, timeUnit);
        dVar.f(runnableC4720yk0, Pj0.INSTANCE);
        return bk0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final String c() {
        com.google.common.util.concurrent.d dVar = this.f13850y;
        ScheduledFuture scheduledFuture = this.f13851z;
        if (dVar == null) {
            return null;
        }
        String str = "inputFuture=[" + dVar.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final void d() {
        u(this.f13850y);
        ScheduledFuture scheduledFuture = this.f13851z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f13850y = null;
        this.f13851z = null;
    }
}
