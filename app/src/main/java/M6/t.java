package m6;

import a6.InterfaceC0830g;
import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import g6.EnumC5814b;
import h6.AbstractC5844b;
import java.util.concurrent.atomic.AtomicReference;
import s6.C6761b;

/* loaded from: classes2.dex */
public final class t extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final f6.b f39382s;

    /* renamed from: t, reason: collision with root package name */
    final InterfaceC0830g f39383t;

    static final class a extends AtomicReference implements a6.i, InterfaceC5732b {

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39384o;

        /* renamed from: s, reason: collision with root package name */
        final f6.b f39385s;

        /* renamed from: t, reason: collision with root package name */
        final AtomicReference f39386t = new AtomicReference();

        /* renamed from: u, reason: collision with root package name */
        final AtomicReference f39387u = new AtomicReference();

        a(a6.i iVar, f6.b bVar) {
            this.f39384o = iVar;
            this.f39385s = bVar;
        }

        @Override // a6.i
        public void a() {
            EnumC5814b.a(this.f39387u);
            this.f39384o.a();
        }

        @Override // a6.i
        public void b(Object obj) {
            Object obj2 = get();
            if (obj2 != null) {
                try {
                    this.f39384o.b(AbstractC5844b.e(this.f39385s.apply(obj, obj2), "The combiner returned a null value"));
                } catch (Throwable th) {
                    AbstractC5751a.b(th);
                    c();
                    this.f39384o.onError(th);
                }
            }
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            EnumC5814b.a(this.f39386t);
            EnumC5814b.a(this.f39387u);
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            EnumC5814b.i(this.f39386t, interfaceC5732b);
        }

        public void e(Throwable th) {
            EnumC5814b.a(this.f39386t);
            this.f39384o.onError(th);
        }

        public boolean f(InterfaceC5732b interfaceC5732b) {
            return EnumC5814b.i(this.f39387u, interfaceC5732b);
        }

        @Override // a6.i
        public void onError(Throwable th) {
            EnumC5814b.a(this.f39387u);
            this.f39384o.onError(th);
        }
    }

    public t(InterfaceC0830g interfaceC0830g, f6.b bVar, InterfaceC0830g interfaceC0830g2) {
        super(interfaceC0830g);
        this.f39382s = bVar;
        this.f39383t = interfaceC0830g2;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        C6761b c6761b = new C6761b(iVar);
        a aVar = new a(c6761b, this.f39382s);
        c6761b.d(aVar);
        this.f39383t.c(new b(aVar));
        this.f39239o.c(aVar);
    }

    final class b implements a6.i {

        /* renamed from: o, reason: collision with root package name */
        private final a f39388o;

        b(a aVar) {
            this.f39388o = aVar;
        }

        @Override // a6.i
        public void b(Object obj) {
            this.f39388o.lazySet(obj);
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            this.f39388o.f(interfaceC5732b);
        }

        @Override // a6.i
        public void onError(Throwable th) {
            this.f39388o.e(th);
        }

        @Override // a6.i
        public void a() {
        }
    }
}
