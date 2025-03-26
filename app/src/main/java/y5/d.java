package Y5;

import J6.r;
import X5.n;
import X5.q;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6135a = new byte[0];

    public static final void a(n nVar, a aVar) {
        r.e(nVar, "<this>");
        r.e(aVar, "current");
        if (aVar == nVar) {
            return;
        }
        if (aVar.k() <= aVar.i()) {
            nVar.z(aVar);
        } else if (aVar.f() - aVar.g() < 8) {
            nVar.E(aVar);
        } else {
            nVar.D0(aVar.i());
        }
    }

    public static final a b(n nVar, int i8) {
        r.e(nVar, "<this>");
        return nVar.p0(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a c(n nVar, a aVar) {
        r.e(nVar, "<this>");
        r.e(aVar, "current");
        if (aVar != nVar) {
            return nVar.B(aVar);
        }
        if (nVar.g()) {
            return (a) nVar;
        }
        return null;
    }

    public static final a d(q qVar, int i8, a aVar) {
        r.e(qVar, "<this>");
        if (aVar != null) {
            qVar.d();
        }
        return qVar.G(i8);
    }
}
