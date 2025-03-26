package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4879c0 extends AbstractBinderC4870b0 implements InterfaceC4888d0 {
    public static InterfaceC4888d0 D0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof InterfaceC4888d0 ? (InterfaceC4888d0) queryLocalInterface : new C4897e0(iBinder);
    }
}
