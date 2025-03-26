package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4495wh extends AbstractBinderC3721pb implements InterfaceC4604xh {
    public static InterfaceC4604xh t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return queryLocalInterface instanceof InterfaceC4604xh ? (InterfaceC4604xh) queryLocalInterface : new C4386vh(iBinder);
    }
}
