package U6;

import A6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: U6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0723k {
    public static final U a(M m8, A6.g gVar, O o8, I6.p pVar) {
        A6.g e8 = H.e(m8, gVar);
        V e02 = o8.f() ? new E0(e8, pVar) : new V(e8, true);
        e02.Y0(o8, e02, pVar);
        return e02;
    }

    public static /* synthetic */ U b(M m8, A6.g gVar, O o8, I6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = A6.h.f250o;
        }
        if ((i8 & 2) != 0) {
            o8 = O.DEFAULT;
        }
        return AbstractC0719i.a(m8, gVar, o8, pVar);
    }

    public static final InterfaceC0745v0 c(M m8, A6.g gVar, O o8, I6.p pVar) {
        A6.g e8 = H.e(m8, gVar);
        O0 f02 = o8.f() ? new F0(e8, pVar) : new O0(e8, true);
        f02.Y0(o8, f02, pVar);
        return f02;
    }

    public static /* synthetic */ InterfaceC0745v0 d(M m8, A6.g gVar, O o8, I6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = A6.h.f250o;
        }
        if ((i8 & 2) != 0) {
            o8 = O.DEFAULT;
        }
        return AbstractC0719i.c(m8, gVar, o8, pVar);
    }

    public static final Object e(A6.g gVar, I6.p pVar, A6.d dVar) {
        Object Z02;
        A6.g context = dVar.getContext();
        A6.g d8 = H.d(context, gVar);
        AbstractC0751y0.g(d8);
        if (d8 == context) {
            Z6.A a8 = new Z6.A(d8, dVar);
            Z02 = a7.b.b(a8, a8, pVar);
        } else {
            e.b bVar = A6.e.f247a;
            if (J6.r.a(d8.d(bVar), context.d(bVar))) {
                U0 u02 = new U0(d8, dVar);
                A6.g context2 = u02.getContext();
                Object c8 = Z6.I.c(context2, null);
                try {
                    Object b8 = a7.b.b(u02, u02, pVar);
                    Z6.I.a(context2, c8);
                    Z02 = b8;
                } catch (Throwable th) {
                    Z6.I.a(context2, c8);
                    throw th;
                }
            } else {
                Y y7 = new Y(d8, dVar);
                a7.a.d(pVar, y7, y7, null, 4, null);
                Z02 = y7.Z0();
            }
        }
        if (Z02 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return Z02;
    }
}
