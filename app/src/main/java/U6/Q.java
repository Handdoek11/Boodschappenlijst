package U6;

import Z6.C0795i;
import x6.C6934p;

/* loaded from: classes2.dex */
public abstract class Q {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(A6.d dVar) {
        Object b8;
        if (dVar instanceof C0795i) {
            return dVar.toString();
        }
        try {
            C6934p.a aVar = C6934p.f44487s;
            b8 = C6934p.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            C6934p.a aVar2 = C6934p.f44487s;
            b8 = C6934p.b(x6.q.a(th));
        }
        if (C6934p.e(b8) != null) {
            b8 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) b8;
    }
}
