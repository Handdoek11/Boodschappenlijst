package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class U3 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4207u0 f19277a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC2257c4 f19278b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19279c;

    private final boolean b(InterfaceC3989s0 interfaceC3989s0) {
        W3 w32 = new W3();
        if (w32.b(interfaceC3989s0, true) && (w32.f19701a & 2) == 2) {
            int min = Math.min(w32.f19705e, 8);
            UQ uq = new UQ(min);
            interfaceC3989s0.I(uq.n(), 0, min);
            uq.l(0);
            if (uq.r() >= 5 && uq.C() == 127 && uq.K() == 1179402563) {
                this.f19278b = new T3();
            } else {
                uq.l(0);
                if (AbstractC2468e1.d(1, uq, true)) {
                    this.f19278b = new C2474e4();
                } else {
                    uq.l(0);
                    if (Y3.j(uq)) {
                        this.f19278b = new Y3();
                    }
                }
            }
            return true;
        }
        return false;
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
        AbstractC2257c4 abstractC2257c4 = this.f19278b;
        if (abstractC2257c4 != null) {
            abstractC2257c4.i(j8, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        AbstractC3796qC.b(this.f19277a);
        if (this.f19278b == null) {
            if (!b(interfaceC3989s0)) {
                throw zzbc.a("Failed to determine bitstream type", null);
            }
            interfaceC3989s0.h();
        }
        if (!this.f19279c) {
            Y0 R7 = this.f19277a.R(0, 1);
            this.f19277a.P();
            this.f19278b.g(this.f19277a, R7);
            this.f19279c = true;
        }
        return this.f19278b.d(interfaceC3989s0, o02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        try {
            return b(interfaceC3989s0);
        } catch (zzbc unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f19277a = interfaceC4207u0;
    }
}
