package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.AbstractBinderC5137k;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;

/* loaded from: classes.dex */
final class D implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E f12282a;

    /* synthetic */ D(E e8, E1.t tVar) {
        this.f12282a = e8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC5103e1.i("BillingClientTesting", "Billing Override Service connected.");
        this.f12282a.f12285I = AbstractBinderC5137k.D0(iBinder);
        this.f12282a.f12284H = 2;
        this.f12282a.g1(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC5103e1.j("BillingClientTesting", "Billing Override Service disconnected.");
        this.f12282a.f12285I = null;
        this.f12282a.f12284H = 0;
    }
}
