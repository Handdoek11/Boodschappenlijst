package a7;

import A6.d;
import I6.l;
import I6.p;
import Z6.AbstractC0796j;
import x6.C6916E;
import x6.C6934p;
import x6.q;

/* loaded from: classes2.dex */
public abstract class a {
    private static final void a(d dVar, Throwable th) {
        C6934p.a aVar = C6934p.f44487s;
        dVar.resumeWith(C6934p.b(q.a(th)));
        throw th;
    }

    public static final void b(d dVar, d dVar2) {
        try {
            d c8 = B6.b.c(dVar);
            C6934p.a aVar = C6934p.f44487s;
            AbstractC0796j.c(c8, C6934p.b(C6916E.f44463a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final void c(p pVar, Object obj, d dVar, l lVar) {
        try {
            d c8 = B6.b.c(B6.b.a(pVar, obj, dVar));
            C6934p.a aVar = C6934p.f44487s;
            AbstractC0796j.b(c8, C6934p.b(C6916E.f44463a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, d dVar, l lVar, int i8, Object obj2) {
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}
