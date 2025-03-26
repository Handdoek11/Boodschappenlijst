package com.google.android.gms.ads;

import D2.C0555y;
import H2.p;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC4830zl;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            C0555y.a().j(this, new BinderC4830zl()).K0(intent);
        } catch (RemoteException e8) {
            p.d("RemoteException calling handleNotificationIntent: ".concat(e8.toString()));
        }
    }
}
