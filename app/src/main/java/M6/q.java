package m6;

import a6.InterfaceC0830g;
import d6.InterfaceC5732b;
import g6.EnumC5814b;

/* loaded from: classes2.dex */
public final class q extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final long f39358s;

    static final class a implements a6.i, InterfaceC5732b {

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39359o;

        /* renamed from: s, reason: collision with root package name */
        long f39360s;

        /* renamed from: t, reason: collision with root package name */
        InterfaceC5732b f39361t;

        a(a6.i iVar, long j8) {
            this.f39359o = iVar;
            this.f39360s = j8;
        }

        @Override // a6.i
        public void a() {
            this.f39359o.a();
        }

        @Override // a6.i
        public void b(Object obj) {
            long j8 = this.f39360s;
            if (j8 != 0) {
                this.f39360s = j8 - 1;
            } else {
                this.f39359o.b(obj);
            }
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f39361t.c();
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            if (EnumC5814b.l(this.f39361t, interfaceC5732b)) {
                this.f39361t = interfaceC5732b;
                this.f39359o.d(this);
            }
        }

        @Override // a6.i
        public void onError(Throwable th) {
            this.f39359o.onError(th);
        }
    }

    public q(InterfaceC0830g interfaceC0830g, long j8) {
        super(interfaceC0830g);
        this.f39358s = j8;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        this.f39239o.c(new a(iVar, this.f39358s));
    }
}
