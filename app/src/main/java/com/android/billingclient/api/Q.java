package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12351a;

    /* renamed from: b, reason: collision with root package name */
    private final E1.j f12352b;

    /* renamed from: c, reason: collision with root package name */
    private final G f12353c;

    /* renamed from: d, reason: collision with root package name */
    private final P f12354d = new P(this, true);

    /* renamed from: e, reason: collision with root package name */
    private final P f12355e = new P(this, false);

    /* renamed from: f, reason: collision with root package name */
    private boolean f12356f;

    Q(Context context, E1.j jVar, E1.A a8, E1.o oVar, E1.l lVar, G g8) {
        this.f12351a = context;
        this.f12352b = jVar;
        this.f12353c = g8;
    }

    static /* bridge */ /* synthetic */ E1.o a(Q q8) {
        q8.getClass();
        return null;
    }

    static /* bridge */ /* synthetic */ E1.l e(Q q8) {
        q8.getClass();
        return null;
    }

    final E1.j d() {
        return this.f12352b;
    }

    final void f(boolean z7) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f12356f = z7;
        this.f12355e.a(this.f12351a, intentFilter2);
        if (this.f12356f) {
            this.f12354d.b(this.f12351a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f12354d.a(this.f12351a, intentFilter);
        }
    }
}
