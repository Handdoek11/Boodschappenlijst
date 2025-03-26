package Q;

import B.e;
import J6.AbstractC0650j;
import c0.InterfaceC0973e;
import java.util.LinkedHashMap;
import java.util.Map;
import u.C6807b;
import x6.C6916E;

/* loaded from: classes.dex */
public abstract class B extends v implements O.k, O.e {

    /* renamed from: B, reason: collision with root package name */
    public static final e f4447B = new e(null);

    /* renamed from: C, reason: collision with root package name */
    private static final I6.l f4448C = d.f4475o;

    /* renamed from: D, reason: collision with root package name */
    private static final I6.l f4449D = c.f4474o;

    /* renamed from: E, reason: collision with root package name */
    private static final G.s f4450E = new G.s();

    /* renamed from: F, reason: collision with root package name */
    private static final C0690l f4451F = new C0690l();

    /* renamed from: G, reason: collision with root package name */
    private static final float[] f4452G = G.m.b(null, 1, null);

    /* renamed from: H, reason: collision with root package name */
    private static final f f4453H = new a();

    /* renamed from: I, reason: collision with root package name */
    private static final f f4454I = new b();

    /* renamed from: A, reason: collision with root package name */
    private F f4455A;

    /* renamed from: i, reason: collision with root package name */
    private final p f4456i;

    /* renamed from: j, reason: collision with root package name */
    private B f4457j;

    /* renamed from: k, reason: collision with root package name */
    private B f4458k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4459l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4460m;

    /* renamed from: n, reason: collision with root package name */
    private I6.l f4461n;

    /* renamed from: r, reason: collision with root package name */
    private O.m f4465r;

    /* renamed from: s, reason: collision with root package name */
    private Map f4466s;

    /* renamed from: u, reason: collision with root package name */
    private float f4468u;

    /* renamed from: v, reason: collision with root package name */
    private F.b f4469v;

    /* renamed from: w, reason: collision with root package name */
    private C0690l f4470w;

    /* renamed from: z, reason: collision with root package name */
    private boolean f4473z;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC0973e f4462o = p0().k();

    /* renamed from: p, reason: collision with root package name */
    private c0.q f4463p = p0().getLayoutDirection();

    /* renamed from: q, reason: collision with root package name */
    private float f4464q = 0.8f;

    /* renamed from: t, reason: collision with root package name */
    private long f4467t = c0.m.f12088b.a();

    /* renamed from: x, reason: collision with root package name */
    private final I6.l f4471x = new g();

    /* renamed from: y, reason: collision with root package name */
    private final I6.a f4472y = new j();

    public static final class a implements f {
        a() {
        }

        @Override // Q.B.f
        public boolean a(p pVar) {
            return true;
        }

