package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class Lu0 implements InterfaceC3653ov0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Lu0 f16929a = new Lu0();

    private Lu0() {
    }

    public static Lu0 a() {
        return f16929a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3653ov0
    public final InterfaceC3544nv0 b(Class cls) {
        if (!Qu0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC3544nv0) Qu0.I(cls.asSubclass(Qu0.class)).y();
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3653ov0
    public final boolean c(Class cls) {
        return Qu0.class.isAssignableFrom(cls);
    }
}
