package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5081a3 implements InterfaceC5194t3 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC5111f3 f29865b = new Y2();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5111f3 f29866a;

    public C5081a3() {
        J2 a8 = J2.a();
        int i8 = C5171p3.f29965d;
        Z2 z22 = new Z2(a8, f29865b);
        byte[] bArr = R2.f29810b;
        this.f29866a = z22;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5194t3
    public final InterfaceC5188s3 a(Class cls) {
        int i8 = AbstractC5200u3.f30016b;
        if (!M2.class.isAssignableFrom(cls)) {
            int i9 = C5171p3.f29965d;
        }
        InterfaceC5105e3 b8 = this.f29866a.b(cls);
        if (b8.zzb()) {
            int i10 = C5171p3.f29965d;
            return C5147l3.j(AbstractC5200u3.r(), E2.a(), b8.zza());
        }
        int i11 = C5171p3.f29965d;
        return C5141k3.A(cls, b8, AbstractC5159n3.a(), W2.a(), AbstractC5200u3.r(), b8.a() + (-1) != 1 ? E2.a() : null, AbstractC5099d3.a());
    }
}
