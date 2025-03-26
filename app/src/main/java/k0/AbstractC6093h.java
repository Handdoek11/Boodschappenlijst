package k0;

import j0.C6049a;
import j0.d;
import j0.e;
import java.util.ArrayList;
import java.util.Iterator;
import k0.C6087b;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6093h {

    /* renamed from: a, reason: collision with root package name */
    private static C6087b.a f38439a = new C6087b.a();

    /* renamed from: b, reason: collision with root package name */
    private static int f38440b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f38441c = 0;

    private static boolean a(int i8, j0.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b A7 = eVar.A();
        e.b T7 = eVar.T();
        j0.f fVar = eVar.K() != null ? (j0.f) eVar.K() : null;
        if (fVar != null) {
            fVar.A();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.T();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z7 = A7 == bVar5 || eVar.n0() || A7 == e.b.WRAP_CONTENT || (A7 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f37986w == 0 && eVar.f37949d0 == 0.0f && eVar.a0(0)) || (A7 == bVar2 && eVar.f37986w == 1 && eVar.d0(0, eVar.W()));
        boolean z8 = T7 == bVar5 || eVar.o0() || T7 == e.b.WRAP_CONTENT || (T7 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f37988x == 0 && eVar.f37949d0 == 0.0f && eVar.a0(1)) || (T7 == bVar && eVar.f37988x == 1 && eVar.d0(1, eVar.x()));
        if (eVar.f37949d0 <= 0.0f || !(z7 || z8)) {
            return z7 && z8;
        }
        return true;
    }

    private static void b(int i8, j0.e eVar, C6087b.InterfaceC0283b interfaceC0283b, boolean z7) {
        j0.d dVar;
        j0.d dVar2;
        j0.d dVar3;
        j0.d dVar4;
        if (eVar.g0()) {
            return;
        }
        boolean z8 = true;
        f38440b++;
        if (!(eVar instanceof j0.f) && eVar.m0()) {
            int i9 = i8 + 1;
            if (a(i9, eVar)) {
                j0.f.U1(i9, eVar, interfaceC0283b, new C6087b.a(), C6087b.a.f38393k);
            }
        }
        j0.d o8 = eVar.o(d.a.LEFT);
        j0.d o9 = eVar.o(d.a.RIGHT);
        int e8 = o8.e();
        int e9 = o9.e();
        if (o8.d() != null && o8.n()) {
            Iterator it = o8.d().iterator();
            while (it.hasNext()) {
                j0.d dVar5 = (j0.d) it.next();
                j0.e eVar2 = dVar5.f37889d;
                int i10 = i8 + 1;
                boolean a8 = a(i10, eVar2);
                if (eVar2.m0() && a8) {
                    j0.f.U1(i10, eVar2, interfaceC0283b, new C6087b.a(), C6087b.a.f38393k);
                }
                boolean z9 = ((dVar5 == eVar2.f37930O && (dVar4 = eVar2.f37932Q.f37891f) != null && dVar4.n()) || (dVar5 == eVar2.f37932Q && (dVar3 = eVar2.f37930O.f37891f) != null && dVar3.n())) ? z8 : false;
                e.b A7 = eVar2.A();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (A7 != bVar || a8) {
                    if (!eVar2.m0()) {
                        j0.d dVar6 = eVar2.f37930O;
                        if (dVar5 == dVar6 && eVar2.f37932Q.f37891f == null) {
                            int f8 = dVar6.f() + e8;
                            eVar2.G0(f8, eVar2.W() + f8);
                            b(i10, eVar2, interfaceC0283b, z7);
                        } else {
                            j0.d dVar7 = eVar2.f37932Q;
                            if (dVar5 == dVar7 && dVar6.f37891f == null) {
                                int f9 = e8 - dVar7.f();
                                eVar2.G0(f9 - eVar2.W(), f9);
                                b(i10, eVar2, interfaceC0283b, z7);
                            } else if (z9 && !eVar2.i0()) {
                                d(i10, interfaceC0283b, eVar2, z7);
                            }
                        }
                    }
                } else if (eVar2.A() == bVar && eVar2.f37906A >= 0 && eVar2.f37992z >= 0 && ((eVar2.V() == 8 || (eVar2.f37986w == 0 && eVar2.v() == 0.0f)) && !eVar2.i0() && !eVar2.l0() && z9 && !eVar2.i0())) {
                    e(i10, eVar, interfaceC0283b, eVar2, z7);
                }
                z8 = true;
            }
        }
        if (eVar instanceof j0.h) {
            return;
        }
        if (o9.d() != null && o9.n()) {
            Iterator it2 = o9.d().iterator();
            while (it2.hasNext()) {
                j0.d dVar8 = (j0.d) it2.next();
                j0.e eVar3 = dVar8.f37889d;
                int i11 = i8 + 1;
                boolean a9 = a(i11, eVar3);
                if (eVar3.m0() && a9) {
                    j0.f.U1(i11, eVar3, interfaceC0283b, new C6087b.a(), C6087b.a.f38393k);
                }
                boolean z10 = (dVar8 == eVar3.f37930O && (dVar2 = eVar3.f37932Q.f37891f) != null && dVar2.n()) || (dVar8 == eVar3.f37932Q && (dVar = eVar3.f37930O.f37891f) != null && dVar.n());
                e.b A8 = eVar3.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (A8 != bVar2 || a9) {
                    if (!eVar3.m0()) {
                        j0.d dVar9 = eVar3.f37930O;
                        if (dVar8 == dVar9 && eVar3.f37932Q.f37891f == null) {
                            int f10 = dVar9.f() + e9;
                            eVar3.G0(f10, eVar3.W() + f10);
                            b(i11, eVar3, interfaceC0283b, z7);
                        } else {
                            j0.d dVar10 = eVar3.f37932Q;
                            if (dVar8 == dVar10 && dVar9.f37891f == null) {
                                int f11 = e9 - dVar10.f();
                                eVar3.G0(f11 - eVar3.W(), f11);
                                b(i11, eVar3, interfaceC0283b, z7);
                            } else if (z10 && !eVar3.i0()) {
                                d(i11, interfaceC0283b, eVar3, z7);
                            }
                        }
                    }
                } else if (eVar3.A() == bVar2 && eVar3.f37906A >= 0 && eVar3.f37992z >= 0 && (eVar3.V() == 8 || (eVar3.f37986w == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.l0() && z10 && !eVar3.i0()) {
                        e(i11, eVar, interfaceC0283b, eVar3, z7);
                    }
                }
            }
        }
        eVar.q0();
    }

    private static void c(int i8, C6049a c6049a, C6087b.InterfaceC0283b interfaceC0283b, int i9, boolean z7) {
        if (c6049a.u1()) {
            if (i9 == 0) {
                b(i8 + 1, c6049a, interfaceC0283b, z7);
            } else {
                i(i8 + 1, c6049a, interfaceC0283b);
            }
        }
    }

    private static void d(int i8, C6087b.InterfaceC0283b interfaceC0283b, j0.e eVar, boolean z7) {
        float y7 = eVar.y();
        int e8 = eVar.f37930O.f37891f.e();
        int e9 = eVar.f37932Q.f37891f.e();
        int f8 = eVar.f37930O.f() + e8;
        int f9 = e9 - eVar.f37932Q.f();
        if (e8 == e9) {
            y7 = 0.5f;
        } else {
            e8 = f8;
            e9 = f9;
        }
        int W7 = eVar.W();
        int i9 = (e9 - e8) - W7;
        if (e8 > e9) {
            i9 = (e8 - e9) - W7;
        }
        int i10 = ((int) (i9 > 0 ? (y7 * i9) + 0.5f : y7 * i9)) + e8;
        int i11 = i10 + W7;
        if (e8 > e9) {
            i11 = i10 - W7;
        }
        eVar.G0(i10, i11);
        b(i8 + 1, eVar, interfaceC0283b, z7);
    }

    private static void e(int i8, j0.e eVar, C6087b.InterfaceC0283b interfaceC0283b, j0.e eVar2, boolean z7) {
        float y7 = eVar2.y();
        int e8 = eVar2.f37930O.f37891f.e() + eVar2.f37930O.f();
        int e9 = eVar2.f37932Q.f37891f.e() - eVar2.f37932Q.f();
        if (e9 >= e8) {
            int W7 = eVar2.W();
            if (eVar2.V() != 8) {
                int i9 = eVar2.f37986w;
                if (i9 == 2) {
                    W7 = (int) (eVar2.y() * 0.5f * (eVar instanceof j0.f ? eVar.W() : eVar.K().W()));
                } else if (i9 == 0) {
                    W7 = e9 - e8;
                }
                W7 = Math.max(eVar2.f37992z, W7);
                int i10 = eVar2.f37906A;
                if (i10 > 0) {
                    W7 = Math.min(i10, W7);
                }
            }
            int i11 = e8 + ((int) ((y7 * ((e9 - e8) - W7)) + 0.5f));
            eVar2.G0(i11, W7 + i11);
            b(i8 + 1, eVar2, interfaceC0283b, z7);
        }
    }

    private static void f(int i8, C6087b.InterfaceC0283b interfaceC0283b, j0.e eVar) {
        float R7 = eVar.R();
        int e8 = eVar.f37931P.f37891f.e();
        int e9 = eVar.f37933R.f37891f.e();
        int f8 = eVar.f37931P.f() + e8;
        int f9 = e9 - eVar.f37933R.f();
        if (e8 == e9) {
            R7 = 0.5f;
        } else {
            e8 = f8;
            e9 = f9;
        }
        int x7 = eVar.x();
        int i9 = (e9 - e8) - x7;
        if (e8 > e9) {
            i9 = (e8 - e9) - x7;
        }
        int i10 = (int) (i9 > 0 ? (R7 * i9) + 0.5f : R7 * i9);
        int i11 = e8 + i10;
        int i12 = i11 + x7;
        if (e8 > e9) {
            i11 = e8 - i10;
            i12 = i11 - x7;
        }
        eVar.J0(i11, i12);
        i(i8 + 1, eVar, interfaceC0283b);
    }

    private static void g(int i8, j0.e eVar, C6087b.InterfaceC0283b interfaceC0283b, j0.e eVar2) {
        float R7 = eVar2.R();
        int e8 = eVar2.f37931P.f37891f.e() + eVar2.f37931P.f();
        int e9 = eVar2.f37933R.f37891f.e() - eVar2.f37933R.f();
        if (e9 >= e8) {
            int x7 = eVar2.x();
            if (eVar2.V() != 8) {
                int i9 = eVar2.f37988x;
                if (i9 == 2) {
                    x7 = (int) (R7 * 0.5f * (eVar instanceof j0.f ? eVar.x() : eVar.K().x()));
                } else if (i9 == 0) {
                    x7 = e9 - e8;
                }
                x7 = Math.max(eVar2.f37910C, x7);
                int i10 = eVar2.f37912D;
                if (i10 > 0) {
                    x7 = Math.min(i10, x7);
                }
            }
            int i11 = e8 + ((int) ((R7 * ((e9 - e8) - x7)) + 0.5f));
            eVar2.J0(i11, x7 + i11);
            i(i8 + 1, eVar2, interfaceC0283b);
        }
    }

    public static void h(j0.f fVar, C6087b.InterfaceC0283b interfaceC0283b) {
        e.b A7 = fVar.A();
        e.b T7 = fVar.T();
        f38440b = 0;
        f38441c = 0;
        fVar.v0();
        ArrayList s12 = fVar.s1();
        int size = s12.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((j0.e) s12.get(i8)).v0();
        }
        boolean R12 = fVar.R1();
        if (A7 == e.b.FIXED) {
            fVar.G0(0, fVar.W());
        } else {
            fVar.H0(0);
        }
        boolean z7 = false;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            j0.e eVar = (j0.e) s12.get(i9);
            if (eVar instanceof j0.h) {
                j0.h hVar = (j0.h) eVar;
                if (hVar.t1() == 1) {
                    if (hVar.u1() != -1) {
                        hVar.x1(hVar.u1());
                    } else if (hVar.v1() != -1 && fVar.n0()) {
                        hVar.x1(fVar.W() - hVar.v1());
                    } else if (fVar.n0()) {
                        hVar.x1((int) ((hVar.w1() * fVar.W()) + 0.5f));
                    }
                    z7 = true;
                }
            } else if ((eVar instanceof C6049a) && ((C6049a) eVar).y1() == 0) {
                z8 = true;
            }
        }
        if (z7) {
            for (int i10 = 0; i10 < size; i10++) {
                j0.e eVar2 = (j0.e) s12.get(i10);
                if (eVar2 instanceof j0.h) {
                    j0.h hVar2 = (j0.h) eVar2;
                    if (hVar2.t1() == 1) {
                        b(0, hVar2, interfaceC0283b, R12);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0283b, R12);
        if (z8) {
            for (int i11 = 0; i11 < size; i11++) {
                j0.e eVar3 = (j0.e) s12.get(i11);
                if (eVar3 instanceof C6049a) {
                    C6049a c6049a = (C6049a) eVar3;
                    if (c6049a.y1() == 0) {
                        c(0, c6049a, interfaceC0283b, 0, R12);
                    }
                }
            }
        }
        if (T7 == e.b.FIXED) {
            fVar.J0(0, fVar.x());
        } else {
            fVar.I0(0);
        }
        boolean z9 = false;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            j0.e eVar4 = (j0.e) s12.get(i12);
            if (eVar4 instanceof j0.h) {
                j0.h hVar3 = (j0.h) eVar4;
                if (hVar3.t1() == 0) {
                    if (hVar3.u1() != -1) {
                        hVar3.x1(hVar3.u1());
                    } else if (hVar3.v1() != -1 && fVar.o0()) {
                        hVar3.x1(fVar.x() - hVar3.v1());
                    } else if (fVar.o0()) {
                        hVar3.x1((int) ((hVar3.w1() * fVar.x()) + 0.5f));
                    }
                    z9 = true;
                }
            } else if ((eVar4 instanceof C6049a) && ((C6049a) eVar4).y1() == 1) {
                z10 = true;
            }
        }
        if (z9) {
            for (int i13 = 0; i13 < size; i13++) {
                j0.e eVar5 = (j0.e) s12.get(i13);
                if (eVar5 instanceof j0.h) {
                    j0.h hVar4 = (j0.h) eVar5;
                    if (hVar4.t1() == 0) {
                        i(1, hVar4, interfaceC0283b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0283b);
        if (z10) {
            for (int i14 = 0; i14 < size; i14++) {
                j0.e eVar6 = (j0.e) s12.get(i14);
                if (eVar6 instanceof C6049a) {
                    C6049a c6049a2 = (C6049a) eVar6;
                    if (c6049a2.y1() == 1) {
                        c(0, c6049a2, interfaceC0283b, 1, R12);
                    }
                }
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            j0.e eVar7 = (j0.e) s12.get(i15);
            if (eVar7.m0() && a(0, eVar7)) {
                j0.f.U1(0, eVar7, interfaceC0283b, f38439a, C6087b.a.f38393k);
                if (!(eVar7 instanceof j0.h)) {
                    b(0, eVar7, interfaceC0283b, R12);
                    i(0, eVar7, interfaceC0283b);
                } else if (((j0.h) eVar7).t1() == 0) {
                    i(0, eVar7, interfaceC0283b);
                } else {
                    b(0, eVar7, interfaceC0283b, R12);
                }
            }
        }
    }

    private static void i(int i8, j0.e eVar, C6087b.InterfaceC0283b interfaceC0283b) {
        j0.d dVar;
        j0.d dVar2;
        j0.d dVar3;
        j0.d dVar4;
        if (eVar.p0()) {
            return;
        }
        f38441c++;
        if (!(eVar instanceof j0.f) && eVar.m0()) {
            int i9 = i8 + 1;
            if (a(i9, eVar)) {
                j0.f.U1(i9, eVar, interfaceC0283b, new C6087b.a(), C6087b.a.f38393k);
            }
        }
        j0.d o8 = eVar.o(d.a.TOP);
        j0.d o9 = eVar.o(d.a.BOTTOM);
        int e8 = o8.e();
        int e9 = o9.e();
        if (o8.d() != null && o8.n()) {
            Iterator it = o8.d().iterator();
            while (it.hasNext()) {
                j0.d dVar5 = (j0.d) it.next();
                j0.e eVar2 = dVar5.f37889d;
                int i10 = i8 + 1;
                boolean a8 = a(i10, eVar2);
                if (eVar2.m0() && a8) {
                    j0.f.U1(i10, eVar2, interfaceC0283b, new C6087b.a(), C6087b.a.f38393k);
                }
                boolean z7 = (dVar5 == eVar2.f37931P && (dVar4 = eVar2.f37933R.f37891f) != null && dVar4.n()) || (dVar5 == eVar2.f37933R && (dVar3 = eVar2.f37931P.f37891f) != null && dVar3.n());
                e.b T7 = eVar2.T();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (T7 != bVar || a8) {
                    if (!eVar2.m0()) {
                        j0.d dVar6 = eVar2.f37931P;
                        if (dVar5 == dVar6 && eVar2.f37933R.f37891f == null) {
                            int f8 = dVar6.f() + e8;
                            eVar2.J0(f8, eVar2.x() + f8);
                            i(i10, eVar2, interfaceC0283b);
                        } else {
                            j0.d dVar7 = eVar2.f37933R;
                            if (dVar5 == dVar7 && dVar6.f37891f == null) {
                                int f9 = e8 - dVar7.f();
                                eVar2.J0(f9 - eVar2.x(), f9);
                                i(i10, eVar2, interfaceC0283b);
                            } else if (z7 && !eVar2.k0()) {
                                f(i10, interfaceC0283b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.T() == bVar && eVar2.f37912D >= 0 && eVar2.f37910C >= 0 && (eVar2.V() == 8 || (eVar2.f37988x == 0 && eVar2.v() == 0.0f))) {
                    if (!eVar2.k0() && !eVar2.l0() && z7 && !eVar2.k0()) {
                        g(i10, eVar, interfaceC0283b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof j0.h) {
            return;
        }
        if (o9.d() != null && o9.n()) {
            Iterator it2 = o9.d().iterator();
            while (it2.hasNext()) {
                j0.d dVar8 = (j0.d) it2.next();
                j0.e eVar3 = dVar8.f37889d;
                int i11 = i8 + 1;
                boolean a9 = a(i11, eVar3);
                if (eVar3.m0() && a9) {
                    j0.f.U1(i11, eVar3, interfaceC0283b, new C6087b.a(), C6087b.a.f38393k);
                }
                boolean z8 = (dVar8 == eVar3.f37931P && (dVar2 = eVar3.f37933R.f37891f) != null && dVar2.n()) || (dVar8 == eVar3.f37933R && (dVar = eVar3.f37931P.f37891f) != null && dVar.n());
                e.b T8 = eVar3.T();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (T8 != bVar2 || a9) {
                    if (!eVar3.m0()) {
                        j0.d dVar9 = eVar3.f37931P;
                        if (dVar8 == dVar9 && eVar3.f37933R.f37891f == null) {
                            int f10 = dVar9.f() + e9;
                            eVar3.J0(f10, eVar3.x() + f10);
                            i(i11, eVar3, interfaceC0283b);
                        } else {
                            j0.d dVar10 = eVar3.f37933R;
                            if (dVar8 == dVar10 && dVar9.f37891f == null) {
                                int f11 = e9 - dVar10.f();
                                eVar3.J0(f11 - eVar3.x(), f11);
                                i(i11, eVar3, interfaceC0283b);
                            } else if (z8 && !eVar3.k0()) {
                                f(i11, interfaceC0283b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.T() == bVar2 && eVar3.f37912D >= 0 && eVar3.f37910C >= 0 && (eVar3.V() == 8 || (eVar3.f37988x == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.k0() && !eVar3.l0() && z8 && !eVar3.k0()) {
                        g(i11, eVar, interfaceC0283b, eVar3);
                    }
                }
            }
        }
        j0.d o10 = eVar.o(d.a.BASELINE);
        if (o10.d() != null && o10.n()) {
            int e10 = o10.e();
            Iterator it3 = o10.d().iterator();
            while (it3.hasNext()) {
                j0.d dVar11 = (j0.d) it3.next();
                j0.e eVar4 = dVar11.f37889d;
                int i12 = i8 + 1;
                boolean a10 = a(i12, eVar4);
                if (eVar4.m0() && a10) {
                    j0.f.U1(i12, eVar4, interfaceC0283b, new C6087b.a(), C6087b.a.f38393k);
                }
                if (eVar4.T() != e.b.MATCH_CONSTRAINT || a10) {
                    if (!eVar4.m0() && dVar11 == eVar4.f37934S) {
                        eVar4.F0(dVar11.f() + e10);
                        i(i12, eVar4, interfaceC0283b);
                    }
                }
            }
        }
        eVar.r0();
    }
}
