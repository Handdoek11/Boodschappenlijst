package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        long j8 = -1;
        int i8 = 0;
        String str = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 2) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 != 3) {
                SafeParcelReader.z(parcel, t7);
            } else {
                j8 = SafeParcelReader.w(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C1105d(str, i8, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1105d[i8];
    }
}
