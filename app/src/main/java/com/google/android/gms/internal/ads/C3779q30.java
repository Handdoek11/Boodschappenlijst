package com.google.android.gms.internal.ads;

import D2.C0555y;
import G2.AbstractC0608p0;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.q30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3779q30 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f25707a;

    public C3779q30(Bundle bundle) {
        this.f25707a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f25707a != null) {
            try {
                G2.U.g(G2.U.g(jSONObject, "device"), "play_store").put("parental_controls", C0555y.b().m(this.f25707a));
            } catch (JSONException unused) {
                AbstractC0608p0.k("Failed putting parental controls bundle.");
            }
        }
    }
}
