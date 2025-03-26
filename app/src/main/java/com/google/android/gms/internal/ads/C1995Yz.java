package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Yz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1995Yz implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Yj0 f20366a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2052aA f20367b;

    C1995Yz(C2052aA c2052aA, Yj0 yj0) {
        this.f20366a = yj0;
        this.f20367b = c2052aA;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        this.f20366a.a(th);
        AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Uz
            @Override // java.lang.Runnable
            public final void run() {
                this.f19491o.d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        C2052aA.b(this.f20367b, ((C1820Tz) obj).f19204a, this.f20366a);
    }
}
