package com.google.android.gms.ads.internal.overlay;

import F2.l;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.C1445Je;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        long j8 = 0;
        boolean z7 = false;
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        l lVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        H2.a aVar = null;
        String str4 = null;
        C2.l lVar2 = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 2:
                    lVar = (l) SafeParcelReader.e(parcel, t7, l.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.u(parcel, t7);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.u(parcel, t7);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.u(parcel, t7);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.u(parcel, t7);
                    break;
                case 7:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 8:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 9:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.u(parcel, t7);
                    break;
                case 11:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 12:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 13:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 14:
                    aVar = (H2.a) SafeParcelReader.e(parcel, t7, H2.a.CREATOR);
                    break;
                case 15:
                case 20:
                case C1445Je.zzm /* 21 */:
                case 22:
                case 23:
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
                case 16:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 17:
                    lVar2 = (C2.l) SafeParcelReader.e(parcel, t7, C2.l.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.u(parcel, t7);
                    break;
                case 19:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                case 24:
                    str6 = SafeParcelReader.f(parcel, t7);
                    break;
                case 25:
                    str7 = SafeParcelReader.f(parcel, t7);
                    break;
                case 26:
                    iBinder7 = SafeParcelReader.u(parcel, t7);
                    break;
                case 27:
                    iBinder8 = SafeParcelReader.u(parcel, t7);
                    break;
                case 28:
                    iBinder9 = SafeParcelReader.u(parcel, t7);
                    break;
                case 29:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 30:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new AdOverlayInfoParcel(lVar, iBinder, iBinder2, iBinder3, iBinder4, str, z7, str2, iBinder5, i8, i9, str3, aVar, str4, lVar2, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z8, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new AdOverlayInfoParcel[i8];
    }
}
