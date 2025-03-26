package com.google.android.gms.wearable;

import B3.I;
import B3.K;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        K k8 = null;
        I i12 = null;
        boolean z11 = true;
        boolean z12 = true;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 2:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 4:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 5:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 6:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 7:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 8:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 9:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 10:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 11:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                case 12:
                    i10 = SafeParcelReader.v(parcel, t7);
                    break;
                case 13:
                    arrayList = SafeParcelReader.h(parcel, t7);
                    break;
                case 14:
                    z10 = SafeParcelReader.m(parcel, t7);
                    break;
                case 15:
                    z11 = SafeParcelReader.m(parcel, t7);
                    break;
                case 16:
                    k8 = (K) SafeParcelReader.e(parcel, t7, K.CREATOR);
                    break;
                case 17:
                    z12 = SafeParcelReader.m(parcel, t7);
                    break;
                case 18:
                    i12 = (I) SafeParcelReader.e(parcel, t7, I.CREATOR);
                    break;
                case 19:
                    i11 = SafeParcelReader.v(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new ConnectionConfiguration(str, str2, i8, i9, z7, z8, str3, z9, str4, str5, i10, arrayList, z10, z11, k8, z12, i12, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new ConnectionConfiguration[i8];
    }
}
