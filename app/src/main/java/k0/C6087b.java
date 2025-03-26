package k0;

import j0.d;
import j0.e;
import java.util.ArrayList;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6087b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f38390a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private a f38391b = new a();

    /* renamed from: c, reason: collision with root package name */
    private j0.f f38392c;

    /* renamed from: k0.b$a */
    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f38393k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f38394l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f38395m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f38396a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f38397b;

        /* renamed from: c, reason: collision with root package name */
        public int f38398c;

        /* renamed from: d, reason: collision with root package name */
        public int f38399d;

        /* renamed from: e, reason: collision with root package name */
        public int f38400e;

        /* renamed from: f, reason: collision with root package name */
        public int f38401f;

        /* renamed from: g, reason: collision with root package name */
        public int f38402g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f38403h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f38404i;

        /* renamed from: j, reason: collision with root package name */
        public int f38405j;
    }

    /* renamed from: k0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0283b {
        void a();

        void b(j0.e eVar, a aVar);
    }

    public C6087b(j0.f fVar) {
        this.f38392c = fVar;
    }

    private boolean a(InterfaceC0283b interfaceC0283b, j0.e eVar, int i8) {
        this.f38391b.f38396a = eVar.A();
        this.f38391b.f38397b = eVar.T();
        this.f38391b.f38398c = eVar.W();
        this.f38391b.f38399d = eVar.x();
        a aVar = this.f38391b;
        aVar.f38404i = false;
        aVar.f38405j = i8;
        e.b bVar = aVar.f38396a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar == bVar2;
        boolean z8 = aVar.f38397b == bVar2;
        boolean z9 = z7 && eVar.f37949d0 > 0.0f;
        boolean z10 = z8 && eVar.f37949d0 > 0.0f;
        if (z9 && eVar.f37990y[0] == 4) {
            aVar.f38396a = e.b.FIXED;
        }
        if (z10 && eVar.f37990y[1] == 4) {
            aVar.f38397b = e.b.FIXED;
        }
        interfaceC0283b.b(eVar, aVar);
        eVar.l1(this.f38391b.f38400e);
        eVar.M0(this.f38391b.f38401f);
        eVar.L0(this.f38391b.f38403h);
        eVar.B0(this.f38391b.f38402g);
        a aVar2 = this.f38391b;
        aVar2.f38405j = a.f38393k;
        return aVar2.f38404i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(j0.f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.f38098L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.V1(r1)
            k0.b$b r2 = r13.K1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList r5 = r13.f38098L0
            java.lang.Object r5 = r5.get(r4)
            j0.e r5 = (j0.e) r5
            boolean r6 = r5 instanceof j0.h
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof j0.C6049a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.l0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            k0.l r6 = r5.f37950e
            if (r6 == 0) goto L47
            k0.n r7 = r5.f37952f
            if (r7 == 0) goto L47
            k0.g r6 = r6.f38473e
            boolean r6 = r6.f38426j
            if (r6 == 0) goto L47
            k0.g r6 = r7.f38473e
            boolean r6 = r6.f38426j
            if (r6 == 0) goto L47
            goto La0
        L47:
            j0.e$b r6 = r5.u(r3)
            r7 = 1
            j0.e$b r8 = r5.u(r7)
            j0.e$b r9 = j0.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f37986w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f37988x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.V1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof j0.l
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f37986w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.i0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f37988x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.i0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f37949d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = k0.C6087b.a.f38393k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C6087b.b(j0.f):void");
    }

    private void c(j0.f fVar, String str, int i8, int i9, int i10) {
        fVar.getClass();
        int I7 = fVar.I();
        int H7 = fVar.H();
        fVar.b1(0);
        fVar.a1(0);
        fVar.l1(i9);
        fVar.M0(i10);
        fVar.b1(I7);
        fVar.a1(H7);
        this.f38392c.Z1(i8);
        this.f38392c.t1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    public long d(j0.f fVar, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z7;
        boolean z8;
        int i17;
        j0.f fVar2;
        int i18;
        boolean z9;
        boolean z10;
        int i19;
        int i20;
        boolean z11;
        int i21;
        C6087b c6087b = this;
        InterfaceC0283b K12 = fVar.K1();
        int size = fVar.f38098L0.size();
        int W7 = fVar.W();
        int x7 = fVar.x();
        boolean b8 = j0.k.b(i8, 128);
        int i22 = 1;
        boolean z12 = b8 || j0.k.b(i8, 64);
        if (z12) {
            for (int i23 = 0; i23 < size; i23++) {
                j0.e eVar = (j0.e) fVar.f38098L0.get(i23);
                e.b A7 = eVar.A();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z13 = (A7 == bVar) && (eVar.T() == bVar) && eVar.v() > 0.0f;
                if ((eVar.i0() && z13) || ((eVar.k0() && z13) || (eVar instanceof j0.l) || eVar.i0() || eVar.k0())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12) {
            boolean z14 = g0.d.f35921s;
        }
        boolean z15 = z12 & ((i11 == 1073741824 && i13 == 1073741824) || b8);
        int i24 = 2;
        if (z15) {
            int min = Math.min(fVar.G(), i12);
            int min2 = Math.min(fVar.F(), i14);
            if (i11 == 1073741824 && fVar.W() != min) {
                fVar.l1(min);
                fVar.O1();
            }
            if (i13 == 1073741824 && fVar.x() != min2) {
                fVar.M0(min2);
                fVar.O1();
            }
            if (i11 == 1073741824 && i13 == 1073741824) {
                z8 = fVar.G1(b8);
                i17 = 2;
                z7 = false;
            } else {
                boolean H12 = fVar.H1(b8);
                z7 = false;
                if (i11 == 1073741824) {
                    H12 &= fVar.I1(b8, 0);
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                if (i13 == 1073741824) {
                    z8 = fVar.I1(b8, 1) & H12;
                    i17++;
                } else {
                    z8 = H12;
                }
            }
            if (z8) {
                fVar.q1(i11 == 1073741824 ? true : z7, i13 == 1073741824 ? true : z7);
            }
        } else {
            z7 = false;
            z8 = false;
            i17 = 0;
        }
        if (z8 && i17 == 2) {
            return 0L;
        }
        int L12 = fVar.L1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = c6087b.f38390a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, W7, x7);
        }
        if (size2 > 0) {
            e.b A8 = fVar.A();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z16 = A8 == bVar2 ? true : z7;
            boolean z17 = fVar.T() == bVar2 ? true : z7;
            int max = Math.max(fVar.W(), c6087b.f38392c.I());
            int max2 = Math.max(fVar.x(), c6087b.f38392c.H());
            boolean z18 = z7;
            boolean z19 = z18;
            ?? r15 = z18;
            while (r15 < size2) {
                j0.e eVar2 = (j0.e) c6087b.f38390a.get(r15);
                if (eVar2 instanceof j0.l) {
                    int W8 = eVar2.W();
                    int x8 = eVar2.x();
                    boolean a8 = z19 | c6087b.a(K12, eVar2, a.f38394l);
                    int W9 = eVar2.W();
                    i20 = L12;
                    int x9 = eVar2.x();
                    if (W9 != W8) {
                        eVar2.l1(W9);
                        if (z16 && eVar2.M() > max) {
                            max = Math.max(max, eVar2.M() + eVar2.o(d.a.RIGHT).f());
                        }
                        z11 = true;
                    } else {
                        z11 = a8;
                    }
                    if (x9 != x8) {
                        eVar2.M0(x9);
                        if (z17 && eVar2.r() > max2) {
                            max2 = Math.max(max2, eVar2.r() + eVar2.o(d.a.BOTTOM).f());
                        }
                        z11 = true;
                    }
                    z19 = z11 | ((j0.l) eVar2).G1();
                    i21 = 1;
                } else {
                    i20 = L12;
                    i21 = i22;
                }
                L12 = i20;
                i22 = i21;
                i24 = 2;
                r15 += i21;
            }
            int i25 = L12;
            int i26 = i24;
            int i27 = 0;
            while (i27 < i26) {
                int i28 = 0;
                while (i28 < size2) {
                    j0.e eVar3 = (j0.e) c6087b.f38390a.get(i28);
                    if (((eVar3 instanceof j0.i) && !(eVar3 instanceof j0.l)) || (eVar3 instanceof j0.h) || eVar3.V() == 8 || ((z15 && eVar3.f37950e.f38473e.f38426j && eVar3.f37952f.f38473e.f38426j) || (eVar3 instanceof j0.l))) {
                        z9 = z15;
                    } else {
                        int W10 = eVar3.W();
                        int x10 = eVar3.x();
                        int p8 = eVar3.p();
                        int i29 = a.f38394l;
                        z9 = z15;
                        if (i27 == 1) {
                            i29 = a.f38395m;
                        }
                        boolean a9 = z19 | c6087b.a(K12, eVar3, i29);
                        int W11 = eVar3.W();
                        int x11 = eVar3.x();
                        if (W11 != W10) {
                            eVar3.l1(W11);
                            if (z16 && eVar3.M() > max) {
                                max = Math.max(max, eVar3.M() + eVar3.o(d.a.RIGHT).f());
                            }
                            z10 = true;
                        } else {
                            z10 = a9;
                        }
                        if (x11 != x10) {
                            eVar3.M0(x11);
                            if (z17 && eVar3.r() > max2) {
                                max2 = Math.max(max2, eVar3.r() + eVar3.o(d.a.BOTTOM).f());
                            }
                            z10 = true;
                        }
                        if (!eVar3.Z() || p8 == eVar3.p()) {
                            z19 = z10;
                        } else {
                            i19 = 1;
                            z19 = true;
                            i28 += i19;
                            c6087b = this;
                            z15 = z9;
                        }
                    }
                    i19 = 1;
                    i28 += i19;
                    c6087b = this;
                    z15 = z9;
                }
                boolean z20 = z15;
                if (!z19) {
                    break;
                }
                i27++;
                c(fVar, "intermediate pass", i27, W7, x7);
                i26 = 2;
                z19 = false;
                c6087b = this;
                z15 = z20;
            }
            fVar2 = fVar;
            i18 = i25;
        } else {
            fVar2 = fVar;
            i18 = L12;
        }
        fVar2.Y1(i18);
        return 0L;
    }

    public void e(j0.f fVar) {
        this.f38390a.clear();
        int size = fVar.f38098L0.size();
        for (int i8 = 0; i8 < size; i8++) {
            j0.e eVar = (j0.e) fVar.f38098L0.get(i8);
            e.b A7 = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (A7 == bVar || eVar.T() == bVar) {
                this.f38390a.add(eVar);
            }
        }
        fVar.O1();
    }
}
