package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class Ck0 extends AbstractRunnableC3195kk0 {

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC1384Hj0 f14218t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Ek0 f14219u;

    Ck0(Ek0 ek0, InterfaceC1384Hj0 interfaceC1384Hj0) {
        this.f14219u = ek0;
        this.f14218t = interfaceC1384Hj0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final /* bridge */ /* synthetic */ Object a() {
        InterfaceC1384Hj0 interfaceC1384Hj0 = this.f14218t;
        com.google.common.util.concurrent.d zza = interfaceC1384Hj0.zza();
        AbstractC1762Sf0.d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1384Hj0);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final String b() {
        return this.f14218t.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final void d(Throwable th) {
        this.f14219u.h(th);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final /* synthetic */ void e(Object obj) {
        this.f14219u.v((com.google.common.util.concurrent.d) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final boolean f() {
        return this.f14219u.isDone();
    }
}
