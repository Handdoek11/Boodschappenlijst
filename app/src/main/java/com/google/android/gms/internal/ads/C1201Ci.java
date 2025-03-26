package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1201Ci implements InterfaceC1662Pi {
    C1201Ci() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        try {
            String str = (String) map.get("enabled");
            if (!AbstractC4710yf0.c("true", str) && !AbstractC4710yf0.c("false", str)) {
                return;
            }
            C2531ee0.a(interfaceC4410vt.getContext()).b(Boolean.parseBoolean(str));
        } catch (IOException e8) {
            C2.v.s().x(e8, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
