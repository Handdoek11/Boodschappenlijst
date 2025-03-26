package k0;

import j0.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k0.C6087b;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6090e {

    /* renamed from: a, reason: collision with root package name */
    private j0.f f38408a;

    /* renamed from: d, reason: collision with root package name */
    private j0.f f38411d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38409b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38410c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f38412e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f38413f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private C6087b.InterfaceC0283b f38414g = null;

    /* renamed from: h, reason: collision with root package name */
    private C6087b.a f38415h = new C6087b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList f38416i = new ArrayList();

    public C6090e(j0.f fVar) {
        this.f38408a = fVar;
        this.f38411d = fVar;
    }

    private void a(C6091f c6091f, int i8, int i9, C6091f c6091f2, ArrayList arrayList, m mVar) {
        p pVar = c6091f.f38420d;
        if (pVar.f38471c == null) {
            j0.f fVar = this.f38408a;
            if (pVar == fVar.f37950e || pVar == fVar.f37952f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i9);
                arrayList.add(mVar);
            }
            pVar.f38471c = mVar;
            mVar.a(pVar);
            for (InterfaceC6089d interfaceC6089d : pVar.f38476h.f38427k) {
                if (interfaceC6089d instanceof C6091f) {
                    a((C6091f) interfaceC6089d, i8, 0, c6091f2, arrayList, mVar);
                }
            }
            for (InterfaceC6089d interfaceC6089d2 : pVar.f38477i.f38427k) {
                if (interfaceC6089d2 instanceof C6091f) {
                    a((C6091f) interfaceC6089d2, i8, 1, c6091f2, arrayList, mVar);
                }
            }
            if (i8 == 1 && (pVar instanceof n)) {
                for (InterfaceC6089d interfaceC6089d3 : ((n) pVar).f38452k.f38427k) {
                    if (interfaceC6089d3 instanceof C6091f) {
                        a((C6091f) interfaceC6089d3, i8, 2, c6091f2, arrayList, mVar);
                    }
                }
            }
            for (C6091f c6091f3 : pVar.f38476h.f38428l) {
                if (c6091f3 == c6091f2) {
                    mVar.f38446b = true;
                }
                a(c6091f3, i8, 0, c6091f2, arrayList, mVar);
            }
            for (C6091f c6091f4 : pVar.f38477i.f38428l) {
                if (c6091f4 == c6091f2) {
                    mVar.f38446b = true;
                }
                a(c6091f4, i8, 1, c6091f2, arrayList, mVar);
            }
            if (i8 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f38452k.f38428l.iterator();
                while (it.hasNext()) {
                    a((C6091f) it.next(), i8, 2, c6091f2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(j0.f fVar) {
        int i8;
        e.b bVar;
        int i9;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator it = fVar.f38098L0.iterator();
        while (it.hasNext()) {
            j0.e eVar = (j0.e) it.next();
            e.b[] bVarArr = eVar.f37941Z;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (eVar.V() == 8) {
                eVar.f37942a = true;
            } else {
                if (eVar.f37908B < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    eVar.f37986w = 2;
                }
                if (eVar.f37914E < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    eVar.f37988x = 2;
                }
                if (eVar.v() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        eVar.f37986w = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        eVar.f37988x = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (eVar.f37986w == 0) {
                            eVar.f37986w = 3;
                        }
                        if (eVar.f37988x == 0) {
                            eVar.f37988x = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && eVar.f37986w == 1 && (eVar.f37930O.f37891f == null || eVar.f37932Q.f37891f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && eVar.f37988x == 1 && (eVar.f37931P.f37891f == null || eVar.f37933R.f37891f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = eVar.f37950e;
                lVar.f38472d = bVar9;
                int i10 = eVar.f37986w;
                lVar.f38469a = i10;
                n nVar = eVar.f37952f;
                nVar.f38472d = bVar10;
                int i11 = eVar.f37988x;
                nVar.f38469a = i11;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int W7 = eVar.W();
                    if (bVar9 == bVar11) {
                        i8 = (fVar.W() - eVar.f37930O.f37892g) - eVar.f37932Q.f37892g;
                        bVar = e.b.FIXED;
                    } else {
                        i8 = W7;
                        bVar = bVar9;
                    }
                    int x7 = eVar.x();
                    if (bVar10 == bVar11) {
                        i9 = (fVar.x() - eVar.f37931P.f37892g) - eVar.f37933R.f37892g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i9 = x7;
                        bVar2 = bVar10;
                    }
                    l(eVar, bVar, i8, bVar2, i9);
                    eVar.f37950e.f38473e.d(eVar.W());
                    eVar.f37952f.f38473e.d(eVar.x());
                    eVar.f37942a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i10 == 3) {
                            if (bVar10 == bVar4) {
                                l(eVar, bVar4, 0, bVar4, 0);
                            }
                            int x8 = eVar.x();
                            int i12 = (int) ((x8 * eVar.f37949d0) + 0.5f);
                            e.b bVar12 = e.b.FIXED;
                            l(eVar, bVar12, i12, bVar12, x8);
                            eVar.f37950e.f38473e.d(eVar.W());
                            eVar.f37952f.f38473e.d(eVar.x());
                            eVar.f37942a = true;
                        } else if (i10 == 1) {
                            l(eVar, bVar4, 0, bVar10, 0);
                            eVar.f37950e.f38473e.f38438m = eVar.W();
                        } else if (i10 == 2) {
                            e.b bVar13 = fVar.f37941Z[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                l(eVar, bVar14, (int) ((eVar.f37908B * fVar.W()) + 0.5f), bVar10, eVar.x());
                                eVar.f37950e.f38473e.d(eVar.W());
                                eVar.f37952f.f38473e.d(eVar.x());
                                eVar.f37942a = true;
                            }
                        } else {
                            j0.d[] dVarArr = eVar.f37938W;
                            if (dVarArr[0].f37891f == null || dVarArr[1].f37891f == null) {
                                l(eVar, bVar4, 0, bVar10, 0);
                                eVar.f37950e.f38473e.d(eVar.W());
                                eVar.f37952f.f38473e.d(eVar.x());
                                eVar.f37942a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i11 == 3) {
                            if (bVar9 == bVar3) {
                                l(eVar, bVar3, 0, bVar3, 0);
                            }
                            int W8 = eVar.W();
                            float f8 = eVar.f37949d0;
                            if (eVar.w() == -1) {
                                f8 = 1.0f / f8;
                            }
                            e.b bVar15 = e.b.FIXED;
                            l(eVar, bVar15, W8, bVar15, (int) ((W8 * f8) + 0.5f));
                            eVar.f37950e.f38473e.d(eVar.W());
                            eVar.f37952f.f38473e.d(eVar.x());
                            eVar.f37942a = true;
                        } else if (i11 == 1) {
                            l(eVar, bVar9, 0, bVar3, 0);
                            eVar.f37952f.f38473e.f38438m = eVar.x();
                        } else if (i11 == 2) {
                            e.b bVar16 = fVar.f37941Z[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                l(eVar, bVar9, eVar.W(), bVar17, (int) ((eVar.f37914E * fVar.x()) + 0.5f));
                                eVar.f37950e.f38473e.d(eVar.W());
                                eVar.f37952f.f38473e.d(eVar.x());
                                eVar.f37942a = true;
                            }
                        } else {
                            j0.d[] dVarArr2 = eVar.f37938W;
                            if (dVarArr2[2].f37891f == null || dVarArr2[3].f37891f == null) {
                                l(eVar, bVar3, 0, bVar10, 0);
                                eVar.f37950e.f38473e.d(eVar.W());
                                eVar.f37952f.f38473e.d(eVar.x());
                                eVar.f37942a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i10 == 1 || i11 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(eVar, bVar18, 0, bVar18, 0);
                            eVar.f37950e.f38473e.f38438m = eVar.W();
                            eVar.f37952f.f38473e.f38438m = eVar.x();
                        } else if (i11 == 2 && i10 == 2) {
                            e.b[] bVarArr2 = fVar.f37941Z;
                            e.b bVar19 = bVarArr2[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr2[1] == bVar20) {
                                l(eVar, bVar20, (int) ((eVar.f37908B * fVar.W()) + 0.5f), bVar20, (int) ((eVar.f37914E * fVar.x()) + 0.5f));
                                eVar.f37950e.f38473e.d(eVar.W());
                                eVar.f37952f.f38473e.d(eVar.x());
                                eVar.f37942a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(j0.f fVar, int i8) {
        int size = this.f38416i.size();
        long j8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            j8 = Math.max(j8, ((m) this.f38416i.get(i9)).b(fVar, i8));
        }
        return (int) j8;
    }

    private void i(p pVar, int i8, ArrayList arrayList) {
        for (InterfaceC6089d interfaceC6089d : pVar.f38476h.f38427k) {
            if (interfaceC6089d instanceof C6091f) {
                a((C6091f) interfaceC6089d, i8, 0, pVar.f38477i, arrayList, null);
            } else if (interfaceC6089d instanceof p) {
                a(((p) interfaceC6089d).f38476h, i8, 0, pVar.f38477i, arrayList, null);
            }
        }
        for (InterfaceC6089d interfaceC6089d2 : pVar.f38477i.f38427k) {
            if (interfaceC6089d2 instanceof C6091f) {
                a((C6091f) interfaceC6089d2, i8, 1, pVar.f38476h, arrayList, null);
            } else if (interfaceC6089d2 instanceof p) {
                a(((p) interfaceC6089d2).f38477i, i8, 1, pVar.f38476h, arrayList, null);
            }
        }
        if (i8 == 1) {
            for (InterfaceC6089d interfaceC6089d3 : ((n) pVar).f38452k.f38427k) {
                if (interfaceC6089d3 instanceof C6091f) {
                    a((C6091f) interfaceC6089d3, i8, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(j0.e eVar, e.b bVar, int i8, e.b bVar2, int i9) {
        C6087b.a aVar = this.f38415h;
        aVar.f38396a = bVar;
        aVar.f38397b = bVar2;
        aVar.f38398c = i8;
        aVar.f38399d = i9;
        this.f38414g.b(eVar, aVar);
        eVar.l1(this.f38415h.f38400e);
        eVar.M0(this.f38415h.f38401f);
        eVar.L0(this.f38415h.f38403h);
        eVar.B0(this.f38415h.f38402g);
    }

    public void c() {
        d(this.f38412e);
        this.f38416i.clear();
        m.f38444h = 0;
        i(this.f38408a.f37950e, 0, this.f38416i);
        i(this.f38408a.f37952f, 1, this.f38416i);
        this.f38409b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f38411d.f37950e.f();
        this.f38411d.f37952f.f();
        arrayList.add(this.f38411d.f37950e);
        arrayList.add(this.f38411d.f37952f);
        Iterator it = this.f38411d.f38098L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            j0.e eVar = (j0.e) it.next();
            if (eVar instanceof j0.h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.i0()) {
                    if (eVar.f37946c == null) {
                        eVar.f37946c = new C6088c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f37946c);
                } else {
                    arrayList.add(eVar.f37950e);
                }
                if (eVar.k0()) {
                    if (eVar.f37948d == null) {
                        eVar.f37948d = new C6088c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f37948d);
                } else {
                    arrayList.add(eVar.f37952f);
                }
                if (eVar instanceof j0.j) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f38470b != this.f38411d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z7) {
        boolean z8;
        boolean z9 = false;
        if (this.f38409b || this.f38410c) {
            Iterator it = this.f38408a.f38098L0.iterator();
            while (it.hasNext()) {
                j0.e eVar = (j0.e) it.next();
                eVar.n();
                eVar.f37942a = false;
                eVar.f37950e.r();
                eVar.f37952f.q();
            }
            this.f38408a.n();
            j0.f fVar = this.f38408a;
            fVar.f37942a = false;
            fVar.f37950e.r();
            this.f38408a.f37952f.q();
            this.f38410c = false;
        }
        if (b(this.f38411d)) {
            return false;
        }
        this.f38408a.n1(0);
        this.f38408a.o1(0);
        e.b u7 = this.f38408a.u(0);
        e.b u8 = this.f38408a.u(1);
        if (this.f38409b) {
            c();
        }
        int X7 = this.f38408a.X();
        int Y7 = this.f38408a.Y();
        this.f38408a.f37950e.f38476h.d(X7);
        this.f38408a.f37952f.f38476h.d(Y7);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (u7 == bVar || u8 == bVar) {
            if (z7) {
                Iterator it2 = this.f38412e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((p) it2.next()).m()) {
                        z7 = false;
                        break;
                    }
                }
            }
            if (z7 && u7 == e.b.WRAP_CONTENT) {
                this.f38408a.Q0(e.b.FIXED);
                j0.f fVar2 = this.f38408a;
                fVar2.l1(e(fVar2, 0));
                j0.f fVar3 = this.f38408a;
                fVar3.f37950e.f38473e.d(fVar3.W());
            }
            if (z7 && u8 == e.b.WRAP_CONTENT) {
                this.f38408a.h1(e.b.FIXED);
                j0.f fVar4 = this.f38408a;
                fVar4.M0(e(fVar4, 1));
                j0.f fVar5 = this.f38408a;
                fVar5.f37952f.f38473e.d(fVar5.x());
            }
        }
        j0.f fVar6 = this.f38408a;
        e.b bVar2 = fVar6.f37941Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int W7 = fVar6.W() + X7;
            this.f38408a.f37950e.f38477i.d(W7);
            this.f38408a.f37950e.f38473e.d(W7 - X7);
            m();
            j0.f fVar7 = this.f38408a;
            e.b bVar4 = fVar7.f37941Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int x7 = fVar7.x() + Y7;
                this.f38408a.f37952f.f38477i.d(x7);
                this.f38408a.f37952f.f38473e.d(x7 - Y7);
            }
            m();
            z8 = true;
        } else {
            z8 = false;
        }
        Iterator it3 = this.f38412e.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f38470b != this.f38408a || pVar.f38475g) {
                pVar.e();
            }
        }
        Iterator it4 = this.f38412e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z9 = true;
                break;
            }
            p pVar2 = (p) it4.next();
            if (z8 || pVar2.f38470b != this.f38408a) {
                if (!pVar2.f38476h.f38426j || ((!pVar2.f38477i.f38426j && !(pVar2 instanceof j)) || (!pVar2.f38473e.f38426j && !(pVar2 instanceof C6088c) && !(pVar2 instanceof j)))) {
                    break;
                }
            }
        }
        this.f38408a.Q0(u7);
        this.f38408a.h1(u8);
        return z9;
    }

    public boolean g(boolean z7) {
        if (this.f38409b) {
            Iterator it = this.f38408a.f38098L0.iterator();
            while (it.hasNext()) {
                j0.e eVar = (j0.e) it.next();
                eVar.n();
                eVar.f37942a = false;
                l lVar = eVar.f37950e;
                lVar.f38473e.f38426j = false;
                lVar.f38475g = false;
                lVar.r();
                n nVar = eVar.f37952f;
                nVar.f38473e.f38426j = false;
                nVar.f38475g = false;
                nVar.q();
            }
            this.f38408a.n();
            j0.f fVar = this.f38408a;
            fVar.f37942a = false;
            l lVar2 = fVar.f37950e;
            lVar2.f38473e.f38426j = false;
            lVar2.f38475g = false;
            lVar2.r();
            n nVar2 = this.f38408a.f37952f;
            nVar2.f38473e.f38426j = false;
            nVar2.f38475g = false;
            nVar2.q();
            c();
        }
        if (b(this.f38411d)) {
            return false;
        }
        this.f38408a.n1(0);
        this.f38408a.o1(0);
        this.f38408a.f37950e.f38476h.d(0);
        this.f38408a.f37952f.f38476h.d(0);
        return true;
    }

    public boolean h(boolean z7, int i8) {
        boolean z8;
        e.b bVar;
        boolean z9 = false;
        e.b u7 = this.f38408a.u(0);
        e.b u8 = this.f38408a.u(1);
        int X7 = this.f38408a.X();
        int Y7 = this.f38408a.Y();
        if (z7 && (u7 == (bVar = e.b.WRAP_CONTENT) || u8 == bVar)) {
            Iterator it = this.f38412e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f38474f == i8 && !pVar.m()) {
                    z7 = false;
                    break;
                }
            }
            if (i8 == 0) {
                if (z7 && u7 == e.b.WRAP_CONTENT) {
                    this.f38408a.Q0(e.b.FIXED);
                    j0.f fVar = this.f38408a;
                    fVar.l1(e(fVar, 0));
                    j0.f fVar2 = this.f38408a;
                    fVar2.f37950e.f38473e.d(fVar2.W());
                }
            } else if (z7 && u8 == e.b.WRAP_CONTENT) {
                this.f38408a.h1(e.b.FIXED);
                j0.f fVar3 = this.f38408a;
                fVar3.M0(e(fVar3, 1));
                j0.f fVar4 = this.f38408a;
                fVar4.f37952f.f38473e.d(fVar4.x());
            }
        }
        if (i8 == 0) {
            j0.f fVar5 = this.f38408a;
            e.b bVar2 = fVar5.f37941Z[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int W7 = fVar5.W() + X7;
                this.f38408a.f37950e.f38477i.d(W7);
                this.f38408a.f37950e.f38473e.d(W7 - X7);
                z8 = true;
            }
            z8 = false;
        } else {
            j0.f fVar6 = this.f38408a;
            e.b bVar3 = fVar6.f37941Z[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int x7 = fVar6.x() + Y7;
                this.f38408a.f37952f.f38477i.d(x7);
                this.f38408a.f37952f.f38473e.d(x7 - Y7);
                z8 = true;
            }
            z8 = false;
        }
        m();
        Iterator it2 = this.f38412e.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (pVar2.f38474f == i8 && (pVar2.f38470b != this.f38408a || pVar2.f38475g)) {
                pVar2.e();
            }
        }
        Iterator it3 = this.f38412e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z9 = true;
                break;
            }
            p pVar3 = (p) it3.next();
            if (pVar3.f38474f == i8 && (z8 || pVar3.f38470b != this.f38408a)) {
                if (!pVar3.f38476h.f38426j || !pVar3.f38477i.f38426j || (!(pVar3 instanceof C6088c) && !pVar3.f38473e.f38426j)) {
                    break;
                }
            }
        }
        this.f38408a.Q0(u7);
        this.f38408a.h1(u8);
        return z9;
    }

    public void j() {
        this.f38409b = true;
    }

    public void k() {
        this.f38410c = true;
    }

    public void m() {
        C6092g c6092g;
        Iterator it = this.f38408a.f38098L0.iterator();
        while (it.hasNext()) {
            j0.e eVar = (j0.e) it.next();
            if (!eVar.f37942a) {
                e.b[] bVarArr = eVar.f37941Z;
                boolean z7 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i8 = eVar.f37986w;
                int i9 = eVar.f37988x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z8 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i8 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i9 == 1)) {
                    z7 = true;
                }
                C6092g c6092g2 = eVar.f37950e.f38473e;
                boolean z9 = c6092g2.f38426j;
                C6092g c6092g3 = eVar.f37952f.f38473e;
                boolean z10 = c6092g3.f38426j;
                if (z9 && z10) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar, bVar4, c6092g2.f38423g, bVar4, c6092g3.f38423g);
                    eVar.f37942a = true;
                } else if (z9 && z7) {
                    l(eVar, e.b.FIXED, c6092g2.f38423g, bVar3, c6092g3.f38423g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar.f37952f.f38473e.f38438m = eVar.x();
                    } else {
                        eVar.f37952f.f38473e.d(eVar.x());
                        eVar.f37942a = true;
                    }
                } else if (z10 && z8) {
                    l(eVar, bVar3, c6092g2.f38423g, e.b.FIXED, c6092g3.f38423g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar.f37950e.f38473e.f38438m = eVar.W();
                    } else {
                        eVar.f37950e.f38473e.d(eVar.W());
                        eVar.f37942a = true;
                    }
                }
                if (eVar.f37942a && (c6092g = eVar.f37952f.f38453l) != null) {
                    c6092g.d(eVar.p());
                }
            }
        }
    }

    public void n(C6087b.InterfaceC0283b interfaceC0283b) {
        this.f38414g = interfaceC0283b;
    }
}
