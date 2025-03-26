package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    private final Z2 f28995a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28996b;

    public Q(Z2 z22, String str) {
        this.f28995a = z22;
        this.f28996b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final Z2 a(InterfaceC5013s interfaceC5013s) {
        Z2 d8 = this.f28995a.d();
        d8.e(this.f28996b, interfaceC5013s);
        return d8;
    }
}
