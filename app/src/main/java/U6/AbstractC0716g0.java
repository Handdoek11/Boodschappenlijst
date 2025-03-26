package U6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.C6916E;

/* renamed from: U6.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0716g0 extends AbstractC0718h0 implements W {

    /* renamed from: w, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5454w = AtomicReferenceFieldUpdater.newUpdater(AbstractC0716g0.class, Object.class, "_queue");

    /* renamed from: x, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5455x = AtomicReferenceFieldUpdater.newUpdater(AbstractC0716g0.class, Object.class, "_delayed");

    /* renamed from: y, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f5456y = AtomicIntegerFieldUpdater.newUpdater(AbstractC0716g0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: U6.g0$a */
    private final class a extends b {

        /* renamed from: t, reason: collision with root package name */
        private final InterfaceC0731o f5457t;

        public a(long j8, InterfaceC0731o interfaceC0731o) {
            super(j8);
            this.f5457t = interfaceC0731o;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5457t.o(AbstractC0716g0.this, C6916E.f44463a);
        }

        @Override // U6.AbstractC0716g0.b
        public String toString() {
            return super.toString() + this.f5457t;
        }
    }

    /* renamed from: U6.g0$b */
    public static abstract class b implements Runnable, Comparable, InterfaceC0708c0, Z6.L {
        private volatile Object _heap;

        /* renamed from: o, reason: collision with root package name */
        public long f5459o;

        /* renamed from: s, reason: collision with root package name */
        private int f5460s = -1;

        public b(long j8) {
            this.f5459o = j8;
        }

        @Override // Z6.L
        public void a(Z6.K k8) {
            if (this._heap == AbstractC0722j0.f5463a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = k8;
        }

        @Override // U6.InterfaceC0708c0
        public final void c() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC0722j0.f5463a) {
                        return;
                    }
                    c cVar = obj instanceof c ? (c) obj : null;
                    if (cVar != null) {
                        cVar.g(this);
                    }
                    this._heap = AbstractC0722j0.f5463a;
                    C6916E c6916e = C6916E.f44463a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Z6.L
        public Z6.K g() {
            Object obj = this._heap;
            if (obj instanceof Z6.K) {
                return (Z6.K) obj;
            }
            return null;
        }

        @Override // Z6.L
        public void h(int i8) {
            this.f5460s = i8;
        }

        @Override // Z6.L
        public int i() {
            return this.f5460s;
        }

        @Override // java.lang.Comparable
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j8 = this.f5459o - bVar.f5459o;
            if (j8 > 0) {
                return 1;
            }
            return j8 < 0 ? -1 : 0;
        }

        public final int l(long j8, c cVar, AbstractC0716g0 abstractC0716g0) {
            synchronized (this) {
                if (this._heap == AbstractC0722j0.f5463a) {
                    return 2;
                }
                synchronized (cVar) {
                    try {
                        b bVar = (b) cVar.b();
                        if (abstractC0716g0.j()) {
                            return 1;
                        }
                        if (bVar == null) {
                            cVar.f5461c = j8;
                        } else {
                            long j9 = bVar.f5459o;
                            if (j9 - j8 < 0) {
                                j8 = j9;
                            }
                            if (j8 - cVar.f5461c > 0) {
                                cVar.f5461c = j8;
                            }
                        }
                        long j10 = this.f5459o;
                        long j11 = cVar.f5461c;
                        if (j10 - j11 < 0) {
                            this.f5459o = j11;
                        }
                        cVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean m(long j8) {
            return j8 - this.f5459o >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f5459o + ']';
        }
    }

    /* renamed from: U6.g0$c */
    public static final class c extends Z6.K {

        /* renamed from: c, reason: collision with root package name */
        public long f5461c;

        public c(long j8) {
            this.f5461c = j8;
        }
    }

    private final void Q0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5454w;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f5454w, this, null, AbstractC0722j0.f5464b)) {
                    return;
                }
            } else if (obj instanceof Z6.r) {
                ((Z6.r) obj).d();
                return;
            } else {
                if (obj == AbstractC0722j0.f5464b) {
                    return;
                }
                Z6.r rVar = new Z6.r(8, true);
                J6.r.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                rVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f5454w, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable R0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5454w;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof Z6.r) {
                J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                Z6.r rVar = (Z6.r) obj;
                Object j8 = rVar.j();
                if (j8 != Z6.r.f6500h) {
                    return (Runnable) j8;
                }
                androidx.concurrent.futures.b.a(f5454w, this, obj, rVar.i());
            } else {
                if (obj == AbstractC0722j0.f5464b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f5454w, this, obj, null)) {
                    J6.r.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean T0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5454w;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (j()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f5454w, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof Z6.r) {
                J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                Z6.r rVar = (Z6.r) obj;
                int a8 = rVar.a(runnable);
                if (a8 == 0) {
                    return true;
                }
                if (a8 == 1) {
                    androidx.concurrent.futures.b.a(f5454w, this, obj, rVar.i());
                } else if (a8 == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC0722j0.f5464b) {
                    return false;
                }
                Z6.r rVar2 = new Z6.r(8, true);
                J6.r.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                rVar2.a((Runnable) obj);
                rVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f5454w, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    private final void V0() {
        b bVar;
        AbstractC0707c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) f5455x.get(this);
            if (cVar == null || (bVar = (b) cVar.i()) == null) {
                return;
            } else {
                N0(nanoTime, bVar);
            }
        }
    }

    private final int Y0(long j8, b bVar) {
        if (j()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5455x;
        c cVar = (c) atomicReferenceFieldUpdater.get(this);
        if (cVar == null) {
            androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, new c(j8));
            Object obj = atomicReferenceFieldUpdater.get(this);
            J6.r.b(obj);
            cVar = (c) obj;
        }
        return bVar.l(j8, cVar, this);
    }

    private final void Z0(boolean z7) {
        f5456y.set(this, z7 ? 1 : 0);
    }

    private final boolean a1(b bVar) {
        c cVar = (c) f5455x.get(this);
        return (cVar != null ? (b) cVar.e() : null) == bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return f5456y.get(this) != 0;
    }

    @Override // U6.W
    public void E(long j8, InterfaceC0731o interfaceC0731o) {
        long c8 = AbstractC0722j0.c(j8);
        if (c8 < 4611686018427387903L) {
            AbstractC0707c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c8 + nanoTime, interfaceC0731o);
            X0(nanoTime, aVar);
            r.a(interfaceC0731o, aVar);
        }
    }

    @Override // U6.AbstractC0714f0
    protected long E0() {
        b bVar;
        if (super.E0() == 0) {
            return 0L;
        }
        Object obj = f5454w.get(this);
        if (obj != null) {
            if (!(obj instanceof Z6.r)) {
                return obj == AbstractC0722j0.f5464b ? Long.MAX_VALUE : 0L;
            }
            if (!((Z6.r) obj).g()) {
                return 0L;
            }
        }
        c cVar = (c) f5455x.get(this);
        if (cVar == null || (bVar = (b) cVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j8 = bVar.f5459o;
        AbstractC0707c.a();
        return P6.m.d(j8 - System.nanoTime(), 0L);
    }

    @Override // U6.AbstractC0714f0
    public long J0() {
        Z6.L l8;
        if (K0()) {
            return 0L;
        }
        c cVar = (c) f5455x.get(this);
        if (cVar != null && !cVar.d()) {
            AbstractC0707c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    try {
                        Z6.L b8 = cVar.b();
                        if (b8 != null) {
                            b bVar = (b) b8;
                            l8 = bVar.m(nanoTime) ? T0(bVar) : false ? cVar.h(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((b) l8) != null);
        }
        Runnable R02 = R0();
        if (R02 == null) {
            return E0();
        }
        R02.run();
        return 0L;
    }

    public void S0(Runnable runnable) {
        if (T0(runnable)) {
            O0();
        } else {
            S.f5421z.S0(runnable);
        }
    }

    protected boolean U0() {
        if (!I0()) {
            return false;
        }
        c cVar = (c) f5455x.get(this);
        if (cVar != null && !cVar.d()) {
            return false;
        }
        Object obj = f5454w.get(this);
        if (obj != null) {
            if (obj instanceof Z6.r) {
                return ((Z6.r) obj).g();
            }
            if (obj != AbstractC0722j0.f5464b) {
                return false;
            }
        }
        return true;
    }

    protected final void W0() {
        f5454w.set(this, null);
        f5455x.set(this, null);
    }

    public final void X0(long j8, b bVar) {
        int Y02 = Y0(j8, bVar);
        if (Y02 == 0) {
            if (a1(bVar)) {
                O0();
            }
        } else if (Y02 == 1) {
            N0(j8, bVar);
        } else if (Y02 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    @Override // U6.I
    public final void q0(A6.g gVar, Runnable runnable) {
        S0(runnable);
    }

    @Override // U6.AbstractC0714f0
    public void shutdown() {
        S0.f5422a.c();
        Z0(true);
        Q0();
        while (J0() <= 0) {
        }
        V0();
    }
}
