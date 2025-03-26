package j0;

import j0.e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import k0.C6087b;
import k0.C6090e;

/* loaded from: classes.dex */
public class f extends m {

    /* renamed from: O0, reason: collision with root package name */
    private int f38002O0;

    /* renamed from: S0, reason: collision with root package name */
    int f38006S0;

    /* renamed from: T0, reason: collision with root package name */
    int f38007T0;

    /* renamed from: U0, reason: collision with root package name */
    int f38008U0;

    /* renamed from: V0, reason: collision with root package name */
    int f38009V0;

    /* renamed from: M0, reason: collision with root package name */
    C6087b f38000M0 = new C6087b(this);

    /* renamed from: N0, reason: collision with root package name */
    public C6090e f38001N0 = new C6090e(this);

    /* renamed from: P0, reason: collision with root package name */
    protected C6087b.InterfaceC0283b f38003P0 = null;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f38004Q0 = false;

    /* renamed from: R0, reason: collision with root package name */
    protected g0.d f38005R0 = new g0.d();

    /* renamed from: W0, reason: collision with root package name */
    public int f38010W0 = 0;

    /* renamed from: X0, reason: collision with root package name */
    public int f38011X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    c[] f38012Y0 = new c[4];

    /* renamed from: Z0, reason: collision with root package name */
    c[] f38013Z0 = new c[4];

    /* renamed from: a1, reason: collision with root package name */
    public boolean f38014a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f38015b1 = false;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f38016c1 = false;

    /* renamed from: d1, reason: collision with root package name */
    public int f38017d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    public int f38018e1 = 0;

    /* renamed from: f1, reason: collision with root package name */
    private int f38019f1 = 257;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f38020g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f38021h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    private boolean f38022i1 = false;

    /* renamed from: j1, reason: collision with root package name */
    int f38023j1 = 0;

    /* renamed from: k1, reason: collision with root package name */
    private WeakReference f38024k1 = null;

    /* renamed from: l1, reason: collision with root package name */
    private WeakReference f38025l1 = null;

    /* renamed from: m1, reason: collision with root package name */
    private WeakReference f38026m1 = null;

    /* renamed from: n1, reason: collision with root package name */
    private WeakReference f38027n1 = null;

    /* renamed from: o1, reason: collision with root package name */
    HashSet f38028o1 = new HashSet();

    /* renamed from: p1, reason: collision with root package name */
    public C6087b.a f38029p1 = new C6087b.a();

    private void B1(d dVar, g0.i iVar) {
        this.f38005R0.h(iVar, this.f38005R0.q(dVar), 0, 5);
    }

    private void C1(d dVar, g0.i iVar) {
        this.f38005R0.h(this.f38005R0.q(dVar), iVar, 0, 5);
    }

