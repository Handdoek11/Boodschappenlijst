package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.android.gms.internal.ads.kk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractRunnableC3195kk0 extends AtomicReference implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private static final Runnable f24081o = new RunnableC2978ik0(null);

    /* renamed from: s, reason: collision with root package name */
    private static final Runnable f24082s = new RunnableC2978ik0(null);

    AbstractRunnableC3195kk0() {
    }

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC2870hk0 runnableC2870hk0 = null;
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            if (!(runnable instanceof RunnableC2870hk0)) {
                if (runnable != f24082s) {
                    break;
                }
            } else {
                runnableC2870hk0 = (RunnableC2870hk0) runnable;
            }
            i8++;
            if (i8 > 1000) {
                Runnable runnable2 = f24082s;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z7 = Thread.interrupted() || z7;
                    LockSupport.park(runnableC2870hk0);
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

    abstract void d(Throwable th);

    abstract void e(Object obj);

    abstract boolean f();

    final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC2870hk0 runnableC2870hk0 = new RunnableC2870hk0(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, runnableC2870hk0)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f24081o)) == f24082s) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f24081o)) == f24082s) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

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
                        AbstractC4502wk0.a(th);
                        if (!compareAndSet(currentThread, f24081o)) {
                            c(currentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, f24081o)) {
                            c(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, f24081o)) {
                c(currentThread);
            }
            if (f8) {
                return;
            }
            e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f24081o) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC2870hk0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
