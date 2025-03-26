package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import d.C5694a;
import d.g;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* renamed from: o, reason: collision with root package name */
    private d.c f12341o;

    /* renamed from: s, reason: collision with root package name */
    private d.c f12342s;

    /* renamed from: t, reason: collision with root package name */
    private ResultReceiver f12343t;

    /* renamed from: u, reason: collision with root package name */
    private ResultReceiver f12344u;

    final void i0(C5694a c5694a) {
        Intent a8 = c5694a.a();
        int b8 = AbstractC5103e1.e(a8, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f12343t;
        if (resultReceiver != null) {
            resultReceiver.send(b8, a8 == null ? null : a8.getExtras());
        }
        if (c5694a.b() != -1 || b8 != 0) {
            AbstractC5103e1.j("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + c5694a.b() + " and billing's responseCode: " + b8);
        }
        finish();
    }

    final void j0(C5694a c5694a) {
        Intent a8 = c5694a.a();
        int b8 = AbstractC5103e1.e(a8, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f12344u;
        if (resultReceiver != null) {
            resultReceiver.send(b8, a8 == null ? null : a8.getExtras());
        }
        if (c5694a.b() != -1 || b8 != 0) {
            AbstractC5103e1.j("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(c5694a.b()), Integer.valueOf(b8)));
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12341o = registerForActivityResult(new e.d(), new d.b() { // from class: com.android.billingclient.api.K
            @Override // d.b
            public final void a(Object obj) {
                this.f12326a.i0((C5694a) obj);
            }
        });
        this.f12342s = registerForActivityResult(new e.d(), new d.b() { // from class: com.android.billingclient.api.L
            @Override // d.b
            public final void a(Object obj) {
                this.f12327a.j0((C5694a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f12343t = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f12344u = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        AbstractC5103e1.i("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f12343t = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f12341o.a(new g.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f12344u = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f12342s.a(new g.a(pendingIntent2).a());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f12343t;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f12344u;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
