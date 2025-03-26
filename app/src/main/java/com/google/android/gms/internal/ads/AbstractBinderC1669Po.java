package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Po, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1669Po extends AbstractBinderC3721pb implements InterfaceC1704Qo {
    public static InterfaceC1704Qo t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof InterfaceC1704Qo ? (InterfaceC1704Qo) queryLocalInterface : new C1634Oo(iBinder);
    }
}
