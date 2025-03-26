package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.f30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2582f30 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f21923a;

    C2582f30(Context context) {
        this.f21923a = C4182to.c(context, H2.a.A0());
    }

    final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f21923a);
        } catch (JSONException unused) {
            AbstractC0608p0.k("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return ((Boolean) D2.A.c().a(AbstractC3184kf.Pb)).booleanValue() ? AbstractC2326ck0.h(new InterfaceC2907i20() { // from class: com.google.android.gms.internal.ads.d30
            @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
            public final /* synthetic */ void a(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
            public final void c(Object obj) {
            }
        }) : AbstractC2326ck0.h(new InterfaceC2907i20() { // from class: com.google.android.gms.internal.ads.e30
            @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
            public final /* synthetic */ void a(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
            public final void c(Object obj) {
                this.f21722a.a((JSONObject) obj);
            }
        });
    }
}
