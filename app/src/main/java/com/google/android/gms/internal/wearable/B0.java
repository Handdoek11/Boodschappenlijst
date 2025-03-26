package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
final class B0 implements V0 {

    /* renamed from: b, reason: collision with root package name */
    private static final G0 f30043b = new C5283z0();

    /* renamed from: a, reason: collision with root package name */
    private final G0 f30044a;

    public B0() {
        C5252j0 a8 = C5252j0.a();
        int i8 = R0.f30084d;
        A0 a02 = new A0(a8, f30043b);
        byte[] bArr = AbstractC5269s0.f30213b;
        this.f30044a = a02;
    }

    @Override // com.google.android.gms.internal.wearable.V0
    public final U0 a(Class cls) {
        int i8 = W0.f30103b;
        if (!AbstractC5258m0.class.isAssignableFrom(cls)) {
            int i9 = R0.f30084d;
        }
        F0 b8 = this.f30044a.b(cls);
        if (b8.zzb()) {
            int i10 = R0.f30084d;
            return M0.j(W0.r(), AbstractC5246g0.a(), b8.zza());
        }
        int i11 = R0.f30084d;
        return L0.A(cls, b8, O0.a(), AbstractC5279x0.a(), W0.r(), b8.a() + (-1) != 1 ? AbstractC5246g0.a() : null, E0.a());
    }
}
