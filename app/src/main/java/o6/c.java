package o6;

import X2.D;
import d6.InterfaceC5732b;
import h6.AbstractC5843a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
final class c implements Callable, InterfaceC5732b {

    /* renamed from: w, reason: collision with root package name */
    static final FutureTask f39986w = new FutureTask(AbstractC5843a.f36263b, null);

    /* renamed from: o, reason: collision with root package name */
    final Runnable f39987o;

    /* renamed from: u, reason: collision with root package name */
    final ExecutorService f39990u;

    /* renamed from: v, reason: collision with root package name */
    Thread f39991v;

    /* renamed from: t, reason: collision with root package name */
    final AtomicReference f39989t = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    final AtomicReference f39988s = new AtomicReference();

    c(Runnable runnable, ExecutorService executorService) {
        this.f39987o = runnable;
        this.f39990u = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f39991v = Thread.currentThread();
        try {
            this.f39987o.run();
            d(this.f39990u.submit(this));
            this.f39991v = null;
        } catch (Throwable th) {
            this.f39991v = null;
            AbstractC6805a.m(th);
        }
        return null;
    }

    void b(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f39989t.get();
            if (future2 == f39986w) {
                future.cancel(this.f39991v != Thread.currentThread());
                return;
            }
        } while (!D.a(this.f39989t, future2, future));
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        AtomicReference atomicReference = this.f39989t;
        FutureTask futureTask = f39986w;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f39991v != Thread.currentThread());
        }
        Future future2 = (Future) this.f39988s.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f39991v != Thread.currentThread());
    }

    void d(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f39988s.get();
            if (future2 == f39986w) {
                future.cancel(this.f39991v != Thread.currentThread());
                return;
            }
        } while (!D.a(this.f39988s, future2, future));
    }
}
