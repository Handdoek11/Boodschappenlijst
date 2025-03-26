package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1170Bl extends AbstractC3612ob implements InterfaceC1242Dl {
    C1170Bl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1242Dl
    public final InterfaceC1171Bm C(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        Parcel D02 = D0(3, w02);
        InterfaceC1171Bm t7 = AbstractBinderC1135Am.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1242Dl
    public final boolean Z(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        Parcel D02 = D0(4, w02);
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1242Dl
    public final boolean n(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        Parcel D02 = D0(2, w02);
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1242Dl
    public final InterfaceC1350Gl v(String str) {
        InterfaceC1350Gl c1278El;
        Parcel w02 = w0();
        w02.writeString(str);
        Parcel D02 = D0(1, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c1278El = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c1278El = queryLocalInterface instanceof InterfaceC1350Gl ? (InterfaceC1350Gl) queryLocalInterface : new C1278El(readStrongBinder);
        }
        D02.recycle();
        return c1278El;
    }
}
