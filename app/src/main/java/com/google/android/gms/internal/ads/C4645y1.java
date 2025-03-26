package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4645y1 implements InterfaceC3880r0 {

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4207u0 f27964d;

    /* renamed from: e, reason: collision with root package name */
    private Y0 f27965e;

    /* renamed from: g, reason: collision with root package name */
    private C3503nb f27967g;

    /* renamed from: h, reason: collision with root package name */
    private C0 f27968h;

    /* renamed from: i, reason: collision with root package name */
    private int f27969i;

    /* renamed from: j, reason: collision with root package name */
    private int f27970j;

    /* renamed from: k, reason: collision with root package name */
    private C4536x1 f27971k;

    /* renamed from: l, reason: collision with root package name */
    private int f27972l;

    /* renamed from: m, reason: collision with root package name */
    private long f27973m;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f27961a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final UQ f27962b = new UQ(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    private final C4534x0 f27963c = new C4534x0();

    /* renamed from: f, reason: collision with root package name */
    private int f27966f = 0;

    public C4645y1(int i8) {
    }

    private final long b(UQ uq, boolean z7) {
        boolean z8;
        this.f27968h.getClass();
        int t7 = uq.t();
        while (t7 <= uq.u() - 16) {
            uq.l(t7);
            if (AbstractC4643y0.c(uq, this.f27968h, this.f27970j, this.f27963c)) {
                uq.l(t7);
                return this.f27963c.f27706a;
            }
            t7++;
        }
        if (!z7) {
            uq.l(t7);
            return -1L;
        }
        while (t7 <= uq.u() - this.f27969i) {
            uq.l(t7);
            try {
                z8 = AbstractC4643y0.c(uq, this.f27968h, this.f27970j, this.f27963c);
            } catch (IndexOutOfBoundsException unused) {
                z8 = false;
            }
            if (uq.t() <= uq.u() && z8) {
                uq.l(t7);
                return this.f27963c.f27706a;
            }
            t7++;
        }
        uq.l(uq.u());
        return -1L;
    }

    private final void c() {
        long j8 = this.f27973m * 1000000;
        C0 c02 = this.f27968h;
        int i8 = AbstractC2301cW.f21206a;
        this.f27965e.b(j8 / c02.f14055e, 1, this.f27972l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return AbstractC4169th0.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void f(long j8, long j9) {
        if (j8 == 0) {
            this.f27966f = 0;
        } else {
            C4536x1 c4536x1 = this.f27971k;
            if (c4536x1 != null) {
                c4536x1.d(j9);
            }
        }
        this.f27973m = j9 != 0 ? -1L : 0L;
        this.f27972l = 0;
        this.f27962b.i(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        boolean p8;
        R0 q02;
        boolean z7;
        int i8 = this.f27966f;
        if (i8 == 0) {
            interfaceC3989s0.h();
            long b8 = interfaceC3989s0.b();
            C3503nb a8 = AbstractC4752z0.a(interfaceC3989s0, true);
            interfaceC3989s0.D((int) (interfaceC3989s0.b() - b8));
            this.f27967g = a8;
            this.f27966f = 1;
            return 0;
        }
        if (i8 == 1) {
            interfaceC3989s0.I(this.f27961a, 0, 42);
            interfaceC3989s0.h();
            this.f27966f = 2;
            return 0;
        }
        if (i8 == 2) {
            UQ uq = new UQ(4);
            interfaceC3989s0.H(uq.n(), 0, 4);
            if (uq.K() != 1716281667) {
                throw zzbc.a("Failed to read FLAC stream marker.", null);
            }
            this.f27966f = 3;
            return 0;
        }
        if (i8 == 3) {
            C0 c02 = this.f27968h;
            do {
                interfaceC3989s0.h();
                C4144tQ c4144tQ = new C4144tQ(new byte[4], 4);
                interfaceC3989s0.I(c4144tQ.f26885a, 0, 4);
                p8 = c4144tQ.p();
                int d8 = c4144tQ.d(7);
                int d9 = c4144tQ.d(24) + 4;
                if (d8 == 0) {
                    byte[] bArr = new byte[38];
                    interfaceC3989s0.H(bArr, 0, 38);
                    c02 = new C0(bArr, 4);
                } else {
                    if (c02 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (d8 == 3) {
                        UQ uq2 = new UQ(d9);
                        interfaceC3989s0.H(uq2.n(), 0, d9);
                        c02 = c02.f(AbstractC4752z0.b(uq2));
                    } else if (d8 == 4) {
                        UQ uq3 = new UQ(d9);
                        interfaceC3989s0.H(uq3.n(), 0, d9);
                        uq3.m(4);
                        c02 = c02.g(Arrays.asList(AbstractC2468e1.c(uq3, false, false).f20802a));
                    } else if (d8 == 6) {
                        UQ uq4 = new UQ(d9);
                        interfaceC3989s0.H(uq4.n(), 0, d9);
                        uq4.m(4);
                        c02 = c02.e(AbstractC4169th0.x(T1.a(uq4)));
                    } else {
                        interfaceC3989s0.D(d9);
                    }
                }
                int i9 = AbstractC2301cW.f21206a;
                this.f27968h = c02;
            } while (!p8);
            c02.getClass();
            this.f27969i = Math.max(c02.f14053c, 6);
            this.f27965e.c(this.f27968h.c(this.f27961a, this.f27967g));
            this.f27966f = 4;
            return 0;
        }
        if (i8 == 4) {
            interfaceC3989s0.h();
            UQ uq5 = new UQ(2);
            interfaceC3989s0.I(uq5.n(), 0, 2);
            int G7 = uq5.G();
            if ((G7 >> 2) != 16382) {
                interfaceC3989s0.h();
                throw zzbc.a("First frame does not start with sync code.", null);
            }
            interfaceC3989s0.h();
            this.f27970j = G7;
            InterfaceC4207u0 interfaceC4207u0 = this.f27964d;
            int i10 = AbstractC2301cW.f21206a;
            long c8 = interfaceC3989s0.c();
            long d10 = interfaceC3989s0.d();
            C0 c03 = this.f27968h;
            c03.getClass();
            if (c03.f14061k != null) {
                q02 = new A0(c03, c8);
            } else if (d10 == -1 || c03.f14060j <= 0) {
                q02 = new Q0(c03.a(), 0L);
            } else {
                C4536x1 c4536x1 = new C4536x1(c03, this.f27970j, c8, d10);
                this.f27971k = c4536x1;
                q02 = c4536x1.b();
            }
            interfaceC4207u0.Q(q02);
            this.f27966f = 5;
            return 0;
        }
        this.f27965e.getClass();
        C0 c04 = this.f27968h;
        c04.getClass();
        C4536x1 c4536x12 = this.f27971k;
        if (c4536x12 != null && c4536x12.e()) {
            return c4536x12.a(interfaceC3989s0, o02);
        }
        if (this.f27973m == -1) {
            this.f27973m = AbstractC4643y0.b(interfaceC3989s0, c04);
            return 0;
        }
        UQ uq6 = this.f27962b;
        int u7 = uq6.u();
        if (u7 < 32768) {
            int C7 = interfaceC3989s0.C(uq6.n(), u7, 32768 - u7);
            z7 = C7 == -1;
            if (!z7) {
                this.f27962b.k(u7 + C7);
            } else if (this.f27962b.r() == 0) {
                c();
                return -1;
            }
        } else {
            z7 = false;
        }
        UQ uq7 = this.f27962b;
        int t7 = uq7.t();
        int i11 = this.f27972l;
        int i12 = this.f27969i;
        if (i11 < i12) {
            uq7.m(Math.min(i12 - i11, uq7.r()));
        }
        long b9 = b(this.f27962b, z7);
        UQ uq8 = this.f27962b;
        int t8 = uq8.t() - t7;
        uq8.l(t7);
        this.f27965e.a(this.f27962b, t8);
        this.f27972l += t8;
        if (b9 != -1) {
            c();
            this.f27972l = 0;
            this.f27973m = b9;
        }
        UQ uq9 = this.f27962b;
        if (uq9.r() >= 16) {
            return 0;
        }
        int r8 = uq9.r();
        System.arraycopy(uq9.n(), uq9.t(), uq9.n(), 0, r8);
        this.f27962b.l(0);
        this.f27962b.k(r8);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        AbstractC4752z0.a(interfaceC3989s0, false);
        UQ uq = new UQ(4);
        ((C2684g0) interfaceC3989s0).G(uq.n(), 0, 4, false);
        return uq.K() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f27964d = interfaceC4207u0;
        this.f27965e = interfaceC4207u0.R(0, 1);
        interfaceC4207u0.P();
    }
}
