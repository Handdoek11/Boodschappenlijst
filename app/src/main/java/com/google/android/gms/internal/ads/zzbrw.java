package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* loaded from: classes.dex */
public final class zzbrw implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Activity f28756a;

    /* renamed from: b, reason: collision with root package name */
    private J2.l f28757b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f28758c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        H2.p.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        H2.p.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        H2.p.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, J2.l lVar, Bundle bundle, J2.e eVar, Bundle bundle2) {
        this.f28757b = lVar;
        if (lVar == null) {
            H2.p.g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            H2.p.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f28757b.c(this, 0);
            return;
        }
        if (!C1517Lf.g(context)) {
            H2.p.g("Default browser does not support custom tabs. Bailing out.");
            this.f28757b.c(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            H2.p.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f28757b.c(this, 0);
        } else {
            this.f28756a = (Activity) context;
            this.f28758c = Uri.parse(string);
            this.f28757b.o(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        androidx.browser.customtabs.d a8 = new d.C0141d().a();
        a8.f7999a.setData(this.f28758c);
        G2.D0.f2566l.post(new RunnableC1772Sm(this, new AdOverlayInfoParcel(new F2.l(a8.f7999a, null), null, new C1737Rm(this), null, new H2.a(0, 0, false), null, null, "")));
        C2.v.s().r();
    }
}
