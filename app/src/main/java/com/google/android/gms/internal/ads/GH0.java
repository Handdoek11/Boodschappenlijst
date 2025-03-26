package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class GH0 implements EG0, DG0 {

    /* renamed from: o, reason: collision with root package name */
    private final EG0 f15346o;

    /* renamed from: s, reason: collision with root package name */
    private final long f15347s;

    /* renamed from: t, reason: collision with root package name */
    private DG0 f15348t;

    public GH0(EG0 eg0, long j8) {
        this.f15346o = eg0;
        this.f15347s = j8;
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long a() {
        long a8 = this.f15346o.a();
        if (a8 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return a8 + this.f15347s;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long b(long j8) {
        long j9 = this.f15347s;
        return this.f15346o.b(j8 - j9) + j9;
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final void c(long j8) {
        this.f15346o.c(j8 - this.f15347s);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long d() {
        long d8 = this.f15346o.d();
        if (d8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return d8 + this.f15347s;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final JH0 e() {
        return this.f15346o.e();
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean f(Yz0 yz0) {
        long j8 = yz0.f20368a;
        long j9 = this.f15347s;
        Wz0 a8 = yz0.a();
        a8.e(j8 - j9);
        return this.f15346o.f(a8.g());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787zH0
    public final /* bridge */ /* synthetic */ void g(BH0 bh0) {
        DG0 dg0 = this.f15348t;
        dg0.getClass();
        dg0.g(this);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long h(long j8, FA0 fa0) {
        long j9 = this.f15347s;
        return this.f15346o.h(j8 - j9, fa0) + j9;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void i() {
        this.f15346o.i();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void j(long j8, boolean z7) {
        this.f15346o.j(j8 - this.f15347s, false);
    }

    @Override // com.google.android.gms.internal.ads.DG0
    public final void k(EG0 eg0) {
        DG0 dg0 = this.f15348t;
        dg0.getClass();
        dg0.k(this);
    }

    public final EG0 l() {
        return this.f15346o;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long n(BI0[] bi0Arr, boolean[] zArr, InterfaceC4678yH0[] interfaceC4678yH0Arr, boolean[] zArr2, long j8) {
        InterfaceC4678yH0[] interfaceC4678yH0Arr2 = new InterfaceC4678yH0[interfaceC4678yH0Arr.length];
        int i8 = 0;
        while (true) {
            InterfaceC4678yH0 interfaceC4678yH0 = null;
            if (i8 >= interfaceC4678yH0Arr.length) {
                break;
            }
            FH0 fh0 = (FH0) interfaceC4678yH0Arr[i8];
            if (fh0 != null) {
                interfaceC4678yH0 = fh0.e();
            }
            interfaceC4678yH0Arr2[i8] = interfaceC4678yH0;
            i8++;
        }
        long n8 = this.f15346o.n(bi0Arr, zArr, interfaceC4678yH0Arr2, zArr2, j8 - this.f15347s);
        for (int i9 = 0; i9 < interfaceC4678yH0Arr.length; i9++) {
            InterfaceC4678yH0 interfaceC4678yH02 = interfaceC4678yH0Arr2[i9];
            if (interfaceC4678yH02 == null) {
                interfaceC4678yH0Arr[i9] = null;
            } else {
                InterfaceC4678yH0 interfaceC4678yH03 = interfaceC4678yH0Arr[i9];
                if (interfaceC4678yH03 == null || ((FH0) interfaceC4678yH03).e() != interfaceC4678yH02) {
                    interfaceC4678yH0Arr[i9] = new FH0(interfaceC4678yH02, this.f15347s);
                }
            }
        }
        return n8 + this.f15347s;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void o(DG0 dg0, long j8) {
        this.f15348t = dg0;
        this.f15346o.o(this, j8 - this.f15347s);
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean p() {
        return this.f15346o.p();
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long zzb() {
        long zzb = this.f15346o.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.f15347s;
    }
}
