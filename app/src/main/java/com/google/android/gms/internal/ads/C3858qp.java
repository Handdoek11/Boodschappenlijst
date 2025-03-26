package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.ads.qp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3858qp {
    public static final InterfaceC2443dp a(Context context, String str, InterfaceC1242Dl interfaceC1242Dl) {
        try {
            IBinder q22 = ((C2879hp) H2.s.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new H2.r() { // from class: com.google.android.gms.internal.ads.pp
                @Override // H2.r
                public final Object a(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof C2879hp ? (C2879hp) queryLocalInterface : new C2879hp(iBinder);
                }
            })).q2(BinderC5853b.p2(context), str, interfaceC1242Dl, 244410000);
            if (q22 == null) {
                return null;
            }
            IInterface queryLocalInterface = q22.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof InterfaceC2443dp ? (InterfaceC2443dp) queryLocalInterface : new C2227bp(q22);
        } catch (RemoteException e8) {
            e = e8;
            H2.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (zzr e9) {
            e = e9;
            H2.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
