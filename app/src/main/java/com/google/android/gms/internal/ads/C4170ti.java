package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ti, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4170ti implements InterfaceC1662Pi {
    C4170ti() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject zza;
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        InterfaceC1519Lg R7 = interfaceC4410vt.R();
        if (R7 == null || (zza = R7.zza()) == null) {
            interfaceC4410vt.p("nativeAdViewSignalsReady", new JSONObject());
        } else {
            interfaceC4410vt.p("nativeAdViewSignalsReady", zza);
        }
    }
}
