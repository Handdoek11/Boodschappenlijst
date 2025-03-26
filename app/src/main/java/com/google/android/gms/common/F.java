package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        boolean z7 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z8 = false;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 2) {
                iBinder = SafeParcelReader.u(parcel, t7);
            } else if (l8 == 3) {
                z7 = SafeParcelReader.m(parcel, t7);
            } else if (l8 != 4) {
                SafeParcelReader.z(parcel, t7);
            } else {
                z8 = SafeParcelReader.m(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new E(str, iBinder, z7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new E[i8];
    }
}
