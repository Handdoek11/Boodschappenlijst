package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1523Li implements InterfaceC1662Pi {
    C1523Li() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            interfaceC4410vt.T0();
        } else if ("resume".equals(str)) {
            interfaceC4410vt.t0();
        }
    }
}
