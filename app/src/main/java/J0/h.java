package j0;

import j0.d;
import j0.e;

/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: L0, reason: collision with root package name */
    protected float f38073L0 = -1.0f;

    /* renamed from: M0, reason: collision with root package name */
    protected int f38074M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    protected int f38075N0 = -1;

    /* renamed from: O0, reason: collision with root package name */
    protected boolean f38076O0 = true;

    /* renamed from: P0, reason: collision with root package name */
    private d f38077P0 = this.f37931P;

    /* renamed from: Q0, reason: collision with root package name */
    private int f38078Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    private int f38079R0 = 0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f38080S0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38081a;

        static {
            int[] iArr = new int[d.a.values().length];
            f38081a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38081a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38081a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38081a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38081a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38081a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38081a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38081a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38081a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f37939X.clear();
        this.f37939X.add(this.f38077P0);
        int length = this.f37938W.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f37938W[i8] = this.f38077P0;
        }
    }

    public void A1(float f8) {
        if (f8 > -1.0f) {
            this.f38073L0 = f8;
            this.f38074M0 = -1;
            this.f38075N0 = -1;
        }
    }

    public void B1(int i8) {
        if (this.f38078Q0 == i8) {
            return;
        }
        this.f38078Q0 = i8;
        this.f37939X.clear();
        if (this.f38078Q0 == 1) {
            this.f38077P0 = this.f37930O;
        } else {
            this.f38077P0 = this.f37931P;
        }
        this.f37939X.add(this.f38077P0);
        int length = this.f37938W.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f37938W[i9] = this.f38077P0;
        }
    }

    @Override // j0.e
    public void g(g0.d dVar, boolean z7) {
        f fVar = (f) K();
        if (fVar == null) {
            return;
        }
        d o8 = fVar.o(d.a.LEFT);
        d o9 = fVar.o(d.a.RIGHT);
        e eVar = this.f37943a0;
        boolean z8 = eVar != null && eVar.f37941Z[0] == e.b.WRAP_CONTENT;
        if (this.f38078Q0 == 0) {
            o8 = fVar.o(d.a.TOP);
            o9 = fVar.o(d.a.BOTTOM);
            e eVar2 = this.f37943a0;
            z8 = eVar2 != null && eVar2.f37941Z[1] == e.b.WRAP_CONTENT;
        }
        if (this.f38080S0 && this.f38077P0.n()) {
            g0.i q8 = dVar.q(this.f38077P0);
            dVar.f(q8, this.f38077P0.e());
            if (this.f38074M0 != -1) {
                if (z8) {
                    dVar.h(dVar.q(o9), q8, 0, 5);
                }
            } else if (this.f38075N0 != -1 && z8) {
                g0.i q9 = dVar.q(o9);
                dVar.h(q8, dVar.q(o8), 0, 5);
                dVar.h(q9, q8, 0, 5);
            }
            this.f38080S0 = false;
            return;
        }
        if (this.f38074M0 != -1) {
            g0.i q10 = dVar.q(this.f38077P0);
            dVar.e(q10, dVar.q(o8), this.f38074M0, 8);
            if (z8) {
                dVar.h(dVar.q(o9), q10, 0, 5);
                return;
            }
            return;
        }
        if (this.f38075N0 == -1) {
            if (this.f38073L0 != -1.0f) {
                dVar.d(g0.d.s(dVar, dVar.q(this.f38077P0), dVar.q(o9), this.f38073L0));
                return;
            }
            return;
        }
        g0.i q11 = dVar.q(this.f38077P0);
        g0.i q12 = dVar.q(o9);
        dVar.e(q11, q12, -this.f38075N0, 8);
        if (z8) {
            dVar.h(q11, dVar.q(o8), 0, 5);
            dVar.h(q12, q11, 0, 5);
        }
    }

    @Override // j0.e
    public boolean h() {
        return true;
    }

    @Override // j0.e
    public boolean n0() {
        return this.f38080S0;
    }

    @Override // j0.e
    public d o(d.a aVar) {
        int i8 = a.f38081a[aVar.ordinal()];
        if (i8 == 1 || i8 == 2) {
            if (this.f38078Q0 == 1) {
                return this.f38077P0;
            }
            return null;
        }
        if ((i8 == 3 || i8 == 4) && this.f38078Q0 == 0) {
            return this.f38077P0;
        }
        return null;
    }

    @Override // j0.e
    public boolean o0() {
        return this.f38080S0;
    }

    @Override // j0.e
    public void r1(g0.d dVar, boolean z7) {
        if (K() == null) {
            return;
        }
        int y7 = dVar.y(this.f38077P0);
        if (this.f38078Q0 == 1) {
            n1(y7);
            o1(0);
            M0(K().x());
            l1(0);
            return;
        }
        n1(0);
        o1(y7);
        l1(K().W());
        M0(0);
    }

    public d s1() {
        return this.f38077P0;
    }

    public int t1() {
        return this.f38078Q0;
    }

    public int u1() {
        return this.f38074M0;
    }

    public int v1() {
        return this.f38075N0;
    }

    public float w1() {
        return this.f38073L0;
    }

    public void x1(int i8) {
        this.f38077P0.t(i8);
        this.f38080S0 = true;
    }

    public void y1(int i8) {
        if (i8 > -1) {
            this.f38073L0 = -1.0f;
            this.f38074M0 = i8;
            this.f38075N0 = -1;
        }
    }

    public void z1(int i8) {
        if (i8 > -1) {
            this.f38073L0 = -1.0f;
            this.f38074M0 = -1;
            this.f38075N0 = i8;
        }
    }
}
