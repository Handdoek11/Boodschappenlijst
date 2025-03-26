package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class L1 extends F0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ R0 f16731b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M1 f16732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1(M1 m12, R0 r02, R0 r03) {
        super(r02);
        this.f16731b = r03;
        this.f16732c = m12;
    }

    @Override // com.google.android.gms.internal.ads.F0, com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        P0 c8 = this.f16731b.c(j8);
        S0 s02 = c8.f18099a;
        S0 s03 = new S0(s02.f18729a, s02.f18730b + this.f16732c.f17190o);
        S0 s04 = c8.f18100b;
        return new P0(s03, new S0(s04.f18729a, s04.f18730b + this.f16732c.f17190o));
    }
}
