package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4507wn extends AbstractBinderC3721pb implements InterfaceC4616xn {
    public static InterfaceC4616xn t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof InterfaceC4616xn ? (InterfaceC4616xn) queryLocalInterface : new C4398vn(iBinder);
    }
}
