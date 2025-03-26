package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3846qj extends AbstractBinderC3721pb implements InterfaceC3954rj {
    public static InterfaceC3954rj t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return queryLocalInterface instanceof InterfaceC3954rj ? (InterfaceC3954rj) queryLocalInterface : new C3737pj(iBinder);
    }
}
