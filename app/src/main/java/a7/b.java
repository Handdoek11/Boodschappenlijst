package a7;

import A6.d;
import A6.g;
import I6.p;
import J6.L;
import U6.C;
import U6.D0;
import Z6.A;
import Z6.I;
import kotlin.coroutines.jvm.internal.h;
import x6.C6934p;
import x6.q;

/* loaded from: classes2.dex */
public abstract class b {
    public static final void a(p pVar, Object obj, d dVar) {
        d a8 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c8 = I.c(context, null);
            try {
                Object invoke = ((p) L.d(pVar, 2)).invoke(obj, a8);
                if (invoke != B6.b.e()) {
                    a8.resumeWith(C6934p.b(invoke));
                }
            } finally {
                I.a(context, c8);
            }
        } catch (Throwable th) {
            C6934p.a aVar = C6934p.f44487s;
            a8.resumeWith(C6934p.b(q.a(th)));
        }
    }

    public static final Object b(A a8, Object obj, p pVar) {
        Object c8;
        try {
            c8 = ((p) L.d(pVar, 2)).invoke(obj, a8);
        } catch (Throwable th) {
            c8 = new C(th, false, 2, null);
        }
        if (c8 == B6.b.e()) {
            return B6.b.e();
        }
        Object x02 = a8.x0(c8);
        if (x02 == D0.f5391b) {
            return B6.b.e();
        }
        if (x02 instanceof C) {
            throw ((C) x02).f5374a;
        }
        return D0.h(x02);
    }
}
