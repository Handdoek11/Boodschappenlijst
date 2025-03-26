package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3325lv implements InterfaceC2897hy {

    /* renamed from: a, reason: collision with root package name */
    private final C3107jv f24398a;

    /* renamed from: b, reason: collision with root package name */
    private C2913i50 f24399b;

    /* renamed from: c, reason: collision with root package name */
    private K40 f24400c;

    /* renamed from: d, reason: collision with root package name */
    private C3039jF f24401d;

    /* renamed from: e, reason: collision with root package name */
    private SB f24402e;

    /* synthetic */ C3325lv(C3107jv c3107jv, AbstractC1676Pv abstractC1676Pv) {
        this.f24398a = c3107jv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2897hy
    public final /* bridge */ /* synthetic */ InterfaceC2897hy a(SB sb) {
        this.f24402e = sb;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.NB
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC3113jy e() {
        AbstractC3332ly0.c(this.f24401d, C3039jF.class);
        AbstractC3332ly0.c(this.f24402e, SB.class);
        return new C3434mv(this.f24398a, new C4009sA(), new C3787q70(), new C4120tB(), new XN(), this.f24401d, this.f24402e, DV.a(), null, this.f24399b, this.f24400c, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2897hy
    public final /* bridge */ /* synthetic */ InterfaceC2897hy d(C3039jF c3039jF) {
        this.f24401d = c3039jF;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final /* synthetic */ NB l(C2913i50 c2913i50) {
        this.f24399b = c2913i50;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final /* synthetic */ NB u(K40 k40) {
        this.f24400c = k40;
        return this;
    }
}
