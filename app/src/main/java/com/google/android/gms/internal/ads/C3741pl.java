package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3741pl implements InterfaceC2649fj {

    /* renamed from: a, reason: collision with root package name */
    private final C1811Tq f25504a;

    public C3741pl(C3850ql c3850ql, C1811Tq c1811Tq) {
        this.f25504a = c1811Tq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2649fj
    public final void a(JSONObject jSONObject) {
        try {
            this.f25504a.c(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e8) {
            this.f25504a.d(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2649fj
    public final void n(String str) {
        try {
            if (str == null) {
                this.f25504a.d(new zzbnv());
            } else {
                this.f25504a.d(new zzbnv(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
