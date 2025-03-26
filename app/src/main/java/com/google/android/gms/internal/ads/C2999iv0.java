package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2999iv0 implements InterfaceC3653ov0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3653ov0[] f23101a;

    C2999iv0(InterfaceC3653ov0... interfaceC3653ov0Arr) {
        this.f23101a = interfaceC3653ov0Arr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3653ov0
    public final InterfaceC3544nv0 b(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            InterfaceC3653ov0 interfaceC3653ov0 = this.f23101a[i8];
            if (interfaceC3653ov0.c(cls)) {
                return interfaceC3653ov0.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3653ov0
    public final boolean c(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f23101a[i8].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
