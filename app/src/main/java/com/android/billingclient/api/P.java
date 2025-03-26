package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import com.google.android.gms.internal.play_billing.AbstractC5114g0;
import com.google.android.gms.internal.play_billing.B2;
import com.google.android.gms.internal.play_billing.L3;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
final class P extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12333a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12334b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q f12335c;

    P(Q q8, boolean z7) {
        this.f12335c = q8;
        this.f12334b = z7;
    }

    private final void c(Bundle bundle, C1057e c1057e, int i8) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f12335c.f12353c.d(L3.B(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), B2.a()));
            } else {
                this.f12335c.f12353c.d(F.b(23, i8, c1057e));
            }
        } catch (Throwable unused) {
            AbstractC5103e1.j("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f12333a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f12334b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f12333a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        try {
            if (this.f12333a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f12334b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
            }
            this.f12333a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            AbstractC5103e1.j("BillingBroadcastManager", "Bundle is null.");
            G g8 = this.f12335c.f12353c;
            C1057e c1057e = H.f12306k;
            g8.d(F.b(11, 1, c1057e));
            Q q8 = this.f12335c;
            if (q8.f12352b != null) {
                q8.f12352b.a(c1057e, null);
                return;
            }
            return;
        }
        C1057e e8 = AbstractC5103e1.e(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i8 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List h8 = AbstractC5103e1.h(extras);
            if (e8.b() == 0) {
                this.f12335c.f12353c.g(F.d(i8));
            } else {
                c(extras, e8, i8);
            }
            this.f12335c.f12352b.a(e8, h8);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (e8.b() != 0) {
                c(extras, e8, i8);
                this.f12335c.f12352b.a(e8, AbstractC5114g0.s());
                return;
            }
            Q q9 = this.f12335c;
            Q.a(q9);
            Q.e(q9);
            AbstractC5103e1.j("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            G g9 = this.f12335c.f12353c;
            C1057e c1057e2 = H.f12306k;
            g9.d(F.b(77, i8, c1057e2));
            this.f12335c.f12352b.a(c1057e2, AbstractC5114g0.s());
        }
    }
}
