package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class J4 implements InterfaceC4956k5 {

    /* renamed from: b, reason: collision with root package name */
    private static final S4 f28923b = new I4();

    /* renamed from: a, reason: collision with root package name */
    private final S4 f28924a;

    public J4() {
        this(new K4(C5018s4.c(), f28923b));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4956k5
    public final InterfaceC4964l5 a(Class cls) {
        AbstractC4980n5.o(cls);
        U4 a8 = this.f28924a.a(cls);
        if (a8.a()) {
            return C4866a5.i(AbstractC4980n5.f(), AbstractC4928h4.a(), a8.zza());
        }
        return Z4.m(cls, a8, AbstractC4902e5.a(), H4.a(), AbstractC4980n5.f(), L4.f28937a[a8.zzb().ordinal()] != 1 ? AbstractC4928h4.a() : null, Q4.a());
    }

    private J4(S4 s42) {
        this.f28924a = (S4) AbstractC5026t4.f(s42, "messageInfoFactory");
    }
}
