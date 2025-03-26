package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3784q6 implements InterfaceC3675p6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4207u0 f25744a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0 f25745b;

    /* renamed from: c, reason: collision with root package name */
    private final C4001s6 f25746c;

    /* renamed from: d, reason: collision with root package name */
    private final D f25747d;

    /* renamed from: e, reason: collision with root package name */
    private final int f25748e;

    /* renamed from: f, reason: collision with root package name */
    private long f25749f;

    /* renamed from: g, reason: collision with root package name */
    private int f25750g;

    /* renamed from: h, reason: collision with root package name */
    private long f25751h;

    public C3784q6(InterfaceC4207u0 interfaceC4207u0, Y0 y02, C4001s6 c4001s6, String str, int i8) {
        this.f25744a = interfaceC4207u0;
        this.f25745b = y02;
        this.f25746c = c4001s6;
        int i9 = c4001s6.f26566b * c4001s6.f26569e;
        int i10 = c4001s6.f26568d;
        int i11 = i9 / 8;
        if (i10 != i11) {
            throw zzbc.a("Expected block size: " + i11 + "; got: " + i10, null);
        }
        int i12 = c4001s6.f26567c * i11;
        int i13 = i12 * 8;
        int max = Math.max(i11, i12 / 10);
        this.f25748e = max;
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.B(str);
        c2723gJ0.q0(i13);
        c2723gJ0.v(i13);
        c2723gJ0.r(max);
        c2723gJ0.r0(c4001s6.f26566b);
        c2723gJ0.C(c4001s6.f26567c);
        c2723gJ0.u(i8);
        this.f25747d = c2723gJ0.H();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3675p6
    public final void c(long j8) {
        this.f25749f = j8;
        this.f25750g = 0;
        this.f25751h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3675p6
    public final void d(int i8, long j8) {
        this.f25744a.Q(new C4328v6(this.f25746c, 1, i8, j8));
        this.f25745b.c(this.f25747d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3675p6
    public final boolean e(InterfaceC3989s0 interfaceC3989s0, long j8) {
        int i8;
        int i9;
        long j9 = j8;
        while (j9 > 0 && (i8 = this.f25750g) < (i9 = this.f25748e)) {
            int e8 = this.f25745b.e(interfaceC3989s0, (int) Math.min(i9 - i8, j9), true);
            if (e8 == -1) {
                j9 = 0;
            } else {
                this.f25750g += e8;
                j9 -= e8;
            }
        }
        C4001s6 c4001s6 = this.f25746c;
        int i10 = this.f25750g;
        int i11 = c4001s6.f26568d;
        int i12 = i10 / i11;
        if (i12 > 0) {
            long M7 = this.f25749f + AbstractC2301cW.M(this.f25751h, 1000000L, c4001s6.f26567c, RoundingMode.DOWN);
            int i13 = i12 * i11;
            int i14 = this.f25750g - i13;
            this.f25745b.b(M7, 1, i13, i14, null);
            this.f25751h += i12;
            this.f25750g = i14;
        }
        return j9 <= 0;
    }
}
