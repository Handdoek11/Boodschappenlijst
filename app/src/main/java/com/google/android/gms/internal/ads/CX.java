package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class CX implements IX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DX f14184a;

    CX(DX dx) {
        this.f14184a = dx;
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        AbstractC1506Kz abstractC1506Kz = (AbstractC1506Kz) obj;
        synchronized (this.f14184a) {
            this.f14184a.f14506c = abstractC1506Kz.c();
            abstractC1506Kz.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final void zza() {
        synchronized (this.f14184a) {
        }
    }
}
