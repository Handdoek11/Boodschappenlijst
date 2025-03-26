package O;

import Q.B;
import z6.AbstractC7088a;

/* loaded from: classes.dex */
public abstract class f {
    public static final F.f a(e eVar) {
        return d.a(c(eVar), eVar, false, 2, null);
    }

    public static final F.f b(e eVar) {
        e c8 = c(eVar);
        F.f a8 = a(eVar);
        float e8 = c0.o.e(c8.h());
        float d8 = c0.o.d(c8.h());
        float h8 = P6.m.h(a8.d(), 0.0f, e8);
        float h9 = P6.m.h(a8.f(), 0.0f, d8);
        float h10 = P6.m.h(a8.e(), 0.0f, e8);
        float h11 = P6.m.h(a8.c(), 0.0f, d8);
        if (h8 == h10 || h9 == h11) {
            return F.f.f2218e.a();
        }
        long c9 = c8.c(F.e.a(h8, h9));
        long c10 = c8.c(F.e.a(h10, h9));
        long c11 = c8.c(F.e.a(h10, h11));
        long c12 = c8.c(F.e.a(h8, h11));
        return new F.f(AbstractC7088a.c(F.d.f(c9), F.d.f(c10), F.d.f(c12), F.d.f(c11)), AbstractC7088a.c(F.d.g(c9), F.d.g(c10), F.d.g(c12), F.d.g(c11)), AbstractC7088a.b(F.d.f(c9), F.d.f(c10), F.d.f(c12), F.d.f(c11)), AbstractC7088a.b(F.d.g(c9), F.d.g(c10), F.d.g(c12), F.d.g(c11)));
    }

    public static final e c(e eVar) {
        e eVar2;
        e k8 = eVar.k();
        while (true) {
            e eVar3 = k8;
            eVar2 = eVar;
            eVar = eVar3;
            if (eVar == null) {
                break;
            }
            k8 = eVar.k();
        }
        B b8 = eVar2 instanceof B ? (B) eVar2 : null;
        if (b8 == null) {
            return eVar2;
        }
        B y02 = b8.y0();
        while (true) {
            B b9 = y02;
            B b10 = b8;
            b8 = b9;
            if (b8 == null) {
                return b10;
            }
            y02 = b8.y0();
        }
    }
}
