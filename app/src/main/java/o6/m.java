package o6;

import a6.j;
import d6.AbstractC5733c;
import d6.InterfaceC5732b;
import g6.EnumC5815c;
import h6.AbstractC5844b;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class m extends a6.j {

    /* renamed from: c, reason: collision with root package name */
    private static final m f40035c = new m();

    static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final Runnable f40036o;

        /* renamed from: s, reason: collision with root package name */
        private final c f40037s;

        /* renamed from: t, reason: collision with root package name */
        private final long f40038t;

        a(Runnable runnable, c cVar, long j8) {
            this.f40036o = runnable;
            this.f40037s = cVar;
            this.f40038t = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40037s.f40046u) {
                return;
            }
            long a8 = this.f40037s.a(TimeUnit.MILLISECONDS);
            long j8 = this.f40038t;
            if (j8 > a8) {
                try {
                    Thread.sleep(j8 - a8);
                } catch (InterruptedException e8) {
                    Thread.currentThread().interrupt();
                    AbstractC6805a.m(e8);
                    return;
                }
            }
            if (this.f40037s.f40046u) {
                return;
            }
            this.f40036o.run();
        }
    }

    static final class b implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        final Runnable f40039o;

        /* renamed from: s, reason: collision with root package name */
        final long f40040s;

        /* renamed from: t, reason: collision with root package name */
        final int f40041t;

        /* renamed from: u, reason: collision with root package name */
        volatile boolean f40042u;

        b(Runnable runnable, Long l8, int i8) {
            this.f40039o = runnable;
            this.f40040s = l8.longValue();
            this.f40041t = i8;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int b8 = AbstractC5844b.b(this.f40040s, bVar.f40040s);
            return b8 == 0 ? AbstractC5844b.a(this.f40041t, bVar.f40041t) : b8;
        }
    }

    static final class c extends j.c implements InterfaceC5732b {

        /* renamed from: o, reason: collision with root package name */
        final PriorityBlockingQueue f40043o = new PriorityBlockingQueue();

        /* renamed from: s, reason: collision with root package name */
        private final AtomicInteger f40044s = new AtomicInteger();

        /* renamed from: t, reason: collision with root package name */
        final AtomicInteger f40045t = new AtomicInteger();

        /* renamed from: u, reason: collision with root package name */
        volatile boolean f40046u;

        final class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final b f40047o;

            a(b bVar) {
                this.f40047o = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f40047o.f40042u = true;
                c.this.f40043o.remove(this.f40047o);
            }
        }

        c() {
        }

        @Override // a6.j.c
        public InterfaceC5732b b(Runnable runnable) {
            return f(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f40046u = true;
        }

        @Override // a6.j.c
        public InterfaceC5732b d(Runnable runnable, long j8, TimeUnit timeUnit) {
            long a8 = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j8);
            return f(new a(runnable, this, a8), a8);
        }

        InterfaceC5732b f(Runnable runnable, long j8) {
            if (this.f40046u) {
                return EnumC5815c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j8), this.f40045t.incrementAndGet());
            this.f40043o.add(bVar);
            if (this.f40044s.getAndIncrement() != 0) {
                return AbstractC5733c.b(new a(bVar));
            }
            int i8 = 1;
            while (!this.f40046u) {
                b bVar2 = (b) this.f40043o.poll();
                if (bVar2 == null) {
                    i8 = this.f40044s.addAndGet(-i8);
                    if (i8 == 0) {
                        return EnumC5815c.INSTANCE;
                    }
                } else if (!bVar2.f40042u) {
                    bVar2.f40039o.run();
                }
            }
            this.f40043o.clear();
            return EnumC5815c.INSTANCE;
        }
    }

    m() {
    }

    public static m e() {
        return f40035c;
    }

    @Override // a6.j
    public j.c b() {
        return new c();
    }

    @Override // a6.j
    public InterfaceC5732b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j8);
            AbstractC6805a.o(runnable).run();
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            AbstractC6805a.m(e8);
        }
        return EnumC5815c.INSTANCE;
    }
}
