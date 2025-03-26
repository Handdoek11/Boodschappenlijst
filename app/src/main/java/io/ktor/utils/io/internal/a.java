package io.ktor.utils.io.internal;

import I6.l;
import J6.r;
import U6.InterfaceC0708c0;
import U6.InterfaceC0745v0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.C6916E;
import x6.C6934p;
import x6.q;

/* loaded from: classes2.dex */
public final class a implements A6.d {

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36879o = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36880s = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* renamed from: io.ktor.utils.io.internal.a$a, reason: collision with other inner class name */
    private final class C0274a implements l {

        /* renamed from: o, reason: collision with root package name */
        private final InterfaceC0745v0 f36881o;

        /* renamed from: s, reason: collision with root package name */
        private InterfaceC0708c0 f36882s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ a f36883t;

        public C0274a(a aVar, InterfaceC0745v0 interfaceC0745v0) {
            r.e(interfaceC0745v0, "job");
            this.f36883t = aVar;
            this.f36881o = interfaceC0745v0;
            InterfaceC0708c0 d8 = InterfaceC0745v0.a.d(interfaceC0745v0, true, false, this, 2, null);
            if (interfaceC0745v0.h()) {
                this.f36882s = d8;
            }
        }

        public final void b() {
            InterfaceC0708c0 interfaceC0708c0 = this.f36882s;
            if (interfaceC0708c0 != null) {
                this.f36882s = null;
                interfaceC0708c0.c();
            }
        }

        public final InterfaceC0745v0 c() {
            return this.f36881o;
        }

        public void f(Throwable th) {
            this.f36883t.g(this);
            b();
            if (th != null) {
                this.f36883t.i(this.f36881o, th);
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            f((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(C0274a c0274a) {
        androidx.concurrent.futures.b.a(f36880s, this, c0274a, null);
    }

    private final void h(A6.g gVar) {
        Object obj;
        C0274a c0274a;
        InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) gVar.d(InterfaceC0745v0.f5485d);
        C0274a c0274a2 = (C0274a) this.jobCancellationHandler;
        if ((c0274a2 != null ? c0274a2.c() : null) == interfaceC0745v0) {
            return;
        }
        if (interfaceC0745v0 == null) {
            C0274a c0274a3 = (C0274a) f36880s.getAndSet(this, null);
            if (c0274a3 != null) {
                c0274a3.b();
                return;
            }
            return;
        }
        C0274a c0274a4 = new C0274a(this, interfaceC0745v0);
        do {
            obj = this.jobCancellationHandler;
            c0274a = (C0274a) obj;
            if (c0274a != null && c0274a.c() == interfaceC0745v0) {
                c0274a4.b();
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f36880s, this, obj, c0274a4));
        if (c0274a != null) {
            c0274a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(InterfaceC0745v0 interfaceC0745v0, Throwable th) {
        Object obj;
        A6.d dVar;
        do {
            obj = this.state;
            if (!(obj instanceof A6.d)) {
                return;
            }
            dVar = (A6.d) obj;
            if (dVar.getContext().d(InterfaceC0745v0.f5485d) != interfaceC0745v0) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f36879o, this, obj, null));
        r.c(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
        C6934p.a aVar = C6934p.f44487s;
        dVar.resumeWith(C6934p.b(q.a(th)));
    }

    public final void d(Object obj) {
        r.e(obj, "value");
        resumeWith(C6934p.b(obj));
        C0274a c0274a = (C0274a) f36880s.getAndSet(this, null);
        if (c0274a != null) {
            c0274a.b();
        }
    }

    public final void e(Throwable th) {
        r.e(th, "cause");
        C6934p.a aVar = C6934p.f44487s;
        resumeWith(C6934p.b(q.a(th)));
        C0274a c0274a = (C0274a) f36880s.getAndSet(this, null);
        if (c0274a != null) {
            c0274a.b();
        }
    }

    public final Object f(A6.d dVar) {
        r.e(dVar, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f36879o, this, null, dVar)) {
                    h(dVar.getContext());
                    return B6.b.e();
                }
            } else if (androidx.concurrent.futures.b.a(f36879o, this, obj, null)) {
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                r.c(obj, "null cannot be cast to non-null type T of io.ktor.utils.io.internal.CancellableReusableContinuation");
                return obj;
            }
        }
    }

    @Override // A6.d
    public A6.g getContext() {
        A6.g context;
        Object obj = this.state;
        A6.d dVar = obj instanceof A6.d ? (A6.d) obj : null;
        return (dVar == null || (context = dVar.getContext()) == null) ? A6.h.f250o : context;
    }

    @Override // A6.d
    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        do {
            obj2 = this.state;
            if (obj2 == null) {
                obj3 = C6934p.e(obj);
                if (obj3 == null) {
                    q.b(obj);
                    obj3 = obj;
                }
            } else if (!(obj2 instanceof A6.d)) {
                return;
            } else {
                obj3 = null;
            }
        } while (!androidx.concurrent.futures.b.a(f36879o, this, obj2, obj3));
        if (obj2 instanceof A6.d) {
            ((A6.d) obj2).resumeWith(obj);
        }
    }
}
