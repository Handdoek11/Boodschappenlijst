package com.google.android.gms.internal.ads;

import G2.C0618v;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class XT implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2138az f20047a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f20048b;

    /* renamed from: c, reason: collision with root package name */
    private final C2508eM f20049c;

    /* renamed from: d, reason: collision with root package name */
    private final L60 f20050d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f20051e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1376Hf0 f20052f;

    /* renamed from: g, reason: collision with root package name */
    private final BN f20053g;

    public XT(AbstractC2138az abstractC2138az, Context context, Executor executor, C2508eM c2508eM, L60 l60, InterfaceC1376Hf0 interfaceC1376Hf0, BN bn) {
        this.f20048b = context;
        this.f20047a = abstractC2138az;
        this.f20051e = executor;
        this.f20049c = c2508eM;
        this.f20050d = l60;
        this.f20052f = interfaceC1376Hf0;
        this.f20053g = bn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        C4220u60 c4220u60 = c3785q60.f25814s;
        return (c4220u60 == null || c4220u60.f26996a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(final C60 c60, final C3785q60 c3785q60) {
        return AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.WT
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f19790a.c(c60, c3785q60, obj);
            }
        }, this.f20051e);
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(C60 c60, C3785q60 c3785q60, Object obj) {
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23949m2;
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f20053g.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_START.a(), C2.v.c().a());
        }
        D2.c2 a8 = R60.a(this.f20048b, c3785q60.f25818u);
        final InterfaceC4410vt a9 = this.f20049c.a(a8, c3785q60, c60.f14101b.f13520b);
        a9.g0(c3785q60.f25774W);
        View a10 = (((Boolean) D2.A.c().a(AbstractC3184kf.J7)).booleanValue() && c3785q60.f25791g0) ? ViewTreeObserverOnScrollChangedListenerC4531wz.a(this.f20048b, a9.M(), c3785q60) : new C2835hM(this.f20048b, a9.M(), (C0618v) this.f20052f.apply(c3785q60));
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f20053g.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_END.a(), C2.v.c().a());
        }
        final AbstractC4529wy a11 = this.f20047a.a(new C2161bA(c60, c3785q60, null), new C1219Cy(a10, a9, new InterfaceC1436Iz() { // from class: com.google.android.gms.internal.ads.RT
            @Override // com.google.android.gms.internal.ads.InterfaceC1436Iz
            public final D2.Y0 zza() {
                return a9.q();
            }
        }, R60.b(a8)));
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f20053g.a().putLong(EnumC3706pN.RENDERING_AD_COMPONENT_CREATION_END.a(), C2.v.c().a());
        }
        a11.j().i(a9, false, null, this.f20053g.a());
        CC b8 = a11.b();
        EC ec = new EC() { // from class: com.google.android.gms.internal.ads.ST
            @Override // com.google.android.gms.internal.ads.EC
            public final void r() {
                InterfaceC4410vt interfaceC4410vt = a9;
                if (interfaceC4410vt.L() != null) {
                    interfaceC4410vt.L().s();
                }
            }
        };
        InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16650g;
        b8.f1(ec, interfaceExecutorServiceC3522nk0);
        String str = c3785q60.f25814s.f26996a;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && a11.k().e(true)) {
            str = AbstractC2996iu.b(str, AbstractC2996iu.a(c3785q60));
        }
        a11.j();
        com.google.common.util.concurrent.d j8 = C2400dM.j(a9, c3785q60.f25814s.f26997b, str, this.f20053g.a());
        if (c3785q60.f25764M) {
            j8.f(new Runnable() { // from class: com.google.android.gms.internal.ads.TT
                @Override // java.lang.Runnable
                public final void run() {
                    a9.D();
                }
            }, this.f20051e);
        }
        j8.f(new Runnable() { // from class: com.google.android.gms.internal.ads.UT
            @Override // java.lang.Runnable
            public final void run() {
                this.f19380o.d(a9);
            }
        }, this.f20051e);
        return AbstractC2326ck0.m(j8, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.VT
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj2) {
                return a11.h();
            }
        }, interfaceExecutorServiceC3522nk0);
    }

    final /* synthetic */ void d(InterfaceC4410vt interfaceC4410vt) {
        interfaceC4410vt.X();
        L60 l60 = this.f20050d;
        BinderC2024Zt q8 = interfaceC4410vt.q();
        D2.Q1 q12 = l60.f16763a;
        if (q12 != null && q8 != null) {
            q8.x7(q12);
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23993r1)).booleanValue() || interfaceC4410vt.isAttachedToWindow()) {
            return;
        }
        interfaceC4410vt.onPause();
        interfaceC4410vt.j0(true);
    }
}
