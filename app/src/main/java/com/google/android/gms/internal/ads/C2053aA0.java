package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2053aA0 {

    /* renamed from: a, reason: collision with root package name */
    public final EG0 f20648a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20649b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4678yH0[] f20650c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20651d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20652e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20653f;

    /* renamed from: g, reason: collision with root package name */
    public C2162bA0 f20654g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20655h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f20656i;

    /* renamed from: j, reason: collision with root package name */
    private final CA0[] f20657j;

    /* renamed from: k, reason: collision with root package name */
    private final II0 f20658k;

    /* renamed from: l, reason: collision with root package name */
    private final C3793qA0 f20659l;

    /* renamed from: m, reason: collision with root package name */
    private C2053aA0 f20660m;

    /* renamed from: n, reason: collision with root package name */
    private JH0 f20661n;

    /* renamed from: o, reason: collision with root package name */
    private JI0 f20662o;

    /* renamed from: p, reason: collision with root package name */
    private long f20663p;

    public C2053aA0(CA0[] ca0Arr, long j8, II0 ii0, RI0 ri0, C3793qA0 c3793qA0, C2162bA0 c2162bA0, JI0 ji0, long j9) {
        this.f20657j = ca0Arr;
        this.f20663p = j8;
        this.f20658k = ii0;
        this.f20659l = c3793qA0;
        GG0 gg0 = c2162bA0.f20826a;
        this.f20649b = gg0.f15340a;
        this.f20654g = c2162bA0;
        this.f20661n = JH0.f16220d;
        this.f20662o = ji0;
        this.f20650c = new InterfaceC4678yH0[2];
        this.f20656i = new boolean[2];
        long j10 = c2162bA0.f20827b;
        long j11 = c2162bA0.f20829d;
        EG0 o8 = c3793qA0.o(gg0, ri0, j10);
        this.f20648a = j11 != -9223372036854775807L ? new C3042jG0(o8, true, 0L, j11) : o8;
    }

    private final void u() {
        if (!w()) {
            return;
        }
        int i8 = 0;
        while (true) {
            JI0 ji0 = this.f20662o;
            if (i8 >= ji0.f16224a) {
                return;
            }
            ji0.b(i8);
            BI0 bi0 = this.f20662o.f16226c[i8];
            i8++;
        }
    }

    private final void v() {
        if (!w()) {
            return;
        }
        int i8 = 0;
        while (true) {
            JI0 ji0 = this.f20662o;
            if (i8 >= ji0.f16224a) {
                return;
            }
            ji0.b(i8);
            BI0 bi0 = this.f20662o.f16226c[i8];
            i8++;
        }
    }

    private final boolean w() {
        return this.f20660m == null;
    }

    public final long a(JI0 ji0, long j8, boolean z7) {
        return b(ji0, j8, false, new boolean[2]);
    }

    public final long b(JI0 ji0, long j8, boolean z7, boolean[] zArr) {
        int i8 = 0;
        while (true) {
            boolean z8 = true;
            if (i8 >= ji0.f16224a) {
                break;
            }
            boolean[] zArr2 = this.f20656i;
            if (z7 || !ji0.a(this.f20662o, i8)) {
                z8 = false;
            }
            zArr2[i8] = z8;
            i8++;
        }
        int i9 = 0;
        while (true) {
            CA0[] ca0Arr = this.f20657j;
            if (i9 >= 2) {
                break;
            }
            ca0Arr[i9].zzb();
            i9++;
        }
        u();
        this.f20662o = ji0;
        v();
        long n8 = this.f20648a.n(ji0.f16226c, this.f20656i, this.f20650c, zArr, j8);
        int i10 = 0;
        while (true) {
            CA0[] ca0Arr2 = this.f20657j;
            if (i10 >= 2) {
                break;
            }
            ca0Arr2[i10].zzb();
            i10++;
        }
        this.f20653f = false;
        int i11 = 0;
        while (true) {
            InterfaceC4678yH0[] interfaceC4678yH0Arr = this.f20650c;
            if (i11 >= 2) {
                return n8;
            }
            if (interfaceC4678yH0Arr[i11] != null) {
                AbstractC3796qC.f(ji0.b(i11));
                this.f20657j[i11].zzb();
                this.f20653f = true;
            } else {
                AbstractC3796qC.f(ji0.f16226c[i11] == null);
            }
            i11++;
        }
    }

    public final long c() {
        if (!this.f20652e) {
            return this.f20654g.f20827b;
        }
        long zzb = this.f20653f ? this.f20648a.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.f20654g.f20830e : zzb;
    }

    public final long d() {
        if (this.f20652e) {
            return this.f20648a.a();
        }
        return 0L;
    }

    public final long e() {
        return this.f20663p;
    }

    public final long f() {
        return this.f20654g.f20827b + this.f20663p;
    }

    public final C2053aA0 g() {
        return this.f20660m;
    }

    public final JH0 h() {
        return this.f20661n;
    }

    public final JI0 i() {
        return this.f20662o;
    }

    public final JI0 j(float f8, AbstractC1981Yl abstractC1981Yl, boolean z7) {
        JI0 f9 = this.f20658k.f(this.f20657j, this.f20661n, this.f20654g.f20826a, abstractC1981Yl);
        for (int i8 = 0; i8 < f9.f16224a; i8++) {
            if (f9.b(i8)) {
                if (f9.f16226c[i8] == null) {
                    this.f20657j[i8].zzb();
                    r1 = false;
                }
                AbstractC3796qC.f(r1);
            } else {
                AbstractC3796qC.f(f9.f16226c[i8] == null);
            }
        }
        for (BI0 bi0 : f9.f16226c) {
        }
        return f9;
    }

    public final void k(Yz0 yz0) {
        AbstractC3796qC.f(w());
        this.f20648a.f(yz0);
    }

    public final void l(float f8, AbstractC1981Yl abstractC1981Yl, boolean z7) {
        this.f20652e = true;
        this.f20661n = this.f20648a.e();
        JI0 j8 = j(f8, abstractC1981Yl, z7);
        C2162bA0 c2162bA0 = this.f20654g;
        long j9 = c2162bA0.f20827b;
        long j10 = c2162bA0.f20830e;
        if (j10 != -9223372036854775807L && j9 >= j10) {
            j9 = Math.max(0L, j10 - 1);
        }
        long a8 = a(j8, j9, false);
        long j11 = this.f20663p;
        C2162bA0 c2162bA02 = this.f20654g;
        this.f20663p = j11 + (c2162bA02.f20827b - a8);
        this.f20654g = c2162bA02.b(a8);
    }

    public final void m(DG0 dg0, long j8) {
        this.f20651d = true;
        this.f20648a.o(dg0, j8);
    }

    public final void n(long j8) {
        AbstractC3796qC.f(w());
        if (this.f20652e) {
            this.f20648a.c(j8 - this.f20663p);
        }
    }

    public final void o() {
        u();
        EG0 eg0 = this.f20648a;
        try {
            boolean z7 = eg0 instanceof C3042jG0;
            C3793qA0 c3793qA0 = this.f20659l;
            if (z7) {
                c3793qA0.i(((C3042jG0) eg0).f23225o);
            } else {
                c3793qA0.i(eg0);
            }
        } catch (RuntimeException e8) {
            HL.d("MediaPeriodHolder", "Period release failed.", e8);
        }
    }

    public final void p(C2053aA0 c2053aA0) {
        if (c2053aA0 == this.f20660m) {
            return;
        }
        u();
        this.f20660m = c2053aA0;
        v();
    }

    public final void q(long j8) {
        this.f20663p = j8;
    }

    public final void r() {
        EG0 eg0 = this.f20648a;
        if (eg0 instanceof C3042jG0) {
            long j8 = this.f20654g.f20829d;
            if (j8 == -9223372036854775807L) {
                j8 = Long.MIN_VALUE;
            }
            ((C3042jG0) eg0).l(0L, j8);
        }
    }

    public final boolean s() {
        if (this.f20652e) {
            return !this.f20653f || this.f20648a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean t() {
        if (this.f20652e) {
            return s() || c() - this.f20654g.f20827b >= -9223372036854775807L;
        }
        return false;
    }
}
