package U6;

import U6.InterfaceC0745v0;
import Z6.C0795i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.CompletionHandlerException;

/* renamed from: U6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0733p extends Z implements InterfaceC0731o, kotlin.coroutines.jvm.internal.e, W0 {

    /* renamed from: w, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f5470w = AtomicIntegerFieldUpdater.newUpdater(C0733p.class, "_decisionAndIndex");

    /* renamed from: x, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5471x = AtomicReferenceFieldUpdater.newUpdater(C0733p.class, Object.class, "_state");

    /* renamed from: y, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5472y = AtomicReferenceFieldUpdater.newUpdater(C0733p.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: u, reason: collision with root package name */
    private final A6.d f5473u;

    /* renamed from: v, reason: collision with root package name */
    private final A6.g f5474v;

    public C0733p(A6.d dVar, int i8) {
        super(i8);
        this.f5473u = dVar;
        this.f5474v = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0709d.f5438o;
    }

    private final String B() {
        Object A7 = A();
        return A7 instanceof J0 ? "Active" : A7 instanceof C0738s ? "Cancelled" : "Completed";
    }

    private final InterfaceC0708c0 D() {
        InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) getContext().d(InterfaceC0745v0.f5485d);
        if (interfaceC0745v0 == null) {
            return null;
        }
        InterfaceC0708c0 d8 = InterfaceC0745v0.a.d(interfaceC0745v0, true, false, new C0740t(this), 2, null);
        androidx.concurrent.futures.b.a(f5472y, this, null, d8);
        return d8;
    }

    private final void E(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5471x;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C0709d)) {
                if (obj2 instanceof AbstractC0727m ? true : obj2 instanceof Z6.B) {
                    H(obj, obj2);
                } else {
                    if (obj2 instanceof C) {
                        C c8 = (C) obj2;
                        if (!c8.b()) {
                            H(obj, obj2);
                        }
                        if (obj2 instanceof C0738s) {
                            if (!(obj2 instanceof C)) {
                                c8 = null;
                            }
                            Throwable th = c8 != null ? c8.f5374a : null;
                            if (obj instanceof AbstractC0727m) {
                                k((AbstractC0727m) obj, th);
                                return;
                            } else {
                                J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                s((Z6.B) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof B) {
                        B b8 = (B) obj2;
                        if (b8.f5368b != null) {
                            H(obj, obj2);
                        }
                        if (obj instanceof Z6.B) {
                            return;
                        }
                        J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC0727m abstractC0727m = (AbstractC0727m) obj;
                        if (b8.c()) {
                            k(abstractC0727m, b8.f5371e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.b.a(f5471x, this, obj2, B.b(b8, null, abstractC0727m, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof Z6.B) {
                            return;
                        }
                        J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f5471x, this, obj2, new B(obj2, (AbstractC0727m) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (androidx.concurrent.futures.b.a(f5471x, this, obj2, obj)) {
                return;
            }
        }
    }

    private final boolean F() {
        if (AbstractC0704a0.c(this.f5432t)) {
            A6.d dVar = this.f5473u;
            J6.r.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C0795i) dVar).t()) {
                return true;
            }
        }
        return false;
    }

    private final AbstractC0727m G(I6.l lVar) {
        return lVar instanceof AbstractC0727m ? (AbstractC0727m) lVar : new C0739s0(lVar);
    }

    private final void H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void M(Object obj, int i8, I6.l lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5471x;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof J0)) {
                if (obj2 instanceof C0738s) {
                    C0738s c0738s = (C0738s) obj2;
                    if (c0738s.c()) {
                        if (lVar != null) {
                            m(lVar, c0738s.f5374a);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.b.a(f5471x, this, obj2, O((J0) obj2, obj, i8, lVar, null)));
        v();
        w(i8);
    }

    static /* synthetic */ void N(C0733p c0733p, Object obj, int i8, I6.l lVar, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i9 & 4) != 0) {
            lVar = null;
        }
        c0733p.M(obj, i8, lVar);
    }

    private final Object O(J0 j02, Object obj, int i8, I6.l lVar, Object obj2) {
        if (obj instanceof C) {
            return obj;
        }
        if (!AbstractC0704a0.b(i8) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(j02 instanceof AbstractC0727m) && obj2 == null) {
            return obj;
        }
        return new B(obj, j02 instanceof AbstractC0727m ? (AbstractC0727m) j02 : null, lVar, obj2, null, 16, null);
    }

    private final boolean P() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5470w;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f5470w.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
        return true;
    }

    private final Z6.E Q(Object obj, Object obj2, I6.l lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5471x;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof J0)) {
                if ((obj3 instanceof B) && obj2 != null && ((B) obj3).f5370d == obj2) {
                    return AbstractC0735q.f5476a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f5471x, this, obj3, O((J0) obj3, obj, this.f5432t, lVar, obj2)));
        v();
        return AbstractC0735q.f5476a;
    }

    private final boolean R() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5470w;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f5470w.compareAndSet(this, i8, 536870912 + (536870911 & i8)));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void s(Z6.B b8, Throwable th) {
        int i8 = f5470w.get(this) & 536870911;
        if (i8 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            b8.o(i8, th, getContext());
        } catch (Throwable th2) {
            K.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean t(Throwable th) {
        if (!F()) {
            return false;
        }
        A6.d dVar = this.f5473u;
        J6.r.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0795i) dVar).u(th);
    }

    private final void v() {
        if (F()) {
            return;
        }
        u();
    }

    private final void w(int i8) {
        if (P()) {
            return;
        }
        AbstractC0704a0.a(this, i8);
    }

    private final InterfaceC0708c0 y() {
        return (InterfaceC0708c0) f5472y.get(this);
    }

    public final Object A() {
        return f5471x.get(this);
    }

    public void C() {
        InterfaceC0708c0 D7 = D();
        if (D7 != null && j()) {
            D7.c();
            f5472y.set(this, I0.f5405o);
        }
    }

    protected String I() {
        return "CancellableContinuation";
    }

    public final void J(Throwable th) {
        if (t(th)) {
            return;
        }
        b(th);
        v();
    }

    public final void K() {
        Throwable w7;
        A6.d dVar = this.f5473u;
        C0795i c0795i = dVar instanceof C0795i ? (C0795i) dVar : null;
        if (c0795i == null || (w7 = c0795i.w(this)) == null) {
            return;
        }
        u();
        b(w7);
    }

    public final boolean L() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5471x;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof B) && ((B) obj).f5370d != null) {
            u();
            return false;
        }
        f5470w.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C0709d.f5438o);
        return true;
    }

    @Override // U6.Z
    public void a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5471x;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof J0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C) {
                return;
            }
            if (obj2 instanceof B) {
                B b8 = (B) obj2;
                if (b8.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (androidx.concurrent.futures.b.a(f5471x, this, obj2, B.b(b8, null, null, null, null, th, 15, null))) {
                    b8.d(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f5471x, this, obj2, new B(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // U6.InterfaceC0731o
    public boolean b(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5471x;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof J0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f5471x, this, obj, new C0738s(this, th, (obj instanceof AbstractC0727m) || (obj instanceof Z6.B))));
        J0 j02 = (J0) obj;
        if (j02 instanceof AbstractC0727m) {
            k((AbstractC0727m) obj, th);
        } else if (j02 instanceof Z6.B) {
            s((Z6.B) obj, th);
        }
        v();
        w(this.f5432t);
        return true;
    }

    @Override // U6.W0
    public void c(Z6.B b8, int i8) {
        int i9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5470w;
        do {
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i8));
        E(b8);
    }

    @Override // U6.Z
    public final A6.d d() {
        return this.f5473u;
    }

    @Override // U6.Z
    public Throwable e(Object obj) {
        Throwable e8 = super.e(obj);
        if (e8 != null) {
            return e8;
        }
        return null;
    }

    @Override // U6.Z
    public Object f(Object obj) {
        return obj instanceof B ? ((B) obj).f5367a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        A6.d dVar = this.f5473u;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // A6.d
    public A6.g getContext() {
        return this.f5474v;
    }

    @Override // U6.Z
    public Object h() {
        return A();
    }

    @Override // U6.InterfaceC0731o
    public boolean j() {
        return !(A() instanceof J0);
    }

    public final void k(AbstractC0727m abstractC0727m, Throwable th) {
        try {
            abstractC0727m.b(th);
        } catch (Throwable th2) {
            K.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // U6.InterfaceC0731o
    public Object l(Object obj, Object obj2, I6.l lVar) {
        return Q(obj, obj2, lVar);
    }

    public final void m(I6.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            K.a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // U6.InterfaceC0731o
    public Object n(Throwable th) {
        return Q(new C(th, false, 2, null), null, null);
    }

    @Override // U6.InterfaceC0731o
    public void o(I i8, Object obj) {
        A6.d dVar = this.f5473u;
        C0795i c0795i = dVar instanceof C0795i ? (C0795i) dVar : null;
        N(this, obj, (c0795i != null ? c0795i.f6476u : null) == i8 ? 4 : this.f5432t, null, 4, null);
    }

    @Override // U6.InterfaceC0731o
    public void p(Object obj, I6.l lVar) {
        M(obj, this.f5432t, lVar);
    }

    @Override // U6.InterfaceC0731o
    public void q(I6.l lVar) {
        E(G(lVar));
    }

    @Override // U6.InterfaceC0731o
    public void r(Object obj) {
        w(this.f5432t);
    }

    @Override // A6.d
    public void resumeWith(Object obj) {
        N(this, F.c(obj, this), this.f5432t, null, 4, null);
    }

    public String toString() {
        return I() + '(' + Q.c(this.f5473u) + "){" + B() + "}@" + Q.b(this);
    }

    public final void u() {
        InterfaceC0708c0 y7 = y();
        if (y7 == null) {
            return;
        }
        y7.c();
        f5472y.set(this, I0.f5405o);
    }

    public Throwable x(InterfaceC0745v0 interfaceC0745v0) {
        return interfaceC0745v0.A();
    }

    public final Object z() {
        InterfaceC0745v0 interfaceC0745v0;
        boolean F7 = F();
        if (R()) {
            if (y() == null) {
                D();
            }
            if (F7) {
                K();
            }
            return B6.b.e();
        }
        if (F7) {
            K();
        }
        Object A7 = A();
        if (A7 instanceof C) {
            throw ((C) A7).f5374a;
        }
        if (!AbstractC0704a0.b(this.f5432t) || (interfaceC0745v0 = (InterfaceC0745v0) getContext().d(InterfaceC0745v0.f5485d)) == null || interfaceC0745v0.h()) {
            return f(A7);
        }
        CancellationException A8 = interfaceC0745v0.A();
        a(A7, A8);
        throw A8;
    }
}
