package o6;

import a6.j;
import d6.C5731a;
import d6.InterfaceC5732b;
import g6.EnumC5815c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class l extends a6.j {

    /* renamed from: e, reason: collision with root package name */
    static final g f40028e;

    /* renamed from: f, reason: collision with root package name */
    static final ScheduledExecutorService f40029f;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f40030c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f40031d;

    static final class a extends j.c {

        /* renamed from: o, reason: collision with root package name */
        final ScheduledExecutorService f40032o;

        /* renamed from: s, reason: collision with root package name */
        final C5731a f40033s = new C5731a();

        /* renamed from: t, reason: collision with root package name */
        volatile boolean f40034t;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f40032o = scheduledExecutorService;
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            if (this.f40034t) {
                return;
            }
            this.f40034t = true;
            this.f40033s.c();
        }

        @Override // a6.j.c
        public InterfaceC5732b d(Runnable runnable, long j8, TimeUnit timeUnit) {
            if (this.f40034t) {
                return EnumC5815c.INSTANCE;
            }
            j jVar = new j(AbstractC6805a.o(runnable), this.f40033s);
            this.f40033s.b(jVar);
            try {
                jVar.a(j8 <= 0 ? this.f40032o.submit((Callable) jVar) : this.f40032o.schedule((Callable) jVar, j8, timeUnit));
                return jVar;
            } catch (RejectedExecutionException e8) {
                c();
                AbstractC6805a.m(e8);
                return EnumC5815c.INSTANCE;
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f40029f = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f40028e = new g("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public l() {
        this(f40028e);
    }

    static ScheduledExecutorService e(ThreadFactory threadFactory) {
        return k.a(threadFactory);
    }

    @Override // a6.j
    public j.c b() {
        return new a((ScheduledExecutorService) this.f40031d.get());
    }

    @Override // a6.j
    public InterfaceC5732b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        i iVar = new i(AbstractC6805a.o(runnable));
        try {
            iVar.a(j8 <= 0 ? ((ScheduledExecutorService) this.f40031d.get()).submit(iVar) : ((ScheduledExecutorService) this.f40031d.get()).schedule(iVar, j8, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e8) {
            AbstractC6805a.m(e8);
            return EnumC5815c.INSTANCE;
        }
    }

    @Override // a6.j
    public InterfaceC5732b d(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        Runnable o8 = AbstractC6805a.o(runnable);
        if (j9 > 0) {
            h hVar = new h(o8);
            try {
                hVar.a(((ScheduledExecutorService) this.f40031d.get()).scheduleAtFixedRate(hVar, j8, j9, timeUnit));
                return hVar;
            } catch (RejectedExecutionException e8) {
                AbstractC6805a.m(e8);
                return EnumC5815c.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f40031d.get();
        c cVar = new c(o8, scheduledExecutorService);
        try {
            cVar.b(j8 <= 0 ? scheduledExecutorService.submit(cVar) : scheduledExecutorService.schedule(cVar, j8, timeUnit));
            return cVar;
        } catch (RejectedExecutionException e9) {
            AbstractC6805a.m(e9);
            return EnumC5815c.INSTANCE;
        }
    }

    public l(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f40031d = atomicReference;
        this.f40030c = threadFactory;
        atomicReference.lazySet(e(threadFactory));
    }
}
