package com.android.billingclient.api;

import E1.InterfaceC0564d;
import android.os.Bundle;
import com.android.billingclient.api.C1057e;
import com.google.android.gms.internal.play_billing.AbstractBinderC5083b;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import org.json.JSONException;

/* renamed from: com.android.billingclient.api.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC1071t extends AbstractBinderC5083b {

    /* renamed from: o, reason: collision with root package name */
    final InterfaceC0564d f12477o;

    /* renamed from: s, reason: collision with root package name */
    final G f12478s;

    /* renamed from: t, reason: collision with root package name */
    final int f12479t;

    /* synthetic */ BinderC1071t(InterfaceC0564d interfaceC0564d, G g8, int i8, E1.p pVar) {
        this.f12477o = interfaceC0564d;
        this.f12478s = g8;
        this.f12479t = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5089c
    public final void R(Bundle bundle) {
        if (bundle == null) {
            G g8 = this.f12478s;
            C1057e c1057e = H.f12306k;
            g8.e(F.b(63, 13, c1057e), this.f12479t);
            this.f12477o.a(c1057e, null);
            return;
        }
        int b8 = AbstractC5103e1.b(bundle, "BillingClient");
        String f8 = AbstractC5103e1.f(bundle, "BillingClient");
        C1057e.a c8 = C1057e.c();
        c8.c(b8);
        c8.b(f8);
        if (b8 != 0) {
            AbstractC5103e1.j("BillingClient", "getBillingConfig() failed. Response code: " + b8);
            C1057e a8 = c8.a();
            this.f12478s.e(F.b(23, 13, a8), this.f12479t);
            this.f12477o.a(a8, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            AbstractC5103e1.j("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            c8.c(6);
            C1057e a9 = c8.a();
            this.f12478s.e(F.b(64, 13, a9), this.f12479t);
            this.f12477o.a(a9, null);
            return;
        }
        try {
            this.f12477o.a(c8.a(), new C1055c(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e8) {
            AbstractC5103e1.k("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e8);
            G g9 = this.f12478s;
            C1057e c1057e2 = H.f12306k;
            g9.e(F.b(65, 13, c1057e2), this.f12479t);
            this.f12477o.a(c1057e2, null);
        }
    }
}
