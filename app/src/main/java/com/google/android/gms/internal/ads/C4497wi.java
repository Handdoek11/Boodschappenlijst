package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4497wi implements InterfaceC1662Pi {
    C4497wi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            AbstractC0608p0.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        AbstractC2208bf0 l8 = AbstractC2316cf0.l();
        l8.b((String) map.get("appId"));
        l8.h(interfaceC4410vt.getWidth());
        l8.g(interfaceC4410vt.M().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            l8.d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            l8.d(81);
        }
        if (map.containsKey("verticalMargin")) {
            l8.e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            l8.e(0.02f);
        }
        if (map.containsKey("enifd")) {
            l8.a((String) map.get("enifd"));
        }
        try {
            C2.v.n().j(interfaceC4410vt, l8.i());
        } catch (NullPointerException e8) {
            C2.v.s().x(e8, "DefaultGmsgHandlers.ShowLMDOverlay");
            AbstractC0608p0.k("Missing parameters for LMD Overlay show request");
        }
    }
}
