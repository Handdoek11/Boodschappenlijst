package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4805zX implements IX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AX f28652a;

    C4805zX(AX ax) {
        this.f28652a = ax;
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        PG pg = (PG) obj;
        synchronized (this.f28652a) {
            this.f28652a.f13575A = pg;
            this.f28652a.f13575A.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.IX
    public final void zza() {
        synchronized (this.f28652a) {
            this.f28652a.f13575A = null;
        }
    }
}
