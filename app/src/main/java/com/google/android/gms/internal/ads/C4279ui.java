package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ui, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4279ui implements InterfaceC1662Pi {
    C4279ui() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject zzb;
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        InterfaceC1519Lg R7 = interfaceC4410vt.R();
        if (R7 == null || (zzb = R7.zzb()) == null) {
            interfaceC4410vt.p("nativeClickMetaReady", new JSONObject());
        } else {
            interfaceC4410vt.p("nativeClickMetaReady", zzb);
        }
    }
}
