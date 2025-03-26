package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
final class A0 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    private final G0[] f30040a;

    A0(G0... g0Arr) {
        this.f30040a = g0Arr;
    }

    @Override // com.google.android.gms.internal.wearable.G0
    public final F0 b(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            G0 g02 = this.f30040a[i8];
            if (g02.c(cls)) {
                return g02.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.wearable.G0
    public final boolean c(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f30040a[i8].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
