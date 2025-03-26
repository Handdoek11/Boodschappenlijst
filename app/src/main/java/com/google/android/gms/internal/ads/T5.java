package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class T5 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f19066c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19067d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19068e;

    /* renamed from: a, reason: collision with root package name */
    private final BU f19064a = new BU(0);

    /* renamed from: f, reason: collision with root package name */
    private long f19069f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f19070g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f19071h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final UQ f19065b = new UQ();

    T5() {
    }

    public static long c(UQ uq) {
        int t7 = uq.t();
        if (uq.r() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        uq.h(bArr, 0, 9);
        uq.l(t7);
        byte b8 = bArr[0];
        if ((b8 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b9 = bArr[2];
        if ((b9 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b10 = bArr[4];
        if ((b10 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j8 = b8;
        long j9 = b9;
        long j10 = (248 & j9) >> 3;
        long j11 = (j9 & 3) << 13;
        return j11 | ((bArr[1] & 255) << 20) | ((j8 & 3) << 28) | (((j8 & 56) >> 3) << 30) | (j10 << 15) | ((bArr[3] & 255) << 5) | ((b10 & 248) >> 3);
    }

    private final int f(InterfaceC3989s0 interfaceC3989s0) {
        byte[] bArr = AbstractC2301cW.f21211f;
        int length = bArr.length;
        this.f19065b.j(bArr, 0);
        this.f19066c = true;
        interfaceC3989s0.h();
        return 0;
    }

    private static final int g(byte[] bArr, int i8) {
        return (bArr[i8 + 3] & 255) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
    }

    public final int a(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        long j8 = -9223372036854775807L;
        if (!this.f19068e) {
            long d8 = interfaceC3989s0.d();
            int min = (int) Math.min(20000L, d8);
            long j9 = d8 - min;
            if (interfaceC3989s0.c() != j9) {
                o02.f17813a = j9;
                return 1;
            }
            this.f19065b.i(min);
            interfaceC3989s0.h();
            interfaceC3989s0.I(this.f19065b.n(), 0, min);
            UQ uq = this.f19065b;
            int t7 = uq.t();
            int u7 = uq.u() - 4;
            while (true) {
                if (u7 < t7) {
                    break;
                }
                if (g(uq.n(), u7) == 442) {
                    uq.l(u7 + 4);
                    long c8 = c(uq);
                    if (c8 != -9223372036854775807L) {
                        j8 = c8;
                        break;
                    }
                }
                u7--;
            }
            this.f19070g = j8;
            this.f19068e = true;
        } else {
            if (this.f19070g == -9223372036854775807L) {
                f(interfaceC3989s0);
                return 0;
            }
            if (this.f19067d) {
                long j10 = this.f19069f;
                if (j10 == -9223372036854775807L) {
                    f(interfaceC3989s0);
                    return 0;
                }
                BU bu = this.f19064a;
                this.f19071h = bu.c(this.f19070g) - bu.b(j10);
                f(interfaceC3989s0);
                return 0;
            }
            int min2 = (int) Math.min(20000L, interfaceC3989s0.d());
            if (interfaceC3989s0.c() != 0) {
                o02.f17813a = 0L;
                return 1;
            }
            this.f19065b.i(min2);
            interfaceC3989s0.h();
            interfaceC3989s0.I(this.f19065b.n(), 0, min2);
            UQ uq2 = this.f19065b;
            int t8 = uq2.t();
            int u8 = uq2.u();
            while (true) {
                if (t8 >= u8 - 3) {
                    break;
                }
                if (g(uq2.n(), t8) == 442) {
                    uq2.l(t8 + 4);
                    long c9 = c(uq2);
                    if (c9 != -9223372036854775807L) {
                        j8 = c9;
                        break;
                    }
                }
                t8++;
            }
            this.f19069f = j8;
            this.f19067d = true;
        }
        return 0;
    }

    public final long b() {
        return this.f19071h;
    }

    public final BU d() {
        return this.f19064a;
    }

    public final boolean e() {
        return this.f19066c;
    }
}
