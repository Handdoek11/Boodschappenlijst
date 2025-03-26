package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4318v1 implements InterfaceC2141b0 {

    /* renamed from: a, reason: collision with root package name */
    private final C0 f27164a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27165b;

    /* renamed from: c, reason: collision with root package name */
    private final C4534x0 f27166c = new C4534x0();

    /* synthetic */ C4318v1(C0 c02, int i8, AbstractC4427w1 abstractC4427w1) {
        this.f27164a = c02;
        this.f27165b = i8;
    }

    private final long b(InterfaceC3989s0 interfaceC3989s0) {
        while (interfaceC3989s0.b() < interfaceC3989s0.d() - 6) {
            C0 c02 = this.f27164a;
            int i8 = this.f27165b;
            C4534x0 c4534x0 = this.f27166c;
            long b8 = interfaceC3989s0.b();
            byte[] bArr = new byte[2];
            interfaceC3989s0.I(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i8) {
                interfaceC3989s0.h();
                interfaceC3989s0.z((int) (b8 - interfaceC3989s0.c()));
            } else {
                UQ uq = new UQ(16);
                System.arraycopy(bArr, 0, uq.n(), 0, 2);
                uq.k(AbstractC4316v0.a(interfaceC3989s0, uq.n(), 2, 14));
                interfaceC3989s0.h();
                interfaceC3989s0.z((int) (b8 - interfaceC3989s0.c()));
                if (AbstractC4643y0.c(uq, c02, i8, c4534x0)) {
                    break;
                }
            }
            interfaceC3989s0.z(1);
        }
        if (interfaceC3989s0.b() < interfaceC3989s0.d() - 6) {
            return this.f27166c.f27706a;
        }
        interfaceC3989s0.z((int) (interfaceC3989s0.d() - interfaceC3989s0.b()));
        return this.f27164a.f14060j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2141b0
    public final C2032a0 a(InterfaceC3989s0 interfaceC3989s0, long j8) {
        long c8 = interfaceC3989s0.c();
        long b8 = b(interfaceC3989s0);
        long b9 = interfaceC3989s0.b();
        interfaceC3989s0.z(Math.max(6, this.f27164a.f14053c));
        long b10 = b(interfaceC3989s0);
        return (b8 > j8 || b10 <= j8) ? b10 <= j8 ? C2032a0.f(b10, interfaceC3989s0.b()) : C2032a0.d(b8, c8) : C2032a0.e(b9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2141b0
    public final /* synthetic */ void zzb() {
    }
}
