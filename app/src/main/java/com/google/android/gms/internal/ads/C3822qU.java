package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3822qU implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3930rU f25930a;

    C3822qU(C3930rU c3930rU) {
        this.f25930a = c3930rU;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        D2.W0 a8 = this.f25930a.f26175a.d().a(th);
        this.f25930a.f26178d.r0(a8);
        AbstractC2917i70.b(a8.f1162o, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* synthetic */ void c(Object obj) {
        ((AbstractC4420vy) obj).b();
    }
}
