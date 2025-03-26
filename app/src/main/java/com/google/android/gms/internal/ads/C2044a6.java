package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2044a6 implements InterfaceC2141b0 {

    /* renamed from: a, reason: collision with root package name */
    private final BU f20632a;

    /* renamed from: b, reason: collision with root package name */
    private final UQ f20633b = new UQ();

    /* renamed from: c, reason: collision with root package name */
    private final int f20634c;

    public C2044a6(int i8, BU bu, int i9) {
        this.f20634c = i8;
        this.f20632a = bu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2141b0
    public final C2032a0 a(InterfaceC3989s0 interfaceC3989s0, long j8) {
        int a8;
        int a9;
        long c8 = interfaceC3989s0.c();
        int min = (int) Math.min(112800L, interfaceC3989s0.d() - c8);
        this.f20633b.i(min);
        interfaceC3989s0.I(this.f20633b.n(), 0, min);
        UQ uq = this.f20633b;
        int u7 = uq.u();
        long j9 = -1;
        long j10 = -9223372036854775807L;
        long j11 = -1;
        while (uq.r() >= 188 && (a9 = (a8 = AbstractC3239l6.a(uq.n(), uq.t(), u7)) + 188) <= u7) {
            long b8 = AbstractC3239l6.b(uq, a8, this.f20634c);
            if (b8 != -9223372036854775807L) {
                long b9 = this.f20632a.b(b8);
                if (b9 <= j8) {
                    j11 = a8;
                    if (100000 + b9 <= j8) {
                        j10 = b9;
                    }
                } else if (j10 == -9223372036854775807L) {
                    return C2032a0.d(b9, c8);
                }
                return C2032a0.e(c8 + j11);
            }
            uq.l(a9);
            j9 = a9;
        }
        return j10 != -9223372036854775807L ? C2032a0.f(j10, c8 + j9) : C2032a0.f20611d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2141b0
    public final void zzb() {
        byte[] bArr = AbstractC2301cW.f21211f;
        int length = bArr.length;
        this.f20633b.j(bArr, 0);
    }
}
