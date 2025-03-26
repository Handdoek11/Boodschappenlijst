package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class b6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        String str = null;
        Long l8 = null;
        Float f8 = null;
        String str2 = null;
        String str3 = null;
        Double d8 = null;
        long j8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 2:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 4:
                    l8 = SafeParcelReader.x(parcel, t7);
                    break;
                case 5:
                    f8 = SafeParcelReader.s(parcel, t7);
                    break;
                case 6:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 8:
                    d8 = SafeParcelReader.q(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new Y5(i8, str, j8, l8, f8, str2, str3, d8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Y5[i8];
    }
}
