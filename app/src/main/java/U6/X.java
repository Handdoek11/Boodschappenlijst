package U6;

import A6.g;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class X {
    public static final Object a(long j8, A6.d dVar) {
        if (j8 <= 0) {
            return C6916E.f44463a;
        }
        C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
        c0733p.C();
        if (j8 < Long.MAX_VALUE) {
            b(c0733p.getContext()).E(j8, c0733p);
        }
        Object z7 = c0733p.z();
        if (z7 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z7 == B6.b.e() ? z7 : C6916E.f44463a;
    }

    public static final W b(A6.g gVar) {
        g.b d8 = gVar.d(A6.e.f247a);
        W w7 = d8 instanceof W ? (W) d8 : null;
        return w7 == null ? T.a() : w7;
    }
}
