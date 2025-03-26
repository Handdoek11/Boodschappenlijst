package G2;

import D2.C0555y;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC1192Cd0;
import com.google.android.gms.internal.ads.AbstractC1228Dd0;
import com.google.android.gms.internal.ads.AbstractC2480e7;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1419Ij;
import com.google.android.gms.internal.ads.C2589f7;
import com.google.android.gms.internal.ads.C3350m7;
import com.google.android.gms.internal.ads.C3894r7;
import com.google.android.gms.internal.ads.R6;
import com.google.android.gms.internal.ads.U6;
import com.google.android.gms.internal.ads.V6;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class A extends C2589f7 {

    /* renamed from: c, reason: collision with root package name */
    private final Context f2560c;

    private A(Context context, AbstractC2480e7 abstractC2480e7) {
        super(abstractC2480e7);
        this.f2560c = context;
    }

    public static V6 b(Context context) {
        V6 v62 = new V6(new C3350m7(new File(AbstractC1228Dd0.a(AbstractC1192Cd0.a(), context.getCacheDir(), "admob_volley")), 20971520), new A(context, new C3894r7(null, null)), 4);
        v62.d();
        return v62;
    }

    @Override // com.google.android.gms.internal.ads.C2589f7, com.google.android.gms.internal.ads.P6
    public final R6 a(U6 u62) {
        if (u62.zza() == 0) {
            if (Pattern.matches((String) D2.A.c().a(AbstractC3184kf.f24046x4), u62.p())) {
                Context context = this.f2560c;
                C0555y.b();
                if (H2.g.w(context, 13400000)) {
                    R6 a8 = new C1419Ij(this.f2560c).a(u62);
                    if (a8 != null) {
                        AbstractC0608p0.k("Got gmscore asset response: ".concat(String.valueOf(u62.p())));
                        return a8;
                    }
                    AbstractC0608p0.k("Failed to get gmscore asset response: ".concat(String.valueOf(u62.p())));
                }
            }
        }
        return super.a(u62);
    }
}
