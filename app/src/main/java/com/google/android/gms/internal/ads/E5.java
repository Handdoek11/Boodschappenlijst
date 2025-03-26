package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class E5 implements InterfaceC4217u5 {

    /* renamed from: b, reason: collision with root package name */
    private Y0 f14638b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14639c;

    /* renamed from: e, reason: collision with root package name */
    private int f14641e;

    /* renamed from: f, reason: collision with root package name */
    private int f14642f;

    /* renamed from: a, reason: collision with root package name */
    private final UQ f14637a = new UQ(10);

    /* renamed from: d, reason: collision with root package name */
    private long f14640d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
        int i8;
        AbstractC3796qC.b(this.f14638b);
        if (this.f14639c && (i8 = this.f14641e) != 0 && this.f14642f == i8) {
            AbstractC3796qC.f(this.f14640d != -9223372036854775807L);
            this.f14638b.b(this.f14640d, 1, this.f14641e, 0, null);
            this.f14639c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f14639c = false;
        this.f14640d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void c(UQ uq) {
        AbstractC3796qC.b(this.f14638b);
        if (this.f14639c) {
            int r8 = uq.r();
            int i8 = this.f14642f;
            if (i8 < 10) {
                int min = Math.min(r8, 10 - i8);
                System.arraycopy(uq.n(), uq.t(), this.f14637a.n(), this.f14642f, min);
                if (this.f14642f + min == 10) {
                    this.f14637a.l(0);
                    if (this.f14637a.C() != 73 || this.f14637a.C() != 68 || this.f14637a.C() != 51) {
                        HL.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f14639c = false;
                        return;
                    } else {
                        this.f14637a.m(3);
                        this.f14641e = this.f14637a.B() + 10;
                    }
                }
            }
            int min2 = Math.min(r8, this.f14641e - this.f14642f);
            this.f14638b.a(uq, min2);
            this.f14642f += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        Y0 R7 = interfaceC4207u0.R(c3021j6.a(), 5);
        this.f14638b = R7;
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.m(c3021j6.b());
        c2723gJ0.B("application/id3");
        R7.c(c2723gJ0.H());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        if ((i8 & 4) == 0) {
            return;
        }
        this.f14639c = true;
        this.f14640d = j8;
        this.f14641e = 0;
        this.f14642f = 0;
    }
}
