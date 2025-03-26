package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.vu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4412vu extends AbstractBinderC3721pb implements InterfaceC4521wu {
    public static InterfaceC4521wu t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof InterfaceC4521wu ? (InterfaceC4521wu) queryLocalInterface : new C4303uu(iBinder);
    }
}
