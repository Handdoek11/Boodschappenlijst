package com.google.ads.mediation;

import D2.C0555y;
import D2.Y0;
import H2.g;
import J2.l;
import J2.n;
import J2.p;
import J2.q;
import J2.s;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Iterator;
import java.util.Set;
import w2.C6880f;
import w2.C6881g;
import w2.C6882h;
import w2.i;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, q, s {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C6880f adLoader;
    protected i mAdView;
    protected I2.a mInterstitialAd;

    C6881g buildAdRequest(Context context, J2.e eVar, Bundle bundle, Bundle bundle2) {
        C6881g.a aVar = new C6881g.a();
        Set f8 = eVar.f();
        if (f8 != null) {
            Iterator it = f8.iterator();
            while (it.hasNext()) {
                aVar.a((String) it.next());
            }
        }
        if (eVar.e()) {
            C0555y.b();
            aVar.d(g.C(context));
        }
        if (eVar.b() != -1) {
            aVar.f(eVar.b() == 1);
        }
        aVar.e(eVar.d());
        aVar.b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.g();
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    I2.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // J2.s
    public Y0 getVideoController() {
        i iVar = this.mAdView;
        if (iVar != null) {
            return iVar.e().b();
        }
        return null;
    }

    C6880f.a newAdLoader(Context context, String str) {
        return new C6880f.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, J2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // J2.q
    public void onImmersiveModeUpdated(boolean z7) {
        I2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z7);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, J2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, J2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, J2.i iVar, Bundle bundle, C6882h c6882h, J2.e eVar, Bundle bundle2) {
        i iVar2 = new i(context);
        this.mAdView = iVar2;
        iVar2.setAdSize(new C6882h(c6882h.e(), c6882h.c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, iVar));
        this.mAdView.b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, l lVar, Bundle bundle, J2.e eVar, Bundle bundle2) {
        I2.a.b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new c(this, lVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, n nVar, Bundle bundle, p pVar, Bundle bundle2) {
        e eVar = new e(this, nVar);
        C6880f.a c8 = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).c(eVar);
        c8.g(pVar.g());
        c8.d(pVar.a());
        if (pVar.c()) {
            c8.f(eVar);
        }
        if (pVar.zzb()) {
            for (String str : pVar.zza().keySet()) {
                c8.e(str, eVar, true != ((Boolean) pVar.zza().get(str)).booleanValue() ? null : eVar);
            }
        }
        C6880f a8 = c8.a();
        this.adLoader = a8;
        a8.a(buildAdRequest(context, pVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        I2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.e(null);
        }
    }
}
