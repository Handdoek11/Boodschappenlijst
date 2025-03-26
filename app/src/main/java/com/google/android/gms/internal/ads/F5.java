package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
public final class F5 implements InterfaceC4217u5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15069a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15070b;

    /* renamed from: c, reason: collision with root package name */
    private final UQ f15071c;

    /* renamed from: d, reason: collision with root package name */
    private final C4144tQ f15072d;

    /* renamed from: e, reason: collision with root package name */
    private Y0 f15073e;

    /* renamed from: f, reason: collision with root package name */
    private String f15074f;

    /* renamed from: g, reason: collision with root package name */
    private D f15075g;

    /* renamed from: h, reason: collision with root package name */
    private int f15076h;

    /* renamed from: i, reason: collision with root package name */
    private int f15077i;

    /* renamed from: j, reason: collision with root package name */
    private int f15078j;

    /* renamed from: k, reason: collision with root package name */
    private int f15079k;

    /* renamed from: l, reason: collision with root package name */
    private long f15080l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15081m;

    /* renamed from: n, reason: collision with root package name */
    private int f15082n;

    /* renamed from: o, reason: collision with root package name */
    private int f15083o;

    /* renamed from: p, reason: collision with root package name */
    private int f15084p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f15085q;

    /* renamed from: r, reason: collision with root package name */
    private long f15086r;

    /* renamed from: s, reason: collision with root package name */
    private int f15087s;

    /* renamed from: t, reason: collision with root package name */
    private long f15088t;

    /* renamed from: u, reason: collision with root package name */
    private int f15089u;

    /* renamed from: v, reason: collision with root package name */
    private String f15090v;

    public F5(String str, int i8) {
        this.f15069a = str;
        this.f15070b = i8;
        UQ uq = new UQ(1024);
        this.f15071c = uq;
        byte[] n8 = uq.n();
        this.f15072d = new C4144tQ(n8, n8.length);
        this.f15080l = -9223372036854775807L;
    }

    private final int f(C4144tQ c4144tQ) {
        int a8 = c4144tQ.a();
        L b8 = N.b(c4144tQ, true);
        this.f15090v = b8.f16721c;
        this.f15087s = b8.f16719a;
        this.f15089u = b8.f16720b;
        return a8 - c4144tQ.a();
    }

    private static long g(C4144tQ c4144tQ) {
        return c4144tQ.d((c4144tQ.d(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f15076h = 0;
        this.f15080l = -9223372036854775807L;
        this.f15081m = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void c(UQ uq) {
        int i8;
        int i9;
        int i10;
        boolean p8;
        AbstractC3796qC.b(this.f15073e);
        while (uq.r() > 0) {
            int i11 = this.f15076h;
            if (i11 != 0) {
                if (i11 == 1) {
                    int C7 = uq.C();
                    if ((C7 & 224) == 224) {
                        this.f15079k = C7;
                        this.f15076h = 2;
                    } else if (C7 != 86) {
                        this.f15076h = 0;
                    }
                } else if (i11 != 2) {
                    int min = Math.min(uq.r(), this.f15078j - this.f15077i);
                    uq.h(this.f15072d.f26885a, this.f15077i, min);
                    int i12 = this.f15077i + min;
                    this.f15077i = i12;
                    if (i12 == this.f15078j) {
                        this.f15072d.l(0);
                        C4144tQ c4144tQ = this.f15072d;
                        if (c4144tQ.p()) {
                            if (this.f15081m) {
                            }
                            this.f15076h = 0;
                        } else {
                            this.f15081m = true;
                            int d8 = c4144tQ.d(1);
                            if (d8 == 1) {
                                i10 = c4144tQ.d(1);
                                i9 = 1;
                            } else {
                                i9 = d8;
                                i10 = 0;
                            }
                            this.f15082n = i10;
                            if (i10 != 0) {
                                throw zzbc.a(null, null);
                            }
                            if (i9 == 1) {
                                g(c4144tQ);
                                i9 = 1;
                            }
                            if (!c4144tQ.p()) {
                                throw zzbc.a(null, null);
                            }
                            this.f15083o = c4144tQ.d(6);
                            int d9 = c4144tQ.d(4);
                            int d10 = c4144tQ.d(3);
                            if (d9 != 0 || d10 != 0) {
                                throw zzbc.a(null, null);
                            }
                            if (i9 == 0) {
                                int c8 = c4144tQ.c();
                                int f8 = f(c4144tQ);
                                c4144tQ.l(c8);
                                byte[] bArr = new byte[(f8 + 7) / 8];
                                c4144tQ.h(bArr, 0, f8);
                                C2723gJ0 c2723gJ0 = new C2723gJ0();
                                c2723gJ0.m(this.f15074f);
                                c2723gJ0.B("audio/mp4a-latm");
                                c2723gJ0.a(this.f15090v);
                                c2723gJ0.r0(this.f15089u);
                                c2723gJ0.C(this.f15087s);
                                c2723gJ0.n(Collections.singletonList(bArr));
                                c2723gJ0.q(this.f15069a);
                                c2723gJ0.y(this.f15070b);
                                D H7 = c2723gJ0.H();
                                if (!H7.equals(this.f15075g)) {
                                    this.f15075g = H7;
                                    this.f15088t = 1024000000 / H7.f14312E;
                                    this.f15073e.c(H7);
                                }
                            } else {
                                c4144tQ.n(((int) g(c4144tQ)) - f(c4144tQ));
                            }
                            int d11 = c4144tQ.d(3);
                            this.f15084p = d11;
                            if (d11 == 0) {
                                c4144tQ.n(8);
                            } else if (d11 == 1) {
                                c4144tQ.n(9);
                            } else if (d11 == 3 || d11 == 4 || d11 == 5) {
                                c4144tQ.n(6);
                            } else {
                                if (d11 != 6 && d11 != 7) {
                                    throw new IllegalStateException();
                                }
                                c4144tQ.n(1);
                            }
                            boolean p9 = c4144tQ.p();
                            this.f15085q = p9;
                            this.f15086r = 0L;
                            if (p9) {
                                if (i9 != 1) {
                                    do {
                                        p8 = c4144tQ.p();
                                        this.f15086r = (this.f15086r << 8) + c4144tQ.d(8);
                                    } while (p8);
                                } else {
                                    this.f15086r = g(c4144tQ);
                                }
                            }
                            if (c4144tQ.p()) {
                                c4144tQ.n(8);
                            }
                        }
                        if (this.f15082n != 0) {
                            throw zzbc.a(null, null);
                        }
                        if (this.f15083o != 0) {
                            throw zzbc.a(null, null);
                        }
                        if (this.f15084p != 0) {
                            throw zzbc.a(null, null);
                        }
                        int i13 = 0;
                        while (true) {
                            int d12 = c4144tQ.d(8);
                            i8 = i13 + d12;
                            if (d12 != 255) {
                                break;
                            } else {
                                i13 = i8;
                            }
                        }
                        int c9 = c4144tQ.c();
                        if ((c9 & 7) == 0) {
                            this.f15071c.l(c9 >> 3);
                        } else {
                            c4144tQ.h(this.f15071c.n(), 0, i8 * 8);
                            this.f15071c.l(0);
                        }
                        this.f15073e.a(this.f15071c, i8);
                        AbstractC3796qC.f(this.f15080l != -9223372036854775807L);
                        this.f15073e.b(this.f15080l, 1, i8, 0, null);
                        this.f15080l += this.f15088t;
                        if (this.f15085q) {
                            c4144tQ.n((int) this.f15086r);
                        }
                        this.f15076h = 0;
                    } else {
                        continue;
                    }
                } else {
                    int C8 = ((this.f15079k & (-225)) << 8) | uq.C();
                    this.f15078j = C8;
                    UQ uq2 = this.f15071c;
                    if (C8 > uq2.n().length) {
                        uq2.i(C8);
                        C4144tQ c4144tQ2 = this.f15072d;
                        byte[] n8 = this.f15071c.n();
                        c4144tQ2.k(n8, n8.length);
                    }
                    this.f15077i = 0;
                    this.f15076h = 3;
                }
            } else if (uq.C() == 86) {
                this.f15076h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f15073e = interfaceC4207u0.R(c3021j6.a(), 1);
        this.f15074f = c3021j6.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f15080l = j8;
    }
}
