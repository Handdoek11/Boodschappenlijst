package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class A5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        long j8 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 2) {
                j8 = SafeParcelReader.w(parcel, t7);
            } else if (l8 != 3) {
                SafeParcelReader.z(parcel, t7);
            } else {
                i8 = SafeParcelReader.v(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new B5(str, j8, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new B5[i8];
    }
}
