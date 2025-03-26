package X5;

/* loaded from: classes2.dex */
public abstract class h {
    public static final Y5.a a(Y5.a aVar) {
        J6.r.e(aVar, "<this>");
        Y5.a A7 = aVar.A();
        Y5.a B7 = aVar.B();
        return B7 == null ? A7 : b(B7, A7, A7);
    }

    private static final Y5.a b(Y5.a aVar, Y5.a aVar2, Y5.a aVar3) {
        while (true) {
            Y5.a A7 = aVar.A();
            aVar3.G(A7);
            aVar = aVar.B();
            if (aVar == null) {
                return aVar2;
            }
            aVar3 = A7;
        }
    }

    public static final Y5.a c(Y5.a aVar) {
        J6.r.e(aVar, "<this>");
        while (true) {
            Y5.a B7 = aVar.B();
            if (B7 == null) {
                return aVar;
            }
            aVar = B7;
        }
    }

    public static final void d(Y5.a aVar, Z5.g gVar) {
        J6.r.e(gVar, "pool");
        while (aVar != null) {
            Y5.a z7 = aVar.z();
            aVar.E(gVar);
            aVar = z7;
        }
    }

    public static final long e(Y5.a aVar) {
        J6.r.e(aVar, "<this>");
        return f(aVar, 0L);
    }

    private static final long f(Y5.a aVar, long j8) {
        do {
            j8 += aVar.k() - aVar.i();
            aVar = aVar.B();
        } while (aVar != null);
        return j8;
    }
}
