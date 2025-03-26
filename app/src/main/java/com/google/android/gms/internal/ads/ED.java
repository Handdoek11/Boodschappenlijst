package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ED extends AbstractC2714gF {

    /* renamed from: A, reason: collision with root package name */
    private ScheduledFuture f14682A;

    /* renamed from: s, reason: collision with root package name */
    private final ScheduledExecutorService f14683s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC5781e f14684t;

    /* renamed from: u, reason: collision with root package name */
    private long f14685u;

    /* renamed from: v, reason: collision with root package name */
    private long f14686v;

    /* renamed from: w, reason: collision with root package name */
    private long f14687w;

    /* renamed from: x, reason: collision with root package name */
    private long f14688x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f14689y;

    /* renamed from: z, reason: collision with root package name */
    private ScheduledFuture f14690z;

    public ED(ScheduledExecutorService scheduledExecutorService, InterfaceC5781e interfaceC5781e) {
        super(Collections.emptySet());
        this.f14685u = -1L;
        this.f14686v = -1L;
        this.f14687w = -1L;
        this.f14688x = -1L;
        this.f14689y = false;
        this.f14683s = scheduledExecutorService;
        this.f14684t = interfaceC5781e;
    }

    private final synchronized void q1(long j8) {
        try {
            ScheduledFuture scheduledFuture = this.f14690z;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f14690z.cancel(false);
            }
            this.f14685u = this.f14684t.b() + j8;
            this.f14690z = this.f14683s.schedule(new BD(this, null), j8, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void r1(long j8) {
        try {
            ScheduledFuture scheduledFuture = this.f14682A;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f14682A.cancel(false);
            }
            this.f14686v = this.f14684t.b() + j8;
            this.f14682A = this.f14683s.schedule(new CD(this, null), j8, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.f14689y) {
                if (this.f14687w > 0 && (scheduledFuture2 = this.f14690z) != null && scheduledFuture2.isCancelled()) {
                    q1(this.f14687w);
                }
                if (this.f14688x > 0 && (scheduledFuture = this.f14682A) != null && scheduledFuture.isCancelled()) {
                    r1(this.f14688x);
                }
                this.f14689y = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m1(int i8) {
        if (i8 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i8);
            if (this.f14689y) {
                long j8 = this.f14687w;
                if (j8 <= 0 || millis >= j8) {
                    millis = j8;
                }
                this.f14687w = millis;
                return;
            }
            long b8 = this.f14684t.b();
            long j9 = this.f14685u;
            if (b8 > j9 || j9 - b8 > millis) {
                q1(millis);
            }
        }
    }

    public final synchronized void p1(int i8) {
        if (i8 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i8);
            if (this.f14689y) {
                long j8 = this.f14688x;
                if (j8 <= 0 || millis >= j8) {
                    millis = j8;
                }
                this.f14688x = millis;
                return;
            }
            long b8 = this.f14684t.b();
            long j9 = this.f14686v;
            if (b8 > j9 || j9 - b8 > millis) {
                r1(millis);
            }
        }
    }

    public final synchronized void zza() {
        this.f14689y = false;
        q1(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.f14689y) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f14690z;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f14687w = -1L;
            } else {
                this.f14690z.cancel(false);
                this.f14687w = this.f14685u - this.f14684t.b();
            }
            ScheduledFuture scheduledFuture2 = this.f14682A;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.f14688x = -1L;
            } else {
                this.f14682A.cancel(false);
                this.f14688x = this.f14686v - this.f14684t.b();
            }
            this.f14689y = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
