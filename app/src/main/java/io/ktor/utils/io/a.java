package io.ktor.utils.io;

import J6.AbstractC0650j;
import J6.r;
import J6.s;
import U6.InterfaceC0731o;
import U6.InterfaceC0745v0;
import io.ktor.utils.io.internal.f;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import x6.C6916E;
import x6.C6934p;

/* loaded from: classes2.dex */
public class a implements io.ktor.utils.io.c, io.ktor.utils.io.f, io.ktor.utils.io.i {

    /* renamed from: l, reason: collision with root package name */
    public static final C0272a f36758l = new C0272a(null);

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36759m = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state");

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36760n = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_closed");

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36761o = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_readOp");

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f36762p = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_writeOp");
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile InterfaceC0745v0 attachedJob;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36763b;

    /* renamed from: c, reason: collision with root package name */
    private final Z5.g f36764c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36765d;

    /* renamed from: e, reason: collision with root package name */
    private int f36766e;

    /* renamed from: f, reason: collision with root package name */
    private int f36767f;

    /* renamed from: g, reason: collision with root package name */
    private final io.ktor.utils.io.internal.e f36768g;

    /* renamed from: h, reason: collision with root package name */
    private final io.ktor.utils.io.internal.j f36769h;

    /* renamed from: i, reason: collision with root package name */
    private final io.ktor.utils.io.internal.a f36770i;

    /* renamed from: j, reason: collision with root package name */
    private final io.ktor.utils.io.internal.a f36771j;
    private volatile io.ktor.utils.io.internal.c joining;

    /* renamed from: k, reason: collision with root package name */
    private final I6.l f36772k;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    /* renamed from: io.ktor.utils.io.a$a, reason: collision with other inner class name */
    public static final class C0272a {
        public /* synthetic */ C0272a(AbstractC0650j abstractC0650j) {
            this();
        }

        private C0272a() {
        }
    }

    static final class b extends s implements I6.l {
        b() {
            super(1);
        }

