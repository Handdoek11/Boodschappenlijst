package o6;

import X2.D;
import a6.j;
import d6.C5731a;
import d6.InterfaceC5732b;
import g6.C5816d;
import g6.EnumC5815c;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b extends a6.j {

    /* renamed from: e, reason: collision with root package name */
    static final C0299b f39972e;

    /* renamed from: f, reason: collision with root package name */
    static final g f39973f;

    /* renamed from: g, reason: collision with root package name */
    static final int f39974g = e(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: h, reason: collision with root package name */
    static final c f39975h;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f39976c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f39977d;

    static final class a extends j.c {

        /* renamed from: o, reason: collision with root package name */
        private final C5816d f39978o;

        /* renamed from: s, reason: collision with root package name */
        private final C5731a f39979s;

        /* renamed from: t, reason: collision with root package name */
        private final C5816d f39980t;

        /* renamed from: u, reason: collision with root package name */
        private final c f39981u;

        /* renamed from: v, reason: collision with root package name */
        volatile boolean f39982v;

        a(c cVar) {
            this.f39981u = cVar;
            C5816d c5816d = new C5816d();
            this.f39978o = c5816d;
            C5731a c5731a = new C5731a();
            this.f39979s = c5731a;
            C5816d c5816d2 = new C5816d();
            this.f39980t = c5816d2;
            c5816d2.b(c5816d);
            c5816d2.b(c5731a);
        }

        @Override // a6.j.c
        public InterfaceC5732b b(Runnable runnable) {
            return this.f39982v ? EnumC5815c.INSTANCE : this.f39981u.f(runnable, 0L, TimeUnit.MILLISECONDS, this.f39978o);
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            if (this.f39982v) {
                return;
            }
            this.f39982v = true;
            this.f39980t.c();
        }

        @Override // a6.j.c
        public InterfaceC5732b d(Runnable runnable, long j8, TimeUnit timeUnit) {
            return this.f39982v ? EnumC5815c.INSTANCE : this.f39981u.f(runnable, j8, timeUnit, this.f39979s);
        }
    }

    /* renamed from: o6.b$b, reason: collision with other inner class name */
    static final class C0299b {

        /* renamed from: a, reason: collision with root package name */
        final int f39983a;

        /* renamed from: b, reason: collision with root package name */
        final c[] f39984b;

        /* renamed from: c, reason: collision with root package name */
        long f39985c;

        C0299b(int i8, ThreadFactory threadFactory) {
            this.f39983a = i8;
            this.f39984b = new c[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                this.f39984b[i9] = new c(threadFactory);
            }
        }

        public c a() {
            int i8 = this.f39983a;
            if (i8 == 0) {
                return b.f39975h;
            }
            c[] cVarArr = this.f39984b;
            long j8 = this.f39985c;
            this.f39985c = 1 + j8;
            return cVarArr[(int) (j8 % i8)];
        }

        public void b() {
            for (c cVar : this.f39984b) {
                cVar.c();
            }
        }
    }

    static final class c extends f {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new g("RxComputationShutdown"));
        f39975h = cVar;
        cVar.c();
        g gVar = new g("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f39973f = gVar;
        C0299b c0299b = new C0299b(0, gVar);
        f39972e = c0299b;
        c0299b.b();
    }

    public b() {
        this(f39973f);
    }

    static int e(int i8, int i9) {
        return (i9 <= 0 || i9 > i8) ? i8 : i9;
    }

    @Override // a6.j
    public j.c b() {
        return new a(((C0299b) this.f39977d.get()).a());
    }

    @Override // a6.j
    public InterfaceC5732b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        return ((C0299b) this.f39977d.get()).a().g(runnable, j8, timeUnit);
    }

    @Override // a6.j
    public InterfaceC5732b d(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        return ((C0299b) this.f39977d.get()).a().h(runnable, j8, j9, timeUnit);
    }

    public void f() {
        C0299b c0299b = new C0299b(f39974g, this.f39976c);
        if (D.a(this.f39977d, f39972e, c0299b)) {
            return;
        }
        c0299b.b();
    }

    public b(ThreadFactory threadFactory) {
        this.f39976c = threadFactory;
        this.f39977d = new AtomicReference(f39972e);
        f();
    }
}
