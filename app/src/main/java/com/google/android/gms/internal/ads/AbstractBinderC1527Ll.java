package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1527Ll extends AbstractBinderC3721pb implements InterfaceC1561Ml {
    public static InterfaceC1561Ml t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof InterfaceC1561Ml ? (InterfaceC1561Ml) queryLocalInterface : new C1492Kl(iBinder);
    }
}
