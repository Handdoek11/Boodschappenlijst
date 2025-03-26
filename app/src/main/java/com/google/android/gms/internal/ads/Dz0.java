package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class Dz0 implements InterfaceC2487eA0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14612a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC1981Yl f14613b;

    public Dz0(Object obj, BG0 bg0) {
        this.f14612a = obj;
        this.f14613b = bg0.H();
    }

    public final void a(AbstractC1981Yl abstractC1981Yl) {
        this.f14613b = abstractC1981Yl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2487eA0
    public final AbstractC1981Yl zza() {
        return this.f14613b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2487eA0
    public final Object zzb() {
        return this.f14612a;
    }
}
