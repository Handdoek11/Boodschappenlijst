package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class N implements P {

    /* renamed from: a, reason: collision with root package name */
    private final Z2 f28946a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28947b;

    public N(Z2 z22, String str) {
        this.f28946a = z22;
        this.f28947b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final Z2 a(InterfaceC5013s interfaceC5013s) {
        Z2 d8 = this.f28946a.d();
        d8.f(this.f28947b, interfaceC5013s);
        return d8;
    }
}
