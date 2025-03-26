package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3807qH0 implements LI0 {

    /* renamed from: a, reason: collision with root package name */
    public long f25887a;

    /* renamed from: b, reason: collision with root package name */
    public long f25888b;

    /* renamed from: c, reason: collision with root package name */
    public KI0 f25889c;

    /* renamed from: d, reason: collision with root package name */
    public C3807qH0 f25890d;

    public C3807qH0(long j8, int i8) {
        e(j8, 65536);
    }

    @Override // com.google.android.gms.internal.ads.LI0
    public final KI0 a() {
        KI0 ki0 = this.f25889c;
        ki0.getClass();
        return ki0;
    }

    public final int b(long j8) {
        long j9 = j8 - this.f25887a;
        int i8 = this.f25889c.f16572b;
        return (int) j9;
    }

    public final C3807qH0 c() {
        this.f25889c = null;
        C3807qH0 c3807qH0 = this.f25890d;
        this.f25890d = null;
        return c3807qH0;
    }

    @Override // com.google.android.gms.internal.ads.LI0
    public final LI0 d() {
        C3807qH0 c3807qH0 = this.f25890d;
        if (c3807qH0 == null || c3807qH0.f25889c == null) {
            return null;
        }
        return c3807qH0;
    }

    public final void e(long j8, int i8) {
        AbstractC3796qC.f(this.f25889c == null);
        this.f25887a = j8;
        this.f25888b = j8 + 65536;
    }
}
