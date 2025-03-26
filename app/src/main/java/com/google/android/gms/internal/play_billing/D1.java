package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class D1 extends AbstractC5151m1 implements ScheduledFuture, InterfaceFutureC5225z1 {

    /* renamed from: s, reason: collision with root package name */
    private final ScheduledFuture f29687s;

    public D1(InterfaceFutureC5225z1 interfaceFutureC5225z1, ScheduledFuture scheduledFuture) {
        super(interfaceFutureC5225z1);
        this.f29687s = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        boolean cancel = c().cancel(z7);
        if (cancel) {
            this.f29687s.cancel(z7);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f29687s.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f29687s.getDelay(timeUnit);
    }
}
