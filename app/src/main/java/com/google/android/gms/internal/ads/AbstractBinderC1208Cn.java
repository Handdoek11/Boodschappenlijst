package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1208Cn extends AbstractBinderC3721pb implements InterfaceC1244Dn {
    public static InterfaceC1244Dn t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof InterfaceC1244Dn ? (InterfaceC1244Dn) queryLocalInterface : new C1172Bn(iBinder);
    }
}
