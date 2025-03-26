package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3636on extends AbstractBinderC3721pb implements InterfaceC3854qn {
    public static InterfaceC3854qn t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return queryLocalInterface instanceof InterfaceC3854qn ? (InterfaceC3854qn) queryLocalInterface : new C3527nn(iBinder);
    }
}
