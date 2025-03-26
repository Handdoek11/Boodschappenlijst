package Q;

import B.e;
import J6.AbstractC0650j;
import Q.t;
import c0.C0970b;
import c0.InterfaceC0973e;
import java.util.Comparator;
import java.util.List;
import t.InterfaceC6773k;
import u.C6807b;
import x6.C6916E;

/* loaded from: classes.dex */
public final class p implements O.g {

    /* renamed from: E, reason: collision with root package name */
    public static final d f4545E = new d(null);

    /* renamed from: F, reason: collision with root package name */
    public static final int f4546F = 8;

    /* renamed from: G, reason: collision with root package name */
    private static final f f4547G = new c();

    /* renamed from: H, reason: collision with root package name */
    private static final I6.a f4548H = a.f4581o;

    /* renamed from: I, reason: collision with root package name */
    private static final androidx.compose.ui.platform.I f4549I = new b();

    /* renamed from: J, reason: collision with root package name */
    private static final Comparator f4550J = new Comparator() { // from class: Q.o
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p.b((p) obj, (p) obj2);
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private B f4551A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f4552B;

    /* renamed from: C, reason: collision with root package name */
    private B.e f4553C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f4554D;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4555a;

    /* renamed from: b, reason: collision with root package name */
    private int f4556b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4557c;

    /* renamed from: d, reason: collision with root package name */
    private p f4558d;

    /* renamed from: e, reason: collision with root package name */
    private int f4559e;

    /* renamed from: f, reason: collision with root package name */
    private final z f4560f;

    /* renamed from: g, reason: collision with root package name */
    private C6807b f4561g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4562h;

    /* renamed from: i, reason: collision with root package name */
    private p f4563i;

    /* renamed from: j, reason: collision with root package name */
    private H f4564j;

    /* renamed from: k, reason: collision with root package name */
    private int f4565k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4566l;

    /* renamed from: m, reason: collision with root package name */
    private S.e f4567m;

    /* renamed from: n, reason: collision with root package name */
    private final C6807b f4568n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4569o;

    /* renamed from: p, reason: collision with root package name */
    private O.l f4570p;

    /* renamed from: q, reason: collision with root package name */
    private final C0689k f4571q;

    /* renamed from: r, reason: collision with root package name */
    private InterfaceC0973e f4572r;

    /* renamed from: s, reason: collision with root package name */
    private c0.q f4573s;

    /* renamed from: t, reason: collision with root package name */
    private androidx.compose.ui.platform.I f4574t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC6773k f4575u;

    /* renamed from: v, reason: collision with root package name */
    private g f4576v;

    /* renamed from: w, reason: collision with root package name */
    private g f4577w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f4578x;

    /* renamed from: y, reason: collision with root package name */
    private final A f4579y;

    /* renamed from: z, reason: collision with root package name */
    private final t f4580z;

    static final class a extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final a f4581o = new a();

        a() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return new p(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    public static final class b implements androidx.compose.ui.platform.I {
        b() {
        }

        @Override // androidx.compose.ui.platform.I
        public long a() {
            return c0.k.f12084a.b();
        }
    }

    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // O.l
        public /* bridge */ /* synthetic */ O.m a(O.n nVar, List list, long j8) {
            return (O.m) b(nVar, list, j8);
        }

        public Void b(O.n nVar, List list, long j8) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    public static final class d {
        public /* synthetic */ d(AbstractC0650j abstractC0650j) {
            this();
        }

        public final Comparator a() {
            return p.f4550J;
        }

        private d() {
        }
    }

    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    public static abstract class f implements O.l {

        /* renamed from: a, reason: collision with root package name */
        private final String f4588a;

        public f(String str) {
            this.f4588a = str;
        }
    }

    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4593a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4593a = iArr;
        }
    }

    static final class i extends J6.s implements I6.a {
        i() {
            super(0);
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            p.this.p().y();
        }
    }

