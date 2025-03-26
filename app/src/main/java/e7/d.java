package e7;

import I6.l;
import I6.p;
import J6.o;
import J6.r;
import J6.s;
import U6.InterfaceC0731o;
import U6.W0;
import Z6.AbstractC0790d;
import Z6.B;
import Z6.C;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.C6916E;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35345c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f35346d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35347e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f35348f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f35349g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    private final int f35350a;

    /* renamed from: b, reason: collision with root package name */
    private final l f35351b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* synthetic */ class a extends o implements p {

        /* renamed from: A, reason: collision with root package name */
        public static final a f35352A = new a();

        a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).longValue(), (f) obj2);
        }

        public final f j(long j8, f fVar) {
            return e.h(j8, fVar);
        }
    }

    static final class b extends s implements l {
        b() {
            super(1);
        }

        public final void b(Throwable th) {
            d.this.i();
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    /* synthetic */ class c extends o implements p {

        /* renamed from: A, reason: collision with root package name */
        public static final c f35354A = new c();

        c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).longValue(), (f) obj2);
        }

        public final f j(long j8, f fVar) {
            return e.h(j8, fVar);
        }
    }

    public d(int i8, int i9) {
        this.f35350a = i8;
        if (i8 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i8).toString());
        }
        if (i9 < 0 || i9 > i8) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i8).toString());
        }
        f fVar = new f(0L, null, 2);
        this.head = fVar;
        this.tail = fVar;
        this._availablePermits = i8 - i9;
        this.f35351b = new b();
    }

    private final boolean e(W0 w02) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35347e;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f35348f.getAndIncrement(this);
        a aVar = a.f35352A;
        long j8 = andIncrement / e.f35360f;
        loop0: while (true) {
            c8 = AbstractC0790d.c(fVar, j8, aVar);
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
        f fVar2 = (f) C.b(c8);
        int i8 = (int) (andIncrement % e.f35360f);
        if (Z5.c.a(fVar2.r(), i8, null, w02)) {
            w02.c(fVar2, i8);
            return true;
        }
        if (!Z5.c.a(fVar2.r(), i8, e.f35356b, e.f35357c)) {
            return false;
        }
        if (w02 instanceof InterfaceC0731o) {
            r.c(w02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC0731o) w02).p(C6916E.f44463a, this.f35351b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + w02).toString());
    }

    private final void f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        int i9;
        do {
            atomicIntegerFieldUpdater = f35349g;
            i8 = atomicIntegerFieldUpdater.get(this);
            i9 = this.f35350a;
            if (i8 <= i9) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, i9));
    }

    private final int g() {
        int andDecrement;
        do {
            andDecrement = f35349g.getAndDecrement(this);
        } while (andDecrement > this.f35350a);
        return andDecrement;
    }

    private final boolean k(Object obj) {
        if (!(obj instanceof InterfaceC0731o)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0731o interfaceC0731o = (InterfaceC0731o) obj;
        Object l8 = interfaceC0731o.l(C6916E.f44463a, null, this.f35351b);
        if (l8 == null) {
            return false;
        }
        interfaceC0731o.r(l8);
        return true;
    }

    private final boolean l() {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35345c;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f35346d.getAndIncrement(this);
        long j8 = andIncrement / e.f35360f;
        c cVar = c.f35354A;
        loop0: while (true) {
            c8 = AbstractC0790d.c(fVar, j8, cVar);
            if (C.c(c8)) {
                break;
            }
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
        }
        f fVar2 = (f) C.b(c8);
        fVar2.b();
        if (fVar2.f6448t > j8) {
            return false;
        }
        int i8 = (int) (andIncrement % e.f35360f);
        Object andSet = fVar2.r().getAndSet(i8, e.f35356b);
        if (andSet != null) {
            if (andSet == e.f35359e) {
                return false;
            }
            return k(andSet);
        }
        int i9 = e.f35355a;
        for (int i10 = 0; i10 < i9; i10++) {
            if (fVar2.r().get(i8) == e.f35357c) {
                return true;
            }
        }
        return !Z5.c.a(fVar2.r(), i8, e.f35356b, e.f35358d);
    }

    protected final void d(InterfaceC0731o interfaceC0731o) {
        while (g() <= 0) {
            r.c(interfaceC0731o, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((W0) interfaceC0731o)) {
                return;
            }
        }
        interfaceC0731o.p(C6916E.f44463a, this.f35351b);
    }

    public int h() {
        return Math.max(f35349g.get(this), 0);
    }

    public void i() {
        do {
            int andIncrement = f35349g.getAndIncrement(this);
            if (andIncrement >= this.f35350a) {
                f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f35350a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!l());
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35349g;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > this.f35350a) {
                f();
            } else {
                if (i8 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    return true;
                }
            }
        }
    }
}
