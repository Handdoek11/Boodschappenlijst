package m6;

import a6.InterfaceC0830g;
import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import g6.EnumC5814b;
import h6.AbstractC5844b;
import i6.InterfaceC5876a;
import i6.InterfaceC5880e;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n6.C6276b;
import r6.C6710b;
import r6.EnumC6713e;
import s6.C6761b;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class c extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final f6.g f39258s;

    /* renamed from: t, reason: collision with root package name */
    final int f39259t;

    /* renamed from: u, reason: collision with root package name */
    final EnumC6713e f39260u;

    static final class a extends AtomicInteger implements a6.i, InterfaceC5732b {

        /* renamed from: A, reason: collision with root package name */
        volatile boolean f39261A;

        /* renamed from: B, reason: collision with root package name */
        volatile boolean f39262B;

        /* renamed from: C, reason: collision with root package name */
        int f39263C;

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39264o;

        /* renamed from: s, reason: collision with root package name */
        final f6.g f39265s;

        /* renamed from: t, reason: collision with root package name */
        final int f39266t;

        /* renamed from: u, reason: collision with root package name */
        final C6710b f39267u = new C6710b();

        /* renamed from: v, reason: collision with root package name */
        final C0293a f39268v;

        /* renamed from: w, reason: collision with root package name */
        final boolean f39269w;

        /* renamed from: x, reason: collision with root package name */
        InterfaceC5880e f39270x;

        /* renamed from: y, reason: collision with root package name */
        InterfaceC5732b f39271y;

        /* renamed from: z, reason: collision with root package name */
        volatile boolean f39272z;

        /* renamed from: m6.c$a$a, reason: collision with other inner class name */
        static final class C0293a extends AtomicReference implements a6.i {

            /* renamed from: o, reason: collision with root package name */
            final a6.i f39273o;

            /* renamed from: s, reason: collision with root package name */
            final a f39274s;

            C0293a(a6.i iVar, a aVar) {
                this.f39273o = iVar;
                this.f39274s = aVar;
            }

            @Override // a6.i
            public void a() {
                a aVar = this.f39274s;
                aVar.f39272z = false;
                aVar.e();
            }

            @Override // a6.i
            public void b(Object obj) {
                this.f39273o.b(obj);
            }

            void c() {
                EnumC5814b.a(this);
            }

            @Override // a6.i
            public void d(InterfaceC5732b interfaceC5732b) {
                EnumC5814b.g(this, interfaceC5732b);
            }

            @Override // a6.i
            public void onError(Throwable th) {
                a aVar = this.f39274s;
                if (!aVar.f39267u.a(th)) {
                    AbstractC6805a.m(th);
                    return;
                }
                if (!aVar.f39269w) {
                    aVar.f39271y.c();
                }
                aVar.f39272z = false;
                aVar.e();
            }
        }

        a(a6.i iVar, f6.g gVar, int i8, boolean z7) {
            this.f39264o = iVar;
            this.f39265s = gVar;
            this.f39266t = i8;
            this.f39269w = z7;
            this.f39268v = new C0293a(iVar, this);
        }

        @Override // a6.i
        public void a() {
            this.f39261A = true;
            e();
        }

        @Override // a6.i
        public void b(Object obj) {
            if (this.f39263C == 0) {
                this.f39270x.g(obj);
            }
            e();
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f39262B = true;
            this.f39271y.c();
            this.f39268v.c();
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            if (EnumC5814b.l(this.f39271y, interfaceC5732b)) {
                this.f39271y = interfaceC5732b;
                if (interfaceC5732b instanceof InterfaceC5876a) {
                    InterfaceC5876a interfaceC5876a = (InterfaceC5876a) interfaceC5732b;
                    int i8 = interfaceC5876a.i(3);
                    if (i8 == 1) {
                        this.f39263C = i8;
                        this.f39270x = interfaceC5876a;
                        this.f39261A = true;
                        this.f39264o.d(this);
                        e();
                        return;
                    }
                    if (i8 == 2) {
                        this.f39263C = i8;
                        this.f39270x = interfaceC5876a;
                        this.f39264o.d(this);
                        return;
                    }
                }
                this.f39270x = new C6276b(this.f39266t);
                this.f39264o.d(this);
            }
        }

        void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            a6.i iVar = this.f39264o;
            InterfaceC5880e interfaceC5880e = this.f39270x;
            C6710b c6710b = this.f39267u;
            while (true) {
                if (!this.f39272z) {
                    if (this.f39262B) {
                        interfaceC5880e.clear();
                        return;
                    }
                    if (!this.f39269w && ((Throwable) c6710b.get()) != null) {
                        interfaceC5880e.clear();
                        this.f39262B = true;
                        iVar.onError(c6710b.b());
                        return;
                    }
                    boolean z7 = this.f39261A;
                    try {
                        Object f8 = interfaceC5880e.f();
                        boolean z8 = f8 == null;
                        if (z7 && z8) {
                            this.f39262B = true;
                            Throwable b8 = c6710b.b();
                            if (b8 != null) {
                                iVar.onError(b8);
                                return;
                            } else {
                                iVar.a();
                                return;
                            }
                        }
                        if (!z8) {
                            try {
                                InterfaceC0830g interfaceC0830g = (InterfaceC0830g) AbstractC5844b.e(this.f39265s.apply(f8), "The mapper returned a null ObservableSource");
                                if (interfaceC0830g instanceof Callable) {
                                    try {
                                        Object call = ((Callable) interfaceC0830g).call();
                                        if (call != null && !this.f39262B) {
                                            iVar.b(call);
                                        }
                                    } catch (Throwable th) {
                                        AbstractC5751a.b(th);
                                        c6710b.a(th);
                                    }
                                } else {
                                    this.f39272z = true;
                                    interfaceC0830g.c(this.f39268v);
                                }
                            } catch (Throwable th2) {
                                AbstractC5751a.b(th2);
                                this.f39262B = true;
                                this.f39271y.c();
                                interfaceC5880e.clear();
                                c6710b.a(th2);
                                iVar.onError(c6710b.b());
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC5751a.b(th3);
                        this.f39262B = true;
                        this.f39271y.c();
                        c6710b.a(th3);
                        iVar.onError(c6710b.b());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // a6.i
        public void onError(Throwable th) {
            if (!this.f39267u.a(th)) {
                AbstractC6805a.m(th);
            } else {
                this.f39261A = true;
                e();
            }
        }
    }

    static final class b extends AtomicInteger implements a6.i, InterfaceC5732b {

        /* renamed from: A, reason: collision with root package name */
        int f39275A;

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39276o;

        /* renamed from: s, reason: collision with root package name */
        final f6.g f39277s;

        /* renamed from: t, reason: collision with root package name */
        final a f39278t;

        /* renamed from: u, reason: collision with root package name */
        final int f39279u;

        /* renamed from: v, reason: collision with root package name */
        InterfaceC5880e f39280v;

        /* renamed from: w, reason: collision with root package name */
        InterfaceC5732b f39281w;

        /* renamed from: x, reason: collision with root package name */
        volatile boolean f39282x;

        /* renamed from: y, reason: collision with root package name */
        volatile boolean f39283y;

        /* renamed from: z, reason: collision with root package name */
        volatile boolean f39284z;

        static final class a extends AtomicReference implements a6.i {

            /* renamed from: o, reason: collision with root package name */
            final a6.i f39285o;

            /* renamed from: s, reason: collision with root package name */
            final b f39286s;

            a(a6.i iVar, b bVar) {
                this.f39285o = iVar;
                this.f39286s = bVar;
            }

            @Override // a6.i
            public void a() {
                this.f39286s.f();
            }

            @Override // a6.i
            public void b(Object obj) {
                this.f39285o.b(obj);
            }

            void c() {
                EnumC5814b.a(this);
            }

            @Override // a6.i
            public void d(InterfaceC5732b interfaceC5732b) {
                EnumC5814b.g(this, interfaceC5732b);
            }

            @Override // a6.i
            public void onError(Throwable th) {
                this.f39286s.c();
                this.f39285o.onError(th);
            }
        }

        b(a6.i iVar, f6.g gVar, int i8) {
            this.f39276o = iVar;
            this.f39277s = gVar;
            this.f39279u = i8;
            this.f39278t = new a(iVar, this);
        }

        @Override // a6.i
        public void a() {
            if (this.f39284z) {
                return;
            }
            this.f39284z = true;
            e();
        }

        @Override // a6.i
        public void b(Object obj) {
            if (this.f39284z) {
                return;
            }
            if (this.f39275A == 0) {
                this.f39280v.g(obj);
            }
            e();
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f39283y = true;
            this.f39278t.c();
            this.f39281w.c();
            if (getAndIncrement() == 0) {
                this.f39280v.clear();
            }
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            if (EnumC5814b.l(this.f39281w, interfaceC5732b)) {
                this.f39281w = interfaceC5732b;
                if (interfaceC5732b instanceof InterfaceC5876a) {
                    InterfaceC5876a interfaceC5876a = (InterfaceC5876a) interfaceC5732b;
                    int i8 = interfaceC5876a.i(3);
                    if (i8 == 1) {
                        this.f39275A = i8;
                        this.f39280v = interfaceC5876a;
                        this.f39284z = true;
                        this.f39276o.d(this);
                        e();
                        return;
                    }
                    if (i8 == 2) {
                        this.f39275A = i8;
                        this.f39280v = interfaceC5876a;
                        this.f39276o.d(this);
                        return;
                    }
                }
                this.f39280v = new C6276b(this.f39279u);
                this.f39276o.d(this);
            }
        }

        void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f39283y) {
                if (!this.f39282x) {
                    boolean z7 = this.f39284z;
                    try {
                        Object f8 = this.f39280v.f();
                        boolean z8 = f8 == null;
                        if (z7 && z8) {
                            this.f39283y = true;
                            this.f39276o.a();
                            return;
                        } else if (!z8) {
                            try {
                                InterfaceC0830g interfaceC0830g = (InterfaceC0830g) AbstractC5844b.e(this.f39277s.apply(f8), "The mapper returned a null ObservableSource");
                                this.f39282x = true;
                                interfaceC0830g.c(this.f39278t);
                            } catch (Throwable th) {
                                AbstractC5751a.b(th);
                                c();
                                this.f39280v.clear();
                                this.f39276o.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC5751a.b(th2);
                        c();
                        this.f39280v.clear();
                        this.f39276o.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f39280v.clear();
        }

        void f() {
            this.f39282x = false;
            e();
        }

        @Override // a6.i
        public void onError(Throwable th) {
            if (this.f39284z) {
                AbstractC6805a.m(th);
                return;
            }
            this.f39284z = true;
            c();
            this.f39276o.onError(th);
        }
    }

    public c(InterfaceC0830g interfaceC0830g, f6.g gVar, int i8, EnumC6713e enumC6713e) {
        super(interfaceC0830g);
        this.f39258s = gVar;
        this.f39260u = enumC6713e;
        this.f39259t = Math.max(8, i8);
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        if (p.a(this.f39239o, iVar, this.f39258s)) {
            return;
        }
        if (this.f39260u == EnumC6713e.IMMEDIATE) {
            this.f39239o.c(new b(new C6761b(iVar), this.f39258s, this.f39259t));
        } else {
            this.f39239o.c(new a(iVar, this.f39258s, this.f39259t, this.f39260u == EnumC6713e.END));
        }
    }
}
