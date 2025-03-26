package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class B9 implements InterfaceC1861Vc0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3941rc0 f13750a;

    B9(C3941rc0 c3941rc0) {
        this.f13750a = c3941rc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Vc0
    public final void a(int i8, long j8, String str) {
        this.f13750a.e(i8, System.currentTimeMillis() - j8, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Vc0
    public final void d(int i8, long j8) {
        this.f13750a.d(i8, System.currentTimeMillis() - j8);
    }
}
