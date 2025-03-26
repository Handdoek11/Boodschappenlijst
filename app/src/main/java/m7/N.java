package m7;

import i7.j;
import i7.k;

/* loaded from: classes2.dex */
public abstract class N {
    public static final i7.f a(i7.f fVar, n7.b bVar) {
        i7.f a8;
        J6.r.e(fVar, "<this>");
        J6.r.e(bVar, "module");
        if (!J6.r.a(fVar.e(), j.a.f36734a)) {
            return fVar.i() ? a(fVar.k(0), bVar) : fVar;
        }
        i7.f b8 = i7.b.b(bVar, fVar);
        return (b8 == null || (a8 = a(b8, bVar)) == null) ? fVar : a8;
    }

    public static final M b(l7.a aVar, i7.f fVar) {
        J6.r.e(aVar, "<this>");
        J6.r.e(fVar, "desc");
        i7.j e8 = fVar.e();
        if (e8 instanceof i7.d) {
            return M.POLY_OBJ;
        }
        if (J6.r.a(e8, k.b.f36737a)) {
            return M.LIST;
        }
        if (!J6.r.a(e8, k.c.f36738a)) {
            return M.OBJ;
        }
        i7.f a8 = a(fVar.k(0), aVar.a());
        i7.j e9 = a8.e();
        if ((e9 instanceof i7.e) || J6.r.a(e9, j.b.f36735a)) {
            return M.MAP;
        }
        if (aVar.d().b()) {
            return M.LIST;
        }
        throw u.c(a8);
    }
}
