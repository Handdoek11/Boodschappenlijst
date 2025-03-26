package k0;

import j0.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class i {
    public static o a(j0.e eVar, int i8, ArrayList arrayList, o oVar) {
        int t12;
        int i9 = i8 == 0 ? eVar.f37923I0 : eVar.f37925J0;
        if (i9 != -1 && (oVar == null || i9 != oVar.c())) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i10);
                if (oVar2.c() == i9) {
                    if (oVar != null) {
                        oVar.g(i8, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i10++;
                }
            }
        } else if (i9 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof j0.j) && (t12 = ((j0.j) eVar).t1(i8)) != -1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i11);
                    if (oVar3.c() == t12) {
                        oVar = oVar3;
                        break;
                    }
                    i11++;
                }
            }
            if (oVar == null) {
                oVar = new o(i8);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof j0.h) {
                j0.h hVar = (j0.h) eVar;
                hVar.s1().c(hVar.t1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i8 == 0) {
                eVar.f37923I0 = oVar.c();
                eVar.f37930O.c(i8, arrayList, oVar);
                eVar.f37932Q.c(i8, arrayList, oVar);
            } else {
                eVar.f37925J0 = oVar.c();
                eVar.f37931P.c(i8, arrayList, oVar);
                eVar.f37934S.c(i8, arrayList, oVar);
                eVar.f37933R.c(i8, arrayList, oVar);
            }
            eVar.f37937V.c(i8, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i8) {
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (i8 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(j0.f r16, k0.C6087b.InterfaceC0283b r17) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.i.c(j0.f, k0.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
