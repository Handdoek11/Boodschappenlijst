package m6;

import a6.AbstractC0827d;
import a6.InterfaceC0828e;
import a6.InterfaceC0830g;
import d6.InterfaceC5732b;
import g6.EnumC5814b;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class g extends AbstractC0827d {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0830g f39316a;

    /* renamed from: b, reason: collision with root package name */
    final long f39317b;

    static final class a implements a6.i, InterfaceC5732b {

        /* renamed from: o, reason: collision with root package name */
        final InterfaceC0828e f39318o;

        /* renamed from: s, reason: collision with root package name */
        final long f39319s;

        /* renamed from: t, reason: collision with root package name */
        InterfaceC5732b f39320t;

        /* renamed from: u, reason: collision with root package name */
        long f39321u;

        /* renamed from: v, reason: collision with root package name */
        boolean f39322v;

        a(InterfaceC0828e interfaceC0828e, long j8) {
            this.f39318o = interfaceC0828e;
            this.f39319s = j8;
        }

        @Override // a6.i
        public void a() {
            if (this.f39322v) {
                return;
            }
            this.f39322v = true;
            this.f39318o.a();
        }

        @Override // a6.i
        public void b(Object obj) {
            if (this.f39322v) {
                return;
            }
            long j8 = this.f39321u;
            if (j8 != this.f39319s) {
                this.f39321u = j8 + 1;
                return;
            }
            this.f39322v = true;
            this.f39320t.c();
            this.f39318o.b(obj);
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f39320t.c();
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            if (EnumC5814b.l(this.f39320t, interfaceC5732b)) {
                this.f39320t = interfaceC5732b;
                this.f39318o.d(this);
            }
        }

        @Override // a6.i
        public void onError(Throwable th) {
            if (this.f39322v) {
                AbstractC6805a.m(th);
            } else {
                this.f39322v = true;
                this.f39318o.onError(th);
            }
        }
    }

    public g(InterfaceC0830g interfaceC0830g, long j8) {
        this.f39316a = interfaceC0830g;
        this.f39317b = j8;
    }

    @Override // a6.AbstractC0827d
    public void d(InterfaceC0828e interfaceC0828e) {
        this.f39316a.c(new a(interfaceC0828e, this.f39317b));
    }
}
