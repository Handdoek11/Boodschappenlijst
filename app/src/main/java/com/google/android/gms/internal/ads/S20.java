package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class S20 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18787a;

    public S20(String str) {
        this.f18787a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f18787a);
        } catch (JSONException e8) {
            AbstractC0608p0.l("Failed putting Ad ID.", e8);
        }
    }
}