        @Override // Q.B.f
        public int b() {
            return D.a(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [B.e$c] */
        /* JADX WARN: Type inference failed for: r10v1, types: [B.e$c] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [B.e$c] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [u.b] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [u.b] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // Q.B.f
        public boolean c(e.c cVar) {
            int a8 = D.a(16);
            ?? r32 = 0;
            while (cVar != 0) {
                if (cVar instanceof J) {
                    if (((J) cVar).d()) {
                        return true;
                    }
                } else if ((cVar.m() & a8) != 0 && (cVar instanceof AbstractC0683e)) {
                    e.c r8 = cVar.r();
                    int i8 = 0;
                    r32 = r32;
                    cVar = cVar;
                    while (r8 != null) {
                        if ((r8.m() & a8) != 0) {
                            i8++;
                            r32 = r32;
                            if (i8 == 1) {
                                cVar = r8;
                            } else {
                                if (r32 == 0) {
                                    r32 = new C6807b(new e.c[16], 0);
                                }
                                if (cVar != 0) {
                                    r32.c(cVar);
                                    cVar = 0;
                                }
                                r32.c(r8);
                            }
                        }
                        r8 = r8.k();
                        r32 = r32;
                        cVar = cVar;
                    }
                    if (i8 == 1) {
                    }
                }
                cVar = AbstractC0682d.c(r32);
            }
            return false;
        }

        @Override // Q.B.f
        public void d(p pVar, long j8, C0686h c0686h, boolean z7, boolean z8) {
            pVar.L(j8, c0686h, z7, z8);
        }
    }

    public static final class b implements f {
        b() {
        }

        @Override // Q.B.f
        public boolean a(p pVar) {
            S.e j8 = pVar.j();
            boolean z7 = false;
            if (j8 != null && j8.o()) {
                z7 = true;
            }
            return !z7;
        }

        @Override // Q.B.f
        public int b() {
            return D.a(8);
        }

        @Override // Q.B.f
        public boolean c(e.c cVar) {
            return false;
        }

        @Override // Q.B.f
        public void d(p pVar, long j8, C0686h c0686h, boolean z7, boolean z8) {
            pVar.M(j8, c0686h, z7, z8);
        }
    }

    static final class c extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final c f4474o = new c();

        c() {
            super(1);
        }

        public final void b(B b8) {
            F o02 = b8.o0();
            if (o02 != null) {
                o02.invalidate();
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((B) obj);
            return C6916E.f44463a;
        }
    }

    static final class d extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final d f4475o = new d();

        d() {
            super(1);
        }

        public final void b(B b8) {
            if (b8.K0()) {
                C0690l c0690l = b8.f4470w;
                if (c0690l == null) {
                    B.f1(b8, false, 1, null);
                    return;
                }
                B.f4451F.a(c0690l);
                B.f1(b8, false, 1, null);
                if (B.f4451F.b(c0690l)) {
                    return;
                }
                p p02 = b8.p0();
                t p8 = p02.p();
                if (p8.k() > 0) {
                    if (p8.l() || p8.m()) {
                        p.c0(p02, false, 1, null);
                    }
                    p8.v().V();
                }
                H D7 = p02.D();
                if (D7 != null) {
                    D7.b(p02);
                }
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((B) obj);
            return C6916E.f44463a;
        }
    }

    public static final class e {
        public /* synthetic */ e(AbstractC0650j abstractC0650j) {
            this();
        }

        public final f a() {
            return B.f4453H;
        }

        public final f b() {
            return B.f4454I;
        }

        private e() {
        }
    }

    public interface f {
        boolean a(p pVar);

        int b();

        boolean c(e.c cVar);

        void d(p pVar, long j8, C0686h c0686h, boolean z7, boolean z8);
    }

    static final class g extends J6.s implements I6.l {

        static final class a extends J6.s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ B f4477o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ G.e f4478s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B b8, G.e eVar) {
                super(0);
                this.f4477o = b8;
            }

            @Override // I6.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m0invoke();
                return C6916E.f44463a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m0invoke() {
                this.f4477o.h0(this.f4478s);
            }
        }

        g() {
            super(1);
        }

        public final void b(G.e eVar) {
            if (!B.this.p0().S()) {
                B.this.f4473z = true;
                return;
            }
            B.T(B.this);
            I6.l unused = B.f4449D;
            new a(B.this, eVar);
            throw null;
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((G.e) obj);
            return C6916E.f44463a;
        }
    }

    static final class h extends J6.s implements I6.a {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ e.c f4480s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ f f4481t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f4482u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ C0686h f4483v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f4484w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f4485x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(e.c cVar, f fVar, long j8, C0686h c0686h, boolean z7, boolean z8) {
            super(0);
            this.f4480s = cVar;
            this.f4481t = fVar;
            this.f4482u = j8;
            this.f4483v = c0686h;
            this.f4484w = z7;
            this.f4485x = z8;
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            B.this.D0(C.b(this.f4480s, this.f4481t.b(), D.a(2)), this.f4481t, this.f4482u, this.f4483v, this.f4484w, this.f4485x);
        }
    }

    static final class i extends J6.s implements I6.a {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ e.c f4487s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ f f4488t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f4489u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ C0686h f4490v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f4491w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f4492x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ float f4493y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(e.c cVar, f fVar, long j8, C0686h c0686h, boolean z7, boolean z8, float f8) {
            super(0);
            this.f4487s = cVar;
            this.f4488t = fVar;
            this.f4489u = j8;
            this.f4490v = c0686h;
            this.f4491w = z7;
            this.f4492x = z8;
            this.f4493y = f8;
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            B.this.E0(C.b(this.f4487s, this.f4488t.b(), D.a(2)), this.f4488t, this.f4489u, this.f4490v, this.f4491w, this.f4492x, this.f4493y);
        }
    }

