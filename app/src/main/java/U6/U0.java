package U6;

import x6.C6916E;
import x6.C6933o;

/* loaded from: classes2.dex */
public final class U0 extends Z6.A {
    private volatile boolean threadLocalIsSet;

    /* renamed from: v, reason: collision with root package name */
    private final ThreadLocal f5427v;

    /* JADX WARN: Illegal instructions before constructor call */
    public U0(A6.g gVar, A6.d dVar) {
        V0 v02 = V0.f5428o;
        super(gVar.d(v02) == null ? gVar.u(v02) : gVar, dVar);
        this.f5427v = new ThreadLocal();
        if (dVar.getContext().d(A6.e.f247a) instanceof I) {
            return;
        }
        Object c8 = Z6.I.c(gVar, null);
        Z6.I.a(gVar, c8);
        a1(gVar, c8);
    }

    @Override // Z6.A, U6.AbstractC0703a
    protected void V0(Object obj) {
        if (this.threadLocalIsSet) {
            C6933o c6933o = (C6933o) this.f5427v.get();
            if (c6933o != null) {
                Z6.I.a((A6.g) c6933o.a(), c6933o.b());
            }
            this.f5427v.remove();
        }
        Object a8 = F.a(obj, this.f6446u);
        A6.d dVar = this.f6446u;
        A6.g context = dVar.getContext();
        Object c8 = Z6.I.c(context, null);
        U0 g8 = c8 != Z6.I.f6454a ? H.g(dVar, context, c8) : null;
        try {
            this.f6446u.resumeWith(a8);
            C6916E c6916e = C6916E.f44463a;
        } finally {
            if (g8 == null || g8.Z0()) {
                Z6.I.a(context, c8);
            }
        }
    }

    public final boolean Z0() {
        boolean z7 = this.threadLocalIsSet && this.f5427v.get() == null;
        this.f5427v.remove();
        return !z7;
    }

    public final void a1(A6.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f5427v.set(x6.u.a(gVar, obj));
    }
}
