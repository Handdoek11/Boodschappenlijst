package m6;

import a6.InterfaceC0830g;
import j6.AbstractC6081a;

/* loaded from: classes2.dex */
public final class e extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final f6.g f39299s;

    /* renamed from: t, reason: collision with root package name */
    final f6.c f39300t;

    static final class a extends AbstractC6081a {

        /* renamed from: w, reason: collision with root package name */
        final f6.g f39301w;

        /* renamed from: x, reason: collision with root package name */
        final f6.c f39302x;

        /* renamed from: y, reason: collision with root package name */
        Object f39303y;

        /* renamed from: z, reason: collision with root package name */
        boolean f39304z;

        a(a6.i iVar, f6.g gVar, f6.c cVar) {
            super(iVar);
            this.f39301w = gVar;
            this.f39302x = cVar;
        }

        @Override // a6.i
        public void b(Object obj) {
            if (this.f38350u) {
                return;
            }
            if (this.f38351v != 0) {
                this.f38347o.b(obj);
                return;
            }
            try {
                Object apply = this.f39301w.apply(obj);
                if (this.f39304z) {
                    boolean a8 = this.f39302x.a(this.f39303y, apply);
                    this.f39303y = apply;
                    if (a8) {
                        return;
                    }
                } else {
                    this.f39304z = true;
                    this.f39303y = apply;
                }
                this.f38347o.b(obj);
            } catch (Throwable th) {
                j(th);
            }
        }

        @Override // i6.InterfaceC5880e
        public Object f() {
            while (true) {
                Object f8 = this.f38349t.f();
                if (f8 == null) {
                    return null;
                }
                Object apply = this.f39301w.apply(f8);
                if (!this.f39304z) {
                    this.f39304z = true;
                    this.f39303y = apply;
                    return f8;
                }
                if (!this.f39302x.a(this.f39303y, apply)) {
                    this.f39303y = apply;
                    return f8;
                }
                this.f39303y = apply;
            }
        }

        @Override // i6.InterfaceC5877b
        public int i(int i8) {
            return k(i8);
        }
    }

    public e(InterfaceC0830g interfaceC0830g, f6.g gVar, f6.c cVar) {
        super(interfaceC0830g);
        this.f39299s = gVar;
        this.f39300t = cVar;
    }

    @Override // a6.AbstractC0829f
    protected void G(a6.i iVar) {
        this.f39239o.c(new a(iVar, this.f39299s, this.f39300t));
    }
}
