package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726Rf {

    /* renamed from: a, reason: collision with root package name */
    private MotionEvent f18681a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    private MotionEvent f18682b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f18683c;

    public C1726Rf(Context context, ScheduledExecutorService scheduledExecutorService, C1796Tf c1796Tf, RunnableC3464n90 runnableC3464n90) {
        this.f18683c = scheduledExecutorService;
    }

    public final com.google.common.util.concurrent.d a() {
        return (Sj0) AbstractC2326ck0.o(Sj0.D(AbstractC2326ck0.h(null)), ((Long) AbstractC3186kg.f24068c.e()).longValue(), TimeUnit.MILLISECONDS, this.f18683c);
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f18681a.getEventTime()) {
            this.f18681a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f18682b.getEventTime()) {
                return;
            }
            this.f18682b = MotionEvent.obtain(motionEvent);
        }
    }
}
