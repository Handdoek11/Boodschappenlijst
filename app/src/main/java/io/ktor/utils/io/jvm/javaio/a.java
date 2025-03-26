package io.ktor.utils.io.jvm.javaio;

import J6.L;
import J6.r;
import J6.s;
import U6.AbstractC0720i0;
import U6.InterfaceC0708c0;
import U6.InterfaceC0745v0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.C6934p;
import x6.q;

/* loaded from: classes2.dex */
abstract class a {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f36919f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0745v0 f36920a;

    /* renamed from: b, reason: collision with root package name */
    private final A6.d f36921b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0708c0 f36922c;

    /* renamed from: d, reason: collision with root package name */
    private int f36923d;

    /* renamed from: e, reason: collision with root package name */
    private int f36924e;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    /* renamed from: io.ktor.utils.io.jvm.javaio.a$a, reason: collision with other inner class name */
    static final class C0276a extends l implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        int f36925o;

        C0276a(A6.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(A6.d dVar) {
            return a.this.new C0276a(dVar);
        }

        @Override // I6.l
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A6.d dVar) {
            return ((C0276a) create(dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f36925o;
            if (i8 == 0) {
                q.b(obj);
                a aVar = a.this;
                this.f36925o = 1;
                if (aVar.h(this) == e8) {
                    return e8;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return C6916E.f44463a;
        }
    }

    static final class b extends s implements I6.l {
        b() {
            super(1);
        }

        public final void b(Throwable th) {
            if (th != null) {
                A6.d dVar = a.this.f36921b;
                C6934p.a aVar = C6934p.f44487s;
                dVar.resumeWith(C6934p.b(q.a(th)));
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    public static final class c implements A6.d {

        /* renamed from: o, reason: collision with root package name */
        private final A6.g f36928o;

        c() {
            this.f36928o = a.this.g() != null ? i.f36957t.u(a.this.g()) : i.f36957t;
        }

        @Override // A6.d
        public A6.g getContext() {
            return this.f36928o;
        }

        @Override // A6.d
        public void resumeWith(Object obj) {
            Object obj2;
            boolean z7;
            Throwable e8;
            InterfaceC0745v0 g8;
            Object e9 = C6934p.e(obj);
            if (e9 == null) {
                e9 = C6916E.f44463a;
            }
            a aVar = a.this;
            do {
                obj2 = aVar.state;
                z7 = obj2 instanceof Thread;
                if (!(z7 ? true : obj2 instanceof A6.d ? true : r.a(obj2, this))) {
                    return;
                }
            } while (!androidx.concurrent.futures.b.a(a.f36919f, aVar, obj2, e9));
            if (z7) {
                f.a().b(obj2);
            } else if ((obj2 instanceof A6.d) && (e8 = C6934p.e(obj)) != null) {
                ((A6.d) obj2).resumeWith(C6934p.b(q.a(e8)));
            }
            if (C6934p.g(obj) && !(C6934p.e(obj) instanceof CancellationException) && (g8 = a.this.g()) != null) {
                InterfaceC0745v0.a.a(g8, null, 1, null);
            }
            InterfaceC0708c0 interfaceC0708c0 = a.this.f36922c;
            if (interfaceC0708c0 != null) {
                interfaceC0708c0.c();
            }
        }
    }

    public a(InterfaceC0745v0 interfaceC0745v0) {
        this.f36920a = interfaceC0745v0;
        c cVar = new c();
        this.f36921b = cVar;
        this.state = this;
        this.result = 0;
        this.f36922c = interfaceC0745v0 != null ? interfaceC0745v0.D(new b()) : null;
        ((I6.l) L.d(new C0276a(null), 1)).invoke(cVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final void i(Thread thread) {
        if (this.state != thread) {
            return;
        }
        if (!f.b()) {
            io.ktor.utils.io.jvm.javaio.b.b().a("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
        }
        while (true) {
            long b8 = AbstractC0720i0.b();
            if (this.state != thread) {
                return;
            }
            if (b8 > 0) {
                f.a().a(b8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(A6.d dVar) {
        Object obj;
        A6.d c8;
        Object obj2 = null;
        while (true) {
            Object obj3 = this.state;
            if (obj3 instanceof Thread) {
                c8 = B6.b.c(dVar);
                obj = obj3;
            } else {
                if (!r.a(obj3, this)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                obj = obj2;
                c8 = B6.b.c(dVar);
            }
            if (androidx.concurrent.futures.b.a(f36919f, this, obj3, c8)) {
                if (obj != null) {
                    f.a().b(obj);
                }
                return B6.b.e();
            }
            obj2 = obj;
        }
    }

    protected final void d(int i8) {
        this.result = i8;
    }

    protected final int e() {
        return this.f36924e;
    }

    protected final int f() {
        return this.f36923d;
    }

    public final InterfaceC0745v0 g() {
        return this.f36920a;
    }

    protected abstract Object h(A6.d dVar);

    public final void k() {
        InterfaceC0708c0 interfaceC0708c0 = this.f36922c;
        if (interfaceC0708c0 != null) {
            interfaceC0708c0.c();
        }
        A6.d dVar = this.f36921b;
        C6934p.a aVar = C6934p.f44487s;
        dVar.resumeWith(C6934p.b(q.a(new CancellationException("Stream closed"))));
    }

    public final int l(Object obj) {
        Object obj2;
        Object noWhenBranchMatchedException;
        r.e(obj, "jobToken");
        Thread currentThread = Thread.currentThread();
        A6.d dVar = null;
        do {
            obj2 = this.state;
            if (obj2 instanceof A6.d) {
                r.c(obj2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                dVar = (A6.d) obj2;
                noWhenBranchMatchedException = currentThread;
            } else {
                if (obj2 instanceof C6916E) {
                    return this.result;
                }
                if (obj2 instanceof Throwable) {
                    throw ((Throwable) obj2);
                }
                if (obj2 instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (r.a(obj2, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            }
            r.d(noWhenBranchMatchedException, "when (value) {\n         …Exception()\n            }");
        } while (!androidx.concurrent.futures.b.a(f36919f, this, obj2, noWhenBranchMatchedException));
        r.b(dVar);
        dVar.resumeWith(C6934p.b(obj));
        r.d(currentThread, "thread");
        i(currentThread);
        Object obj3 = this.state;
        if (obj3 instanceof Throwable) {
            throw ((Throwable) obj3);
        }
        return this.result;
    }

    public final int m(byte[] bArr, int i8, int i9) {
        r.e(bArr, "buffer");
        this.f36923d = i8;
        this.f36924e = i9;
        return l(bArr);
    }
}
