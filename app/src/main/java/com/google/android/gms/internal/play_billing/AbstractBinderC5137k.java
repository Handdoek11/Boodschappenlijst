package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.play_billing.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5137k extends AbstractBinderC5119h implements InterfaceC5143l {
    public static InterfaceC5143l D0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return queryLocalInterface instanceof InterfaceC5143l ? (InterfaceC5143l) queryLocalInterface : new C5131j(iBinder);
    }
}
