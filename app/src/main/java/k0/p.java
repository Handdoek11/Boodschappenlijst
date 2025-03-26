package k0;

import j0.d;
import j0.e;

/* loaded from: classes.dex */
public abstract class p implements InterfaceC6089d {

    /* renamed from: a, reason: collision with root package name */
    public int f38469a;

    /* renamed from: b, reason: collision with root package name */
    j0.e f38470b;

    /* renamed from: c, reason: collision with root package name */
    m f38471c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f38472d;

    /* renamed from: e, reason: collision with root package name */
    C6092g f38473e = new C6092g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f38474f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f38475g = false;

    /* renamed from: h, reason: collision with root package name */
    public C6091f f38476h = new C6091f(this);

    /* renamed from: i, reason: collision with root package name */
    public C6091f f38477i = new C6091f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f38478j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38479a;

        static {
            int[] iArr = new int[d.a.values().length];
            f38479a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38479a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38479a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38479a[d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38479a[d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(j0.e eVar) {
        this.f38470b = eVar;
    }

    private void l(int i8, int i9) {
        int i10 = this.f38469a;
        if (i10 == 0) {
            this.f38473e.d(g(i9, i8));
            return;
        }
        if (i10 == 1) {
            this.f38473e.d(Math.min(g(this.f38473e.f38438m, i8), i9));
            return;
        }
        if (i10 == 2) {
            j0.e K7 = this.f38470b.K();
            if (K7 != null) {
                if ((i8 == 0 ? K7.f37950e : K7.f37952f).f38473e.f38426j) {
                    this.f38473e.d(g((int) ((r9.f38423g * (i8 == 0 ? this.f38470b.f37908B : this.f38470b.f37914E)) + 0.5f), i8));
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 3) {
            return;
        }
        j0.e eVar = this.f38470b;
        p pVar = eVar.f37950e;
        e.b bVar = pVar.f38472d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f38469a == 3) {
            n nVar = eVar.f37952f;
            if (nVar.f38472d == bVar2 && nVar.f38469a == 3) {
                return;
            }
        }
        if (i8 == 0) {
            pVar = eVar.f37952f;
        }
        if (pVar.f38473e.f38426j) {
            float v7 = eVar.v();
            this.f38473e.d(i8 == 1 ? (int) ((pVar.f38473e.f38423g / v7) + 0.5f) : (int) ((v7 * pVar.f38473e.f38423g) + 0.5f));
        }
    }

    @Override // k0.InterfaceC6089d
    public abstract void a(InterfaceC6089d interfaceC6089d);

    protected final void b(C6091f c6091f, C6091f c6091f2, int i8) {
        c6091f.f38428l.add(c6091f2);
        c6091f.f38422f = i8;
        c6091f2.f38427k.add(c6091f);
    }

    protected final void c(C6091f c6091f, C6091f c6091f2, int i8, C6092g c6092g) {
        c6091f.f38428l.add(c6091f2);
        c6091f.f38428l.add(this.f38473e);
        c6091f.f38424h = i8;
        c6091f.f38425i = c6092g;
        c6091f2.f38427k.add(c6091f);
        c6092g.f38427k.add(c6091f);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i8, int i9) {
        int max;
        if (i9 == 0) {
            j0.e eVar = this.f38470b;
            int i10 = eVar.f37906A;
            max = Math.max(eVar.f37992z, i8);
            if (i10 > 0) {
                max = Math.min(i10, i8);
            }
            if (max == i8) {
                return i8;
            }
        } else {
            j0.e eVar2 = this.f38470b;
            int i11 = eVar2.f37912D;
            max = Math.max(eVar2.f37910C, i8);
            if (i11 > 0) {
                max = Math.min(i11, i8);
            }
            if (max == i8) {
                return i8;
            }
        }
        return max;
    }

    protected final C6091f h(j0.d dVar) {
        j0.d dVar2 = dVar.f37891f;
        if (dVar2 == null) {
            return null;
        }
        j0.e eVar = dVar2.f37889d;
        int i8 = a.f38479a[dVar2.f37890e.ordinal()];
        if (i8 == 1) {
            return eVar.f37950e.f38476h;
        }
        if (i8 == 2) {
            return eVar.f37950e.f38477i;
        }
        if (i8 == 3) {
            return eVar.f37952f.f38476h;
        }
        if (i8 == 4) {
            return eVar.f37952f.f38452k;
        }
        if (i8 != 5) {
            return null;
        }
        return eVar.f37952f.f38477i;
    }

    protected final C6091f i(j0.d dVar, int i8) {
        j0.d dVar2 = dVar.f37891f;
        if (dVar2 == null) {
            return null;
        }
        j0.e eVar = dVar2.f37889d;
        p pVar = i8 == 0 ? eVar.f37950e : eVar.f37952f;
        int i9 = a.f38479a[dVar2.f37890e.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f38477i;
        }
        return pVar.f38476h;
    }

    public long j() {
        if (this.f38473e.f38426j) {
            return r0.f38423g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f38475g;
    }

    abstract boolean m();

    protected void n(InterfaceC6089d interfaceC6089d, j0.d dVar, j0.d dVar2, int i8) {
        C6091f h8 = h(dVar);
        C6091f h9 = h(dVar2);
        if (h8.f38426j && h9.f38426j) {
            int f8 = h8.f38423g + dVar.f();
            int f9 = h9.f38423g - dVar2.f();
            int i9 = f9 - f8;
            if (!this.f38473e.f38426j && this.f38472d == e.b.MATCH_CONSTRAINT) {
                l(i8, i9);
            }
            C6092g c6092g = this.f38473e;
            if (c6092g.f38426j) {
                if (c6092g.f38423g == i9) {
                    this.f38476h.d(f8);
                    this.f38477i.d(f9);
                    return;
                }
                float y7 = i8 == 0 ? this.f38470b.y() : this.f38470b.R();
                if (h8 == h9) {
                    f8 = h8.f38423g;
                    f9 = h9.f38423g;
                    y7 = 0.5f;
                }
                this.f38476h.d((int) (f8 + 0.5f + (((f9 - f8) - this.f38473e.f38423g) * y7)));
                this.f38477i.d(this.f38476h.f38423g + this.f38473e.f38423g);
            }
        }
    }

    protected void o(InterfaceC6089d interfaceC6089d) {
    }

    protected void p(InterfaceC6089d interfaceC6089d) {
    }
}
