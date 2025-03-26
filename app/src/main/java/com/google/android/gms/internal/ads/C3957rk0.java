package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.rk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3957rk0 extends Wj0 implements InterfaceScheduledFutureC3413mk0 {

    /* renamed from: s, reason: collision with root package name */
    private final ScheduledFuture f26216s;

    public C3957rk0(com.google.common.util.concurrent.d dVar, ScheduledFuture scheduledFuture) {
        super(dVar);
        this.f26216s = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        boolean cancel = h().cancel(z7);
        if (cancel) {
            this.f26216s.cancel(z7);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f26216s.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f26216s.getDelay(timeUnit);
    }
}
