package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Xj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1944Xj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                i10 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 2) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 3) {
                i9 = SafeParcelReader.v(parcel, t7);
            } else if (l8 != 1000) {
                SafeParcelReader.z(parcel, t7);
            } else {
                i8 = SafeParcelReader.v(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C1874Vj(i8, i10, str, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1874Vj[i8];
    }
}
