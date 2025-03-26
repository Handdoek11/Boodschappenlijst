package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3093jo extends AbstractBinderC3721pb implements InterfaceC3202ko {
    public AbstractBinderC3093jo() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC3747po interfaceC3747po = null;
        C3856qo c3856qo = null;
        InterfaceC3747po interfaceC3747po2 = null;
        InterfaceC3747po interfaceC3747po3 = null;
        InterfaceC3747po interfaceC3747po4 = null;
        switch (i8) {
            case 1:
                AbstractC3830qb.c(parcel);
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof InterfaceC3311lo) {
                    }
                }
                AbstractC3830qb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C4618xo c4618xo = (C4618xo) AbstractC3830qb.a(parcel, C4618xo.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC3747po = queryLocalInterface2 instanceof InterfaceC3747po ? (InterfaceC3747po) queryLocalInterface2 : new C3529no(readStrongBinder2);
                }
                AbstractC3830qb.c(parcel);
                h3(c4618xo, interfaceC3747po);
                parcel2.writeNoException();
                return true;
            case 5:
                C4618xo c4618xo2 = (C4618xo) AbstractC3830qb.a(parcel, C4618xo.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC3747po4 = queryLocalInterface3 instanceof InterfaceC3747po ? (InterfaceC3747po) queryLocalInterface3 : new C3529no(readStrongBinder3);
                }
                AbstractC3830qb.c(parcel);
                a4(c4618xo2, interfaceC3747po4);
                parcel2.writeNoException();
                return true;
            case 6:
                C4618xo c4618xo3 = (C4618xo) AbstractC3830qb.a(parcel, C4618xo.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC3747po3 = queryLocalInterface4 instanceof InterfaceC3747po ? (InterfaceC3747po) queryLocalInterface4 : new C3529no(readStrongBinder4);
                }
                AbstractC3830qb.c(parcel);
                o1(c4618xo3, interfaceC3747po3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC3747po2 = queryLocalInterface5 instanceof InterfaceC3747po ? (InterfaceC3747po) queryLocalInterface5 : new C3529no(readStrongBinder5);
                }
                AbstractC3830qb.c(parcel);
                r4(readString, interfaceC3747po2);
                parcel2.writeNoException();
                return true;
            case 8:
                C2768go c2768go = (C2768go) AbstractC3830qb.a(parcel, C2768go.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c3856qo = queryLocalInterface6 instanceof C3856qo ? (C3856qo) queryLocalInterface6 : new C3856qo(readStrongBinder6);
                }
                AbstractC3830qb.c(parcel);
                N2(c2768go, c3856qo);
                parcel2.writeNoException();
                return true;
        }
    }
}
