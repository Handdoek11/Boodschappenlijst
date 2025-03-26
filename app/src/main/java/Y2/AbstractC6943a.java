package y2;

import D2.A;
import H2.c;
import Z2.r;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3077jg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1117Ac;
import com.google.android.gms.internal.ads.C1773Sn;
import w2.AbstractC6879e;
import w2.C6881g;
import w2.u;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6943a {

    /* renamed from: y2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0349a extends AbstractC6879e {
    }

    public static void b(final Context context, final String str, final C6881g c6881g, final int i8, final AbstractC0349a abstractC0349a) {
        r.m(context, "Context cannot be null.");
        r.m(str, "adUnitId cannot be null.");
        r.m(c6881g, "AdRequest cannot be null.");
        r.e("#008 Must be called on the main UI thread.");
        AbstractC3184kf.a(context);
        if (((Boolean) AbstractC3077jg.f23298d.e()).booleanValue()) {
            if (((Boolean) A.c().a(AbstractC3184kf.bb)).booleanValue()) {
                c.f2922b.execute(new Runnable() { // from class: y2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i9 = i8;
                        String str2 = str;
                        C6881g c6881g2 = c6881g;
                        try {
                            new C1117Ac(context2, str2, c6881g2.a(), i9, abstractC0349a).a();
                        } catch (IllegalStateException e8) {
                            C1773Sn.c(context2).a(e8, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C1117Ac(context, str, c6881g.a(), i8, abstractC0349a).a();
    }

    public abstract u a();

    public abstract void c(Activity activity);
}
