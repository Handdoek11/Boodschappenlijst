package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.Objects;

/* renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5889i {
    public static boolean i(o oVar, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.ERA : rVar != null && rVar.m(oVar);
    }

    public static n p(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "temporal");
        Object obj = (n) oVar.v(j$.time.temporal.n.e());
        u uVar = u.f37068d;
        if (obj == null) {
            obj = Objects.requireNonNull(uVar, "defaultObj");
        }
        return (n) obj;
    }

    public static int e(InterfaceC5891k interfaceC5891k, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i8 = AbstractC5890j.f37044a[((j$.time.temporal.a) rVar).ordinal()];
            if (i8 == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i8 == 2) {
                return interfaceC5891k.g().I();
            }
            return interfaceC5891k.y().k(rVar);
        }
        return j$.time.temporal.n.a(interfaceC5891k, rVar);
    }

    public static int f(o oVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return oVar.getValue();
        }
        return j$.time.temporal.n.a(oVar, aVar);
    }

    public static long g(o oVar, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return oVar.getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return rVar.k(oVar);
    }

    public static Object m(o oVar, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.ERAS;
        }
        return j$.time.temporal.n.c(oVar, tVar);
    }

    public static Object k(InterfaceC5885e interfaceC5885e, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return interfaceC5885e.b();
        }
        if (tVar == j$.time.temporal.n.e()) {
            return interfaceC5885e.a();
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(interfaceC5885e);
    }

    public static boolean h(InterfaceC5882b interfaceC5882b, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).v();
        }
        return rVar != null && rVar.m(interfaceC5882b);
    }

    public static long n(InterfaceC5885e interfaceC5885e, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((interfaceC5885e.c().t() * 86400) + interfaceC5885e.b().T()) - zoneOffset.I();
    }

    public static Object l(InterfaceC5891k interfaceC5891k, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.k()) {
            return interfaceC5891k.q();
        }
        if (tVar == j$.time.temporal.n.h()) {
            return interfaceC5891k.g();
        }
        if (tVar == j$.time.temporal.n.g()) {
            return interfaceC5891k.b();
        }
        if (tVar == j$.time.temporal.n.e()) {
            return interfaceC5891k.a();
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(interfaceC5891k);
    }

    public static int c(InterfaceC5885e interfaceC5885e, InterfaceC5885e interfaceC5885e2) {
        int compareTo = interfaceC5885e.c().compareTo(interfaceC5885e2.c());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = interfaceC5885e.b().compareTo(interfaceC5885e2.b());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((AbstractC5881a) interfaceC5885e.a()).i().compareTo(interfaceC5885e2.a().i());
    }

    public static Object j(InterfaceC5882b interfaceC5882b, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.e()) {
            return interfaceC5882b.a();
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.DAYS;
        }
        return tVar.a(interfaceC5882b);
    }

    public static j$.time.temporal.m a(InterfaceC5882b interfaceC5882b, j$.time.temporal.m mVar) {
        return mVar.d(interfaceC5882b.t(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long o(InterfaceC5891k interfaceC5891k) {
        return ((interfaceC5891k.c().t() * 86400) + interfaceC5891k.b().T()) - interfaceC5891k.g().I();
    }

    public static int d(InterfaceC5891k interfaceC5891k, InterfaceC5891k interfaceC5891k2) {
        int compare = Long.compare(interfaceC5891k.B(), interfaceC5891k2.B());
        if (compare != 0) {
            return compare;
        }
        int H7 = interfaceC5891k.b().H() - interfaceC5891k2.b().H();
        if (H7 != 0) {
            return H7;
        }
        int compareTo = interfaceC5891k.y().compareTo(interfaceC5891k2.y());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = interfaceC5891k.q().i().compareTo(interfaceC5891k2.q().i());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((AbstractC5881a) interfaceC5891k.a()).i().compareTo(interfaceC5891k2.a().i());
    }

    public static int b(InterfaceC5882b interfaceC5882b, InterfaceC5882b interfaceC5882b2) {
        int compare = Long.compare(interfaceC5882b.t(), interfaceC5882b2.t());
        if (compare != 0) {
            return compare;
        }
        return ((AbstractC5881a) interfaceC5882b.a()).i().compareTo(interfaceC5882b2.a().i());
    }
}