    private void D1(e eVar) {
        int i8 = this.f38011X0 + 1;
        c[] cVarArr = this.f38012Y0;
        if (i8 >= cVarArr.length) {
            this.f38012Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f38012Y0[this.f38011X0] = new c(eVar, 1, R1());
        this.f38011X0++;
    }

    public static boolean U1(int i8, e eVar, C6087b.InterfaceC0283b interfaceC0283b, C6087b.a aVar, int i9) {
        int i10;
        int i11;
        if (interfaceC0283b == null) {
            return false;
        }
        if (eVar.V() == 8 || (eVar instanceof h) || (eVar instanceof C6049a)) {
            aVar.f38400e = 0;
            aVar.f38401f = 0;
            return false;
        }
        aVar.f38396a = eVar.A();
        aVar.f38397b = eVar.T();
        aVar.f38398c = eVar.W();
        aVar.f38399d = eVar.x();
        aVar.f38404i = false;
        aVar.f38405j = i9;
        e.b bVar = aVar.f38396a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar == bVar2;
        boolean z8 = aVar.f38397b == bVar2;
        boolean z9 = z7 && eVar.f37949d0 > 0.0f;
        boolean z10 = z8 && eVar.f37949d0 > 0.0f;
        if (z7 && eVar.a0(0) && eVar.f37986w == 0 && !z9) {
            aVar.f38396a = e.b.WRAP_CONTENT;
            if (z8 && eVar.f37988x == 0) {
                aVar.f38396a = e.b.FIXED;
            }
            z7 = false;
        }
        if (z8 && eVar.a0(1) && eVar.f37988x == 0 && !z10) {
            aVar.f38397b = e.b.WRAP_CONTENT;
            if (z7 && eVar.f37986w == 0) {
                aVar.f38397b = e.b.FIXED;
            }
            z8 = false;
        }
        if (eVar.n0()) {
            aVar.f38396a = e.b.FIXED;
            z7 = false;
        }
        if (eVar.o0()) {
            aVar.f38397b = e.b.FIXED;
            z8 = false;
        }
        if (z9) {
            if (eVar.f37990y[0] == 4) {
                aVar.f38396a = e.b.FIXED;
            } else if (!z8) {
                e.b bVar3 = aVar.f38397b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i11 = aVar.f38399d;
                } else {
                    aVar.f38396a = e.b.WRAP_CONTENT;
                    interfaceC0283b.b(eVar, aVar);
                    i11 = aVar.f38401f;
                }
                aVar.f38396a = bVar4;
                aVar.f38398c = (int) (eVar.v() * i11);
            }
        }
        if (z10) {
            if (eVar.f37990y[1] == 4) {
                aVar.f38397b = e.b.FIXED;
            } else if (!z7) {
                e.b bVar5 = aVar.f38396a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i10 = aVar.f38398c;
                } else {
                    aVar.f38397b = e.b.WRAP_CONTENT;
                    interfaceC0283b.b(eVar, aVar);
                    i10 = aVar.f38400e;
                }
                aVar.f38397b = bVar6;
                if (eVar.w() == -1) {
                    aVar.f38399d = (int) (i10 / eVar.v());
                } else {
                    aVar.f38399d = (int) (eVar.v() * i10);
                }
            }
        }
        interfaceC0283b.b(eVar, aVar);
        eVar.l1(aVar.f38400e);
        eVar.M0(aVar.f38401f);
        eVar.L0(aVar.f38403h);
        eVar.B0(aVar.f38402g);
        aVar.f38405j = C6087b.a.f38393k;
        return aVar.f38404i;
    }

    private void W1() {
        this.f38010W0 = 0;
        this.f38011X0 = 0;
    }

    private void y1(e eVar) {
        int i8 = this.f38010W0 + 1;
        c[] cVarArr = this.f38013Z0;
        if (i8 >= cVarArr.length) {
            this.f38013Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f38013Z0[this.f38010W0] = new c(eVar, 0, R1());
        this.f38010W0++;
    }

    public void A1(d dVar) {
        WeakReference weakReference = this.f38025l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f38025l1.get()).e()) {
            this.f38025l1 = new WeakReference(dVar);
        }
    }

    void E1(d dVar) {
        WeakReference weakReference = this.f38026m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f38026m1.get()).e()) {
            this.f38026m1 = new WeakReference(dVar);
        }
    }

    void F1(d dVar) {
        WeakReference weakReference = this.f38024k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f38024k1.get()).e()) {
            this.f38024k1 = new WeakReference(dVar);
        }
    }

    public boolean G1(boolean z7) {
        return this.f38001N0.f(z7);
    }

    public boolean H1(boolean z7) {
        return this.f38001N0.g(z7);
    }

    public boolean I1(boolean z7, int i8) {
        return this.f38001N0.h(z7, i8);
    }

    public void J1(g0.e eVar) {
        this.f38005R0.v(eVar);
    }

    public C6087b.InterfaceC0283b K1() {
        return this.f38003P0;
    }

    public int L1() {
        return this.f38019f1;
    }

    public g0.d M1() {
        return this.f38005R0;
    }

    public boolean N1() {
        return false;
    }

    @Override // j0.e
    public void O(StringBuilder sb) {
        sb.append(this.f37970o + ":{\n");
        sb.append("  actualWidth:" + this.f37945b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f37947c0);
        sb.append("\n");
        Iterator it = s1().iterator();
        while (it.hasNext()) {
            ((e) it.next()).O(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public void O1() {
        this.f38001N0.j();
    }

    public void P1() {
        this.f38001N0.k();
    }

    public boolean Q1() {
        return this.f38022i1;
    }

    public boolean R1() {
        return this.f38004Q0;
    }

    public boolean S1() {
        return this.f38021h1;
    }

    public long T1(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f38006S0 = i15;
        this.f38007T0 = i16;
        return this.f38000M0.d(this, i8, i15, i16, i9, i10, i11, i12, i13, i14);
    }

    public boolean V1(int i8) {
        return (this.f38019f1 & i8) == i8;
    }

    public void X1(C6087b.InterfaceC0283b interfaceC0283b) {
        this.f38003P0 = interfaceC0283b;
        this.f38001N0.n(interfaceC0283b);
    }

    public void Y1(int i8) {
        this.f38019f1 = i8;
        g0.d.f35921s = V1(512);
    }

    public void Z1(int i8) {
        this.f38002O0 = i8;
    }

    public void a2(boolean z7) {
        this.f38004Q0 = z7;
    }

    public boolean b2(g0.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean V12 = V1(64);
        r1(dVar, V12);
        int size = this.f38098L0.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = (e) this.f38098L0.get(i8);
            eVar.r1(dVar, V12);
            if (eVar.c0()) {
                z7 = true;
            }
        }
        return z7;
    }

    public void c2() {
        this.f38000M0.e(this);
    }

    @Override // j0.e
    public void q1(boolean z7, boolean z8) {
        super.q1(z7, z8);
        int size = this.f38098L0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((e) this.f38098L0.get(i8)).q1(z7, z8);
        }
    }

    @Override // j0.m, j0.e
    public void t0() {
        this.f38005R0.E();
        this.f38006S0 = 0;
        this.f38008U0 = 0;
        this.f38007T0 = 0;
        this.f38009V0 = 0;
        this.f38020g1 = false;
        super.t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0307 A[PHI: r2 r16
  0x0307: PHI (r2v15 boolean) = (r2v14 boolean), (r2v19 boolean), (r2v19 boolean), (r2v19 boolean) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]
  0x0307: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // j0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t1() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.f.t1():void");
    }

    void w1(e eVar, int i8) {
        if (i8 == 0) {
            y1(eVar);
        } else if (i8 == 1) {
            D1(eVar);
        }
    }

    public boolean x1(g0.d dVar) {
        boolean V12 = V1(64);
        g(dVar, V12);
        int size = this.f38098L0.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = (e) this.f38098L0.get(i8);
            eVar.T0(0, false);
            eVar.T0(1, false);
            if (eVar instanceof C6049a) {
                z7 = true;
            }
        }
        if (z7) {
            for (int i9 = 0; i9 < size; i9++) {
                e eVar2 = (e) this.f38098L0.get(i9);
                if (eVar2 instanceof C6049a) {
                    ((C6049a) eVar2).z1();
                }
            }
        }
        this.f38028o1.clear();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar3 = (e) this.f38098L0.get(i10);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.f38028o1.add(eVar3);
                } else {
                    eVar3.g(dVar, V12);
                }
            }
        }
        while (this.f38028o1.size() > 0) {
            int size2 = this.f38028o1.size();
            Iterator it = this.f38028o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) ((e) it.next());
                if (lVar.w1(this.f38028o1)) {
                    lVar.g(dVar, V12);
                    this.f38028o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f38028o1.size()) {
                Iterator it2 = this.f38028o1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).g(dVar, V12);
                }
                this.f38028o1.clear();
            }
        }
        if (g0.d.f35921s) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar4 = (e) this.f38098L0.get(i11);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                k.a(this, dVar, eVar5);
                eVar5.g(dVar, V12);
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar6 = (e) this.f38098L0.get(i12);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.f37941Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.Q0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.h1(e.b.FIXED);
                    }
                    eVar6.g(dVar, V12);
                    if (bVar == bVar3) {
                        eVar6.Q0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.h1(bVar2);
                    }
                } else {
                    k.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, V12);
                    }
                }
            }
        }
        if (this.f38010W0 > 0) {
            AbstractC6050b.b(this, dVar, null, 0);
        }
        if (this.f38011X0 > 0) {
            AbstractC6050b.b(this, dVar, null, 1);
        }
        return true;
    }

    public void z1(d dVar) {
        WeakReference weakReference = this.f38027n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f38027n1.get()).e()) {
            this.f38027n1 = new WeakReference(dVar);
        }
    }
}
