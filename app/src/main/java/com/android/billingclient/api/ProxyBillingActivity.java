package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: o, reason: collision with root package name */
    private ResultReceiver f12336o;

    /* renamed from: s, reason: collision with root package name */
    private ResultReceiver f12337s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12338t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f12339u;

    /* renamed from: v, reason: collision with root package name */
    private int f12340v;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC5103e1.i("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f12338t = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f12336o = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f12337s = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f12339u = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f12340v = bundle.getInt("activity_code", 100);
            return;
        }
        AbstractC5103e1.i("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f12340v = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f12339u = true;
                this.f12340v = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f12336o = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f12337s = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f12340v = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f12338t = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f12340v, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e8) {
            AbstractC5103e1.k("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e8);
            ResultReceiver resultReceiver = this.f12336o;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f12337s;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent b8 = b();
                    if (this.f12339u) {
                        b8.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    b8.putExtra("RESPONSE_CODE", 6);
                    b8.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(b8);
                }
            }
            this.f12338t = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f12338t) {
            Intent b8 = b();
            b8.putExtra("RESPONSE_CODE", 1);
            b8.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i8 = this.f12340v;
            if (i8 == 110 || i8 == 100) {
                b8.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(b8);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f12336o;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f12337s;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f12338t);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f12339u);
        bundle.putInt("activity_code", this.f12340v);
    }
}
