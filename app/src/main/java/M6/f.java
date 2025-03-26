package m6;

import a6.InterfaceC0830g;
import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import f6.InterfaceC5793a;
import g6.EnumC5814b;
import io.reactivex.exceptions.CompositeException;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class f extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final f6.d f39305s;

    /* renamed from: t, reason: collision with root package name */
    final f6.d f39306t;

    /* renamed from: u, reason: collision with root package name */
    final InterfaceC5793a f39307u;

    /* renamed from: v, reason: collision with root package name */
    final InterfaceC5793a f39308v;

    static final class a implements a6.i, InterfaceC5732b {

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39309o;

        /* renamed from: s, reason: collision with root package name */
        final f6.d f39310s;

        /* renamed from: t, reason: collision with root package name */
        final f6.d f39311t;

        /* renamed from: u, reason: collision with root package name */
        final InterfaceC5793a f39312u;

        /* renamed from: v, reason: collision with root package name */
        final InterfaceC5793a f39313v;

        /* renamed from: w, reason: collision with root package name */
        InterfaceC5732b f39314w;

        /* renamed from: x, reason: collision with root package name */
        boolean f39315x;

        a(a6.i iVar, f6.d dVar, f6.d dVar2, InterfaceC5793a interfaceC5793a, InterfaceC5793a interfaceC5793a2) {
            this.f39309o = iVar;
            this.f39310s = dVar;
            this.f39311t = dVar2;
            this.f39312u = interfaceC5793a;
            this.f39313v = interfaceC5793a2;
        }

        @Override // a6.i
        public void a() {
            if (this.f39315x) {
                return;
            }
            try {
                this.f39312u.run();
                this.f39315x = true;
                this.f39309o.a();
                try {
                    this.f39313v.run();
                } catch (Throwable th) {
                    AbstractC5751a.b(th);
                    AbstractC6805a.m(th);
                }
            } catch (Throwable th2) {
                AbstractC5751a.b(th2);
                onError(th2);
            }
        }

        @Override // a6.i
        public void b(Object obj) {
            if (this.f39315x) {
                return;
            }
            try {
                this.f39310s.accept(obj);
                this.f39309o.b(obj);
            } catch (Throwable th) {
                AbstractC5751a.b(th);
                this.f39314w.c();
                onError(th);
            }
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f39314w.c();
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            if (EnumC5814b.l(this.f39314w, interfaceC5732b)) {
                this.f39314w = interfaceC5732b;
                this.f39309o.d(this);
            }
        }

        @Override // a6.i
        public void onError(Throwable th) {
            if (this.f39315x) {
                AbstractC6805a.m(th);
                return;
            }
            this.f39315x = true;
            try {
                this.f39311t.accept(th);
            } catch (Throwable th2) {
                AbstractC5751a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.f39309o.onError(th);
            try {
                this.f39313v.run();
            } catch (Throwable th3) {
                AbstractC5751a.b(th3);
                AbstractC6805a.m(th3);
            }
        }
    }

    public f(InterfaceC0830g interfaceC0830g, f6.d dVar, f6.d dVar2, InterfaceC5793a interfaceC5793a, InterfaceC5793a interfaceC5793a2) {
        super(interfaceC0830g);
        this.f39305s = dVar;
        this.f39306t = dVar2;
        this.f39307u = interfaceC5793a;
        this.f39308v = interfaceC5793a2;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        this.f39239o.c(new a(iVar, this.f39305s, this.f39306t, this.f39307u, this.f39308v));
    }
}
