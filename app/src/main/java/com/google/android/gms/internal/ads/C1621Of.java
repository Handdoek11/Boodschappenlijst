package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1621Of extends O2.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f17906a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1656Pf f17907b;

    C1621Of(C1656Pf c1656Pf, String str) {
        this.f17906a = str;
        this.f17907b = c1656Pf;
    }

    @Override // O2.b
    public final void a(String str) {
        H2.p.g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            C1656Pf c1656Pf = this.f17907b;
            c1656Pf.f18243g.g(c1656Pf.c(this.f17906a, str).toString(), null);
        } catch (JSONException e8) {
            H2.p.e("Error creating PACT Error Response JSON: ", e8);
        }
    }

    @Override // O2.b
    public final void b(O2.a aVar) {
        String b8 = aVar.b();
        try {
            C1656Pf c1656Pf = this.f17907b;
            c1656Pf.f18243g.g(c1656Pf.d(this.f17906a, b8).toString(), null);
        } catch (JSONException e8) {
            H2.p.e("Error creating PACT Signal Response JSON: ", e8);
        }
    }
}
