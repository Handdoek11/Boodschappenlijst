package com.google.android.gms.measurement.internal;

import android.content.Context;
import f3.InterfaceC5781e;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class P2 extends AbstractC5462z3 {

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicLong f30640l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private T2 f30641c;

    /* renamed from: d, reason: collision with root package name */
    private T2 f30642d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f30643e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f30644f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f30645g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f30646h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f30647i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f30648j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f30649k;

    P2(S2 s22) {
        super(s22);
        this.f30647i = new Object();
        this.f30648j = new Semaphore(2);
        this.f30643e = new PriorityBlockingQueue();
        this.f30644f = new LinkedBlockingQueue();
        this.f30645g = new R2(this, "Thread death: Uncaught exception on worker thread");
        this.f30646h = new R2(this, "Thread death: Uncaught exception on network thread");
    }

    private final void w(Q2 q22) {
        synchronized (this.f30647i) {
            try {
                this.f30643e.add(q22);
                T2 t22 = this.f30641c;
                if (t22 == null) {
                    T2 t23 = new T2(this, "Measurement Worker", this.f30643e);
                    this.f30641c = t23;
                    t23.setUncaughtExceptionHandler(this.f30645g);
                    this.f30641c.start();
                } else {
                    t22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(Runnable runnable) {
        n();
        Z2.r.l(runnable);
        w(new Q2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void E(Runnable runnable) {
        n();
        Z2.r.l(runnable);
        w(new Q2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean H() {
        return Thread.currentThread() == this.f30641c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final void i() {
        if (Thread.currentThread() != this.f30642d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final void l() {
        if (Thread.currentThread() != this.f30641c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5462z3
    protected final boolean r() {
        return false;
    }

    final Object t(AtomicReference atomicReference, long j8, String str, Runnable runnable) {
        synchronized (atomicReference) {
            j().B(runnable);
            try {
                atomicReference.wait(j8);
            } catch (InterruptedException unused) {
                h().J().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            h().J().a("Timed out waiting for " + str);
        }
        return obj;
    }

    public final Future u(Callable callable) {
        n();
        Z2.r.l(callable);
        Q2 q22 = new Q2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f30641c) {
            if (!this.f30643e.isEmpty()) {
                h().J().a("Callable skipped the worker queue.");
            }
            q22.run();
        } else {
            w(q22);
        }
        return q22;
    }

    public final void x(Runnable runnable) {
        n();
        Z2.r.l(runnable);
        Q2 q22 = new Q2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f30647i) {
            try {
                this.f30644f.add(q22);
                T2 t22 = this.f30642d;
                if (t22 == null) {
                    T2 t23 = new T2(this, "Measurement Network", this.f30644f);
                    this.f30642d = t23;
                    t23.setUncaughtExceptionHandler(this.f30646h);
                    this.f30642d.start();
                } else {
                    t22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future z(Callable callable) {
        n();
        Z2.r.l(callable);
        Q2 q22 = new Q2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f30641c) {
            q22.run();
        } else {
            w(q22);
        }
        return q22;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
