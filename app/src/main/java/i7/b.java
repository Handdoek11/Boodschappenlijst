package i7;

import J6.r;
import k7.B0;

/* loaded from: classes2.dex */
public abstract class b {
    public static final Q6.b a(f fVar) {
        r.e(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f36700b;
        }
        if (fVar instanceof B0) {
            return a(((B0) fVar).m());
        }
        return null;
    }

    public static final f b(n7.b bVar, f fVar) {
        g7.b c8;
        r.e(bVar, "<this>");
        r.e(fVar, "descriptor");
        Q6.b a8 = a(fVar);
        if (a8 == null || (c8 = n7.b.c(bVar, a8, null, 2, null)) == null) {
            return null;
        }
        return c8.getDescriptor();
    }

    public static final f c(f fVar, Q6.b bVar) {
        r.e(fVar, "<this>");
        r.e(bVar, "context");
        return new c(fVar, bVar);
    }
}
