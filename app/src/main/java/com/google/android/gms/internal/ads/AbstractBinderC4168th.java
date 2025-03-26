package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.th, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4168th extends AbstractBinderC3721pb implements InterfaceC4277uh {
    public static InterfaceC4277uh t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return queryLocalInterface instanceof InterfaceC4277uh ? (InterfaceC4277uh) queryLocalInterface : new C4059sh(iBinder);
    }
}
