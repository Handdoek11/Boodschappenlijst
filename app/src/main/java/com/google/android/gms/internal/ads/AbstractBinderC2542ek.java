package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2542ek extends AbstractBinderC3721pb implements InterfaceC2651fk {
    public static InterfaceC2651fk t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof InterfaceC2651fk ? (InterfaceC2651fk) queryLocalInterface : new C2434dk(iBinder);
    }
}
