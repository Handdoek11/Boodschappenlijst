package Q;

import J6.AbstractC0650j;
import Q.p;
import Q.t;
import u.C6807b;

/* renamed from: Q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688j extends B {

    /* renamed from: L, reason: collision with root package name */
    public static final a f4527L = new a(null);

    /* renamed from: M, reason: collision with root package name */
    private static final G.n f4528M;

    /* renamed from: J, reason: collision with root package name */
    private final N f4529J;

    /* renamed from: K, reason: collision with root package name */
    private w f4530K;

    /* renamed from: Q.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: Q.j$b */
    private final class b extends w {
        public b() {
            super(C0688j.this);
        }

        @Override // Q.v
        public int F(O.a aVar) {
            Integer num = (Integer) P().b().get(aVar);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            Q().put(aVar, Integer.valueOf(intValue));
            return intValue;
        }

        @Override // Q.w
        protected void W() {
            t.a u7 = T().u();
            J6.r.b(u7);
            u7.K();
        }

        @Override // O.k
        public O.p j(long j8) {
            E(j8);
            C6807b K7 = T().K();
            int q8 = K7.q();
            if (q8 > 0) {
                Object[] p8 = K7.p();
                int i8 = 0;
                do {
                    t.a u7 = ((p) p8[i8]).u();
                    J6.r.b(u7);
                    u7.M(p.g.NotUsed);
                    i8++;
                } while (i8 < q8);
            }
            a0(T().z().a(this, T().g(), j8));
            return this;
        }
    }

    static {
        G.n a8 = G.c.a();
        a8.b(G.g.f2458a.b());
        a8.c(1.0f);
        a8.a(G.o.f2492a.a());
        f4528M = a8;
    }

    public C0688j(p pVar) {
        super(pVar);
        this.f4529J = new N();
        w0().q(this);
        this.f4530K = pVar.v() != null ? new b() : null;
    }

    @Override // Q.B, O.p
    protected void C(long j8, float f8, I6.l lVar) {
        super.C(j8, f8, lVar);
        if (L()) {
            return;
        }
        Q0();
        p0().x().X();
    }

    @Override // Q.v
    public int F(O.a aVar) {
        w q02 = q0();
        if (q02 != null) {
            return q02.F(aVar);
        }
        Integer num = (Integer) l0().b().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    @Override // Q.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G0(Q.B.f r17, long r18, Q.C0686h r20, boolean r21, boolean r22) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            Q.p r1 = r16.p0()
            r10 = r17
            boolean r1 = r10.a(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            boolean r1 = r0.g1(r8)
            if (r1 == 0) goto L1c
            r11 = r22
        L1a:
            r3 = r2
            goto L36
        L1c:
            if (r21 == 0) goto L34
            long r4 = r16.s0()
            float r1 = r0.e0(r8, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L34
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L34
            r11 = r3
            goto L1a
        L34:
            r11 = r22
        L36:
            if (r3 == 0) goto L88
            int r12 = Q.C0686h.d(r20)
            Q.p r1 = r16.p0()
            u.b r1 = r1.J()
            int r3 = r1.q()
            if (r3 <= 0) goto L7d
            int r3 = r3 - r2
            java.lang.Object[] r13 = r1.p()
            r14 = r3
        L50:
            r1 = r13[r14]
            r15 = r1
            Q.p r15 = (Q.p) r15
            boolean r1 = r15.S()
            if (r1 == 0) goto L80
            r1 = r17
            r2 = r15
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r11
            r1.d(r2, r3, r5, r6, r7)
            boolean r1 = r20.s()
            if (r1 != 0) goto L6f
            goto L80
        L6f:
            Q.B r1 = r15.C()
            boolean r1 = r1.Y0()
            if (r1 == 0) goto L7d
            r20.b()
            goto L80
        L7d:
            r1 = r20
            goto L85
        L80:
            int r14 = r14 + (-1)
            if (r14 >= 0) goto L50
            goto L7d
        L85:
            Q.C0686h.j(r1, r12)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.C0688j.G0(Q.B$f, long, Q.h, boolean, boolean):void");
    }

    @Override // Q.B
    public void R0(G.e eVar) {
        H b8 = s.b(p0());
        C6807b J7 = p0().J();
        int q8 = J7.q();
        if (q8 > 0) {
            Object[] p8 = J7.p();
            int i8 = 0;
            do {
                p pVar = (p) p8[i8];
                if (pVar.S()) {
                    pVar.e(eVar);
                }
                i8++;
            } while (i8 < q8);
        }
        if (b8.getShowLayoutBounds()) {
            g0(eVar, f4528M);
        }
    }

    @Override // Q.B
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public N w0() {
        return this.f4529J;
    }

    @Override // O.k
    public O.p j(long j8) {
        E(j8);
        C6807b K7 = p0().K();
        int q8 = K7.q();
        if (q8 > 0) {
            Object[] p8 = K7.p();
            int i8 = 0;
            do {
                ((p) p8[i8]).x().b0(p.g.NotUsed);
                i8++;
            } while (i8 < q8);
        }
        W0(p0().z().a(this, p0().h(), j8));
        P0();
        return this;
    }

    @Override // Q.B
    public w q0() {
        return this.f4530K;
    }
}
