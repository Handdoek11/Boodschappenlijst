package m6;

import a6.InterfaceC0830g;
import j6.AbstractC6081a;

/* loaded from: classes2.dex */
public final class i extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final f6.i f39324s;

    static final class a extends AbstractC6081a {

        /* renamed from: w, reason: collision with root package name */
        final f6.i f39325w;

        a(a6.i iVar, f6.i iVar2) {
            super(iVar);
            this.f39325w = iVar2;
        }

        @Override // a6.i
        public void b(Object obj) {
            if (this.f38351v != 0) {
                this.f38347o.b(null);
                return;
            }
            try {
                if (this.f39325w.test(obj)) {
                    this.f38347o.b(obj);
                }
            } catch (Throwable th) {
                j(th);
            }
        }

        @Override // i6.InterfaceC5880e
        public Object f() {
            Object f8;
            do {
                f8 = this.f38349t.f();
                if (f8 == null) {
                    break;
                }
            } while (!this.f39325w.test(f8));
            return f8;
        }

        @Override // i6.InterfaceC5877b
        public int i(int i8) {
            return k(i8);
        }
    }

    public i(InterfaceC0830g interfaceC0830g, f6.i iVar) {
        super(interfaceC0830g);
        this.f39324s = iVar;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        this.f39239o.c(new a(iVar, this.f39324s));
    }
}
