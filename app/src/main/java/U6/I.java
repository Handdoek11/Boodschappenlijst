package U6;

import A6.e;
import A6.g;
import J6.AbstractC0650j;
import Z6.AbstractC0799m;
import Z6.C0795i;
import Z6.C0798l;

/* loaded from: classes2.dex */
public abstract class I extends A6.a implements A6.e {

    /* renamed from: s, reason: collision with root package name */
    public static final a f5403s = new a(null);

    public static final class a extends A6.b {

        /* renamed from: U6.I$a$a, reason: collision with other inner class name */
        static final class C0110a extends J6.s implements I6.l {

            /* renamed from: o, reason: collision with root package name */
            public static final C0110a f5404o = new C0110a();

            C0110a() {
                super(1);
            }

            @Override // I6.l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final I invoke(g.b bVar) {
                if (bVar instanceof I) {
                    return (I) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
            super(A6.e.f247a, C0110a.f5404o);
        }
    }

    public I() {
        super(A6.e.f247a);
    }

    @Override // A6.e
    public final A6.d X(A6.d dVar) {
        return new C0795i(this, dVar);
    }

    @Override // A6.a, A6.g.b, A6.g
    public g.b d(g.c cVar) {
        return e.a.a(this, cVar);
    }

    @Override // A6.a, A6.g.b, A6.g
    public A6.g f(g.c cVar) {
        return e.a.b(this, cVar);
    }

    public abstract void q0(A6.g gVar, Runnable runnable);

    public String toString() {
        return Q.a(this) + '@' + Q.b(this);
    }

    public void u0(A6.g gVar, Runnable runnable) {
        q0(gVar, runnable);
    }

    public boolean x0(A6.g gVar) {
        return true;
    }

    @Override // A6.e
    public final void z(A6.d dVar) {
        J6.r.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C0795i) dVar).v();
    }

    public I z0(int i8) {
        AbstractC0799m.a(i8);
        return new C0798l(this, i8);
    }
}
