package j0;

import j0.e;
import java.util.HashSet;
import k0.C6087b;

/* loaded from: classes.dex */
public abstract class l extends j {

    /* renamed from: N0, reason: collision with root package name */
    private int f38085N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    private int f38086O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    private int f38087P0 = 0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f38088Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    private int f38089R0 = 0;

    /* renamed from: S0, reason: collision with root package name */
    private int f38090S0 = 0;

    /* renamed from: T0, reason: collision with root package name */
    private int f38091T0 = 0;

    /* renamed from: U0, reason: collision with root package name */
    private int f38092U0 = 0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f38093V0 = false;

    /* renamed from: W0, reason: collision with root package name */
    private int f38094W0 = 0;

    /* renamed from: X0, reason: collision with root package name */
    private int f38095X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    protected C6087b.a f38096Y0 = new C6087b.a();

    /* renamed from: Z0, reason: collision with root package name */
    C6087b.InterfaceC0283b f38097Z0 = null;

    public int A1() {
        return this.f38091T0;
    }

    public int B1() {
        return this.f38092U0;
    }

    public int C1() {
        return this.f38085N0;
    }

    public abstract void D1(int i8, int i9, int i10, int i11);

    protected void E1(e eVar, e.b bVar, int i8, e.b bVar2, int i9) {
        while (this.f38097Z0 == null && K() != null) {
            this.f38097Z0 = ((f) K()).K1();
        }
        C6087b.a aVar = this.f38096Y0;
        aVar.f38396a = bVar;
        aVar.f38397b = bVar2;
        aVar.f38398c = i8;
        aVar.f38399d = i9;
        this.f38097Z0.b(eVar, aVar);
        eVar.l1(this.f38096Y0.f38400e);
        eVar.M0(this.f38096Y0.f38401f);
        eVar.L0(this.f38096Y0.f38403h);
        eVar.B0(this.f38096Y0.f38402g);
    }

    protected boolean F1() {
        e eVar = this.f37943a0;
        C6087b.InterfaceC0283b K12 = eVar != null ? ((f) eVar).K1() : null;
        if (K12 == null) {
            return false;
        }
        for (int i8 = 0; i8 < this.f38083M0; i8++) {
            e eVar2 = this.f38082L0[i8];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b u7 = eVar2.u(0);
                e.b u8 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u7 != bVar || eVar2.f37986w == 1 || u8 != bVar || eVar2.f37988x == 1) {
                    if (u7 == bVar) {
                        u7 = e.b.WRAP_CONTENT;
                    }
                    if (u8 == bVar) {
                        u8 = e.b.WRAP_CONTENT;
                    }
                    C6087b.a aVar = this.f38096Y0;
                    aVar.f38396a = u7;
                    aVar.f38397b = u8;
                    aVar.f38398c = eVar2.W();
                    this.f38096Y0.f38399d = eVar2.x();
                    K12.b(eVar2, this.f38096Y0);
                    eVar2.l1(this.f38096Y0.f38400e);
                    eVar2.M0(this.f38096Y0.f38401f);
                    eVar2.B0(this.f38096Y0.f38402g);
                }
            }
        }
        return true;
    }

    public boolean G1() {
        return this.f38093V0;
    }

    protected void H1(boolean z7) {
        this.f38093V0 = z7;
    }

    public void I1(int i8, int i9) {
        this.f38094W0 = i8;
        this.f38095X0 = i9;
    }

    public void J1(int i8) {
        this.f38087P0 = i8;
        this.f38085N0 = i8;
        this.f38088Q0 = i8;
        this.f38086O0 = i8;
        this.f38089R0 = i8;
        this.f38090S0 = i8;
    }

    public void K1(int i8) {
        this.f38086O0 = i8;
    }

    public void L1(int i8) {
        this.f38090S0 = i8;
    }

    public void M1(int i8) {
        this.f38087P0 = i8;
        this.f38091T0 = i8;
    }

    public void N1(int i8) {
        this.f38088Q0 = i8;
        this.f38092U0 = i8;
    }

    public void O1(int i8) {
        this.f38089R0 = i8;
        this.f38091T0 = i8;
        this.f38092U0 = i8;
    }

    public void P1(int i8) {
        this.f38085N0 = i8;
    }

    @Override // j0.j, j0.i
    public void c(f fVar) {
        v1();
    }

    public void u1(boolean z7) {
        int i8 = this.f38089R0;
        if (i8 > 0 || this.f38090S0 > 0) {
            if (z7) {
                this.f38091T0 = this.f38090S0;
                this.f38092U0 = i8;
            } else {
                this.f38091T0 = i8;
                this.f38092U0 = this.f38090S0;
            }
        }
    }

    public void v1() {
        for (int i8 = 0; i8 < this.f38083M0; i8++) {
            e eVar = this.f38082L0[i8];
            if (eVar != null) {
                eVar.V0(true);
            }
        }
    }

    public boolean w1(HashSet hashSet) {
        for (int i8 = 0; i8 < this.f38083M0; i8++) {
            if (hashSet.contains(this.f38082L0[i8])) {
                return true;
            }
        }
        return false;
    }

    public int x1() {
        return this.f38095X0;
    }

    public int y1() {
        return this.f38094W0;
    }

    public int z1() {
        return this.f38086O0;
    }
}
