package k7;

import x6.C6934p;

/* renamed from: k7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6143o {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f38713a;

    static {
        Object b8;
        try {
            C6934p.a aVar = C6934p.f44487s;
            b8 = C6934p.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            C6934p.a aVar2 = C6934p.f44487s;
            b8 = C6934p.b(x6.q.a(th));
        }
        if (C6934p.h(b8)) {
            b8 = Boolean.TRUE;
        }
        Object b9 = C6934p.b(b8);
        Boolean bool = Boolean.FALSE;
        if (C6934p.g(b9)) {
            b9 = bool;
        }
        f38713a = ((Boolean) b9).booleanValue();
    }

    public static final D0 a(I6.l lVar) {
        J6.r.e(lVar, "factory");
        return f38713a ? new C6152t(lVar) : new C6162y(lVar);
    }

    public static final InterfaceC6144o0 b(I6.p pVar) {
        J6.r.e(pVar, "factory");
        return f38713a ? new C6156v(pVar) : new C6163z(pVar);
    }
}
