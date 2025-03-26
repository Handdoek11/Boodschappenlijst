package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.py, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3767py extends AbstractC1506Kz {

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC4410vt f25673j;

    /* renamed from: k, reason: collision with root package name */
    private final int f25674k;

    /* renamed from: l, reason: collision with root package name */
    private final Context f25675l;

    /* renamed from: m, reason: collision with root package name */
    private final C2353cy f25676m;

    /* renamed from: n, reason: collision with root package name */
    private final CH f25677n;

    /* renamed from: o, reason: collision with root package name */
    private final UF f25678o;

    /* renamed from: p, reason: collision with root package name */
    private final C4558xC f25679p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f25680q;

    /* renamed from: r, reason: collision with root package name */
    private final C1283Eq f25681r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f25682s;

    C3767py(C1471Jz c1471Jz, Context context, InterfaceC4410vt interfaceC4410vt, int i8, C2353cy c2353cy, CH ch, UF uf, C4558xC c4558xC, C1283Eq c1283Eq) {
        super(c1471Jz);
        this.f25682s = false;
        this.f25673j = interfaceC4410vt;
        this.f25675l = context;
        this.f25674k = i8;
        this.f25676m = c2353cy;
        this.f25677n = ch;
        this.f25678o = uf;
        this.f25679p = c4558xC;
        this.f25680q = ((Boolean) D2.A.c().a(AbstractC3184kf.f23988q5)).booleanValue();
        this.f25681r = c1283Eq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1506Kz
    public final void a() {
        super.a();
        InterfaceC4410vt interfaceC4410vt = this.f25673j;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.destroy();
        }
    }

    public final int i() {
        return this.f25674k;
    }

    public final void j(InterfaceC3178kc interfaceC3178kc) {
        InterfaceC4410vt interfaceC4410vt = this.f25673j;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.B0(interfaceC3178kc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    public final void k(Activity activity, InterfaceC4812zc interfaceC4812zc, boolean z7) {
        InterfaceC4410vt interfaceC4410vt;
        C3785q60 P7;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f25675l;
        }
        if (this.f25680q) {
            this.f25678o.zzb();
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23727M0)).booleanValue()) {
            C2.v.t();
            if (G2.D0.h(activity2)) {
                H2.p.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f25679p.zzb();
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23735N0)).booleanValue()) {
                    new C1190Cc0(activity2.getApplicationContext(), C2.v.x().b()).a(this.f16709a.f14101b.f13520b.f26832b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Mb)).booleanValue() && (interfaceC4410vt = this.f25673j) != null && (P7 = interfaceC4410vt.P()) != null && P7.f25813r0 && P7.f25815s0 != this.f25681r.a()) {
            H2.p.g("The app open consent form has been shown.");
            this.f25679p.o(AbstractC3351m70.d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.f25682s) {
            H2.p.g("App open interstitial ad is already visible.");
            this.f25679p.o(AbstractC3351m70.d(10, null, null));
        }
        if (this.f25682s) {
            return;
        }
        try {
            this.f25677n.a(z7, activity2, this.f25679p);
            if (this.f25680q) {
                this.f25678o.zza();
            }
            this.f25682s = true;
        } catch (zzdgb e8) {
            this.f25679p.T(e8);
        }
    }

    public final void l(long j8, int i8) {
        this.f25676m.a(j8, i8);
    }
}
