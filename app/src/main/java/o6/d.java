package o6;

import X2.D;
import a6.j;
import d6.C5731a;
import d6.InterfaceC5732b;
import g6.EnumC5815c;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class d extends a6.j {

    /* renamed from: e, reason: collision with root package name */
    static final g f39992e;

    /* renamed from: f, reason: collision with root package name */
    static final g f39993f;

    /* renamed from: i, reason: collision with root package name */
    static final c f39996i;

    /* renamed from: j, reason: collision with root package name */
    static boolean f39997j;

    /* renamed from: k, reason: collision with root package name */
    static final a f39998k;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f39999c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f40000d;

    /* renamed from: h, reason: collision with root package name */
    private static final TimeUnit f39995h = TimeUnit.SECONDS;

    /* renamed from: g, reason: collision with root package name */
    private static final long f39994g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final long f40001o;

        /* renamed from: s, reason: collision with root package name */
        private final ConcurrentLinkedQueue f40002s;

        /* renamed from: t, reason: collision with root package name */
        final C5731a f40003t;

        /* renamed from: u, reason: collision with root package name */
        private final ScheduledExecutorService f40004u;

        /* renamed from: v, reason: collision with root package name */
        private final Future f40005v;

        /* renamed from: w, reason: collision with root package name */
        private final ThreadFactory f40006w;

        a(long j8, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j8) : 0L;
            this.f40001o = nanos;
            this.f40002s = new ConcurrentLinkedQueue();
            this.f40003t = new C5731a();
            this.f40006w = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, d.f39993f);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f40004u = scheduledExecutorService;
            this.f40005v = scheduledFuture;
        }

        void a() {
            if (this.f40002s.isEmpty()) {
                return;
            }
            long c8 = c();
            Iterator it = this.f40002s.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.j() > c8) {
                    return;
                }
                if (this.f40002s.remove(cVar)) {
                    this.f40003t.a(cVar);
                }
            }
        }

        c b() {
            if (this.f40003t.f()) {
                return d.f39996i;
            }
            while (!this.f40002s.isEmpty()) {
                c cVar = (c) this.f40002s.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            c cVar2 = new c(this.f40006w);
            this.f40003t.b(cVar2);
            return cVar2;
        }

        long c() {
            return System.nanoTime();
        }

        void d(c cVar) {
            cVar.k(c() + this.f40001o);
            this.f40002s.offer(cVar);
        }

        void e() {
            this.f40003t.c();
            Future future = this.f40005v;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f40004u;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    static final class b extends j.c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        private final a f40008s;

        /* renamed from: t, reason: collision with root package name */
        private final c f40009t;

        /* renamed from: u, reason: collision with root package name */
        final AtomicBoolean f40010u = new AtomicBoolean();

        /* renamed from: o, reason: collision with root package name */
        private final C5731a f40007o = new C5731a();

        b(a aVar) {
            this.f40008s = aVar;
            this.f40009t = aVar.b();
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            if (this.f40010u.compareAndSet(false, true)) {
                this.f40007o.c();
                if (d.f39997j) {
                    this.f40009t.f(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f40008s.d(this.f40009t);
                }
            }
        }

        @Override // a6.j.c
        public InterfaceC5732b d(Runnable runnable, long j8, TimeUnit timeUnit) {
            return this.f40007o.f() ? EnumC5815c.INSTANCE : this.f40009t.f(runnable, j8, timeUnit, this.f40007o);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40008s.d(this.f40009t);
        }
    }

    static final class c extends f {

        /* renamed from: t, reason: collision with root package name */
        private long f40011t;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f40011t = 0L;
        }

        public long j() {
            return this.f40011t;
        }

        public void k(long j8) {
            this.f40011t = j8;
        }
    }

    static {
        c cVar = new c(new g("RxCachedThreadSchedulerShutdown"));
        f39996i = cVar;
        cVar.c();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        g gVar = new g("RxCachedThreadScheduler", max);
        f39992e = gVar;
        f39993f = new g("RxCachedWorkerPoolEvictor", max);
        f39997j = Boolean.getBoolean("rx2.io-scheduled-release");
        a aVar = new a(0L, null, gVar);
        f39998k = aVar;
        aVar.e();
    }

    public d() {
        this(f39992e);
    }

    @Override // a6.j
    public j.c b() {
        return new b((a) this.f40000d.get());
    }

    public void e() {
        a aVar = new a(f39994g, f39995h, this.f39999c);
        if (D.a(this.f40000d, f39998k, aVar)) {
            return;
        }
        aVar.e();
    }

    public d(ThreadFactory threadFactory) {
        this.f39999c = threadFactory;
        this.f40000d = new AtomicReference(f39998k);
        e();
    }
}
