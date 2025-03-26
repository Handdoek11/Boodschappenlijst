package P2;

import D2.A;
import H2.p;
import Z2.r;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3077jg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import com.google.android.gms.internal.ads.C3422mp;
import w2.C6881g;
import w2.u;

/* loaded from: classes.dex */
public abstract class c {
    public static void b(final Context context, final String str, final C6881g c6881g, final d dVar) {
        r.m(context, "Context cannot be null.");
        r.m(str, "AdUnitId cannot be null.");
        r.m(c6881g, "AdRequest cannot be null.");
        r.m(dVar, "LoadCallback cannot be null.");
        r.e("#008 Must be called on the main UI thread.");
        AbstractC3184kf.a(context);
        if (((Boolean) AbstractC3077jg.f23305k.e()).booleanValue()) {
            if (((Boolean) A.c().a(AbstractC3184kf.bb)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: P2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C6881g c6881g2 = c6881g;
                        try {
                            new C3422mp(context2, str2).d(c6881g2.a(), dVar);
                        } catch (IllegalStateException e8) {
                            C1773Sn.c(context2).a(e8, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        p.b("Loading on UI thread");
        new C3422mp(context, str).d(c6881g.a(), dVar);
    }

    public abstract u a();

    public abstract void c(Activity activity, w2.p pVar);
}
