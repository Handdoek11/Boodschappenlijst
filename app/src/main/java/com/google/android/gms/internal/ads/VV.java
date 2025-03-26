package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class VV implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19597a;

    /* renamed from: b, reason: collision with root package name */
    private final C2508eM f19598b;

    /* renamed from: c, reason: collision with root package name */
    private final NL f19599c;

    /* renamed from: d, reason: collision with root package name */
    private final L60 f19600d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f19601e;

    /* renamed from: f, reason: collision with root package name */
    private final H2.a f19602f;

    /* renamed from: g, reason: collision with root package name */
    private final C1767Si f19603g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f19604h = ((Boolean) D2.A.c().a(AbstractC3184kf.N8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final US f19605i;

    /* renamed from: j, reason: collision with root package name */
    private final BN f19606j;

    /* renamed from: k, reason: collision with root package name */
    private final HN f19607k;

    public VV(Context context, H2.a aVar, L60 l60, Executor executor, NL nl, C2508eM c2508eM, C1767Si c1767Si, US us, BN bn, HN hn) {
        this.f19597a = context;
        this.f19600d = l60;
        this.f19599c = nl;
        this.f19601e = executor;
        this.f19602f = aVar;
        this.f19598b = c2508eM;
        this.f19603g = c1767Si;
        this.f19605i = us;
        this.f19606j = bn;
        this.f19607k = hn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        C4220u60 c4220u60 = c3785q60.f25814s;
        return (c4220u60 == null || c4220u60.f26996a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(final C60 c60, final C3785q60 c3785q60) {
        final C3051jM c3051jM = new C3051jM();
        com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.QV
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f18473a.c(c3785q60, c60, c3051jM, obj);
            }
        }, this.f19601e);
        n8.f(new Runnable() { // from class: com.google.android.gms.internal.ads.RV
            @Override // java.lang.Runnable
            public final void run() {
                c3051jM.b();
            }
        }, this.f19601e);
        return n8;
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(final C3785q60 c3785q60, C60 c60, C3051jM c3051jM, Object obj) {
        final VV vv;
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23949m2;
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f19606j.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_START.a(), C2.v.c().a());
        }
        final InterfaceC4410vt a8 = this.f19598b.a(this.f19600d.f16767e, c3785q60, c60.f14101b.f13520b);
        a8.g0(c3785q60.f25774W);
        c3051jM.a(this.f19597a, a8.M());
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f19606j.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_END.a(), C2.v.c().a());
        }
        C1811Tq c1811Tq = new C1811Tq();
        final JL d8 = this.f19599c.d(new C2161bA(c60, c3785q60, null), new KL(new UV(this.f19597a, this.f19598b, this.f19600d, this.f19602f, c3785q60, c1811Tq, a8, this.f19603g, this.f19604h, this.f19605i, this.f19606j, this.f19607k), a8));
        c1811Tq.c(d8);
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            vv = this;
            vv.f19606j.a().putLong(EnumC3706pN.RENDERING_AD_COMPONENT_CREATION_END.a(), C2.v.c().a());
        } else {
            vv = this;
        }
        C2975ij.b(a8, d8.i());
        d8.b().f1(new EC() { // from class: com.google.android.gms.internal.ads.OV
            @Override // com.google.android.gms.internal.ads.EC
            public final void r() {
                InterfaceC4410vt interfaceC4410vt = a8;
                if (interfaceC4410vt.L() != null) {
                    interfaceC4410vt.L().s();
                }
            }
        }, AbstractC1497Kq.f16650g);
        d8.l().i(a8, true, vv.f19604h ? vv.f19603g : null, vv.f19606j.a());
        String str = c3785q60.f25814s.f26996a;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && d8.m().e(true)) {
            str = AbstractC2996iu.b(str, AbstractC2996iu.a(c3785q60));
        }
        d8.l();
        return AbstractC2326ck0.m(C2400dM.j(a8, c3785q60.f25814s.f26997b, str, vv.f19606j.a()), new InterfaceC1376Hf0(vv) { // from class: com.google.android.gms.internal.ads.PV
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj2) {
                InterfaceC4410vt interfaceC4410vt = a8;
                if (c3785q60.f25764M) {
                    interfaceC4410vt.D();
                }
                JL jl = d8;
                interfaceC4410vt.X();
                interfaceC4410vt.onPause();
                return jl.k();
            }
        }, vv.f19601e);
    }
}
