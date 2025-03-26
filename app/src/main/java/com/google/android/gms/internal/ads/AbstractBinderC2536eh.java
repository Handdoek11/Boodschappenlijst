package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.eh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2536eh extends AbstractBinderC3721pb implements InterfaceC2645fh {
    public static InterfaceC2645fh t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof InterfaceC2645fh ? (InterfaceC2645fh) queryLocalInterface : new C2428dh(iBinder);
    }
}
