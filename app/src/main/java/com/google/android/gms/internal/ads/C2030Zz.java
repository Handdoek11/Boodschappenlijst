package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2030Zz implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Yj0 f20600a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2052aA f20601b;

    C2030Zz(C2052aA c2052aA, Yj0 yj0) {
        this.f20600a = yj0;
        this.f20601b = c2052aA;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Uz
            @Override // java.lang.Runnable
            public final void run() {
                this.f19491o.d();
            }
        });
        this.f20600a.a(th);
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Uz
            @Override // java.lang.Runnable
            public final void run() {
                this.f19491o.d();
            }
        });
        this.f20600a.c((AbstractC1506Kz) obj);
    }
}
