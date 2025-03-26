package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1590Nh extends AbstractBinderC3721pb implements InterfaceC1625Oh {
    public static InterfaceC1625Oh t7(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof InterfaceC1625Oh ? (InterfaceC1625Oh) queryLocalInterface : new C1555Mh(iBinder);
    }
}
