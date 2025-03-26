package Q2;

import D2.A;
import Z2.r;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3077jg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import com.google.android.gms.internal.ads.C4620xp;
import w2.C6881g;
import w2.p;
import w2.u;

/* loaded from: classes.dex */
public abstract class a {
    public static void b(final Context context, final String str, final C6881g c6881g, final b bVar) {
        r.m(context, "Context cannot be null.");
        r.m(str, "AdUnitId cannot be null.");
        r.m(c6881g, "AdRequest cannot be null.");
        r.m(bVar, "LoadCallback cannot be null.");
        r.e("#008 Must be called on the main UI thread.");
        AbstractC3184kf.a(context);
        if (((Boolean) AbstractC3077jg.f23305k.e()).booleanValue()) {
            if (((Boolean) A.c().a(AbstractC3184kf.bb)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: Q2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C6881g c6881g2 = c6881g;
                        try {
                            new C4620xp(context2, str2).d(c6881g2.a(), bVar);
                        } catch (IllegalStateException e8) {
                            C1773Sn.c(context2).a(e8, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C4620xp(context, str).d(c6881g.a(), bVar);
    }

    public abstract u a();

    public abstract void c(Activity activity, p pVar);
}
