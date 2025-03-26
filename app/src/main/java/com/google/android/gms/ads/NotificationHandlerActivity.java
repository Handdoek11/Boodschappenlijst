package com.google.android.gms.ads;

import D2.C0555y;
import H2.p;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC4830zl;
import com.google.android.gms.internal.ads.InterfaceC3418mn;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            InterfaceC3418mn j8 = C0555y.a().j(this, new BinderC4830zl());
            if (j8 == null) {
                p.d("OfflineUtils is null");
            } else {
                j8.K0(getIntent());
            }
        } catch (RemoteException e8) {
            p.d("RemoteException calling handleNotificationIntent: ".concat(e8.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
