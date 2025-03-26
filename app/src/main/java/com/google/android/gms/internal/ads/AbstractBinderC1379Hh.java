package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Hh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1379Hh extends AbstractBinderC3721pb implements InterfaceC1415Ih {
    public static InterfaceC1415Ih t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof InterfaceC1415Ih ? (InterfaceC1415Ih) queryLocalInterface : new C1343Gh(iBinder);
    }
}
