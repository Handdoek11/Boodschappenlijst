package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ko0 implements Tk0 {

    /* renamed from: a, reason: collision with root package name */
    final String f16633a;

    /* renamed from: b, reason: collision with root package name */
    final Class f16634b;

    /* renamed from: c, reason: collision with root package name */
    final EnumC3429ms0 f16635c;

    Ko0(String str, Class cls, EnumC3429ms0 enumC3429ms0, InterfaceC4633xv0 interfaceC4633xv0) {
        this.f16633a = str;
        this.f16634b = cls;
        this.f16635c = enumC3429ms0;
    }

    public static Tk0 c(String str, Class cls, EnumC3429ms0 enumC3429ms0, InterfaceC4633xv0 interfaceC4633xv0) {
        return new Ko0(str, cls, enumC3429ms0, interfaceC4633xv0);
    }

    @Override // com.google.android.gms.internal.ads.Tk0
    public final C3647os0 a(AbstractC3542nu0 abstractC3542nu0) {
        C3865qs0 b02 = C4082ss0.b0();
        b02.D(this.f16633a);
        b02.E(abstractC3542nu0);
        b02.C(Ts0.RAW);
        Kp0 kp0 = (Kp0) C3423mp0.c().d(C2336cp0.b().a(C3423mp0.c().b(Lp0.a((C4082ss0) b02.x())), null), Kp0.class, Rk0.a());
        C3320ls0 b03 = C3647os0.b0();
        b03.D(kp0.g());
        b03.E(kp0.e());
        b03.C(kp0.b());
        return (C3647os0) b03.x();
    }

    @Override // com.google.android.gms.internal.ads.Tk0
    public final Object b(AbstractC3542nu0 abstractC3542nu0) {
        return C3096jp0.a().c(C3423mp0.c().a(Kp0.a(this.f16633a, abstractC3542nu0, this.f16635c, Ts0.RAW, null), Rk0.a()), this.f16634b);
    }

    @Override // com.google.android.gms.internal.ads.Tk0
    public final Class zzb() {
        return this.f16634b;
    }
}
