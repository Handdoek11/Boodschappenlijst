package o6;

import d6.InterfaceC5732b;
import g6.InterfaceC5813a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class j extends AtomicReferenceArray implements Runnable, Callable, InterfaceC5732b {

    /* renamed from: s, reason: collision with root package name */
    static final Object f40019s = new Object();

    /* renamed from: t, reason: collision with root package name */
    static final Object f40020t = new Object();

    /* renamed from: u, reason: collision with root package name */
    static final Object f40021u = new Object();

    /* renamed from: v, reason: collision with root package name */
    static final Object f40022v = new Object();

    /* renamed from: o, reason: collision with root package name */
    final Runnable f40023o;

    public j(Runnable runnable, InterfaceC5813a interfaceC5813a) {
        super(3);
        this.f40023o = runnable;
        lazySet(0, interfaceC5813a);
    }

    public void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f40022v) {
                return;
            }
            if (obj == f40020t) {
                future.cancel(false);
                return;
            } else if (obj == f40021u) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f40022v || obj5 == (obj3 = f40020t) || obj5 == (obj4 = f40021u)) {
                break;
            }
            boolean z7 = get(2) != Thread.currentThread();
            if (z7) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z7);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f40022v || obj == (obj2 = f40019s) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC5813a) obj).d(this);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f40023o.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f40019s) {
                    ((InterfaceC5813a) obj4).d(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f40020t) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, f40022v));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f40019s && compareAndSet(0, obj4, f40022v) && obj4 != null) {
            ((InterfaceC5813a) obj4).d(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f40020t || obj5 == f40021u) {
                return;
            }
        } while (!compareAndSet(1, obj5, f40022v));
    }
}
