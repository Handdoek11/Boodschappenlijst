package G2;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC3513ng;

/* renamed from: G2.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0608p0 extends H2.p {
    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : H2.p.f2955a.d(str)) {
                if (z7) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return H2.p.j(2) && ((Boolean) AbstractC3513ng.f25025a.e()).booleanValue();
    }
}
