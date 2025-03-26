package k0;

import j0.d;
import j0.e;
import k0.C6091f;
import k0.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public C6091f f38452k;

    /* renamed from: l, reason: collision with root package name */
    C6092g f38453l;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38454a;

        static {
            int[] iArr = new int[p.b.values().length];
            f38454a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38454a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38454a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(j0.e eVar) {
        super(eVar);
        C6091f c6091f = new C6091f(this);
        this.f38452k = c6091f;
        this.f38453l = null;
        this.f38476h.f38421e = C6091f.a.TOP;
        this.f38477i.f38421e = C6091f.a.BOTTOM;
        c6091f.f38421e = C6091f.a.BASELINE;
        this.f38474f = 1;
    }

    @Override // k0.p, k0.InterfaceC6089d
    public void a(InterfaceC6089d interfaceC6089d) {
        float f8;
        float v7;
        float f9;
        int i8;
        int i9 = a.f38454a[this.f38478j.ordinal()];
        if (i9 == 1) {
            p(interfaceC6089d);
        } else if (i9 == 2) {
            o(interfaceC6089d);
        } else if (i9 == 3) {
            j0.e eVar = this.f38470b;
            n(interfaceC6089d, eVar.f37931P, eVar.f37933R, 1);
            return;
        }
        C6092g c6092g = this.f38473e;
        if (c6092g.f38419c && !c6092g.f38426j && this.f38472d == e.b.MATCH_CONSTRAINT) {
            j0.e eVar2 = this.f38470b;
            int i10 = eVar2.f37988x;
            if (i10 == 2) {
                j0.e K7 = eVar2.K();
                if (K7 != null) {
                    if (K7.f37952f.f38473e.f38426j) {
                        this.f38473e.d((int) ((r7.f38423g * this.f38470b.f37914E) + 0.5f));
                    }
                }
            } else if (i10 == 3 && eVar2.f37950e.f38473e.f38426j) {
                int w7 = eVar2.w();
                if (w7 == -1) {
                    j0.e eVar3 = this.f38470b;
                    f8 = eVar3.f37950e.f38473e.f38423g;
                    v7 = eVar3.v();
                } else if (w7 == 0) {
                    f9 = r7.f37950e.f38473e.f38423g * this.f38470b.v();
                    i8 = (int) (f9 + 0.5f);
                    this.f38473e.d(i8);
                } else if (w7 != 1) {
                    i8 = 0;
                    this.f38473e.d(i8);
                } else {
                    j0.e eVar4 = this.f38470b;
                    f8 = eVar4.f37950e.f38473e.f38423g;
                    v7 = eVar4.v();
                }
                f9 = f8 / v7;
                i8 = (int) (f9 + 0.5f);
                this.f38473e.d(i8);
            }
        }
        C6091f c6091f = this.f38476h;
        if (c6091f.f38419c) {
            C6091f c6091f2 = this.f38477i;
            if (c6091f2.f38419c) {
                if (c6091f.f38426j && c6091f2.f38426j && this.f38473e.f38426j) {
                    return;
                }
                if (!this.f38473e.f38426j && this.f38472d == e.b.MATCH_CONSTRAINT) {
                    j0.e eVar5 = this.f38470b;
                    if (eVar5.f37986w == 0 && !eVar5.k0()) {
                        C6091f c6091f3 = (C6091f) this.f38476h.f38428l.get(0);
                        C6091f c6091f4 = (C6091f) this.f38477i.f38428l.get(0);
                        int i11 = c6091f3.f38423g;
                        C6091f c6091f5 = this.f38476h;
                        int i12 = i11 + c6091f5.f38422f;
                        int i13 = c6091f4.f38423g + this.f38477i.f38422f;
                        c6091f5.d(i12);
                        this.f38477i.d(i13);
                        this.f38473e.d(i13 - i12);
                        return;
                    }
                }
                if (!this.f38473e.f38426j && this.f38472d == e.b.MATCH_CONSTRAINT && this.f38469a == 1 && this.f38476h.f38428l.size() > 0 && this.f38477i.f38428l.size() > 0) {
                    C6091f c6091f6 = (C6091f) this.f38476h.f38428l.get(0);
                    int i14 = (((C6091f) this.f38477i.f38428l.get(0)).f38423g + this.f38477i.f38422f) - (c6091f6.f38423g + this.f38476h.f38422f);
                    C6092g c6092g2 = this.f38473e;
                    int i15 = c6092g2.f38438m;
                    if (i14 < i15) {
                        c6092g2.d(i14);
                    } else {
                        c6092g2.d(i15);
                    }
                }
                if (this.f38473e.f38426j && this.f38476h.f38428l.size() > 0 && this.f38477i.f38428l.size() > 0) {
                    C6091f c6091f7 = (C6091f) this.f38476h.f38428l.get(0);
                    C6091f c6091f8 = (C6091f) this.f38477i.f38428l.get(0);
                    int i16 = c6091f7.f38423g + this.f38476h.f38422f;
                    int i17 = c6091f8.f38423g + this.f38477i.f38422f;
                    float R7 = this.f38470b.R();
                    if (c6091f7 == c6091f8) {
                        i16 = c6091f7.f38423g;
                        i17 = c6091f8.f38423g;
                        R7 = 0.5f;
                    }
                    this.f38476h.d((int) (i16 + 0.5f + (((i17 - i16) - this.f38473e.f38423g) * R7)));
                    this.f38477i.d(this.f38476h.f38423g + this.f38473e.f38423g);
                }
            }
        }
    }

    @Override // k0.p
    void d() {
        j0.e K7;
        j0.e K8;
        j0.e eVar = this.f38470b;
        if (eVar.f37942a) {
            this.f38473e.d(eVar.x());
        }
        if (!this.f38473e.f38426j) {
            this.f38472d = this.f38470b.T();
            if (this.f38470b.Z()) {
                this.f38453l = new C6086a(this);
            }
            e.b bVar = this.f38472d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (K8 = this.f38470b.K()) != null && K8.T() == e.b.FIXED) {
                    int x7 = (K8.x() - this.f38470b.f37931P.f()) - this.f38470b.f37933R.f();
                    b(this.f38476h, K8.f37952f.f38476h, this.f38470b.f37931P.f());
                    b(this.f38477i, K8.f37952f.f38477i, -this.f38470b.f37933R.f());
                    this.f38473e.d(x7);
                    return;
                }
                if (this.f38472d == e.b.FIXED) {
                    this.f38473e.d(this.f38470b.x());
                }
            }
        } else if (this.f38472d == e.b.MATCH_PARENT && (K7 = this.f38470b.K()) != null && K7.T() == e.b.FIXED) {
            b(this.f38476h, K7.f37952f.f38476h, this.f38470b.f37931P.f());
            b(this.f38477i, K7.f37952f.f38477i, -this.f38470b.f37933R.f());
            return;
        }
        C6092g c6092g = this.f38473e;
        boolean z7 = c6092g.f38426j;
        if (z7) {
            j0.e eVar2 = this.f38470b;
            if (eVar2.f37942a) {
                j0.d[] dVarArr = eVar2.f37938W;
                j0.d dVar = dVarArr[2];
                j0.d dVar2 = dVar.f37891f;
                if (dVar2 != null && dVarArr[3].f37891f != null) {
                    if (eVar2.k0()) {
                        this.f38476h.f38422f = this.f38470b.f37938W[2].f();
                        this.f38477i.f38422f = -this.f38470b.f37938W[3].f();
                    } else {
                        C6091f h8 = h(this.f38470b.f37938W[2]);
                        if (h8 != null) {
                            b(this.f38476h, h8, this.f38470b.f37938W[2].f());
                        }
                        C6091f h9 = h(this.f38470b.f37938W[3]);
                        if (h9 != null) {
                            b(this.f38477i, h9, -this.f38470b.f37938W[3].f());
                        }
                        this.f38476h.f38418b = true;
                        this.f38477i.f38418b = true;
                    }
                    if (this.f38470b.Z()) {
                        b(this.f38452k, this.f38476h, this.f38470b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    C6091f h10 = h(dVar);
                    if (h10 != null) {
                        b(this.f38476h, h10, this.f38470b.f37938W[2].f());
                        b(this.f38477i, this.f38476h, this.f38473e.f38423g);
                        if (this.f38470b.Z()) {
                            b(this.f38452k, this.f38476h, this.f38470b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                j0.d dVar3 = dVarArr[3];
                if (dVar3.f37891f != null) {
                    C6091f h11 = h(dVar3);
                    if (h11 != null) {
                        b(this.f38477i, h11, -this.f38470b.f37938W[3].f());
                        b(this.f38476h, this.f38477i, -this.f38473e.f38423g);
                    }
                    if (this.f38470b.Z()) {
                        b(this.f38452k, this.f38476h, this.f38470b.p());
                        return;
                    }
                    return;
                }
                j0.d dVar4 = dVarArr[4];
                if (dVar4.f37891f != null) {
                    C6091f h12 = h(dVar4);
                    if (h12 != null) {
                        b(this.f38452k, h12, 0);
                        b(this.f38476h, this.f38452k, -this.f38470b.p());
                        b(this.f38477i, this.f38476h, this.f38473e.f38423g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof j0.i) || eVar2.K() == null || this.f38470b.o(d.a.CENTER).f37891f != null) {
                    return;
                }
                b(this.f38476h, this.f38470b.K().f37952f.f38476h, this.f38470b.Y());
                b(this.f38477i, this.f38476h, this.f38473e.f38423g);
                if (this.f38470b.Z()) {
                    b(this.f38452k, this.f38476h, this.f38470b.p());
                    return;
                }
                return;
            }
        }
        if (z7 || this.f38472d != e.b.MATCH_CONSTRAINT) {
            c6092g.b(this);
        } else {
            j0.e eVar3 = this.f38470b;
            int i8 = eVar3.f37988x;
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
            } else if (i8 == 3 && !eVar3.k0()) {
                j0.e eVar4 = this.f38470b;
                if (eVar4.f37986w != 3) {
                    C6092g c6092g4 = eVar4.f37950e.f38473e;
                    this.f38473e.f38428l.add(c6092g4);
                    c6092g4.f38427k.add(this.f38473e);
                    C6092g c6092g5 = this.f38473e;
                    c6092g5.f38418b = true;
                    c6092g5.f38427k.add(this.f38476h);
                    this.f38473e.f38427k.add(this.f38477i);
                }
            }
        }
        j0.e eVar5 = this.f38470b;
        j0.d[] dVarArr2 = eVar5.f37938W;
        j0.d dVar5 = dVarArr2[2];
        j0.d dVar6 = dVar5.f37891f;
        if (dVar6 != null && dVarArr2[3].f37891f != null) {
            if (eVar5.k0()) {
                this.f38476h.f38422f = this.f38470b.f37938W[2].f();
                this.f38477i.f38422f = -this.f38470b.f37938W[3].f();
            } else {
                C6091f h13 = h(this.f38470b.f37938W[2]);
                C6091f h14 = h(this.f38470b.f37938W[3]);
                if (h13 != null) {
                    h13.b(this);
                }
                if (h14 != null) {
                    h14.b(this);
                }
                this.f38478j = p.b.CENTER;
            }
            if (this.f38470b.Z()) {
                c(this.f38452k, this.f38476h, 1, this.f38453l);
            }
        } else if (dVar6 != null) {
            C6091f h15 = h(dVar5);
            if (h15 != null) {
                b(this.f38476h, h15, this.f38470b.f37938W[2].f());
                c(this.f38477i, this.f38476h, 1, this.f38473e);
                if (this.f38470b.Z()) {
                    c(this.f38452k, this.f38476h, 1, this.f38453l);
                }
                e.b bVar2 = this.f38472d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f38470b.v() > 0.0f) {
                    l lVar = this.f38470b.f37950e;
                    if (lVar.f38472d == bVar3) {
                        lVar.f38473e.f38427k.add(this.f38473e);
                        this.f38473e.f38428l.add(this.f38470b.f37950e.f38473e);
                        this.f38473e.f38417a = this;
                    }
                }
            }
        } else {
            j0.d dVar7 = dVarArr2[3];
            if (dVar7.f37891f != null) {
                C6091f h16 = h(dVar7);
                if (h16 != null) {
                    b(this.f38477i, h16, -this.f38470b.f37938W[3].f());
                    c(this.f38476h, this.f38477i, -1, this.f38473e);
                    if (this.f38470b.Z()) {
                        c(this.f38452k, this.f38476h, 1, this.f38453l);
                    }
                }
            } else {
                j0.d dVar8 = dVarArr2[4];
                if (dVar8.f37891f != null) {
                    C6091f h17 = h(dVar8);
                    if (h17 != null) {
                        b(this.f38452k, h17, 0);
                        c(this.f38476h, this.f38452k, -1, this.f38453l);
                        c(this.f38477i, this.f38476h, 1, this.f38473e);
                    }
                } else if (!(eVar5 instanceof j0.i) && eVar5.K() != null) {
                    b(this.f38476h, this.f38470b.K().f37952f.f38476h, this.f38470b.Y());
                    c(this.f38477i, this.f38476h, 1, this.f38473e);
                    if (this.f38470b.Z()) {
                        c(this.f38452k, this.f38476h, 1, this.f38453l);
                    }
                    e.b bVar4 = this.f38472d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f38470b.v() > 0.0f) {
                        l lVar2 = this.f38470b.f37950e;
                        if (lVar2.f38472d == bVar5) {
                            lVar2.f38473e.f38427k.add(this.f38473e);
                            this.f38473e.f38428l.add(this.f38470b.f37950e.f38473e);
                            this.f38473e.f38417a = this;
                        }
                    }
                }
            }
        }
        if (this.f38473e.f38428l.size() == 0) {
            this.f38473e.f38419c = true;
        }
    }

    @Override // k0.p
    public void e() {
        C6091f c6091f = this.f38476h;
        if (c6091f.f38426j) {
            this.f38470b.o1(c6091f.f38423g);
        }
    }

    @Override // k0.p
    void f() {
        this.f38471c = null;
        this.f38476h.c();
        this.f38477i.c();
        this.f38452k.c();
        this.f38473e.c();
        this.f38475g = false;
    }

    @Override // k0.p
    boolean m() {
        return this.f38472d != e.b.MATCH_CONSTRAINT || this.f38470b.f37988x == 0;
    }

    void q() {
        this.f38475g = false;
        this.f38476h.c();
        this.f38476h.f38426j = false;
        this.f38477i.c();
        this.f38477i.f38426j = false;
        this.f38452k.c();
        this.f38452k.f38426j = false;
        this.f38473e.f38426j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f38470b.t();
    }
}
