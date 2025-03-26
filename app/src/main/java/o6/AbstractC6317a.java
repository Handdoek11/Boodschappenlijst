package o6;

import d6.InterfaceC5732b;
import h6.AbstractC5843a;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC6317a extends AtomicReference implements InterfaceC5732b {

    /* renamed from: t, reason: collision with root package name */
    protected static final FutureTask f39968t;

    /* renamed from: u, reason: collision with root package name */
    protected static final FutureTask f39969u;

    /* renamed from: o, reason: collision with root package name */
    protected final Runnable f39970o;

    /* renamed from: s, reason: collision with root package name */
    protected Thread f39971s;

    static {
        Runnable runnable = AbstractC5843a.f36263b;
        f39968t = new FutureTask(runnable, null);
        f39969u = new FutureTask(runnable, null);
    }

    AbstractC6317a(Runnable runnable) {
        this.f39970o = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f39968t) {
                return;
            }
            if (future2 == f39969u) {
                future.cancel(this.f39971s != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // d6.InterfaceC5732b
    public final void c() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f39968t || future == (futureTask = f39969u) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f39971s != Thread.currentThread());
    }
}
