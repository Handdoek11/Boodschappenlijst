package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class FH0 implements InterfaceC4678yH0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4678yH0 f15120a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15121b;

    public FH0(InterfaceC4678yH0 interfaceC4678yH0, long j8) {
        this.f15120a = interfaceC4678yH0;
        this.f15121b = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final int a(Tz0 tz0, C4530wy0 c4530wy0, int i8) {
        int a8 = this.f15120a.a(tz0, c4530wy0, i8);
        if (a8 != -4) {
            return a8;
        }
        c4530wy0.f27697f += this.f15121b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final boolean b() {
        return this.f15120a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final int c(long j8) {
        return this.f15120a.c(j8 - this.f15121b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final void d() {
        this.f15120a.d();
    }

    public final InterfaceC4678yH0 e() {
        return this.f15120a;
    }
}
