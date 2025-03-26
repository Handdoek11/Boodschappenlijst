package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3188kh extends AbstractBinderC3721pb implements InterfaceC3297lh {
    public AbstractBinderC3188kh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 2:
                InterfaceC5852a e8 = e();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, e8);
                return true;
            case 3:
                String i10 = i();
                parcel2.writeNoException();
                parcel2.writeString(i10);
                return true;
            case 4:
                List o8 = o();
                parcel2.writeNoException();
                parcel2.writeList(o8);
                return true;
            case 5:
                String f8 = f();
                parcel2.writeNoException();
                parcel2.writeString(f8);
                return true;
            case 6:
                InterfaceC1938Xg c8 = c();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, c8);
                return true;
            case 7:
                String h8 = h();
                parcel2.writeNoException();
                parcel2.writeString(h8);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                String l8 = l();
                parcel2.writeNoException();
                parcel2.writeString(l8);
                return true;
            case 10:
                String k8 = k();
                parcel2.writeNoException();
                parcel2.writeString(k8);
                return true;
            case 11:
                Bundle a8 = a();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, a8);
                return true;
            case 12:
                p();
                parcel2.writeNoException();
                return true;
            case 13:
                D2.Y0 d8 = d();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, d8);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                T(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                boolean x02 = x0(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(x02 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                A0(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC1693Qg b8 = b();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, b8);
                return true;
            case 18:
                InterfaceC5852a g8 = g();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, g8);
                return true;
            case 19:
                String j8 = j();
                parcel2.writeNoException();
                parcel2.writeString(j8);
                return true;
            default:
                return false;
        }
    }
}
