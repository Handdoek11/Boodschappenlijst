package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class W implements R0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z f19686a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19687b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19688c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19689d;

    /* renamed from: e, reason: collision with root package name */
    private final long f19690e;

    /* renamed from: f, reason: collision with root package name */
    private final long f19691f;

    public W(Z z7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f19686a = z7;
        this.f19687b = j8;
        this.f19688c = j10;
        this.f19689d = j11;
        this.f19690e = j12;
        this.f19691f = j13;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        S0 s02 = new S0(j8, Y.f(this.f19686a.a(j8), 0L, this.f19688c, this.f19689d, this.f19690e, this.f19691f));
        return new P0(s02, s02);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return true;
    }

    public final long j(long j8) {
        return this.f19686a.a(j8);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f19687b;
    }
}
