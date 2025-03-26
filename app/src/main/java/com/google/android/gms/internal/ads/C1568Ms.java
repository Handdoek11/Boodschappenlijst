package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ms, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1568Ms implements Vz0 {

    /* renamed from: a, reason: collision with root package name */
    private final RI0 f17415a = new RI0(true, 65536);

    /* renamed from: b, reason: collision with root package name */
    private long f17416b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    private long f17417c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    private long f17418d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    private long f17419e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private int f17420f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17421g;

    C1568Ms() {
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final boolean a(C2059aD0 c2059aD0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final /* synthetic */ boolean b(AbstractC1981Yl abstractC1981Yl, GG0 gg0, long j8) {
        HL.f("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final void c(Uz0 uz0, JH0 jh0, BI0[] bi0Arr) {
        int i8;
        this.f17420f = 0;
        for (BI0 bi0 : bi0Arr) {
            if (bi0 != null) {
                int i9 = this.f17420f;
                int i10 = bi0.g().f27904c;
                if (i10 == 0) {
                    i8 = 144310272;
                } else if (i10 == 1) {
                    i8 = 13107200;
                } else if (i10 != 2) {
                    i8 = 131072;
                    if (i10 != 3 && i10 != 5 && i10 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i8 = 131072000;
                }
                this.f17420f = i9 + i8;
            }
        }
        this.f17415a.f(this.f17420f);
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final boolean d(Uz0 uz0) {
        long j8 = uz0.f19493b;
        boolean z7 = true;
        char c8 = j8 > this.f17417c ? (char) 0 : j8 < this.f17416b ? (char) 2 : (char) 1;
        int a8 = this.f17415a.a();
        int i8 = this.f17420f;
        if (c8 != 2 && (c8 != 1 || !this.f17421g || a8 >= i8)) {
            z7 = false;
        }
        this.f17421g = z7;
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final void e(C2059aD0 c2059aD0) {
        k(false);
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final long f(C2059aD0 c2059aD0) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final void g(C2059aD0 c2059aD0) {
        k(true);
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final boolean h(Uz0 uz0) {
        long j8 = uz0.f19495d ? this.f17419e : this.f17418d;
        return j8 <= 0 || uz0.f19493b >= j8;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final RI0 i() {
        return this.f17415a;
    }

    @Override // com.google.android.gms.internal.ads.Vz0
    public final void j(C2059aD0 c2059aD0) {
        k(true);
    }

    final void k(boolean z7) {
        this.f17420f = 0;
        this.f17421g = false;
        if (z7) {
            this.f17415a.e();
        }
    }

    public final synchronized void l(int i8) {
        this.f17418d = i8 * 1000;
    }

    public final synchronized void m(int i8) {
        this.f17419e = i8 * 1000;
    }

    public final synchronized void n(int i8) {
        this.f17417c = i8 * 1000;
    }

    public final synchronized void o(int i8) {
        this.f17416b = i8 * 1000;
    }
}
