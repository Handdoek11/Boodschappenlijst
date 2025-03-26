package androidx.concurrent.futures;

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

/* loaded from: classes.dex */
public abstract class a implements com.google.common.util.concurrent.d {

    /* renamed from: u, reason: collision with root package name */
    static final boolean f8271u = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: v, reason: collision with root package name */
    private static final Logger f8272v = Logger.getLogger(a.class.getName());

    /* renamed from: w, reason: collision with root package name */
    static final b f8273w;

    /* renamed from: x, reason: collision with root package name */
    private static final Object f8274x;

    /* renamed from: o, reason: collision with root package name */
    volatile Object f8275o;

    /* renamed from: s, reason: collision with root package name */
    volatile e f8276s;

    /* renamed from: t, reason: collision with root package name */
    volatile h f8277t;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f8278c;

        /* renamed from: d, reason: collision with root package name */
        static final c f8279d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f8280a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f8281b;

        static {
            if (a.f8271u) {
                f8279d = null;
                f8278c = null;
            } else {
                f8279d = new c(false, null);
                f8278c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f8280a = z7;
            this.f8281b = th;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f8282b = new d(new C0148a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f8283a;

        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0148a extends Throwable {
            C0148a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f8283a = (Throwable) a.i(th);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f8284d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f8285a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f8286b;

        /* renamed from: c, reason: collision with root package name */
        e f8287c;

        e(Runnable runnable, Executor executor) {
            this.f8285a = runnable;
            this.f8286b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8288a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8289b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8290c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8291d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f8292e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f8288a = atomicReferenceFieldUpdater;
            this.f8289b = atomicReferenceFieldUpdater2;
            this.f8290c = atomicReferenceFieldUpdater3;
            this.f8291d = atomicReferenceFieldUpdater4;
            this.f8292e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f8291d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f8292e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f8290c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f8289b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f8288a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f8276s != eVar) {
                        return false;
                    }
                    aVar.f8276s = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f8275o != obj) {
                        return false;
                    }
                    aVar.f8275o = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f8277t != hVar) {
                        return false;
                    }
                    aVar.f8277t = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f8295b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f8294a = thread;
        }
    }

    private static final class h {

        /* renamed from: c, reason: collision with root package name */
        static final h f8293c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f8294a;

        /* renamed from: b, reason: collision with root package name */
        volatile h f8295b;

        h(boolean z7) {
        }

        void a(h hVar) {
            a.f8273w.d(this, hVar);
        }

        void b() {
            Thread thread = this.f8294a;
            if (thread != null) {
                this.f8294a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f8273w.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "t"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "s"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f8273w = gVar;
        if (th != null) {
            f8272v.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8274x = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        try {
            Object q8 = q(this);
            sb.append("SUCCESS, result=[");
            sb.append(x(q8));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    private static CancellationException h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object i(Object obj) {
        obj.getClass();
        return obj;
    }

    private e k(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f8276s;
        } while (!f8273w.a(this, eVar2, e.f8284d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f8287c;
            eVar4.f8287c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void l(a aVar) {
        aVar.t();
        aVar.c();
        e k8 = aVar.k(null);
        while (k8 != null) {
            e eVar = k8.f8287c;
            m(k8.f8285a, k8.f8286b);
            k8 = eVar;
        }
    }

    private static void m(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f8272v.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    private Object p(Object obj) {
        if (obj instanceof c) {
            throw h("Task was cancelled.", ((c) obj).f8281b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f8283a);
        }
        if (obj == f8274x) {
            return null;
        }
        return obj;
    }

    static Object q(Future future) {
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

    private void t() {
        h hVar;
        do {
            hVar = this.f8277t;
        } while (!f8273w.c(this, hVar, h.f8293c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f8295b;
        }
    }

    private void u(h hVar) {
        hVar.f8294a = null;
        while (true) {
            h hVar2 = this.f8277t;
            if (hVar2 == h.f8293c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f8295b;
                if (hVar2.f8294a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f8295b = hVar4;
                    if (hVar3.f8294a == null) {
                        break;
                    }
                } else if (!f8273w.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String x(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f8275o;
        if (obj == null) {
            if (f8273w.b(this, obj, f8271u ? new c(z7, new CancellationException("Future.cancel() was called.")) : z7 ? c.f8278c : c.f8279d)) {
                if (z7) {
                    r();
                }
                l(this);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.util.concurrent.d
    public final void f(Runnable runnable, Executor executor) {
        i(runnable);
        i(executor);
        e eVar = this.f8276s;
        if (eVar != e.f8284d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f8287c = eVar;
                if (f8273w.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f8276s;
                }
            } while (eVar != e.f8284d);
        }
        m(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8275o;
        if (obj != null) {
            return p(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f8277t;
            if (hVar != h.f8293c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f8273w.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                u(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8275o;
                            if (obj2 != null) {
                                return p(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        u(hVar2);
                    } else {
                        hVar = this.f8277t;
                    }
                } while (hVar != h.f8293c);
            }
            return p(this.f8275o);
        }
        while (nanos > 0) {
            Object obj3 = this.f8275o;
            if (obj3 != null) {
                return p(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j8 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j9 = -nanos;
            long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(convert);
            boolean z7 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z7) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z7) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8275o instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8275o != null;
    }

    protected void r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String s() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = s();
            } catch (RuntimeException e8) {
                str = "Exception thrown from implementation: " + e8.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected boolean v(Object obj) {
        if (obj == null) {
            obj = f8274x;
        }
        if (!f8273w.b(this, null, obj)) {
            return false;
        }
        l(this);
        return true;
    }

    protected boolean w(Throwable th) {
        if (!f8273w.b(this, null, new d((Throwable) i(th)))) {
            return false;
        }
        l(this);
        return true;
    }

    protected final boolean y() {
        Object obj = this.f8275o;
        return (obj instanceof c) && ((c) obj).f8280a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8275o;
            if (obj2 != null) {
                return p(obj2);
            }
            h hVar = this.f8277t;
            if (hVar != h.f8293c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f8273w.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8275o;
                            } else {
                                u(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return p(obj);
                    }
                    hVar = this.f8277t;
                } while (hVar != h.f8293c);
            }
            return p(this.f8275o);
        }
        throw new InterruptedException();
    }
}
