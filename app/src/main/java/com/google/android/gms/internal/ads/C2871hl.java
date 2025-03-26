package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2871hl implements InterfaceC2649fj {

    /* renamed from: a, reason: collision with root package name */
    private final C1491Kk f22603a;

    /* renamed from: b, reason: collision with root package name */
    private final C1811Tq f22604b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2979il f22605c;

    public C2871hl(C2979il c2979il, C1491Kk c1491Kk, C1811Tq c1811Tq) {
        this.f22605c = c2979il;
        this.f22603a = c1491Kk;
        this.f22604b = c1811Tq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2649fj
    public final void a(JSONObject jSONObject) {
        try {
            try {
                this.f22604b.c(this.f22605c.f23055a.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e8) {
                this.f22604b.d(e8);
            }
        } finally {
            this.f22603a.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2649fj
    public final void n(String str) {
        try {
            if (str == null) {
                this.f22604b.d(new zzbnv());
            } else {
                this.f22604b.d(new zzbnv(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.f22603a.h();
            throw th;
        }
        this.f22603a.h();
    }
}
