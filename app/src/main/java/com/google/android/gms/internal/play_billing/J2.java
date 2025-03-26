package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class J2 implements InterfaceC5111f3 {

    /* renamed from: a, reason: collision with root package name */
    private static final J2 f29777a = new J2();

    private J2() {
    }

    public static J2 a() {
        return f29777a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5111f3
    public final InterfaceC5105e3 b(Class cls) {
        if (!M2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC5105e3) M2.o(cls.asSubclass(M2.class)).k(3, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5111f3
    public final boolean c(Class cls) {
        return M2.class.isAssignableFrom(cls);
    }
}
