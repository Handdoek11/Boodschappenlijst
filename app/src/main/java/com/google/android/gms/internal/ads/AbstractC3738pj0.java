package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.pj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3738pj0 extends Gk0 implements com.google.common.util.concurrent.d {

    /* renamed from: u, reason: collision with root package name */
    static final boolean f25493u;

    /* renamed from: v, reason: collision with root package name */
    static final C3304lk0 f25494v;

    /* renamed from: w, reason: collision with root package name */
    private static final AbstractC2541ej0 f25495w;

    /* renamed from: x, reason: collision with root package name */
    private static final Object f25496x;

    /* renamed from: o, reason: collision with root package name */
    private volatile Object f25497o;

    /* renamed from: s, reason: collision with root package name */
    private volatile C2868hj0 f25498s;

    /* renamed from: t, reason: collision with root package name */
    private volatile C3629oj0 f25499t;

    static {
        boolean z7;
        Throwable th;
        Throwable th2;
        AbstractC2541ej0 c3193kj0;
        try {
            z7 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z7 = false;
        }
        f25493u = z7;
        f25494v = new C3304lk0(AbstractC3738pj0.class);
        AbstractC4282uj0 abstractC4282uj0 = null;
        try {
            c3193kj0 = new C3520nj0(abstractC4282uj0);
            th2 = null;
            th = null;
        } catch (Error | Exception e8) {
            try {
                th = null;
                th2 = e8;
                c3193kj0 = new C2976ij0(AtomicReferenceFieldUpdater.newUpdater(C3629oj0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C3629oj0.class, C3629oj0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3738pj0.class, C3629oj0.class, "t"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3738pj0.class, C2868hj0.class, "s"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3738pj0.class, Object.class, "o"));
            } catch (Error | Exception e9) {
                th = e9;
                th2 = e8;
                c3193kj0 = new C3193kj0(abstractC4282uj0);
            }
        }
        f25495w = c3193kj0;
        if (th != null) {
            C3304lk0 c3304lk0 = f25494v;
            Logger a8 = c3304lk0.a();
            Level level = Level.SEVERE;
            a8.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            c3304lk0.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f25496x = new Object();
    }

    protected AbstractC3738pj0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(AbstractC3738pj0 abstractC3738pj0, boolean z7) {
        C2868hj0 c2868hj0 = null;
        while (true) {
            for (C3629oj0 b8 = f25495w.b(abstractC3738pj0, C3629oj0.f25260c); b8 != null; b8 = b8.f25262b) {
                Thread thread = b8.f25261a;
                if (thread != null) {
                    b8.f25261a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z7) {
                abstractC3738pj0.t();
            }
            abstractC3738pj0.d();
            C2868hj0 c2868hj02 = c2868hj0;
            C2868hj0 a8 = f25495w.a(abstractC3738pj0, C2868hj0.f22598d);
            C2868hj0 c2868hj03 = c2868hj02;
            while (a8 != null) {
                C2868hj0 c2868hj04 = a8.f22601c;
                a8.f22601c = c2868hj03;
                c2868hj03 = a8;
                a8 = c2868hj04;
            }
            while (c2868hj03 != null) {
                c2868hj0 = c2868hj03.f22601c;
                Runnable runnable = c2868hj03.f22599a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC3084jj0) {
                    RunnableC3084jj0 runnableC3084jj0 = (RunnableC3084jj0) runnable2;
                    abstractC3738pj0 = runnableC3084jj0.f23341o;
                    if (abstractC3738pj0.f25497o == runnableC3084jj0) {
                        if (f25495w.f(abstractC3738pj0, runnableC3084jj0, i(runnableC3084jj0.f23342s))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c2868hj03.f22600b;
                    Objects.requireNonNull(executor);
                    B(runnable2, executor);
                }
                c2868hj03 = c2868hj0;
            }
            return;
            z7 = false;
        }
    }

    private static void B(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f25494v.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    private final void C(C3629oj0 c3629oj0) {
        c3629oj0.f25261a = null;
        while (true) {
            C3629oj0 c3629oj02 = this.f25499t;
            if (c3629oj02 != C3629oj0.f25260c) {
                C3629oj0 c3629oj03 = null;
                while (c3629oj02 != null) {
                    C3629oj0 c3629oj04 = c3629oj02.f25262b;
                    if (c3629oj02.f25261a != null) {
                        c3629oj03 = c3629oj02;
                    } else if (c3629oj03 != null) {
                        c3629oj03.f25262b = c3629oj04;
                        if (c3629oj03.f25261a == null) {
                            break;
                        }
                    } else if (!f25495w.g(this, c3629oj02, c3629oj04)) {
                        break;
                    }
                    c3629oj02 = c3629oj04;
                }
                return;
            }
            return;
        }
    }

    private static final Object b(Object obj) {
        if (obj instanceof C2650fj0) {
            Throwable th = ((C2650fj0) obj).f22105b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C2759gj0) {
            throw new ExecutionException(((C2759gj0) obj).f22425a);
        }
        if (obj == f25496x) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(com.google.common.util.concurrent.d dVar) {
        Throwable a8;
        if (dVar instanceof InterfaceC3302lj0) {
            Object obj = ((AbstractC3738pj0) dVar).f25497o;
            if (obj instanceof C2650fj0) {
                C2650fj0 c2650fj0 = (C2650fj0) obj;
                if (c2650fj0.f22104a) {
                    Throwable th = c2650fj0.f22105b;
                    obj = th != null ? new C2650fj0(false, th) : C2650fj0.f22103d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((dVar instanceof Gk0) && (a8 = ((Gk0) dVar).a()) != null) {
            return new C2759gj0(a8);
        }
        boolean isCancelled = dVar.isCancelled();
        if ((!f25493u) && isCancelled) {
            C2650fj0 c2650fj02 = C2650fj0.f22103d;
            Objects.requireNonNull(c2650fj02);
            return c2650fj02;
        }
        try {
            Object j8 = j(dVar);
            if (!isCancelled) {
                return j8 == null ? f25496x : j8;
            }
            return new C2650fj0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(dVar)));
        } catch (Error e8) {
            e = e8;
            return new C2759gj0(e);
        } catch (CancellationException e9) {
            return !isCancelled ? new C2759gj0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(dVar)), e9)) : new C2650fj0(false, e9);
        } catch (ExecutionException e10) {
            return isCancelled ? new C2650fj0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(dVar)), e10)) : new C2759gj0(e10.getCause());
        } catch (Exception e11) {
            e = e11;
            return new C2759gj0(e);
        }
    }

    private static Object j(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
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
        return obj;
    }

    private final void x(StringBuilder sb) {
        try {
            Object j8 = j(this);
            sb.append("SUCCESS, result=[");
            if (j8 == null) {
                sb.append("null");
            } else if (j8 == this) {
                sb.append("this future");
            } else {
                sb.append(j8.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(j8)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        } catch (Exception e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void y(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f25497o;
        if (obj instanceof RunnableC3084jj0) {
            sb.append(", setFuture=[");
            z(sb, ((RunnableC3084jj0) obj).f23342s);
            sb.append("]");
        } else {
            try {
                concat = AbstractC3187kg0.a(c());
            } catch (Exception | StackOverflowError e8) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e8.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            x(sb);
        }
    }

    private final void z(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e8) {
            e = e8;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e9) {
            e = e9;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    @Override // com.google.android.gms.internal.ads.Gk0
    protected final Throwable a() {
        if (!(this instanceof InterfaceC3302lj0)) {
            return null;
        }
        Object obj = this.f25497o;
        if (obj instanceof C2759gj0) {
            return ((C2759gj0) obj).f22425a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean cancel(boolean z7) {
        C2650fj0 c2650fj0;
        Object obj = this.f25497o;
        if (!(obj instanceof RunnableC3084jj0) && !(obj == null)) {
            return false;
        }
        if (f25493u) {
            c2650fj0 = new C2650fj0(z7, new CancellationException("Future.cancel() was called."));
        } else {
            c2650fj0 = z7 ? C2650fj0.f22102c : C2650fj0.f22103d;
            Objects.requireNonNull(c2650fj0);
        }
        AbstractC3738pj0 abstractC3738pj0 = this;
        boolean z8 = false;
        while (true) {
            if (f25495w.f(abstractC3738pj0, obj, c2650fj0)) {
                A(abstractC3738pj0, z7);
                if (!(obj instanceof RunnableC3084jj0)) {
                    break;
                }
                com.google.common.util.concurrent.d dVar = ((RunnableC3084jj0) obj).f23342s;
                if (!(dVar instanceof InterfaceC3302lj0)) {
                    dVar.cancel(z7);
                    break;
                }
                abstractC3738pj0 = (AbstractC3738pj0) dVar;
                obj = abstractC3738pj0.f25497o;
                if (!(obj == null) && !(obj instanceof RunnableC3084jj0)) {
                    break;
                }
                z8 = true;
            } else {
                obj = abstractC3738pj0.f25497o;
                if (!(obj instanceof RunnableC3084jj0)) {
                    return z8;
                }
            }
        }
        return true;
    }

    protected void d() {
    }

    protected boolean e(Object obj) {
        if (obj == null) {
            obj = f25496x;
        }
        if (!f25495w.f(this, null, obj)) {
            return false;
        }
        A(this, false);
        return true;
    }

    public void f(Runnable runnable, Executor executor) {
        C2868hj0 c2868hj0;
        AbstractC1762Sf0.c(runnable, "Runnable was null.");
        AbstractC1762Sf0.c(executor, "Executor was null.");
        if (!isDone() && (c2868hj0 = this.f25498s) != C2868hj0.f22598d) {
            C2868hj0 c2868hj02 = new C2868hj0(runnable, executor);
            do {
                c2868hj02.f22601c = c2868hj0;
                if (f25495w.e(this, c2868hj0, c2868hj02)) {
                    return;
                } else {
                    c2868hj0 = this.f25498s;
                }
            } while (c2868hj0 != C2868hj0.f22598d);
        }
        B(runnable, executor);
    }

    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f25497o;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC3084jj0))) {
            return b(obj2);
        }
        C3629oj0 c3629oj0 = this.f25499t;
        if (c3629oj0 != C3629oj0.f25260c) {
            C3629oj0 c3629oj02 = new C3629oj0();
            do {
                AbstractC2541ej0 abstractC2541ej0 = f25495w;
                abstractC2541ej0.c(c3629oj02, c3629oj0);
                if (abstractC2541ej0.g(this, c3629oj0, c3629oj02)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            C(c3629oj02);
                            throw new InterruptedException();
                        }
                        obj = this.f25497o;
                    } while (!((obj != null) & (!(obj instanceof RunnableC3084jj0))));
                    return b(obj);
                }
                c3629oj0 = this.f25499t;
            } while (c3629oj0 != C3629oj0.f25260c);
        }
        Object obj3 = this.f25497o;
        Objects.requireNonNull(obj3);
        return b(obj3);
    }

    protected boolean h(Throwable th) {
        th.getClass();
        if (!f25495w.f(this, null, new C2759gj0(th))) {
            return false;
        }
        A(this, false);
        return true;
    }

    public boolean isCancelled() {
        return this.f25497o instanceof C2650fj0;
    }

    public boolean isDone() {
        return (this.f25497o != null) & (!(r0 instanceof RunnableC3084jj0));
    }

    protected void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            x(sb);
        } else {
            y(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    final void u(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(w());
        }
    }

    protected final boolean v(com.google.common.util.concurrent.d dVar) {
        C2759gj0 c2759gj0;
        dVar.getClass();
        Object obj = this.f25497o;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!f25495w.f(this, null, i(dVar))) {
                    return false;
                }
                A(this, false);
                return true;
            }
            RunnableC3084jj0 runnableC3084jj0 = new RunnableC3084jj0(this, dVar);
            if (f25495w.f(this, null, runnableC3084jj0)) {
                try {
                    dVar.f(runnableC3084jj0, Pj0.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c2759gj0 = new C2759gj0(th);
                    } catch (Error | Exception unused) {
                        c2759gj0 = C2759gj0.f22424b;
                    }
                    f25495w.f(this, runnableC3084jj0, c2759gj0);
                }
                return true;
            }
            obj = this.f25497o;
        }
        if (obj instanceof C2650fj0) {
            dVar.cancel(((C2650fj0) obj).f22104a);
        }
        return false;
    }

    protected final boolean w() {
        Object obj = this.f25497o;
        return (obj instanceof C2650fj0) && ((C2650fj0) obj).f22104a;
    }

    public Object get(long j8, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j8);
        if (!Thread.interrupted()) {
            Object obj = this.f25497o;
            boolean z7 = true;
            if ((obj != null) & (!(obj instanceof RunnableC3084jj0))) {
                return b(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C3629oj0 c3629oj0 = this.f25499t;
                if (c3629oj0 != C3629oj0.f25260c) {
                    C3629oj0 c3629oj02 = new C3629oj0();
                    do {
                        AbstractC2541ej0 abstractC2541ej0 = f25495w;
                        abstractC2541ej0.c(c3629oj02, c3629oj0);
                        if (abstractC2541ej0.g(this, c3629oj0, c3629oj02)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f25497o;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC3084jj0))) {
                                        return b(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    C(c3629oj02);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            C(c3629oj02);
                        } else {
                            c3629oj0 = this.f25499t;
                        }
                    } while (c3629oj0 != C3629oj0.f25260c);
                }
                Object obj3 = this.f25497o;
                Objects.requireNonNull(obj3);
                return b(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f25497o;
                if ((obj4 != null) & (!(obj4 instanceof RunnableC3084jj0))) {
                    return b(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC3738pj0 = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
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
            throw new TimeoutException(str + " for " + abstractC3738pj0);
        }
        throw new InterruptedException();
    }
}
