package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.j30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3016j30 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23166a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23167b;

    public C3016j30(String str, String str2) {
        this.f23166a = str;
        this.f23167b = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            JSONObject g8 = G2.U.g((JSONObject) obj, "pii");
            g8.put("doritos", this.f23166a);
            g8.put("doritos_v2", this.f23167b);
        } catch (JSONException unused) {
            AbstractC0608p0.k("Failed putting doritos string.");
        }
    }
}
