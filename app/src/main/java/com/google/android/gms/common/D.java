package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        boolean z7 = false;
        int i8 = 0;
        String str = null;
        int i9 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                z7 = SafeParcelReader.m(parcel, t7);
            } else if (l8 == 2) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 3) {
                i9 = SafeParcelReader.v(parcel, t7);
            } else if (l8 != 4) {
                SafeParcelReader.z(parcel, t7);
            } else {
                i8 = SafeParcelReader.v(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C(z7, str, i9, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C[i8];
    }
}
