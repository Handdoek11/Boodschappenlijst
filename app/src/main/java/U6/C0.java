package U6;

import A6.g;
import U6.InterfaceC0745v0;
import Z6.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import x6.AbstractC6923e;
import x6.C6916E;

/* loaded from: classes2.dex */
public class C0 implements InterfaceC0745v0, InterfaceC0746w, K0 {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5375o = AtomicReferenceFieldUpdater.newUpdater(C0.class, Object.class, "_state");

    /* renamed from: s, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5376s = AtomicReferenceFieldUpdater.newUpdater(C0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    private static final class a extends C0733p {

        /* renamed from: z, reason: collision with root package name */
        private final C0 f5377z;

        public a(A6.d dVar, C0 c02) {
            super(dVar, 1);
            this.f5377z = c02;
        }

        @Override // U6.C0733p
        protected String I() {
            return "AwaitContinuation";
        }

        @Override // U6.C0733p
        public Throwable x(InterfaceC0745v0 interfaceC0745v0) {
            Throwable d8;
            Object n02 = this.f5377z.n0();
            return (!(n02 instanceof c) || (d8 = ((c) n02).d()) == null) ? n02 instanceof C ? ((C) n02).f5374a : interfaceC0745v0.A() : d8;
        }
    }

    private static final class b extends B0 {

        /* renamed from: v, reason: collision with root package name */
        private final C0 f5378v;

        /* renamed from: w, reason: collision with root package name */
        private final c f5379w;

        /* renamed from: x, reason: collision with root package name */
        private final C0744v f5380x;

        /* renamed from: y, reason: collision with root package name */
        private final Object f5381y;

        public b(C0 c02, c cVar, C0744v c0744v, Object obj) {
            this.f5378v = c02;
            this.f5379w = cVar;
            this.f5380x = c0744v;
            this.f5381y = obj;
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            v((Throwable) obj);
            return C6916E.f44463a;
        }

        @Override // U6.E
        public void v(Throwable th) {
            this.f5378v.S(this.f5379w, this.f5380x, this.f5381y);
        }
    }

    private static final class c implements InterfaceC0736q0 {

        /* renamed from: s, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f5382s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: t, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f5383t = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: u, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f5384u = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: o, reason: collision with root package name */
        private final H0 f5385o;

        public c(H0 h02, boolean z7, Throwable th) {
            this.f5385o = h02;
            this._isCompleting = z7 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList b() {
            return new ArrayList(4);
        }

        private final Object c() {
            return f5384u.get(this);
        }

        private final void l(Object obj) {
            f5384u.set(this, obj);
        }

        public final void a(Throwable th) {
            Throwable d8 = d();
            if (d8 == null) {
                m(th);
                return;
            }
            if (th == d8) {
                return;
            }
            Object c8 = c();
            if (c8 == null) {
                l(th);
                return;
            }
            if (c8 instanceof Throwable) {
                if (th == c8) {
                    return;
                }
                ArrayList b8 = b();
                b8.add(c8);
                b8.add(th);
                l(b8);
                return;
            }
            if (c8 instanceof ArrayList) {
                ((ArrayList) c8).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + c8).toString());
        }

        public final Throwable d() {
            return (Throwable) f5383t.get(this);
        }

        public final boolean e() {
            return d() != null;
        }

        public final boolean f() {
            return f5382s.get(this) != 0;
        }

        public final boolean g() {
            return c() == D0.f5394e;
        }

        @Override // U6.InterfaceC0736q0
        public boolean h() {
            return d() == null;
        }

        @Override // U6.InterfaceC0736q0
        public H0 i() {
            return this.f5385o;
        }

        public final List j(Throwable th) {
            ArrayList arrayList;
            Object c8 = c();
            if (c8 == null) {
                arrayList = b();
            } else if (c8 instanceof Throwable) {
                ArrayList b8 = b();
                b8.add(c8);
                arrayList = b8;
            } else {
                if (!(c8 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + c8).toString());
                }
                arrayList = (ArrayList) c8;
            }
            Throwable d8 = d();
            if (d8 != null) {
                arrayList.add(0, d8);
            }
            if (th != null && !J6.r.a(th, d8)) {
                arrayList.add(th);
            }
            l(D0.f5394e);
            return arrayList;
        }

        public final void k(boolean z7) {
            f5382s.set(this, z7 ? 1 : 0);
        }

        public final void m(Throwable th) {
            f5383t.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + i() + ']';
        }
    }

    public static final class d extends p.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0 f5386d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f5387e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Z6.p pVar, C0 c02, Object obj) {
            super(pVar);
            this.f5386d = c02;
            this.f5387e = obj;
        }

        @Override // Z6.AbstractC0788b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(Z6.p pVar) {
            if (this.f5386d.n0() == this.f5387e) {
                return null;
            }
            return Z6.o.a();
        }
    }

    public C0(boolean z7) {
        this._state = z7 ? D0.f5396g : D0.f5395f;
    }

    private final C0744v B0(Z6.p pVar) {
        while (pVar.q()) {
            pVar = pVar.p();
        }
        while (true) {
            pVar = pVar.o();
            if (!pVar.q()) {
                if (pVar instanceof C0744v) {
                    return (C0744v) pVar;
                }
                if (pVar instanceof H0) {
                    return null;
                }
            }
        }
    }

    private final void C0(H0 h02, Throwable th) {
        E0(th);
        Object n8 = h02.n();
        J6.r.c(n8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (Z6.p pVar = (Z6.p) n8; !J6.r.a(pVar, h02); pVar = pVar.o()) {
            if (pVar instanceof AbstractC0747w0) {
                B0 b02 = (B0) pVar;
                try {
                    b02.v(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC6923e.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b02 + " for " + this, th2);
                        C6916E c6916e = C6916E.f44463a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            p0(completionHandlerException);
        }
        O(th);
    }

    private final void D0(H0 h02, Throwable th) {
        Object n8 = h02.n();
        J6.r.c(n8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (Z6.p pVar = (Z6.p) n8; !J6.r.a(pVar, h02); pVar = pVar.o()) {
            if (pVar instanceof B0) {
                B0 b02 = (B0) pVar;
                try {
                    b02.v(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC6923e.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b02 + " for " + this, th2);
                        C6916E c6916e = C6916E.f44463a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            p0(completionHandlerException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [U6.p0] */
    private final void H0(C0712e0 c0712e0) {
        H0 h02 = new H0();
        if (!c0712e0.h()) {
            h02 = new C0734p0(h02);
        }
        androidx.concurrent.futures.b.a(f5375o, this, c0712e0, h02);
    }

    private final void I0(B0 b02) {
        b02.j(new H0());
        androidx.concurrent.futures.b.a(f5375o, this, b02, b02.o());
    }

    private final Object L(Object obj) {
        Object S02;
        do {
            Object n02 = n0();
            if (!(n02 instanceof InterfaceC0736q0) || ((n02 instanceof c) && ((c) n02).f())) {
                return D0.f5390a;
            }
            S02 = S0(n02, new C(U(obj), false, 2, null));
        } while (S02 == D0.f5392c);
        return S02;
    }

    private final int L0(Object obj) {
        if (obj instanceof C0712e0) {
            if (((C0712e0) obj).h()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f5375o, this, obj, D0.f5396g)) {
                return -1;
            }
            G0();
            return 1;
        }
        if (!(obj instanceof C0734p0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f5375o, this, obj, ((C0734p0) obj).i())) {
            return -1;
        }
        G0();
        return 1;
    }

    private final String M0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC0736q0 ? ((InterfaceC0736q0) obj).h() ? "Active" : "New" : obj instanceof C ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.e() ? "Cancelling" : cVar.f() ? "Completing" : "Active";
    }

    private final boolean O(Throwable th) {
        if (s0()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        InterfaceC0742u k02 = k0();
        return (k02 == null || k02 == I0.f5405o) ? z7 : k02.f(th) || z7;
    }

    public static /* synthetic */ CancellationException O0(C0 c02, Throwable th, String str, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i8 & 1) != 0) {
            str = null;
        }
        return c02.N0(th, str);
    }

    private final boolean Q0(InterfaceC0736q0 interfaceC0736q0, Object obj) {
        if (!androidx.concurrent.futures.b.a(f5375o, this, interfaceC0736q0, D0.g(obj))) {
            return false;
        }
        E0(null);
        F0(obj);
        R(interfaceC0736q0, obj);
        return true;
    }

    private final void R(InterfaceC0736q0 interfaceC0736q0, Object obj) {
        InterfaceC0742u k02 = k0();
        if (k02 != null) {
            k02.c();
            K0(I0.f5405o);
        }
        C c8 = obj instanceof C ? (C) obj : null;
        Throwable th = c8 != null ? c8.f5374a : null;
        if (!(interfaceC0736q0 instanceof B0)) {
            H0 i8 = interfaceC0736q0.i();
            if (i8 != null) {
                D0(i8, th);
                return;
            }
            return;
        }
        try {
            ((B0) interfaceC0736q0).v(th);
        } catch (Throwable th2) {
            p0(new CompletionHandlerException("Exception in completion handler " + interfaceC0736q0 + " for " + this, th2));
        }
    }

    private final boolean R0(InterfaceC0736q0 interfaceC0736q0, Throwable th) {
        H0 i02 = i0(interfaceC0736q0);
        if (i02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f5375o, this, interfaceC0736q0, new c(i02, false, th))) {
            return false;
        }
        C0(i02, th);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(c cVar, C0744v c0744v, Object obj) {
        C0744v B02 = B0(c0744v);
        if (B02 == null || !U0(cVar, B02, obj)) {
            v(V(cVar, obj));
        }
    }

    private final Object S0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC0736q0) ? D0.f5390a : ((!(obj instanceof C0712e0) && !(obj instanceof B0)) || (obj instanceof C0744v) || (obj2 instanceof C)) ? T0((InterfaceC0736q0) obj, obj2) : Q0((InterfaceC0736q0) obj, obj2) ? obj2 : D0.f5392c;
    }

    private final Object T0(InterfaceC0736q0 interfaceC0736q0, Object obj) {
        H0 i02 = i0(interfaceC0736q0);
        if (i02 == null) {
            return D0.f5392c;
        }
        c cVar = interfaceC0736q0 instanceof c ? (c) interfaceC0736q0 : null;
        if (cVar == null) {
            cVar = new c(i02, false, null);
        }
        J6.G g8 = new J6.G();
        synchronized (cVar) {
            if (cVar.f()) {
                return D0.f5390a;
            }
            cVar.k(true);
            if (cVar != interfaceC0736q0 && !androidx.concurrent.futures.b.a(f5375o, this, interfaceC0736q0, cVar)) {
                return D0.f5392c;
            }
            boolean e8 = cVar.e();
            C c8 = obj instanceof C ? (C) obj : null;
            if (c8 != null) {
                cVar.a(c8.f5374a);
            }
            Throwable d8 = e8 ? null : cVar.d();
            g8.f3547o = d8;
            C6916E c6916e = C6916E.f44463a;
            if (d8 != null) {
                C0(i02, d8);
            }
            C0744v W7 = W(interfaceC0736q0);
            return (W7 == null || !U0(cVar, W7, obj)) ? V(cVar, obj) : D0.f5391b;
        }
    }

    private final Throwable U(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(P(), null, this) : th;
        }
        J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((K0) obj).j0();
    }

    private final boolean U0(c cVar, C0744v c0744v, Object obj) {
        while (InterfaceC0745v0.a.d(c0744v.f5484v, false, false, new b(this, cVar, c0744v, obj), 1, null) == I0.f5405o) {
            c0744v = B0(c0744v);
            if (c0744v == null) {
                return false;
            }
        }
        return true;
    }

    private final Object V(c cVar, Object obj) {
        boolean e8;
        Throwable a02;
        C c8 = obj instanceof C ? (C) obj : null;
        Throwable th = c8 != null ? c8.f5374a : null;
        synchronized (cVar) {
            e8 = cVar.e();
            List j8 = cVar.j(th);
            a02 = a0(cVar, j8);
            if (a02 != null) {
                t(a02, j8);
            }
        }
        if (a02 != null && a02 != th) {
            obj = new C(a02, false, 2, null);
        }
        if (a02 != null && (O(a02) || o0(a02))) {
            J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C) obj).b();
        }
        if (!e8) {
            E0(a02);
        }
        F0(obj);
        androidx.concurrent.futures.b.a(f5375o, this, cVar, D0.g(obj));
        R(cVar, obj);
        return obj;
    }

    private final C0744v W(InterfaceC0736q0 interfaceC0736q0) {
        C0744v c0744v = interfaceC0736q0 instanceof C0744v ? (C0744v) interfaceC0736q0 : null;
        if (c0744v != null) {
            return c0744v;
        }
        H0 i8 = interfaceC0736q0.i();
        if (i8 != null) {
            return B0(i8);
        }
        return null;
    }

    private final Throwable Z(Object obj) {
        C c8 = obj instanceof C ? (C) obj : null;
        if (c8 != null) {
            return c8.f5374a;
        }
        return null;
    }

    private final Throwable a0(c cVar, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.e()) {
                return new JobCancellationException(P(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final H0 i0(InterfaceC0736q0 interfaceC0736q0) {
        H0 i8 = interfaceC0736q0.i();
        if (i8 != null) {
            return i8;
        }
        if (interfaceC0736q0 instanceof C0712e0) {
            return new H0();
        }
        if (interfaceC0736q0 instanceof B0) {
            I0((B0) interfaceC0736q0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0736q0).toString());
    }

    private final boolean s(Object obj, H0 h02, B0 b02) {
        int u7;
        d dVar = new d(b02, this, obj);
        do {
            u7 = h02.p().u(b02, h02, dVar);
            if (u7 == 1) {
                return true;
            }
        } while (u7 != 2);
        return false;
    }

    private final void t(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                AbstractC6923e.a(th, th2);
            }
        }
    }

    private final boolean t0() {
        Object n02;
        do {
            n02 = n0();
            if (!(n02 instanceof InterfaceC0736q0)) {
                return false;
            }
        } while (L0(n02) < 0);
        return true;
    }

    private final Object u0(A6.d dVar) {
        C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
        c0733p.C();
        r.a(c0733p, D(new M0(c0733p)));
        Object z7 = c0733p.z();
        if (z7 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z7 == B6.b.e() ? z7 : C6916E.f44463a;
    }

    private final Object v0(Object obj) {
        Throwable th = null;
        while (true) {
            Object n02 = n0();
            if (n02 instanceof c) {
                synchronized (n02) {
                    if (((c) n02).g()) {
                        return D0.f5393d;
                    }
                    boolean e8 = ((c) n02).e();
                    if (obj != null || !e8) {
                        if (th == null) {
                            th = U(obj);
                        }
                        ((c) n02).a(th);
                    }
                    Throwable d8 = e8 ? null : ((c) n02).d();
                    if (d8 != null) {
                        C0(((c) n02).i(), d8);
                    }
                    return D0.f5390a;
                }
            }
            if (!(n02 instanceof InterfaceC0736q0)) {
                return D0.f5393d;
            }
            if (th == null) {
                th = U(obj);
            }
            InterfaceC0736q0 interfaceC0736q0 = (InterfaceC0736q0) n02;
            if (!interfaceC0736q0.h()) {
                Object S02 = S0(n02, new C(th, false, 2, null));
                if (S02 == D0.f5390a) {
                    throw new IllegalStateException(("Cannot happen in " + n02).toString());
                }
                if (S02 != D0.f5392c) {
                    return S02;
                }
            } else if (R0(interfaceC0736q0, th)) {
                return D0.f5390a;
            }
        }
    }

    private final Object x(A6.d dVar) {
        a aVar = new a(B6.b.c(dVar), this);
        aVar.C();
        r.a(aVar, D(new L0(aVar)));
        Object z7 = aVar.z();
        if (z7 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z7;
    }

    private final B0 z0(I6.l lVar, boolean z7) {
        B0 b02;
        if (z7) {
            b02 = lVar instanceof AbstractC0747w0 ? (AbstractC0747w0) lVar : null;
            if (b02 == null) {
                b02 = new C0741t0(lVar);
            }
        } else {
            b02 = lVar instanceof B0 ? (B0) lVar : null;
            if (b02 == null) {
                b02 = new C0743u0(lVar);
            }
        }
        b02.x(this);
        return b02;
    }

    @Override // U6.InterfaceC0745v0
    public final CancellationException A() {
        Object n02 = n0();
        if (!(n02 instanceof c)) {
            if (n02 instanceof InterfaceC0736q0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (n02 instanceof C) {
                return O0(this, ((C) n02).f5374a, null, 1, null);
            }
            return new JobCancellationException(Q.a(this) + " has completed normally", null, this);
        }
        Throwable d8 = ((c) n02).d();
        if (d8 != null) {
            CancellationException N02 = N0(d8, Q.a(this) + " is cancelling");
            if (N02 != null) {
                return N02;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public String A0() {
        return Q.a(this);
    }

    @Override // U6.InterfaceC0746w
    public final void B(K0 k02) {
        C(k02);
    }

    public final boolean C(Object obj) {
        Object obj2 = D0.f5390a;
        if (f0() && (obj2 = L(obj)) == D0.f5391b) {
            return true;
        }
        if (obj2 == D0.f5390a) {
            obj2 = v0(obj);
        }
        if (obj2 == D0.f5390a || obj2 == D0.f5391b) {
            return true;
        }
        if (obj2 == D0.f5393d) {
            return false;
        }
        v(obj2);
        return true;
    }

    @Override // U6.InterfaceC0745v0
    public final InterfaceC0708c0 D(I6.l lVar) {
        return c0(false, true, lVar);
    }

    public void F(Throwable th) {
        C(th);
    }

    @Override // U6.InterfaceC0745v0
    public final Object I(A6.d dVar) {
        if (t0()) {
            Object u02 = u0(dVar);
            return u02 == B6.b.e() ? u02 : C6916E.f44463a;
        }
        AbstractC0751y0.g(dVar.getContext());
        return C6916E.f44463a;
    }

    public final void J0(B0 b02) {
        Object n02;
        do {
            n02 = n0();
            if (!(n02 instanceof B0)) {
                if (!(n02 instanceof InterfaceC0736q0) || ((InterfaceC0736q0) n02).i() == null) {
                    return;
                }
                b02.r();
                return;
            }
            if (n02 != b02) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f5375o, this, n02, D0.f5396g));
    }

    @Override // U6.InterfaceC0745v0
    public final InterfaceC0742u K(InterfaceC0746w interfaceC0746w) {
        InterfaceC0708c0 d8 = InterfaceC0745v0.a.d(this, true, false, new C0744v(interfaceC0746w), 2, null);
        J6.r.c(d8, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC0742u) d8;
    }

    public final void K0(InterfaceC0742u interfaceC0742u) {
        f5376s.set(this, interfaceC0742u);
    }

    protected final CancellationException N0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = P();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String P() {
        return "Job was cancelled";
    }

    public final String P0() {
        return A0() + '{' + M0(n0()) + '}';
    }

    public boolean Q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return C(th) && d0();
    }

    public final Object Y() {
        Object n02 = n0();
        if (n02 instanceof InterfaceC0736q0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (n02 instanceof C) {
            throw ((C) n02).f5374a;
        }
        return D0.h(n02);
    }

    @Override // U6.InterfaceC0745v0
    public final InterfaceC0708c0 c0(boolean z7, boolean z8, I6.l lVar) {
        B0 z02 = z0(lVar, z7);
        while (true) {
            Object n02 = n0();
            if (n02 instanceof C0712e0) {
                C0712e0 c0712e0 = (C0712e0) n02;
                if (!c0712e0.h()) {
                    H0(c0712e0);
                } else if (androidx.concurrent.futures.b.a(f5375o, this, n02, z02)) {
                    return z02;
                }
            } else {
                if (!(n02 instanceof InterfaceC0736q0)) {
                    if (z8) {
                        C c8 = n02 instanceof C ? (C) n02 : null;
                        lVar.invoke(c8 != null ? c8.f5374a : null);
                    }
                    return I0.f5405o;
                }
                H0 i8 = ((InterfaceC0736q0) n02).i();
                if (i8 == null) {
                    J6.r.c(n02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    I0((B0) n02);
                } else {
                    InterfaceC0708c0 interfaceC0708c0 = I0.f5405o;
                    if (z7 && (n02 instanceof c)) {
                        synchronized (n02) {
                            try {
                                r3 = ((c) n02).d();
                                if (r3 == null || ((lVar instanceof C0744v) && !((c) n02).f())) {
                                    if (s(n02, i8, z02)) {
                                        if (r3 == null) {
                                            return z02;
                                        }
                                        interfaceC0708c0 = z02;
                                    }
                                }
                                C6916E c6916e = C6916E.f44463a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (z8) {
                            lVar.invoke(r3);
                        }
                        return interfaceC0708c0;
                    }
                    if (s(n02, i8, z02)) {
                        return z02;
                    }
                }
            }
        }
    }

    @Override // A6.g.b, A6.g
    public g.b d(g.c cVar) {
        return InterfaceC0745v0.a.c(this, cVar);
    }

    public boolean d0() {
        return true;
    }

    @Override // A6.g.b, A6.g
    public Object e(Object obj, I6.p pVar) {
        return InterfaceC0745v0.a.b(this, obj, pVar);
    }

    @Override // A6.g.b, A6.g
    public A6.g f(g.c cVar) {
        return InterfaceC0745v0.a.e(this, cVar);
    }

    public boolean f0() {
        return false;
    }

    @Override // A6.g.b
    public final g.c getKey() {
        return InterfaceC0745v0.f5485d;
    }

    @Override // U6.InterfaceC0745v0
    public InterfaceC0745v0 getParent() {
        InterfaceC0742u k02 = k0();
        if (k02 != null) {
            return k02.getParent();
        }
        return null;
    }

    @Override // U6.InterfaceC0745v0
    public boolean h() {
        Object n02 = n0();
        return (n02 instanceof InterfaceC0736q0) && ((InterfaceC0736q0) n02).h();
    }

    @Override // U6.InterfaceC0745v0
    public final boolean isCancelled() {
        Object n02 = n0();
        return (n02 instanceof C) || ((n02 instanceof c) && ((c) n02).e());
    }

    @Override // U6.InterfaceC0745v0
    public final boolean j() {
        return !(n0() instanceof InterfaceC0736q0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // U6.K0
    public CancellationException j0() {
        CancellationException cancellationException;
        Object n02 = n0();
        if (n02 instanceof c) {
            cancellationException = ((c) n02).d();
        } else if (n02 instanceof C) {
            cancellationException = ((C) n02).f5374a;
        } else {
            if (n02 instanceof InterfaceC0736q0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + n02).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new JobCancellationException("Parent job is " + M0(n02), cancellationException, this);
    }

    public final InterfaceC0742u k0() {
        return (InterfaceC0742u) f5376s.get(this);
    }

    @Override // U6.InterfaceC0745v0
    public void l0(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(P(), null, this);
        }
        F(cancellationException);
    }

    public final Object n0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5375o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof Z6.x)) {
                return obj;
            }
            ((Z6.x) obj).a(this);
        }
    }

    protected boolean o0(Throwable th) {
        return false;
    }

    protected final void q0(InterfaceC0745v0 interfaceC0745v0) {
        if (interfaceC0745v0 == null) {
            K0(I0.f5405o);
            return;
        }
        interfaceC0745v0.start();
        InterfaceC0742u K7 = interfaceC0745v0.K(this);
        K0(K7);
        if (j()) {
            K7.c();
            K0(I0.f5405o);
        }
    }

    protected boolean s0() {
        return false;
    }

    @Override // U6.InterfaceC0745v0
    public final boolean start() {
        int L02;
        do {
            L02 = L0(n0());
            if (L02 == 0) {
                return false;
            }
        } while (L02 != 1);
        return true;
    }

    public String toString() {
        return P0() + '@' + Q.b(this);
    }

    @Override // A6.g
    public A6.g u(A6.g gVar) {
        return InterfaceC0745v0.a.f(this, gVar);
    }

    protected final Object w(A6.d dVar) {
        Object n02;
        do {
            n02 = n0();
            if (!(n02 instanceof InterfaceC0736q0)) {
                if (n02 instanceof C) {
                    throw ((C) n02).f5374a;
                }
                return D0.h(n02);
            }
        } while (L0(n02) < 0);
        return x(dVar);
    }

    public final boolean w0(Object obj) {
        Object S02;
        do {
            S02 = S0(n0(), obj);
            if (S02 == D0.f5390a) {
                return false;
            }
            if (S02 == D0.f5391b) {
                return true;
            }
        } while (S02 == D0.f5392c);
        v(S02);
        return true;
    }

    public final Object x0(Object obj) {
        Object S02;
        do {
            S02 = S0(n0(), obj);
            if (S02 == D0.f5390a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, Z(obj));
            }
        } while (S02 == D0.f5392c);
        return S02;
    }

    public final boolean y(Throwable th) {
        return C(th);
    }

    protected void G0() {
    }

    protected void E0(Throwable th) {
    }

    protected void F0(Object obj) {
    }

    public void p0(Throwable th) {
        throw th;
    }

    protected void v(Object obj) {
    }
}
