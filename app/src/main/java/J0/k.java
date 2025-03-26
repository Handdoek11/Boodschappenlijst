package j0;

import j0.e;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f38084a = new boolean[3];

    static void a(f fVar, g0.d dVar, e eVar) {
        eVar.f37980t = -1;
        eVar.f37982u = -1;
        e.b bVar = fVar.f37941Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f37941Z[0] == e.b.MATCH_PARENT) {
            int i8 = eVar.f37930O.f37892g;
            int W7 = fVar.W() - eVar.f37932Q.f37892g;
            d dVar2 = eVar.f37930O;
            dVar2.f37894i = dVar.q(dVar2);
            d dVar3 = eVar.f37932Q;
            dVar3.f37894i = dVar.q(dVar3);
            dVar.f(eVar.f37930O.f37894i, i8);
            dVar.f(eVar.f37932Q.f37894i, W7);
            eVar.f37980t = 2;
            eVar.P0(i8, W7);
        }
        if (fVar.f37941Z[1] == bVar2 || eVar.f37941Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i9 = eVar.f37931P.f37892g;
        int x7 = fVar.x() - eVar.f37933R.f37892g;
        d dVar4 = eVar.f37931P;
        dVar4.f37894i = dVar.q(dVar4);
        d dVar5 = eVar.f37933R;
        dVar5.f37894i = dVar.q(dVar5);
        dVar.f(eVar.f37931P.f37894i, i9);
        dVar.f(eVar.f37933R.f37894i, x7);
        if (eVar.f37965l0 > 0 || eVar.V() == 8) {
            d dVar6 = eVar.f37934S;
            dVar6.f37894i = dVar.q(dVar6);
            dVar.f(eVar.f37934S.f37894i, eVar.f37965l0 + i9);
        }
        eVar.f37982u = 2;
        eVar.g1(i9, x7);
    }

    public static final boolean b(int i8, int i9) {
        return (i8 & i9) == i9;
    }
}
