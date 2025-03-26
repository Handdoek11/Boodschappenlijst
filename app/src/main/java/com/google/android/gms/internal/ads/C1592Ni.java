package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ni, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1592Ni implements InterfaceC1662Pi {
    C1592Ni() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        if (map.keySet().contains("start")) {
            interfaceC4410vt.h1(true);
        }
        if (map.keySet().contains("stop")) {
            interfaceC4410vt.h1(false);
        }
    }
}
