package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class H70 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        String str = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 2:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 3:
                    i10 = SafeParcelReader.v(parcel, t7);
                    break;
                case 4:
                    i11 = SafeParcelReader.v(parcel, t7);
                    break;
                case 5:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    i12 = SafeParcelReader.v(parcel, t7);
                    break;
                case 7:
                    i13 = SafeParcelReader.v(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new G70(i8, i9, i10, i11, str, i12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new G70[i8];
    }
}
