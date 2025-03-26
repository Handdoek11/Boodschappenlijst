package j0;

import j0.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: x1, reason: collision with root package name */
    private e[] f38053x1;

    /* renamed from: a1, reason: collision with root package name */
    private int f38030a1 = -1;

    /* renamed from: b1, reason: collision with root package name */
    private int f38031b1 = -1;

    /* renamed from: c1, reason: collision with root package name */
    private int f38032c1 = -1;

    /* renamed from: d1, reason: collision with root package name */
    private int f38033d1 = -1;

    /* renamed from: e1, reason: collision with root package name */
    private int f38034e1 = -1;

    /* renamed from: f1, reason: collision with root package name */
    private int f38035f1 = -1;

    /* renamed from: g1, reason: collision with root package name */
    private float f38036g1 = 0.5f;

    /* renamed from: h1, reason: collision with root package name */
    private float f38037h1 = 0.5f;

    /* renamed from: i1, reason: collision with root package name */
    private float f38038i1 = 0.5f;

    /* renamed from: j1, reason: collision with root package name */
    private float f38039j1 = 0.5f;

    /* renamed from: k1, reason: collision with root package name */
    private float f38040k1 = 0.5f;

    /* renamed from: l1, reason: collision with root package name */
    private float f38041l1 = 0.5f;

    /* renamed from: m1, reason: collision with root package name */
    private int f38042m1 = 0;

    /* renamed from: n1, reason: collision with root package name */
    private int f38043n1 = 0;

    /* renamed from: o1, reason: collision with root package name */
    private int f38044o1 = 2;

    /* renamed from: p1, reason: collision with root package name */
    private int f38045p1 = 2;

    /* renamed from: q1, reason: collision with root package name */
    private int f38046q1 = 0;

    /* renamed from: r1, reason: collision with root package name */
    private int f38047r1 = -1;

    /* renamed from: s1, reason: collision with root package name */
    private int f38048s1 = 0;

    /* renamed from: t1, reason: collision with root package name */
    private ArrayList f38049t1 = new ArrayList();

    /* renamed from: u1, reason: collision with root package name */
    private e[] f38050u1 = null;

    /* renamed from: v1, reason: collision with root package name */
    private e[] f38051v1 = null;

    /* renamed from: w1, reason: collision with root package name */
    private int[] f38052w1 = null;

    /* renamed from: y1, reason: collision with root package name */
    private int f38054y1 = 0;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f38055a;

        /* renamed from: d, reason: collision with root package name */
        private d f38058d;

        /* renamed from: e, reason: collision with root package name */
        private d f38059e;

        /* renamed from: f, reason: collision with root package name */
        private d f38060f;

        /* renamed from: g, reason: collision with root package name */
        private d f38061g;

        /* renamed from: h, reason: collision with root package name */
        private int f38062h;

        /* renamed from: i, reason: collision with root package name */
        private int f38063i;

        /* renamed from: j, reason: collision with root package name */
        private int f38064j;

        /* renamed from: k, reason: collision with root package name */
        private int f38065k;

        /* renamed from: q, reason: collision with root package name */
        private int f38071q;

        /* renamed from: b, reason: collision with root package name */
        private e f38056b = null;

        /* renamed from: c, reason: collision with root package name */
        int f38057c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f38066l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f38067m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f38068n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f38069o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f38070p = 0;

        a(int i8, d dVar, d dVar2, d dVar3, d dVar4, int i9) {
            this.f38062h = 0;
            this.f38063i = 0;
            this.f38064j = 0;
            this.f38065k = 0;
            this.f38071q = 0;
            this.f38055a = i8;
            this.f38058d = dVar;
            this.f38059e = dVar2;
            this.f38060f = dVar3;
            this.f38061g = dVar4;
            this.f38062h = g.this.A1();
            this.f38063i = g.this.C1();
            this.f38064j = g.this.B1();
            this.f38065k = g.this.z1();
            this.f38071q = i9;
        }

        private void h() {
            this.f38066l = 0;
            this.f38067m = 0;
            this.f38056b = null;
            this.f38057c = 0;
            int i8 = this.f38069o;
            for (int i9 = 0; i9 < i8 && this.f38068n + i9 < g.this.f38054y1; i9++) {
                e eVar = g.this.f38053x1[this.f38068n + i9];
                if (this.f38055a == 0) {
                    int W7 = eVar.W();
                    int i10 = g.this.f38042m1;
                    if (eVar.V() == 8) {
                        i10 = 0;
                    }
                    this.f38066l += W7 + i10;
                    int l22 = g.this.l2(eVar, this.f38071q);
                    if (this.f38056b == null || this.f38057c < l22) {
                        this.f38056b = eVar;
                        this.f38057c = l22;
                        this.f38067m = l22;
                    }
                } else {
                    int m22 = g.this.m2(eVar, this.f38071q);
                    int l23 = g.this.l2(eVar, this.f38071q);
                    int i11 = g.this.f38043n1;
                    if (eVar.V() == 8) {
                        i11 = 0;
                    }
                    this.f38067m += l23 + i11;
                    if (this.f38056b == null || this.f38057c < m22) {
                        this.f38056b = eVar;
                        this.f38057c = m22;
                        this.f38066l = m22;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f38055a == 0) {
                int m22 = g.this.m2(eVar, this.f38071q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f38070p++;
                    m22 = 0;
                }
                this.f38066l += m22 + (eVar.V() != 8 ? g.this.f38042m1 : 0);
                int l22 = g.this.l2(eVar, this.f38071q);
                if (this.f38056b == null || this.f38057c < l22) {
                    this.f38056b = eVar;
                    this.f38057c = l22;
                    this.f38067m = l22;
                }
            } else {
                int m23 = g.this.m2(eVar, this.f38071q);
                int l23 = g.this.l2(eVar, this.f38071q);
                if (eVar.T() == e.b.MATCH_CONSTRAINT) {
                    this.f38070p++;
                    l23 = 0;
                }
                this.f38067m += l23 + (eVar.V() != 8 ? g.this.f38043n1 : 0);
                if (this.f38056b == null || this.f38057c < m23) {
                    this.f38056b = eVar;
                    this.f38057c = m23;
                    this.f38066l = m23;
                }
            }
            this.f38069o++;
        }

        public void c() {
            this.f38057c = 0;
            this.f38056b = null;
            this.f38066l = 0;
            this.f38067m = 0;
            this.f38068n = 0;
            this.f38069o = 0;
            this.f38070p = 0;
        }

        public void d(boolean z7, int i8, boolean z8) {
            e eVar;
            char c8;
            float f8;
            float f9;
            int i9 = this.f38069o;
            for (int i10 = 0; i10 < i9 && this.f38068n + i10 < g.this.f38054y1; i10++) {
                e eVar2 = g.this.f38053x1[this.f38068n + i10];
                if (eVar2 != null) {
                    eVar2.u0();
                }
            }
            if (i9 == 0 || this.f38056b == null) {
                return;
            }
            boolean z9 = z8 && i8 == 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = z7 ? (i9 - 1) - i13 : i13;
                if (this.f38068n + i14 >= g.this.f38054y1) {
                    break;
                }
                e eVar3 = g.this.f38053x1[this.f38068n + i14];
                if (eVar3 != null && eVar3.V() == 0) {
                    if (i11 == -1) {
                        i11 = i13;
                    }
                    i12 = i13;
                }
            }
            e eVar4 = null;
            if (this.f38055a != 0) {
                e eVar5 = this.f38056b;
                eVar5.O0(g.this.f38030a1);
                int i15 = this.f38062h;
                if (i8 > 0) {
                    i15 += g.this.f38042m1;
                }
                if (z7) {
                    eVar5.f37932Q.a(this.f38060f, i15);
                    if (z8) {
                        eVar5.f37930O.a(this.f38058d, this.f38064j);
                    }
                    if (i8 > 0) {
                        this.f38060f.f37889d.f37930O.a(eVar5.f37932Q, 0);
                    }
                } else {
                    eVar5.f37930O.a(this.f38058d, i15);
                    if (z8) {
                        eVar5.f37932Q.a(this.f38060f, this.f38064j);
                    }
                    if (i8 > 0) {
                        this.f38058d.f37889d.f37932Q.a(eVar5.f37930O, 0);
                    }
                }
                for (int i16 = 0; i16 < i9 && this.f38068n + i16 < g.this.f38054y1; i16++) {
                    e eVar6 = g.this.f38053x1[this.f38068n + i16];
                    if (eVar6 != null) {
                        if (i16 == 0) {
                            eVar6.k(eVar6.f37931P, this.f38059e, this.f38063i);
                            int i17 = g.this.f38031b1;
                            float f10 = g.this.f38037h1;
                            if (this.f38068n == 0 && g.this.f38033d1 != -1) {
                                i17 = g.this.f38033d1;
                                f10 = g.this.f38039j1;
                            } else if (z8 && g.this.f38035f1 != -1) {
                                i17 = g.this.f38035f1;
                                f10 = g.this.f38041l1;
                            }
                            eVar6.f1(i17);
                            eVar6.e1(f10);
                        }
                        if (i16 == i9 - 1) {
                            eVar6.k(eVar6.f37933R, this.f38061g, this.f38065k);
                        }
                        if (eVar4 != null) {
                            eVar6.f37931P.a(eVar4.f37933R, g.this.f38043n1);
                            if (i16 == i11) {
                                eVar6.f37931P.u(this.f38063i);
                            }
                            eVar4.f37933R.a(eVar6.f37931P, 0);
                            if (i16 == i12 + 1) {
                                eVar4.f37933R.u(this.f38065k);
                            }
                        }
                        if (eVar6 == eVar5) {
                            eVar4 = eVar6;
                        } else if (z7) {
                            int i18 = g.this.f38044o1;
                            if (i18 == 0) {
                                eVar6.f37932Q.a(eVar5.f37932Q, 0);
                            } else if (i18 == 1) {
                                eVar6.f37930O.a(eVar5.f37930O, 0);
                            } else if (i18 == 2) {
                                eVar6.f37930O.a(eVar5.f37930O, 0);
                                eVar6.f37932Q.a(eVar5.f37932Q, 0);
                            }
                            eVar4 = eVar6;
                        } else {
                            int i19 = g.this.f38044o1;
                            if (i19 == 0) {
                                eVar6.f37930O.a(eVar5.f37930O, 0);
                            } else if (i19 == 1) {
                                eVar6.f37932Q.a(eVar5.f37932Q, 0);
                            } else if (i19 == 2) {
                                if (z9) {
                                    eVar6.f37930O.a(this.f38058d, this.f38062h);
                                    eVar6.f37932Q.a(this.f38060f, this.f38064j);
                                } else {
                                    eVar6.f37930O.a(eVar5.f37930O, 0);
                                    eVar6.f37932Q.a(eVar5.f37932Q, 0);
                                }
                            }
                            eVar4 = eVar6;
                        }
                    }
                }
                return;
            }
            e eVar7 = this.f38056b;
            eVar7.f1(g.this.f38031b1);
            int i20 = this.f38063i;
            if (i8 > 0) {
                i20 += g.this.f38043n1;
            }
            eVar7.f37931P.a(this.f38059e, i20);
            if (z8) {
                eVar7.f37933R.a(this.f38061g, this.f38065k);
            }
            if (i8 > 0) {
                this.f38059e.f37889d.f37933R.a(eVar7.f37931P, 0);
            }
            char c9 = 3;
            if (g.this.f38045p1 != 3 || eVar7.Z()) {
                eVar = eVar7;
            } else {
                for (int i21 = 0; i21 < i9; i21++) {
                    int i22 = z7 ? (i9 - 1) - i21 : i21;
                    if (this.f38068n + i22 >= g.this.f38054y1) {
                        break;
                    }
                    eVar = g.this.f38053x1[this.f38068n + i22];
                    if (eVar.Z()) {
                        break;
                    }
                }
                eVar = eVar7;
            }
            int i23 = 0;
            while (i23 < i9) {
                int i24 = z7 ? (i9 - 1) - i23 : i23;
                if (this.f38068n + i24 >= g.this.f38054y1) {
                    return;
                }
                e eVar8 = g.this.f38053x1[this.f38068n + i24];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c8 = c9;
                } else {
                    if (i23 == 0) {
                        eVar8.k(eVar8.f37930O, this.f38058d, this.f38062h);
                    }
                    if (i24 == 0) {
                        int i25 = g.this.f38030a1;
                        float f11 = g.this.f38036g1;
                        if (z7) {
                            f11 = 1.0f - f11;
                        }
                        if (this.f38068n != 0 || g.this.f38032c1 == -1) {
                            if (z8 && g.this.f38034e1 != -1) {
                                i25 = g.this.f38034e1;
                                if (z7) {
                                    f9 = g.this.f38040k1;
                                    f8 = 1.0f - f9;
                                    f11 = f8;
                                } else {
                                    f8 = g.this.f38040k1;
                                    f11 = f8;
                                }
                            }
                            eVar8.O0(i25);
                            eVar8.N0(f11);
                        } else {
                            i25 = g.this.f38032c1;
                            if (z7) {
                                f9 = g.this.f38038i1;
                                f8 = 1.0f - f9;
                                f11 = f8;
                                eVar8.O0(i25);
                                eVar8.N0(f11);
                            } else {
                                f8 = g.this.f38038i1;
                                f11 = f8;
                                eVar8.O0(i25);
                                eVar8.N0(f11);
                            }
                        }
                    }
                    if (i23 == i9 - 1) {
                        eVar8.k(eVar8.f37932Q, this.f38060f, this.f38064j);
                    }
                    if (eVar4 != null) {
                        eVar8.f37930O.a(eVar4.f37932Q, g.this.f38042m1);
                        if (i23 == i11) {
                            eVar8.f37930O.u(this.f38062h);
                        }
                        eVar4.f37932Q.a(eVar8.f37930O, 0);
                        if (i23 == i12 + 1) {
                            eVar4.f37932Q.u(this.f38064j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c8 = 3;
                        if (g.this.f38045p1 == 3 && eVar.Z() && eVar8 != eVar && eVar8.Z()) {
                            eVar8.f37934S.a(eVar.f37934S, 0);
                        } else {
                            int i26 = g.this.f38045p1;
                            if (i26 == 0) {
                                eVar8.f37931P.a(eVar7.f37931P, 0);
                            } else if (i26 == 1) {
                                eVar8.f37933R.a(eVar7.f37933R, 0);
                            } else if (z9) {
                                eVar8.f37931P.a(this.f38059e, this.f38063i);
                                eVar8.f37933R.a(this.f38061g, this.f38065k);
                            } else {
                                eVar8.f37931P.a(eVar7.f37931P, 0);
                                eVar8.f37933R.a(eVar7.f37933R, 0);
                            }
                        }
                    } else {
                        c8 = 3;
                    }
                }
                i23++;
                c9 = c8;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f38055a == 1 ? this.f38067m - g.this.f38043n1 : this.f38067m;
        }

        public int f() {
            return this.f38055a == 0 ? this.f38066l - g.this.f38042m1 : this.f38066l;
        }

        public void g(int i8) {
            int i9 = this.f38070p;
            if (i9 == 0) {
                return;
            }
            int i10 = this.f38069o;
            int i11 = i8 / i9;
            for (int i12 = 0; i12 < i10 && this.f38068n + i12 < g.this.f38054y1; i12++) {
                e eVar = g.this.f38053x1[this.f38068n + i12];
                if (this.f38055a == 0) {
                    if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f37986w == 0) {
                        g.this.E1(eVar, e.b.FIXED, i11, eVar.T(), eVar.x());
                    }
                } else if (eVar != null && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f37988x == 0) {
                    g.this.E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i11);
                }
            }
            h();
        }

        public void i(int i8) {
            this.f38068n = i8;
        }

        public void j(int i8, d dVar, d dVar2, d dVar3, d dVar4, int i9, int i10, int i11, int i12, int i13) {
            this.f38055a = i8;
            this.f38058d = dVar;
            this.f38059e = dVar2;
            this.f38060f = dVar3;
            this.f38061g = dVar4;
            this.f38062h = i9;
            this.f38063i = i10;
            this.f38064j = i11;
            this.f38065k = i12;
            this.f38071q = i13;
        }
    }

    private void k2(boolean z7) {
        e eVar;
        float f8;
        int i8;
        if (this.f38052w1 == null || this.f38051v1 == null || this.f38050u1 == null) {
            return;
        }
        for (int i9 = 0; i9 < this.f38054y1; i9++) {
            this.f38053x1[i9].u0();
        }
        int[] iArr = this.f38052w1;
        int i10 = iArr[0];
        int i11 = iArr[1];
        float f9 = this.f38036g1;
        e eVar2 = null;
        int i12 = 0;
        while (i12 < i10) {
            if (z7) {
                i8 = (i10 - i12) - 1;
                f8 = 1.0f - this.f38036g1;
            } else {
                f8 = f9;
                i8 = i12;
            }
            e eVar3 = this.f38051v1[i8];
            if (eVar3 != null && eVar3.V() != 8) {
                if (i12 == 0) {
                    eVar3.k(eVar3.f37930O, this.f37930O, A1());
                    eVar3.O0(this.f38030a1);
                    eVar3.N0(f8);
                }
                if (i12 == i10 - 1) {
                    eVar3.k(eVar3.f37932Q, this.f37932Q, B1());
                }
                if (i12 > 0 && eVar2 != null) {
                    eVar3.k(eVar3.f37930O, eVar2.f37932Q, this.f38042m1);
                    eVar2.k(eVar2.f37932Q, eVar3.f37930O, 0);
                }
                eVar2 = eVar3;
            }
            i12++;
            f9 = f8;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            e eVar4 = this.f38050u1[i13];
            if (eVar4 != null && eVar4.V() != 8) {
                if (i13 == 0) {
                    eVar4.k(eVar4.f37931P, this.f37931P, C1());
                    eVar4.f1(this.f38031b1);
                    eVar4.e1(this.f38037h1);
                }
                if (i13 == i11 - 1) {
                    eVar4.k(eVar4.f37933R, this.f37933R, z1());
                }
                if (i13 > 0 && eVar2 != null) {
                    eVar4.k(eVar4.f37931P, eVar2.f37933R, this.f38043n1);
                    eVar2.k(eVar2.f37933R, eVar4.f37931P, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = (i15 * i10) + i14;
                if (this.f38048s1 == 1) {
                    i16 = (i14 * i11) + i15;
                }
                e[] eVarArr = this.f38053x1;
                if (i16 < eVarArr.length && (eVar = eVarArr[i16]) != null && eVar.V() != 8) {
                    e eVar5 = this.f38051v1[i14];
                    e eVar6 = this.f38050u1[i15];
                    if (eVar != eVar5) {
                        eVar.k(eVar.f37930O, eVar5.f37930O, 0);
                        eVar.k(eVar.f37932Q, eVar5.f37932Q, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.k(eVar.f37931P, eVar6.f37931P, 0);
                        eVar.k(eVar.f37933R, eVar6.f37933R, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l2(e eVar, int i8) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.T() == e.b.MATCH_CONSTRAINT) {
            int i9 = eVar.f37988x;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (eVar.f37914E * i8);
                if (i10 != eVar.x()) {
                    eVar.Z0(true);
                    E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i10);
                }
                return i10;
            }
            if (i9 == 1) {
                return eVar.x();
            }
            if (i9 == 3) {
                return (int) ((eVar.W() * eVar.f37949d0) + 0.5f);
            }
        }
        return eVar.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m2(e eVar, int i8) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i9 = eVar.f37986w;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (eVar.f37908B * i8);
                if (i10 != eVar.W()) {
                    eVar.Z0(true);
                    E1(eVar, e.b.FIXED, i10, eVar.T(), eVar.x());
                }
                return i10;
            }
            if (i9 == 1) {
                return eVar.W();
            }
            if (i9 == 3) {
                return (int) ((eVar.x() * eVar.f37949d0) + 0.5f);
            }
        }
        return eVar.W();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n2(j0.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.g.n2(j0.e[], int, int, int, int[]):void");
    }

    private void o2(e[] eVarArr, int i8, int i9, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13;
        d dVar;
        int B12;
        d dVar2;
        int z12;
        int i14;
        if (i8 == 0) {
            return;
        }
        this.f38049t1.clear();
        a aVar = new a(i9, this.f37930O, this.f37931P, this.f37932Q, this.f37933R, i10);
        this.f38049t1.add(aVar);
        if (i9 == 0) {
            i11 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < i8) {
                e eVar = eVarArr[i16];
                int m22 = m2(eVar, i10);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i17 = i11;
                boolean z7 = (i15 == i10 || (this.f38042m1 + i15) + m22 > i10) && aVar.f38056b != null;
                if (!z7 && i16 > 0 && (i14 = this.f38047r1) > 0 && i16 % i14 == 0) {
                    z7 = true;
                }
                if (z7) {
                    aVar = new a(i9, this.f37930O, this.f37931P, this.f37932Q, this.f37933R, i10);
                    aVar.i(i16);
                    this.f38049t1.add(aVar);
                } else {
                    if (i16 > 0) {
                        i15 += this.f38042m1 + m22;
                    }
                    aVar.b(eVar);
                    i16++;
                    i11 = i17;
                }
                i15 = m22;
                aVar.b(eVar);
                i16++;
                i11 = i17;
            }
        } else {
            i11 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i8) {
                e eVar2 = eVarArr[i19];
                int l22 = l2(eVar2, i10);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i20 = i11;
                boolean z8 = (i18 == i10 || (this.f38043n1 + i18) + l22 > i10) && aVar.f38056b != null;
                if (!z8 && i19 > 0 && (i12 = this.f38047r1) > 0 && i19 % i12 == 0) {
                    z8 = true;
                }
                if (z8) {
                    aVar = new a(i9, this.f37930O, this.f37931P, this.f37932Q, this.f37933R, i10);
                    aVar.i(i19);
                    this.f38049t1.add(aVar);
                } else {
                    if (i19 > 0) {
                        i18 += this.f38043n1 + l22;
                    }
                    aVar.b(eVar2);
                    i19++;
                    i11 = i20;
                }
                i18 = l22;
                aVar.b(eVar2);
                i19++;
                i11 = i20;
            }
        }
        int size = this.f38049t1.size();
        d dVar3 = this.f37930O;
        d dVar4 = this.f37931P;
        d dVar5 = this.f37932Q;
        d dVar6 = this.f37933R;
        int A12 = A1();
        int C12 = C1();
        int B13 = B1();
        int z13 = z1();
        e.b A7 = A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z9 = A7 == bVar || T() == bVar;
        if (i11 > 0 && z9) {
            for (int i21 = 0; i21 < size; i21++) {
                a aVar2 = (a) this.f38049t1.get(i21);
                if (i9 == 0) {
                    aVar2.g(i10 - aVar2.f());
                } else {
                    aVar2.g(i10 - aVar2.e());
                }
            }
        }
        int i22 = C12;
        int i23 = B13;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = A12;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i28 = z13;
        while (i26 < size) {
            a aVar3 = (a) this.f38049t1.get(i26);
            if (i9 == 0) {
                if (i26 < size - 1) {
                    dVar2 = ((a) this.f38049t1.get(i26 + 1)).f38056b.f37931P;
                    z12 = 0;
                } else {
                    dVar2 = this.f37933R;
                    z12 = z1();
                }
                d dVar9 = aVar3.f38056b.f37933R;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i29 = i24;
                d dVar12 = dVar7;
                int i30 = i25;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i13 = i26;
                aVar3.j(i9, dVar10, dVar12, dVar13, dVar2, i27, i22, i23, z12, i10);
                int max = Math.max(i30, aVar3.f());
                i24 = i29 + aVar3.e();
                if (i13 > 0) {
                    i24 += this.f38043n1;
                }
                dVar8 = dVar11;
                i25 = max;
                i22 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i31 = z12;
                dVar6 = dVar2;
                i28 = i31;
            } else {
                d dVar15 = dVar8;
                int i32 = i24;
                int i33 = i25;
                i13 = i26;
                if (i13 < size - 1) {
                    dVar = ((a) this.f38049t1.get(i13 + 1)).f38056b.f37930O;
                    B12 = 0;
                } else {
                    dVar = this.f37932Q;
                    B12 = B1();
                }
                d dVar16 = aVar3.f38056b.f37932Q;
                aVar3.j(i9, dVar15, dVar7, dVar, dVar6, i27, i22, B12, i28, i10);
                i25 = i33 + aVar3.f();
                int max2 = Math.max(i32, aVar3.e());
                if (i13 > 0) {
                    i25 += this.f38042m1;
                }
                i24 = max2;
                i27 = 0;
                i23 = B12;
                dVar8 = dVar16;
            }
            i26 = i13 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i25;
        iArr[1] = i24;
    }

    private void p2(e[] eVarArr, int i8, int i9, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13;
        d dVar;
        int B12;
        d dVar2;
        int z12;
        int i14;
        if (i8 == 0) {
            return;
        }
        this.f38049t1.clear();
        a aVar = new a(i9, this.f37930O, this.f37931P, this.f37932Q, this.f37933R, i10);
        this.f38049t1.add(aVar);
        if (i9 == 0) {
            int i15 = 0;
            i11 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < i8) {
                i15++;
                e eVar = eVarArr[i17];
                int m22 = m2(eVar, i10);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i18 = i11;
                boolean z7 = (i16 == i10 || (this.f38042m1 + i16) + m22 > i10) && aVar.f38056b != null;
                if (!z7 && i17 > 0 && (i14 = this.f38047r1) > 0 && i15 > i14) {
                    z7 = true;
                }
                if (z7) {
                    aVar = new a(i9, this.f37930O, this.f37931P, this.f37932Q, this.f37933R, i10);
                    aVar.i(i17);
                    this.f38049t1.add(aVar);
                    i16 = m22;
                    i15 = 1;
                } else {
                    i16 = i17 > 0 ? i16 + this.f38042m1 + m22 : m22;
                }
                aVar.b(eVar);
                i17++;
                i11 = i18;
            }
        } else {
            int i19 = 0;
            i11 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i8) {
                i19++;
                e eVar2 = eVarArr[i21];
                int l22 = l2(eVar2, i10);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i22 = i11;
                boolean z8 = (i20 == i10 || (this.f38043n1 + i20) + l22 > i10) && aVar.f38056b != null;
                if (!z8 && i21 > 0 && (i12 = this.f38047r1) > 0 && i19 > i12) {
                    z8 = true;
                }
                if (z8) {
                    aVar = new a(i9, this.f37930O, this.f37931P, this.f37932Q, this.f37933R, i10);
                    aVar.i(i21);
                    this.f38049t1.add(aVar);
                    i20 = l22;
                    i19 = 1;
                } else {
                    i20 = i21 > 0 ? i20 + this.f38043n1 + l22 : l22;
                }
                aVar.b(eVar2);
                i21++;
                i11 = i22;
            }
        }
        int size = this.f38049t1.size();
        d dVar3 = this.f37930O;
        d dVar4 = this.f37931P;
        d dVar5 = this.f37932Q;
        d dVar6 = this.f37933R;
        int A12 = A1();
        int C12 = C1();
        int B13 = B1();
        int z13 = z1();
        e.b A7 = A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z9 = A7 == bVar || T() == bVar;
        if (i11 > 0 && z9) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) this.f38049t1.get(i23);
                if (i9 == 0) {
                    aVar2.g(i10 - aVar2.f());
                } else {
                    aVar2.g(i10 - aVar2.e());
                }
            }
        }
        int i24 = C12;
        int i25 = B13;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = A12;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i30 = z13;
        while (i28 < size) {
            a aVar3 = (a) this.f38049t1.get(i28);
            if (i9 == 0) {
                if (i28 < size - 1) {
                    dVar2 = ((a) this.f38049t1.get(i28 + 1)).f38056b.f37931P;
                    z12 = 0;
                } else {
                    dVar2 = this.f37933R;
                    z12 = z1();
                }
                d dVar9 = aVar3.f38056b.f37933R;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i31 = i26;
                d dVar12 = dVar7;
                int i32 = i27;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i13 = i28;
                aVar3.j(i9, dVar10, dVar12, dVar13, dVar2, i29, i24, i25, z12, i10);
                int max = Math.max(i32, aVar3.f());
                i26 = i31 + aVar3.e();
                if (i13 > 0) {
                    i26 += this.f38043n1;
                }
                dVar8 = dVar11;
                i27 = max;
                i24 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i33 = z12;
                dVar6 = dVar2;
                i30 = i33;
            } else {
                d dVar15 = dVar8;
                int i34 = i26;
                int i35 = i27;
                i13 = i28;
                if (i13 < size - 1) {
                    dVar = ((a) this.f38049t1.get(i13 + 1)).f38056b.f37930O;
                    B12 = 0;
                } else {
                    dVar = this.f37932Q;
                    B12 = B1();
                }
                d dVar16 = aVar3.f38056b.f37932Q;
                aVar3.j(i9, dVar15, dVar7, dVar, dVar6, i29, i24, B12, i30, i10);
                i27 = i35 + aVar3.f();
                int max2 = Math.max(i34, aVar3.e());
                if (i13 > 0) {
                    i27 += this.f38042m1;
                }
                i26 = max2;
                i29 = 0;
                i25 = B12;
                dVar8 = dVar16;
            }
            i28 = i13 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i27;
        iArr[1] = i26;
    }

    private void q2(e[] eVarArr, int i8, int i9, int i10, int[] iArr) {
        a aVar;
        if (i8 == 0) {
            return;
        }
        if (this.f38049t1.size() == 0) {
            aVar = new a(i9, this.f37930O, this.f37931P, this.f37932Q, this.f37933R, i10);
            this.f38049t1.add(aVar);
        } else {
            a aVar2 = (a) this.f38049t1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i9, this.f37930O, this.f37931P, this.f37932Q, this.f37933R, A1(), C1(), B1(), z1(), i10);
        }
        for (int i11 = 0; i11 < i8; i11++) {
            aVar.b(eVarArr[i11]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(int i8) {
        this.f38034e1 = i8;
    }

    public void B2(float f8) {
        this.f38041l1 = f8;
    }

    public void C2(int i8) {
        this.f38035f1 = i8;
    }

    @Override // j0.l
    public void D1(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int[] iArr;
        boolean z7;
        if (this.f38083M0 > 0 && !F1()) {
            I1(0, 0);
            H1(false);
            return;
        }
        int A12 = A1();
        int B12 = B1();
        int C12 = C1();
        int z12 = z1();
        int[] iArr2 = new int[2];
        int i14 = (i9 - A12) - B12;
        int i15 = this.f38048s1;
        if (i15 == 1) {
            i14 = (i11 - C12) - z12;
        }
        int i16 = i14;
        if (i15 == 0) {
            if (this.f38030a1 == -1) {
                this.f38030a1 = 0;
            }
            if (this.f38031b1 == -1) {
                this.f38031b1 = 0;
            }
        } else {
            if (this.f38030a1 == -1) {
                this.f38030a1 = 0;
            }
            if (this.f38031b1 == -1) {
                this.f38031b1 = 0;
            }
        }
        e[] eVarArr = this.f38082L0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i12 = this.f38083M0;
            if (i17 >= i12) {
                break;
            }
            if (this.f38082L0[i17].V() == 8) {
                i18++;
            }
            i17++;
        }
        if (i18 > 0) {
            eVarArr = new e[i12 - i18];
            int i19 = 0;
            for (int i20 = 0; i20 < this.f38083M0; i20++) {
                e eVar = this.f38082L0[i20];
                if (eVar.V() != 8) {
                    eVarArr[i19] = eVar;
                    i19++;
                }
            }
            i13 = i19;
        } else {
            i13 = i12;
        }
        this.f38053x1 = eVarArr;
        this.f38054y1 = i13;
        int i21 = this.f38046q1;
        if (i21 == 0) {
            iArr = iArr2;
            z7 = true;
            q2(eVarArr, i13, this.f38048s1, i16, iArr2);
        } else if (i21 == 1) {
            z7 = true;
            iArr = iArr2;
            o2(eVarArr, i13, this.f38048s1, i16, iArr2);
        } else if (i21 == 2) {
            z7 = true;
            iArr = iArr2;
            n2(eVarArr, i13, this.f38048s1, i16, iArr2);
        } else if (i21 != 3) {
            z7 = true;
            iArr = iArr2;
        } else {
            z7 = true;
            iArr = iArr2;
            p2(eVarArr, i13, this.f38048s1, i16, iArr2);
        }
        int i22 = iArr[0] + A12 + B12;
        int i23 = iArr[z7 ? 1 : 0] + C12 + z12;
        if (i8 == 1073741824) {
            i22 = i9;
        } else if (i8 == Integer.MIN_VALUE) {
            i22 = Math.min(i22, i9);
        } else if (i8 != 0) {
            i22 = 0;
        }
        if (i10 == 1073741824) {
            i23 = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            i23 = Math.min(i23, i11);
        } else if (i10 != 0) {
            i23 = 0;
        }
        I1(i22, i23);
        l1(i22);
        M0(i23);
        if (this.f38083M0 <= 0) {
            z7 = false;
        }
        H1(z7);
    }

    public void D2(int i8) {
        this.f38047r1 = i8;
    }

    public void E2(int i8) {
        this.f38048s1 = i8;
    }

    public void F2(int i8) {
        this.f38045p1 = i8;
    }

    public void G2(float f8) {
        this.f38037h1 = f8;
    }

    public void H2(int i8) {
        this.f38043n1 = i8;
    }

    public void I2(int i8) {
        this.f38031b1 = i8;
    }

    public void J2(int i8) {
        this.f38046q1 = i8;
    }

    @Override // j0.e
    public void g(g0.d dVar, boolean z7) {
        super.g(dVar, z7);
        boolean z8 = K() != null && ((f) K()).R1();
        int i8 = this.f38046q1;
        if (i8 != 0) {
            if (i8 == 1) {
                int size = this.f38049t1.size();
                int i9 = 0;
                while (i9 < size) {
                    ((a) this.f38049t1.get(i9)).d(z8, i9, i9 == size + (-1));
                    i9++;
                }
            } else if (i8 == 2) {
                k2(z8);
            } else if (i8 == 3) {
                int size2 = this.f38049t1.size();
                int i10 = 0;
                while (i10 < size2) {
                    ((a) this.f38049t1.get(i10)).d(z8, i10, i10 == size2 + (-1));
                    i10++;
                }
            }
        } else if (this.f38049t1.size() > 0) {
            ((a) this.f38049t1.get(0)).d(z8, 0, true);
        }
        H1(false);
    }

    public void r2(float f8) {
        this.f38038i1 = f8;
    }

    public void s2(int i8) {
        this.f38032c1 = i8;
    }

    public void t2(float f8) {
        this.f38039j1 = f8;
    }

    public void u2(int i8) {
        this.f38033d1 = i8;
    }

    public void v2(int i8) {
        this.f38044o1 = i8;
    }

    public void w2(float f8) {
        this.f38036g1 = f8;
    }

    public void x2(int i8) {
        this.f38042m1 = i8;
    }

    public void y2(int i8) {
        this.f38030a1 = i8;
    }

    public void z2(float f8) {
        this.f38040k1 = f8;
    }
}
