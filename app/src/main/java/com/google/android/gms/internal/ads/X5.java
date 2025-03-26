package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class X5 implements InterfaceC3130k6 {

    /* renamed from: a, reason: collision with root package name */
    private final W5 f19971a;

    /* renamed from: b, reason: collision with root package name */
    private final UQ f19972b = new UQ(32);

    /* renamed from: c, reason: collision with root package name */
    private int f19973c;

    /* renamed from: d, reason: collision with root package name */
    private int f19974d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19975e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19976f;

    public X5(W5 w52) {
        this.f19971a = w52;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3130k6
    public final void a() {
        this.f19976f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3130k6
    public final void b(BU bu, InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        this.f19971a.b(bu, interfaceC4207u0, c3021j6);
        this.f19976f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3130k6
    public final void c(UQ uq, int i8) {
        int i9 = i8 & 1;
        int t7 = i9 != 0 ? uq.t() + uq.C() : -1;
        if (this.f19976f) {
            if (i9 == 0) {
                return;
            }
            this.f19976f = false;
            uq.l(t7);
            this.f19974d = 0;
        }
        while (uq.r() > 0) {
            int i10 = this.f19974d;
            if (i10 < 3) {
                if (i10 == 0) {
                    int C7 = uq.C();
                    uq.l(uq.t() - 1);
                    if (C7 == 255) {
                        this.f19976f = true;
                        return;
                    }
                }
                int min = Math.min(uq.r(), 3 - this.f19974d);
                uq.h(this.f19972b.n(), this.f19974d, min);
                int i11 = this.f19974d + min;
                this.f19974d = i11;
                if (i11 == 3) {
                    this.f19972b.l(0);
                    this.f19972b.k(3);
                    this.f19972b.m(1);
                    UQ uq2 = this.f19972b;
                    int C8 = uq2.C();
                    boolean z7 = (C8 & 128) != 0;
                    int C9 = uq2.C();
                    this.f19975e = z7;
                    this.f19973c = (C9 | ((C8 & 15) << 8)) + 3;
                    int s8 = this.f19972b.s();
                    int i12 = this.f19973c;
                    if (s8 < i12) {
                        int s9 = this.f19972b.s();
                        this.f19972b.f(Math.min(4098, Math.max(i12, s9 + s9)));
                    }
                }
            } else {
                int min2 = Math.min(uq.r(), this.f19973c - i10);
                uq.h(this.f19972b.n(), this.f19974d, min2);
                int i13 = this.f19974d + min2;
                this.f19974d = i13;
                int i14 = this.f19973c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f19975e) {
                        this.f19972b.k(i14);
                    } else {
                        if (AbstractC2301cW.x(this.f19972b.n(), 0, i14, -1) != 0) {
                            this.f19976f = true;
                            return;
                        }
                        this.f19972b.k(this.f19973c - 4);
                    }
                    this.f19972b.l(0);
                    this.f19971a.c(this.f19972b);
                    this.f19974d = 0;
                }
            }
        }
    }
}
