package a6;

import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import g6.C5817e;
import g6.EnumC5815c;
import java.util.concurrent.TimeUnit;
import r6.AbstractC6714f;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    static boolean f6569a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* renamed from: b, reason: collision with root package name */
    static final long f6570b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    static final class a implements InterfaceC5732b, Runnable {

        /* renamed from: o, reason: collision with root package name */
        final Runnable f6571o;

        /* renamed from: s, reason: collision with root package name */
        final c f6572s;

        /* renamed from: t, reason: collision with root package name */
        Thread f6573t;

        a(Runnable runnable, c cVar) {
            this.f6571o = runnable;
            this.f6572s = cVar;
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            if (this.f6573t == Thread.currentThread()) {
                c cVar = this.f6572s;
                if (cVar instanceof o6.f) {
                    ((o6.f) cVar).i();
                    return;
                }
            }
            this.f6572s.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6573t = Thread.currentThread();
            try {
                this.f6571o.run();
            } finally {
                c();
                this.f6573t = null;
            }
        }
    }

    static final class b implements InterfaceC5732b, Runnable {

        /* renamed from: o, reason: collision with root package name */
        final Runnable f6574o;

        /* renamed from: s, reason: collision with root package name */
        final c f6575s;

        /* renamed from: t, reason: collision with root package name */
        volatile boolean f6576t;

        b(Runnable runnable, c cVar) {
            this.f6574o = runnable;
            this.f6575s = cVar;
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f6576t = true;
            this.f6575s.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6576t) {
                return;
            }
            try {
                this.f6574o.run();
            } catch (Throwable th) {
                AbstractC5751a.b(th);
                this.f6575s.c();
                throw AbstractC6714f.c(th);
            }
        }
    }

    public static abstract class c implements InterfaceC5732b {

        final class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final Runnable f6577o;

            /* renamed from: s, reason: collision with root package name */
            final C5817e f6578s;

            /* renamed from: t, reason: collision with root package name */
            final long f6579t;

            /* renamed from: u, reason: collision with root package name */
            long f6580u;

            /* renamed from: v, reason: collision with root package name */
            long f6581v;

            /* renamed from: w, reason: collision with root package name */
            long f6582w;

            a(long j8, Runnable runnable, long j9, C5817e c5817e, long j10) {
                this.f6577o = runnable;
                this.f6578s = c5817e;
                this.f6579t = j10;
                this.f6581v = j9;
                this.f6582w = j8;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r12 = this;
                    java.lang.Runnable r0 = r12.f6577o
                    r0.run()
                    g6.e r0 = r12.f6578s
                    boolean r0 = r0.a()
                    if (r0 != 0) goto L51
                    a6.j$c r0 = a6.j.c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.a(r1)
                    long r4 = a6.j.f6570b
                    long r6 = r2 + r4
                    long r8 = r12.f6581v
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f6579t
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f6582w
                    long r8 = r12.f6580u
                    long r8 = r8 + r6
                    r12.f6580u = r8
                    long r8 = r8 * r10
                    long r4 = r4 + r8
                    goto L43
                L34:
                    long r4 = r12.f6579t
                    long r8 = r2 + r4
                    long r10 = r12.f6580u
                    long r10 = r10 + r6
                    r12.f6580u = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f6582w = r4
                    r4 = r8
                L43:
                    r12.f6581v = r2
                    long r4 = r4 - r2
                    g6.e r0 = r12.f6578s
                    a6.j$c r2 = a6.j.c.this
                    d6.b r1 = r2.d(r12, r4, r1)
                    r0.b(r1)
                L51:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: a6.j.c.a.run():void");
            }
        }

        public long a(TimeUnit timeUnit) {
            return j.a(timeUnit);
        }

        public InterfaceC5732b b(Runnable runnable) {
            return d(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract InterfaceC5732b d(Runnable runnable, long j8, TimeUnit timeUnit);

        public InterfaceC5732b e(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
            C5817e c5817e = new C5817e();
            C5817e c5817e2 = new C5817e(c5817e);
            Runnable o8 = AbstractC6805a.o(runnable);
            long nanos = timeUnit.toNanos(j9);
            long a8 = a(TimeUnit.NANOSECONDS);
            InterfaceC5732b d8 = d(new a(a8 + timeUnit.toNanos(j8), o8, a8, c5817e2, nanos), j8, timeUnit);
            if (d8 == EnumC5815c.INSTANCE) {
                return d8;
            }
            c5817e.b(d8);
            return c5817e2;
        }
    }

    static long a(TimeUnit timeUnit) {
        return !f6569a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract c b();

    public InterfaceC5732b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        c b8 = b();
        a aVar = new a(AbstractC6805a.o(runnable), b8);
        b8.d(aVar, j8, timeUnit);
        return aVar;
    }

    public InterfaceC5732b d(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        c b8 = b();
        b bVar = new b(AbstractC6805a.o(runnable), b8);
        InterfaceC5732b e8 = b8.e(bVar, j8, j9, timeUnit);
        return e8 == EnumC5815c.INSTANCE ? e8 : bVar;
    }
}
