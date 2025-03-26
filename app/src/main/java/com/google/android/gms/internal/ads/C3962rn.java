package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.ads.rn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3962rn extends RemoteCreator {
    public C3962rn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof InterfaceC4616xn ? (InterfaceC4616xn) queryLocalInterface : new C4398vn(iBinder);
    }

    public final InterfaceC4289un c(Activity activity) {
        try {
            IBinder zze = ((InterfaceC4616xn) b(activity)).zze(BinderC5853b.p2(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof InterfaceC4289un ? (InterfaceC4289un) queryLocalInterface : new C4071sn(zze);
        } catch (RemoteException e8) {
            H2.p.h("Could not create remote AdOverlay.", e8);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e9) {
            H2.p.h("Could not create remote AdOverlay.", e9);
            return null;
        }
    }
}
