package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3237l5 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3346m5 f24269a = new C3346m5(null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final UQ f24270b = new UQ(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f24271c;

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
        this.f24271c = false;
        this.f24269a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        int C7 = interfaceC3989s0.C(this.f24270b.n(), 0, 2786);
        if (C7 == -1) {
            return -1;
        }
        this.f24270b.l(0);
        this.f24270b.k(C7);
        if (!this.f24271c) {
            this.f24269a.e(0L, 4);
            this.f24271c = true;
        }
        this.f24269a.c(this.f24270b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        UQ uq = new UQ(10);
        int i8 = 0;
        while (true) {
            C2684g0 c2684g0 = (C2684g0) interfaceC3989s0;
            c2684g0.G(uq.n(), 0, 10, false);
            uq.l(0);
            if (uq.E() != 4801587) {
                break;
            }
            uq.m(3);
            int B7 = uq.B();
            i8 += B7 + 10;
            c2684g0.g(B7, false);
        }
        interfaceC3989s0.h();
        C2684g0 c2684g02 = (C2684g0) interfaceC3989s0;
        c2684g02.g(i8, false);
        int i9 = 0;
        int i10 = i8;
        while (true) {
            c2684g02.G(uq.n(), 0, 6, false);
            uq.l(0);
            if (uq.G() != 2935) {
                interfaceC3989s0.h();
                i10++;
                if (i10 - i8 >= 8192) {
                    return false;
                }
                c2684g02.g(i10, false);
                i9 = 0;
            } else {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                int b8 = Q.b(uq.n());
                if (b8 == -1) {
                    return false;
                }
                c2684g02.g(b8 - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f24269a.d(interfaceC4207u0, new C3021j6(Integer.MIN_VALUE, 0, 1));
        interfaceC4207u0.P();
        interfaceC4207u0.Q(new Q0(-9223372036854775807L, 0L));
    }
}
