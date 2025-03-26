package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class P4 implements InterfaceFutureC5225z1 {

    /* renamed from: u, reason: collision with root package name */
    static final boolean f29798u = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: v, reason: collision with root package name */
    private static final Logger f29799v = Logger.getLogger(P4.class.getName());

    /* renamed from: w, reason: collision with root package name */
    static final F1 f29800w;

    /* renamed from: x, reason: collision with root package name */
    private static final Object f29801x;

    /* renamed from: o, reason: collision with root package name */
    volatile Object f29802o;

    /* renamed from: s, reason: collision with root package name */
    volatile C5206v3 f29803s;

    /* renamed from: t, reason: collision with root package name */
    volatile N4 f29804t;

    static {
        F1 m42;
        try {
            m42 = new C5160n4(AtomicReferenceFieldUpdater.newUpdater(N4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(N4.class, N4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(P4.class, N4.class, "t"), AtomicReferenceFieldUpdater.newUpdater(P4.class, C5206v3.class, "s"), AtomicReferenceFieldUpdater.newUpdater(P4.class, Object.class, "o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            m42 = new M4();
        }
        Throwable th2 = th;
        f29800w = m42;
        if (th2 != null) {
            f29799v.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f29801x = new Object();
    }

    protected P4() {
    }

    static void b(P4 p42) {
        N4 n42;
        C5206v3 c5206v3;
        C5206v3 c5206v32;
        C5206v3 c5206v33;
        do {
            n42 = p42.f29804t;
        } while (!f29800w.e(p42, n42, N4.f29794c));
        while (true) {
            c5206v3 = null;
            if (n42 == null) {
                break;
            }
            Thread thread = n42.f29795a;
            if (thread != null) {
                n42.f29795a = null;
                LockSupport.unpark(thread);
            }
            n42 = n42.f29796b;
        }
        do {
            c5206v32 = p42.f29803s;
        } while (!f29800w.c(p42, c5206v32, C5206v3.f30018d));
        while (true) {
            c5206v33 = c5206v3;
            c5206v3 = c5206v32;
            if (c5206v3 == null) {
                break;
            }
            c5206v32 = c5206v3.f30021c;
            c5206v3.f30021c = c5206v33;
        }
        while (c5206v33 != null) {
            Runnable runnable = c5206v33.f30019a;
            C5206v3 c5206v34 = c5206v33.f30021c;
            e(runnable, c5206v33.f30020b);
            c5206v33 = c5206v34;
        }
    }

    private final void d(StringBuilder sb) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e8) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e8.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e9) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e9.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    private static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f29799v.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    private final void h(N4 n42) {
        n42.f29795a = null;
        while (true) {
            N4 n43 = this.f29804t;
            if (n43 != N4.f29794c) {
                N4 n44 = null;
                while (n43 != null) {
                    N4 n45 = n43.f29796b;
                    if (n43.f29795a != null) {
                        n44 = n43;
                    } else if (n44 != null) {
                        n44.f29796b = n45;
                        if (n44.f29795a == null) {
                            break;
                        }
                    } else if (!f29800w.e(this, n43, n45)) {
                        break;
                    }
                    n43 = n45;
                }
                return;
            }
            return;
        }
    }

    private static final Object i(Object obj) {
        if (obj instanceof C5110f2) {
            Throwable th = ((C5110f2) obj).f29903a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof V2) {
            throw new ExecutionException(((V2) obj).f29848a);
        }
        if (obj == f29801x) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean c(Object obj) {
        if (obj == null) {
            obj = f29801x;
        }
        if (!f29800w.d(this, null, obj)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f29802o;
        if (obj == null) {
            if (f29800w.d(this, obj, f29798u ? new C5110f2(z7, new CancellationException("Future.cancel() was called.")) : z7 ? C5110f2.f29901b : C5110f2.f29902c)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC5225z1
    public final void g(Runnable runnable, Executor executor) {
        executor.getClass();
        C5206v3 c5206v3 = this.f29803s;
        if (c5206v3 != C5206v3.f30018d) {
            C5206v3 c5206v32 = new C5206v3(runnable, executor);
            do {
                c5206v32.f30021c = c5206v3;
                if (f29800w.c(this, c5206v3, c5206v32)) {
                    return;
                } else {
                    c5206v3 = this.f29803s;
                }
            } while (c5206v3 != C5206v3.f30018d);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f29802o;
        if (obj2 != null) {
            return i(obj2);
        }
        N4 n42 = this.f29804t;
        if (n42 != N4.f29794c) {
            N4 n43 = new N4();
            do {
                F1 f12 = f29800w;
                f12.a(n43, n42);
                if (f12.e(this, n42, n43)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(n43);
                            throw new InterruptedException();
                        }
                        obj = this.f29802o;
                    } while (!(obj != null));
                    return i(obj);
                }
                n42 = this.f29804t;
            } while (n42 != N4.f29794c);
        }
        return i(this.f29802o);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f29802o instanceof C5110f2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f29802o != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f29802o instanceof C5110f2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                concat = a();
            } catch (RuntimeException e8) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e8.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j8);
        if (!Thread.interrupted()) {
            Object obj = this.f29802o;
            boolean z7 = true;
            if (obj != null) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                N4 n42 = this.f29804t;
                if (n42 != N4.f29794c) {
                    N4 n43 = new N4();
                    do {
                        F1 f12 = f29800w;
                        f12.a(n43, n42);
                        if (f12.e(this, n42, n43)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f29802o;
                                    if (obj2 != null) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    h(n43);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(n43);
                        } else {
                            n42 = this.f29804t;
                        }
                    } while (n42 != N4.f29794c);
                }
                return i(this.f29802o);
            }
            while (nanos > 0) {
                Object obj3 = this.f29802o;
                if (obj3 != null) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String p42 = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j8 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j9 = -nanos;
                long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
                long nanos2 = j9 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z7 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z7) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z7) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + p42);
        }
        throw new InterruptedException();
    }
}
