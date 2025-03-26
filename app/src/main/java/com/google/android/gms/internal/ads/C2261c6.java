package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2261c6 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f21071c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21072d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21073e;

    /* renamed from: a, reason: collision with root package name */
    private final BU f21069a = new BU(0);

    /* renamed from: f, reason: collision with root package name */
    private long f21074f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f21075g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f21076h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final UQ f21070b = new UQ();

    C2261c6(int i8) {
    }

    private final int e(InterfaceC3989s0 interfaceC3989s0) {
        byte[] bArr = AbstractC2301cW.f21211f;
        int length = bArr.length;
        this.f21070b.j(bArr, 0);
        this.f21071c = true;
        interfaceC3989s0.h();
        return 0;
    }

    public final int a(InterfaceC3989s0 interfaceC3989s0, O0 o02, int i8) {
        if (i8 <= 0) {
            e(interfaceC3989s0);
            return 0;
        }
        long j8 = -9223372036854775807L;
        if (!this.f21073e) {
            long d8 = interfaceC3989s0.d();
            int min = (int) Math.min(112800L, d8);
            long j9 = d8 - min;
            if (interfaceC3989s0.c() == j9) {
                this.f21070b.i(min);
                interfaceC3989s0.h();
                interfaceC3989s0.I(this.f21070b.n(), 0, min);
                UQ uq = this.f21070b;
                int t7 = uq.t();
                int u7 = uq.u();
                int i9 = u7 - 188;
                while (true) {
                    if (i9 < t7) {
                        break;
                    }
                    byte[] n8 = uq.n();
                    int i10 = -4;
                    int i11 = 0;
                    while (true) {
                        if (i10 > 4) {
                            break;
                        }
                        int i12 = (i10 * 188) + i9;
                        if (i12 < t7 || i12 >= u7 || n8[i12] != 71) {
                            i11 = 0;
                        } else {
                            i11++;
                            if (i11 == 5) {
                                long b8 = AbstractC3239l6.b(uq, i9, i8);
                                if (b8 != -9223372036854775807L) {
                                    j8 = b8;
                                    break;
                                }
                            }
                        }
                        i10++;
                    }
                    i9--;
                }
                this.f21075g = j8;
                this.f21073e = true;
                return 0;
            }
            o02.f17813a = j9;
        } else {
            if (this.f21075g == -9223372036854775807L) {
                e(interfaceC3989s0);
                return 0;
            }
            if (this.f21072d) {
                long j10 = this.f21074f;
                if (j10 == -9223372036854775807L) {
                    e(interfaceC3989s0);
                    return 0;
                }
                BU bu = this.f21069a;
                this.f21076h = bu.c(this.f21075g) - bu.b(j10);
                e(interfaceC3989s0);
                return 0;
            }
            int min2 = (int) Math.min(112800L, interfaceC3989s0.d());
            if (interfaceC3989s0.c() == 0) {
                this.f21070b.i(min2);
                interfaceC3989s0.h();
                interfaceC3989s0.I(this.f21070b.n(), 0, min2);
                UQ uq2 = this.f21070b;
                int t8 = uq2.t();
                int u8 = uq2.u();
                while (true) {
                    if (t8 >= u8) {
                        break;
                    }
                    if (uq2.n()[t8] == 71) {
                        long b9 = AbstractC3239l6.b(uq2, t8, i8);
                        if (b9 != -9223372036854775807L) {
                            j8 = b9;
                            break;
                        }
                    }
                    t8++;
                }
                this.f21074f = j8;
                this.f21072d = true;
                return 0;
            }
            o02.f17813a = 0L;
        }
        return 1;
    }

    public final long b() {
        return this.f21076h;
    }

    public final BU c() {
        return this.f21069a;
    }

    public final boolean d() {
        return this.f21071c;
    }
}
