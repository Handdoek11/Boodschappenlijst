package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import w2.C6876b;

/* renamed from: com.google.android.gms.internal.ads.fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2655fm implements J2.i, J2.l, J2.n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1457Jl f22110a;

    /* renamed from: b, reason: collision with root package name */
    private J2.r f22111b;

    /* renamed from: c, reason: collision with root package name */
    private C3950rh f22112c;

    public C2655fm(InterfaceC1457Jl interfaceC1457Jl) {
        this.f22110a = interfaceC1457Jl;
    }

    @Override // J2.i
    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdClosed.");
        try {
            this.f22110a.c();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.n
    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdOpened.");
        try {
            this.f22110a.p();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.l
    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter, int i8) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdFailedToLoad with error " + i8 + ".");
        try {
            this.f22110a.z(i8);
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.n
    public final void d(MediationNativeAdapter mediationNativeAdapter, C3950rh c3950rh) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(c3950rh.b())));
        this.f22112c = c3950rh;
        try {
            this.f22110a.o();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.i
    public final void e(MediationBannerAdapter mediationBannerAdapter, C6876b c6876b) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6876b.a() + ". ErrorMessage: " + c6876b.c() + ". ErrorDomain: " + c6876b.b());
        try {
            this.f22110a.i6(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.n
    public final void f(MediationNativeAdapter mediationNativeAdapter, C6876b c6876b) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6876b.a() + ". ErrorMessage: " + c6876b.c() + ". ErrorDomain: " + c6876b.b());
        try {
            this.f22110a.i6(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.i
    public final void g(MediationBannerAdapter mediationBannerAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdClicked.");
        try {
            this.f22110a.b();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.i
    public final void h(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAppEvent.");
        try {
            this.f22110a.v5(str, str2);
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.n
    public final void i(MediationNativeAdapter mediationNativeAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdClosed.");
        try {
            this.f22110a.c();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.i
    public final void j(MediationBannerAdapter mediationBannerAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdLoaded.");
        try {
            this.f22110a.o();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.n
    public final void k(MediationNativeAdapter mediationNativeAdapter, C3950rh c3950rh, String str) {
        try {
            this.f22110a.K5(c3950rh.a(), str);
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.n
    public final void l(MediationNativeAdapter mediationNativeAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        J2.r rVar = this.f22111b;
        if (this.f22112c == null) {
            if (rVar == null) {
                H2.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!rVar.l()) {
                H2.p.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        H2.p.b("Adapter called onAdClicked.");
        try {
            this.f22110a.b();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.l
    public final void m(MediationInterstitialAdapter mediationInterstitialAdapter, C6876b c6876b) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6876b.a() + ". ErrorMessage: " + c6876b.c() + ". ErrorDomain: " + c6876b.b());
        try {
            this.f22110a.i6(c6876b.d());
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.n
    public final void n(MediationNativeAdapter mediationNativeAdapter, J2.r rVar) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdLoaded.");
        this.f22111b = rVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            w2.w wVar = new w2.w();
            wVar.c(new BinderC1806Tl());
            if (rVar != null && rVar.r()) {
                rVar.K(wVar);
            }
        }
        try {
            this.f22110a.o();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.l
    public final void o(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdLoaded.");
        try {
            this.f22110a.o();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.i
    public final void p(MediationBannerAdapter mediationBannerAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdOpened.");
        try {
            this.f22110a.p();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.l
    public final void q(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdClosed.");
        try {
            this.f22110a.c();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.n
    public final void r(MediationNativeAdapter mediationNativeAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        J2.r rVar = this.f22111b;
        if (this.f22112c == null) {
            if (rVar == null) {
                H2.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!rVar.m()) {
                H2.p.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        H2.p.b("Adapter called onAdImpression.");
        try {
            this.f22110a.k();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // J2.l
    public final void s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        H2.p.b("Adapter called onAdOpened.");
        try {
            this.f22110a.p();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final J2.r t() {
        return this.f22111b;
    }

    public final C3950rh u() {
        return this.f22112c;
    }
}