        public final void b(Throwable th) {
            a.this.attachedJob = null;
            if (th == null) {
                return;
            }
            a.this.b(io.ktor.utils.io.o.a(th));
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A, reason: collision with root package name */
        Object f36774A;

        /* renamed from: B, reason: collision with root package name */
        long f36775B;

        /* renamed from: C, reason: collision with root package name */
        long f36776C;

        /* renamed from: D, reason: collision with root package name */
        boolean f36777D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f36778E;

        /* renamed from: G, reason: collision with root package name */
        int f36780G;

        /* renamed from: o, reason: collision with root package name */
        Object f36781o;

        /* renamed from: s, reason: collision with root package name */
        Object f36782s;

        /* renamed from: t, reason: collision with root package name */
        Object f36783t;

        /* renamed from: u, reason: collision with root package name */
        Object f36784u;

        /* renamed from: v, reason: collision with root package name */
        Object f36785v;

        /* renamed from: w, reason: collision with root package name */
        Object f36786w;

        /* renamed from: x, reason: collision with root package name */
        Object f36787x;

        /* renamed from: y, reason: collision with root package name */
        Object f36788y;

        /* renamed from: z, reason: collision with root package name */
        Object f36789z;

        c(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36778E = obj;
            this.f36780G |= Integer.MIN_VALUE;
            return a.this.N(null, 0L, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36790o;

        /* renamed from: s, reason: collision with root package name */
        Object f36791s;

        /* renamed from: t, reason: collision with root package name */
        long f36792t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f36793u;

        /* renamed from: w, reason: collision with root package name */
        int f36795w;

        d(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36793u = obj;
            this.f36795w |= Integer.MIN_VALUE;
            return a.this.Q(0L, 0L, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36796o;

        /* renamed from: s, reason: collision with root package name */
        Object f36797s;

        /* renamed from: t, reason: collision with root package name */
        int f36798t;

        /* renamed from: u, reason: collision with root package name */
        int f36799u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f36800v;

        /* renamed from: x, reason: collision with root package name */
        int f36802x;

        e(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36800v = obj;
            this.f36802x |= Integer.MIN_VALUE;
            return a.this.h0(null, 0, 0, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36803o;

        /* renamed from: s, reason: collision with root package name */
        Object f36804s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f36805t;

        /* renamed from: v, reason: collision with root package name */
        int f36807v;

        f(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36805t = obj;
            this.f36807v |= Integer.MIN_VALUE;
            return a.this.g0(null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36808o;

        /* renamed from: s, reason: collision with root package name */
        Object f36809s;

        /* renamed from: t, reason: collision with root package name */
        Object f36810t;

        /* renamed from: u, reason: collision with root package name */
        Object f36811u;

        /* renamed from: v, reason: collision with root package name */
        Object f36812v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f36813w;

        /* renamed from: y, reason: collision with root package name */
        int f36815y;

        g(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36813w = obj;
            this.f36815y |= Integer.MIN_VALUE;
            return a.this.j0(0L, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36816o;

        /* renamed from: s, reason: collision with root package name */
        int f36817s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f36818t;

        /* renamed from: v, reason: collision with root package name */
        int f36820v;

        h(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36818t = obj;
            this.f36820v |= Integer.MIN_VALUE;
            return a.this.l0(0, this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36821o;

        /* renamed from: s, reason: collision with root package name */
        int f36822s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f36823t;

        /* renamed from: v, reason: collision with root package name */
        int f36825v;

        i(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36823t = obj;
            this.f36825v |= Integer.MIN_VALUE;
            return a.this.m0(0, this);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36826o;

        /* renamed from: s, reason: collision with root package name */
        Object f36827s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f36828t;

        /* renamed from: v, reason: collision with root package name */
        int f36830v;

        j(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36828t = obj;
            this.f36830v |= Integer.MIN_VALUE;
            return a.this.P0(null, this);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36831o;

        /* renamed from: s, reason: collision with root package name */
        Object f36832s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f36833t;

        /* renamed from: v, reason: collision with root package name */
        int f36835v;

        k(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36833t = obj;
            this.f36835v |= Integer.MIN_VALUE;
            return a.this.O0(null, this);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36836o;

        /* renamed from: s, reason: collision with root package name */
        Object f36837s;

        /* renamed from: t, reason: collision with root package name */
        int f36838t;

        /* renamed from: u, reason: collision with root package name */
        int f36839u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f36840v;

        /* renamed from: x, reason: collision with root package name */
        int f36842x;

        l(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36840v = obj;
            this.f36842x |= Integer.MIN_VALUE;
            return a.this.Q0(null, 0, 0, this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36843o;

        /* renamed from: s, reason: collision with root package name */
        Object f36844s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f36845t;

        /* renamed from: v, reason: collision with root package name */
        int f36847v;

        m(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36845t = obj;
            this.f36847v |= Integer.MIN_VALUE;
            return a.this.S0(null, this);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36848o;

        /* renamed from: s, reason: collision with root package name */
        Object f36849s;

        /* renamed from: t, reason: collision with root package name */
        int f36850t;

        /* renamed from: u, reason: collision with root package name */
        int f36851u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f36852v;

        /* renamed from: x, reason: collision with root package name */
        int f36854x;

        n(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36852v = obj;
            this.f36854x |= Integer.MIN_VALUE;
            return a.this.U0(null, 0, 0, this);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36855o;

        /* renamed from: s, reason: collision with root package name */
        int f36856s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f36857t;

        /* renamed from: v, reason: collision with root package name */
        int f36859v;

        o(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36857t = obj;
            this.f36859v |= Integer.MIN_VALUE;
            return a.this.T0(0, this);
        }
    }

    static final class p extends s implements I6.l {
        p() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A6.d dVar) {
            Throwable c8;
            r.e(dVar, "ucont");
            int i8 = a.this.writeSuspensionSize;
            while (true) {
                io.ktor.utils.io.internal.b S7 = a.this.S();
                if (S7 != null && (c8 = S7.c()) != null) {
                    io.ktor.utils.io.b.b(c8);
                    throw new KotlinNothingValueException();
                }
                if (!a.this.W0(i8)) {
                    C6934p.a aVar = C6934p.f44487s;
                    dVar.resumeWith(C6934p.b(C6916E.f44463a));
                    break;
                }
                a aVar2 = a.this;
                A6.d c9 = B6.b.c(dVar);
                a aVar3 = a.this;
                while (aVar2.X() == null) {
                    if (!aVar3.W0(i8)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f36762p;
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, aVar2, null, c9)) {
                        if (aVar3.W0(i8) || !androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, aVar2, c9, null)) {
                            break;
                        }
                    }
                }
                throw new IllegalStateException("Operation is already in progress");
            }
            a.this.R(i8);
            if (a.this.A0()) {
                a.this.t0();
            }
            return B6.b.e();
        }
    }

    public a(boolean z7, Z5.g gVar, int i8) {
        r.e(gVar, "pool");
        this.f36763b = z7;
        this.f36764c = gVar;
        this.f36765d = i8;
        this._state = f.a.f36897c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.f36768g = new io.ktor.utils.io.internal.e(this);
        this.f36769h = new io.ktor.utils.io.internal.j(this);
        this.f36770i = new io.ktor.utils.io.internal.a();
        this.f36771j = new io.ktor.utils.io.internal.a();
        this.f36772k = new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A0() {
        return false;
    }

    private final Object B0(int i8, A6.d dVar) {
        while (true) {
            if (U().f36896b._availableForRead$internal >= i8) {
                C6934p.a aVar = C6934p.f44487s;
                dVar.resumeWith(C6934p.b(Boolean.TRUE));
                break;
            }
            io.ktor.utils.io.internal.b S7 = S();
            if (S7 == null) {
                while (T() == null) {
                    if (S() != null || U().f36896b._availableForRead$internal >= i8) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36761o;
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, dVar)) {
                        if ((S() == null && U().f36896b._availableForRead$internal < i8) || !androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, dVar, null)) {
                            break;
                        }
                    }
                }
                throw new IllegalStateException("Operation is already in progress");
            }
            if (S7.b() != null) {
                C6934p.a aVar2 = C6934p.f44487s;
                dVar.resumeWith(C6934p.b(x6.q.a(S7.b())));
                return B6.b.e();
            }
            boolean e8 = U().f36896b.e();
            boolean z7 = false;
            boolean z8 = U().f36896b._availableForRead$internal >= i8;
            C6934p.a aVar3 = C6934p.f44487s;
            if (e8 && z8) {
                z7 = true;
            }
            dVar.resumeWith(C6934p.b(Boolean.valueOf(z7)));
            return B6.b.e();
        }
        return B6.b.e();
    }

    private final boolean C0(boolean z7) {
        Object obj;
        f.C0275f c0275f;
        f.c cVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.f fVar = (io.ktor.utils.io.internal.f) obj;
            io.ktor.utils.io.internal.b S7 = S();
            if (cVar != null) {
                if ((S7 != null ? S7.b() : null) == null) {
                    cVar.f36896b.j();
                }
                u0();
                cVar = null;
            }
            c0275f = f.C0275f.f36907c;
            if (fVar == c0275f) {
                return true;
            }
            if (fVar != f.a.f36897c) {
                if (S7 != null && (fVar instanceof f.b) && (fVar.f36896b.k() || S7.b() != null)) {
                    if (S7.b() != null) {
                        fVar.f36896b.f();
                    }
                    cVar = ((f.b) fVar).g();
                } else {
                    if (!z7 || !(fVar instanceof f.b) || !fVar.f36896b.k()) {
                        return false;
                    }
                    cVar = ((f.b) fVar).g();
                }
            }
        } while (!androidx.concurrent.futures.b.a(f36759m, this, obj, c0275f));
        if (cVar != null && U() == c0275f) {
            n0(cVar);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int E0(X5.k r7) {
        /*
            r6 = this;
            java.nio.ByteBuffer r0 = r6.z0()
            if (r0 != 0) goto L8
            r7 = 0
            goto L52
        L8:
            io.ktor.utils.io.internal.f r1 = r6.U()
            io.ktor.utils.io.internal.h r1 = r1.f36896b
            r6.W()
            io.ktor.utils.io.internal.b r2 = r6.S()     // Catch: java.lang.Throwable -> L3a
            if (r2 != 0) goto L53
            long r2 = r7.c0()     // Catch: java.lang.Throwable -> L3a
            int r4 = r0.remaining()     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L3a
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L3a
            int r2 = r1.n(r2)     // Catch: java.lang.Throwable -> L3a
            if (r2 <= 0) goto L3c
            int r3 = r0.position()     // Catch: java.lang.Throwable -> L3a
            int r3 = r3 + r2
            r0.limit(r3)     // Catch: java.lang.Throwable -> L3a
            X5.i.b(r7, r0)     // Catch: java.lang.Throwable -> L3a
            r6.L(r0, r1, r2)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r7 = move-exception
            goto L60
        L3c:
            boolean r7 = r1.h()
            if (r7 != 0) goto L48
            boolean r7 = r6.o()
            if (r7 == 0) goto L4b
        L48:
            r6.flush()
        L4b:
            r6.r0()
            r6.D0()
            r7 = r2
        L52:
            return r7
        L53:
            java.lang.Throwable r7 = r2.c()     // Catch: java.lang.Throwable -> L3a
            io.ktor.utils.io.b.a(r7)     // Catch: java.lang.Throwable -> L3a
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L3a
            r7.<init>()     // Catch: java.lang.Throwable -> L3a
            throw r7     // Catch: java.lang.Throwable -> L3a
        L60:
            boolean r0 = r1.h()
            if (r0 != 0) goto L6c
            boolean r0 = r6.o()
            if (r0 == 0) goto L6f
        L6c:
            r6.flush()
        L6f:
            r6.r0()
            r6.D0()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.E0(X5.k):int");
    }

    private final int G0(X5.a aVar) {
        ByteBuffer z02 = z0();
        int i8 = 0;
        if (z02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.h hVar = U().f36896b;
        W();
        try {
            io.ktor.utils.io.internal.b S7 = S();
            if (S7 != null) {
                io.ktor.utils.io.b.b(S7.c());
                throw new KotlinNothingValueException();
            }
            while (true) {
                int n8 = hVar.n(Math.min(aVar.k() - aVar.i(), z02.remaining()));
                if (n8 == 0) {
                    break;
                }
                X5.g.a(aVar, z02, n8);
                i8 += n8;
                a0(z02, M(z02, this.f36767f + i8), hVar._availableForWrite$internal);
            }
            L(z02, hVar, i8);
            if (hVar.h() || o()) {
                flush();
            }
            r0();
            D0();
            return i8;
        } catch (Throwable th) {
            if (hVar.h() || o()) {
                flush();
            }
            r0();
            D0();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r7.limit(r3);
        L(r0, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r2.h() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (o() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r0();
        D0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int H0(java.nio.ByteBuffer r7) {
        /*
            r6 = this;
            java.nio.ByteBuffer r0 = r6.z0()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            io.ktor.utils.io.internal.f r2 = r6.U()
            io.ktor.utils.io.internal.h r2 = r2.f36896b
            r6.W()
            io.ktor.utils.io.internal.b r3 = r6.S()     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L72
            int r3 = r7.limit()     // Catch: java.lang.Throwable -> L4c
        L1b:
            int r4 = r7.position()     // Catch: java.lang.Throwable -> L4c
            int r4 = r3 - r4
            if (r4 == 0) goto L56
            int r5 = r0.remaining()     // Catch: java.lang.Throwable -> L4c
            int r4 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L4c
            int r4 = r2.n(r4)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L56
            if (r4 <= 0) goto L4e
            int r5 = r7.position()     // Catch: java.lang.Throwable -> L4c
            int r5 = r5 + r4
            r7.limit(r5)     // Catch: java.lang.Throwable -> L4c
            r0.put(r7)     // Catch: java.lang.Throwable -> L4c
            int r1 = r1 + r4
            int r4 = r6.f36767f     // Catch: java.lang.Throwable -> L4c
            int r4 = r4 + r1
            int r4 = r6.M(r0, r4)     // Catch: java.lang.Throwable -> L4c
            int r5 = r2._availableForWrite$internal     // Catch: java.lang.Throwable -> L4c
            r6.a0(r0, r4, r5)     // Catch: java.lang.Throwable -> L4c
            goto L1b
        L4c:
            r7 = move-exception
            goto L7f
        L4e:
            java.lang.String r7 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L56:
            r7.limit(r3)     // Catch: java.lang.Throwable -> L4c
            r6.L(r0, r2, r1)     // Catch: java.lang.Throwable -> L4c
            boolean r7 = r2.h()
            if (r7 != 0) goto L68
            boolean r7 = r6.o()
            if (r7 == 0) goto L6b
        L68:
            r6.flush()
        L6b:
            r6.r0()
            r6.D0()
            return r1
        L72:
            java.lang.Throwable r7 = r3.c()     // Catch: java.lang.Throwable -> L4c
            io.ktor.utils.io.b.a(r7)     // Catch: java.lang.Throwable -> L4c
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L4c
            r7.<init>()     // Catch: java.lang.Throwable -> L4c
            throw r7     // Catch: java.lang.Throwable -> L4c
        L7f:
            boolean r0 = r2.h()
            if (r0 != 0) goto L8b
            boolean r0 = r6.o()
            if (r0 == 0) goto L8e
        L8b:
            r6.flush()
        L8e:
            r6.r0()
            r6.D0()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.H0(java.nio.ByteBuffer):int");
    }

    private final int I0(byte[] bArr, int i8, int i9) {
        ByteBuffer z02 = z0();
        int i10 = 0;
        if (z02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.h hVar = U().f36896b;
        W();
        try {
            io.ktor.utils.io.internal.b S7 = S();
            if (S7 != null) {
                io.ktor.utils.io.b.b(S7.c());
                throw new KotlinNothingValueException();
            }
            while (true) {
                int n8 = hVar.n(Math.min(i9 - i10, z02.remaining()));
                if (n8 == 0) {
                    L(z02, hVar, i10);
                    if (hVar.h() || o()) {
                        flush();
                    }
                    r0();
                    D0();
                    return i10;
                }
                if (n8 <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                z02.put(bArr, i8 + i10, n8);
                i10 += n8;
                a0(z02, M(z02, this.f36767f + i10), hVar._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (hVar.h() || o()) {
                flush();
            }
            r0();
            D0();
            throw th;
        }
    }

    private final void K(ByteBuffer byteBuffer, io.ktor.utils.io.internal.h hVar, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f36766e = M(byteBuffer, this.f36766e + i8);
        hVar.a(i8);
        w0(V() + i8);
        u0();
    }

    static /* synthetic */ Object K0(a aVar, byte[] bArr, int i8, int i9, A6.d dVar) {
        aVar.getClass();
        int I02 = aVar.I0(bArr, i8, i9);
        return I02 > 0 ? kotlin.coroutines.jvm.internal.b.b(I02) : aVar.U0(bArr, i8, i9, dVar);
    }

    private final void L(ByteBuffer byteBuffer, io.ktor.utils.io.internal.h hVar, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f36767f = M(byteBuffer, this.f36767f + i8);
        hVar.c(i8);
        x0(W() + i8);
    }

    static /* synthetic */ Object L0(a aVar, X5.a aVar2, A6.d dVar) {
        aVar.G0(aVar2);
        if (aVar2.k() <= aVar2.i()) {
            return C6916E.f44463a;
        }
        Object O02 = aVar.O0(aVar2, dVar);
        return O02 == B6.b.e() ? O02 : C6916E.f44463a;
    }

    private final int M(ByteBuffer byteBuffer, int i8) {
        return i8 >= byteBuffer.capacity() - this.f36765d ? i8 - (byteBuffer.capacity() - this.f36765d) : i8;
    }

    static /* synthetic */ Object M0(a aVar, ByteBuffer byteBuffer, A6.d dVar) {
        aVar.getClass();
        aVar.H0(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return C6916E.f44463a;
        }
        Object P02 = aVar.P0(byteBuffer, dVar);
        return P02 == B6.b.e() ? P02 : C6916E.f44463a;
    }

    static /* synthetic */ Object N0(a aVar, byte[] bArr, int i8, int i9, A6.d dVar) {
        aVar.getClass();
        while (i9 > 0) {
            int I02 = aVar.I0(bArr, i8, i9);
            if (I02 == 0) {
                break;
            }
            i8 += I02;
            i9 -= I02;
        }
        if (i9 == 0) {
            return C6916E.f44463a;
        }
        Object Q02 = aVar.Q0(bArr, i8, i9, dVar);
        return Q02 == B6.b.e() ? Q02 : C6916E.f44463a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005a -> B:24:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O0(X5.a r6, A6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.k
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$k r0 = (io.ktor.utils.io.a.k) r0
            int r1 = r0.f36835v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36835v = r1
            goto L18
        L13:
            io.ktor.utils.io.a$k r0 = new io.ktor.utils.io.a$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36833t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36835v
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 == r3) goto L36
            r6 = 2
            if (r2 != r6) goto L2e
            x6.q.b(r7)
            x6.E r6 = x6.C6916E.f44463a
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f36832s
            X5.a r6 = (X5.a) r6
            java.lang.Object r2 = r0.f36831o
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            x6.q.b(r7)
            goto L5d
        L42:
            x6.q.b(r7)
            r2 = r5
        L46:
            int r7 = r6.k()
            int r4 = r6.i()
            if (r7 <= r4) goto L64
            r0.f36831o = r2
            r0.f36832s = r6
            r0.f36835v = r3
            java.lang.Object r7 = r2.F0(r3, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r2.getClass()
            r2.G0(r6)
            goto L46
        L64:
            x6.E r6 = x6.C6916E.f44463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.O0(X5.a, A6.d):java.lang.Object");
    }

    static /* synthetic */ Object P(a aVar, long j8, A6.d dVar) {
        long j9 = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException(("max shouldn't be negative: " + j8).toString());
        }
        ByteBuffer y02 = aVar.y0();
        if (y02 != null) {
            io.ktor.utils.io.internal.h hVar = aVar.U().f36896b;
            try {
                if (hVar._availableForRead$internal != 0) {
                    int l8 = hVar.l((int) Math.min(2147483647L, j8));
                    aVar.K(y02, hVar, l8);
                    j9 = l8;
                }
            } finally {
                aVar.q0();
                aVar.D0();
            }
        }
        long j10 = j9;
        return (j10 == j8 || aVar.m()) ? kotlin.coroutines.jvm.internal.b.c(j10) : aVar.Q(j10, j8, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0056 -> B:24:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P0(java.nio.ByteBuffer r5, A6.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.a.j
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.a$j r0 = (io.ktor.utils.io.a.j) r0
            int r1 = r0.f36830v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36830v = r1
            goto L18
        L13:
            io.ktor.utils.io.a$j r0 = new io.ktor.utils.io.a$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36828t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36830v
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 == r3) goto L36
            r5 = 2
            if (r2 != r5) goto L2e
            x6.q.b(r6)
            x6.E r5 = x6.C6916E.f44463a
            return r5
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Object r5 = r0.f36827s
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            java.lang.Object r2 = r0.f36826o
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            x6.q.b(r6)
            goto L59
        L42:
            x6.q.b(r6)
            r2 = r4
        L46:
            boolean r6 = r5.hasRemaining()
            if (r6 == 0) goto L60
            r0.f36826o = r2
            r0.f36827s = r5
            r0.f36830v = r3
            java.lang.Object r6 = r2.F0(r3, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r2.getClass()
            r2.H0(r5)
            goto L46
        L60:
            x6.E r5 = x6.C6916E.f44463a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.P0(java.nio.ByteBuffer, A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[PHI: r10 r12 r13
  PHI (r10v2 long) = (r10v1 long), (r10v6 long) binds: [B:14:0x003b, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]
  PHI (r12v2 J6.F) = (r12v1 J6.F), (r12v4 J6.F) binds: [B:14:0x003b, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]
  PHI (r13v1 io.ktor.utils.io.a) = (r13v0 io.ktor.utils.io.a), (r13v2 io.ktor.utils.io.a) binds: [B:14:0x003b, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0077 -> B:29:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q(long r10, long r12, A6.d r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.a.d
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.a$d r0 = (io.ktor.utils.io.a.d) r0
            int r1 = r0.f36795w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36795w = r1
            goto L18
        L13:
            io.ktor.utils.io.a$d r0 = new io.ktor.utils.io.a$d
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f36793u
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36795w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r10 = r0.f36792t
            java.lang.Object r12 = r0.f36791s
            J6.F r12 = (J6.F) r12
            java.lang.Object r13 = r0.f36790o
            io.ktor.utils.io.a r13 = (io.ktor.utils.io.a) r13
            x6.q.b(r14)
            goto L7a
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            x6.q.b(r14)
            J6.F r14 = new J6.F
            r14.<init>()
            r14.f3546o = r10
            r10 = r12
            r12 = r14
            r13 = r9
        L48:
            long r4 = r12.f3546o
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 >= 0) goto Lab
            java.nio.ByteBuffer r14 = r13.y0()
            if (r14 != 0) goto L55
            goto L65
        L55:
            io.ktor.utils.io.internal.f r2 = r13.U()
            io.ktor.utils.io.internal.h r2 = r2.f36896b
            int r4 = r2._availableForRead$internal     // Catch: java.lang.Throwable -> La3
            if (r4 != 0) goto L83
            r13.q0()
            r13.D0()
        L65:
            boolean r14 = r13.m()
            if (r14 != 0) goto Lab
            r0.f36790o = r13
            r0.f36791s = r12
            r0.f36792t = r10
            r0.f36795w = r3
            java.lang.Object r14 = r13.k0(r3, r0)
            if (r14 != r1) goto L7a
            return r1
        L7a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L48
            goto Lab
        L83:
            long r4 = r12.f3546o     // Catch: java.lang.Throwable -> La3
            long r4 = r10 - r4
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.lang.Throwable -> La3
            int r4 = (int) r4     // Catch: java.lang.Throwable -> La3
            int r4 = r2.l(r4)     // Catch: java.lang.Throwable -> La3
            r13.K(r14, r2, r4)     // Catch: java.lang.Throwable -> La3
            long r5 = r12.f3546o     // Catch: java.lang.Throwable -> La3
            long r7 = (long) r4     // Catch: java.lang.Throwable -> La3
            long r5 = r5 + r7
            r12.f3546o = r5     // Catch: java.lang.Throwable -> La3
            r13.q0()
            r13.D0()
            goto L48
        La3:
            r10 = move-exception
            r13.q0()
            r13.D0()
            throw r10
        Lab:
            long r10 = r12.f3546o
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.b.c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.Q(long, long, A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:20:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q0(byte[] r6, int r7, int r8, A6.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.a.l
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.a$l r0 = (io.ktor.utils.io.a.l) r0
            int r1 = r0.f36842x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36842x = r1
            goto L18
        L13:
            io.ktor.utils.io.a$l r0 = new io.ktor.utils.io.a$l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f36840v
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36842x
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.f36839u
            int r7 = r0.f36838t
            java.lang.Object r8 = r0.f36837s
            byte[] r8 = (byte[]) r8
            java.lang.Object r2 = r0.f36836o
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            x6.q.b(r9)
            goto L57
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            x6.q.b(r9)
            r2 = r5
        L41:
            if (r8 <= 0) goto L63
            r0.f36836o = r2
            r0.f36837s = r6
            r0.f36838t = r7
            r0.f36839u = r8
            r0.f36842x = r3
            java.lang.Object r9 = r2.J0(r6, r7, r8, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r4 = r8
            r8 = r6
            r6 = r4
        L57:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r7 = r7 + r9
            int r6 = r6 - r9
            r4 = r8
            r8 = r6
            r6 = r4
            goto L41
        L63:
            x6.E r6 = x6.C6916E.f44463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.Q0(byte[], int, int, A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(int i8) {
        io.ktor.utils.io.internal.f U7;
        do {
            U7 = U();
            if (U7 == f.C0275f.f36907c) {
                return;
            } else {
                U7.f36896b.e();
            }
        } while (U7 != U());
        int i9 = U7.f36896b._availableForWrite$internal;
        if (U7.f36896b._availableForRead$internal >= 1) {
            t0();
        }
        if (i9 >= i8) {
            u0();
        }
    }

    static /* synthetic */ Object R0(a aVar, X5.k kVar, A6.d dVar) {
        aVar.getClass();
        while (!kVar.K() && aVar.E0(kVar) != 0) {
            try {
            } catch (Throwable th) {
                kVar.B0();
                throw th;
            }
        }
        if (kVar.c0() <= 0) {
            return C6916E.f44463a;
        }
        Object S02 = aVar.S0(kVar, dVar);
        return S02 == B6.b.e() ? S02 : C6916E.f44463a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ktor.utils.io.internal.b S() {
        return (io.ktor.utils.io.internal.b) this._closed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x002c, B:22:0x0047, B:30:0x0062, B:25:0x004f, B:27:0x0055), top: B:36:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x005f -> B:30:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S0(X5.k r5, A6.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.a.m
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.a$m r0 = (io.ktor.utils.io.a.m) r0
            int r1 = r0.f36847v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36847v = r1
            goto L18
        L13:
            io.ktor.utils.io.a$m r0 = new io.ktor.utils.io.a$m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36845t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36847v
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 == r3) goto L3f
            r5 = 2
            if (r2 != r5) goto L37
            java.lang.Object r5 = r0.f36843o
            X5.k r5 = (X5.k) r5
            x6.q.b(r6)     // Catch: java.lang.Throwable -> L35
            x6.E r6 = x6.C6916E.f44463a     // Catch: java.lang.Throwable -> L35
            r5.B0()
            return r6
        L35:
            r6 = move-exception
            goto L6f
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            java.lang.Object r5 = r0.f36844s
            X5.k r5 = (X5.k) r5
            java.lang.Object r2 = r0.f36843o
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            x6.q.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L62
        L4b:
            x6.q.b(r6)
            r2 = r4
        L4f:
            boolean r6 = r5.K()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L69
            r0.f36843o = r2     // Catch: java.lang.Throwable -> L35
            r0.f36844s = r5     // Catch: java.lang.Throwable -> L35
            r0.f36847v = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r6 = r2.T0(r3, r0)     // Catch: java.lang.Throwable -> L35
            if (r6 != r1) goto L62
            return r1
        L62:
            r2.getClass()     // Catch: java.lang.Throwable -> L35
            r2.E0(r5)     // Catch: java.lang.Throwable -> L35
            goto L4f
        L69:
            r5.B0()
            x6.E r5 = x6.C6916E.f44463a
            return r5
        L6f:
            r5.B0()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.S0(X5.k, A6.d):java.lang.Object");
    }

    private final A6.d T() {
        return (A6.d) this._readOp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T0(int r6, A6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.o
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$o r0 = (io.ktor.utils.io.a.o) r0
            int r1 = r0.f36859v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36859v = r1
            goto L18
        L13:
            io.ktor.utils.io.a$o r0 = new io.ktor.utils.io.a$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36857t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36859v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r6 = r0.f36856s
            java.lang.Object r2 = r0.f36855o
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            x6.q.b(r7)
            goto L3b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            x6.q.b(r7)
            r2 = r5
        L3b:
            boolean r7 = r2.W0(r6)
            if (r7 == 0) goto L66
            r0.f36855o = r2
            r0.f36856s = r6
            r0.f36859v = r3
            U6.p r7 = new U6.p
            A6.d r4 = B6.b.c(r0)
            r7.<init>(r4, r3)
            r7.C()
            I(r2, r6, r7)
            java.lang.Object r7 = r7.z()
            java.lang.Object r4 = B6.b.e()
            if (r7 != r4) goto L63
            kotlin.coroutines.jvm.internal.h.c(r0)
        L63:
            if (r7 != r1) goto L3b
            return r1
        L66:
            io.ktor.utils.io.internal.b r6 = r2.S()
            if (r6 == 0) goto L7c
            java.lang.Throwable r6 = r6.c()
            if (r6 != 0) goto L73
            goto L7c
        L73:
            io.ktor.utils.io.b.a(r6)
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        L7c:
            x6.E r6 = x6.C6916E.f44463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.T0(int, A6.d):java.lang.Object");
    }

    private final io.ktor.utils.io.internal.f U() {
        return (io.ktor.utils.io.internal.f) this._state;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:22:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U0(byte[] r6, int r7, int r8, A6.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.a.n
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.a$n r0 = (io.ktor.utils.io.a.n) r0
            int r1 = r0.f36854x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36854x = r1
            goto L18
        L13:
            io.ktor.utils.io.a$n r0 = new io.ktor.utils.io.a$n
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f36852v
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36854x
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 == r3) goto L34
            r6 = 2
            if (r2 != r6) goto L2c
            x6.q.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f36851u
            int r7 = r0.f36850t
            java.lang.Object r8 = r0.f36849s
            byte[] r8 = (byte[]) r8
            java.lang.Object r2 = r0.f36848o
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            x6.q.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L5c
        L47:
            x6.q.b(r9)
            r2 = r5
        L4b:
            r0.f36848o = r2
            r0.f36849s = r6
            r0.f36850t = r7
            r0.f36851u = r8
            r0.f36854x = r3
            java.lang.Object r9 = r2.F0(r3, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            r2.getClass()
            int r9 = r2.I0(r6, r7, r8)
            if (r9 <= 0) goto L4b
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.b(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.U0(byte[], int, int, A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(int i8, InterfaceC0731o interfaceC0731o) {
        Throwable c8;
        while (true) {
            io.ktor.utils.io.internal.b S7 = S();
            if (S7 != null && (c8 = S7.c()) != null) {
                io.ktor.utils.io.b.b(c8);
                throw new KotlinNothingValueException();
            }
            if (!W0(i8)) {
                C6934p.a aVar = C6934p.f44487s;
                interfaceC0731o.resumeWith(C6934p.b(C6916E.f44463a));
                break;
            }
            while (X() == null) {
                if (!W0(i8)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36762p;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, interfaceC0731o)) {
                    if (W0(i8) || !androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, interfaceC0731o, null)) {
                        break;
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress");
        }
        R(i8);
        if (A0()) {
            t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W0(int i8) {
        io.ktor.utils.io.internal.f U7 = U();
        return S() == null && U7.f36896b._availableForWrite$internal < i8 && U7 != f.a.f36897c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A6.d X() {
        return (A6.d) this._writeOp;
    }

    private final f.c Z() {
        f.c cVar = (f.c) this.f36764c.C();
        cVar.f36896b.j();
        return cVar;
    }

    private final void a0(ByteBuffer byteBuffer, int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byteBuffer.limit(P6.m.e(i9 + i8, byteBuffer.capacity() - this.f36765d));
        byteBuffer.position(i8);
    }

    private final int b0(X5.a aVar, int i8, int i9) {
        int l8;
        do {
            ByteBuffer y02 = y0();
            boolean z7 = false;
            if (y02 == null) {
                l8 = 0;
            } else {
                io.ktor.utils.io.internal.h hVar = U().f36896b;
                try {
                    if (hVar._availableForRead$internal == 0) {
                        q0();
                        D0();
                        l8 = 0;
                    } else {
                        int g8 = aVar.g() - aVar.k();
                        l8 = hVar.l(Math.min(y02.remaining(), Math.min(g8, i9)));
                        if (l8 > 0) {
                            if (g8 < y02.remaining()) {
                                y02.limit(y02.position() + g8);
                            }
                            X5.e.a(aVar, y02);
                            K(y02, hVar, l8);
                            z7 = true;
                        }
                    }
                } finally {
                    q0();
                    D0();
                }
            }
            i8 += l8;
            i9 -= l8;
            if (!z7 || aVar.g() <= aVar.k()) {
                break;
            }
        } while (U().f36896b._availableForRead$internal > 0);
        return i8;
    }

    private final int c0(byte[] bArr, int i8, int i9) {
        ByteBuffer y02 = y0();
        int i10 = 0;
        if (y02 != null) {
            io.ktor.utils.io.internal.h hVar = U().f36896b;
            try {
                if (hVar._availableForRead$internal != 0) {
                    int capacity = y02.capacity() - this.f36765d;
                    while (true) {
                        int i11 = i9 - i10;
                        if (i11 == 0) {
                            break;
                        }
                        int i12 = this.f36766e;
                        int l8 = hVar.l(Math.min(capacity - i12, i11));
                        if (l8 == 0) {
                            break;
                        }
                        y02.limit(i12 + l8);
                        y02.position(i12);
                        y02.get(bArr, i8 + i10, l8);
                        K(y02, hVar, l8);
                        i10 += l8;
                    }
                }
            } finally {
                q0();
                D0();
            }
        }
        return i10;
    }

    static /* synthetic */ int d0(a aVar, X5.a aVar2, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = aVar2.g() - aVar2.k();
        }
        return aVar.b0(aVar2, i8, i9);
    }

    static /* synthetic */ Object e0(a aVar, Y5.a aVar2, A6.d dVar) {
        int d02 = d0(aVar, aVar2, 0, 0, 6, null);
        if (d02 == 0 && aVar.S() != null) {
            d02 = aVar.U().f36896b.e() ? d0(aVar, aVar2, 0, 0, 6, null) : -1;
        } else if (d02 <= 0 && aVar2.g() > aVar2.k()) {
            return aVar.g0(aVar2, dVar);
        }
        return kotlin.coroutines.jvm.internal.b.b(d02);
    }

    static /* synthetic */ Object f0(a aVar, byte[] bArr, int i8, int i9, A6.d dVar) {
        int c02 = aVar.c0(bArr, i8, i9);
        if (c02 == 0 && aVar.S() != null) {
            c02 = aVar.U().f36896b.e() ? aVar.c0(bArr, i8, i9) : -1;
        } else if (c02 <= 0 && i9 != 0) {
            return aVar.h0(bArr, i8, i9, dVar);
        }
        return kotlin.coroutines.jvm.internal.b.b(c02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g0(Y5.a r6, A6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.f
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$f r0 = (io.ktor.utils.io.a.f) r0
            int r1 = r0.f36807v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36807v = r1
            goto L18
        L13:
            io.ktor.utils.io.a$f r0 = new io.ktor.utils.io.a$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36805t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36807v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            x6.q.b(r7)
            goto L6d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f36804s
            Y5.a r6 = (Y5.a) r6
            java.lang.Object r2 = r0.f36803o
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            x6.q.b(r7)
            goto L51
        L40:
            x6.q.b(r7)
            r0.f36803o = r5
            r0.f36804s = r6
            r0.f36807v = r4
            java.lang.Object r7 = r5.k0(r4, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5f
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.b(r6)
            return r6
        L5f:
            r7 = 0
            r0.f36803o = r7
            r0.f36804s = r7
            r0.f36807v = r3
            java.lang.Object r7 = r2.c(r6, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.g0(Y5.a, A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h0(byte[] r6, int r7, int r8, A6.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.a.e
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.a$e r0 = (io.ktor.utils.io.a.e) r0
            int r1 = r0.f36802x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36802x = r1
            goto L18
        L13:
            io.ktor.utils.io.a$e r0 = new io.ktor.utils.io.a$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f36800v
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36802x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            x6.q.b(r9)
            goto L75
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r8 = r0.f36799u
            int r7 = r0.f36798t
            java.lang.Object r6 = r0.f36797s
            byte[] r6 = (byte[]) r6
            java.lang.Object r2 = r0.f36796o
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            x6.q.b(r9)
            goto L59
        L44:
            x6.q.b(r9)
            r0.f36796o = r5
            r0.f36797s = r6
            r0.f36798t = r7
            r0.f36799u = r8
            r0.f36802x = r4
            java.lang.Object r9 = r5.k0(r4, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            r2 = r5
        L59:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L67
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.b(r6)
            return r6
        L67:
            r9 = 0
            r0.f36796o = r9
            r0.f36797s = r9
            r0.f36802x = r3
            java.lang.Object r9 = r2.f(r6, r7, r8, r0)
            if (r9 != r1) goto L75
            return r1
        L75:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.h0(byte[], int, int, A6.d):java.lang.Object");
    }

    static /* synthetic */ Object i0(a aVar, long j8, A6.d dVar) {
        if (!aVar.Y()) {
            return aVar.j0(j8, dVar);
        }
        Throwable d8 = aVar.d();
        if (d8 == null) {
            return aVar.o0(j8);
        }
        io.ktor.utils.io.b.b(d8);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:12:0x0039, B:32:0x00a7, B:38:0x00b6, B:21:0x0061, B:23:0x0071, B:24:0x0075, B:26:0x008b, B:28:0x0091), top: B:55:0x0039, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:12:0x0039, B:32:0x00a7, B:38:0x00b6, B:21:0x0061, B:23:0x0071, B:24:0x0075, B:26:0x008b, B:28:0x0091), top: B:55:0x0039, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #2 {all -> 0x003e, blocks: (B:12:0x0039, B:32:0x00a7, B:38:0x00b6, B:21:0x0061, B:23:0x0071, B:24:0x0075, B:26:0x008b, B:28:0x0091), top: B:55:0x0039, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #1 {all -> 0x00c9, blocks: (B:40:0x00bb, B:42:0x00c4, B:46:0x00cc, B:47:0x00cd, B:48:0x00d0, B:12:0x0039, B:32:0x00a7, B:38:0x00b6, B:21:0x0061, B:23:0x0071, B:24:0x0075, B:26:0x008b, B:28:0x0091), top: B:54:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a4 -> B:32:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b3 -> B:37:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j0(long r13, A6.d r15) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.j0(long, A6.d):java.lang.Object");
    }

    private final Object k0(int i8, A6.d dVar) {
        if (U().f36896b._availableForRead$internal >= i8) {
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
        io.ktor.utils.io.internal.b S7 = S();
        if (S7 == null) {
            return i8 == 1 ? l0(1, dVar) : m0(i8, dVar);
        }
        Throwable b8 = S7.b();
        if (b8 != null) {
            io.ktor.utils.io.b.b(b8);
            throw new KotlinNothingValueException();
        }
        io.ktor.utils.io.internal.h hVar = U().f36896b;
        boolean z7 = hVar.e() && hVar._availableForRead$internal >= i8;
        if (T() == null) {
            return kotlin.coroutines.jvm.internal.b.a(z7);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l0(int r5, A6.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.a.h
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.a$h r0 = (io.ktor.utils.io.a.h) r0
            int r1 = r0.f36820v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36820v = r1
            goto L18
        L13:
            io.ktor.utils.io.a$h r0 = new io.ktor.utils.io.a$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36818t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36820v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f36816o
            io.ktor.utils.io.a r5 = (io.ktor.utils.io.a) r5
            x6.q.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L67
        L2d:
            r6 = move-exception
            goto L68
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            x6.q.b(r6)
            io.ktor.utils.io.internal.f r6 = r4.U()
            io.ktor.utils.io.internal.h r6 = r6.f36896b
            int r6 = r6._availableForRead$internal
            if (r6 >= r5) goto L6d
            r0.f36816o = r4     // Catch: java.lang.Throwable -> L61
            r0.f36817s = r5     // Catch: java.lang.Throwable -> L61
            r0.f36820v = r3     // Catch: java.lang.Throwable -> L61
            io.ktor.utils.io.internal.a r6 = r4.f36770i     // Catch: java.lang.Throwable -> L61
            r4.B0(r5, r6)     // Catch: java.lang.Throwable -> L61
            A6.d r5 = B6.b.c(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r6 = r6.f(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = B6.b.e()     // Catch: java.lang.Throwable -> L61
            if (r6 != r5) goto L64
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L61
            goto L64
        L61:
            r6 = move-exception
            r5 = r4
            goto L68
        L64:
            if (r6 != r1) goto L67
            return r1
        L67:
            return r6
        L68:
            r0 = 0
            r5.v0(r0)
            throw r6
        L6d:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.l0(int, A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0092 -> B:39:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m0(int r6, A6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.i
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$i r0 = (io.ktor.utils.io.a.i) r0
            int r1 = r0.f36825v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36825v = r1
            goto L18
        L13:
            io.ktor.utils.io.a$i r0 = new io.ktor.utils.io.a$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36823t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36825v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r6 = r0.f36822s
            java.lang.Object r2 = r0.f36821o
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            x6.q.b(r7)
            goto L95
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            x6.q.b(r7)
            r2 = r5
        L3c:
            io.ktor.utils.io.internal.f r7 = r2.U()
            io.ktor.utils.io.internal.h r7 = r7.f36896b
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L4b
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        L4b:
            io.ktor.utils.io.internal.b r7 = r2.S()
            if (r7 == 0) goto L88
            java.lang.Throwable r0 = r7.b()
            if (r0 != 0) goto L7b
            io.ktor.utils.io.internal.f r7 = r2.U()
            io.ktor.utils.io.internal.h r7 = r7.f36896b
            boolean r0 = r7.e()
            if (r0 == 0) goto L68
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L68
            r3 = r4
        L68:
            A6.d r6 = r2.T()
            if (r6 != 0) goto L73
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        L73:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Read operation is already in progress"
            r6.<init>(r7)
            throw r6
        L7b:
            java.lang.Throwable r6 = r7.b()
            io.ktor.utils.io.b.a(r6)
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        L88:
            r0.f36821o = r2
            r0.f36822s = r6
            r0.f36825v = r4
            java.lang.Object r7 = r2.l0(r6, r0)
            if (r7 != r1) goto L95
            return r1
        L95:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L3c
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.m0(int, A6.d):java.lang.Object");
    }

    private final void n0(f.c cVar) {
        this.f36764c.o0(cVar);
    }

    private final X5.k o0(long j8) {
        X5.j jVar = new X5.j(null, 1, 0 == true ? 1 : 0);
        try {
            Y5.a d8 = Y5.d.d(jVar, 1, null);
            while (true) {
                try {
                    if (d8.g() - d8.k() > j8) {
                        d8.t((int) j8);
                    }
                    j8 -= d0(this, d8, 0, 0, 6, null);
                    if (j8 <= 0 || m()) {
                        break;
                    }
                    d8 = Y5.d.d(jVar, 1, d8);
                } catch (Throwable th) {
                    jVar.d();
                    throw th;
                }
            }
            jVar.d();
            return jVar.X();
        } catch (Throwable th2) {
            jVar.I();
            throw th2;
        }
    }

    private final void q0() {
        Object obj;
        io.ktor.utils.io.internal.f e8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.internal.f fVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.f fVar2 = (io.ktor.utils.io.internal.f) obj;
            f.b bVar = (f.b) fVar;
            if (bVar != null) {
                bVar.f36896b.j();
                u0();
                fVar = null;
            }
            e8 = fVar2.e();
            if ((e8 instanceof f.b) && U() == fVar2 && e8.f36896b.k()) {
                e8 = f.a.f36897c;
                fVar = e8;
            }
            atomicReferenceFieldUpdater = f36759m;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, e8));
        f.a aVar = f.a.f36897c;
        if (e8 == aVar) {
            f.b bVar2 = (f.b) fVar;
            if (bVar2 != null) {
                n0(bVar2.g());
            }
            u0();
            return;
        }
        if ((e8 instanceof f.b) && e8.f36896b.g() && e8.f36896b.k() && androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e8, aVar)) {
            e8.f36896b.j();
            n0(((f.b) e8).g());
            u0();
        }
    }

    private final void s0(Throwable th) {
        A6.d dVar = (A6.d) f36761o.getAndSet(this, null);
        if (dVar != null) {
            if (th != null) {
                C6934p.a aVar = C6934p.f44487s;
                dVar.resumeWith(C6934p.b(x6.q.a(th)));
            } else {
                dVar.resumeWith(C6934p.b(Boolean.valueOf(U().f36896b._availableForRead$internal > 0)));
            }
        }
        A6.d dVar2 = (A6.d) f36762p.getAndSet(this, null);
        if (dVar2 != null) {
            C6934p.a aVar2 = C6934p.f44487s;
            if (th == null) {
                th = new ClosedWriteChannelException("Byte channel was closed");
            }
            dVar2.resumeWith(C6934p.b(x6.q.a(th)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        A6.d dVar = (A6.d) f36761o.getAndSet(this, null);
        if (dVar != null) {
            io.ktor.utils.io.internal.b S7 = S();
            Throwable b8 = S7 != null ? S7.b() : null;
            if (b8 != null) {
                C6934p.a aVar = C6934p.f44487s;
                dVar.resumeWith(C6934p.b(x6.q.a(b8)));
            } else {
                C6934p.a aVar2 = C6934p.f44487s;
                dVar.resumeWith(C6934p.b(Boolean.TRUE));
            }
        }
    }

    private final void u0() {
        A6.d X7;
        io.ktor.utils.io.internal.b S7;
        Object a8;
        do {
            X7 = X();
            if (X7 == null) {
                return;
            } else {
                S7 = S();
            }
        } while (!androidx.concurrent.futures.b.a(f36762p, this, X7, null));
        if (S7 == null) {
            C6934p.a aVar = C6934p.f44487s;
            a8 = C6916E.f44463a;
        } else {
            C6934p.a aVar2 = C6934p.f44487s;
            a8 = x6.q.a(S7.c());
        }
        X7.resumeWith(C6934p.b(a8));
    }

    private final void v0(A6.d dVar) {
        this._readOp = dVar;
    }

    private final ByteBuffer y0() {
        Object obj;
        Throwable b8;
        io.ktor.utils.io.internal.f c8;
        Throwable b9;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.f fVar = (io.ktor.utils.io.internal.f) obj;
            if (r.a(fVar, f.C0275f.f36907c) ? true : r.a(fVar, f.a.f36897c)) {
                io.ktor.utils.io.internal.b S7 = S();
                if (S7 == null || (b8 = S7.b()) == null) {
                    return null;
                }
                io.ktor.utils.io.b.b(b8);
                throw new KotlinNothingValueException();
            }
            io.ktor.utils.io.internal.b S8 = S();
            if (S8 != null && (b9 = S8.b()) != null) {
                io.ktor.utils.io.b.b(b9);
                throw new KotlinNothingValueException();
            }
            if (fVar.f36896b._availableForRead$internal == 0) {
                return null;
            }
            c8 = fVar.c();
        } while (!androidx.concurrent.futures.b.a(f36759m, this, obj, c8));
        ByteBuffer a8 = c8.a();
        a0(a8, this.f36766e, c8.f36896b._availableForRead$internal);
        return a8;
    }

    public final boolean D0() {
        if (S() == null || !C0(false)) {
            return false;
        }
        t0();
        u0();
        return true;
    }

    public final Object F0(int i8, A6.d dVar) {
        Throwable c8;
        if (!W0(i8)) {
            io.ktor.utils.io.internal.b S7 = S();
            if (S7 == null || (c8 = S7.c()) == null) {
                return C6916E.f44463a;
            }
            io.ktor.utils.io.b.b(c8);
            throw new KotlinNothingValueException();
        }
        this.writeSuspensionSize = i8;
        if (this.attachedJob != null) {
            Object invoke = this.f36772k.invoke(dVar);
            if (invoke == B6.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return invoke == B6.b.e() ? invoke : C6916E.f44463a;
        }
        io.ktor.utils.io.internal.a aVar = this.f36771j;
        this.f36772k.invoke(aVar);
        Object f8 = aVar.f(B6.b.c(dVar));
        if (f8 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return f8 == B6.b.e() ? f8 : C6916E.f44463a;
    }

    public Object J0(byte[] bArr, int i8, int i9, A6.d dVar) {
        return K0(this, bArr, i8, i9, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0123, code lost:
    
        r2 = r27;
        r4 = r29;
        r5 = r30;
        r1 = r3;
        r10 = r6;
        r6 = r7;
        r0 = r19;
        r7 = r20;
        r3 = r28;
        r27 = r16;
        r16 = r18;
     */
    /* JADX WARN: Path cross not found for [B:123:0x02a4, B:128:0x02af], limit reached: 195 */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b4 A[Catch: all -> 0x02ab, TryCatch #7 {all -> 0x02ab, blocks: (B:121:0x029e, B:123:0x02a4, B:130:0x02b4, B:131:0x02c3, B:128:0x02af), top: B:180:0x029e }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d3 A[Catch: all -> 0x004a, TryCatch #5 {all -> 0x004a, blocks: (B:15:0x0044, B:40:0x00f3, B:42:0x00f9, B:133:0x02cd, B:135:0x02d3, B:137:0x02dc, B:140:0x0302, B:144:0x0310, B:45:0x0106, B:150:0x0329, B:152:0x032f, B:156:0x033a, B:157:0x0347, B:158:0x034d, B:154:0x0335, B:160:0x0350, B:161:0x0353, B:22:0x006a), top: B:177:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032f A[Catch: all -> 0x004a, TryCatch #5 {all -> 0x004a, blocks: (B:15:0x0044, B:40:0x00f3, B:42:0x00f9, B:133:0x02cd, B:135:0x02d3, B:137:0x02dc, B:140:0x0302, B:144:0x0310, B:45:0x0106, B:150:0x0329, B:152:0x032f, B:156:0x033a, B:157:0x0347, B:158:0x034d, B:154:0x0335, B:160:0x0350, B:161:0x0353, B:22:0x006a), top: B:177:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0335 A[Catch: all -> 0x004a, TryCatch #5 {all -> 0x004a, blocks: (B:15:0x0044, B:40:0x00f3, B:42:0x00f9, B:133:0x02cd, B:135:0x02d3, B:137:0x02dc, B:140:0x0302, B:144:0x0310, B:45:0x0106, B:150:0x0329, B:152:0x032f, B:156:0x033a, B:157:0x0347, B:158:0x034d, B:154:0x0335, B:160:0x0350, B:161:0x0353, B:22:0x006a), top: B:177:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033a A[Catch: all -> 0x004a, TryCatch #5 {all -> 0x004a, blocks: (B:15:0x0044, B:40:0x00f3, B:42:0x00f9, B:133:0x02cd, B:135:0x02d3, B:137:0x02dc, B:140:0x0302, B:144:0x0310, B:45:0x0106, B:150:0x0329, B:152:0x032f, B:156:0x033a, B:157:0x0347, B:158:0x034d, B:154:0x0335, B:160:0x0350, B:161:0x0353, B:22:0x006a), top: B:177:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0350 A[Catch: all -> 0x004a, TryCatch #5 {all -> 0x004a, blocks: (B:15:0x0044, B:40:0x00f3, B:42:0x00f9, B:133:0x02cd, B:135:0x02d3, B:137:0x02dc, B:140:0x0302, B:144:0x0310, B:45:0x0106, B:150:0x0329, B:152:0x032f, B:156:0x033a, B:157:0x0347, B:158:0x034d, B:154:0x0335, B:160:0x0350, B:161:0x0353, B:22:0x006a), top: B:177:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129 A[Catch: all -> 0x028d, TRY_LEAVE, TryCatch #9 {all -> 0x028d, blocks: (B:49:0x0123, B:51:0x0129), top: B:184:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0231  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0313 -> B:40:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(io.ktor.utils.io.a r27, long r28, io.ktor.utils.io.internal.c r30, A6.d r31) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.N(io.ktor.utils.io.a, long, io.ktor.utils.io.internal.c, A6.d):java.lang.Object");
    }

    public final io.ktor.utils.io.internal.f O() {
        return U();
    }

    public long V() {
        return this.totalBytesRead;
    }

    public long W() {
        return this.totalBytesWritten;
    }

    public boolean Y() {
        return S() != null;
    }

    @Override // io.ktor.utils.io.i
    public boolean a(Throwable th) {
        if (S() != null) {
            return false;
        }
        io.ktor.utils.io.internal.b a8 = th == null ? io.ktor.utils.io.internal.b.f36884b.a() : new io.ktor.utils.io.internal.b(th);
        U().f36896b.e();
        if (!androidx.concurrent.futures.b.a(f36760n, this, null, a8)) {
            return false;
        }
        U().f36896b.e();
        if (U().f36896b.g() || th != null) {
            D0();
        }
        s0(th);
        U();
        f.C0275f c0275f = f.C0275f.f36907c;
        if (th == null) {
            this.f36771j.e(new ClosedWriteChannelException("Byte channel was closed"));
            this.f36770i.d(Boolean.valueOf(U().f36896b.e()));
            return true;
        }
        InterfaceC0745v0 interfaceC0745v0 = this.attachedJob;
        if (interfaceC0745v0 != null) {
            InterfaceC0745v0.a.a(interfaceC0745v0, null, 1, null);
        }
        this.f36770i.e(th);
        this.f36771j.e(th);
        return true;
    }

    @Override // io.ktor.utils.io.f
    public boolean b(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel has been cancelled");
        }
        return a(th);
    }

    @Override // io.ktor.utils.io.f
    public Object c(Y5.a aVar, A6.d dVar) {
        return e0(this, aVar, dVar);
    }

    @Override // io.ktor.utils.io.f
    public Throwable d() {
        io.ktor.utils.io.internal.b S7 = S();
        if (S7 != null) {
            return S7.b();
        }
        return null;
    }

    @Override // io.ktor.utils.io.f
    public int e() {
        return U().f36896b._availableForRead$internal;
    }

    @Override // io.ktor.utils.io.f
    public Object f(byte[] bArr, int i8, int i9, A6.d dVar) {
        return f0(this, bArr, i8, i9, dVar);
    }

    @Override // io.ktor.utils.io.i
    public void flush() {
        R(1);
    }

    @Override // io.ktor.utils.io.f
    public Object g(long j8, A6.d dVar) {
        return P(this, j8, dVar);
    }

    @Override // io.ktor.utils.io.i
    public Object h(ByteBuffer byteBuffer, A6.d dVar) {
        return M0(this, byteBuffer, dVar);
    }

    @Override // io.ktor.utils.io.i
    public Object i(X5.a aVar, A6.d dVar) {
        return L0(this, aVar, dVar);
    }

    @Override // io.ktor.utils.io.c
    public void j(InterfaceC0745v0 interfaceC0745v0) {
        r.e(interfaceC0745v0, "job");
        InterfaceC0745v0 interfaceC0745v02 = this.attachedJob;
        if (interfaceC0745v02 != null) {
            InterfaceC0745v0.a.a(interfaceC0745v02, null, 1, null);
        }
        this.attachedJob = interfaceC0745v0;
        InterfaceC0745v0.a.d(interfaceC0745v0, true, false, new b(), 2, null);
    }

    @Override // io.ktor.utils.io.i
    public Object k(X5.k kVar, A6.d dVar) {
        return R0(this, kVar, dVar);
    }

    @Override // io.ktor.utils.io.f
    public Object l(long j8, A6.d dVar) {
        return i0(this, j8, dVar);
    }

    @Override // io.ktor.utils.io.f
    public boolean m() {
        return U() == f.C0275f.f36907c && S() != null;
    }

    @Override // io.ktor.utils.io.i
    public Object n(byte[] bArr, int i8, int i9, A6.d dVar) {
        return N0(this, bArr, i8, i9, dVar);
    }

    @Override // io.ktor.utils.io.i
    public boolean o() {
        return this.f36763b;
    }

    public final a p0() {
        return this;
    }

    public final void r0() {
        Object obj;
        io.ktor.utils.io.internal.f f8;
        f.b bVar;
        io.ktor.utils.io.internal.f fVar = null;
        do {
            obj = this._state;
            f8 = ((io.ktor.utils.io.internal.f) obj).f();
            if ((f8 instanceof f.b) && f8.f36896b.g()) {
                f8 = f.a.f36897c;
                fVar = f8;
            }
        } while (!androidx.concurrent.futures.b.a(f36759m, this, obj, f8));
        if (f8 != f.a.f36897c || (bVar = (f.b) fVar) == null) {
            return;
        }
        n0(bVar.g());
    }

    public String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + U() + ')';
    }

    public void w0(long j8) {
        this.totalBytesRead = j8;
    }

    public void x0(long j8) {
        this.totalBytesWritten = j8;
    }

    public final ByteBuffer z0() {
        Object obj;
        io.ktor.utils.io.internal.f fVar;
        f.a aVar;
        io.ktor.utils.io.internal.f d8;
        A6.d X7 = X();
        if (X7 != null) {
            throw new IllegalStateException("Write operation is already in progress: " + X7);
        }
        io.ktor.utils.io.internal.f fVar2 = null;
        f.c cVar = null;
        do {
            obj = this._state;
            fVar = (io.ktor.utils.io.internal.f) obj;
            if (S() != null) {
                if (cVar != null) {
                    n0(cVar);
                }
                io.ktor.utils.io.internal.b S7 = S();
                r.b(S7);
                io.ktor.utils.io.b.b(S7.c());
                throw new KotlinNothingValueException();
            }
            aVar = f.a.f36897c;
            if (fVar == aVar) {
                if (cVar == null) {
                    cVar = Z();
                }
                d8 = cVar.d();
            } else {
                if (fVar == f.C0275f.f36907c) {
                    if (cVar != null) {
                        n0(cVar);
                    }
                    io.ktor.utils.io.internal.b S8 = S();
                    r.b(S8);
                    io.ktor.utils.io.b.b(S8.c());
                    throw new KotlinNothingValueException();
                }
                d8 = fVar.d();
            }
        } while (!androidx.concurrent.futures.b.a(f36759m, this, obj, d8));
        if (S() != null) {
            r0();
            D0();
            io.ktor.utils.io.internal.b S9 = S();
            r.b(S9);
            io.ktor.utils.io.b.b(S9.c());
            throw new KotlinNothingValueException();
        }
        ByteBuffer b8 = d8.b();
        if (cVar != null) {
            if (fVar == null) {
                r.p("old");
            } else {
                fVar2 = fVar;
            }
            if (fVar2 != aVar) {
                n0(cVar);
            }
        }
        a0(b8, this.f36767f, d8.f36896b._availableForWrite$internal);
        return b8;
    }

    public /* synthetic */ a(boolean z7, Z5.g gVar, int i8, int i9, AbstractC0650j abstractC0650j) {
        this(z7, (i9 & 2) != 0 ? io.ktor.utils.io.internal.d.c() : gVar, (i9 & 4) != 0 ? 8 : i8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ByteBuffer byteBuffer) {
        this(false, io.ktor.utils.io.internal.d.b(), 0);
        r.e(byteBuffer, "content");
        ByteBuffer slice = byteBuffer.slice();
        r.d(slice, "content.slice()");
        f.c cVar = new f.c(slice, 0);
        cVar.f36896b.i();
        this._state = cVar.d();
        r0();
        io.ktor.utils.io.j.a(this);
        D0();
    }
}
