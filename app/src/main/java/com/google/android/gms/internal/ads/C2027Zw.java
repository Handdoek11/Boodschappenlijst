package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Zw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2027Zw implements InterfaceC1361Gw {

    /* renamed from: a, reason: collision with root package name */
    private final C1600Np f20577a;

    C2027Zw(C1600Np c1600Np) {
        this.f20577a = c1600Np;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.Np] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.InterfaceC1361Gw
    public final void a(JSONObject jSONObject) {
        this.f20577a.b(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
