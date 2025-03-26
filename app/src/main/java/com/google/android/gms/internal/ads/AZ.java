package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AZ implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f13589a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f13590b;

    public AZ(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f13589a = jSONObject;
        this.f13590b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = this.f13590b;
        KB kb = (KB) obj;
        if (jSONObject != null) {
            kb.f16552b.putString("fwd_common_cld", jSONObject.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        JSONObject jSONObject = this.f13589a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f13590b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
