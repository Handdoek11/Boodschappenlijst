package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 2:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 3:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 4:
                    iBinder = SafeParcelReader.u(parcel, t7);
                    break;
                case 5:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 6:
                    z10 = SafeParcelReader.m(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new A(str, z7, z8, iBinder, z9, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new A[i8];
    }
}
