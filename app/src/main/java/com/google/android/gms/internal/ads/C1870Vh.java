package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.RemoteCreator;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.ads.Vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1870Vh extends RemoteCreator {
    public C1870Vh() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof InterfaceC2645fh ? (InterfaceC2645fh) queryLocalInterface : new C2428dh(iBinder);
    }

    public final InterfaceC2319ch c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder D32 = ((InterfaceC2645fh) b(context)).D3(BinderC5853b.p2(context), BinderC5853b.p2(frameLayout), BinderC5853b.p2(frameLayout2), 244410000);
            if (D32 == null) {
                return null;
            }
            IInterface queryLocalInterface = D32.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof InterfaceC2319ch ? (InterfaceC2319ch) queryLocalInterface : new C2008Zg(D32);
        } catch (RemoteException e8) {
            e = e8;
            H2.p.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e9) {
            e = e9;
            H2.p.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
