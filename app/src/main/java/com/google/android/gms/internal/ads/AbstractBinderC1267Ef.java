package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1267Ef extends AbstractBinderC3721pb implements InterfaceC1303Ff {
    public static InterfaceC1303Ff t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return queryLocalInterface instanceof InterfaceC1303Ff ? (InterfaceC1303Ff) queryLocalInterface : new C1231Df(iBinder);
    }
}
