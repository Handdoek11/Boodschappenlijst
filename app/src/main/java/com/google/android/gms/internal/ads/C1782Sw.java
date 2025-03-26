package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Sw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1782Sw implements InterfaceC1325Fw {
    C1782Sw() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1325Fw
    public final void a(Map map) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.na)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C2.v.s().j().m0(Boolean.parseBoolean(str));
    }
}
