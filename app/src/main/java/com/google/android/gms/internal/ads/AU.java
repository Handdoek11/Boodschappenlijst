package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AU implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13562a;

    /* renamed from: b, reason: collision with root package name */
    private final C2508eM f13563b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4241uH f13564c;

    /* renamed from: d, reason: collision with root package name */
    private final L60 f13565d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f13566e;

    /* renamed from: f, reason: collision with root package name */
    private final H2.a f13567f;

    /* renamed from: g, reason: collision with root package name */
    private final C1767Si f13568g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f13569h = ((Boolean) D2.A.c().a(AbstractC3184kf.N8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final US f13570i;

    /* renamed from: j, reason: collision with root package name */
    private final BN f13571j;

    /* renamed from: k, reason: collision with root package name */
    private final HN f13572k;

    public AU(Context context, H2.a aVar, L60 l60, Executor executor, AbstractC4241uH abstractC4241uH, C2508eM c2508eM, C1767Si c1767Si, US us, BN bn, HN hn) {
        this.f13562a = context;
        this.f13565d = l60;
        this.f13564c = abstractC4241uH;
        this.f13566e = executor;
        this.f13567f = aVar;
        this.f13563b = c2508eM;
        this.f13568g = c1767Si;
        this.f13570i = us;
        this.f13571j = bn;
        this.f13572k = hn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        C4220u60 c4220u60 = c3785q60.f25814s;
        return (c4220u60 == null || c4220u60.f26996a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(final C60 c60, final C3785q60 c3785q60) {
        final C3051jM c3051jM = new C3051jM();
        com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.vU
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f27265a.c(c3785q60, c60, c3051jM, obj);
            }
        }, this.f13566e);
        n8.f(new Runnable() { // from class: com.google.android.gms.internal.ads.wU
            @Override // java.lang.Runnable
            public final void run() {
                c3051jM.b();
            }
        }, this.f13566e);
        return n8;
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(final C3785q60 c3785q60, C60 c60, C3051jM c3051jM, Object obj) {
        final AU au;
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23949m2;
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f13571j.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_START.a(), C2.v.c().a());
        }
        final InterfaceC4410vt a8 = this.f13563b.a(this.f13565d.f16767e, c3785q60, c60.f14101b.f13520b);
        a8.g0(c3785q60.f25774W);
        c3051jM.a(this.f13562a, a8.M());
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f13571j.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_END.a(), C2.v.c().a());
        }
        C1811Tq c1811Tq = new C1811Tq();
        final QG c8 = this.f13564c.c(new C2161bA(c60, c3785q60, null), new TG(new C4802zU(this.f13562a, this.f13567f, c1811Tq, c3785q60, a8, this.f13565d, this.f13569h, this.f13568g, this.f13570i, this.f13572k), a8));
        c1811Tq.c(c8);
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            au = this;
            au.f13571j.a().putLong(EnumC3706pN.RENDERING_AD_COMPONENT_CREATION_END.a(), C2.v.c().a());
        } else {
            au = this;
        }
        c8.b().f1(new EC() { // from class: com.google.android.gms.internal.ads.xU
            @Override // com.google.android.gms.internal.ads.EC
            public final void r() {
                InterfaceC4410vt interfaceC4410vt = a8;
                if (interfaceC4410vt.L() != null) {
                    interfaceC4410vt.L().s();
                }
            }
        }, AbstractC1497Kq.f16650g);
        String str = c3785q60.f25814s.f26996a;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && c8.l().e(true)) {
            str = AbstractC2996iu.b(str, AbstractC2996iu.a(c3785q60));
        }
        c8.k().i(a8, true, au.f13569h ? au.f13568g : null, au.f13571j.a());
        c8.k();
        return AbstractC2326ck0.m(C2400dM.j(a8, c3785q60.f25814s.f26997b, str, au.f13571j.a()), new InterfaceC1376Hf0(au) { // from class: com.google.android.gms.internal.ads.yU
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj2) {
                InterfaceC4410vt interfaceC4410vt = a8;
                if (c3785q60.f25764M) {
                    interfaceC4410vt.D();
                }
                QG qg = c8;
                interfaceC4410vt.X();
                interfaceC4410vt.onPause();
                return qg.i();
            }
        }, au.f13566e);
    }
}
