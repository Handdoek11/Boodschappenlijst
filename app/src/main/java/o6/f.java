package o6;

import a6.j;
import d6.InterfaceC5732b;
import g6.EnumC5815c;
import g6.InterfaceC5813a;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public class f extends j.c implements InterfaceC5732b {

    /* renamed from: o, reason: collision with root package name */
    private final ScheduledExecutorService f40014o;

    /* renamed from: s, reason: collision with root package name */
    volatile boolean f40015s;

    public f(ThreadFactory threadFactory) {
        this.f40014o = k.a(threadFactory);
    }

    @Override // a6.j.c
    public InterfaceC5732b b(Runnable runnable) {
        return d(runnable, 0L, null);
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        if (this.f40015s) {
            return;
        }
        this.f40015s = true;
        this.f40014o.shutdownNow();
    }

    @Override // a6.j.c
    public InterfaceC5732b d(Runnable runnable, long j8, TimeUnit timeUnit) {
        return this.f40015s ? EnumC5815c.INSTANCE : f(runnable, j8, timeUnit, null);
    }

    public j f(Runnable runnable, long j8, TimeUnit timeUnit, InterfaceC5813a interfaceC5813a) {
        j jVar = new j(AbstractC6805a.o(runnable), interfaceC5813a);
        if (interfaceC5813a != null && !interfaceC5813a.b(jVar)) {
            return jVar;
        }
        try {
            jVar.a(j8 <= 0 ? this.f40014o.submit((Callable) jVar) : this.f40014o.schedule((Callable) jVar, j8, timeUnit));
        } catch (RejectedExecutionException e8) {
            if (interfaceC5813a != null) {
                interfaceC5813a.a(jVar);
            }
            AbstractC6805a.m(e8);
        }
        return jVar;
    }

    public InterfaceC5732b g(Runnable runnable, long j8, TimeUnit timeUnit) {
        i iVar = new i(AbstractC6805a.o(runnable));
        try {
            iVar.a(j8 <= 0 ? this.f40014o.submit(iVar) : this.f40014o.schedule(iVar, j8, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e8) {
            AbstractC6805a.m(e8);
            return EnumC5815c.INSTANCE;
        }
    }

    public InterfaceC5732b h(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        Runnable o8 = AbstractC6805a.o(runnable);
        if (j9 <= 0) {
            c cVar = new c(o8, this.f40014o);
            try {
                cVar.b(j8 <= 0 ? this.f40014o.submit(cVar) : this.f40014o.schedule(cVar, j8, timeUnit));
                return cVar;
            } catch (RejectedExecutionException e8) {
                AbstractC6805a.m(e8);
                return EnumC5815c.INSTANCE;
            }
        }
        h hVar = new h(o8);
        try {
            hVar.a(this.f40014o.scheduleAtFixedRate(hVar, j8, j9, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e9) {
            AbstractC6805a.m(e9);
            return EnumC5815c.INSTANCE;
        }
    }

    public void i() {
        if (this.f40015s) {
            return;
        }
        this.f40015s = true;
        this.f40014o.shutdown();
    }
}
