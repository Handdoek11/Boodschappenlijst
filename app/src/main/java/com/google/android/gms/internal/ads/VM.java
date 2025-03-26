package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;

/* loaded from: classes.dex */
public final class VM implements JD, ZC, InterfaceC3360mC, EC, InterfaceC0484a, ZE {

    /* renamed from: o, reason: collision with root package name */
    private final C2000Zc f19585o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f19586s = false;

    public VM(C2000Zc c2000Zc, C2913i50 c2913i50) {
        this.f19585o = c2000Zc;
        c2000Zc.c(2);
        if (c2913i50 != null) {
            c2000Zc.c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZE
    public final void H0(final C2422de c2422de) {
        this.f19585o.b(new InterfaceC1965Yc() { // from class: com.google.android.gms.internal.ads.UM
            @Override // com.google.android.gms.internal.ads.InterfaceC1965Yc
            public final void a(C1409Ie c1409Ie) {
                c1409Ie.D(c2422de);
            }
        });
        this.f19585o.c(1103);
    }

    @Override // D2.InterfaceC0484a
    public final synchronized void I0() {
        if (this.f19586s) {
            this.f19585o.c(8);
        } else {
            this.f19585o.c(7);
            this.f19586s = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZE
    public final void N(boolean z7) {
        this.f19585o.c(true != z7 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void T0(final C60 c60) {
        this.f19585o.b(new InterfaceC1965Yc() { // from class: com.google.android.gms.internal.ads.RM
            @Override // com.google.android.gms.internal.ads.InterfaceC1965Yc
            public final void a(C1409Ie c1409Ie) {
                C2964id c2964id = (C2964id) c1409Ie.J().H();
                C4489we c4489we = (C4489we) c1409Ie.J().d0().H();
                c4489we.C(c60.f14101b.f13520b.f26832b);
                c2964id.D(c4489we);
                c1409Ie.C(c2964id);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZE
    public final void e() {
        this.f19585o.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.ZE
    public final void i(boolean z7) {
        this.f19585o.c(true != z7 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final synchronized void r() {
        this.f19585o.c(6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
    public final void r0(D2.W0 w02) {
        switch (w02.f1162o) {
            case 1:
                this.f19585o.c(101);
                break;
            case 2:
                this.f19585o.c(102);
                break;
            case 3:
                this.f19585o.c(5);
                break;
            case 4:
                this.f19585o.c(103);
                break;
            case 5:
                this.f19585o.c(104);
                break;
            case 6:
                this.f19585o.c(105);
                break;
            case 7:
                this.f19585o.c(106);
                break;
            default:
                this.f19585o.c(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void s() {
        this.f19585o.c(3);
    }

    @Override // com.google.android.gms.internal.ads.ZE
    public final void s0(final C2422de c2422de) {
        this.f19585o.b(new InterfaceC1965Yc() { // from class: com.google.android.gms.internal.ads.SM
            @Override // com.google.android.gms.internal.ads.InterfaceC1965Yc
            public final void a(C1409Ie c1409Ie) {
                c1409Ie.D(c2422de);
            }
        });
        this.f19585o.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.ZE
    public final void w(final C2422de c2422de) {
        this.f19585o.b(new InterfaceC1965Yc() { // from class: com.google.android.gms.internal.ads.TM
            @Override // com.google.android.gms.internal.ads.InterfaceC1965Yc
            public final void a(C1409Ie c1409Ie) {
                c1409Ie.D(c2422de);
            }
        });
        this.f19585o.c(1104);
    }
}
