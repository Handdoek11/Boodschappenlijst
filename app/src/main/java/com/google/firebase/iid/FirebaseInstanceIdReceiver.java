package com.google.firebase.iid;

import A3.AbstractC0379m;
import V2.a;
import V2.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C5488n;
import com.google.firebase.messaging.H;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // V2.b
    protected int b(Context context, a aVar) {
        try {
            return ((Integer) AbstractC0379m.a(new C5488n(context).k(aVar.A0()))).intValue();
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e8);
            return 500;
        }
    }

    @Override // V2.b
    protected void c(Context context, Bundle bundle) {
        Intent f8 = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (H.D(f8)) {
            H.v(f8);
        }
    }
}
