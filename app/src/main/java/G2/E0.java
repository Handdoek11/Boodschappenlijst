package G2;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.AbstractC1358Gt;
import com.google.android.gms.internal.ads.C2000Zc;
import com.google.android.gms.internal.ads.C2780gu;
import com.google.android.gms.internal.ads.InterfaceC4410vt;
import com.google.android.gms.internal.ads.US;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class E0 extends AbstractC0579b {
    public E0() {
        super(null);
    }

    @Override // G2.AbstractC0579b
    public final CookieManager a(Context context) {
        C2.v.t();
        if (D0.g()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            H2.p.e("Failed to obtain CookieManager.", th);
            C2.v.s().w(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // G2.AbstractC0579b
    public final WebResourceResponse b(String str, String str2, int i8, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i8, str3, map, inputStream);
    }

    @Override // G2.AbstractC0579b
    public final AbstractC1358Gt c(InterfaceC4410vt interfaceC4410vt, C2000Zc c2000Zc, boolean z7, US us) {
        return new C2780gu(interfaceC4410vt, c2000Zc, z7, us);
    }
}
