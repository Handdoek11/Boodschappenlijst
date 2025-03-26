package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2671fu extends AbstractC1358Gt {
    public AbstractC2671fu(InterfaceC4410vt interfaceC4410vt, C2000Zc c2000Zc, boolean z7, US us) {
        super(interfaceC4410vt, c2000Zc, z7, new C2440dn(interfaceC4410vt, interfaceC4410vt.q0(), new C1759Se(interfaceC4410vt.getContext())), null, us);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse j1(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof InterfaceC4410vt)) {
            H2.p.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) webView;
        InterfaceC1426Ip interfaceC1426Ip = this.f15478P;
        if (interfaceC1426Ip != null) {
            interfaceC1426Ip.a(str, map, 1);
        }
        AbstractC1192Cd0.a();
        AbstractC1444Jd0 abstractC1444Jd0 = AbstractC1444Jd0.f16281a;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.b0(str, map);
        }
        if (interfaceC4410vt.L() != null) {
            interfaceC4410vt.L().S();
        }
        if (interfaceC4410vt.H().i()) {
            str2 = (String) D2.A.c().a(AbstractC3184kf.f23839a0);
        } else if (interfaceC4410vt.n0()) {
            str2 = (String) D2.A.c().a(AbstractC3184kf.f23830Z);
        } else {
            str2 = (String) D2.A.c().a(AbstractC3184kf.f23822Y);
        }
        C2.v.t();
        return G2.D0.d0(interfaceC4410vt.getContext(), interfaceC4410vt.l().f2914o, str2);
    }
}
