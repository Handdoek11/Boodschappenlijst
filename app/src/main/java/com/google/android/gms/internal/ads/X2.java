package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class X2 extends AbstractC2575f0 implements InterfaceC2147b3 {

    /* renamed from: g, reason: collision with root package name */
    private final long f19947g;

    /* renamed from: h, reason: collision with root package name */
    private final int f19948h;

    /* renamed from: i, reason: collision with root package name */
    private final int f19949i;

    /* renamed from: j, reason: collision with root package name */
    private final long f19950j;

    public X2(long j8, long j9, int i8, int i9, boolean z7) {
        super(j8, j9, i8, i9, false);
        this.f19947g = j9;
        this.f19948h = i8;
        this.f19949i = i9;
        this.f19950j = j8 == -1 ? -1L : j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final int a() {
        return this.f19948h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final long b(long j8) {
        return f(j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final long d() {
        return this.f19950j;
    }

    public final X2 h(long j8) {
        return new X2(j8, this.f19947g, this.f19948h, this.f19949i, false);
    }
}
