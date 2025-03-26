package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1557Mi implements InterfaceC1662Pi {
    C1557Mi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        if (map.keySet().contains("start")) {
            interfaceC4410vt.L().k();
        } else if (map.keySet().contains("stop")) {
            interfaceC4410vt.L().l();
        } else if (map.keySet().contains("cancel")) {
            interfaceC4410vt.L().j();
        }
    }
}
