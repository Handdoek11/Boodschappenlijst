package j0;

import java.util.ArrayList;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6050b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r8 r16
  0x0033: PHI (r8v39 boolean) = (r8v1 boolean), (r8v41 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r8 r16
  0x0035: PHI (r8v3 boolean) = (r8v1 boolean), (r8v41 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r1v40, types: [j0.e] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [j0.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(j0.f r37, g0.d r38, int r39, int r40, j0.c r41) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC6050b.a(j0.f, g0.d, int, int, j0.c):void");
    }

    public static void b(f fVar, g0.d dVar, ArrayList arrayList, int i8) {
        int i9;
        c[] cVarArr;
        int i10;
        if (i8 == 0) {
            i9 = fVar.f38010W0;
            cVarArr = fVar.f38013Z0;
            i10 = 0;
        } else {
            i9 = fVar.f38011X0;
            cVarArr = fVar.f38012Y0;
            i10 = 2;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            c cVar = cVarArr[i11];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f37864a)) {
                a(fVar, dVar, i8, i10, cVar);
            }
        }
    }
}