    static final class j extends J6.s implements I6.a {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ J6.G f4596s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(J6.G g8) {
            super(0);
            this.f4596s = g8;
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return C6916E.f44463a;
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
        /* renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            A B7 = p.this.B();
            int a8 = D.a(8);
            J6.G g8 = this.f4596s;
            if ((B7.b() & a8) != 0) {
                for (e.c f8 = B7.f(); f8 != null; f8 = f8.n()) {
                    if ((f8.m() & a8) != 0) {
                        AbstractC0683e abstractC0683e = f8;
                        ?? r52 = 0;
                        while (abstractC0683e != 0) {
                            if (abstractC0683e instanceof M) {
                                M m8 = (M) abstractC0683e;
                                if (m8.b()) {
                                    S.e eVar = new S.e();
                                    g8.f3547o = eVar;
                                    eVar.r(true);
                                }
                                if (m8.h()) {
                                    ((S.e) g8.f3547o).s(true);
                                }
                                m8.e((S.e) g8.f3547o);
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
                }
            }
        }
    }

    public p(boolean z7, int i8) {
        this.f4555a = z7;
        this.f4556b = i8;
        this.f4560f = new z(new C6807b(new p[16], 0), new i());
        this.f4568n = new C6807b(new p[16], 0);
        this.f4569o = true;
        this.f4570p = f4547G;
        this.f4571q = new C0689k(this);
        this.f4572r = s.f4597a;
        this.f4573s = c0.q.Ltr;
        this.f4574t = f4549I;
        this.f4575u = InterfaceC6773k.f43773q.a();
        g gVar = g.NotUsed;
        this.f4576v = gVar;
        this.f4577w = gVar;
        this.f4579y = new A(this);
        this.f4580z = new t(this);
        this.f4552B = true;
        this.f4553C = B.e.f275a;
    }

    private final float I() {
        return x().R();
    }

    private final void V() {
        if (this.f4562h) {
            int i8 = 0;
            this.f4562h = false;
            C6807b c6807b = this.f4561g;
            if (c6807b == null) {
                c6807b = new C6807b(new p[16], 0);
                this.f4561g = c6807b;
            }
            c6807b.j();
            C6807b a8 = this.f4560f.a();
            int q8 = a8.q();
            if (q8 > 0) {
                Object[] p8 = a8.p();
                do {
                    p pVar = (p) p8[i8];
                    if (pVar.f4555a) {
                        c6807b.e(c6807b.q(), pVar.K());
                    } else {
                        c6807b.c(pVar);
                    }
                    i8++;
                } while (i8 < q8);
            }
            this.f4580z.y();
        }
    }

    public static /* synthetic */ boolean X(p pVar, C0970b c0970b, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            c0970b = pVar.f4580z.o();
        }
        return pVar.W(c0970b);
    }

