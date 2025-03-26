package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import q.C6397a;

/* loaded from: classes.dex */
public final class DH implements ZC, F2.z, EC {

    /* renamed from: o, reason: collision with root package name */
    private final Context f14440o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC4410vt f14441s;

    /* renamed from: t, reason: collision with root package name */
    private final C3785q60 f14442t;

    /* renamed from: u, reason: collision with root package name */
    private final H2.a f14443u;

    /* renamed from: v, reason: collision with root package name */
    private final EnumC2746gd f14444v;

    /* renamed from: w, reason: collision with root package name */
    private final C3712pT f14445w;

    /* renamed from: x, reason: collision with root package name */
    C3929rT f14446x;

    public DH(Context context, InterfaceC4410vt interfaceC4410vt, C3785q60 c3785q60, H2.a aVar, EnumC2746gd enumC2746gd, C3712pT c3712pT) {
        this.f14440o = context;
        this.f14441s = interfaceC4410vt;
        this.f14442t = c3785q60;
        this.f14443u = aVar;
        this.f14444v = enumC2746gd;
        this.f14445w = c3712pT;
    }

    private final boolean a() {
        return ((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && this.f14445w.d();
    }

    @Override // F2.z
    public final void D0() {
    }

    @Override // F2.z
    public final void I3() {
    }

    @Override // F2.z
    public final void W4(int i8) {
        this.f14446x = null;
    }

    @Override // F2.z
    public final void q2() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void r() {
        if (a()) {
            this.f14445w.b();
            return;
        }
        if (this.f14446x == null || this.f14441s == null) {
            return;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23934k5)).booleanValue()) {
            this.f14441s.D0("onSdkImpression", new C6397a());
        }
    }

    @Override // F2.z
    public final void r3() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23934k5)).booleanValue() || this.f14441s == null) {
            return;
        }
        if (this.f14446x != null || a()) {
            if (this.f14446x != null) {
                this.f14441s.D0("onSdkImpression", new C6397a());
            } else {
                this.f14445w.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void s() {
        EnumC3603oT enumC3603oT;
        EnumC3494nT enumC3494nT;
        EnumC2746gd enumC2746gd;
        if ((((Boolean) D2.A.c().a(AbstractC3184kf.f23961n5)).booleanValue() || (enumC2746gd = this.f14444v) == EnumC2746gd.REWARD_BASED_VIDEO_AD || enumC2746gd == EnumC2746gd.INTERSTITIAL || enumC2746gd == EnumC2746gd.APP_OPEN) && this.f14442t.f25771T && this.f14441s != null) {
            if (C2.v.b().f(this.f14440o)) {
                if (a()) {
                    this.f14445w.c();
                    return;
                }
                H2.a aVar = this.f14443u;
                String str = aVar.f2915s + "." + aVar.f2916t;
                O60 o60 = this.f14442t.f25773V;
                String a8 = o60.a();
                if (o60.c() == 1) {
                    enumC3494nT = EnumC3494nT.VIDEO;
                    enumC3603oT = EnumC3603oT.DEFINED_BY_JAVASCRIPT;
                } else {
                    enumC3603oT = this.f14442t.f25776Y == 2 ? EnumC3603oT.UNSPECIFIED : EnumC3603oT.BEGIN_TO_RENDER;
                    enumC3494nT = EnumC3494nT.HTML_DISPLAY;
                }
                this.f14446x = C2.v.b().k(str, this.f14441s.A(), "", "javascript", a8, enumC3603oT, enumC3494nT, this.f14442t.f25801l0);
                View M7 = this.f14441s.M();
                C3929rT c3929rT = this.f14446x;
                if (c3929rT != null) {
                    AbstractC1927Xa0 a9 = c3929rT.a();
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23880e5)).booleanValue()) {
                        C2.v.b().c(a9, this.f14441s.A());
                        Iterator it = this.f14441s.E0().iterator();
                        while (it.hasNext()) {
                            C2.v.b().d(a9, (View) it.next());
                        }
                    } else {
                        C2.v.b().c(a9, M7);
                    }
                    this.f14441s.n1(this.f14446x);
                    C2.v.b().e(a9);
                    this.f14441s.D0("onSdkLoaded", new C6397a());
                }
            }
        }
    }

    @Override // F2.z
    public final void w0() {
    }
}
