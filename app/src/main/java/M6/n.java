package m6;

import a6.InterfaceC0830g;
import h6.AbstractC5844b;
import j6.AbstractC6081a;

/* loaded from: classes2.dex */
public final class n extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final f6.g f39340s;

    static final class a extends AbstractC6081a {

        /* renamed from: w, reason: collision with root package name */
        final f6.g f39341w;

        a(a6.i iVar, f6.g gVar) {
            super(iVar);
            this.f39341w = gVar;
        }

        @Override // a6.i
        public void b(Object obj) {
            if (this.f38350u) {
                return;
            }
            if (this.f38351v != 0) {
                this.f38347o.b(null);
                return;
            }
            try {
                this.f38347o.b(AbstractC5844b.e(this.f39341w.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th) {
                j(th);
            }
        }

        @Override // i6.InterfaceC5880e
        public Object f() {
            Object f8 = this.f38349t.f();
            if (f8 != null) {
                return AbstractC5844b.e(this.f39341w.apply(f8), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // i6.InterfaceC5877b
        public int i(int i8) {
            return k(i8);
        }
    }

    public n(InterfaceC0830g interfaceC0830g, f6.g gVar) {
        super(interfaceC0830g);
        this.f39340s = gVar;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        this.f39239o.c(new a(iVar, this.f39340s));
    }
}
