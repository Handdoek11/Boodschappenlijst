package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.n30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3452n30 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final List f24869a;

    public C3452n30(List list) {
        this.f24869a = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f24869a));
        } catch (JSONException unused) {
            AbstractC0608p0.k("Failed putting experiment ids.");
        }
    }
}
