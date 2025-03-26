package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.pe0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3728pe0 extends AbstractBinderC3721pb implements InterfaceC3837qe0 {
    public static InterfaceC3837qe0 t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof InterfaceC3837qe0 ? (InterfaceC3837qe0) queryLocalInterface : new C3619oe0(iBinder);
    }
}
