package j0;

import j0.d;
import j0.e;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6049a extends j {

    /* renamed from: N0, reason: collision with root package name */
    private int f37860N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f37861O0 = true;

    /* renamed from: P0, reason: collision with root package name */
    private int f37862P0 = 0;

    /* renamed from: Q0, reason: collision with root package name */
    boolean f37863Q0 = false;

    public void A1(boolean z7) {
        this.f37861O0 = z7;
    }

    public void B1(int i8) {
        this.f37860N0 = i8;
    }

    public void C1(int i8) {
        this.f37862P0 = i8;
    }

    @Override // j0.e
    public void g(g0.d dVar, boolean z7) {
        d[] dVarArr;
        boolean z8;
        int i8;
        int i9;
        int i10;
        d[] dVarArr2 = this.f37938W;
        dVarArr2[0] = this.f37930O;
        dVarArr2[2] = this.f37931P;
        dVarArr2[1] = this.f37932Q;
        dVarArr2[3] = this.f37933R;
        int i11 = 0;
        while (true) {
            dVarArr = this.f37938W;
            if (i11 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i11];
            dVar2.f37894i = dVar.q(dVar2);
            i11++;
        }
        int i12 = this.f37860N0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i12];
        if (!this.f37863Q0) {
            u1();
        }
        if (this.f37863Q0) {
            this.f37863Q0 = false;
            int i13 = this.f37860N0;
            if (i13 == 0 || i13 == 1) {
                dVar.f(this.f37930O.f37894i, this.f37953f0);
                dVar.f(this.f37932Q.f37894i, this.f37953f0);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    dVar.f(this.f37931P.f37894i, this.f37955g0);
                    dVar.f(this.f37933R.f37894i, this.f37955g0);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.f38083M0; i14++) {
            e eVar = this.f38082L0[i14];
            if ((this.f37861O0 || eVar.h()) && ((((i9 = this.f37860N0) == 0 || i9 == 1) && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f37930O.f37891f != null && eVar.f37932Q.f37891f != null) || (((i10 = this.f37860N0) == 2 || i10 == 3) && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f37931P.f37891f != null && eVar.f37933R.f37891f != null))) {
                z8 = true;
                break;
            }
        }
        z8 = false;
        boolean z9 = this.f37930O.l() || this.f37932Q.l();
        boolean z10 = this.f37931P.l() || this.f37933R.l();
        int i15 = !(!z8 && (((i8 = this.f37860N0) == 0 && z9) || ((i8 == 2 && z10) || ((i8 == 1 && z9) || (i8 == 3 && z10))))) ? 4 : 5;
        for (int i16 = 0; i16 < this.f38083M0; i16++) {
            e eVar2 = this.f38082L0[i16];
            if (this.f37861O0 || eVar2.h()) {
                g0.i q8 = dVar.q(eVar2.f37938W[this.f37860N0]);
                d[] dVarArr3 = eVar2.f37938W;
                int i17 = this.f37860N0;
                d dVar4 = dVarArr3[i17];
                dVar4.f37894i = q8;
                d dVar5 = dVar4.f37891f;
                int i18 = (dVar5 == null || dVar5.f37889d != this) ? 0 : dVar4.f37892g;
                if (i17 == 0 || i17 == 2) {
                    dVar.i(dVar3.f37894i, q8, this.f37862P0 - i18, z8);
                } else {
                    dVar.g(dVar3.f37894i, q8, this.f37862P0 + i18, z8);
                }
                dVar.e(dVar3.f37894i, q8, this.f37862P0 + i18, i15);
            }
        }
        int i19 = this.f37860N0;
        if (i19 == 0) {
            dVar.e(this.f37932Q.f37894i, this.f37930O.f37894i, 0, 8);
            dVar.e(this.f37930O.f37894i, this.f37943a0.f37932Q.f37894i, 0, 4);
            dVar.e(this.f37930O.f37894i, this.f37943a0.f37930O.f37894i, 0, 0);
            return;
        }
        if (i19 == 1) {
            dVar.e(this.f37930O.f37894i, this.f37932Q.f37894i, 0, 8);
            dVar.e(this.f37930O.f37894i, this.f37943a0.f37930O.f37894i, 0, 4);
            dVar.e(this.f37930O.f37894i, this.f37943a0.f37932Q.f37894i, 0, 0);
        } else if (i19 == 2) {
            dVar.e(this.f37933R.f37894i, this.f37931P.f37894i, 0, 8);
            dVar.e(this.f37931P.f37894i, this.f37943a0.f37933R.f37894i, 0, 4);
            dVar.e(this.f37931P.f37894i, this.f37943a0.f37931P.f37894i, 0, 0);
        } else if (i19 == 3) {
            dVar.e(this.f37931P.f37894i, this.f37933R.f37894i, 0, 8);
            dVar.e(this.f37931P.f37894i, this.f37943a0.f37931P.f37894i, 0, 4);
            dVar.e(this.f37931P.f37894i, this.f37943a0.f37933R.f37894i, 0, 0);
        }
    }

    @Override // j0.e
    public boolean h() {
        return true;
    }

    @Override // j0.e
    public boolean n0() {
        return this.f37863Q0;
    }

    @Override // j0.e
    public boolean o0() {
        return this.f37863Q0;
    }

    @Override // j0.e
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i8 = 0; i8 < this.f38083M0; i8++) {
            e eVar = this.f38082L0[i8];
            if (i8 > 0) {
                str = str + ", ";
            }
            str = str + eVar.t();
        }
        return str + "}";
    }

    public boolean u1() {
        int i8;
        int i9;
        int i10;
        boolean z7 = true;
        int i11 = 0;
        while (true) {
            i8 = this.f38083M0;
            if (i11 >= i8) {
                break;
            }
            e eVar = this.f38082L0[i11];
            if ((this.f37861O0 || eVar.h()) && ((((i9 = this.f37860N0) == 0 || i9 == 1) && !eVar.n0()) || (((i10 = this.f37860N0) == 2 || i10 == 3) && !eVar.o0()))) {
                z7 = false;
            }
            i11++;
        }
        if (!z7 || i8 <= 0) {
            return false;
        }
        int i12 = 0;
        boolean z8 = false;
        for (int i13 = 0; i13 < this.f38083M0; i13++) {
            e eVar2 = this.f38082L0[i13];
            if (this.f37861O0 || eVar2.h()) {
                if (!z8) {
                    int i14 = this.f37860N0;
                    if (i14 == 0) {
                        i12 = eVar2.o(d.a.LEFT).e();
                    } else if (i14 == 1) {
                        i12 = eVar2.o(d.a.RIGHT).e();
                    } else if (i14 == 2) {
                        i12 = eVar2.o(d.a.TOP).e();
                    } else if (i14 == 3) {
                        i12 = eVar2.o(d.a.BOTTOM).e();
                    }
                    z8 = true;
                }
                int i15 = this.f37860N0;
                if (i15 == 0) {
                    i12 = Math.min(i12, eVar2.o(d.a.LEFT).e());
                } else if (i15 == 1) {
                    i12 = Math.max(i12, eVar2.o(d.a.RIGHT).e());
                } else if (i15 == 2) {
                    i12 = Math.min(i12, eVar2.o(d.a.TOP).e());
                } else if (i15 == 3) {
                    i12 = Math.max(i12, eVar2.o(d.a.BOTTOM).e());
                }
            }
        }
        int i16 = i12 + this.f37862P0;
        int i17 = this.f37860N0;
        if (i17 == 0 || i17 == 1) {
            G0(i16, i16);
        } else {
            J0(i16, i16);
        }
        this.f37863Q0 = true;
        return true;
    }

    public boolean v1() {
        return this.f37861O0;
    }

    public int w1() {
        return this.f37860N0;
    }

    public int x1() {
        return this.f37862P0;
    }

    public int y1() {
        int i8 = this.f37860N0;
        if (i8 == 0 || i8 == 1) {
            return 0;
        }
        return (i8 == 2 || i8 == 3) ? 1 : -1;
    }

    protected void z1() {
        for (int i8 = 0; i8 < this.f38083M0; i8++) {
            e eVar = this.f38082L0[i8];
            if (this.f37861O0 || eVar.h()) {
                int i9 = this.f37860N0;
                if (i9 == 0 || i9 == 1) {
                    eVar.T0(0, true);
                } else if (i9 == 2 || i9 == 3) {
                    eVar.T0(1, true);
                }
            }
        }
    }
}
