package I2;

import D2.A;
import Z2.r;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3077jg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import com.google.android.gms.internal.ads.C2760gk;
import w2.C6881g;
import w2.l;
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
        if (((Boolean) AbstractC3077jg.f23303i.e()).booleanValue()) {
            if (((Boolean) A.c().a(AbstractC3184kf.bb)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: I2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        C6881g c6881g2 = c6881g;
                        try {
                            new C2760gk(context2, str2).f(c6881g2.a(), bVar);
                        } catch (IllegalStateException e8) {
                            C1773Sn.c(context2).a(e8, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C2760gk(context, str).f(c6881g.a(), bVar);
    }

    public abstract u a();

    public abstract void c(l lVar);

    public abstract void d(boolean z7);

    public abstract void e(Activity activity);
}
