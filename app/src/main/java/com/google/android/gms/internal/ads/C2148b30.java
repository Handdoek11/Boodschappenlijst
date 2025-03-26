package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.b30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2148b30 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f20805a;

    public C2148b30(JSONObject jSONObject) {
        this.f20805a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f20805a);
        } catch (JSONException unused) {
            AbstractC0608p0.k("Unable to get cache_state");
        }
    }
}
