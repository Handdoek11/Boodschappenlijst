package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4632xv implements InterfaceC3162kO {

    /* renamed from: a, reason: collision with root package name */
    private final C3107jv f27939a;

    /* renamed from: b, reason: collision with root package name */
    private final C1144Av f27940b;

    /* renamed from: c, reason: collision with root package name */
    private Long f27941c;

    /* renamed from: d, reason: collision with root package name */
    private String f27942d;

    /* synthetic */ C4632xv(C3107jv c3107jv, C1144Av c1144Av, AbstractC1676Pv abstractC1676Pv) {
        this.f27939a = c3107jv;
        this.f27940b = c1144Av;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3162kO
    public final InterfaceC3271lO a() {
        AbstractC3332ly0.c(this.f27941c, Long.class);
        AbstractC3332ly0.c(this.f27942d, String.class);
        return new C4741yv(this.f27939a, this.f27940b, this.f27941c, this.f27942d, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3162kO
    public final /* bridge */ /* synthetic */ InterfaceC3162kO c(long j8) {
        this.f27941c = Long.valueOf(j8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3162kO
    public final /* bridge */ /* synthetic */ InterfaceC3162kO n(String str) {
        str.getClass();
        this.f27942d = str;
        return this;
    }
}
