package Z6;

import U6.AbstractC0714f0;
import U6.C0733p;
import U6.InterfaceC0731o;
import U6.Q;
import U6.S0;
import U6.Z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.C6916E;

/* renamed from: Z6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0795i extends Z implements kotlin.coroutines.jvm.internal.e, A6.d {

    /* renamed from: y, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6475y = AtomicReferenceFieldUpdater.newUpdater(C0795i.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: u, reason: collision with root package name */
    public final U6.I f6476u;

    /* renamed from: v, reason: collision with root package name */
    public final A6.d f6477v;

    /* renamed from: w, reason: collision with root package name */
    public Object f6478w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f6479x;

    public C0795i(U6.I i8, A6.d dVar) {
        super(-1);
        this.f6476u = i8;
        this.f6477v = dVar;
        this.f6478w = AbstractC0796j.f6480a;
        this.f6479x = I.b(getContext());
    }

    private final C0733p s() {
        Object obj = f6475y.get(this);
        if (obj instanceof C0733p) {
            return (C0733p) obj;
        }
        return null;
    }

    @Override // U6.Z
    public void a(Object obj, Throwable th) {
        if (obj instanceof U6.D) {
            ((U6.D) obj).f5389b.invoke(th);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        A6.d dVar = this.f6477v;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // A6.d
    public A6.g getContext() {
        return this.f6477v.getContext();
    }

    @Override // U6.Z
    public Object h() {
        Object obj = this.f6478w;
        this.f6478w = AbstractC0796j.f6480a;
        return obj;
    }

    public final void i() {
        while (f6475y.get(this) == AbstractC0796j.f6481b) {
        }
    }

    public final C0733p k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6475y;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f6475y.set(this, AbstractC0796j.f6481b);
                return null;
            }
            if (obj instanceof C0733p) {
                if (androidx.concurrent.futures.b.a(f6475y, this, obj, AbstractC0796j.f6481b)) {
                    return (C0733p) obj;
                }
            } else if (obj != AbstractC0796j.f6481b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void m(A6.g gVar, Object obj) {
        this.f6478w = obj;
        this.f5432t = 1;
        this.f6476u.u0(gVar, this);
    }

    @Override // A6.d
    public void resumeWith(Object obj) {
        A6.g context = this.f6477v.getContext();
        Object d8 = U6.F.d(obj, null, 1, null);
        if (this.f6476u.x0(context)) {
            this.f6478w = d8;
            this.f5432t = 0;
            this.f6476u.q0(context, this);
            return;
        }
        AbstractC0714f0 b8 = S0.f5422a.b();
        if (b8.H0()) {
            this.f6478w = d8;
            this.f5432t = 0;
            b8.D0(this);
            return;
        }
        b8.F0(true);
        try {
            A6.g context2 = getContext();
            Object c8 = I.c(context2, this.f6479x);
            try {
                this.f6477v.resumeWith(obj);
                C6916E c6916e = C6916E.f44463a;
                while (b8.K0()) {
                }
            } finally {
                I.a(context2, c8);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean t() {
        return f6475y.get(this) != null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f6476u + ", " + Q.c(this.f6477v) + ']';
    }

    public final boolean u(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6475y;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            E e8 = AbstractC0796j.f6481b;
            if (J6.r.a(obj, e8)) {
                if (androidx.concurrent.futures.b.a(f6475y, this, e8, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f6475y, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void v() {
        i();
        C0733p s8 = s();
        if (s8 != null) {
            s8.u();
        }
    }

    public final Throwable w(InterfaceC0731o interfaceC0731o) {
        E e8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6475y;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e8 = AbstractC0796j.f6481b;
            if (obj != e8) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f6475y, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f6475y, this, e8, interfaceC0731o));
        return null;
    }

    @Override // U6.Z
    public A6.d d() {
        return this;
    }
}
