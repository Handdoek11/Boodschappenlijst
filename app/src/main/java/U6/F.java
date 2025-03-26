package U6;

import x6.C6934p;

/* loaded from: classes2.dex */
public abstract class F {
    public static final Object a(Object obj, A6.d dVar) {
        if (!(obj instanceof C)) {
            return C6934p.b(obj);
        }
        C6934p.a aVar = C6934p.f44487s;
        return C6934p.b(x6.q.a(((C) obj).f5374a));
    }

    public static final Object b(Object obj, I6.l lVar) {
        Throwable e8 = C6934p.e(obj);
        return e8 == null ? lVar != null ? new D(obj, lVar) : obj : new C(e8, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC0731o interfaceC0731o) {
        Throwable e8 = C6934p.e(obj);
        return e8 == null ? obj : new C(e8, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, I6.l lVar, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
