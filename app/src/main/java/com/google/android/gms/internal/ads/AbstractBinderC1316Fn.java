package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1316Fn extends AbstractBinderC3721pb implements InterfaceC1352Gn {
    public static InterfaceC1352Gn t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof InterfaceC1352Gn ? (InterfaceC1352Gn) queryLocalInterface : new C1280En(iBinder);
    }
}
