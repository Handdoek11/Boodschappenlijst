package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.ad0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2095ad0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        int i8 = 0;
        String str2 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 2) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 != 3) {
                SafeParcelReader.z(parcel, t7);
            } else {
                str2 = SafeParcelReader.f(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C2001Zc0(i8, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2001Zc0[i8];
    }
}
