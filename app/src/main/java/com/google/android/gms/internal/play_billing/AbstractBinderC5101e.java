package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.play_billing.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5101e extends AbstractBinderC5119h implements InterfaceC5107f {
    public static InterfaceC5107f D0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof InterfaceC5107f ? (InterfaceC5107f) queryLocalInterface : new C5095d(iBinder);
    }
}
