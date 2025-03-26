package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.oq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3642oq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        D2.c2 c2Var = null;
        D2.X1 x12 = null;
        String str3 = null;
        int i8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 2:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    c2Var = (D2.c2) SafeParcelReader.e(parcel, t7, D2.c2.CREATOR);
                    break;
                case 4:
                    x12 = (D2.X1) SafeParcelReader.e(parcel, t7, D2.X1.CREATOR);
                    break;
                case 5:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C3533nq(str, str2, c2Var, x12, i8, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3533nq[i8];
    }
}
