package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.In, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1424In extends AbstractBinderC3721pb implements InterfaceC1459Jn {
    public static InterfaceC1459Jn t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof InterfaceC1459Jn ? (InterfaceC1459Jn) queryLocalInterface : new C1388Hn(iBinder);
    }
}