    public static /* synthetic */ void a0(p pVar, boolean z7, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        pVar.Z(z7, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(p pVar, p pVar2) {
        return pVar.I() == pVar2.I() ? J6.r.f(pVar.F(), pVar2.F()) : Float.compare(pVar.I(), pVar2.I());
    }

    public static /* synthetic */ void c0(p pVar, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        pVar.b0(z7);
    }

    public static /* synthetic */ void e0(p pVar, boolean z7, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        pVar.d0(z7, z8);
    }

    private final B n() {
        if (this.f4552B) {
            B m8 = m();
            B y02 = C().y0();
            this.f4551A = null;
            while (true) {
                if (J6.r.a(m8, y02)) {
                    break;
                }
                if ((m8 != null ? m8.o0() : null) != null) {
                    this.f4551A = m8;
                    break;
                }
                m8 = m8 != null ? m8.y0() : null;
            }
        }
        B b8 = this.f4551A;
        if (b8 == null || b8.o0() != null) {
            return b8;
        }
        throw new IllegalStateException("layer was not set");
    }

    public final g A() {
        return x().P();
    }

    public final A B() {
        return this.f4579y;
    }

    public final B C() {
        return this.f4579y.e();
    }

    public final H D() {
        return this.f4564j;
    }

    public final p E() {
        p pVar = this.f4563i;
        while (pVar != null && pVar.f4555a) {
            pVar = pVar.f4563i;
        }
        return pVar;
    }

    public final int F() {
        return x().Q();
    }

    public int G() {
        return this.f4556b;
    }

    public androidx.compose.ui.platform.I H() {
        return this.f4574t;
    }

    public final C6807b J() {
        if (this.f4569o) {
            this.f4568n.j();
            C6807b c6807b = this.f4568n;
            c6807b.e(c6807b.q(), K());
            this.f4568n.F(f4550J);
            this.f4569o = false;
        }
        return this.f4568n;
    }

    public final C6807b K() {
        j0();
        if (this.f4559e == 0) {
            return this.f4560f.a();
        }
        C6807b c6807b = this.f4561g;
        J6.r.b(c6807b);
        return c6807b;
    }

    public final void L(long j8, C0686h c0686h, boolean z7, boolean z8) {
        C().F0(B.f4447B.a(), C().j0(j8), c0686h, z7, z8);
    }

    public final void M(long j8, C0686h c0686h, boolean z7, boolean z8) {
        C().F0(B.f4447B.b(), C().j0(j8), c0686h, true, z8);
    }

    public final void O() {
        B n8 = n();
        if (n8 != null) {
            n8.H0();
            return;
        }
        p E7 = E();
        if (E7 != null) {
            E7.O();
        }
    }

    public final void P() {
        B C7 = C();
        B m8 = m();
        while (C7 != m8) {
            J6.r.c(C7, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            AbstractC0692n abstractC0692n = (AbstractC0692n) C7;
            F o02 = abstractC0692n.o0();
            if (o02 != null) {
                o02.invalidate();
            }
            C7 = abstractC0692n.x0();
        }
        F o03 = m().o0();
        if (o03 != null) {
            o03.invalidate();
        }
    }

    public boolean Q() {
        return this.f4564j != null;
    }

    public boolean R() {
        return this.f4554D;
    }

    public boolean S() {
        return x().p();
    }

    public final boolean T() {
        return this.f4557c;
    }

    public final void U() {
        if (!this.f4555a) {
            this.f4569o = true;
            return;
        }
        p E7 = E();
        if (E7 != null) {
            E7.U();
        }
    }

    public final boolean W(C0970b c0970b) {
        if (c0970b == null) {
            return false;
        }
        if (this.f4576v == g.NotUsed) {
            d();
        }
        return x().Z(c0970b.m());
    }

    public final void Y(boolean z7) {
        H h8;
        if (this.f4555a || (h8 = this.f4564j) == null) {
            return;
        }
        h8.i(this, true, z7);
    }

    public final void Z(boolean z7, boolean z8) {
        if (this.f4558d == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        H h8 = this.f4564j;
        if (h8 == null || this.f4566l || this.f4555a) {
            return;
        }
        h8.k(this, true, z7, z8);
        t.a u7 = u();
        J6.r.b(u7);
        u7.I(z7);
    }

    public final void b0(boolean z7) {
        H h8;
        if (this.f4555a || (h8 = this.f4564j) == null) {
            return;
        }
        G.d(h8, this, false, z7, 2, null);
    }

    public final void d() {
        this.f4577w = this.f4576v;
        this.f4576v = g.NotUsed;
        C6807b K7 = K();
        int q8 = K7.q();
        if (q8 > 0) {
            Object[] p8 = K7.p();
            int i8 = 0;
            do {
                p pVar = (p) p8[i8];
                if (pVar.f4576v != g.NotUsed) {
                    pVar.d();
                }
                i8++;
            } while (i8 < q8);
        }
    }

    public final void d0(boolean z7, boolean z8) {
        H h8;
        if (this.f4566l || this.f4555a || (h8 = this.f4564j) == null) {
            return;
        }
        G.c(h8, this, false, z7, z8, 2, null);
        x().S(z7);
    }

    public final void e(G.e eVar) {
        C().f0(eVar);
    }

    public final boolean f() {
        return this.f4578x;
    }

    public final void f0(p pVar) {
        if (h.f4593a[pVar.r().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + pVar.r());
        }
        if (pVar.t()) {
            a0(pVar, true, false, 2, null);
            return;
        }
        if (pVar.s()) {
            pVar.Y(true);
        }
        if (pVar.y()) {
            e0(pVar, true, false, 2, null);
        } else if (pVar.q()) {
            pVar.b0(true);
        }
    }

    public final List g() {
        t.a u7 = u();
        J6.r.b(u7);
        return u7.F();
    }

    public final void g0() {
        C6807b K7 = K();
        int q8 = K7.q();
        if (q8 > 0) {
            Object[] p8 = K7.p();
            int i8 = 0;
            do {
                p pVar = (p) p8[i8];
                g gVar = pVar.f4577w;
                pVar.f4576v = gVar;
                if (gVar != g.NotUsed) {
                    pVar.g0();
                }
                i8++;
            } while (i8 < q8);
        }
    }

    @Override // O.g
    public c0.q getLayoutDirection() {
        return this.f4573s;
    }

    public final List h() {
        return x().M();
    }

    public final void h0(boolean z7) {
        this.f4578x = z7;
    }

    public final List i() {
        return K().i();
    }

    public final void i0(boolean z7) {
        this.f4552B = z7;
    }

    public final S.e j() {
        if (!this.f4579y.g(D.a(8)) || this.f4567m != null) {
            return this.f4567m;
        }
        J6.G g8 = new J6.G();
        g8.f3547o = new S.e();
        s.b(this).getSnapshotObserver();
        new j(g8);
        throw null;
    }

    public final void j0() {
        if (this.f4559e > 0) {
            V();
        }
    }

    public InterfaceC0973e k() {
        return this.f4572r;
    }

    public final int l() {
        return this.f4565k;
    }

    public final B m() {
        return this.f4579y.d();
    }

    public final g o() {
        return this.f4576v;
    }

    public final t p() {
        return this.f4580z;
    }

    public final boolean q() {
        return this.f4580z.p();
    }

    public final e r() {
        return this.f4580z.q();
    }

    public final boolean s() {
        return this.f4580z.s();
    }

    public final boolean t() {
        return this.f4580z.t();
    }

    public String toString() {
        return androidx.compose.ui.platform.A.a(this, null) + " children: " + i().size() + " measurePolicy: " + z();
    }

    public final t.a u() {
        return this.f4580z.u();
    }

    public final p v() {
        return this.f4558d;
    }

    public final r w() {
        s.b(this).getSharedDrawScope();
        return null;
    }

    public final t.b x() {
        return this.f4580z.v();
    }

    public final boolean y() {
        return this.f4580z.w();
    }

    public O.l z() {
        return this.f4570p;
    }

    public /* synthetic */ p(boolean z7, int i8, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? false : z7, (i9 & 2) != 0 ? S.g.a() : i8);
    }
}
