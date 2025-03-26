package T6;

import J6.r;

/* loaded from: classes2.dex */
abstract class e {
    public static final double a(double d8, d dVar, d dVar2) {
        r.e(dVar, "sourceUnit");
        r.e(dVar2, "targetUnit");
        long convert = dVar2.c().convert(1L, dVar.c());
        return convert > 0 ? d8 * convert : d8 / dVar.c().convert(1L, dVar2.c());
    }

    public static final long b(long j8, d dVar, d dVar2) {
        r.e(dVar, "sourceUnit");
        r.e(dVar2, "targetUnit");
        return dVar2.c().convert(j8, dVar.c());
    }

    public static final long c(long j8, d dVar, d dVar2) {
        r.e(dVar, "sourceUnit");
        r.e(dVar2, "targetUnit");
        return dVar2.c().convert(j8, dVar.c());
    }
}