    static final class j extends J6.s implements I6.a {
        j() {
            super(0);
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3invoke() {
            B y02 = B.this.y0();
            if (y02 != null) {
                y02.H0();
            }
        }
    }

    static final class k extends J6.s implements I6.a {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ e.c f4496s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ f f4497t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f4498u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ C0686h f4499v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f4500w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f4501x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ float f4502y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(e.c cVar, f fVar, long j8, C0686h c0686h, boolean z7, boolean z8, float f8) {
            super(0);
            this.f4496s = cVar;
            this.f4497t = fVar;
            this.f4498u = j8;
            this.f4499v = c0686h;
            this.f4500w = z7;
            this.f4501x = z8;
            this.f4502y = f8;
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4invoke() {
            B.this.Z0(C.b(this.f4496s, this.f4497t.b(), D.a(2)), this.f4497t, this.f4498u, this.f4499v, this.f4500w, this.f4501x, this.f4502y);
        }
    }

    static final class l extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ I6.l f4503o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(I6.l lVar) {
            super(0);
            this.f4503o = lVar;
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            this.f4503o.invoke(B.f4450E);
        }
    }

    public B(p pVar) {
        this.f4456i = pVar;
    }

    private final boolean A0(int i8) {
        e.c C02 = C0(E.a(i8));
        return C02 != null && AbstractC0682d.b(C02, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.c C0(boolean z7) {
        e.c w02;
        if (p0().C() == this) {
            return p0().B().c();
        }
        if (z7) {
            B b8 = this.f4458k;
            if (b8 != null && (w02 = b8.w0()) != null) {
                return w02.k();
            }
        } else {
            B b9 = this.f4458k;
            if (b9 != null) {
                return b9.w0();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(e.c cVar, f fVar, long j8, C0686h c0686h, boolean z7, boolean z8) {
        if (cVar == null) {
            G0(fVar, j8, c0686h, z7, z8);
        } else {
            c0686h.t(cVar, z8, new h(cVar, fVar, j8, c0686h, z7, z8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(e.c cVar, f fVar, long j8, C0686h c0686h, boolean z7, boolean z8, float f8) {
        if (cVar == null) {
            G0(fVar, j8, c0686h, z7, z8);
        } else {
            c0686h.v(cVar, f8, z8, new i(cVar, fVar, j8, c0686h, z7, z8, f8));
        }
    }

    private final long M0(long j8) {
        float f8 = F.d.f(j8);
        float max = Math.max(0.0f, f8 < 0.0f ? -f8 : f8 - y());
        float g8 = F.d.g(j8);
        return F.e.a(max, Math.max(0.0f, g8 < 0.0f ? -g8 : g8 - w()));
    }

    private final void S0(long j8, float f8, I6.l lVar) {
        d1(this, lVar, false, 2, null);
        if (!c0.m.e(t0(), j8)) {
            X0(j8);
            p0().p().v().V();
            F f9 = this.f4455A;
            if (f9 != null) {
                f9.f(j8);
            } else {
                B b8 = this.f4458k;
                if (b8 != null) {
                    b8.H0();
                }
            }
            J(this);
            H D7 = p0().D();
            if (D7 != null) {
                D7.j(p0());
            }
        }
        this.f4468u = f8;
    }

    public static final /* synthetic */ I T(B b8) {
        b8.v0();
        return null;
    }

    public static /* synthetic */ void V0(B b8, F.b bVar, boolean z7, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        b8.U0(bVar, z7, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z0(e.c cVar, f fVar, long j8, C0686h c0686h, boolean z7, boolean z8, float f8) {
        if (cVar == null) {
            G0(fVar, j8, c0686h, z7, z8);
        } else if (fVar.c(cVar)) {
            c0686h.F(cVar, f8, z8, new k(cVar, fVar, j8, c0686h, z7, z8, f8));
        } else {
            Z0(C.b(cVar, fVar.b(), D.a(2)), fVar, j8, c0686h, z7, z8, f8);
        }
    }

    private final B a1(O.e eVar) {
        B a8;
        O.i iVar = eVar instanceof O.i ? (O.i) eVar : null;
        if (iVar != null && (a8 = iVar.a()) != null) {
            return a8;
        }
        J6.r.c(eVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (B) eVar;
    }

    private final void b0(B b8, F.b bVar, boolean z7) {
        if (b8 == this) {
            return;
        }
        B b9 = this.f4458k;
        if (b9 != null) {
            b9.b0(b8, bVar, z7);
        }
        k0(bVar, z7);
    }

    private final long c0(B b8, long j8) {
        if (b8 == this) {
            return j8;
        }
        B b9 = this.f4458k;
        return (b9 == null || J6.r.a(b8, b9)) ? j0(j8) : j0(b9.c0(b8, j8));
    }

    public static /* synthetic */ void d1(B b8, I6.l lVar, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        b8.c1(lVar, z7);
    }

    private final void e1(boolean z7) {
        if (this.f4455A == null) {
            if (this.f4461n != null) {
                throw new IllegalStateException("null layer with a non-null layerBlock");
            }
            return;
        }
        I6.l lVar = this.f4461n;
        if (lVar == null) {
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock");
        }
        G.s sVar = f4450E;
        sVar.a();
        sVar.h(p0().k());
        sVar.s(c0.p.b(h()));
        v0();
        new l(lVar);
        throw null;
    }

    static /* synthetic */ void f1(B b8, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        b8.e1(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(G.e eVar) {
        if (B0(D.a(4)) == null) {
            R0(eVar);
        } else {
            p0().w();
            c0.p.b(h());
            throw null;
        }
    }

    private final void k0(F.b bVar, boolean z7) {
        float f8 = c0.m.f(t0());
        bVar.h(bVar.b() - f8);
        bVar.i(bVar.c() - f8);
        float g8 = c0.m.g(t0());
        bVar.j(bVar.d() - g8);
        bVar.g(bVar.a() - g8);
        F f9 = this.f4455A;
        if (f9 != null) {
            f9.a(bVar, true);
            if (this.f4460m && z7) {
                bVar.e(0.0f, 0.0f, c0.o.e(h()), c0.o.d(h()));
                bVar.f();
            }
        }
    }

    private final I v0() {
        s.b(p0()).getSnapshotObserver();
        return null;
    }

    public final e.c B0(int i8) {
        boolean a8 = E.a(i8);
        e.c w02 = w0();
        if (!a8 && (w02 = w02.n()) == null) {
            return null;
        }
        for (e.c C02 = C0(a8); C02 != null && (C02.j() & i8) != 0; C02 = C02.k()) {
            if ((C02.m() & i8) != 0) {
                return C02;
            }
            if (C02 == w02) {
                return null;
            }
        }
        return null;
    }

    @Override // O.p
    protected void C(long j8, float f8, I6.l lVar) {
        S0(j8, f8, lVar);
    }

    public final void F0(f fVar, long j8, C0686h c0686h, boolean z7, boolean z8) {
        e.c B02 = B0(fVar.b());
        if (!g1(j8)) {
            if (z7) {
                float e02 = e0(j8, s0());
                if (Float.isInfinite(e02) || Float.isNaN(e02) || !c0686h.x(e02, false)) {
                    return;
                }
                E0(B02, fVar, j8, c0686h, z7, false, e02);
                return;
            }
            return;
        }
        if (B02 == null) {
            G0(fVar, j8, c0686h, z7, z8);
            return;
        }
        if (I0(j8)) {
            D0(B02, fVar, j8, c0686h, z7, z8);
            return;
        }
        float e03 = !z7 ? Float.POSITIVE_INFINITY : e0(j8, s0());
        if (!Float.isInfinite(e03) && !Float.isNaN(e03)) {
            if (c0686h.x(e03, z8)) {
                E0(B02, fVar, j8, c0686h, z7, z8, e03);
                return;
            }
        }
        Z0(B02, fVar, j8, c0686h, z7, z8, e03);
    }

    public abstract void G0(f fVar, long j8, C0686h c0686h, boolean z7, boolean z8);

    @Override // Q.v
    public boolean H() {
        return this.f4465r != null;
    }

    public void H0() {
        F f8 = this.f4455A;
        if (f8 != null) {
            f8.invalidate();
            return;
        }
        B b8 = this.f4458k;
        if (b8 != null) {
            b8.H0();
        }
    }

    protected final boolean I0(long j8) {
        float f8 = F.d.f(j8);
        float g8 = F.d.g(j8);
        return f8 >= 0.0f && g8 >= 0.0f && f8 < ((float) y()) && g8 < ((float) w());
    }

    public final boolean J0() {
        if (this.f4455A != null && this.f4464q <= 0.0f) {
            return true;
        }
        B b8 = this.f4458k;
        if (b8 != null) {
            return b8.J0();
        }
        return false;
    }

    public boolean K0() {
        return (this.f4455A == null || this.f4459l || !p0().Q()) ? false : true;
    }

    public long L0(long j8) {
        if (!g()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        N0();
        for (B b8 = this; b8 != null; b8 = b8.f4458k) {
            j8 = b8.b1(j8);
        }
        return j8;
    }

    public final void N0() {
        p0().p().A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [B.e$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [B.e$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [u.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [u.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    protected void O0(int i8, int i9) {
        F f8 = this.f4455A;
        if (f8 != null) {
            f8.e(c0.p.a(i8, i9));
        } else {
            B b8 = this.f4458k;
            if (b8 != null) {
                b8.H0();
            }
        }
        D(c0.p.a(i8, i9));
        e1(false);
        int a8 = D.a(4);
        boolean a9 = E.a(a8);
        e.c w02 = w0();
        if (a9 || (w02 = w02.n()) != null) {
            for (e.c C02 = C0(a9); C02 != null && (C02.j() & a8) != 0; C02 = C02.k()) {
                if ((C02.m() & a8) != 0) {
                    AbstractC0683e abstractC0683e = C02;
                    ?? r42 = 0;
                    while (abstractC0683e != 0) {
                        if (abstractC0683e instanceof InterfaceC0685g) {
                            ((InterfaceC0685g) abstractC0683e).c();
                        } else if ((abstractC0683e.m() & a8) != 0 && (abstractC0683e instanceof AbstractC0683e)) {
                            e.c r8 = abstractC0683e.r();
                            int i10 = 0;
                            abstractC0683e = abstractC0683e;
                            r42 = r42;
                            while (r8 != null) {
                                if ((r8.m() & a8) != 0) {
                                    i10++;
                                    r42 = r42;
                                    if (i10 == 1) {
                                        abstractC0683e = r8;
                                    } else {
                                        if (r42 == 0) {
                                            r42 = new C6807b(new e.c[16], 0);
                                        }
                                        if (abstractC0683e != 0) {
                                            r42.c(abstractC0683e);
                                            abstractC0683e = 0;
                                        }
                                        r42.c(r8);
                                    }
                                }
                                r8 = r8.k();
                                abstractC0683e = abstractC0683e;
                                r42 = r42;
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC0683e = AbstractC0682d.c(r42);
                    }
                }
                if (C02 == w02) {
                    break;
                }
            }
        }
        H D7 = p0().D();
        if (D7 != null) {
            D7.j(p0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [B.e$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3, types: [B.e$c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [u.b] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [u.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void P0() {
        e.c n8;
        if (A0(D.a(128))) {
            androidx.compose.runtime.snapshots.c a8 = androidx.compose.runtime.snapshots.c.f8092e.a();
            try {
                androidx.compose.runtime.snapshots.c h8 = a8.h();
                try {
                    int a9 = D.a(128);
                    boolean a10 = E.a(a9);
                    if (!a10) {
                        n8 = w0().n();
                        if (n8 == null) {
                        }
                        C6916E c6916e = C6916E.f44463a;
                        a8.k(h8);
                    }
                    n8 = w0();
                    for (e.c C02 = C0(a10); C02 != null && (C02.j() & a9) != 0; C02 = C02.k()) {
                        if ((C02.m() & a9) != 0) {
                            AbstractC0683e abstractC0683e = C02;
                            ?? r8 = 0;
                            while (abstractC0683e != 0) {
                                if (abstractC0683e instanceof InterfaceC0691m) {
                                    ((InterfaceC0691m) abstractC0683e).a(x());
                                } else if ((abstractC0683e.m() & a9) != 0 && (abstractC0683e instanceof AbstractC0683e)) {
                                    e.c r9 = abstractC0683e.r();
                                    int i8 = 0;
                                    abstractC0683e = abstractC0683e;
                                    r8 = r8;
                                    while (r9 != null) {
                                        if ((r9.m() & a9) != 0) {
                                            i8++;
                                            r8 = r8;
                                            if (i8 == 1) {
                                                abstractC0683e = r9;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new C6807b(new e.c[16], 0);
                                                }
                                                if (abstractC0683e != 0) {
                                                    r8.c(abstractC0683e);
                                                    abstractC0683e = 0;
                                                }
                                                r8.c(r9);
                                            }
                                        }
                                        r9 = r9.k();
                                        abstractC0683e = abstractC0683e;
                                        r8 = r8;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC0683e = AbstractC0682d.c(r8);
                            }
                        }
                        if (C02 == n8) {
                            break;
                        }
                    }
                    C6916E c6916e2 = C6916E.f44463a;
                    a8.k(h8);
                } catch (Throwable th) {
                    a8.k(h8);
                    throw th;
                }
            } finally {
                a8.a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [B.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [B.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [u.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [u.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void Q0() {
        int a8 = D.a(128);
        boolean a9 = E.a(a8);
        e.c w02 = w0();
        if (!a9 && (w02 = w02.n()) == null) {
            return;
        }
        for (e.c C02 = C0(a9); C02 != null && (C02.j() & a8) != 0; C02 = C02.k()) {
            if ((C02.m() & a8) != 0) {
                AbstractC0683e abstractC0683e = C02;
                ?? r52 = 0;
                while (abstractC0683e != 0) {
                    if (abstractC0683e instanceof InterfaceC0691m) {
                        ((InterfaceC0691m) abstractC0683e).i(this);
                    } else if ((abstractC0683e.m() & a8) != 0 && (abstractC0683e instanceof AbstractC0683e)) {
                        e.c r8 = abstractC0683e.r();
                        int i8 = 0;
                        abstractC0683e = abstractC0683e;
                        r52 = r52;
                        while (r8 != null) {
                            if ((r8.m() & a8) != 0) {
                                i8++;
                                r52 = r52;
                                if (i8 == 1) {
                                    abstractC0683e = r8;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new C6807b(new e.c[16], 0);
                                    }
                                    if (abstractC0683e != 0) {
                                        r52.c(abstractC0683e);
                                        abstractC0683e = 0;
                                    }
                                    r52.c(r8);
                                }
                            }
                            r8 = r8.k();
                            abstractC0683e = abstractC0683e;
                            r52 = r52;
                        }
                        if (i8 == 1) {
                        }
                    }
                    abstractC0683e = AbstractC0682d.c(r52);
                }
            }
            if (C02 == w02) {
                return;
            }
        }
    }

    public abstract void R0(G.e eVar);

    public final void T0(long j8, float f8, I6.l lVar) {
        long u7 = u();
        S0(c0.n.a(c0.m.f(j8) + c0.m.f(u7), c0.m.g(j8) + c0.m.g(u7)), f8, lVar);
    }

    public final void U0(F.b bVar, boolean z7, boolean z8) {
        F f8 = this.f4455A;
        if (f8 != null) {
            if (this.f4460m) {
                if (z8) {
                    long s02 = s0();
                    float d8 = F.g.d(s02) / 2.0f;
                    float c8 = F.g.c(s02) / 2.0f;
                    bVar.e(-d8, -c8, c0.o.e(h()) + d8, c0.o.d(h()) + c8);
                } else if (z7) {
                    bVar.e(0.0f, 0.0f, c0.o.e(h()), c0.o.d(h()));
                }
                if (bVar.f()) {
                    return;
                }
            }
            f8.a(bVar, false);
        }
        float f9 = c0.m.f(t0());
        bVar.h(bVar.b() + f9);
        bVar.i(bVar.c() + f9);
        float g8 = c0.m.g(t0());
        bVar.j(bVar.d() + g8);
        bVar.g(bVar.a() + g8);
    }

    public void W0(O.m mVar) {
        O.m mVar2 = this.f4465r;
        if (mVar != mVar2) {
            if (mVar2 == null || mVar.getWidth() != mVar2.getWidth() || mVar.getHeight() != mVar2.getHeight()) {
                O0(mVar.getWidth(), mVar.getHeight());
            }
            Map map = this.f4466s;
            if (((map == null || map.isEmpty()) && mVar.a().isEmpty()) || J6.r.a(mVar.a(), this.f4466s)) {
                return;
            }
            l0().a().m();
            Map map2 = this.f4466s;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.f4466s = map2;
            }
            map2.clear();
            map2.putAll(mVar.a());
        }
    }

    protected void X0(long j8) {
        this.f4467t = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [B.e$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [B.e$c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [u.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [u.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final boolean Y0() {
        e.c C02 = C0(E.a(D.a(16)));
        if (C02 != null && C02.o()) {
            int a8 = D.a(16);
            if (!C02.f().o()) {
                throw new IllegalStateException("visitLocalDescendants called on an unattached node");
            }
            e.c f8 = C02.f();
            if ((f8.j() & a8) != 0) {
                for (e.c k8 = f8.k(); k8 != null; k8 = k8.k()) {
                    if ((k8.m() & a8) != 0) {
                        AbstractC0683e abstractC0683e = k8;
                        ?? r62 = 0;
                        while (abstractC0683e != 0) {
                            if (abstractC0683e instanceof J) {
                                if (((J) abstractC0683e).g()) {
                                    return true;
                                }
                            } else if ((abstractC0683e.m() & a8) != 0 && (abstractC0683e instanceof AbstractC0683e)) {
                                e.c r8 = abstractC0683e.r();
                                int i8 = 0;
                                abstractC0683e = abstractC0683e;
                                r62 = r62;
                                while (r8 != null) {
                                    if ((r8.m() & a8) != 0) {
                                        i8++;
                                        r62 = r62;
                                        if (i8 == 1) {
                                            abstractC0683e = r8;
                                        } else {
                                            if (r62 == 0) {
                                                r62 = new C6807b(new e.c[16], 0);
                                            }
                                            if (abstractC0683e != 0) {
                                                r62.c(abstractC0683e);
                                                abstractC0683e = 0;
                                            }
                                            r62.c(r8);
                                        }
                                    }
                                    r8 = r8.k();
                                    abstractC0683e = abstractC0683e;
                                    r62 = r62;
                                }
                                if (i8 == 1) {
                                }
                            }
                            abstractC0683e = AbstractC0682d.c(r62);
                        }
                    }
                }
            }
        }
        return false;
    }

    public long b1(long j8) {
        F f8 = this.f4455A;
        if (f8 != null) {
            j8 = f8.d(j8, false);
        }
        return c0.n.c(j8, t0());
    }

    @Override // O.e
    public long c(long j8) {
        return s.b(p0()).c(L0(j8));
    }

    public final void c1(I6.l lVar, boolean z7) {
        H D7;
        p p02 = p0();
        boolean z8 = (!z7 && this.f4461n == lVar && J6.r.a(this.f4462o, p02.k()) && this.f4463p == p02.getLayoutDirection()) ? false : true;
        this.f4461n = lVar;
        this.f4462o = p02.k();
        this.f4463p = p02.getLayoutDirection();
        if (!p02.Q() || lVar == null) {
            F f8 = this.f4455A;
            if (f8 != null) {
                f8.destroy();
                p02.i0(true);
                this.f4472y.invoke();
                if (g() && (D7 = p02.D()) != null) {
                    D7.j(p02);
                }
            }
            this.f4473z = false;
            return;
        }
        if (this.f4455A != null) {
            if (z8) {
                f1(this, false, 1, null);
            }
        } else {
            F g8 = s.b(p02).g(this.f4471x, this.f4472y);
            g8.e(x());
            g8.f(t0());
            f1(this, false, 1, null);
            p02.i0(true);
            this.f4472y.invoke();
        }
    }

    @Override // c0.InterfaceC0973e
    public float d() {
        return p0().k().d();
    }

    protected final long d0(long j8) {
        return F.h.a(Math.max(0.0f, (F.g.d(j8) - y()) / 2.0f), Math.max(0.0f, (F.g.c(j8) - w()) / 2.0f));
    }

    protected final float e0(long j8, long j9) {
        if (y() >= F.g.d(j9) && w() >= F.g.c(j9)) {
            return Float.POSITIVE_INFINITY;
        }
        long d02 = d0(j9);
        float d8 = F.g.d(d02);
        float c8 = F.g.c(d02);
        long M02 = M0(j8);
        if ((d8 > 0.0f || c8 > 0.0f) && F.d.f(M02) <= d8 && F.d.g(M02) <= c8) {
            return F.d.e(M02);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void f0(G.e eVar) {
        F f8 = this.f4455A;
        if (f8 != null) {
            f8.c(eVar);
            return;
        }
        float f9 = c0.m.f(t0());
        float g8 = c0.m.g(t0());
        eVar.a(f9, g8);
        h0(eVar);
        eVar.a(-f9, -g8);
    }

    @Override // O.e
    public boolean g() {
        return w0().o();
    }

    protected final void g0(G.e eVar, G.n nVar) {
        eVar.b(new F.f(0.5f, 0.5f, c0.o.e(x()) - 0.5f, c0.o.d(x()) - 0.5f), nVar);
    }

    protected final boolean g1(long j8) {
        if (!F.e.b(j8)) {
            return false;
        }
        F f8 = this.f4455A;
        return f8 == null || !this.f4460m || f8.b(j8);
    }

    @Override // O.e
    public final long h() {
        return x();
    }

    @Override // O.e
    public F.f i(O.e eVar, boolean z7) {
        if (!g()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!eVar.g()) {
            throw new IllegalStateException(("LayoutCoordinates " + eVar + " is not attached!").toString());
        }
        B a12 = a1(eVar);
        a12.N0();
        B i02 = i0(a12);
        F.b u02 = u0();
        u02.h(0.0f);
        u02.j(0.0f);
        u02.i(c0.o.e(eVar.h()));
        u02.g(c0.o.d(eVar.h()));
        while (a12 != i02) {
            V0(a12, u02, z7, false, 4, null);
            if (u02.f()) {
                return F.f.f2218e.a();
            }
            a12 = a12.f4458k;
            J6.r.b(a12);
        }
        b0(i02, u02, z7);
        return F.c.a(u02);
    }

    public final B i0(B b8) {
        p p02 = b8.p0();
        p p03 = p0();
        if (p02 == p03) {
            e.c w02 = b8.w0();
            e.c w03 = w0();
            int a8 = D.a(2);
            if (!w03.f().o()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (e.c n8 = w03.f().n(); n8 != null; n8 = n8.n()) {
                if ((n8.m() & a8) != 0 && n8 == w02) {
                    return b8;
                }
            }
            return this;
        }
        while (p02.l() > p03.l()) {
            p02 = p02.E();
            J6.r.b(p02);
        }
        while (p03.l() > p02.l()) {
            p03 = p03.E();
            J6.r.b(p03);
        }
        while (p02 != p03) {
            p02 = p02.E();
            p03 = p03.E();
            if (p02 == null || p03 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return p03 == p0() ? this : p02 == b8.p0() ? b8 : p02.m();
    }

    public long j0(long j8) {
        long b8 = c0.n.b(j8, t0());
        F f8 = this.f4455A;
        return f8 != null ? f8.d(b8, true) : b8;
    }

    @Override // O.e
    public final O.e k() {
        if (!g()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        N0();
        return p0().C().f4458k;
    }

    public InterfaceC0680b l0() {
        return p0().p().j();
    }

    @Override // O.e
    public long m(O.e eVar, long j8) {
        if (eVar instanceof O.i) {
            return F.d.k(eVar.m(this, F.d.k(j8)));
        }
        B a12 = a1(eVar);
        a12.N0();
        B i02 = i0(a12);
        while (a12 != i02) {
            j8 = a12.b1(j8);
            a12 = a12.f4458k;
            J6.r.b(a12);
        }
        return c0(i02, j8);
    }

    public final boolean n0() {
        return this.f4473z;
    }

    public final F o0() {
        return this.f4455A;
    }

    public p p0() {
        return this.f4456i;
    }

    public abstract w q0();

    public O.m r0() {
        O.m mVar = this.f4465r;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final long s0() {
        return this.f4462o.q(p0().H().a());
    }

    public long t0() {
        return this.f4467t;
    }

    protected final F.b u0() {
        F.b bVar = this.f4469v;
        if (bVar != null) {
            return bVar;
        }
        F.b bVar2 = new F.b(0.0f, 0.0f, 0.0f, 0.0f);
        this.f4469v = bVar2;
        return bVar2;
    }

    public abstract e.c w0();

    public final B x0() {
        return this.f4457j;
    }

    public final B y0() {
        return this.f4458k;
    }

    public final float z0() {
        return this.f4468u;
    }

    public O.e m0() {
        return this;
    }
}
