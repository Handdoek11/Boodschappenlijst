package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2257c4 {

    /* renamed from: b, reason: collision with root package name */
    private Y0 f21055b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC4207u0 f21056c;

    /* renamed from: d, reason: collision with root package name */
    private X3 f21057d;

    /* renamed from: e, reason: collision with root package name */
    private long f21058e;

    /* renamed from: f, reason: collision with root package name */
    private long f21059f;

    /* renamed from: g, reason: collision with root package name */
    private long f21060g;

    /* renamed from: h, reason: collision with root package name */
    private int f21061h;

    /* renamed from: i, reason: collision with root package name */
    private int f21062i;

    /* renamed from: k, reason: collision with root package name */
    private long f21064k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21065l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21066m;

    /* renamed from: a, reason: collision with root package name */
    private final V3 f21054a = new V3();

    /* renamed from: j, reason: collision with root package name */
    private Z3 f21063j = new Z3();

    protected abstract long a(UQ uq);

    protected void b(boolean z7) {
        int i8;
        if (z7) {
            this.f21063j = new Z3();
            this.f21059f = 0L;
            i8 = 0;
        } else {
            i8 = 1;
        }
        this.f21061h = i8;
        this.f21058e = -1L;
        this.f21060g = 0L;
    }

    protected abstract boolean c(UQ uq, long j8, Z3 z32);

    final int d(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        AbstractC3796qC.b(this.f21055b);
        int i8 = AbstractC2301cW.f21206a;
        int i9 = this.f21061h;
        if (i9 == 0) {
            while (this.f21054a.e(interfaceC3989s0)) {
                long c8 = interfaceC3989s0.c();
                long j8 = this.f21059f;
                this.f21064k = c8 - j8;
                if (c(this.f21054a.a(), j8, this.f21063j)) {
                    this.f21059f = interfaceC3989s0.c();
                } else {
                    D d8 = this.f21063j.f20403a;
                    this.f21062i = d8.f14312E;
                    if (!this.f21066m) {
                        this.f21055b.c(d8);
                        this.f21066m = true;
                    }
                    X3 x32 = this.f21063j.f20404b;
                    if (x32 != null) {
                        this.f21057d = x32;
                    } else if (interfaceC3989s0.d() == -1) {
                        this.f21057d = new C2040a4(null);
                    } else {
                        W3 b8 = this.f21054a.b();
                        this.f21057d = new R3(this, this.f21059f, interfaceC3989s0.d(), b8.f19704d + b8.f19705e, b8.f19702b, (b8.f19701a & 4) != 0);
                    }
                    this.f21061h = 2;
                    this.f21054a.d();
                }
            }
            this.f21061h = 3;
            return -1;
        }
        if (i9 == 1) {
            interfaceC3989s0.D((int) this.f21059f);
            this.f21061h = 2;
            return 0;
        }
        if (i9 != 2) {
            return -1;
        }
        long a8 = this.f21057d.a(interfaceC3989s0);
        if (a8 >= 0) {
            o02.f17813a = a8;
            return 1;
        }
        if (a8 < -1) {
            h(-(a8 + 2));
        }
        if (!this.f21065l) {
            R0 b9 = this.f21057d.b();
            AbstractC3796qC.b(b9);
            this.f21056c.Q(b9);
            this.f21065l = true;
        }
        if (this.f21064k <= 0 && !this.f21054a.e(interfaceC3989s0)) {
            this.f21061h = 3;
            return -1;
        }
        this.f21064k = 0L;
        UQ a9 = this.f21054a.a();
        long a10 = a(a9);
        if (a10 >= 0) {
            long j9 = this.f21060g;
            if (j9 + a10 >= this.f21058e) {
                long e8 = e(j9);
                this.f21055b.a(a9, a9.u());
                this.f21055b.b(e8, 1, a9.u(), 0, null);
                this.f21058e = -1L;
            }
        }
        this.f21060g += a10;
        return 0;
    }

    protected final long e(long j8) {
        return (j8 * 1000000) / this.f21062i;
    }

    protected final long f(long j8) {
        return (this.f21062i * j8) / 1000000;
    }

    final void g(InterfaceC4207u0 interfaceC4207u0, Y0 y02) {
        this.f21056c = interfaceC4207u0;
        this.f21055b = y02;
        b(true);
    }

    protected void h(long j8) {
        this.f21060g = j8;
    }

    final void i(long j8, long j9) {
        this.f21054a.c();
        if (j8 == 0) {
            b(!this.f21065l);
            return;
        }
        if (this.f21061h != 0) {
            long f8 = f(j9);
            this.f21058e = f8;
            X3 x32 = this.f21057d;
            int i8 = AbstractC2301cW.f21206a;
            x32.c(f8);
            this.f21061h = 2;
        }
    }
}
