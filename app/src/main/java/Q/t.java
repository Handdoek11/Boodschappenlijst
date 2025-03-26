package Q;

import O.p;
import Q.p;
import c0.AbstractC0971c;
import c0.C0970b;
import c0.m;
import java.util.List;
import java.util.Map;
import u.C6807b;
import x6.C6916E;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final p f4598a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4599b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4601d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4602e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4603f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4604g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4605h;

    /* renamed from: i, reason: collision with root package name */
    private int f4606i;

    /* renamed from: j, reason: collision with root package name */
    private int f4607j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4608k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4609l;

    /* renamed from: m, reason: collision with root package name */
    private int f4610m;

    /* renamed from: o, reason: collision with root package name */
    private a f4612o;

    /* renamed from: c, reason: collision with root package name */
    private p.e f4600c = p.e.Idle;

    /* renamed from: n, reason: collision with root package name */
    private final b f4611n = new b();

    /* renamed from: p, reason: collision with root package name */
    private long f4613p = AbstractC0971c.b(0, 0, 0, 0, 15, null);

    /* renamed from: q, reason: collision with root package name */
    private final I6.a f4614q = new c();

    public final class a extends O.p implements O.k, InterfaceC0680b {
        public abstract List F();

        public abstract boolean G();

        public abstract boolean H();

        public abstract void I(boolean z7);

        public abstract void J();

        public abstract void K();

        public abstract void L(boolean z7);

        public abstract void M(p.g gVar);

        public abstract void N(int i8);

        @Override // O.k
        public abstract O.p j(long j8);
    }

    public final class b extends O.p implements O.k, InterfaceC0680b {

        /* renamed from: A, reason: collision with root package name */
        private long f4615A;

        /* renamed from: B, reason: collision with root package name */
        private float f4616B;

        /* renamed from: C, reason: collision with root package name */
        private final I6.a f4617C;

        /* renamed from: f, reason: collision with root package name */
        private boolean f4619f;

        /* renamed from: i, reason: collision with root package name */
        private boolean f4622i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f4623j;

        /* renamed from: l, reason: collision with root package name */
        private boolean f4625l;

        /* renamed from: m, reason: collision with root package name */
        private long f4626m;

        /* renamed from: n, reason: collision with root package name */
        private I6.l f4627n;

        /* renamed from: o, reason: collision with root package name */
        private float f4628o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f4629p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f4630q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f4631r;

        /* renamed from: s, reason: collision with root package name */
        private final AbstractC0679a f4632s;

        /* renamed from: t, reason: collision with root package name */
        private final C6807b f4633t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f4634u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f4635v;

        /* renamed from: w, reason: collision with root package name */
        private final I6.a f4636w;

        /* renamed from: x, reason: collision with root package name */
        private float f4637x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f4638y;

        /* renamed from: z, reason: collision with root package name */
        private I6.l f4639z;

        /* renamed from: g, reason: collision with root package name */
        private int f4620g = Integer.MAX_VALUE;

        /* renamed from: h, reason: collision with root package name */
        private int f4621h = Integer.MAX_VALUE;

        /* renamed from: k, reason: collision with root package name */
        private p.g f4624k = p.g.NotUsed;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4640a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f4641b;

            static {
                int[] iArr = new int[p.e.values().length];
                try {
                    iArr[p.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f4640a = iArr;
                int[] iArr2 = new int[p.g.values().length];
                try {
                    iArr2[p.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[p.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f4641b = iArr2;
            }
        }

        /* renamed from: Q.t$b$b, reason: collision with other inner class name */
        static final class C0090b extends J6.s implements I6.a {

            /* renamed from: Q.t$b$b$a */
            static final class a extends J6.s implements I6.l {

                /* renamed from: o, reason: collision with root package name */
                public static final a f4643o = new a();

                a() {
                    super(1);
                }

                public final void b(InterfaceC0680b interfaceC0680b) {
                    interfaceC0680b.a().s(false);
                }

                @Override // I6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((InterfaceC0680b) obj);
                    return C6916E.f44463a;
                }
            }

            /* renamed from: Q.t$b$b$b, reason: collision with other inner class name */
            static final class C0091b extends J6.s implements I6.l {

                /* renamed from: o, reason: collision with root package name */
                public static final C0091b f4644o = new C0091b();

                C0091b() {
                    super(1);
                }

                public final void b(InterfaceC0680b interfaceC0680b) {
                    interfaceC0680b.a().p(interfaceC0680b.a().l());
                }

                @Override // I6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((InterfaceC0680b) obj);
                    return C6916E.f44463a;
                }
            }

            C0090b() {
                super(0);
            }

            @Override // I6.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m8invoke();
                return C6916E.f44463a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m8invoke() {
                b.this.L();
                b.this.n(a.f4643o);
                b.this.e().r0().b();
                b.this.K();
                b.this.n(C0091b.f4644o);
            }
        }

        static final class c extends J6.s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ t f4645o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f4646s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(t tVar, b bVar) {
                super(0);
                this.f4645o = tVar;
                this.f4646s = bVar;
            }

            @Override // I6.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m9invoke();
                return C6916E.f44463a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m9invoke() {
                p.a placementScope;
                B y02 = this.f4645o.x().y0();
                if (y02 == null || (placementScope = y02.I()) == null) {
                    placementScope = s.b(this.f4645o.f4598a).getPlacementScope();
                }
                p.a aVar = placementScope;
                b bVar = this.f4646s;
                t tVar = this.f4645o;
                I6.l lVar = bVar.f4639z;
                if (lVar == null) {
                    aVar.c(tVar.x(), bVar.f4615A, bVar.f4616B);
                } else {
                    aVar.d(tVar.x(), bVar.f4615A, bVar.f4616B, lVar);
                }
            }
        }

        static final class d extends J6.s implements I6.l {

            /* renamed from: o, reason: collision with root package name */
            public static final d f4647o = new d();

            d() {
                super(1);
            }

            public final void b(InterfaceC0680b interfaceC0680b) {
                interfaceC0680b.a().t(false);
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((InterfaceC0680b) obj);
                return C6916E.f44463a;
            }
        }

        public b() {
            m.a aVar = c0.m.f12088b;
            this.f4626m = aVar.a();
            this.f4629p = true;
            this.f4632s = new q(this);
            this.f4633t = new C6807b(new b[16], 0);
            this.f4634u = true;
            this.f4636w = new C0090b();
            this.f4615A = aVar.a();
            this.f4617C = new c(t.this, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K() {
            p pVar = t.this.f4598a;
            C6807b K7 = pVar.K();
            int q8 = K7.q();
            if (q8 > 0) {
                Object[] p8 = K7.p();
                int i8 = 0;
                do {
                    p pVar2 = (p) p8[i8];
                    if (pVar2.x().f4620g != pVar2.F()) {
                        pVar.U();
                        pVar.O();
                        if (pVar2.F() == Integer.MAX_VALUE) {
                            pVar2.x().U();
                        }
                    }
                    i8++;
                } while (i8 < q8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L() {
            t.this.f4607j = 0;
            C6807b K7 = t.this.f4598a.K();
            int q8 = K7.q();
            if (q8 > 0) {
                Object[] p8 = K7.p();
                int i8 = 0;
                do {
                    b x7 = ((p) p8[i8]).x();
                    x7.f4620g = x7.f4621h;
                    x7.f4621h = Integer.MAX_VALUE;
                    x7.f4631r = false;
                    if (x7.f4624k == p.g.InLayoutBlock) {
                        x7.f4624k = p.g.NotUsed;
                    }
                    i8++;
                } while (i8 < q8);
            }
        }

        private final void T() {
            boolean p8 = p();
            c0(true);
            p pVar = t.this.f4598a;
            int i8 = 0;
            if (!p8) {
                if (pVar.y()) {
                    p.e0(pVar, true, false, 2, null);
                } else if (pVar.t()) {
                    p.a0(pVar, true, false, 2, null);
                }
            }
            B x02 = pVar.m().x0();
            for (B C7 = pVar.C(); !J6.r.a(C7, x02) && C7 != null; C7 = C7.x0()) {
                if (C7.n0()) {
                    C7.H0();
                }
            }
            C6807b K7 = pVar.K();
            int q8 = K7.q();
            if (q8 > 0) {
                Object[] p9 = K7.p();
                do {
                    p pVar2 = (p) p9[i8];
                    if (pVar2.F() != Integer.MAX_VALUE) {
                        pVar2.x().T();
                        pVar.f0(pVar2);
                    }
                    i8++;
                } while (i8 < q8);
            }
        }

        private final void U() {
            if (p()) {
                int i8 = 0;
                c0(false);
                C6807b K7 = t.this.f4598a.K();
                int q8 = K7.q();
                if (q8 > 0) {
                    Object[] p8 = K7.p();
                    do {
                        ((p) p8[i8]).x().U();
                        i8++;
                    } while (i8 < q8);
                }
            }
        }

        private final void W() {
            p pVar = t.this.f4598a;
            t tVar = t.this;
            C6807b K7 = pVar.K();
            int q8 = K7.q();
            if (q8 > 0) {
                Object[] p8 = K7.p();
                int i8 = 0;
                do {
                    p pVar2 = (p) p8[i8];
                    if (pVar2.y() && pVar2.A() == p.g.InMeasureBlock && p.X(pVar2, null, 1, null)) {
                        p.e0(tVar.f4598a, false, false, 3, null);
                    }
                    i8++;
                } while (i8 < q8);
            }
        }

        private final void Y(long j8, float f8, I6.l lVar) {
            if (t.this.f4598a.R()) {
                throw new IllegalArgumentException("place is called on a deactivated node");
            }
            t.this.f4600c = p.e.LayingOut;
            this.f4626m = j8;
            this.f4628o = f8;
            this.f4627n = lVar;
            this.f4623j = true;
            this.f4638y = false;
            H b8 = s.b(t.this.f4598a);
            if (!t.this.p() && p()) {
                t.this.x().T0(j8, f8, lVar);
                X();
                t.this.f4600c = p.e.Idle;
                return;
            }
            a().q(false);
            t.this.D(false);
            this.f4639z = lVar;
            this.f4615A = j8;
            this.f4616B = f8;
            b8.getSnapshotObserver();
            p unused = t.this.f4598a;
            throw null;
        }

        private final void d0(p pVar) {
            p.g gVar;
            p E7 = pVar.E();
            if (E7 == null) {
                this.f4624k = p.g.NotUsed;
                return;
            }
            if (this.f4624k != p.g.NotUsed && !pVar.f()) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i8 = a.f4640a[E7.r().ordinal()];
            if (i8 == 1) {
                gVar = p.g.InMeasureBlock;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + E7.r());
                }
                gVar = p.g.InLayoutBlock;
            }
            this.f4624k = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // O.p
        public void C(long j8, float f8, I6.l lVar) {
            p.a placementScope;
            this.f4631r = true;
            if (!c0.m.e(j8, this.f4626m)) {
                if (t.this.l() || t.this.m()) {
                    t.this.f4602e = true;
                }
                V();
            }
            if (u.a(t.this.f4598a)) {
                B y02 = t.this.x().y0();
                if (y02 == null || (placementScope = y02.I()) == null) {
                    placementScope = s.b(t.this.f4598a).getPlacementScope();
                }
                p.a aVar = placementScope;
                t tVar = t.this;
                a u7 = tVar.u();
                J6.r.b(u7);
                p E7 = tVar.f4598a.E();
                if (E7 != null) {
                    E7.p().f4606i = 0;
                }
                u7.N(Integer.MAX_VALUE);
                p.a.b(aVar, u7, c0.m.f(j8), c0.m.g(j8), 0.0f, 4, null);
            }
            t.this.u();
            Y(j8, f8, lVar);
        }

        public final List M() {
            t.this.f4598a.j0();
            if (!this.f4634u) {
                return this.f4633t.i();
            }
            p pVar = t.this.f4598a;
            C6807b c6807b = this.f4633t;
            C6807b K7 = pVar.K();
            int q8 = K7.q();
            if (q8 > 0) {
                Object[] p8 = K7.p();
                int i8 = 0;
                do {
                    p pVar2 = (p) p8[i8];
                    if (c6807b.q() <= i8) {
                        c6807b.c(pVar2.p().v());
                    } else {
                        c6807b.E(i8, pVar2.p().v());
                    }
                    i8++;
                } while (i8 < q8);
            }
            c6807b.y(pVar.i().size(), c6807b.q());
            this.f4634u = false;
            return this.f4633t.i();
        }

        public final C0970b N() {
            if (this.f4622i) {
                return C0970b.b(z());
            }
            return null;
        }

        public final boolean O() {
            return this.f4635v;
        }

        public final p.g P() {
            return this.f4624k;
        }

        public final int Q() {
            return this.f4621h;
        }

        public final float R() {
            return this.f4637x;
        }

        public final void S(boolean z7) {
            p E7;
            p E8 = t.this.f4598a.E();
            p.g o8 = t.this.f4598a.o();
            if (E8 == null || o8 == p.g.NotUsed) {
                return;
            }
            while (E8.o() == o8 && (E7 = E8.E()) != null) {
                E8 = E7;
            }
            int i8 = a.f4641b[o8.ordinal()];
            if (i8 == 1) {
                p.e0(E8, z7, false, 2, null);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                E8.b0(z7);
            }
        }

        public final void V() {
            C6807b K7;
            int q8;
            if (t.this.k() <= 0 || (q8 = (K7 = t.this.f4598a.K()).q()) <= 0) {
                return;
            }
            Object[] p8 = K7.p();
            int i8 = 0;
            do {
                p pVar = (p) p8[i8];
                t p9 = pVar.p();
                if ((p9.m() || p9.l()) && !p9.p()) {
                    p.c0(pVar, false, 1, null);
                }
                p9.v().V();
                i8++;
            } while (i8 < q8);
        }

        public final void X() {
            this.f4638y = true;
            p E7 = t.this.f4598a.E();
            float z02 = e().z0();
            p pVar = t.this.f4598a;
            B C7 = pVar.C();
            B m8 = pVar.m();
            while (C7 != m8) {
                J6.r.c(C7, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                AbstractC0692n abstractC0692n = (AbstractC0692n) C7;
                z02 += abstractC0692n.z0();
                C7 = abstractC0692n.x0();
            }
            if (z02 != this.f4637x) {
                this.f4637x = z02;
                if (E7 != null) {
                    E7.U();
                }
                if (E7 != null) {
                    E7.O();
                }
            }
            if (!p()) {
                if (E7 != null) {
                    E7.O();
                }
                T();
                if (this.f4619f && E7 != null) {
                    p.c0(E7, false, 1, null);
                }
            }
            if (E7 == null) {
                this.f4621h = 0;
            } else if (!this.f4619f && E7.r() == p.e.LayingOut) {
                if (this.f4621h != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already");
                }
                this.f4621h = E7.p().f4607j;
                E7.p().f4607j++;
            }
            o();
        }

        public final boolean Z(long j8) {
            if (t.this.f4598a.R()) {
                throw new IllegalArgumentException("measure is called on a deactivated node");
            }
            H b8 = s.b(t.this.f4598a);
            p E7 = t.this.f4598a.E();
            boolean z7 = true;
            t.this.f4598a.h0(t.this.f4598a.f() || (E7 != null && E7.f()));
            if (!t.this.f4598a.y() && C0970b.e(z(), j8)) {
                G.a(b8, t.this.f4598a, false, 2, null);
                t.this.f4598a.g0();
                return false;
            }
            a().r(false);
            n(d.f4647o);
            this.f4622i = true;
            long h8 = t.this.x().h();
            E(j8);
            t.this.B(j8);
            if (c0.o.c(t.this.x().h(), h8) && t.this.x().A() == A() && t.this.x().v() == v()) {
                z7 = false;
            }
            D(c0.p.a(t.this.x().A(), t.this.x().v()));
            return z7;
        }

        @Override // Q.InterfaceC0680b
        public AbstractC0679a a() {
            return this.f4632s;
        }

        public final void a0(boolean z7) {
            this.f4634u = z7;
        }

        @Override // Q.InterfaceC0680b
        public Map b() {
            if (!this.f4625l) {
                if (t.this.q() == p.e.Measuring) {
                    a().r(true);
                    if (a().g()) {
                        t.this.z();
                    }
                } else {
                    a().q(true);
                }
            }
            e().M(true);
            o();
            e().M(false);
            return a().h();
        }

        public final void b0(p.g gVar) {
            this.f4624k = gVar;
        }

        public void c0(boolean z7) {
            this.f4630q = z7;
        }

        @Override // Q.InterfaceC0680b
        public B e() {
            return t.this.f4598a.m();
        }

        @Override // Q.InterfaceC0680b
        public InterfaceC0680b f() {
            t p8;
            p E7 = t.this.f4598a.E();
            if (E7 == null || (p8 = E7.p()) == null) {
                return null;
            }
            return p8.j();
        }

        @Override // O.k
        public O.p j(long j8) {
            p.g o8 = t.this.f4598a.o();
            p.g gVar = p.g.NotUsed;
            if (o8 == gVar) {
                t.this.f4598a.d();
            }
            if (u.a(t.this.f4598a)) {
                a u7 = t.this.u();
                J6.r.b(u7);
                u7.M(gVar);
                u7.j(j8);
            }
            d0(t.this.f4598a);
            Z(j8);
            return this;
        }

        @Override // Q.InterfaceC0680b
        public void n(I6.l lVar) {
            C6807b K7 = t.this.f4598a.K();
            int q8 = K7.q();
            if (q8 > 0) {
                Object[] p8 = K7.p();
                int i8 = 0;
                do {
                    lVar.invoke(((p) p8[i8]).p().j());
                    i8++;
                } while (i8 < q8);
            }
        }

        @Override // Q.InterfaceC0680b
        public void o() {
            this.f4635v = true;
            a().o();
            if (t.this.p()) {
                W();
            }
            if (t.this.f4603f || !(this.f4625l || e().K() || !t.this.p())) {
                t.this.f4602e = false;
                t.this.q();
                t.this.f4600c = p.e.LayingOut;
                t.this.E(false);
                s.b(t.this.f4598a).getSnapshotObserver();
                throw null;
            }
            if (a().l()) {
                a().p(true);
            }
            if (a().g() && a().k()) {
                a().n();
            }
            this.f4635v = false;
        }

        @Override // Q.InterfaceC0680b
        public boolean p() {
            return this.f4630q;
        }

        @Override // Q.InterfaceC0680b
        public void r() {
            p.e0(t.this.f4598a, false, false, 3, null);
        }

        @Override // Q.InterfaceC0680b
        public void requestLayout() {
            p.c0(t.this.f4598a, false, 1, null);
        }
    }

    static final class c extends J6.s implements I6.a {
        c() {
            super(0);
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m10invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m10invoke() {
            t.this.x().j(t.this.f4613p);
        }
    }

    public t(p pVar) {
        this.f4598a = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j8) {
        if (this.f4600c != p.e.Idle) {
            throw new IllegalStateException("layout state is not idle before measure starts");
        }
        this.f4600c = p.e.Measuring;
        this.f4601d = false;
        this.f4613p = j8;
        s.b(this.f4598a).getSnapshotObserver();
        throw null;
    }

    public final void A() {
        p.e r8 = this.f4598a.r();
        if (r8 == p.e.LayingOut || r8 == p.e.LookaheadLayingOut) {
            if (this.f4611n.O()) {
                E(true);
            } else {
                D(true);
            }
        }
        if (r8 == p.e.LookaheadLayingOut) {
            D(true);
        }
    }

    public final void C(int i8) {
        int i9 = this.f4610m;
        this.f4610m = i8;
        if ((i9 == 0) != (i8 == 0)) {
            p E7 = this.f4598a.E();
            t p8 = E7 != null ? E7.p() : null;
            if (p8 != null) {
                if (i8 == 0) {
                    p8.C(p8.f4610m - 1);
                } else {
                    p8.C(p8.f4610m + 1);
                }
            }
        }
    }

    public final void D(boolean z7) {
        if (this.f4609l != z7) {
            this.f4609l = z7;
            if (z7 && !this.f4608k) {
                C(this.f4610m + 1);
            } else {
                if (z7 || this.f4608k) {
                    return;
                }
                C(this.f4610m - 1);
            }
        }
    }

    public final void E(boolean z7) {
        if (this.f4608k != z7) {
            this.f4608k = z7;
            if (z7 && !this.f4609l) {
                C(this.f4610m + 1);
            } else {
                if (z7 || this.f4609l) {
                    return;
                }
                C(this.f4610m - 1);
            }
        }
    }

    public final InterfaceC0680b j() {
        return this.f4611n;
    }

    public final int k() {
        return this.f4610m;
    }

    public final boolean l() {
        return this.f4609l;
    }

    public final boolean m() {
        return this.f4608k;
    }

    public final boolean n() {
        return this.f4599b;
    }

    public final C0970b o() {
        return this.f4611n.N();
    }

    public final boolean p() {
        return this.f4602e;
    }

    public final p.e q() {
        return this.f4600c;
    }

    public final InterfaceC0680b r() {
        return this.f4612o;
    }

    public final boolean s() {
        return this.f4605h;
    }

    public final boolean t() {
        return this.f4604g;
    }

    public final a u() {
        return this.f4612o;
    }

    public final b v() {
        return this.f4611n;
    }

    public final boolean w() {
        return this.f4601d;
    }

    public final B x() {
        return this.f4598a.B().e();
    }

    public final void y() {
        this.f4611n.a0(true);
    }

    public final void z() {
        this.f4602e = true;
        this.f4603f = true;
    }
}
