package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.internal.ads.Wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1905Wh extends RemoteCreator {
    public C1905Wh() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof InterfaceC3079jh ? (InterfaceC3079jh) queryLocalInterface : new C2971ih(iBinder);
    }
}
