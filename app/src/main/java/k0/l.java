package k0;

import j0.d;
import j0.e;
import k0.C6091f;
import k0.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f38442k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38443a;

        static {
            int[] iArr = new int[p.b.values().length];
            f38443a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38443a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38443a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(j0.e eVar) {
        super(eVar);
        this.f38476h.f38421e = C6091f.a.LEFT;
        this.f38477i.f38421e = C6091f.a.RIGHT;
        this.f38474f = 0;
    }

    private void q(int[] iArr, int i8, int i9, int i10, int i11, float f8, int i12) {
        int i13 = i9 - i8;
        int i14 = i11 - i10;
        if (i12 != -1) {
            if (i12 == 0) {
                iArr[0] = (int) ((i14 * f8) + 0.5f);
                iArr[1] = i14;
                return;
            } else {
                if (i12 != 1) {
                    return;
                }
                iArr[0] = i13;
                iArr[1] = (int) ((i13 * f8) + 0.5f);
                return;
            }
        }
        int i15 = (int) ((i14 * f8) + 0.5f);
        int i16 = (int) ((i13 / f8) + 0.5f);
        if (i15 <= i13) {
            iArr[0] = i15;
            iArr[1] = i14;
        } else if (i16 <= i14) {
            iArr[0] = i13;
            iArr[1] = i16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    @Override // k0.p, k0.InterfaceC6089d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(k0.InterfaceC6089d r17) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.l.a(k0.d):void");
    }

    @Override // k0.p
    void d() {
        j0.e K7;
        j0.e K8;
        j0.e eVar = this.f38470b;
        if (eVar.f37942a) {
            this.f38473e.d(eVar.W());
        }
        if (this.f38473e.f38426j) {
            e.b bVar = this.f38472d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (K7 = this.f38470b.K()) != null && (K7.A() == e.b.FIXED || K7.A() == bVar2)) {
                b(this.f38476h, K7.f37950e.f38476h, this.f38470b.f37930O.f());
                b(this.f38477i, K7.f37950e.f38477i, -this.f38470b.f37932Q.f());
                return;
            }
        } else {
            e.b A7 = this.f38470b.A();
            this.f38472d = A7;
            if (A7 != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (A7 == bVar3 && (K8 = this.f38470b.K()) != null && (K8.A() == e.b.FIXED || K8.A() == bVar3)) {
                    int W7 = (K8.W() - this.f38470b.f37930O.f()) - this.f38470b.f37932Q.f();
                    b(this.f38476h, K8.f37950e.f38476h, this.f38470b.f37930O.f());
                    b(this.f38477i, K8.f37950e.f38477i, -this.f38470b.f37932Q.f());
                    this.f38473e.d(W7);
                    return;
                }
                if (this.f38472d == e.b.FIXED) {
                    this.f38473e.d(this.f38470b.W());
                }
            }
        }
        C6092g c6092g = this.f38473e;
        if (c6092g.f38426j) {
            j0.e eVar2 = this.f38470b;
            if (eVar2.f37942a) {
                j0.d[] dVarArr = eVar2.f37938W;
                j0.d dVar = dVarArr[0];
                j0.d dVar2 = dVar.f37891f;
                if (dVar2 != null && dVarArr[1].f37891f != null) {
                    if (eVar2.i0()) {
                        this.f38476h.f38422f = this.f38470b.f37938W[0].f();
                        this.f38477i.f38422f = -this.f38470b.f37938W[1].f();
                        return;
                    }
                    C6091f h8 = h(this.f38470b.f37938W[0]);
                    if (h8 != null) {
                        b(this.f38476h, h8, this.f38470b.f37938W[0].f());
                    }
                    C6091f h9 = h(this.f38470b.f37938W[1]);
                    if (h9 != null) {
                        b(this.f38477i, h9, -this.f38470b.f37938W[1].f());
                    }
                    this.f38476h.f38418b = true;
                    this.f38477i.f38418b = true;
                    return;
                }
                if (dVar2 != null) {
                    C6091f h10 = h(dVar);
                    if (h10 != null) {
                        b(this.f38476h, h10, this.f38470b.f37938W[0].f());
                        b(this.f38477i, this.f38476h, this.f38473e.f38423g);
                        return;
                    }
                    return;
                }
                j0.d dVar3 = dVarArr[1];
                if (dVar3.f37891f != null) {
                    C6091f h11 = h(dVar3);
                    if (h11 != null) {
                        b(this.f38477i, h11, -this.f38470b.f37938W[1].f());
                        b(this.f38476h, this.f38477i, -this.f38473e.f38423g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof j0.i) || eVar2.K() == null || this.f38470b.o(d.a.CENTER).f37891f != null) {
                    return;
                }
                b(this.f38476h, this.f38470b.K().f37950e.f38476h, this.f38470b.X());
                b(this.f38477i, this.f38476h, this.f38473e.f38423g);
                return;
            }
        }
        if (this.f38472d == e.b.MATCH_CONSTRAINT) {
            j0.e eVar3 = this.f38470b;
            int i8 = eVar3.f37986w;
            if (i8 == 2) {
                j0.e K9 = eVar3.K();
                if (K9 != null) {
                    C6092g c6092g2 = K9.f37952f.f38473e;
                    this.f38473e.f38428l.add(c6092g2);
                    c6092g2.f38427k.add(this.f38473e);
                    C6092g c6092g3 = this.f38473e;
                    c6092g3.f38418b = true;
                    c6092g3.f38427k.add(this.f38476h);
                    this.f38473e.f38427k.add(this.f38477i);
                }
            } else if (i8 == 3) {
                if (eVar3.f37988x == 3) {
                    this.f38476h.f38417a = this;
                    this.f38477i.f38417a = this;
                    n nVar = eVar3.f37952f;
                    nVar.f38476h.f38417a = this;
                    nVar.f38477i.f38417a = this;
                    c6092g.f38417a = this;
                    if (eVar3.k0()) {
                        this.f38473e.f38428l.add(this.f38470b.f37952f.f38473e);
                        this.f38470b.f37952f.f38473e.f38427k.add(this.f38473e);
                        n nVar2 = this.f38470b.f37952f;
                        nVar2.f38473e.f38417a = this;
                        this.f38473e.f38428l.add(nVar2.f38476h);
                        this.f38473e.f38428l.add(this.f38470b.f37952f.f38477i);
                        this.f38470b.f37952f.f38476h.f38427k.add(this.f38473e);
                        this.f38470b.f37952f.f38477i.f38427k.add(this.f38473e);
                    } else if (this.f38470b.i0()) {
                        this.f38470b.f37952f.f38473e.f38428l.add(this.f38473e);
                        this.f38473e.f38427k.add(this.f38470b.f37952f.f38473e);
                    } else {
                        this.f38470b.f37952f.f38473e.f38428l.add(this.f38473e);
                    }
                } else {
                    C6092g c6092g4 = eVar3.f37952f.f38473e;
                    c6092g.f38428l.add(c6092g4);
                    c6092g4.f38427k.add(this.f38473e);
                    this.f38470b.f37952f.f38476h.f38427k.add(this.f38473e);
                    this.f38470b.f37952f.f38477i.f38427k.add(this.f38473e);
                    C6092g c6092g5 = this.f38473e;
                    c6092g5.f38418b = true;
                    c6092g5.f38427k.add(this.f38476h);
                    this.f38473e.f38427k.add(this.f38477i);
                    this.f38476h.f38428l.add(this.f38473e);
                    this.f38477i.f38428l.add(this.f38473e);
                }
            }
        }
        j0.e eVar4 = this.f38470b;
        j0.d[] dVarArr2 = eVar4.f37938W;
        j0.d dVar4 = dVarArr2[0];
        j0.d dVar5 = dVar4.f37891f;
        if (dVar5 != null && dVarArr2[1].f37891f != null) {
            if (eVar4.i0()) {
                this.f38476h.f38422f = this.f38470b.f37938W[0].f();
                this.f38477i.f38422f = -this.f38470b.f37938W[1].f();
                return;
            }
            C6091f h12 = h(this.f38470b.f37938W[0]);
            C6091f h13 = h(this.f38470b.f37938W[1]);
            if (h12 != null) {
                h12.b(this);
            }
            if (h13 != null) {
                h13.b(this);
            }
            this.f38478j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            C6091f h14 = h(dVar4);
            if (h14 != null) {
                b(this.f38476h, h14, this.f38470b.f37938W[0].f());
                c(this.f38477i, this.f38476h, 1, this.f38473e);
                return;
            }
            return;
        }
        j0.d dVar6 = dVarArr2[1];
        if (dVar6.f37891f != null) {
            C6091f h15 = h(dVar6);
            if (h15 != null) {
                b(this.f38477i, h15, -this.f38470b.f37938W[1].f());
                c(this.f38476h, this.f38477i, -1, this.f38473e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof j0.i) || eVar4.K() == null) {
            return;
        }
        b(this.f38476h, this.f38470b.K().f37950e.f38476h, this.f38470b.X());
        c(this.f38477i, this.f38476h, 1, this.f38473e);
    }

    @Override // k0.p
    public void e() {
        C6091f c6091f = this.f38476h;
        if (c6091f.f38426j) {
            this.f38470b.n1(c6091f.f38423g);
        }
    }

    @Override // k0.p
    void f() {
        this.f38471c = null;
        this.f38476h.c();
        this.f38477i.c();
        this.f38473e.c();
        this.f38475g = false;
    }

    @Override // k0.p
    boolean m() {
        return this.f38472d != e.b.MATCH_CONSTRAINT || this.f38470b.f37986w == 0;
    }

    void r() {
        this.f38475g = false;
        this.f38476h.c();
        this.f38476h.f38426j = false;
        this.f38477i.c();
        this.f38477i.f38426j = false;
        this.f38473e.f38426j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f38470b.t();
    }
}
