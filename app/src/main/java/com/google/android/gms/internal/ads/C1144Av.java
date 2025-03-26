package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Av, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1144Av implements InterfaceC4360vO {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13687a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3954rj f13688b;

    /* renamed from: c, reason: collision with root package name */
    private final C3107jv f13689c;

    /* renamed from: d, reason: collision with root package name */
    private final C1144Av f13690d = this;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3441my0 f13691e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3441my0 f13692f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3441my0 f13693g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3441my0 f13694h;

    /* synthetic */ C1144Av(C3107jv c3107jv, Context context, InterfaceC3954rj interfaceC3954rj, AbstractC1676Pv abstractC1676Pv) {
        this.f13689c = c3107jv;
        this.f13687a = context;
        this.f13688b = interfaceC3954rj;
        InterfaceC2462dy0 a8 = C2571ey0.a(this);
        this.f13691e = a8;
        InterfaceC2462dy0 a9 = C2571ey0.a(interfaceC3954rj);
        this.f13692f = a9;
        C3924rO c3924rO = new C3924rO(a9);
        this.f13693g = c3924rO;
        this.f13694h = C2354cy0.b(new C4142tO(a8, c3924rO));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4360vO
    public final BinderC4033sO d() {
        return (BinderC4033sO) this.f13694h.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4360vO
    public final InterfaceC3162kO zzb() {
        return new C4632xv(this.f13689c, this.f13690d, null);
    }
}
