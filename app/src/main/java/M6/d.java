package m6;

import X2.D;
import a6.InterfaceC0830g;
import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import g6.EnumC5814b;
import h6.AbstractC5844b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s6.AbstractC6760a;
import s6.C6761b;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class d extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final f6.g f39287s;

    static final class a implements a6.i, InterfaceC5732b {

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39288o;

        /* renamed from: s, reason: collision with root package name */
        final f6.g f39289s;

        /* renamed from: t, reason: collision with root package name */
        InterfaceC5732b f39290t;

        /* renamed from: u, reason: collision with root package name */
        final AtomicReference f39291u = new AtomicReference();

        /* renamed from: v, reason: collision with root package name */
        volatile long f39292v;

        /* renamed from: w, reason: collision with root package name */
        boolean f39293w;

        /* renamed from: m6.d$a$a, reason: collision with other inner class name */
        static final class C0294a extends AbstractC6760a {

            /* renamed from: s, reason: collision with root package name */
            final a f39294s;

            /* renamed from: t, reason: collision with root package name */
            final long f39295t;

            /* renamed from: u, reason: collision with root package name */
            final Object f39296u;

            /* renamed from: v, reason: collision with root package name */
            boolean f39297v;

            /* renamed from: w, reason: collision with root package name */
            final AtomicBoolean f39298w = new AtomicBoolean();

            C0294a(a aVar, long j8, Object obj) {
                this.f39294s = aVar;
                this.f39295t = j8;
                this.f39296u = obj;
            }

            @Override // a6.i
            public void a() {
                if (this.f39297v) {
                    return;
                }
                this.f39297v = true;
                f();
            }

            @Override // a6.i
            public void b(Object obj) {
                if (this.f39297v) {
                    return;
                }
                this.f39297v = true;
                c();
                f();
            }

            void f() {
                if (this.f39298w.compareAndSet(false, true)) {
                    this.f39294s.e(this.f39295t, this.f39296u);
                }
            }

            @Override // a6.i
            public void onError(Throwable th) {
                if (this.f39297v) {
                    AbstractC6805a.m(th);
                } else {
                    this.f39297v = true;
                    this.f39294s.onError(th);
                }
            }
        }

        a(a6.i iVar, f6.g gVar) {
            this.f39288o = iVar;
            this.f39289s = gVar;
        }

        @Override // a6.i
        public void a() {
            if (this.f39293w) {
                return;
            }
            this.f39293w = true;
            InterfaceC5732b interfaceC5732b = (InterfaceC5732b) this.f39291u.get();
            if (interfaceC5732b != EnumC5814b.DISPOSED) {
                C0294a c0294a = (C0294a) interfaceC5732b;
                if (c0294a != null) {
                    c0294a.f();
                }
                EnumC5814b.a(this.f39291u);
                this.f39288o.a();
            }
        }

        @Override // a6.i
        public void b(Object obj) {
            if (this.f39293w) {
                return;
            }
            long j8 = this.f39292v + 1;
            this.f39292v = j8;
            InterfaceC5732b interfaceC5732b = (InterfaceC5732b) this.f39291u.get();
            if (interfaceC5732b != null) {
                interfaceC5732b.c();
            }
            try {
                InterfaceC0830g interfaceC0830g = (InterfaceC0830g) AbstractC5844b.e(this.f39289s.apply(obj), "The ObservableSource supplied is null");
                C0294a c0294a = new C0294a(this, j8, obj);
                if (D.a(this.f39291u, interfaceC5732b, c0294a)) {
                    interfaceC0830g.c(c0294a);
                }
            } catch (Throwable th) {
                AbstractC5751a.b(th);
                c();
                this.f39288o.onError(th);
            }
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f39290t.c();
            EnumC5814b.a(this.f39291u);
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            if (EnumC5814b.l(this.f39290t, interfaceC5732b)) {
                this.f39290t = interfaceC5732b;
                this.f39288o.d(this);
            }
        }

        void e(long j8, Object obj) {
            if (j8 == this.f39292v) {
                this.f39288o.b(obj);
            }
        }

        @Override // a6.i
        public void onError(Throwable th) {
            EnumC5814b.a(this.f39291u);
            this.f39288o.onError(th);
        }
    }

    public d(InterfaceC0830g interfaceC0830g, f6.g gVar) {
        super(interfaceC0830g);
        this.f39287s = gVar;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        this.f39239o.c(new a(new C6761b(iVar), this.f39287s));
    }
}
