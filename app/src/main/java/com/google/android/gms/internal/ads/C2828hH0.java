package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2828hH0 implements InterfaceC4678yH0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f22529a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3153kH0 f22530b;

    public C2828hH0(C3153kH0 c3153kH0, int i8) {
        this.f22530b = c3153kH0;
        this.f22529a = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final int a(Tz0 tz0, C4530wy0 c4530wy0, int i8) {
        return this.f22530b.K(this.f22529a, tz0, c4530wy0, i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final boolean b() {
        return this.f22530b.z(this.f22529a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final int c(long j8) {
        return this.f22530b.L(this.f22529a, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final void d() {
        this.f22530b.x(this.f22529a);
    }
}
