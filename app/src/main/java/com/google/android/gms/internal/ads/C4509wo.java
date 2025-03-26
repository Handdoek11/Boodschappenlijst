package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4509wo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t7) != 2) {
                SafeParcelReader.z(parcel, t7);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, t7, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C4400vo(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C4400vo[i8];
    }
}
