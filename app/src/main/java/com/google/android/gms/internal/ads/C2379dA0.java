package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2379dA0 {

    /* renamed from: c, reason: collision with root package name */
    private final JA0 f21455c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2068aI f21456d;

    /* renamed from: e, reason: collision with root package name */
    private long f21457e;

    /* renamed from: f, reason: collision with root package name */
    private int f21458f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21459g;

    /* renamed from: h, reason: collision with root package name */
    private C2139az0 f21460h;

    /* renamed from: i, reason: collision with root package name */
    private C2053aA0 f21461i;

    /* renamed from: j, reason: collision with root package name */
    private C2053aA0 f21462j;

    /* renamed from: k, reason: collision with root package name */
    private C2053aA0 f21463k;

    /* renamed from: l, reason: collision with root package name */
    private C2053aA0 f21464l;

    /* renamed from: m, reason: collision with root package name */
    private int f21465m;

    /* renamed from: n, reason: collision with root package name */
    private Object f21466n;

    /* renamed from: o, reason: collision with root package name */
    private long f21467o;

    /* renamed from: q, reason: collision with root package name */
    private final Jz0 f21469q;

    /* renamed from: a, reason: collision with root package name */
    private final C1945Xk f21453a = new C1945Xk();

    /* renamed from: b, reason: collision with root package name */
    private final C4721yl f21454b = new C4721yl();

    /* renamed from: p, reason: collision with root package name */
    private List f21468p = new ArrayList();

    public C2379dA0(JA0 ja0, InterfaceC2068aI interfaceC2068aI, Jz0 jz0, C2139az0 c2139az0) {
        this.f21455c = ja0;
        this.f21456d = interfaceC2068aI;
        this.f21469q = jz0;
        this.f21460h = c2139az0;
    }

    static boolean C(long j8, long j9) {
        return j8 == -9223372036854775807L || j8 == j9;
    }

    private final long K(AbstractC1981Yl abstractC1981Yl, Object obj, int i8) {
        abstractC1981Yl.n(obj, this.f21453a);
        this.f21453a.g(i8);
        long j8 = this.f21453a.f20122g.a(i8).f20609g;
        return 0L;
    }

    private final long a(Object obj) {
        for (int i8 = 0; i8 < this.f21468p.size(); i8++) {
            C2053aA0 c2053aA0 = (C2053aA0) this.f21468p.get(i8);
            if (c2053aA0.f20649b.equals(obj)) {
                return c2053aA0.f20654g.f20826a.f15343d;
            }
        }
        return -1L;
    }

    private final C2162bA0 b(AbstractC1981Yl abstractC1981Yl, C2053aA0 c2053aA0, long j8) {
        long j9;
        C2162bA0 c2162bA0 = c2053aA0.f20654g;
        long e8 = (c2053aA0.e() + c2162bA0.f20830e) - j8;
        if (c2162bA0.f20832g) {
            long j10 = 0;
            int i8 = abstractC1981Yl.i(abstractC1981Yl.a(c2162bA0.f20826a.f15340a), this.f21453a, this.f21454b, this.f21458f, this.f21459g);
            if (i8 != -1) {
                int i9 = abstractC1981Yl.d(i8, this.f21453a, true).f20118c;
                Object obj = this.f21453a.f20117b;
                obj.getClass();
                long j11 = c2162bA0.f20826a.f15343d;
                if (abstractC1981Yl.e(i9, this.f21454b, 0L).f28196m == i8) {
                    Pair m8 = abstractC1981Yl.m(this.f21454b, this.f21453a, i9, -9223372036854775807L, Math.max(0L, e8));
                    if (m8 != null) {
                        obj = m8.first;
                        long longValue = ((Long) m8.second).longValue();
                        C2053aA0 g8 = c2053aA0.g();
                        if (g8 == null || !g8.f20649b.equals(obj)) {
                            j11 = a(obj);
                            if (j11 == -1) {
                                j11 = this.f21457e;
                                this.f21457e = 1 + j11;
                            }
                        } else {
                            j11 = g8.f20654g.f20826a.f15343d;
                        }
                        j9 = longValue;
                        j10 = -9223372036854775807L;
                    }
                } else {
                    j9 = 0;
                }
                GG0 f8 = f(abstractC1981Yl, obj, j9, j11, this.f21454b, this.f21453a);
                if (j10 != -9223372036854775807L && c2162bA0.f20828c != -9223372036854775807L) {
                    abstractC1981Yl.n(c2162bA0.f20826a.f15340a, this.f21453a).b();
                    int i10 = this.f21453a.f20122g.f25004c;
                }
                return c(abstractC1981Yl, f8, j10, j9);
            }
        } else {
            GG0 gg0 = c2162bA0.f20826a;
            abstractC1981Yl.n(gg0.f15340a, this.f21453a);
            if (!gg0.b()) {
                int i11 = gg0.f15344e;
                if (i11 != -1) {
                    this.f21453a.j(i11);
                }
                C1945Xk c1945Xk = this.f21453a;
                int i12 = gg0.f15344e;
                int e9 = c1945Xk.e(i12);
                c1945Xk.k(i12);
                if (e9 != this.f21453a.a(gg0.f15344e)) {
                    return d(abstractC1981Yl, gg0.f15340a, gg0.f15344e, e9, c2162bA0.f20830e, gg0.f15343d);
                }
                K(abstractC1981Yl, gg0.f15340a, gg0.f15344e);
                return e(abstractC1981Yl, gg0.f15340a, 0L, c2162bA0.f20830e, gg0.f15343d);
            }
            int i13 = gg0.f15341b;
            if (this.f21453a.a(i13) != -1) {
                int a8 = this.f21453a.f20122g.a(i13).a(gg0.f15342c);
                if (a8 < 0) {
                    return d(abstractC1981Yl, gg0.f15340a, i13, a8, c2162bA0.f20828c, gg0.f15343d);
                }
                long j12 = c2162bA0.f20828c;
                if (j12 == -9223372036854775807L) {
                    C4721yl c4721yl = this.f21454b;
                    C1945Xk c1945Xk2 = this.f21453a;
                    Pair m9 = abstractC1981Yl.m(c4721yl, c1945Xk2, c1945Xk2.f20118c, -9223372036854775807L, Math.max(0L, e8));
                    if (m9 != null) {
                        j12 = ((Long) m9.second).longValue();
                    }
                }
                K(abstractC1981Yl, gg0.f15340a, gg0.f15341b);
                return e(abstractC1981Yl, gg0.f15340a, Math.max(0L, j12), c2162bA0.f20828c, gg0.f15343d);
            }
        }
        return null;
    }

    private final C2162bA0 c(AbstractC1981Yl abstractC1981Yl, GG0 gg0, long j8, long j9) {
        abstractC1981Yl.n(gg0.f15340a, this.f21453a);
        return gg0.b() ? d(abstractC1981Yl, gg0.f15340a, gg0.f15341b, gg0.f15342c, j8, gg0.f15343d) : e(abstractC1981Yl, gg0.f15340a, j9, j8, gg0.f15343d);
    }

    private final C2162bA0 d(AbstractC1981Yl abstractC1981Yl, Object obj, int i8, int i9, long j8, long j9) {
        GG0 gg0 = new GG0(obj, i8, i9, j9);
        long f8 = abstractC1981Yl.n(gg0.f15340a, this.f21453a).f(gg0.f15341b, gg0.f15342c);
        if (i9 == this.f21453a.e(i8)) {
            this.f21453a.h();
        }
        this.f21453a.k(gg0.f15341b);
        return new C2162bA0(gg0, (f8 == -9223372036854775807L || f8 > 0) ? 0L : Math.max(0L, (-1) + f8), j8, -9223372036854775807L, f8, false, false, false, false);
    }

    private final C2162bA0 e(AbstractC1981Yl abstractC1981Yl, Object obj, long j8, long j9, long j10) {
        long j11;
        long j12;
        long j13;
        long j14 = j8;
        abstractC1981Yl.n(obj, this.f21453a);
        int c8 = this.f21453a.c(j14);
        if (c8 != -1) {
            this.f21453a.j(c8);
        }
        if (c8 == -1) {
            this.f21453a.b();
        } else {
            this.f21453a.k(c8);
        }
        GG0 gg0 = new GG0(obj, j10, c8);
        boolean k8 = k(gg0);
        boolean i8 = i(abstractC1981Yl, gg0);
        boolean h8 = h(abstractC1981Yl, gg0, k8);
        if (c8 != -1) {
            this.f21453a.k(c8);
        }
        if (c8 != -1) {
            this.f21453a.g(c8);
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        if (j11 != -9223372036854775807L) {
            j12 = 0;
            j13 = 0;
        } else {
            j12 = j11;
            j13 = this.f21453a.f20119d;
        }
        if (j13 != -9223372036854775807L && j14 >= j13) {
            j14 = Math.max(0L, j13 - 1);
        }
        return new C2162bA0(gg0, j14, j9, j12, j13, false, k8, i8, h8);
    }

    private static GG0 f(AbstractC1981Yl abstractC1981Yl, Object obj, long j8, long j9, C4721yl c4721yl, C1945Xk c1945Xk) {
        abstractC1981Yl.n(obj, c1945Xk);
        abstractC1981Yl.e(c1945Xk.f20118c, c4721yl, 0L);
        abstractC1981Yl.a(obj);
        c1945Xk.b();
        abstractC1981Yl.n(obj, c1945Xk);
        int d8 = c1945Xk.d(j8);
        return d8 == -1 ? new GG0(obj, j9, c1945Xk.c(j8)) : new GG0(obj, d8, c1945Xk.e(d8), j9);
    }

    private final void g() {
        final C3843qh0 c3843qh0 = new C3843qh0();
        for (C2053aA0 c2053aA0 = this.f21461i; c2053aA0 != null; c2053aA0 = c2053aA0.g()) {
            c3843qh0.g(c2053aA0.f20654g.f20826a);
        }
        C2053aA0 c2053aA02 = this.f21462j;
        final GG0 gg0 = c2053aA02 == null ? null : c2053aA02.f20654g.f20826a;
        this.f21456d.j(new Runnable() { // from class: com.google.android.gms.internal.ads.cA0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21086o.x(c3843qh0, gg0);
            }
        });
    }

    private final boolean h(AbstractC1981Yl abstractC1981Yl, GG0 gg0, boolean z7) {
        int a8 = abstractC1981Yl.a(gg0.f15340a);
        return !abstractC1981Yl.e(abstractC1981Yl.d(a8, this.f21453a, false).f20118c, this.f21454b, 0L).f28191h && abstractC1981Yl.i(a8, this.f21453a, this.f21454b, this.f21458f, this.f21459g) == -1 && z7;
    }

    private final boolean i(AbstractC1981Yl abstractC1981Yl, GG0 gg0) {
        if (k(gg0)) {
            return abstractC1981Yl.e(abstractC1981Yl.n(gg0.f15340a, this.f21453a).f20118c, this.f21454b, 0L).f28197n == abstractC1981Yl.a(gg0.f15340a);
        }
        return false;
    }

    private final boolean j(AbstractC1981Yl abstractC1981Yl) {
        C2053aA0 c2053aA0 = this.f21461i;
        if (c2053aA0 == null) {
            return true;
        }
        int a8 = abstractC1981Yl.a(c2053aA0.f20649b);
        while (true) {
            a8 = abstractC1981Yl.i(a8, this.f21453a, this.f21454b, this.f21458f, this.f21459g);
            while (true) {
                c2053aA0.getClass();
                if (c2053aA0.g() == null || c2053aA0.f20654g.f20832g) {
                    break;
                }
                c2053aA0 = c2053aA0.g();
            }
            C2053aA0 g8 = c2053aA0.g();
            if (a8 == -1 || g8 == null || abstractC1981Yl.a(g8.f20649b) != a8) {
                break;
            }
            c2053aA0 = g8;
        }
        boolean F7 = F(c2053aA0);
        c2053aA0.f20654g = u(abstractC1981Yl, c2053aA0.f20654g);
        return !F7;
    }

    private static final boolean k(GG0 gg0) {
        return !gg0.b() && gg0.f15344e == -1;
    }

    public final void A() {
        if (this.f21468p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.f21468p.size(); i8++) {
            ((C2053aA0) this.f21468p.get(i8)).o();
        }
        this.f21468p = arrayList;
        this.f21464l = null;
        y();
    }

    public final void B(AbstractC1981Yl abstractC1981Yl, C2139az0 c2139az0) {
        this.f21460h = c2139az0;
        long j8 = c2139az0.f20797a;
        A();
    }

    public final boolean D(EG0 eg0) {
        C2053aA0 c2053aA0 = this.f21463k;
        return c2053aA0 != null && c2053aA0.f20648a == eg0;
    }

    public final boolean E(EG0 eg0) {
        C2053aA0 c2053aA0 = this.f21464l;
        return c2053aA0 != null && c2053aA0.f20648a == eg0;
    }

    public final boolean F(C2053aA0 c2053aA0) {
        AbstractC3796qC.b(c2053aA0);
        boolean z7 = false;
        if (c2053aA0.equals(this.f21463k)) {
            return false;
        }
        this.f21463k = c2053aA0;
        while (c2053aA0.g() != null) {
            c2053aA0 = c2053aA0.g();
            c2053aA0.getClass();
            if (c2053aA0 == this.f21462j) {
                this.f21462j = this.f21461i;
                z7 = true;
            }
            c2053aA0.o();
            this.f21465m--;
        }
        C2053aA0 c2053aA02 = this.f21463k;
        c2053aA02.getClass();
        c2053aA02.p(null);
        g();
        return z7;
    }

    public final boolean G() {
        C2053aA0 c2053aA0 = this.f21463k;
        if (c2053aA0 == null) {
            return true;
        }
        if (c2053aA0.f20654g.f20834i || !c2053aA0.s() || this.f21463k.f20654g.f20830e == -9223372036854775807L) {
            return false;
        }
        return this.f21465m < 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H(com.google.android.gms.internal.ads.AbstractC1981Yl r16, long r17, long r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            com.google.android.gms.internal.ads.aA0 r2 = r0.f21461i
            r3 = 0
        L6:
            r4 = 1
            if (r2 == 0) goto L93
            com.google.android.gms.internal.ads.bA0 r5 = r2.f20654g
            r6 = 0
            if (r3 != 0) goto L15
            com.google.android.gms.internal.ads.bA0 r3 = r15.u(r1, r5)
            r7 = r17
            goto L38
        L15:
            r7 = r17
            com.google.android.gms.internal.ads.bA0 r9 = r15.b(r1, r3, r7)
            if (r9 != 0) goto L25
            boolean r1 = r15.F(r3)
            if (r1 != 0) goto L24
            return r4
        L24:
            return r6
        L25:
            long r10 = r5.f20827b
            long r12 = r9.f20827b
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L8b
            com.google.android.gms.internal.ads.GG0 r10 = r5.f20826a
            com.google.android.gms.internal.ads.GG0 r11 = r9.f20826a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8b
            r3 = r9
        L38:
            long r9 = r5.f20828c
            com.google.android.gms.internal.ads.bA0 r9 = r3.a(r9)
            r2.f20654g = r9
            long r9 = r5.f20830e
            long r11 = r3.f20830e
            boolean r5 = C(r9, r11)
            if (r5 != 0) goto L82
            r2.r()
            long r7 = r3.f20830e
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L5e
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L63
        L5e:
            long r9 = r2.e()
            long r7 = r7 + r9
        L63:
            com.google.android.gms.internal.ads.aA0 r1 = r0.f21462j
            if (r2 != r1) goto L77
            com.google.android.gms.internal.ads.bA0 r1 = r2.f20654g
            boolean r1 = r1.f20831f
            r9 = -9223372036854775808
            int r1 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r1 == 0) goto L75
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 < 0) goto L77
        L75:
            r1 = r4
            goto L78
        L77:
            r1 = r6
        L78:
            boolean r2 = r15.F(r2)
            if (r2 != 0) goto L81
            if (r1 != 0) goto L81
            return r4
        L81:
            return r6
        L82:
            com.google.android.gms.internal.ads.aA0 r3 = r2.g()
            r14 = r3
            r3 = r2
            r2 = r14
            goto L6
        L8b:
            boolean r1 = r15.F(r3)
            if (r1 != 0) goto L92
            return r4
        L92:
            return r6
        L93:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2379dA0.H(com.google.android.gms.internal.ads.Yl, long, long):boolean");
    }

    public final boolean I(AbstractC1981Yl abstractC1981Yl, int i8) {
        this.f21458f = i8;
        return j(abstractC1981Yl);
    }

    public final boolean J(AbstractC1981Yl abstractC1981Yl, boolean z7) {
        this.f21459g = z7;
        return j(abstractC1981Yl);
    }

    public final C2053aA0 l() {
        C2053aA0 c2053aA0 = this.f21461i;
        if (c2053aA0 == null) {
            return null;
        }
        if (c2053aA0 == this.f21462j) {
            this.f21462j = c2053aA0.g();
        }
        c2053aA0.o();
        int i8 = this.f21465m - 1;
        this.f21465m = i8;
        if (i8 == 0) {
            this.f21463k = null;
            C2053aA0 c2053aA02 = this.f21461i;
            this.f21466n = c2053aA02.f20649b;
            this.f21467o = c2053aA02.f20654g.f20826a.f15343d;
        }
        this.f21461i = this.f21461i.g();
        g();
        return this.f21461i;
    }

    public final C2053aA0 m() {
        C2053aA0 c2053aA0 = this.f21462j;
        AbstractC3796qC.b(c2053aA0);
        this.f21462j = c2053aA0.g();
        g();
        C2053aA0 c2053aA02 = this.f21462j;
        AbstractC3796qC.b(c2053aA02);
        return c2053aA02;
    }

    public final C2053aA0 n(C2162bA0 c2162bA0) {
        C2053aA0 c2053aA0;
        C2053aA0 c2053aA02 = this.f21463k;
        long e8 = c2053aA02 == null ? 1000000000000L : (c2053aA02.e() + c2053aA02.f20654g.f20830e) - c2162bA0.f20827b;
        int i8 = 0;
        while (true) {
            if (i8 >= this.f21468p.size()) {
                c2053aA0 = null;
                break;
            }
            C2162bA0 c2162bA02 = ((C2053aA0) this.f21468p.get(i8)).f20654g;
            if (C(c2162bA02.f20830e, c2162bA0.f20830e) && c2162bA02.f20827b == c2162bA0.f20827b && c2162bA02.f20826a.equals(c2162bA0.f20826a)) {
                c2053aA0 = (C2053aA0) this.f21468p.remove(i8);
                break;
            }
            i8++;
        }
        if (c2053aA0 == null) {
            c2053aA0 = Sz0.Y(this.f21469q.f16488a, c2162bA0, e8);
        } else {
            c2053aA0.f20654g = c2162bA0;
            c2053aA0.q(e8);
        }
        C2053aA0 c2053aA03 = this.f21463k;
        if (c2053aA03 != null) {
            c2053aA03.p(c2053aA0);
        } else {
            this.f21461i = c2053aA0;
            this.f21462j = c2053aA0;
        }
        this.f21466n = null;
        this.f21463k = c2053aA0;
        this.f21465m++;
        g();
        return c2053aA0;
    }

    public final C2053aA0 o() {
        return this.f21463k;
    }

    public final C2053aA0 p() {
        return this.f21461i;
    }

    public final C2053aA0 q(EG0 eg0) {
        for (int i8 = 0; i8 < this.f21468p.size(); i8++) {
            C2053aA0 c2053aA0 = (C2053aA0) this.f21468p.get(i8);
            if (c2053aA0.f20648a == eg0) {
                return c2053aA0;
            }
        }
        return null;
    }

    public final C2053aA0 r() {
        return this.f21464l;
    }

    public final C2053aA0 s() {
        return this.f21462j;
    }

    public final C2162bA0 t(long j8, C3901rA0 c3901rA0) {
        C2053aA0 c2053aA0 = this.f21463k;
        return c2053aA0 == null ? c(c3901rA0.f26111a, c3901rA0.f26112b, c3901rA0.f26113c, c3901rA0.f26129s) : b(c3901rA0.f26111a, c2053aA0, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C2162bA0 u(com.google.android.gms.internal.ads.AbstractC1981Yl r19, com.google.android.gms.internal.ads.C2162bA0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.GG0 r3 = r2.f20826a
            boolean r12 = k(r3)
            boolean r13 = r0.i(r1, r3)
            boolean r14 = r0.h(r1, r3, r12)
            com.google.android.gms.internal.ads.GG0 r4 = r2.f20826a
            java.lang.Object r4 = r4.f15340a
            com.google.android.gms.internal.ads.Xk r5 = r0.f21453a
            r1.n(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2f
            int r1 = r3.f15344e
            if (r1 != r4) goto L31
        L2f:
            r9 = r7
            goto L37
        L31:
            com.google.android.gms.internal.ads.Xk r9 = r0.f21453a
            r9.g(r1)
            r9 = r5
        L37:
            boolean r1 = r3.b()
            if (r1 == 0) goto L4a
            com.google.android.gms.internal.ads.Xk r1 = r0.f21453a
            int r5 = r3.f15341b
            int r6 = r3.f15342c
            long r5 = r1.f(r5, r6)
        L47:
            r7 = r9
            r9 = r5
            goto L56
        L4a:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L51
            r7 = r5
            r9 = r7
            goto L56
        L51:
            com.google.android.gms.internal.ads.Xk r1 = r0.f21453a
            long r5 = r1.f20119d
            goto L47
        L56:
            boolean r1 = r3.b()
            if (r1 == 0) goto L64
            com.google.android.gms.internal.ads.Xk r1 = r0.f21453a
            int r4 = r3.f15341b
            r1.k(r4)
            goto L6d
        L64:
            int r1 = r3.f15344e
            if (r1 == r4) goto L6d
            com.google.android.gms.internal.ads.Xk r4 = r0.f21453a
            r4.k(r1)
        L6d:
            com.google.android.gms.internal.ads.bA0 r15 = new com.google.android.gms.internal.ads.bA0
            long r4 = r2.f20827b
            long r1 = r2.f20828c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2379dA0.u(com.google.android.gms.internal.ads.Yl, com.google.android.gms.internal.ads.bA0):com.google.android.gms.internal.ads.bA0");
    }

    public final GG0 v(AbstractC1981Yl abstractC1981Yl, Object obj, long j8) {
        long a8;
        int a9;
        int i8 = abstractC1981Yl.n(obj, this.f21453a).f20118c;
        Object obj2 = this.f21466n;
        if (obj2 == null || (a9 = abstractC1981Yl.a(obj2)) == -1 || abstractC1981Yl.d(a9, this.f21453a, false).f20118c != i8) {
            C2053aA0 c2053aA0 = this.f21461i;
            while (true) {
                if (c2053aA0 == null) {
                    C2053aA0 c2053aA02 = this.f21461i;
                    while (true) {
                        if (c2053aA02 != null) {
                            int a10 = abstractC1981Yl.a(c2053aA02.f20649b);
                            if (a10 != -1 && abstractC1981Yl.d(a10, this.f21453a, false).f20118c == i8) {
                                a8 = c2053aA02.f20654g.f20826a.f15343d;
                                break;
                            }
                            c2053aA02 = c2053aA02.g();
                        } else {
                            a8 = a(obj);
                            if (a8 == -1) {
                                a8 = this.f21457e;
                                this.f21457e = 1 + a8;
                                if (this.f21461i == null) {
                                    this.f21466n = obj;
                                    this.f21467o = a8;
                                }
                            }
                        }
                    }
                } else {
                    if (c2053aA0.f20649b.equals(obj)) {
                        a8 = c2053aA0.f20654g.f20826a.f15343d;
                        break;
                    }
                    c2053aA0 = c2053aA0.g();
                }
            }
        } else {
            a8 = this.f21467o;
        }
        long j9 = a8;
        abstractC1981Yl.n(obj, this.f21453a);
        abstractC1981Yl.e(this.f21453a.f20118c, this.f21454b, 0L);
        int a11 = abstractC1981Yl.a(obj);
        Object obj3 = obj;
        while (true) {
            C4721yl c4721yl = this.f21454b;
            if (a11 < c4721yl.f28196m) {
                return f(abstractC1981Yl, obj3, j8, j9, c4721yl, this.f21453a);
            }
            abstractC1981Yl.d(a11, this.f21453a, true);
            this.f21453a.b();
            C1945Xk c1945Xk = this.f21453a;
            if (c1945Xk.d(c1945Xk.f20119d) != -1) {
                obj3 = this.f21453a.f20117b;
                obj3.getClass();
            }
            a11--;
        }
    }

    public final void w() {
        if (this.f21465m == 0) {
            return;
        }
        C2053aA0 c2053aA0 = this.f21461i;
        AbstractC3796qC.b(c2053aA0);
        this.f21466n = c2053aA0.f20649b;
        this.f21467o = c2053aA0.f20654g.f20826a.f15343d;
        while (c2053aA0 != null) {
            c2053aA0.o();
            c2053aA0 = c2053aA0.g();
        }
        this.f21461i = null;
        this.f21463k = null;
        this.f21462j = null;
        this.f21465m = 0;
        g();
    }

    final /* synthetic */ void x(C3843qh0 c3843qh0, GG0 gg0) {
        this.f21455c.n(c3843qh0.j(), gg0);
    }

    public final void y() {
        C2053aA0 c2053aA0 = this.f21464l;
        if (c2053aA0 == null || c2053aA0.t()) {
            this.f21464l = null;
            for (int i8 = 0; i8 < this.f21468p.size(); i8++) {
                C2053aA0 c2053aA02 = (C2053aA0) this.f21468p.get(i8);
                if (!c2053aA02.t()) {
                    this.f21464l = c2053aA02;
                    return;
                }
            }
        }
    }

    public final void z(long j8) {
        C2053aA0 c2053aA0 = this.f21463k;
        if (c2053aA0 != null) {
            c2053aA0.n(j8);
        }
    }
}
