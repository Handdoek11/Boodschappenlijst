package W;

import t.M;
import x6.C6916E;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Z.d f5798a = Z.c.a();

    /* renamed from: b, reason: collision with root package name */
    private final V.b f5799b = new V.b(16);

    static final class a extends J6.s implements I6.l {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ x f5801s;

        a(x xVar) {
            super(1);
        }

        public final void b(z zVar) {
            Z.d b8 = y.this.b();
            y yVar = y.this;
            x xVar = this.f5801s;
            synchronized (b8) {
                try {
                    if (zVar.b()) {
                        yVar.f5799b.e(xVar, zVar);
                    } else {
                        yVar.f5799b.f(xVar);
                    }
                    C6916E c6916e = C6916E.f44463a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((z) obj);
            return C6916E.f44463a;
        }
    }

    public final Z.d b() {
        return this.f5798a;
    }

    public final M c(x xVar, I6.l lVar) {
        synchronized (this.f5798a) {
            z zVar = (z) this.f5799b.d(xVar);
            if (zVar != null) {
                if (zVar.b()) {
                    return zVar;
                }
            }
            try {
                z zVar2 = (z) lVar.invoke(new a(xVar));
                synchronized (this.f5798a) {
                    try {
                        if (this.f5799b.d(xVar) == null && zVar2.b()) {
                            this.f5799b.e(xVar, zVar2);
                        }
                        C6916E c6916e = C6916E.f44463a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zVar2;
            } catch (Exception e8) {
                throw new IllegalStateException("Could not load font", e8);
            }
        }
    }
}
