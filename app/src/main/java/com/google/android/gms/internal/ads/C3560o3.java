package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3560o3 implements InterfaceC3233l3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25087a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25088b;

    /* renamed from: c, reason: collision with root package name */
    private final UQ f25089c;

    public C3560o3(C3064jZ c3064jZ, D d8) {
        UQ uq = c3064jZ.f23275b;
        this.f25089c = uq;
        uq.l(12);
        int F7 = uq.F();
        if ("audio/raw".equals(d8.f14334o)) {
            int C7 = AbstractC2301cW.C(d8.f14313F) * d8.f14311D;
            if (F7 == 0 || F7 % C7 != 0) {
                HL.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + C7 + ", stsz sample size: " + F7);
                F7 = C7;
            }
        }
        this.f25087a = F7 == 0 ? -1 : F7;
        this.f25088b = uq.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3233l3
    public final int a() {
        int i8 = this.f25087a;
        return i8 == -1 ? this.f25089c.F() : i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3233l3
    public final int zza() {
        return this.f25087a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3233l3
    public final int zzb() {
        return this.f25088b;
    }
}
