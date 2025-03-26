package b7;

import J6.AbstractC0650j;
import J6.G;
import J6.r;
import U6.AbstractC0707c;
import U6.Q;
import Z6.E;
import Z6.z;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class a implements Executor, Closeable {
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: o, reason: collision with root package name */
    public final int f12018o;
    private volatile long parkedWorkersStack;

    /* renamed from: s, reason: collision with root package name */
    public final int f12019s;

    /* renamed from: t, reason: collision with root package name */
    public final long f12020t;

    /* renamed from: u, reason: collision with root package name */
    public final String f12021u;

    /* renamed from: v, reason: collision with root package name */
    public final b7.d f12022v;

    /* renamed from: w, reason: collision with root package name */
    public final b7.d f12023w;

    /* renamed from: x, reason: collision with root package name */
    public final z f12024x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0205a f12016y = new C0205a(null);

    /* renamed from: z, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f12017z = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: A, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f12013A = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: B, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f12014B = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: C, reason: collision with root package name */
    public static final E f12015C = new E("NOT_IN_STACK");

    /* renamed from: b7.a$a, reason: collision with other inner class name */
    public static final class C0205a {
        public /* synthetic */ C0205a(AbstractC0650j abstractC0650j) {
            this();
        }

        private C0205a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12025a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f12025a = iArr;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i8, int i9, long j8, String str) {
        this.f12018o = i8;
        this.f12019s = i9;
        this.f12020t = j8;
        this.f12021u = str;
        if (i8 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i8 + " should be at least 1").toString());
        }
        if (i9 < i8) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should be greater than or equals to core pool size " + i8).toString());
        }
        if (i9 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j8 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
        }
        this.f12022v = new b7.d();
        this.f12023w = new b7.d();
        this.f12024x = new z((i8 + 1) * 2);
        this.controlState = i8 << 42;
        this._isTerminated = 0;
    }

    private final void E(long j8, boolean z7) {
        if (z7 || X() || N(j8)) {
            return;
        }
        X();
    }

    private final h K(c cVar, h hVar, boolean z7) {
        if (cVar == null || cVar.f12029t == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f12051s.b() == 0 && cVar.f12029t == d.BLOCKING) {
            return hVar;
        }
        cVar.f12033x = true;
        return cVar.f12027o.a(hVar, z7);
    }

    private final boolean N(long j8) {
        if (P6.m.c(((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21)), 0) < this.f12018o) {
            int f8 = f();
            if (f8 == 1 && this.f12018o > 1) {
                f();
            }
            if (f8 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean T(a aVar, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = f12013A.get(aVar);
        }
        return aVar.N(j8);
    }

    private final boolean X() {
        c u7;
        do {
            u7 = u();
            if (u7 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(u7, -1, 0));
        LockSupport.unpark(u7);
        return true;
    }

    private final boolean e(h hVar) {
        return hVar.f12051s.b() == 1 ? this.f12023w.a(hVar) : this.f12022v.a(hVar);
    }

    private final int f() {
        synchronized (this.f12024x) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f12013A;
                long j8 = atomicLongFieldUpdater.get(this);
                int i8 = (int) (j8 & 2097151);
                int c8 = P6.m.c(i8 - ((int) ((j8 & 4398044413952L) >> 21)), 0);
                if (c8 >= this.f12018o) {
                    return 0;
                }
                if (i8 >= this.f12019s) {
                    return 0;
                }
                int i9 = ((int) (f12013A.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f12024x.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i9);
                this.f12024x.c(i9, cVar);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = c8 + 1;
                cVar.start();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c h() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !r.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void j(a aVar, Runnable runnable, i iVar, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            iVar = l.f12060g;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        aVar.i(runnable, iVar, z7);
    }

    private final int m(c cVar) {
        Object i8 = cVar.i();
        while (i8 != f12015C) {
            if (i8 == null) {
                return 0;
            }
            c cVar2 = (c) i8;
            int h8 = cVar2.h();
            if (h8 != 0) {
                return h8;
            }
            i8 = cVar2.i();
        }
        return -1;
    }

    private final c u() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12017z;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f12024x.b((int) (2097151 & j8));
            if (cVar == null) {
                return null;
            }
            long j9 = (2097152 + j8) & (-2097152);
            int m8 = m(cVar);
            if (m8 >= 0 && f12017z.compareAndSet(this, j8, m8 | j9)) {
                cVar.r(f12015C);
                return cVar;
            }
        }
    }

    public final void A(c cVar, int i8, int i9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12017z;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j8);
            long j9 = (2097152 + j8) & (-2097152);
            if (i10 == i8) {
                i10 = i9 == 0 ? m(cVar) : i9;
            }
            if (i10 >= 0 && f12017z.compareAndSet(this, j8, j9 | i10)) {
                return;
            }
        }
    }

    public final void B(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(long r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = b7.a.f12014B
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            b7.a$c r0 = r7.h()
            Z6.z r1 = r7.f12024x
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = d()     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L49
            r1 = r2
        L23:
            Z6.z r4 = r7.f12024x
            java.lang.Object r4 = r4.b(r1)
            J6.r.b(r4)
            b7.a$c r4 = (b7.a.c) r4
            if (r4 == r0) goto L44
        L30:
            boolean r5 = r4.isAlive()
            if (r5 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L30
        L3d:
            b7.n r4 = r4.f12027o
            b7.d r5 = r7.f12023w
            r4.f(r5)
        L44:
            if (r1 == r3) goto L49
            int r1 = r1 + 1
            goto L23
        L49:
            b7.d r8 = r7.f12023w
            r8.b()
            b7.d r8 = r7.f12022v
            r8.b()
        L53:
            if (r0 == 0) goto L5b
            b7.h r8 = r0.g(r2)
            if (r8 != 0) goto L83
        L5b:
            b7.d r8 = r7.f12022v
            java.lang.Object r8 = r8.d()
            b7.h r8 = (b7.h) r8
            if (r8 != 0) goto L83
            b7.d r8 = r7.f12023w
            java.lang.Object r8 = r8.d()
            b7.h r8 = (b7.h) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            b7.a$d r8 = b7.a.d.TERMINATED
            r0.u(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = b7.a.f12017z
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = b7.a.f12013A
            r8.set(r7, r0)
            return
        L83:
            r7.B(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.a.D(long):void");
    }

    public final void I() {
        if (X() || T(this, 0L, 1, null)) {
            return;
        }
        X();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        D(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j(this, runnable, null, false, 6, null);
    }

    public final h g(Runnable runnable, i iVar) {
        long a8 = l.f12059f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a8, iVar);
        }
        h hVar = (h) runnable;
        hVar.f12050o = a8;
        hVar.f12051s = iVar;
        return hVar;
    }

    public final void i(Runnable runnable, i iVar, boolean z7) {
        AbstractC0707c.a();
        h g8 = g(runnable, iVar);
        boolean z8 = false;
        boolean z9 = g8.f12051s.b() == 1;
        long addAndGet = z9 ? f12013A.addAndGet(this, 2097152L) : 0L;
        c h8 = h();
        h K7 = K(h8, g8, z7);
        if (K7 != null && !e(K7)) {
            throw new RejectedExecutionException(this.f12021u + " was terminated");
        }
        if (z7 && h8 != null) {
            z8 = true;
        }
        if (z9) {
            E(addAndGet, z8);
        } else {
            if (z8) {
                return;
            }
            I();
        }
    }

    public final boolean isTerminated() {
        return f12014B.get(this) != 0;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a8 = this.f12024x.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < a8; i13++) {
            c cVar = (c) this.f12024x.b(i13);
            if (cVar != null) {
                int e8 = cVar.f12027o.e();
                int i14 = b.f12025a[cVar.f12029t.ordinal()];
                if (i14 == 1) {
                    i10++;
                } else if (i14 == 2) {
                    i9++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e8);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i14 == 3) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e8);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i14 == 4) {
                    i11++;
                    if (e8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i14 == 5) {
                    i12++;
                }
            }
        }
        long j8 = f12013A.get(this);
        return this.f12021u + '@' + Q.b(this) + "[Pool Size {core = " + this.f12018o + ", max = " + this.f12019s + "}, Worker States {CPU = " + i8 + ", blocking = " + i9 + ", parked = " + i10 + ", dormant = " + i11 + ", terminated = " + i12 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f12022v.c() + ", global blocking queue size = " + this.f12023w.c() + ", Control State {created workers= " + ((int) (2097151 & j8)) + ", blocking tasks = " + ((int) ((4398044413952L & j8) >> 21)) + ", CPUs acquired = " + (this.f12018o - ((int) ((9223367638808264704L & j8) >> 42))) + "}]";
    }

    public final boolean z(c cVar) {
        long j8;
        int h8;
        if (cVar.i() != f12015C) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12017z;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            h8 = cVar.h();
            cVar.r(this.f12024x.b((int) (2097151 & j8)));
        } while (!f12017z.compareAndSet(this, j8, ((2097152 + j8) & (-2097152)) | h8));
        return true;
    }

    public final class c extends Thread {

        /* renamed from: z, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f12026z = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: o, reason: collision with root package name */
        public final n f12027o;

        /* renamed from: s, reason: collision with root package name */
        private final G f12028s;

        /* renamed from: t, reason: collision with root package name */
        public d f12029t;

        /* renamed from: u, reason: collision with root package name */
        private long f12030u;

        /* renamed from: v, reason: collision with root package name */
        private long f12031v;

        /* renamed from: w, reason: collision with root package name */
        private int f12032w;
        private volatile int workerCtl;

        /* renamed from: x, reason: collision with root package name */
        public boolean f12033x;

        private c() {
            setDaemon(true);
            this.f12027o = new n();
            this.f12028s = new G();
            this.f12029t = d.DORMANT;
            this.nextParkedWorker = a.f12015C;
            this.f12032w = N6.c.f4202o.c();
        }

        private final void b(int i8) {
            if (i8 == 0) {
                return;
            }
            a.f12013A.addAndGet(a.this, -2097152L);
            if (this.f12029t != d.TERMINATED) {
                this.f12029t = d.DORMANT;
            }
        }

        private final void c(int i8) {
            if (i8 != 0 && u(d.BLOCKING)) {
                a.this.I();
            }
        }

        private final void d(h hVar) {
            int b8 = hVar.f12051s.b();
            k(b8);
            c(b8);
            a.this.B(hVar);
            b(b8);
        }

        private final h e(boolean z7) {
            h o8;
            h o9;
            if (z7) {
                boolean z8 = m(a.this.f12018o * 2) == 0;
                if (z8 && (o9 = o()) != null) {
                    return o9;
                }
                h g8 = this.f12027o.g();
                if (g8 != null) {
                    return g8;
                }
                if (!z8 && (o8 = o()) != null) {
                    return o8;
                }
            } else {
                h o10 = o();
                if (o10 != null) {
                    return o10;
                }
            }
            return v(3);
        }

        private final h f() {
            h h8 = this.f12027o.h();
            if (h8 != null) {
                return h8;
            }
            h hVar = (h) a.this.f12023w.d();
            return hVar == null ? v(1) : hVar;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f12026z;
        }

        private final void k(int i8) {
            this.f12030u = 0L;
            if (this.f12029t == d.PARKING) {
                this.f12029t = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f12015C;
        }

        private final void n() {
            if (this.f12030u == 0) {
                this.f12030u = System.nanoTime() + a.this.f12020t;
            }
            LockSupport.parkNanos(a.this.f12020t);
            if (System.nanoTime() - this.f12030u >= 0) {
                this.f12030u = 0L;
                w();
            }
        }

        private final h o() {
            if (m(2) == 0) {
                h hVar = (h) a.this.f12022v.d();
                return hVar != null ? hVar : (h) a.this.f12023w.d();
            }
            h hVar2 = (h) a.this.f12023w.d();
            return hVar2 != null ? hVar2 : (h) a.this.f12022v.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z7 = false;
                while (!a.this.isTerminated() && this.f12029t != d.TERMINATED) {
                    h g8 = g(this.f12033x);
                    if (g8 != null) {
                        this.f12031v = 0L;
                        d(g8);
                    } else {
                        this.f12033x = false;
                        if (this.f12031v == 0) {
                            t();
                        } else if (z7) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f12031v);
                            this.f12031v = 0L;
                        } else {
                            z7 = true;
                        }
                    }
                }
                break loop0;
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            long j8;
            if (this.f12029t == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f12013A;
            do {
                j8 = atomicLongFieldUpdater.get(aVar);
                if (((int) ((9223367638808264704L & j8) >> 42)) == 0) {
                    return false;
                }
            } while (!a.f12013A.compareAndSet(aVar, j8, j8 - 4398046511104L));
            this.f12029t = d.CPU_ACQUIRED;
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.z(this);
                return;
            }
            f12026z.set(this, -1);
            while (l() && f12026z.get(this) == -1 && !a.this.isTerminated() && this.f12029t != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i8) {
            int i9 = (int) (a.f12013A.get(a.this) & 2097151);
            if (i9 < 2) {
                return null;
            }
            int m8 = m(i9);
            a aVar = a.this;
            long j8 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i9; i10++) {
                m8++;
                if (m8 > i9) {
                    m8 = 1;
                }
                c cVar = (c) aVar.f12024x.b(m8);
                if (cVar != null && cVar != this) {
                    long n8 = cVar.f12027o.n(i8, this.f12028s);
                    if (n8 == -1) {
                        G g8 = this.f12028s;
                        h hVar = (h) g8.f3547o;
                        g8.f3547o = null;
                        return hVar;
                    }
                    if (n8 > 0) {
                        j8 = Math.min(j8, n8);
                    }
                }
            }
            if (j8 == Long.MAX_VALUE) {
                j8 = 0;
            }
            this.f12031v = j8;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f12024x) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.f12013A.get(aVar) & 2097151)) <= aVar.f12018o) {
                        return;
                    }
                    if (f12026z.compareAndSet(this, -1, 1)) {
                        int i8 = this.indexInArray;
                        q(0);
                        aVar.A(this, i8, 0);
                        int andDecrement = (int) (a.f12013A.getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i8) {
                            Object b8 = aVar.f12024x.b(andDecrement);
                            r.b(b8);
                            c cVar = (c) b8;
                            aVar.f12024x.c(i8, cVar);
                            cVar.q(i8);
                            aVar.A(cVar, andDecrement, i8);
                        }
                        aVar.f12024x.c(andDecrement, null);
                        C6916E c6916e = C6916E.f44463a;
                        this.f12029t = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h g(boolean z7) {
            return s() ? e(z7) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i8) {
            int i9 = this.f12032w;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >> 17);
            int i12 = i11 ^ (i11 << 5);
            this.f12032w = i12;
            int i13 = i8 - 1;
            return (i13 & i8) == 0 ? i12 & i13 : (i12 & Integer.MAX_VALUE) % i8;
        }

        public final void q(int i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f12021u);
            sb.append("-worker-");
            sb.append(i8 == 0 ? "TERMINATED" : String.valueOf(i8));
            setName(sb.toString());
            this.indexInArray = i8;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f12029t;
            boolean z7 = dVar2 == d.CPU_ACQUIRED;
            if (z7) {
                a.f12013A.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f12029t = dVar;
            }
            return z7;
        }

        public c(a aVar, int i8) {
            this();
            q(i8);
        }
    }
}
