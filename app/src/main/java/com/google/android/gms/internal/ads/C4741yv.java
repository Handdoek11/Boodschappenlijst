package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4741yv implements InterfaceC3271lO {

    /* renamed from: a, reason: collision with root package name */
    private final Long f28229a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28230b;

    /* renamed from: c, reason: collision with root package name */
    private final C3107jv f28231c;

    /* renamed from: d, reason: collision with root package name */
    private final C1144Av f28232d;

    /* synthetic */ C4741yv(C3107jv c3107jv, C1144Av c1144Av, Long l8, String str, AbstractC1676Pv abstractC1676Pv) {
        this.f28231c = c3107jv;
        this.f28232d = c1144Av;
        this.f28229a = l8;
        this.f28230b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271lO
    public final C4578xO zza() {
        C1144Av c1144Av = this.f28232d;
        return AbstractC4687yO.a(this.f28229a.longValue(), c1144Av.f13687a, C3924rO.b(c1144Av.f13688b), this.f28231c, this.f28230b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271lO
    public final BO zzb() {
        C1144Av c1144Av = this.f28232d;
        return CO.a(this.f28229a.longValue(), c1144Av.f13687a, C3924rO.b(c1144Av.f13688b), this.f28231c, this.f28230b);
    }
}
