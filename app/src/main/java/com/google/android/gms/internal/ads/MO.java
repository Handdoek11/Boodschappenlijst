package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class MO implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SO f17346a;

    MO(SO so) {
        this.f17346a = so;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        synchronized (this) {
            this.f17346a.f18880c = true;
            this.f17346a.v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (C2.v.c().b() - this.f17346a.f18881d));
            this.f17346a.f18882e.d(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.f17346a.f18880c = true;
            this.f17346a.v("com.google.android.gms.ads.MobileAds", true, "", (int) (C2.v.c().b() - this.f17346a.f18881d));
            this.f17346a.f18886i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.LO
                @Override // java.lang.Runnable
                public final void run() {
                    SO.j(this.f16823o.f17346a, str);
                }
            });
        }
    }
}
