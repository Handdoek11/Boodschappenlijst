package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ay, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2136ay implements InterfaceC1718Rb {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f20789a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5781e f20790b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture f20791c;

    /* renamed from: d, reason: collision with root package name */
    private long f20792d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f20793e = -1;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f20794f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20795g = false;

    public C2136ay(ScheduledExecutorService scheduledExecutorService, InterfaceC5781e interfaceC5781e) {
        this.f20789a = scheduledExecutorService;
        this.f20790b = interfaceC5781e;
        C2.v.e().c(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1718Rb
    public final void B(boolean z7) {
        if (z7) {
            b();
        } else {
            a();
        }
    }

    final synchronized void a() {
        try {
            if (this.f20795g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f20791c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f20793e = -1L;
            } else {
                this.f20791c.cancel(true);
                this.f20793e = this.f20792d - this.f20790b.b();
            }
            this.f20795g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void b() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.f20795g) {
                if (this.f20793e > 0 && (scheduledFuture = this.f20791c) != null && scheduledFuture.isCancelled()) {
                    this.f20791c = this.f20789a.schedule(this.f20794f, this.f20793e, TimeUnit.MILLISECONDS);
                }
                this.f20795g = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(int i8, Runnable runnable) {
        this.f20794f = runnable;
        long j8 = i8;
        this.f20792d = this.f20790b.b() + j8;
        this.f20791c = this.f20789a.schedule(runnable, j8, TimeUnit.MILLISECONDS);
    }
}
