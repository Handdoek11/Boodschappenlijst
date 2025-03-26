package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class EL implements InterfaceC2867hj {

    /* renamed from: o, reason: collision with root package name */
    private final SC f14715o;

    /* renamed from: s, reason: collision with root package name */
    private final C1914Wo f14716s;

    /* renamed from: t, reason: collision with root package name */
    private final String f14717t;

    /* renamed from: u, reason: collision with root package name */
    private final String f14718u;

    public EL(SC sc, C3785q60 c3785q60) {
        this.f14715o = sc;
        this.f14716s = c3785q60.f25800l;
        this.f14717t = c3785q60.f25796j;
        this.f14718u = c3785q60.f25798k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2867hj
    public final void P0(C1914Wo c1914Wo) {
        int i8;
        String str;
        C1914Wo c1914Wo2 = this.f14716s;
        if (c1914Wo2 != null) {
            c1914Wo = c1914Wo2;
        }
        if (c1914Wo != null) {
            str = c1914Wo.f19842o;
            i8 = c1914Wo.f19843s;
        } else {
            i8 = 1;
            str = "";
        }
        this.f14715o.m1(new BinderC1353Go(str, i8), this.f14717t, this.f14718u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2867hj
    public final void a() {
        this.f14715o.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2867hj
    public final void zzb() {
        this.f14715o.b();
    }
}
