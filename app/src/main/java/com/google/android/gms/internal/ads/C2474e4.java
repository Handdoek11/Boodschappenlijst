package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2474e4 extends AbstractC2257c4 {

    /* renamed from: n, reason: collision with root package name */
    private C2366d4 f21723n;

    /* renamed from: o, reason: collision with root package name */
    private int f21724o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21725p;

    /* renamed from: q, reason: collision with root package name */
    private C2360d1 f21726q;

    /* renamed from: r, reason: collision with root package name */
    private C2143b1 f21727r;

    C2474e4() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final long a(UQ uq) {
        if ((uq.n()[0] & 1) == 1) {
            return -1L;
        }
        byte b8 = uq.n()[0];
        C2366d4 c2366d4 = this.f21723n;
        AbstractC3796qC.b(c2366d4);
        int i8 = !c2366d4.f21405d[(b8 >> 1) & (255 >>> (8 - c2366d4.f21406e))].f21045a ? c2366d4.f21402a.f21386e : c2366d4.f21402a.f21387f;
        int i9 = this.f21725p ? (this.f21724o + i8) / 4 : 0;
        if (uq.s() < uq.u() + 4) {
            byte[] copyOf = Arrays.copyOf(uq.n(), uq.u() + 4);
            uq.j(copyOf, copyOf.length);
        } else {
            uq.k(uq.u() + 4);
        }
        long j8 = i9;
        byte[] n8 = uq.n();
        n8[uq.u() - 4] = (byte) (j8 & 255);
        n8[uq.u() - 3] = (byte) ((j8 >>> 8) & 255);
        n8[uq.u() - 2] = (byte) ((j8 >>> 16) & 255);
        n8[uq.u() - 1] = (byte) ((j8 >>> 24) & 255);
        this.f21725p = true;
        this.f21724o = i8;
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final void b(boolean z7) {
        super.b(z7);
        if (z7) {
            this.f21723n = null;
            this.f21726q = null;
            this.f21727r = null;
        }
        this.f21724o = 0;
        this.f21725p = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final boolean c(UQ uq, long j8, Z3 z32) {
        C2366d4 c2366d4;
        int i8;
        int i9;
        int i10;
        int i11;
        C2360d1 c2360d1;
        long j9;
        if (this.f21723n != null) {
            z32.f20403a.getClass();
            return false;
        }
        C2360d1 c2360d12 = this.f21726q;
        int i12 = 4;
        if (c2360d12 == null) {
            AbstractC2468e1.d(1, uq, false);
            int z7 = uq.z();
            int C7 = uq.C();
            int z8 = uq.z();
            int y7 = uq.y();
            int i13 = y7 <= 0 ? -1 : y7;
            int y8 = uq.y();
            int i14 = y8 <= 0 ? -1 : y8;
            int y9 = uq.y();
            int i15 = y9 <= 0 ? -1 : y9;
            int C8 = uq.C();
            this.f21726q = new C2360d1(z7, C7, z8, i13, i14, i15, (int) Math.pow(2.0d, C8 & 15), (int) Math.pow(2.0d, (C8 & 240) >> 4), 1 == (uq.C() & 1), Arrays.copyOf(uq.n(), uq.u()));
        } else {
            C2143b1 c2143b1 = this.f21727r;
            if (c2143b1 == null) {
                this.f21727r = AbstractC2468e1.c(uq, true, true);
            } else {
                byte[] bArr = new byte[uq.u()];
                System.arraycopy(uq.n(), 0, bArr, 0, uq.u());
                int i16 = c2360d12.f21382a;
                int i17 = 5;
                AbstractC2468e1.d(5, uq, false);
                int C9 = uq.C() + 1;
                C2034a1 c2034a1 = new C2034a1(uq.n());
                c2034a1.c(uq.t() * 8);
                int i18 = 0;
                while (true) {
                    int i19 = 2;
                    int i20 = 16;
                    if (i18 >= C9) {
                        C2360d1 c2360d13 = c2360d12;
                        int i21 = 6;
                        int b8 = c2034a1.b(6) + 1;
                        for (int i22 = 0; i22 < b8; i22++) {
                            if (c2034a1.b(16) != 0) {
                                throw zzbc.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i23 = 1;
                        int b9 = c2034a1.b(6) + 1;
                        int i24 = 0;
                        while (true) {
                            int i25 = 3;
                            if (i24 < b9) {
                                int b10 = c2034a1.b(i20);
                                if (b10 == 0) {
                                    i10 = b9;
                                    int i26 = 8;
                                    c2034a1.c(8);
                                    c2034a1.c(16);
                                    c2034a1.c(16);
                                    c2034a1.c(6);
                                    c2034a1.c(8);
                                    int b11 = c2034a1.b(4) + 1;
                                    int i27 = 0;
                                    while (i27 < b11) {
                                        c2034a1.c(i26);
                                        i27++;
                                        i26 = 8;
                                    }
                                } else {
                                    if (b10 != i23) {
                                        throw zzbc.a("floor type greater than 1 not decodable: " + b10, null);
                                    }
                                    int b12 = c2034a1.b(i17);
                                    int[] iArr = new int[b12];
                                    int i28 = -1;
                                    for (int i29 = 0; i29 < b12; i29++) {
                                        int b13 = c2034a1.b(4);
                                        iArr[i29] = b13;
                                        if (b13 > i28) {
                                            i28 = b13;
                                        }
                                    }
                                    int i30 = i28 + 1;
                                    int[] iArr2 = new int[i30];
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        iArr2[i31] = c2034a1.b(i25) + 1;
                                        int b14 = c2034a1.b(i19);
                                        if (b14 > 0) {
                                            i11 = 8;
                                            c2034a1.c(8);
                                        } else {
                                            i11 = 8;
                                        }
                                        int i32 = b9;
                                        int i33 = 0;
                                        for (int i34 = 1; i33 < (i34 << b14); i34 = 1) {
                                            c2034a1.c(i11);
                                            i33++;
                                            i11 = 8;
                                        }
                                        i31++;
                                        b9 = i32;
                                        i19 = 2;
                                        i25 = 3;
                                    }
                                    i10 = b9;
                                    c2034a1.c(i19);
                                    int b15 = c2034a1.b(4);
                                    int i35 = 0;
                                    int i36 = 0;
                                    for (int i37 = 0; i37 < b12; i37++) {
                                        i35 += iArr2[iArr[i37]];
                                        while (i36 < i35) {
                                            c2034a1.c(b15);
                                            i36++;
                                        }
                                    }
                                }
                                i24++;
                                b9 = i10;
                                i21 = 6;
                                i19 = 2;
                                i20 = 16;
                                i23 = 1;
                                i17 = 5;
                            } else {
                                int i38 = 1;
                                int b16 = c2034a1.b(i21) + 1;
                                int i39 = 0;
                                while (i39 < b16) {
                                    if (c2034a1.b(16) > 2) {
                                        throw zzbc.a("residueType greater than 2 is not decodable", null);
                                    }
                                    c2034a1.c(24);
                                    c2034a1.c(24);
                                    c2034a1.c(24);
                                    int b17 = c2034a1.b(i21) + i38;
                                    int i40 = 8;
                                    c2034a1.c(8);
                                    int[] iArr3 = new int[b17];
                                    for (int i41 = 0; i41 < b17; i41++) {
                                        iArr3[i41] = ((c2034a1.d() ? c2034a1.b(5) : 0) * 8) + c2034a1.b(3);
                                    }
                                    int i42 = 0;
                                    while (i42 < b17) {
                                        int i43 = 0;
                                        while (i43 < i40) {
                                            if ((iArr3[i42] & (1 << i43)) != 0) {
                                                c2034a1.c(i40);
                                            }
                                            i43++;
                                            i40 = 8;
                                        }
                                        i42++;
                                        i40 = 8;
                                    }
                                    i39++;
                                    i21 = 6;
                                    i38 = 1;
                                }
                                int b18 = c2034a1.b(i21) + 1;
                                for (int i44 = 0; i44 < b18; i44++) {
                                    int b19 = c2034a1.b(16);
                                    if (b19 != 0) {
                                        HL.c("VorbisUtil", "mapping type other than 0 not supported: " + b19);
                                    } else {
                                        if (c2034a1.d()) {
                                            i8 = 1;
                                            i9 = c2034a1.b(4) + 1;
                                        } else {
                                            i8 = 1;
                                            i9 = 1;
                                        }
                                        if (c2034a1.d()) {
                                            int b20 = c2034a1.b(8) + i8;
                                            for (int i45 = 0; i45 < b20; i45++) {
                                                int i46 = i16 - 1;
                                                c2034a1.c(AbstractC2468e1.a(i46));
                                                c2034a1.c(AbstractC2468e1.a(i46));
                                            }
                                        }
                                        if (c2034a1.b(2) != 0) {
                                            throw zzbc.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i9 > 1) {
                                            for (int i47 = 0; i47 < i16; i47++) {
                                                c2034a1.c(4);
                                            }
                                        }
                                        for (int i48 = 0; i48 < i9; i48++) {
                                            c2034a1.c(8);
                                            c2034a1.c(8);
                                            c2034a1.c(8);
                                        }
                                    }
                                }
                                int b21 = c2034a1.b(6);
                                int i49 = b21 + 1;
                                C2251c1[] c2251c1Arr = new C2251c1[i49];
                                for (int i50 = 0; i50 < i49; i50++) {
                                    c2251c1Arr[i50] = new C2251c1(c2034a1.d(), c2034a1.b(16), c2034a1.b(16), c2034a1.b(8));
                                }
                                if (!c2034a1.d()) {
                                    throw zzbc.a("framing bit after modes not set as expected", null);
                                }
                                c2366d4 = new C2366d4(c2360d13, c2143b1, bArr, c2251c1Arr, AbstractC2468e1.a(b21));
                            }
                        }
                    } else {
                        if (c2034a1.b(24) != 5653314) {
                            throw zzbc.a("expected code book to start with [0x56, 0x43, 0x42] at " + c2034a1.a(), null);
                        }
                        int b22 = c2034a1.b(16);
                        int b23 = c2034a1.b(24);
                        if (c2034a1.d()) {
                            c2034a1.c(5);
                            for (int i51 = 0; i51 < b23; i51 += c2034a1.b(AbstractC2468e1.a(b23 - i51))) {
                            }
                        } else {
                            boolean d8 = c2034a1.d();
                            for (int i52 = 0; i52 < b23; i52++) {
                                if (!d8) {
                                    c2034a1.c(5);
                                } else if (c2034a1.d()) {
                                    c2034a1.c(5);
                                }
                            }
                        }
                        int b24 = c2034a1.b(i12);
                        if (b24 > 2) {
                            throw zzbc.a("lookup type greater than 2 not decodable: " + b24, null);
                        }
                        if (b24 != 1) {
                            if (b24 != 2) {
                                c2360d1 = c2360d12;
                            }
                            i18++;
                            c2360d12 = c2360d1;
                            i12 = 4;
                        } else {
                            i19 = b24;
                        }
                        c2034a1.c(32);
                        c2034a1.c(32);
                        int b25 = c2034a1.b(i12) + 1;
                        c2034a1.c(1);
                        if (i19 != 1) {
                            c2360d1 = c2360d12;
                            j9 = b22 * b23;
                        } else if (b22 != 0) {
                            c2360d1 = c2360d12;
                            j9 = (long) Math.floor(Math.pow(b23, 1.0d / b22));
                        } else {
                            c2360d1 = c2360d12;
                            j9 = 0;
                        }
                        c2034a1.c((int) (j9 * b25));
                        i18++;
                        c2360d12 = c2360d1;
                        i12 = 4;
                    }
                }
            }
        }
        c2366d4 = null;
        this.f21723n = c2366d4;
        if (c2366d4 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C2360d1 c2360d14 = c2366d4.f21402a;
        arrayList.add(c2360d14.f21388g);
        arrayList.add(c2366d4.f21404c);
        C3503nb b26 = AbstractC2468e1.b(AbstractC4169th0.v(c2366d4.f21403b.f20802a));
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.B("audio/vorbis");
        c2723gJ0.q0(c2360d14.f21385d);
        c2723gJ0.v(c2360d14.f21384c);
        c2723gJ0.r0(c2360d14.f21382a);
        c2723gJ0.C(c2360d14.f21383b);
        c2723gJ0.n(arrayList);
        c2723gJ0.t(b26);
        z32.f20403a = c2723gJ0.H();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final void h(long j8) {
        super.h(j8);
        this.f21725p = j8 != 0;
        C2360d1 c2360d1 = this.f21726q;
        this.f21724o = c2360d1 != null ? c2360d1.f21386e : 0;
    }
}
