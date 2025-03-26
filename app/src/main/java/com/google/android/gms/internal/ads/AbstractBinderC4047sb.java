package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4047sb extends AbstractBinderC3721pb implements InterfaceC4156tb {
    public static InterfaceC4156tb t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof InterfaceC4156tb ? (InterfaceC4156tb) queryLocalInterface : new C3938rb(iBinder);
    }
}
