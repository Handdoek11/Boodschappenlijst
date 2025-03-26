package J2;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
import w2.C6876b;
import w2.v;

/* loaded from: classes.dex */
public abstract class a {
    public abstract v getSDKVersionInfo();

    public abstract v getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<j> list);

    public void loadAppOpenAd(g gVar, d dVar) {
        dVar.a(new C6876b(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(h hVar, d dVar) {
        dVar.a(new C6876b(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    @Deprecated
    public void loadInterscrollerAd(h hVar, d dVar) {
        dVar.a(new C6876b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(k kVar, d dVar) {
        dVar.a(new C6876b(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    @Deprecated
    public void loadNativeAd(m mVar, d dVar) {
        dVar.a(new C6876b(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAdMapper(m mVar, d dVar) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(o oVar, d dVar) {
        dVar.a(new C6876b(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(o oVar, d dVar) {
        dVar.a(new C6876b(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
