package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.android.gms.internal.play_billing.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC5215x1 extends AtomicReference implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private static final Runnable f30025o = new RunnableC5204v1(null);

    /* renamed from: s, reason: collision with root package name */
    private static final Runnable f30026s = new RunnableC5204v1(null);

    AbstractRunnableC5215x1() {
    }

    private final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC5198u1 runnableC5198u1 = null;
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            if (!(runnable instanceof RunnableC5198u1)) {
                if (runnable != f30026s) {
                    break;
                }
            } else {
                runnableC5198u1 = (RunnableC5198u1) runnable;
            }
            i8++;
            if (i8 > 1000) {
                Runnable runnable2 = f30026s;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z7 = Thread.interrupted() || z7;
                    LockSupport.park(runnableC5198u1);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z7) {
            thread.interrupt();
        }
    }

    abstract Object a();

    abstract String b();

    abstract void c(Throwable th);

    abstract void d(Object obj);

    final void e() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC5198u1 runnableC5198u1 = new RunnableC5198u1(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, runnableC5198u1)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f30025o)) == f30026s) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f30025o)) == f30026s) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    abstract boolean f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean f8 = f();
            if (!f8) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, f30025o)) {
                            g(currentThread);
                        }
                        c(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, f30025o)) {
                            g(currentThread);
                        }
                        d(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, f30025o)) {
                g(currentThread);
            }
            if (f8) {
                return;
            }
            d(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f30025o) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC5198u1) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
