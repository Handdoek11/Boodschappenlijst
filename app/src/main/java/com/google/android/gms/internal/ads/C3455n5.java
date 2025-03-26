package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3455n5 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3564o5 f24872a = new C3564o5(null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final UQ f24873b = new UQ(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f24874c;

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
        this.f24874c = false;
        this.f24872a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        int C7 = interfaceC3989s0.C(this.f24873b.n(), 0, 16384);
        if (C7 == -1) {
            return -1;
        }
        this.f24873b.l(0);
        this.f24873b.k(C7);
        if (!this.f24874c) {
            this.f24872a.e(0L, 4);
            this.f24874c = true;
        }
        this.f24872a.c(this.f24873b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        int i8;
        boolean z7 = true;
        UQ uq = new UQ(10);
        int i9 = 0;
        while (true) {
            C2684g0 c2684g0 = (C2684g0) interfaceC3989s0;
            c2684g0.G(uq.n(), 0, 10, false);
            uq.l(0);
            if (uq.E() != 4801587) {
                break;
            }
            uq.m(3);
            int B7 = uq.B();
            i9 += B7 + 10;
            c2684g0.g(B7, false);
            z7 = true;
        }
        interfaceC3989s0.h();
        C2684g0 c2684g02 = (C2684g0) interfaceC3989s0;
        c2684g02.g(i9, false);
        int i10 = 0;
        int i11 = i9;
        while (true) {
            int i12 = 7;
            c2684g02.G(uq.n(), 0, 7, false);
            uq.l(0);
            int G7 = uq.G();
            if (G7 == 44096 || G7 == 44097) {
                i10 += z7 ? 1 : 0;
                if (i10 >= 4) {
                    return z7;
                }
                byte[] n8 = uq.n();
                int i13 = U.f19208b;
                if (n8.length < 7) {
                    i8 = -1;
                } else {
                    int i14 = (n8[3] & 255) | ((n8[2] & 255) << 8);
                    if (i14 == 65535) {
                        i14 = ((n8[4] & 255) << 16) | ((n8[5] & 255) << 8) | (n8[6] & 255);
                    } else {
                        i12 = 4;
                    }
                    if (G7 == 44097) {
                        i12 += 2;
                    }
                    i8 = i14 + i12;
                }
                if (i8 == -1) {
                    return false;
                }
                c2684g02.g(i8 - 7, false);
                z7 = true;
            } else {
                interfaceC3989s0.h();
                i11 += z7 ? 1 : 0;
                if (i11 - i9 >= 8192) {
                    return false;
                }
                c2684g02.g(i11, false);
                i10 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f24872a.d(interfaceC4207u0, new C3021j6(Integer.MIN_VALUE, 0, 1));
        interfaceC4207u0.P();
        interfaceC4207u0.Q(new Q0(-9223372036854775807L, 0L));
    }
}
