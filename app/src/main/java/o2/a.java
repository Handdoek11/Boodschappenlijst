package O2;

import D2.A;
import D2.C0501f1;
import D2.C0539s1;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3077jg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1529Ln;
import w2.C6881g;
import w2.EnumC6877c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final C0539s1 f4259a;

    public a(C0539s1 c0539s1) {
        this.f4259a = c0539s1;
    }

    public static void a(Context context, EnumC6877c enumC6877c, C6881g c6881g, b bVar) {
        c(context, enumC6877c, c6881g, null, bVar);
    }

    private static void c(final Context context, final EnumC6877c enumC6877c, final C6881g c6881g, final String str, final b bVar) {
        AbstractC3184kf.a(context);
        if (((Boolean) AbstractC3077jg.f23304j.e()).booleanValue()) {
            if (((Boolean) A.c().a(AbstractC3184kf.bb)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: O2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6881g c6881g2 = c6881g;
                        C0501f1 a8 = c6881g2 == null ? null : c6881g2.a();
                        new C1529Ln(context, enumC6877c, a8, str).b(bVar);
                    }
                });
                return;
            }
        }
        new C1529Ln(context, enumC6877c, c6881g == null ? null : c6881g.a(), str).b(bVar);
    }

    public String b() {
        return this.f4259a.a();
    }
}
