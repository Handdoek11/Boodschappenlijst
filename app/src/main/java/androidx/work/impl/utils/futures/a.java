package androidx.work.impl.utils.futures;

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
    static final boolean f11927u = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: v, reason: collision with root package name */
    private static final Logger f11928v = Logger.getLogger(a.class.getName());

    /* renamed from: w, reason: collision with root package name */
    static final b f11929w;

    /* renamed from: x, reason: collision with root package name */
    private static final Object f11930x;

    /* renamed from: o, reason: collision with root package name */
    volatile Object f11931o;

    /* renamed from: s, reason: collision with root package name */
    volatile e f11932s;

    /* renamed from: t, reason: collision with root package name */
    volatile i f11933t;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f11934c;

        /* renamed from: d, reason: collision with root package name */
        static final c f11935d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f11936a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f11937b;

        static {
            if (a.f11927u) {
                f11935d = null;
                f11934c = null;
            } else {
                f11935d = new c(false, null);
                f11934c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f11936a = z7;
            this.f11937b = th;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f11938b = new d(new C0200a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f11939a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0200a extends Throwable {
            C0200a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f11939a = (Throwable) a.d(th);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f11940d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f11941a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f11942b;

        /* renamed from: c, reason: collision with root package name */
        e f11943c;

        e(Runnable runnable, Executor executor) {
            this.f11941a = runnable;
            this.f11942b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11944a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11945b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11946c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11947d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f11948e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f11944a = atomicReferenceFieldUpdater;
            this.f11945b = atomicReferenceFieldUpdater2;
            this.f11946c = atomicReferenceFieldUpdater3;
            this.f11947d = atomicReferenceFieldUpdater4;
            this.f11948e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f11947d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f11948e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f11946c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f11945b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f11944a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final a f11949o;

        /* renamed from: s, reason: collision with root package name */
        final com.google.common.util.concurrent.d f11950s;

        g(a aVar, com.google.common.util.concurrent.d dVar) {
            this.f11949o = aVar;
            this.f11950s = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11949o.f11931o != this) {
                return;
            }
            if (a.f11929w.b(this.f11949o, this, a.k(this.f11950s))) {
                a.h(this.f11949o);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11932s != eVar) {
                        return false;
                    }
                    aVar.f11932s = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11931o != obj) {
                        return false;
                    }
                    aVar.f11931o = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11933t != iVar) {
                        return false;
                    }
                    aVar.f11933t = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f11953b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f11952a = thread;
        }
    }

    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f11951c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f11952a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f11953b;

        i(boolean z7) {
        }

        void a(i iVar) {
            a.f11929w.d(this, iVar);
        }

        void b() {
            Thread thread = this.f11952a;
            if (thread != null) {
                this.f11952a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f11929w.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "t"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "s"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f11929w = hVar;
        if (th != null) {
            f11928v.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f11930x = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        try {
            Object l8 = l(this);
            sb.append("SUCCESS, result=[");
            sb.append(t(l8));
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

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f11932s;
        } while (!f11929w.a(this, eVar2, e.f11940d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f11943c;
            eVar4.f11943c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void h(a aVar) {
        e eVar = null;
        while (true) {
            aVar.o();
            aVar.b();
            e e8 = aVar.e(eVar);
            while (e8 != null) {
                eVar = e8.f11943c;
                Runnable runnable = e8.f11941a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f11949o;
                    if (aVar.f11931o == gVar) {
                        if (f11929w.b(aVar, gVar, k(gVar.f11950s))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i(runnable, e8.f11942b);
                }
                e8 = eVar;
            }
            return;
        }
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f11928v.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    private Object j(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f11937b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f11939a);
        }
        if (obj == f11930x) {
            return null;
        }
        return obj;
    }

    static Object k(com.google.common.util.concurrent.d dVar) {
        if (dVar instanceof a) {
            Object obj = ((a) dVar).f11931o;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f11936a ? cVar.f11937b != null ? new c(false, cVar.f11937b) : c.f11935d : obj;
        }
        boolean isCancelled = dVar.isCancelled();
        if ((!f11927u) && isCancelled) {
            return c.f11935d;
        }
        try {
            Object l8 = l(dVar);
            return l8 == null ? f11930x : l8;
        } catch (CancellationException e8) {
            if (isCancelled) {
                return new c(false, e8);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e8));
        } catch (ExecutionException e9) {
            return new d(e9.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object l(Future future) {
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

    private void o() {
        i iVar;
        do {
            iVar = this.f11933t;
        } while (!f11929w.c(this, iVar, i.f11951c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f11953b;
        }
    }

    private void p(i iVar) {
        iVar.f11952a = null;
        while (true) {
            i iVar2 = this.f11933t;
            if (iVar2 == i.f11951c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f11953b;
                if (iVar2.f11952a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f11953b = iVar4;
                    if (iVar3.f11952a == null) {
                        break;
                    }
                } else if (!f11929w.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f11931o;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f11927u ? new c(z7, new CancellationException("Future.cancel() was called.")) : z7 ? c.f11934c : c.f11935d;
        a aVar = this;
        boolean z8 = false;
        while (true) {
            if (f11929w.b(aVar, obj, cVar)) {
                if (z7) {
                    aVar.m();
                }
                h(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.d dVar = ((g) obj).f11950s;
                if (!(dVar instanceof a)) {
                    dVar.cancel(z7);
                    return true;
                }
                aVar = (a) dVar;
                obj = aVar.f11931o;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z8 = true;
            } else {
                obj = aVar.f11931o;
                if (!(obj instanceof g)) {
                    return z8;
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.d
    public final void f(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f11932s;
        if (eVar != e.f11940d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f11943c = eVar;
                if (f11929w.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f11932s;
                }
            } while (eVar != e.f11940d);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f11931o;
        if ((obj != null) && (!(obj instanceof g))) {
            return j(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f11933t;
            if (iVar != i.f11951c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f11929w.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11931o;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return j(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(iVar2);
                    } else {
                        iVar = this.f11933t;
                    }
                } while (iVar != i.f11951c);
            }
            return j(this.f11931o);
        }
        while (nanos > 0) {
            Object obj3 = this.f11931o;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return j(obj3);
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
        return this.f11931o instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f11931o != null);
    }

    protected void m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String n() {
        Object obj = this.f11931o;
        if (obj instanceof g) {
            return "setFuture=[" + t(((g) obj).f11950s) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean q(Object obj) {
        if (obj == null) {
            obj = f11930x;
        }
        if (!f11929w.b(this, null, obj)) {
            return false;
        }
        h(this);
        return true;
    }

    protected boolean r(Throwable th) {
        if (!f11929w.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        h(this);
        return true;
    }

    protected boolean s(com.google.common.util.concurrent.d dVar) {
        d dVar2;
        d(dVar);
        Object obj = this.f11931o;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!f11929w.b(this, null, k(dVar))) {
                    return false;
                }
                h(this);
                return true;
            }
            g gVar = new g(this, dVar);
            if (f11929w.b(this, null, gVar)) {
                try {
                    dVar.f(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar2 = new d(th);
                    } catch (Throwable unused) {
                        dVar2 = d.f11938b;
                    }
                    f11929w.b(this, gVar, dVar2);
                }
                return true;
            }
            obj = this.f11931o;
        }
        if (obj instanceof c) {
            dVar.cancel(((c) obj).f11936a);
        }
        return false;
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
                str = n();
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

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11931o;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return j(obj2);
            }
            i iVar = this.f11933t;
            if (iVar != i.f11951c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f11929w.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11931o;
                            } else {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return j(obj);
                    }
                    iVar = this.f11933t;
                } while (iVar != i.f11951c);
            }
            return j(this.f11931o);
        }
        throw new InterruptedException();
    }
}
