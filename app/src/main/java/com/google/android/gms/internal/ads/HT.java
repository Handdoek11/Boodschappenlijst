package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class HT implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3113jy f15731a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15732b;

    /* renamed from: c, reason: collision with root package name */
    private final C2508eM f15733c;

    /* renamed from: d, reason: collision with root package name */
    private final L60 f15734d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f15735e;

    /* renamed from: f, reason: collision with root package name */
    private final H2.a f15736f;

    /* renamed from: g, reason: collision with root package name */
    private final C1767Si f15737g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15738h = ((Boolean) D2.A.c().a(AbstractC3184kf.N8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final US f15739i;

    /* renamed from: j, reason: collision with root package name */
    private final BN f15740j;

    /* renamed from: k, reason: collision with root package name */
    private final HN f15741k;

    public HT(AbstractC3113jy abstractC3113jy, Context context, Executor executor, C2508eM c2508eM, L60 l60, H2.a aVar, C1767Si c1767Si, US us, BN bn, HN hn) {
        this.f15732b = context;
        this.f15731a = abstractC3113jy;
        this.f15735e = executor;
        this.f15733c = c2508eM;
        this.f15734d = l60;
        this.f15736f = aVar;
        this.f15737g = c1767Si;
        this.f15739i = us;
        this.f15740j = bn;
        this.f15741k = hn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        C4220u60 c4220u60 = c3785q60.f25814s;
        return (c4220u60 == null || c4220u60.f26996a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(final C60 c60, final C3785q60 c3785q60) {
        final C3051jM c3051jM = new C3051jM();
        com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.DT
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f14496a.c(c3785q60, c60, c3051jM, obj);
            }
        }, this.f15735e);
        n8.f(new Runnable() { // from class: com.google.android.gms.internal.ads.ET
            @Override // java.lang.Runnable
            public final void run() {
                c3051jM.b();
            }
        }, this.f15735e);
        return n8;
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(final C3785q60 c3785q60, C60 c60, C3051jM c3051jM, Object obj) {
        final HT ht;
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23949m2;
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f15740j.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_START.a(), C2.v.c().a());
        }
        final InterfaceC4410vt a8 = this.f15733c.a(this.f15734d.f16767e, c3785q60, c60.f14101b.f13520b);
        a8.g0(c3785q60.f25774W);
        c3051jM.a(this.f15732b, a8.M());
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f15740j.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_END.a(), C2.v.c().a());
        }
        C1811Tq c1811Tq = new C1811Tq();
        final AbstractC2679fy b8 = this.f15731a.b(new C2161bA(c60, c3785q60, null), new TG(new JT(this.f15736f, c1811Tq, c3785q60, a8, this.f15734d, this.f15738h, this.f15737g, this.f15739i, this.f15741k), a8), new C2788gy(c3785q60.f25779a0));
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            ht = this;
            ht.f15740j.a().putLong(EnumC3706pN.RENDERING_AD_COMPONENT_CREATION_END.a(), C2.v.c().a());
        } else {
            ht = this;
        }
        b8.j().i(a8, false, ht.f15738h ? ht.f15737g : null, ht.f15740j.a());
        c1811Tq.c(b8);
        b8.b().f1(new EC() { // from class: com.google.android.gms.internal.ads.FT
            @Override // com.google.android.gms.internal.ads.EC
            public final void r() {
                InterfaceC4410vt interfaceC4410vt = a8;
                if (interfaceC4410vt.L() != null) {
                    interfaceC4410vt.L().s();
                }
            }
        }, AbstractC1497Kq.f16650g);
        String str = c3785q60.f25814s.f26996a;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && b8.k().e(true)) {
            str = AbstractC2996iu.b(str, AbstractC2996iu.a(c3785q60));
        }
        b8.j();
        return AbstractC2326ck0.m(C2400dM.j(a8, c3785q60.f25814s.f26997b, str, ht.f15740j.a()), new InterfaceC1376Hf0(ht) { // from class: com.google.android.gms.internal.ads.GT
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj2) {
                InterfaceC4410vt interfaceC4410vt = a8;
                if (c3785q60.f25764M) {
                    interfaceC4410vt.D();
                }
                AbstractC2679fy abstractC2679fy = b8;
                interfaceC4410vt.X();
                interfaceC4410vt.onPause();
                return abstractC2679fy.h();
            }
        }, ht.f15735e);
    }
}
