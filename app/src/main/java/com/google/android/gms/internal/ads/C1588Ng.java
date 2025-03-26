package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1588Ng implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        boolean z7 = false;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        D2.Q1 q12 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 2:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 3:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 4:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 5:
                    i10 = SafeParcelReader.v(parcel, t7);
                    break;
                case 6:
                    q12 = (D2.Q1) SafeParcelReader.e(parcel, t7, D2.Q1.CREATOR);
                    break;
                case 7:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 8:
                    i11 = SafeParcelReader.v(parcel, t7);
                    break;
                case 9:
                    i12 = SafeParcelReader.v(parcel, t7);
                    break;
                case 10:
                    z10 = SafeParcelReader.m(parcel, t7);
                    break;
                case 11:
                    i13 = SafeParcelReader.v(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C1553Mg(i8, z7, i9, z8, i10, q12, z9, i11, i12, z10, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1553Mg[i8];
    }
}
