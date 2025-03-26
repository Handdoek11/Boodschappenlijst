package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class X20 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    final String f19951a;

    /* renamed from: b, reason: collision with root package name */
    final int f19952b;

    public X20(String str, int i8) {
        this.f19951a = str;
        this.f19952b = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.f19951a) || this.f19952b == -1) {
            return;
        }
        try {
            JSONObject g8 = G2.U.g(jSONObject, "pii");
            g8.put("pvid", this.f19951a);
            g8.put("pvid_s", this.f19952b);
        } catch (JSONException e8) {
            AbstractC0608p0.l("Failed putting gms core app set ID info.", e8);
        }
    }
}
