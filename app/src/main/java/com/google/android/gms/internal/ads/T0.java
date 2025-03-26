package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class T0 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f19034a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19035b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19036c;

    /* renamed from: d, reason: collision with root package name */
    private int f19037d;

    /* renamed from: e, reason: collision with root package name */
    private int f19038e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4207u0 f19039f;

    /* renamed from: g, reason: collision with root package name */
    private Y0 f19040g;

    public T0(int i8, int i9, String str) {
        this.f19034a = i8;
        this.f19035b = i9;
        this.f19036c = str;
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
        if (j8 == 0 || this.f19038e == 1) {
            this.f19038e = 1;
            this.f19037d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        int i8 = this.f19038e;
        if (i8 != 1) {
            if (i8 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        Y0 y02 = this.f19040g;
        y02.getClass();
        int e8 = y02.e(interfaceC3989s0, 1024, true);
        if (e8 == -1) {
            this.f19038e = 2;
            this.f19040g.b(0L, 1, this.f19037d, 0, null);
            this.f19037d = 0;
        } else {
            this.f19037d += e8;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        AbstractC3796qC.f((this.f19034a == -1 || this.f19035b == -1) ? false : true);
        UQ uq = new UQ(this.f19035b);
        ((C2684g0) interfaceC3989s0).G(uq.n(), 0, this.f19035b, false);
        return uq.G() == this.f19034a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f19039f = interfaceC4207u0;
        Y0 R7 = interfaceC4207u0.R(1024, 4);
        this.f19040g = R7;
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.B(this.f19036c);
        R7.c(c2723gJ0.H());
        this.f19039f.P();
        this.f19039f.Q(new U0(-9223372036854775807L));
        this.f19038e = 1;
    }
}
