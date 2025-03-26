package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class Z2 implements InterfaceC5111f3 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5111f3[] f29857a;

    Z2(InterfaceC5111f3... interfaceC5111f3Arr) {
        this.f29857a = interfaceC5111f3Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5111f3
    public final InterfaceC5105e3 b(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            InterfaceC5111f3 interfaceC5111f3 = this.f29857a[i8];
            if (interfaceC5111f3.c(cls)) {
                return interfaceC5111f3.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5111f3
    public final boolean c(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f29857a[i8].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
