package W6;

import I6.p;
import I6.q;
import J6.s;
import U6.C0733p;
import U6.InterfaceC0731o;
import U6.W0;
import U6.r;
import Z6.AbstractC0790d;
import Z6.AbstractC0791e;
import Z6.AbstractC0797k;
import Z6.B;
import Z6.C;
import Z6.D;
import Z6.w;
import androidx.appcompat.app.E;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import x6.C6916E;
import x6.C6934p;

/* loaded from: classes2.dex */
public class b implements d {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f5831e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f5832f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f5833g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f5834h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5835i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5836j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5837k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5838l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5839m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name */
    private final int f5840b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name */
    public final I6.l f5841c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: d, reason: collision with root package name */
    private final q f5842d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    private final class a implements e, W0 {

        /* renamed from: o, reason: collision with root package name */
        private Object f5843o = c.f5864p;

        /* renamed from: s, reason: collision with root package name */
        private C0733p f5844s;

        public a() {
        }

        private final Object f(h hVar, int i8, long j8, A6.d dVar) {
            Boolean a8;
            b bVar = b.this;
            C0733p b8 = r.b(B6.b.c(dVar));
            try {
                this.f5844s = b8;
                Object r02 = bVar.r0(hVar, i8, j8, this);
                if (r02 == c.f5861m) {
                    bVar.e0(this, hVar, i8);
                } else {
                    I6.l lVar = null;
                    if (r02 == c.f5863o) {
                        if (j8 < bVar.I()) {
                            hVar.b();
                        }
                        h hVar2 = (h) b.f5836j.get(bVar);
                        while (true) {
                            if (bVar.P()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f5832f.getAndIncrement(bVar);
                            int i9 = c.f5850b;
                            long j9 = andIncrement / i9;
                            int i10 = (int) (andIncrement % i9);
                            if (hVar2.f6448t != j9) {
                                h B7 = bVar.B(j9, hVar2);
                                if (B7 != null) {
                                    hVar2 = B7;
                                }
                            }
                            Object r03 = bVar.r0(hVar2, i10, andIncrement, this);
                            if (r03 == c.f5861m) {
                                bVar.e0(this, hVar2, i10);
                                break;
                            }
                            if (r03 == c.f5863o) {
                                if (andIncrement < bVar.I()) {
                                    hVar2.b();
                                }
                            } else {
                                if (r03 == c.f5862n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                hVar2.b();
                                this.f5843o = r03;
                                this.f5844s = null;
                                a8 = kotlin.coroutines.jvm.internal.b.a(true);
                                I6.l lVar2 = bVar.f5841c;
                                if (lVar2 != null) {
                                    lVar = w.a(lVar2, r03, b8.getContext());
                                }
                            }
                        }
                    } else {
                        hVar.b();
                        this.f5843o = r02;
                        this.f5844s = null;
                        a8 = kotlin.coroutines.jvm.internal.b.a(true);
                        I6.l lVar3 = bVar.f5841c;
                        if (lVar3 != null) {
                            lVar = w.a(lVar3, r02, b8.getContext());
                        }
                    }
                    b8.p(a8, lVar);
                }
                Object z7 = b8.z();
                if (z7 == B6.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return z7;
            } catch (Throwable th) {
                b8.K();
                throw th;
            }
        }

        private final boolean g() {
            this.f5843o = c.z();
            Throwable E7 = b.this.E();
            if (E7 == null) {
                return false;
            }
            throw D.a(E7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C0733p c0733p = this.f5844s;
            J6.r.b(c0733p);
            this.f5844s = null;
            this.f5843o = c.z();
            Throwable E7 = b.this.E();
            if (E7 == null) {
                C6934p.a aVar = C6934p.f44487s;
                c0733p.resumeWith(C6934p.b(Boolean.FALSE));
            } else {
                C6934p.a aVar2 = C6934p.f44487s;
                c0733p.resumeWith(C6934p.b(x6.q.a(E7)));
            }
        }

        @Override // W6.e
        public Object a(A6.d dVar) {
            h hVar;
            b bVar = b.this;
            h hVar2 = (h) b.f5836j.get(bVar);
            while (!bVar.P()) {
                long andIncrement = b.f5832f.getAndIncrement(bVar);
                int i8 = c.f5850b;
                long j8 = andIncrement / i8;
                int i9 = (int) (andIncrement % i8);
                if (hVar2.f6448t != j8) {
                    h B7 = bVar.B(j8, hVar2);
                    if (B7 == null) {
                        continue;
                    } else {
                        hVar = B7;
                    }
                } else {
                    hVar = hVar2;
                }
                Object r02 = bVar.r0(hVar, i9, andIncrement, null);
                if (r02 == c.f5861m) {
                    throw new IllegalStateException("unreachable");
                }
                if (r02 != c.f5863o) {
                    if (r02 == c.f5862n) {
                        return f(hVar, i9, andIncrement, dVar);
                    }
                    hVar.b();
                    this.f5843o = r02;
                    return kotlin.coroutines.jvm.internal.b.a(true);
                }
                if (andIncrement < bVar.I()) {
                    hVar.b();
                }
                hVar2 = hVar;
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        @Override // U6.W0
        public void c(B b8, int i8) {
            C0733p c0733p = this.f5844s;
            if (c0733p != null) {
                c0733p.c(b8, i8);
            }
        }

        public final boolean i(Object obj) {
            C0733p c0733p = this.f5844s;
            J6.r.b(c0733p);
            this.f5844s = null;
            this.f5843o = obj;
            Boolean bool = Boolean.TRUE;
            I6.l lVar = b.this.f5841c;
            return c.B(c0733p, bool, lVar != null ? w.a(lVar, obj, c0733p.getContext()) : null);
        }

        public final void j() {
            C0733p c0733p = this.f5844s;
            J6.r.b(c0733p);
            this.f5844s = null;
            this.f5843o = c.z();
            Throwable E7 = b.this.E();
            if (E7 == null) {
                C6934p.a aVar = C6934p.f44487s;
                c0733p.resumeWith(C6934p.b(Boolean.FALSE));
            } else {
                C6934p.a aVar2 = C6934p.f44487s;
                c0733p.resumeWith(C6934p.b(x6.q.a(E7)));
            }
        }

        @Override // W6.e
        public Object next() {
            Object obj = this.f5843o;
            if (obj == c.f5864p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f5843o = c.f5864p;
            if (obj != c.z()) {
                return obj;
            }
            throw D.a(b.this.F());
        }
    }

    /* renamed from: W6.b$b, reason: collision with other inner class name */
    static final class C0114b extends s implements q {

        /* renamed from: W6.b$b$a */
        static final class a extends s implements I6.l {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Object f5847o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f5848s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b bVar, c7.a aVar) {
                super(1);
                this.f5847o = obj;
                this.f5848s = bVar;
            }

            public final void b(Throwable th) {
                if (this.f5847o == c.z()) {
                    return;
                }
                I6.l lVar = this.f5848s.f5841c;
                throw null;
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return C6916E.f44463a;
            }
        }

        C0114b() {
            super(3);
        }

        public final I6.l b(c7.a aVar, Object obj, Object obj2) {
            return new a(obj2, b.this, aVar);
        }

        @Override // I6.q
        public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
            E.a(obj);
            return b(null, obj2, obj3);
        }
    }

    public b(int i8, I6.l lVar) {
        this.f5840b = i8;
        this.f5841c = lVar;
        if (i8 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i8 + ", should be >=0").toString());
        }
        this.bufferEnd = c.A(i8);
        this.completedExpandBuffersAndPauseFlag = D();
        h hVar = new h(0L, null, this, 3);
        this.sendSegment = hVar;
        this.receiveSegment = hVar;
        if (U()) {
            hVar = c.f5849a;
            J6.r.c(hVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = hVar;
        this.f5842d = lVar != null ? new C0114b() : null;
        this._closeCause = c.f5867s;
    }

    private final h A(long j8, h hVar, long j9) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5837k;
        p pVar = (p) c.y();
        loop0: while (true) {
            c8 = AbstractC0790d.c(hVar, j8, pVar);
            if (!C.c(c8)) {
                B b8 = C.b(c8);
                while (true) {
                    B b9 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b9.f6448t >= b8.f6448t) {
                        break loop0;
                    }
                    if (!b8.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b9, b8)) {
                        if (b9.m()) {
                            b9.k();
                        }
                    } else if (b8.m()) {
                        b8.k();
                    }
                }
            } else {
                break;
            }
        }
        if (C.c(c8)) {
            x();
            Z(j8, hVar);
            L(this, 0L, 1, null);
            return null;
        }
        h hVar2 = (h) C.b(c8);
        long j10 = hVar2.f6448t;
        if (j10 <= j8) {
            return hVar2;
        }
        int i8 = c.f5850b;
        if (f5833g.compareAndSet(this, j9 + 1, i8 * j10)) {
            K((hVar2.f6448t * i8) - j9);
            return null;
        }
        L(this, 0L, 1, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h B(long j8, h hVar) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5836j;
        p pVar = (p) c.y();
        loop0: while (true) {
            c8 = AbstractC0790d.c(hVar, j8, pVar);
            if (!C.c(c8)) {
                B b8 = C.b(c8);
                while (true) {
                    B b9 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b9.f6448t >= b8.f6448t) {
                        break loop0;
                    }
                    if (!b8.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b9, b8)) {
                        if (b9.m()) {
                            b9.k();
                        }
                    } else if (b8.m()) {
                        b8.k();
                    }
                }
            } else {
                break;
            }
        }
        if (C.c(c8)) {
            x();
            if (hVar.f6448t * c.f5850b >= I()) {
                return null;
            }
            hVar.b();
            return null;
        }
        h hVar2 = (h) C.b(c8);
        if (!U() && j8 <= D() / c.f5850b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5837k;
            while (true) {
                B b10 = (B) atomicReferenceFieldUpdater2.get(this);
                if (b10.f6448t >= hVar2.f6448t || !hVar2.q()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, b10, hVar2)) {
                    if (b10.m()) {
                        b10.k();
                    }
                } else if (hVar2.m()) {
                    hVar2.k();
                }
            }
        }
        long j9 = hVar2.f6448t;
        if (j9 <= j8) {
            return hVar2;
        }
        int i8 = c.f5850b;
        v0(j9 * i8);
        if (hVar2.f6448t * i8 >= I()) {
            return null;
        }
        hVar2.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h C(long j8, h hVar) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5835i;
        p pVar = (p) c.y();
        loop0: while (true) {
            c8 = AbstractC0790d.c(hVar, j8, pVar);
            if (!C.c(c8)) {
                B b8 = C.b(c8);
                while (true) {
                    B b9 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b9.f6448t >= b8.f6448t) {
                        break loop0;
                    }
                    if (!b8.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b9, b8)) {
                        if (b9.m()) {
                            b9.k();
                        }
                    } else if (b8.m()) {
                        b8.k();
                    }
                }
            } else {
                break;
            }
        }
        if (C.c(c8)) {
            x();
            if (hVar.f6448t * c.f5850b >= G()) {
                return null;
            }
            hVar.b();
            return null;
        }
        h hVar2 = (h) C.b(c8);
        long j9 = hVar2.f6448t;
        if (j9 <= j8) {
            return hVar2;
        }
        int i8 = c.f5850b;
        w0(j9 * i8);
        if (hVar2.f6448t * i8 >= G()) {
            return null;
        }
        hVar2.b();
        return null;
    }

    private final long D() {
        return f5833g.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable F() {
        Throwable E7 = E();
        return E7 == null ? new ClosedReceiveChannelException("Channel was closed") : E7;
    }

    private final void K(long j8) {
        if ((f5834h.addAndGet(this, j8) & 4611686018427387904L) != 0) {
            while ((f5834h.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void L(b bVar, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i8 & 1) != 0) {
            j8 = 1;
        }
        bVar.K(j8);
    }

    private final void M() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5839m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? c.f5865q : c.f5866r));
        if (obj == null) {
            return;
        }
        ((I6.l) obj).invoke(E());
    }

    private final boolean N(h hVar, int i8, long j8) {
        Object w7;
        do {
            w7 = hVar.w(i8);
            if (w7 != null && w7 != c.f5853e) {
                if (w7 == c.f5852d) {
                    return true;
                }
                if (w7 == c.f5858j || w7 == c.z() || w7 == c.f5857i || w7 == c.f5856h) {
                    return false;
                }
                if (w7 == c.f5855g) {
                    return true;
                }
                return w7 != c.f5854f && j8 == G();
            }
        } while (!hVar.r(i8, w7, c.f5856h));
        z();
        return false;
    }

    private final boolean O(long j8, boolean z7) {
        int i8 = (int) (j8 >> 60);
        if (i8 == 0 || i8 == 1) {
            return false;
        }
        if (i8 == 2) {
            w(j8 & 1152921504606846975L);
            if (z7 && J()) {
                return false;
            }
        } else {
            if (i8 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i8).toString());
            }
            v(j8 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean Q(long j8) {
        return O(j8, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S(long j8) {
        return O(j8, false);
    }

    private final boolean U() {
        long D7 = D();
        return D7 == 0 || D7 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (W6.h) r8.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long V(W6.h r8) {
        /*
            r7 = this;
        L0:
            int r0 = W6.c.f5850b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f6448t
            int r5 = W6.c.f5850b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.G()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.w(r0)
            if (r1 == 0) goto L2c
            Z6.E r2 = W6.c.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            Z6.E r2 = W6.c.f5852d
            if (r1 != r2) goto L39
            return r3
        L2c:
            Z6.E r2 = W6.c.z()
            boolean r1 = r8.r(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.p()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            Z6.e r8 = r8.g()
            W6.h r8 = (W6.h) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.b.V(W6.h):long");
    }

    private final void W() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5831e;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (((int) (j8 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, c.w(1152921504606846975L & j8, 1)));
    }

    private final void X() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5831e;
        do {
            j8 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, c.w(1152921504606846975L & j8, 3)));
    }

    private final void Y() {
        long j8;
        long w7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5831e;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j8 >> 60);
            if (i8 == 0) {
                w7 = c.w(j8 & 1152921504606846975L, 2);
            } else if (i8 != 1) {
                return;
            } else {
                w7 = c.w(j8 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, w7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Z(long r5, W6.h r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f6448t
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            Z6.e r0 = r7.e()
            W6.h r0 = (W6.h) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.h()
            if (r5 == 0) goto L22
            Z6.e r5 = r7.e()
            W6.h r5 = (W6.h) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = W6.b.f5837k
        L24:
            java.lang.Object r6 = r5.get(r4)
            Z6.B r6 = (Z6.B) r6
            long r0 = r6.f6448t
            long r2 = r7.f6448t
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = androidx.concurrent.futures.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m()
            if (r5 == 0) goto L49
            r6.k()
        L49:
            return
        L4a:
            boolean r6 = r7.m()
            if (r6 == 0) goto L24
            r7.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.b.Z(long, W6.h):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(InterfaceC0731o interfaceC0731o) {
        C6934p.a aVar = C6934p.f44487s;
        interfaceC0731o.resumeWith(C6934p.b(x6.q.a(F())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(W0 w02, h hVar, int i8) {
        d0();
        w02.c(hVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(W0 w02, h hVar, int i8) {
        w02.c(hVar, i8 + c.f5850b);
    }

    static /* synthetic */ Object g0(b bVar, A6.d dVar) {
        h hVar = (h) f5836j.get(bVar);
        while (!bVar.P()) {
            long andIncrement = f5832f.getAndIncrement(bVar);
            int i8 = c.f5850b;
            long j8 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (hVar.f6448t != j8) {
                h B7 = bVar.B(j8, hVar);
                if (B7 == null) {
                    continue;
                } else {
                    hVar = B7;
                }
            }
            Object r02 = bVar.r0(hVar, i9, andIncrement, null);
            if (r02 == c.f5861m) {
                throw new IllegalStateException("unexpected");
            }
            if (r02 != c.f5863o) {
                if (r02 == c.f5862n) {
                    return bVar.h0(hVar, i9, andIncrement, dVar);
                }
                hVar.b();
                return r02;
            }
            if (andIncrement < bVar.I()) {
                hVar.b();
            }
        }
        throw D.a(bVar.F());
    }

    private final Object h0(h hVar, int i8, long j8, A6.d dVar) {
        C0733p b8 = r.b(B6.b.c(dVar));
        try {
            Object r02 = r0(hVar, i8, j8, b8);
            if (r02 == c.f5861m) {
                e0(b8, hVar, i8);
            } else {
                I6.l lVar = null;
                lVar = null;
                if (r02 == c.f5863o) {
                    if (j8 < I()) {
                        hVar.b();
                    }
                    h hVar2 = (h) f5836j.get(this);
                    while (true) {
                        if (P()) {
                            b0(b8);
                            break;
                        }
                        long andIncrement = f5832f.getAndIncrement(this);
                        int i9 = c.f5850b;
                        long j9 = andIncrement / i9;
                        int i10 = (int) (andIncrement % i9);
                        if (hVar2.f6448t != j9) {
                            h B7 = B(j9, hVar2);
                            if (B7 != null) {
                                hVar2 = B7;
                            }
                        }
                        r02 = r0(hVar2, i10, andIncrement, b8);
                        if (r02 == c.f5861m) {
                            C0733p c0733p = b8 instanceof W0 ? b8 : null;
                            if (c0733p != null) {
                                e0(c0733p, hVar2, i10);
                            }
                        } else if (r02 == c.f5863o) {
                            if (andIncrement < I()) {
                                hVar2.b();
                            }
                        } else {
                            if (r02 == c.f5862n) {
                                throw new IllegalStateException("unexpected");
                            }
                            hVar2.b();
                            I6.l lVar2 = this.f5841c;
                            if (lVar2 != null) {
                                lVar = w.a(lVar2, r02, b8.getContext());
                            }
                        }
                    }
                } else {
                    hVar.b();
                    I6.l lVar3 = this.f5841c;
                    if (lVar3 != null) {
                        lVar = w.a(lVar3, r02, b8.getContext());
                    }
                }
                b8.p(r02, lVar);
            }
            Object z7 = b8.z();
            if (z7 == B6.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z7;
        } catch (Throwable th) {
            b8.K();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (W6.h) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i0(W6.h r12) {
        /*
            r11 = this;
            I6.l r0 = r11.f5841c
            r1 = 0
            r2 = 1
            java.lang.Object r3 = Z6.AbstractC0797k.b(r1, r2, r1)
        L8:
            int r4 = W6.c.f5850b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f6448t
            int r8 = W6.c.f5850b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.w(r4)
            Z6.E r9 = W6.c.f()
            if (r8 == r9) goto Lbb
            Z6.E r9 = W6.c.f5852d
            if (r8 != r9) goto L48
            long r9 = r11.G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            Z6.E r9 = W6.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = Z6.w.c(r0, r5, r1)
        L40:
            r12.s(r4)
            r12.p()
            goto Laf
        L48:
            Z6.E r9 = W6.c.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof U6.W0
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof W6.l
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            Z6.E r9 = W6.c.p()
            if (r8 == r9) goto Lbb
            Z6.E r9 = W6.c.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            Z6.E r9 = W6.c.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof W6.l
            if (r9 == 0) goto L80
            r9 = r8
            W6.l r9 = (W6.l) r9
            U6.W0 r9 = r9.f5879a
            goto L83
        L80:
            r9 = r8
            U6.W0 r9 = (U6.W0) r9
        L83:
            Z6.E r10 = W6.c.z()
            boolean r8 = r12.r(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = Z6.w.c(r0, r5, r1)
        L97:
            java.lang.Object r3 = Z6.AbstractC0797k.c(r3, r9)
            r12.s(r4)
            r12.p()
            goto Laf
        La2:
            Z6.E r9 = W6.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.p()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            Z6.e r12 = r12.g()
            W6.h r12 = (W6.h) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            U6.W0 r3 = (U6.W0) r3
            r11.k0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            J6.r.c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            U6.W0 r0 = (U6.W0) r0
            r11.k0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.b.i0(W6.h):void");
    }

    private final void j0(W0 w02) {
        l0(w02, true);
    }

    private final void k0(W0 w02) {
        l0(w02, false);
    }

    private final void l0(W0 w02, boolean z7) {
        if (w02 instanceof InterfaceC0731o) {
            A6.d dVar = (A6.d) w02;
            C6934p.a aVar = C6934p.f44487s;
            dVar.resumeWith(C6934p.b(x6.q.a(z7 ? F() : H())));
        } else {
            if (w02 instanceof a) {
                ((a) w02).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + w02).toString());
        }
    }

    private final boolean m0(long j8) {
        if (S(j8)) {
            return false;
        }
        return !r(j8 & 1152921504606846975L);
    }

    private final boolean n0(Object obj, Object obj2) {
        if (obj instanceof a) {
            J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC0731o) {
            J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0731o interfaceC0731o = (InterfaceC0731o) obj;
            I6.l lVar = this.f5841c;
            return c.B(interfaceC0731o, obj2, lVar != null ? w.a(lVar, obj2, interfaceC0731o.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean o0(Object obj, h hVar, int i8) {
        if (obj instanceof InterfaceC0731o) {
            J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((InterfaceC0731o) obj, C6916E.f44463a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final boolean p0(h hVar, int i8, long j8) {
        Object w7 = hVar.w(i8);
        if (!(w7 instanceof W0) || j8 < f5832f.get(this) || !hVar.r(i8, w7, c.f5855g)) {
            return q0(hVar, i8, j8);
        }
        if (o0(w7, hVar, i8)) {
            hVar.A(i8, c.f5852d);
            return true;
        }
        hVar.A(i8, c.f5858j);
        hVar.x(i8, false);
        return false;
    }

    private final boolean q0(h hVar, int i8, long j8) {
        while (true) {
            Object w7 = hVar.w(i8);
            if (w7 instanceof W0) {
                if (j8 < f5832f.get(this)) {
                    if (hVar.r(i8, w7, new l((W0) w7))) {
                        return true;
                    }
                } else if (hVar.r(i8, w7, c.f5855g)) {
                    if (o0(w7, hVar, i8)) {
                        hVar.A(i8, c.f5852d);
                        return true;
                    }
                    hVar.A(i8, c.f5858j);
                    hVar.x(i8, false);
                    return false;
                }
            } else {
                if (w7 == c.f5858j) {
                    return false;
                }
                if (w7 == null) {
                    if (hVar.r(i8, w7, c.f5853e)) {
                        return true;
                    }
                } else {
                    if (w7 == c.f5852d || w7 == c.f5856h || w7 == c.f5857i || w7 == c.f5859k || w7 == c.z()) {
                        return true;
                    }
                    if (w7 != c.f5854f) {
                        throw new IllegalStateException(("Unexpected cell state: " + w7).toString());
                    }
                }
            }
        }
    }

    private final boolean r(long j8) {
        return j8 < D() || j8 < G() + ((long) this.f5840b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r0(h hVar, int i8, long j8, Object obj) {
        Object w7 = hVar.w(i8);
        if (w7 == null) {
            if (j8 >= (f5831e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f5862n;
                }
                if (hVar.r(i8, w7, obj)) {
                    z();
                    return c.f5861m;
                }
            }
        } else if (w7 == c.f5852d && hVar.r(i8, w7, c.f5857i)) {
            z();
            return hVar.y(i8);
        }
        return s0(hVar, i8, j8, obj);
    }

    private final void s(h hVar, long j8) {
        Object b8 = AbstractC0797k.b(null, 1, null);
        loop0: while (hVar != null) {
            for (int i8 = c.f5850b - 1; -1 < i8; i8--) {
                if ((hVar.f6448t * c.f5850b) + i8 < j8) {
                    break loop0;
                }
                while (true) {
                    Object w7 = hVar.w(i8);
                    if (w7 != null && w7 != c.f5853e) {
                        if (!(w7 instanceof l)) {
                            if (!(w7 instanceof W0)) {
                                break;
                            }
                            if (hVar.r(i8, w7, c.z())) {
                                b8 = AbstractC0797k.c(b8, w7);
                                hVar.x(i8, true);
                                break;
                            }
                        } else {
                            if (hVar.r(i8, w7, c.z())) {
                                b8 = AbstractC0797k.c(b8, ((l) w7).f5879a);
                                hVar.x(i8, true);
                                break;
                            }
                        }
                    } else {
                        if (hVar.r(i8, w7, c.z())) {
                            hVar.p();
                            break;
                        }
                    }
                }
            }
            hVar = (h) hVar.g();
        }
        if (b8 != null) {
            if (!(b8 instanceof ArrayList)) {
                j0((W0) b8);
                return;
            }
            J6.r.c(b8, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b8;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                j0((W0) arrayList.get(size));
            }
        }
    }

    private final Object s0(h hVar, int i8, long j8, Object obj) {
        while (true) {
            Object w7 = hVar.w(i8);
            if (w7 == null || w7 == c.f5853e) {
                if (j8 < (f5831e.get(this) & 1152921504606846975L)) {
                    if (hVar.r(i8, w7, c.f5856h)) {
                        z();
                        return c.f5863o;
                    }
                } else {
                    if (obj == null) {
                        return c.f5862n;
                    }
                    if (hVar.r(i8, w7, obj)) {
                        z();
                        return c.f5861m;
                    }
                }
            } else {
                if (w7 != c.f5852d) {
                    if (w7 != c.f5858j && w7 != c.f5856h) {
                        if (w7 == c.z()) {
                            z();
                            return c.f5863o;
                        }
                        if (w7 != c.f5855g && hVar.r(i8, w7, c.f5854f)) {
                            boolean z7 = w7 instanceof l;
                            if (z7) {
                                w7 = ((l) w7).f5879a;
                            }
                            if (o0(w7, hVar, i8)) {
                                hVar.A(i8, c.f5857i);
                                z();
                                return hVar.y(i8);
                            }
                            hVar.A(i8, c.f5858j);
                            hVar.x(i8, false);
                            if (z7) {
                                z();
                            }
                            return c.f5863o;
                        }
                    }
                    return c.f5863o;
                }
                if (hVar.r(i8, w7, c.f5857i)) {
                    z();
                    return hVar.y(i8);
                }
            }
        }
    }

    private final h t() {
        Object obj = f5837k.get(this);
        h hVar = (h) f5835i.get(this);
        if (hVar.f6448t > ((h) obj).f6448t) {
            obj = hVar;
        }
        h hVar2 = (h) f5836j.get(this);
        if (hVar2.f6448t > ((h) obj).f6448t) {
            obj = hVar2;
        }
        return (h) AbstractC0790d.b((AbstractC0791e) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int t0(h hVar, int i8, Object obj, long j8, Object obj2, boolean z7) {
        hVar.B(i8, obj);
        if (z7) {
            return u0(hVar, i8, obj, j8, obj2, z7);
        }
        Object w7 = hVar.w(i8);
        if (w7 == null) {
            if (r(j8)) {
                if (hVar.r(i8, null, c.f5852d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (hVar.r(i8, null, obj2)) {
                    return 2;
                }
            }
        } else if (w7 instanceof W0) {
            hVar.s(i8);
            if (n0(w7, obj)) {
                hVar.A(i8, c.f5857i);
                c0();
                return 0;
            }
            if (hVar.t(i8, c.f5859k) != c.f5859k) {
                hVar.x(i8, true);
            }
            return 5;
        }
        return u0(hVar, i8, obj, j8, obj2, z7);
    }

    private final int u0(h hVar, int i8, Object obj, long j8, Object obj2, boolean z7) {
        while (true) {
            Object w7 = hVar.w(i8);
            if (w7 == null) {
                if (!r(j8) || z7) {
                    if (z7) {
                        if (hVar.r(i8, null, c.f5858j)) {
                            hVar.x(i8, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (hVar.r(i8, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (hVar.r(i8, null, c.f5852d)) {
                    return 1;
                }
            } else {
                if (w7 != c.f5853e) {
                    if (w7 == c.f5859k) {
                        hVar.s(i8);
                        return 5;
                    }
                    if (w7 == c.f5856h) {
                        hVar.s(i8);
                        return 5;
                    }
                    if (w7 == c.z()) {
                        hVar.s(i8);
                        x();
                        return 4;
                    }
                    hVar.s(i8);
                    if (w7 instanceof l) {
                        w7 = ((l) w7).f5879a;
                    }
                    if (n0(w7, obj)) {
                        hVar.A(i8, c.f5857i);
                        c0();
                        return 0;
                    }
                    if (hVar.t(i8, c.f5859k) != c.f5859k) {
                        hVar.x(i8, true);
                    }
                    return 5;
                }
                if (hVar.r(i8, w7, c.f5852d)) {
                    return 1;
                }
            }
        }
    }

    private final void v(long j8) {
        i0(w(j8));
    }

    private final void v0(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5832f;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            if (j9 >= j8) {
                return;
            }
        } while (!f5832f.compareAndSet(this, j9, j8));
    }

    private final h w(long j8) {
        h t7 = t();
        if (T()) {
            long V7 = V(t7);
            if (V7 != -1) {
                y(V7);
            }
        }
        s(t7, j8);
        return t7;
    }

    private final void w0(long j8) {
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5831e;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            j10 = 1152921504606846975L & j9;
            if (j10 >= j8) {
                return;
            }
        } while (!f5831e.compareAndSet(this, j9, c.w(j10, (int) (j9 >> 60))));
    }

    private final void x() {
        R();
    }

    private final void z() {
        if (U()) {
            return;
        }
        h hVar = (h) f5837k.get(this);
        while (true) {
            long andIncrement = f5833g.getAndIncrement(this);
            int i8 = c.f5850b;
            long j8 = andIncrement / i8;
            if (I() <= andIncrement) {
                if (hVar.f6448t < j8 && hVar.e() != null) {
                    Z(j8, hVar);
                }
                L(this, 0L, 1, null);
                return;
            }
            if (hVar.f6448t != j8) {
                h A7 = A(j8, hVar, andIncrement);
                if (A7 == null) {
                    continue;
                } else {
                    hVar = A7;
                }
            }
            if (p0(hVar, (int) (andIncrement % i8), andIncrement)) {
                L(this, 0L, 1, null);
                return;
            }
            L(this, 0L, 1, null);
        }
    }

    protected final Throwable E() {
        return (Throwable) f5838l.get(this);
    }

    public final long G() {
        return f5832f.get(this);
    }

    protected final Throwable H() {
        Throwable E7 = E();
        return E7 == null ? new ClosedSendChannelException("Channel was closed") : E7;
    }

    public final long I() {
        return f5831e.get(this) & 1152921504606846975L;
    }

    public final boolean J() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5836j;
            h hVar = (h) atomicReferenceFieldUpdater.get(this);
            long G7 = G();
            if (I() <= G7) {
                return false;
            }
            int i8 = c.f5850b;
            long j8 = G7 / i8;
            if (hVar.f6448t == j8 || (hVar = B(j8, hVar)) != null) {
                hVar.b();
                if (N(hVar, (int) (G7 % i8), G7)) {
                    return true;
                }
                f5832f.compareAndSet(this, G7, G7 + 1);
            } else if (((h) atomicReferenceFieldUpdater.get(this)).f6448t < j8) {
                return false;
            }
        }
    }

    public boolean P() {
        return Q(f5831e.get(this));
    }

    public boolean R() {
        return S(f5831e.get(this));
    }

    protected boolean T() {
        return false;
    }

    @Override // W6.k
    public boolean a(Throwable th) {
        return u(th, false);
    }

    @Override // W6.j
    public Object b() {
        h hVar;
        long j8 = f5832f.get(this);
        long j9 = f5831e.get(this);
        if (Q(j9)) {
            return g.f5872a.a(E());
        }
        if (j8 >= (j9 & 1152921504606846975L)) {
            return g.f5872a.b();
        }
        Object obj = c.f5859k;
        h hVar2 = (h) f5836j.get(this);
        while (!P()) {
            long andIncrement = f5832f.getAndIncrement(this);
            int i8 = c.f5850b;
            long j10 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (hVar2.f6448t != j10) {
                h B7 = B(j10, hVar2);
                if (B7 == null) {
                    continue;
                } else {
                    hVar = B7;
                }
            } else {
                hVar = hVar2;
            }
            Object r02 = r0(hVar, i9, andIncrement, obj);
            if (r02 == c.f5861m) {
                W0 w02 = obj instanceof W0 ? (W0) obj : null;
                if (w02 != null) {
                    e0(w02, hVar, i9);
                }
                x0(andIncrement);
                hVar.p();
                return g.f5872a.b();
            }
            if (r02 != c.f5863o) {
                if (r02 == c.f5862n) {
                    throw new IllegalStateException("unexpected");
                }
                hVar.b();
                return g.f5872a.c(r02);
            }
            if (andIncrement < I()) {
                hVar.b();
            }
            hVar2 = hVar;
        }
        return g.f5872a.a(E());
    }

    @Override // W6.j
    public Object c(A6.d dVar) {
        return g0(this, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return W6.g.f5872a.c(x6.C6916E.f44463a);
     */
    @Override // W6.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = W6.b.f5831e
            long r0 = r0.get(r14)
            boolean r0 = r14.m0(r0)
            if (r0 == 0) goto L13
            W6.g$b r15 = W6.g.f5872a
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            Z6.E r8 = W6.c.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = j()
            java.lang.Object r0 = r0.get(r14)
            W6.h r0 = (W6.h) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = k()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = l(r14, r1)
            int r1 = W6.c.f5850b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f6448t
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            W6.h r1 = f(r14, r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L21
        L4b:
            W6.g$b r15 = W6.g.f5872a
            java.lang.Throwable r0 = r14.H()
            java.lang.Object r15 = r15.a(r0)
            goto Lba
        L57:
            r13 = r1
            goto L5a
        L59:
            r13 = r0
        L5a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = q(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb6
            r1 = 1
            if (r0 == r1) goto Lad
            r1 = 2
            if (r0 == r1) goto L90
            r1 = 3
            if (r0 == r1) goto L88
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L77
            goto L7a
        L77:
            r13.b()
        L7a:
            r0 = r13
            goto L21
        L7c:
            long r0 = r14.G()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4b
            r13.b()
            goto L4b
        L88:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L90:
            if (r11 == 0) goto L96
            r13.p()
            goto L4b
        L96:
            boolean r15 = r8 instanceof U6.W0
            if (r15 == 0) goto L9d
            U6.W0 r8 = (U6.W0) r8
            goto L9e
        L9d:
            r8 = 0
        L9e:
            if (r8 == 0) goto La3
            o(r14, r8, r13, r12)
        La3:
            r13.p()
            W6.g$b r15 = W6.g.f5872a
            java.lang.Object r15 = r15.b()
            goto Lba
        Lad:
            W6.g$b r15 = W6.g.f5872a
            x6.E r0 = x6.C6916E.f44463a
            java.lang.Object r15 = r15.c(r0)
            goto Lba
        Lb6:
            r13.b()
            goto Lad
        Lba:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.b.d(java.lang.Object):java.lang.Object");
    }

    @Override // W6.j
    public e iterator() {
        return new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b2, code lost:
    
        r3 = (W6.h) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b9, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.b.toString():java.lang.String");
    }

    protected boolean u(Throwable th, boolean z7) {
        if (z7) {
            W();
        }
        boolean a8 = androidx.concurrent.futures.b.a(f5838l, this, c.f5867s, th);
        if (z7) {
            X();
        } else {
            Y();
        }
        x();
        a0();
        if (a8) {
            M();
        }
        return a8;
    }

    public final void x0(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        if (U()) {
            return;
        }
        while (D() <= j8) {
        }
        int i8 = c.f5851c;
        for (int i9 = 0; i9 < i8; i9++) {
            long D7 = D();
            if (D7 == (4611686018427387903L & f5834h.get(this)) && D7 == D()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5834h;
        do {
            j9 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, c.v(j9 & 4611686018427387903L, true)));
        while (true) {
            long D8 = D();
            atomicLongFieldUpdater = f5834h;
            long j11 = atomicLongFieldUpdater.get(this);
            long j12 = j11 & 4611686018427387903L;
            boolean z7 = (4611686018427387904L & j11) != 0;
            if (D8 == j12 && D8 == D()) {
                break;
            } else if (!z7) {
                atomicLongFieldUpdater.compareAndSet(this, j11, c.v(j12, true));
            }
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.v(j10 & 4611686018427387903L, false)));
    }

    protected final void y(long j8) {
        UndeliveredElementException d8;
        h hVar = (h) f5836j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5832f;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(this.f5840b + j9, D())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, j9 + 1)) {
                int i8 = c.f5850b;
                long j10 = j9 / i8;
                int i9 = (int) (j9 % i8);
                if (hVar.f6448t != j10) {
                    h B7 = B(j10, hVar);
                    if (B7 == null) {
                        continue;
                    } else {
                        hVar = B7;
                    }
                }
                Object r02 = r0(hVar, i9, j9, null);
                if (r02 != c.f5863o) {
                    hVar.b();
                    I6.l lVar = this.f5841c;
                    if (lVar != null && (d8 = w.d(lVar, r02, null, 2, null)) != null) {
                        throw d8;
                    }
                } else if (j9 < I()) {
                    hVar.b();
                }
            }
        }
    }

    protected void a0() {
    }

    protected void c0() {
    }

    protected void d0() {
    }
}
