package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1210Cp implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.d f14232a;

    C1210Cp(C1246Dp c1246Dp, com.google.common.util.concurrent.d dVar) {
        this.f14232a = dVar;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        C1246Dp.f14556l.remove(this.f14232a);
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        C1246Dp.f14556l.remove(this.f14232a);
    }
}
