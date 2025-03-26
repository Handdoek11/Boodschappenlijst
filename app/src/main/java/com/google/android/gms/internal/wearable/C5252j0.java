package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5252j0 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C5252j0 f30191a = new C5252j0();

    private C5252j0() {
    }

    public static C5252j0 a() {
        return f30191a;
    }

    @Override // com.google.android.gms.internal.wearable.G0
    public final F0 b(Class cls) {
        if (!AbstractC5258m0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (F0) AbstractC5258m0.h(cls.asSubclass(AbstractC5258m0.class)).e(3, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.wearable.G0
    public final boolean c(Class cls) {
        return AbstractC5258m0.class.isAssignableFrom(cls);
    }
}
