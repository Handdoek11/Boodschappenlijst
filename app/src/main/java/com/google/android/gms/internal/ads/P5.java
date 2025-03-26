package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class P5 implements InterfaceC3130k6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4217u5 f18129a;

    /* renamed from: b, reason: collision with root package name */
    private final C4144tQ f18130b = new C4144tQ(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    private int f18131c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f18132d;

    /* renamed from: e, reason: collision with root package name */
    private BU f18133e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18134f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18135g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18136h;

    /* renamed from: i, reason: collision with root package name */
    private int f18137i;

    /* renamed from: j, reason: collision with root package name */
    private int f18138j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18139k;

    public P5(InterfaceC4217u5 interfaceC4217u5) {
        this.f18129a = interfaceC4217u5;
    }

    private final void e(int i8) {
        this.f18131c = i8;
        this.f18132d = 0;
    }

    private final boolean f(UQ uq, byte[] bArr, int i8) {
        int min = Math.min(uq.r(), i8 - this.f18132d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            uq.m(min);
        } else {
            uq.h(bArr, this.f18132d, min);
        }
        int i9 = this.f18132d + min;
        this.f18132d = i9;
        return i9 == i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3130k6
    public final void a() {
        this.f18131c = 0;
        this.f18132d = 0;
        this.f18136h = false;
        this.f18129a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3130k6
    public final void b(BU bu, InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        this.f18133e = bu;
        this.f18129a.d(interfaceC4207u0, c3021j6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.google.android.gms.internal.ads.tQ] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.google.android.gms.internal.ads.u5] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3130k6
    public final void c(UQ uq, int i8) {
        int i9;
        boolean z7;
        int i10;
        int i11;
        long j8;
        int i12;
        AbstractC3796qC.b(this.f18133e);
        int i13 = -1;
        int i14 = 2;
        ?? r62 = 0;
        int i15 = 1;
        if ((i8 & 1) != 0) {
            int i16 = this.f18131c;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    int i17 = this.f18138j;
                    if (i17 != -1) {
                        HL.f("PesReader", "Unexpected start indicator: expected " + i17 + " more bytes");
                    }
                    this.f18129a.a(uq.u() == 0);
                } else {
                    HL.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            e(1);
        }
        int i18 = i8;
        while (uq.r() > 0) {
            int i19 = this.f18131c;
            if (i19 == 0) {
                i9 = i14;
                z7 = r62;
                i10 = i15;
                uq.m(uq.r());
            } else if (i19 != i15) {
                if (i19 != i14) {
                    int r8 = uq.r();
                    int i20 = this.f18138j;
                    int i21 = i20 == i13 ? r62 : r8 - i20;
                    if (i21 > 0) {
                        r8 -= i21;
                        uq.k(uq.t() + r8);
                    }
                    this.f18129a.c(uq);
                    int i22 = this.f18138j;
                    if (i22 != i13) {
                        int i23 = i22 - r8;
                        this.f18138j = i23;
                        if (i23 == 0) {
                            this.f18129a.a(r62);
                            e(i15);
                        }
                    }
                } else {
                    if (f(uq, this.f18130b.f26885a, Math.min(10, this.f18137i)) && f(uq, null, this.f18137i)) {
                        this.f18130b.l(r62);
                        if (this.f18134f) {
                            this.f18130b.n(4);
                            long d8 = this.f18130b.d(3);
                            this.f18130b.n(i15);
                            int d9 = this.f18130b.d(15) << 15;
                            this.f18130b.n(i15);
                            long d10 = this.f18130b.d(15);
                            this.f18130b.n(i15);
                            if (this.f18136h || !this.f18135g) {
                                i12 = d9;
                            } else {
                                this.f18130b.n(4);
                                this.f18130b.n(i15);
                                int d11 = this.f18130b.d(15) << 15;
                                this.f18130b.n(i15);
                                long d12 = this.f18130b.d(15);
                                this.f18130b.n(i15);
                                i12 = d9;
                                this.f18133e.b((this.f18130b.d(3) << 30) | d11 | d12);
                                this.f18136h = true;
                            }
                            j8 = this.f18133e.b((d8 << 30) | i12 | d10);
                        } else {
                            j8 = -9223372036854775807L;
                        }
                        i18 |= true != this.f18139k ? 0 : 4;
                        this.f18129a.e(j8, i18);
                        e(3);
                        i13 = -1;
                        i14 = 2;
                        r62 = 0;
                        i15 = 1;
                    }
                }
                i9 = i14;
                z7 = r62;
                i10 = i15;
            } else if (f(uq, this.f18130b.f26885a, 9)) {
                z7 = false;
                this.f18130b.l(0);
                int d13 = this.f18130b.d(24);
                i10 = 1;
                if (d13 != 1) {
                    HL.f("PesReader", "Unexpected start code prefix: " + d13);
                    i13 = -1;
                    this.f18138j = -1;
                    i11 = 0;
                    i9 = 2;
                } else {
                    this.f18130b.n(8);
                    C4144tQ c4144tQ = this.f18130b;
                    int d14 = c4144tQ.d(16);
                    c4144tQ.n(5);
                    this.f18139k = this.f18130b.p();
                    i9 = 2;
                    this.f18130b.n(2);
                    this.f18134f = this.f18130b.p();
                    this.f18135g = this.f18130b.p();
                    this.f18130b.n(6);
                    int d15 = this.f18130b.d(8);
                    this.f18137i = d15;
                    if (d14 == 0) {
                        this.f18138j = -1;
                        i13 = -1;
                    } else {
                        int i24 = (d14 - 3) - d15;
                        this.f18138j = i24;
                        if (i24 < 0) {
                            HL.f("PesReader", "Found negative packet payload size: " + i24);
                            i13 = -1;
                            this.f18138j = -1;
                        } else {
                            i13 = -1;
                        }
                    }
                    i11 = 2;
                }
                e(i11);
            } else {
                i13 = -1;
                z7 = false;
                i10 = 1;
                i9 = 2;
            }
            i15 = i10;
            r62 = z7;
            i14 = i9;
        }
    }

    public final boolean d(boolean z7) {
        return this.f18131c == 3 && this.f18138j == -1;
    }
}
