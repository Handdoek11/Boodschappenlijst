package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.lq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3315lq extends AbstractBinderC3721pb implements InterfaceC3424mq {
    public static InterfaceC3424mq t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return queryLocalInterface instanceof InterfaceC3424mq ? (InterfaceC3424mq) queryLocalInterface : new C3206kq(iBinder);
    }
}
