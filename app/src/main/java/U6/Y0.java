package U6;

import Z6.AbstractC0796j;
import Z6.C0795i;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class Y0 {
    public static final Object a(A6.d dVar) {
        Object e8;
        A6.g context = dVar.getContext();
        AbstractC0751y0.g(context);
        A6.d c8 = B6.b.c(dVar);
        C0795i c0795i = c8 instanceof C0795i ? (C0795i) c8 : null;
        if (c0795i == null) {
            e8 = C6916E.f44463a;
        } else {
            if (c0795i.f6476u.x0(context)) {
                c0795i.m(context, C6916E.f44463a);
            } else {
                X0 x02 = new X0();
                A6.g u7 = context.u(x02);
                C6916E c6916e = C6916E.f44463a;
                c0795i.m(u7, c6916e);
                e8 = (!x02.f5430s || AbstractC0796j.d(c0795i)) ? B6.b.e() : c6916e;
            }
            e8 = B6.b.e();
        }
        if (e8 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e8 == B6.b.e() ? e8 : C6916E.f44463a;
    }
}
